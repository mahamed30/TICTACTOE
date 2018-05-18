/*Name: Ashiya Patel, Mohammed Hamed
  Assignment 4
  CS 207, Programming II
  Computer Science
*/

import java.util.*;
public class TicTacToe
{    
   private Gameboard g1;
   
   public TicTacToe()
   {
     g1 = new Gameboard(3,3);
   }
   public void display()
   {
      g1.printBoard();
   }
   public void clear()
   {
      g1.clearBoard();
   }
  public void askplayer(char player)
   {
      Scanner input = new Scanner(System.in);
      int row,col;
      System.out.println();
      do
      {
         System.out.println(player+" Player Enter row(0-2): ");
         row = input.nextInt();
         System.out.println(player+" Player Enter col(0-2): ");
         col = input.nextInt();
      }while(notvalid(row,col));
      
      g1.setCharacter(player,row,col);
   }
  public boolean notvalid(int row, int column)
   {
      if ((row > 3 || column > 3) || (row < 0 || column < 0) || !isEmpty(row, column)) 
      {
         return true;
      } 
      else if (g1.getCharacter(row, column) == 'X' || g1.getCharacter(row, column) == 'O')
      {
         return true;
      }
      else return false;
    }
    public boolean isEmpty(int row, int col)
    {
      if(row<3 && col<3)
      if(g1.getCharacter(row, col) == ' ')
      return true;
      
      else
      System.out.println("The Position is already taken!");
      return false;
   } 

   public boolean CheckForWinner()
   {  
      Scanner input = new Scanner(System.in);
      for(int row = 0; row < 3; row++)
      
         if(g1.getCharacter(row, 0)==g1.getCharacter(row, 1) && g1.getCharacter(row, 1)==g1.getCharacter(row, 2) && g1.getCharacter(row, 0)!=' ')
         {
            System.out.println("\nWinner is "+g1.getCharacter(row, 0));
            System.out.println(" Do You Want to Play Again? Yes or No");
            String str = input.next();
            if(str.equals("Yes") || str.equals("yes"))
            {
             clear();
             display();       
            }
            else
            System.exit(0);
            return true;           
         }
      
      for(int col = 0;col<3;col++)
      {
         if(g1.getCharacter(0, col)==g1.getCharacter(1, col) && g1.getCharacter(1, col)==g1.getCharacter(2, col)  && g1.getCharacter(0, col) !=' ')
         {
            System.out.println("\n"+g1.getCharacter(1, 1)+" won the game!Congratulations!!!");
            System.out.println("Do You Wish to Play Again? Yes or No");
            String str = input.next();
            if(str.equals("Yes") || str.equals("yes"))
            {
               clear();
               display(); 
            }
            else
            System.exit(0);
            return true;
         }
         
         if(g1.getCharacter(0, 0)==g1.getCharacter(1, 1) && g1.getCharacter(1, 1)==g1.getCharacter(2, 2) && g1.getCharacter(0, 0)!=' ')
         {
            System.out.println("\n"+g1.getCharacter(1, 1)+" won the game!Congratulations!!!");
            System.out.println("Do You wish to Play Again? Yes or No");
            String str = input.next();
            if(str.equals("Yes") || str.equals("yes"))
            {
                clear();
                display();           
            }
            else
               System.exit(0);
            return true;  
         }
         if(g1.getCharacter(0, 2)==g1.getCharacter(1, 1) && g1.getCharacter(1, 1)==g1.getCharacter(2, 0) && g1.getCharacter(2, 0)!=' ')
         {
            System.out.println("\n"+g1.getCharacter(1, 1)+" won the game!Congratulations!!!");
            System.out.println("Do You Wish to Play Again? Yes or No");
            String str = input.next();
                           
            if(str.equals("Yes") || str.equals("yes"))
            {
               clear();
               display();            
            }
            else
            System.exit(0);
            return true;
         }
      }
      return false; 
   }
   public boolean isDraw() 
   {
      Scanner input = new Scanner(System.in);
      for (int row = 0; row <3 ; row++) 
      {
         for (int col = 0; col < 3; col++) 
         {
            if (g1.getCharacter(row, col) == ' ') 
            {
               return false;  // If an empty cell found,it won't draw,it will exit
            }
         }
      }
      System.out.println("\nGame is Draw");
      System.out.println("Do You Want to Play Again? Yes or No");
      String str = input.next();
                           
      if(str.equals("Yes") || str.equals("yes"))
      {
          clear();
          display();           
      }
      else
         System.exit(0);
      return true;  
    }
}