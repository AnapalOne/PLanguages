import java.util.Scanner;

public class tictactoe 
{
    public static void main (String[] args)
    {
        Screen screen = new Screen();
        Player players = new Player();
        Game game = new Game();
        
        screen.initBoard();

        while (game.gameCheckWin(game.session) == 0) {
            int choice = players.askInput(players.currentPlayer);

            if (game.insertChoice(game.session, choice, players.currentPlayer) == 1) {
                System.out.println("Invalid input! Restart the game to try again.");
                break;
            }

            screen.drawBoard(game.session);
        }

        if (game.gameCheckWin(game.session) == 1)
            System.out.println("Player 1 wins!");
        
        if (game.gameCheckWin(game.session) == 2)
            System.out.println("Player 2 wins!");

        if (game.gameCheckWin(game.session) == 3)
            System.out.println("Tie!");

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
        player = (player == player1) ? "1 (o)" : "2 (x)";
        System.out.printf("Input your choice, player %s [1-9]: ", player);

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switchPlayer();
        return choice;
    }
}

class Game
{
    public String[] session = { "1", "2", "3"
                              , "4", "5", "6" 
                              , "7", "8", "9" };
    public int moves = 0;

    public int insertChoice (String[] cell, int choice, String player)
    {
        // check if a move has already been done in a cell
        if (cell[choice - 1] == "x" || cell[choice - 1] == "o") {
            return 1;
        }
        else {
            cell[choice - 1] = player;
            moves++;
            return 0;
        }
    }

    public int gameCheckWin (String[] session)
    {

        // Player 1 winning conditions
        if (session[0] == "o" && session[1] == "o" && session[2] == "o")
            return 1;
        else if (session[0] == "o" && session[4] == "o" && session[8] == "o")
            return 1;
        else if (session[2] == "o" && session[4] == "o" && session[6] == "o")
            return 1;
        else if (session[3] == "o" && session[4] == "o" && session[5] == "o")
            return 1;
        else if (session[6] == "o" && session[7] == "o" && session[8] == "o")
            return 1;
        else if (session[0] == "o" && session[3] == "o" && session[6] == "o")
            return 1;
        else if (session[2] == "o" && session[5] == "o" && session[8] == "o")
            return 1;

        // Player 2 winning conditions
        else if (session[0] == "x" && session[1] == "x" && session[2] == "x")
            return 2;
        else if (session[0] == "x" && session[4] == "x" && session[8] == "x")
            return 2;
        else if (session[2] == "x" && session[4] == "x" && session[6] == "x") 
            return 2;
        else if (session[3] == "x" && session[4] == "x" && session[5] == "x") 
            return 2;
        else if (session[6] == "x" && session[7] == "x" && session[8] == "x") 
            return 2;
        else if (session[0] == "x" && session[3] == "x" && session[6] == "x") 
            return 2;
        else if (session[2] == "x" && session[5] == "x" && session[8] == "x") 
            return 2; 

        // tie condition
        else if (moves >= 9)
            return 3;

        else 
            return 0;
        
    }
}

class Screen
{
    public void initBoard ()
    {
        System.out.printf("|-----|-----|-----|\n");
        System.out.printf("|     |     |     |\n");
        System.out.printf("|  1  |  2  |  3  |\n");
        System.out.printf("|     |     |     |\n");
        System.out.printf("|-----|-----|-----|\n");
        System.out.printf("|     |     |     |\n");
        System.out.printf("|  4  |  5  |  6  |\n");
        System.out.printf("|     |     |     |\n");
        System.out.printf("|-----|-----|-----|\n");
        System.out.printf("|     |     |     |\n");
        System.out.printf("|  7  |  8  |  9  |\n");
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
    
        In numbers 1-9, the player can choose which of these cells 
        that they can place their O or X at.
        Using printf, print their input into one of these cells.
    */
    public void drawBoard (String[] session)
    {
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
