import model.GameBoard;
import view.GameBoardConsole;

public class App {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard(6, 6,3);
        GameBoardConsole gameBoardConsole = new GameBoardConsole(gameBoard);
    }
}