import java.util.*;
public class DotGame {

    /**
     * @author Sai Sri Harsha Pemmasani.
     * @date 12/11/2024.
     * @description
     * 
     * 
     * This is a program written for a game where user guesses which indice is filled with data a one dimensional array.
     * If the user guesses all the filled indices the game is finished.
     * untill unless the user guesses all the filled indices the game continues.
     * 
     */


     public static void main(String[] args) {

        DotGameManager GM = new DotGameManager();
        
        int[] Loc = {1,3,4};
        
        GM.setFilledLocation(Loc);
        int i=0;
        String p ="";
        Scanner sc= new Scanner(System.in);
        while(i<Loc.length) {

            System.out.print("enter: ");
        	String guess = sc.nextLine();
        	p=GM.checkYourself(guess);
        	System.out.println(p);
        	if(p=="You Guesses it right.") {
        		i++;
        		System.out.println(i);
        	}
        	p="";
        	System.out.println(p);
        }
        System.out.println("You won the game");
        System.out.println("No of miss"+ GM.wrongGuesses);
        sc.close();
        
     }
    
}