/*Name: Ashiya Patel, Mohammed Hamed
  Assignment 4
  CS 207, Programming II
  Computer Science 
*/

public class TicTacToeApp
{
   public static void main(String[] args)
   {
      TicTacToe play = new TicTacToe();
      play.display();
      int count = 1;
      while(true)
      {
         if(count%2 == 0)
         {
            play.askplayer('O');
         }
         else
         {
            play.askplayer('X');
         }
         count++;
         System.out.println();
                  
         play.display();
         
         if(play.CheckForWinner())
         {
            count = 1;
         }
         if(play.isDraw() || play.CheckForWinner())
         {
            count = 1;
         }
      }
      
   }  
}