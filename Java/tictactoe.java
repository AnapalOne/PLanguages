import java.util.Scanner;

public class tictactoe 
{
    public static void main (String[] args)
    {
        Screen screen = new Screen();
        Player players = new Player();
        GameStatus gameStatus = new GameStatus();
        
        screen.initBoard();

        screen.drawBoard(true, 1);
        players.askInput(players.currentPlayer);

        gameStatus.gameCheckWin(screen.drawBoard.session);
    }
}

class Player
{
    public String player1 = "x";
    public String player2 = "o";
    public String currentPlayer = player1;

    public void switchPlayer ()
    {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    /*
       In askInput's arguments, 1 = Player 1
                                2 = Player 2
     */
    public int askInput (String player)
    {
        player = (player == player1) ? "1" : "2";
        System.out.printf("Input your choice, player %d [1-9]: ", player);

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switchPlayer();
        return choice;
    }
}

class GameStatus
{
    public void gameCheckWin (String[] session)
    {

        // Player 1 winning conditions
        if (session[0] == "x" && session[1] == "x" && session[2] == "x") {
            System.out.println("Player 1 wins!");
            return;
        }
        else if (session[0] == "x" && session[4] == "x" && session[8] == "x") {
            System.out.println("Player 1 wins!");
            return;
        } 
        else if (session[2] == "x" && session[4] == "x" && session[6] == "x") {
            System.out.println("Player 1 wins!");
            return;
        } 
        else if (session[3] == "x" && session[4] == "x" && session[5] == "x") {
            System.out.println("Player 1 wins!");
            return;
        } 
        else if (session[6] == "x" && session[7] == "x" && session[8] == "x") {
            System.out.println("Player 1 wins!");
            return;
        } 
        else if (session[0] == "x" && session[3] == "x" && session[6] == "x") {
            System.out.println("Player 1 wins!");
            return;
        } 
        else if (session[2] == "x" && session[5] == "x" && session[8] == "x") {
            System.out.println("Player 1 wins!");
            return;
        } 

        // Player 2 winning conditions
        else if (session[0] == "o" && session[1] == "o" && session[2] == "o") {
            System.out.println("Player 2 wins!");
            return;
        }
        else if (session[0] == "o" && session[4] == "o" && session[8] == "o") {
            System.out.println("Player 2 wins!");
            return;
        } 
        else if (session[2] == "o" && session[4] == "o" && session[6] == "o") {
            System.out.println("Player 2 wins!");
            return;
        } 
        else if (session[3] == "o" && session[4] == "o" && session[5] == "o") {
            System.out.println("Player 2 wins!");
            return;
        } 
        else if (session[6] == "o" && session[7] == "o" && session[8] == "o") {
            System.out.println("Player 2 wins!");
            return;
        } 
        else if (session[0] == "o" && session[3] == "o" && session[6] == "o") {
            System.out.println("Player 2 wins!");
            return;
        } 
        else if (session[2] == "o" && session[5] == "o" && session[8] == "o") {
            System.out.println("Player 2 wins!");
            return;
        } 
    
        else {
            System.out.println("error: Wrong input.");
            return;
        }
    }
}

class Screen
{
    public void initBoard ()
    {
        System.out.printf("|-----|-----|-----|\n");
        System.out.printf("|     |     |     |\n");
        System.out.printf("|     |     |     |\n");
        System.out.printf("|     |     |     |\n");
        System.out.printf("|-----|-----|-----|\n");
        System.out.printf("|     |     |     |\n");
        System.out.printf("|     |     |     |\n");
        System.out.printf("|     |     |     |\n");
        System.out.printf("|-----|-----|-----|\n");
        System.out.printf("|     |     |     |\n");
        System.out.printf("|     |     |     |\n");
        System.out.printf("|     |     |     |\n");
        System.out.printf("|-----|-----|-----|\n");
    }
    /*
        Draws the TicTacToe screen, using printf.
        This will also print out the current status of the game.

        |-----|-----|-----|
        |     |     |     |
        |  1  |  2  |  3  |
        |     |     |     |
        |-----|-----|-----|
        |     |     |     |
        |  4  |  5  |  6  |
        |     |     |     |
        |-----|-----|-----|
        |     |     |     |
        |  7  |  8  |  9  |
        |     |     |     |
        |-----|-----|-----|
    
        In numbers 1-9, the player can choose which of these spots 
        that they can place their O or X at, and with the use of
        printf, print their input into one of these numbers.
    */
    public void drawBoard (boolean player, int choice)
    {
        String[] session = { " ", " ", " "
                           , " ", " ", " "
                           , " ", " ", " "};

        System.out.printf("|-----|-----|-----|\n");
        System.out.printf("|     |     |     |\n");
        System.out.printf("|  %s  |  %s  |  %s  |\n", session[0], session[1], session[2]);
        System.out.printf("|     |     |     |\n");
        System.out.printf("|-----|-----|-----|\n");
        System.out.printf("|     |     |     |\n");
        System.out.printf("|  %s  |  %s  |  %s  |\n", session[3], session[4], session[5]);
        System.out.printf("|     |     |     |\n");
        System.out.printf("|-----|-----|-----|\n");
        System.out.printf("|     |     |     |\n");
        System.out.printf("|  %s  |  %s  |  %s  |\n", session[6], session[7], session[8]);
        System.out.printf("|     |     |     |\n");
        System.out.printf("|-----|-----|-----|\n");
    }
}
