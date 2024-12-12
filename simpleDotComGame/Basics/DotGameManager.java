
public class DotGameManager {
    /**
     * This java file is a part of DotGame this manages single dimension array.
     */

     // Instance Variables.

     int[] gameBoard = new int[5];
     int[] filledDataLocations;
     int correctGuesses = 0;
     int wrongGuesses=0;
     String Hit ="You Guesses it right.";
     String miss = "You missed!. \n booo..";
     String result;


     public void setFilledLocation(int[] Loc){
        filledDataLocations=Loc;
        int location =0;
        int value=1;
        for(int i=0;i<filledDataLocations.length;i++){
            location=filledDataLocations[i]-1;
            gameBoard[location]=value;
        }
     }

     public String checkYourself(String guess){//to count no of guesses.

        int intGuess = Integer.parseInt(guess)-1;
        if(gameBoard[intGuess]!=0){
            correctGuesses++;
            result=Hit;
        }else{
            wrongGuesses++;
            result=miss;
        }


        return result;

     }

     public void printGameBoard(){
        for(int i =0;i<gameBoard.length;i++){
            System.out.println(gameBoard[i]);
        }
     } 
    
}
