import java.util.Scanner;

/**
 * exercise10
 */
public class Ex12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        //Get Player's name
        System.out.println("Enter name of Player1 :");
        String Player1 = scanner.nextLine();
        System.out.println("Enter name of Player2 :");
        String Player2 = scanner.nextLine();

        char[][] Board = new char[3][3];

        /* display board game
            _ _ _
            _ _ _
            _ _ _
         */

        //fill the board with dashes
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                Board[i][j] = '_';
            }
        }
     
        //Keep track of whose it is
        boolean isPlayer1 = true;

        //Keep track if the game is ended
        boolean isGameEnded = false;

        while(!isGameEnded){
            //Drae the board
            printBorad(Board);

            //Keep track of what symbol we are using to play
            char symbol = ' ';
            if(isPlayer1){
                symbol = 'X';
            }else{
                symbol = 'O';
            }

            //Print out the player's turn
            if(isPlayer1){
                System.out.println(Player1 + "'s turn(X): ");
            }else{
                System.out.println(Player2 + "'s turn(O): ");
            }

            //row and col variable
            int row = 0;
            int col = 0;

            while(true){
                //Get row and col from user
                System.out.println("enter your move (row[0-2] column[0-2]): ");
                row = scanner.nextInt();
                System.out.println("enter your move (row[0-2] column[0-2]): ");
                col = scanner.nextInt();

                //Check if row and col are valid
                if(row < 0 || col < 0 || row > 2 || col > 2){
                    // row and col are out bound
                    System.out.println("Your row and col are out of bound.");
                }else if(Board[row][col] != '_'){
                    // Board position has an x or o
                    System.out.println("Someone has already move there.");
                }else{
                    //row and col are valid
                    break;
                }
            }

            //Setting the position on the board to the player's symbol
            Board[row][col] = symbol;

            //Check if a player has won
            if(Winner(Board) == 'X'){
                //Player 1 win
                System.out.println(Player1 + " Is won! ;) ");
                isGameEnded = true;
            }else if(Winner(Board) == 'O'){
                //Player 2 win
                System.out.println(Player2 + " Is won! :)");
                isGameEnded = true;
            }else{
                //Nobody won
                if(no_winer(Board)){
                    //nowiner
                    System.out.println("Wow! It is a nowiner.");
                    isGameEnded = true;
                }else{
                    //Contiue the game and toggles the turn
                    isPlayer1 = !isPlayer1;
                }
            }
        }

        //print out final state of the board
        printBorad(Board);

        scanner.close();
    }

    //printing out the board
    public static void printBorad(char[][] Board){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(Board[i][j]);
            }
            System.out.println();
        }
    }

    public static char Winner(char[][] Board){
        //row
        for(int i=0; i<3; i++){
            if(Board[i][0]==Board[i][1] && Board[i][1]==Board[i][2] && Board[i][0]!='_'){
                return Board[i][0];
            }
        }

        //col
        for(int j=0; j<3; j++){
            if(Board[0][j]==Board[1][j] && Board[1][j]==Board[2][j] && Board[0][j]!='_'){
                return Board[0][j];
            }
        }

        //Diagonals
        if(Board[0][0]==Board[1][1] && Board[1][1]==Board[2][2] && Board[0][0]!='_'){
            return Board[0][0];
        }
        if(Board[2][0]==Board[1][1] && Board[1][1]==Board[0][2] && Board[2][0]!='_'){
            return Board[2][0];
        }

        //Nobody win
        return '_';
    }

    public static boolean no_winer(char[][] Board){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(Board[i][j] == '_'){
                    return false;
                }
            }
        }
        return true;
    }
}