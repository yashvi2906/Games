import java.util.*;

public class RockPaperScissors 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Enter the number of rounds: ");
        int n = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Enter Player 1 Name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter Player 2 Name: ");
        String name2 = scanner.nextLine();
        
        String[] choices = {"Rock", "Paper", "Scissors"};
        int player1Wins = 0;
        int player2Wins = 0;
        int tie=0;

        System.out.printf("%-10s %-10s %-10s\n", "Round", name1, name2);
        System.out.println("-----------------------------");
        
        for (int round = 1; round <= n; round++) 
        {
            int player1Choice = random.nextInt(3);
            int player2Choice = random.nextInt(3);
            
            System.out.printf("%-10s %-10s %-10s\n", round, choices[player1Choice], choices[player2Choice]);
            
            if (player1Choice == player2Choice) 
            {
                // It's a tie, no one wins
                tie++;
                continue;
            }
            
            switch (player1Choice) 
            {
                case 0: // Rock
                    if (player2Choice == 2) 
                    { // Scissors
                        player1Wins++;
                    } 
                    else 
                    {
                        player2Wins++;
                    }
                    break;
                case 1: // Paper
                    if (player2Choice == 0) 
                    { // Rock
                        player1Wins++;
                    } else 
                    {
                        player2Wins++;
                    }
                    break;
                case 2: // Scissors
                    if (player2Choice == 1) 
                    { // Paper
                        player1Wins++;
                    } else 
                    {
                        player2Wins++;
                    }
                    break;
            }
        }
        
        System.out.println("\nResults:");
        System.out.println(name1 + " Wins: " + player1Wins);
        System.out.println(name2 + " Wins: " + player2Wins);
        System.out.println("Total Tie: "+ tie);
        scanner.close();
    }
}
