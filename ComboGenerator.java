/* Gizmo's Combo Idea Creator
 * 11/11/2020 */

import java.util.*;

public class ComboGenerator
{
  public static void main(String args[])
  {
    Scanner kbReader = new Scanner(System.in);
    System.out.print("Enter a number of moves between 2 and 6 for generating random combo strings: ");
    int userNum = kbReader.nextInt();
    Random rd = new Random();
    String [] moveList = {"jab", "ftilt", "up tilt", "dtilt", "up strong", "fstrong", "dstrong", "neutral b", "up b", "side b", "down b", "nair", "fair", "bair", "up air", "dair"};
    //Above: array of length 16, index 15 containing all standard moves that can be inputted from grounded and/or aerial actionable state
    
    if((userNum>=2) && (userNum<=6)) //checks that the user selected between 2 and 6 moves, then generates combos if true
    {
      for(int x = 0; x < 10; x++) //generates 10 sets of userNum amount of moves
      {
        System.out.print((x + 1) + ": "); //formatting for combo #
        for(int i = 0; i < (userNum - 1); i++)
        {
          int move = rd.nextInt(16); //generates random int 0-15, which corresponds to index of any element in moveList
          System.out.print((moveList[move]) + " - ");
        }
        int move = rd.nextInt(16);
        System.out.println(moveList[move]); //formatting for last move in list, avoids a - marking after
      }
    }
    else
      System.out.println("Please rerun the program and enter a valid number of moves."); //when user doesn't enter a valid number of moves
  }
}