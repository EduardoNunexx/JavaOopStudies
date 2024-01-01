package model;

import java.util.ArrayList;
import java.util.List;

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
}
