package com.SoftwareEnguineering.EduardoNunes.mineField.model;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exceptions.ExplosionException;
import model.Fields;

public class FieldTests {
    private Fields field;

    @BeforeEach
    void startField(){
    field = new Fields(3,3);
    }

    @Test
    void testRealLeftNeighbor(){
        Fields leftNeighbor = new Fields(3, 2);
        boolean leftResult = field.addNeighbor(leftNeighbor);
        assertTrue(leftResult);
    }
    @Test
    void testRealRightNeighbor(){
        Fields rightNeighbor = new Fields(3, 4);
        Boolean rightResult = field.addNeighbor(rightNeighbor);
        assertTrue(rightResult);
    }
    @Test
    void testRealOverNeighbor(){
        Fields overNeighbor = new Fields(2, 3);
        Boolean overResult = field.addNeighbor(overNeighbor);
        assertTrue(overResult);
    }
    @Test
    void testRealBelowNeighbor(){
        Fields belowNeighbor = new Fields(4, 3);
        Boolean belowResult = field.addNeighbor(belowNeighbor);
        assertTrue(belowResult);
    }
    @Test
    void testRealDiagonalNeighbor(){
        Fields diagonalNeighbor = new Fields(2, 2);
        Boolean diagonalResult = field.addNeighbor(diagonalNeighbor);
        assertTrue(diagonalResult);
    }
    @Test
    void testRealNotNeighbor(){
        Fields notNeighbor = new Fields(1, 1);
        Boolean notResult = field.addNeighbor(notNeighbor);
        assertFalse(notResult);
    }
    @Test
    void defaultValueMarked(){
        assertFalse(field.isMarked());
    }
    @Test
    void testChangeMark(){
        field.changeMark();
        assertTrue(field.isMarked());
    }
    @Test
    void twoTimesChangeMark(){
        field.changeMark();
        field.changeMark();
        assertFalse(field.isMarked());
    }
    @Test
    void openNotMinedNotMarked(){
        assertTrue(field.openUp());
    }
    @Test
    void openNotMinedMarked(){
        field.changeMark();
        assertFalse(field.openUp());
    }
    @Test
    void openMinedAndMarked(){
        field.changeMark();
        field.miningField();
        assertFalse(field.openUp());
    }
    @Test
    void openMinedNotMarked(){
        field.miningField();
        assertThrows(ExplosionException.class,()->{
            field.openUp();
        });
    }
    @Test 
    void openWithNeighbors(){
        Fields f1 = new Fields(1, 1);
        Fields f2 = new Fields(2,2);
        f1.addNeighbor(f2);
        f1.openUp();
        assertTrue(f2.isOpen());
    }
    @Test 
    void openWithNeighborshavingBomb(){
        Fields f1 = new Fields(1, 1);
        Fields f2 = new Fields(2,2);
        f2.miningField();
        f1.addNeighbor(f2);
        f1.openUp();
        assertFalse(f2.isOpen());
    }
}
