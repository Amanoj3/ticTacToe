class ticTacToe {
    private char[] arr;
    private int numSquares;
    private int moveCounter;
    private boolean gameOver;



    boolean evenMove() {
        return this.moveCounter % 2 == 0;
    } // determine whose turn it is based on the oddness/even-ness of the moveCounter
    boolean getGameOver() {
        return this.gameOver == true;
    }


    void showBoard() {
        if (moveCounter == 9) {
            gameOver = true;
        }
        System.out.println("-----");
        System.out.println(arr[0] + "|" + arr[1] + "|"+ arr[2]);
        System.out.println(arr[3] + "|" + arr[4] + "|"+ arr[5]);
        System.out.println(arr[6] + "|" + arr[7] + "|"+ arr[8]);

    }

    void makeMove(int userInput) {
        char currentSymbol = ' ';
        if (!(userInput >= 0 && userInput <= 8)) {
            System.out.println("Error. Input must be within the 0-8 range. Try again");
            return;
        }
        if (evenMove()) {
            currentSymbol = 'x';
        }
        if (!evenMove()) {
            currentSymbol = 'o';
        }
        arr[userInput] = currentSymbol;
        this.showBoard();
        this.moveCounter++;
    }

    ticTacToe() {
        gameOver = false;
        numSquares = 9;
        moveCounter = 0;
        arr = new char[numSquares];
        for (var i = 0; i <numSquares; i++) {
            arr[i] = '.';
        }
    }
}