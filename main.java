import java.util.Scanner;

class main {
    public static void main(String args[]) {
        ticTacToe game = new ticTacToe();
        game.showBoard();
        while (true) {
            System.out.println("Enter a move: ");
            int input;
            Scanner scanIn = new Scanner(System.in);
            input = scanIn.nextInt();
            game.makeMove(input);
            game.showBoard();
            if (game.getGameOver()) {
                System.out.println("No slots remaining. Game over!");
                break;
            }
        }
    }
}