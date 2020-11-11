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
    
    if((userNum>=2) && (userNum<=6))
    {
      for(int x = 0; x < 10; x++)
      {
        System.out.print((x + 1) + ": ");
        for(int i = 0; i < userNum; i++)
        {
          int move = 1 + rd.nextInt(16);
          switch(move)
          {
            case 1:
              System.out.print("jab");
              break;
            case 2:
              System.out.print("f tilt");
              break;
            case 3:
              System.out.print("d tilt");
              break;
            case 4:
              System.out.print("up tilt");
              break;
            case 5:
              System.out.print("f strong");
              break;
            case 6:
              System.out.print("d strong");
              break;
            case 7:
              System.out.print("up strong");
              break;
            case 8:
              System.out.print("neutral b");
              break;
            case 9:
              System.out.print("down b");
              break;
            case 10:
              System.out.print("side b");
              break;
            case 11:
              System.out.print("up b");
              break;
            case 12:
              System.out.print("nair");
              break;
            case 13:
              System.out.print("fair");
              break;
            case 14:
              System.out.print("bair");
              break;
            case 15:
              System.out.print("dair");
              break;
            case 16:
              System.out.print("up air");
              break;
          }
          System.out.print(" - ");
        }
        System.out.println("");
      }
    }
    else
      System.out.println("Please try again.");
  }
}