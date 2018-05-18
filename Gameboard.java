/*Name: Ashiya Patel, Mohammed Hamed
  Assignment 4
  CS 207, Programming II
  Computer Science 
*/

import java.util.*;
public class Gameboard
{
    private char[][] gameboard;
   
   public Gameboard(int row,int  col)
   {
      gameboard = new char[row][col];
      
      for(row = 0;row<gameboard.length;row++)
      {
         for(col = 0;col<gameboard[row].length;col++)
         {
            gameboard[row][col] = ' ';
         }
      }      
   }
   
   public char getCharacter(int row, int col)
   {
      return(this.gameboard[row][col]);
   }
   
   public void setCharacter(char player,int row,int col)
   {
      gameboard[row][col]= player;
   } 
     
   public void printBoard()
   {
      for(int row = 0; row < gameboard.length; row++)
      { 
         for(int col = 0; col < gameboard[row].length; col++)
         {
            System.out.print(gameboard[row][col]);
            if(col == 0 || col == 1)
            {
               System.out.print("\t|");
            }
         }
            if(row==0 || row==1)
            {
               System.out.print("\n- - - - - -\n");
            }
       }
   }   
   
   public boolean clearBoard()
   {
      for(int row = 0;row<gameboard.length;row++)
      {
         for(int col = 0;col<gameboard[row].length;col++)
         {
            gameboard[row][col] = ' ';
         }
      } 
      return false;
   }
}
