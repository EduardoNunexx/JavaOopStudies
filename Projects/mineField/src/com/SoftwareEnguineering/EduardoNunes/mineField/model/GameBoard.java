package model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import exceptions.ExplosionException;

public class GameBoard {
    private int lines;
    private int columns;
    private int amountOfMines;

    private final List<Fields> fields = new ArrayList<>();

    public GameBoard(int lines, int columns, int amountOfMines) {
        this.lines = lines;
        this.columns = columns;
        this.amountOfMines = amountOfMines;
        createFields();
        associateNeighbors();
        drawMines();
    }

    private void createFields() {
        for(int l=0; l < lines;l++){
            for(int c=0; c<columns;c++){
                fields.add(new Fields(l, c));
            }
        }
    }
    private void associateNeighbors() {
        for(Fields c1 :fields){
            for(Fields c2:fields){
                c1.addNeighbor(c2);
            }
        }
    }
    private void drawMines(){
        long minesToExplode =0;
        Predicate<Fields> mined = f->f.isHaveBomb();
        do{
            int random= (int) (Math.random()* fields.size());
            fields.get(random).miningField();
            minesToExplode = fields.stream().filter(mined).count();
        }while(minesToExplode<amountOfMines);
    }

    public void open(int line, int column){
        try {
            fields.parallelStream().filter(f->f.getLine()==line && f.getColumn()==column).findFirst().ifPresent(f->f.openUp());

        } catch (ExplosionException e) {
            fields.forEach(f->f.setOpen(true));
            
            throw e;
        }
    }
    public void mark(int line, int column){
        fields.parallelStream().filter(f->f.getLine()==line && f.getColumn()==column).findFirst().ifPresent(f->f.changeMark());
    }
    public boolean goalreached(){
        return fields.stream().allMatch(f->f.goalAchieved());
    }
    public void restart(){
        fields.stream().forEach(f->f.restart());
        drawMines();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i =0;
        sb.append("yx");
        for (int j = 0; j < columns; j++) {
            sb.append(" ");
            sb.append(j);
            sb.append(" ");
        }
        sb.append("\n");
        for(int l=0;l<lines;l++){
            sb.append(l);
            sb.append(" "); 
            for(int c=0; c<columns;c++){
                sb.append(" ");
                sb.append(fields.get(i));
                sb.append(" ");
                i++;
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
 