package model;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import exceptions.ExplosionException;

public class Fields {
    private final int line;
    private final int column;

    private boolean open = false;
    private boolean haveBomb= false;
    private boolean marked= false;
    private List<Fields> neighbors= new ArrayList<>();
    
    public Fields(int line, int column) {
        this.line = line;
        this.column = column;
    }
    public boolean addNeighbor(Fields neighbor){
        boolean diferentLine = line!=neighbor.line;
        boolean diferentColumn = column!=neighbor.column;
        boolean diagonal = diferentLine && diferentColumn;
        
        int deltaLine= Math.abs(line-neighbor.line);
        int deltaColumn = Math.abs(column-neighbor.column);
        int deltaAll = deltaColumn +deltaLine;

        if(deltaAll==1 && !diagonal){
            neighbors.add(neighbor);
            return true;
        }else if(deltaAll==2 && diagonal){
            neighbors.add(neighbor);
            return true;
        }
        else{
            return false;
        }
    }
    public void changeMark(){
        if(!open){
            if(marked){
                this.marked=!marked;
            }else{
                this.marked=true;
            }
        }
    }   
    public boolean openUp(){
        if(!open && !marked){
            open=true;
            if(haveBomb){
                throw new ExplosionException();
            }
            if(safeNeighbor()){
                neighbors.forEach(v -> v.openUp());
            }
            return true;
        }
        return false;
    }
    public boolean safeNeighbor(){
        Predicate<Fields> isSafe = f->f.haveBomb;
        return neighbors.stream().noneMatch(isSafe);
    }
    boolean goalAchieved(){
        boolean revealed =!haveBomb && open;
        boolean protectd = marked && haveBomb;
        return revealed|| protectd;
    }
    long minesInNeighborhood(){
        return neighbors.stream().filter(n->n.haveBomb).count();
    }
    void restart(){
        open=false;
        haveBomb=false;
        marked=false;
    }
    
    public String toString() {
        if(marked){
            return "x";
        }else if(open && haveBomb){
            return "*";
        }
        else if(open && minesInNeighborhood()>0){
            return Long.toString(minesInNeighborhood());
        }else if (open && !haveBomb){
            return " ";
        }else{
        return "?";
        }
    }
    public void setOpen(boolean open) {
        this.open = open;
    }
    public int getLine() {
        return line;
    }
    public int getColumn() {
        return column;
    }
    public boolean isMarked() {
        return marked;
    }
    public boolean isOpen() {
        return open;
    }
    public boolean isHaveBomb() {
        return haveBomb;
    }
    public void miningField(){
        haveBomb=true;
    }

}
