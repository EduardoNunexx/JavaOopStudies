package view;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import exceptions.ExitException;
import exceptions.ExplosionException;
import model.GameBoard;

public class GameBoardConsole {

    GameBoard gameBoard;
    private Scanner scaner = new Scanner(System.in);


    public GameBoardConsole(GameBoard gameBoard){
        this.gameBoard = gameBoard;
        startGame();
    }
    private void startGame() {
        try {
            boolean keepGame =true;
            while (keepGame) {
                GameLoop();
                System.out.println("Play again ? (Y/n)");
                String response = scaner.nextLine();
                if ("n".equalsIgnoreCase(response)) {
                    keepGame=false;
                }else{
                    gameBoard.restart();
                }
            }
        } catch (ExitException exit) {
            System.out.println("Bye !!");
        }finally{
            scaner.close();
        }
    }
    private void GameLoop() {
        try {
            while (!gameBoard.goalreached()) {
                System.out.println(gameBoard);
                String input = catchValue("Type (Y,X)");
                Iterator<Integer> xy =Arrays.stream(input.split(",")).map(x->Integer.parseInt(x.trim())).iterator();
                input= catchValue("1- To open / 2- To (Un)Mark");
                if("1".equals(input)){
                    gameBoard.open(xy.next(),xy.next());
                }else if("2".equals(input)){
                    gameBoard.mark(xy.next(), xy.next());
                }
            }
            System.out.println("You win");
            System.out.println("You win");
        } catch (ExplosionException e) {
            System.out.println(gameBoard);
            System.out.println("You Lose ");
        }
    }
    private String catchValue(String text){
        System.out.print(text);
        String typed = scaner.nextLine();
        if("exit".equalsIgnoreCase(typed)){
            throw new ExitException();
        }
        return typed;   
    }
    
}
