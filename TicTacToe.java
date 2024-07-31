import java.util.Scanner;

public class jay_tictac 
{
    public static String checkwinner(String arr[])
    {
		for(int i = 0; i < 8; i++)
        {
			String test = null;
			switch(i)
            {
				case 0:
					test = arr[0] + arr[1] + arr[2];
					break;
				case 1:
					test = arr[3] + arr[4] + arr[5];
					break;
				case 2:
					test = arr[6] + arr[7] + arr[8];
					break;
				case 3:
					test = arr[0] + arr[3] + arr[6];
					break;
				case 4:
					test = arr[1] + arr[4] + arr[7];
					break;
				case 5:
					test = arr[2] + arr[5] + arr[8];
					break;
				case 6:
					test = arr[0] + arr[4] + arr[8];
					break;
				case 7:
					test = arr[2] + arr[4] + arr[6];
					break;
			}
			if(test.equals("XXX"))
            {
                return "X";
            }
                
			if(test.equals("OOO"))
            {
                return "O";
            } 
		}
		for(String x : arr)
        {
            for(int i = 0; i < 9; i++)
            {
                if(x.equals(Integer.toString(i + 1))) return null;
            }
        }

        return "draw";
    }
    public static void printboard(String arr[]){
        System.out.println("|---|---|---|");
		System.out.println("| " + arr[0] + " | " + arr[1] + " | " + arr[2] + " |");
		System.out.println("|---|---|---|");
		System.out.println("| " + arr[3] + " | " + arr[4] + " | " + arr[5] + " |");
		System.out.println("|---|---|---|");
		System.out.println("| " + arr[6] + " | " + arr[7] + " | " + arr[8] + " |");
		System.out.println("|---|---|---|");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String arr[] = new String[9];
        for(int i = 0; i < 9; ++i)
        {
            arr[i] = Integer.toString(i + 1);
        }

        System.out.println("Enter Name of Player 1 : ");
        String pl1 = sc.next();
        System.out.println("Enter Name of Player 2 : ");
        String pl2 = sc.next();
        
        System.out.println("Enter Who is going to play first : ");
        String turn = sc.next();
        printboard(arr);
        System.out.println("X is for "  + pl1 + " and O is for " + pl2 );
        System.out.println( "-> " + turn + " is going to play first.!");
        System.out.println();
        System.out.println(" -> Enter the number where  you want to place marks..!");
        String place = "X";
        String winner = null;
        while (winner == null) 
        { 
            System.out.println(turn + "'s turn.., Enter the position to place " + place + " : ");
            int pos;
            pos = sc.nextInt();
            if(pos > 9 || pos < 1) 
            {
                System.out.println("re-enter slot number");
                continue;
            }
            if(arr[pos - 1].equals(Integer.toString(pos)))
            {
                arr[pos - 1] = place;

                if(place.equals("X"))
                {
                    turn = pl2;
                    place = "O";
                }
                else
                {
                    turn = pl1;
                    place = "X";
                } 
                printboard(arr);
                winner = checkwinner(arr);
            }
            else
            {
                System.out.println("Slot is taken");
            }
        }

        if(winner.equals("draw")) System.out.println("Its a draw between " + pl1 + " and " + pl2);
        else
        {
            if(winner.equals("X")) System.out.print(pl1);
            else System.out.print(pl2);
            System.out.print(" is winner...!!!!!!!!");
        }
        sc.close();

    }
}
