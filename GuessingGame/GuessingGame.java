import java.util.Scanner;
 
public class GuessingGame 
{
   		public static void main(String[] args) 
   		{
   		Scanner sc = new Scanner(System.in);
    	System.out.println(
    		"Guessing Game \n" + 
    		"1. Beginner Level (1-10) \n" + 
    			"2. Intermediate Level (1-100) \n" + 
    				"3. Advanced Level (1-1000) \n" + 
    					"4. Expert Level (1-10000) \n" +
    						"Type the number corresponding to the level you want to play: ");				
    	int level = sc.nextInt();
    	if (level < 1)
    	{
    		System.out.println("This level is too low. Try again.");
    	}
    	else if (level > 4)
    	{
    		System.out.println("This level is too high. Try again.");
    	}
    	System.out.println("Level: " + level);
    	int maxNumber = (int)(Math.pow(10, level));
    	int number = (int)(Math.random() * Math.pow(10, level)) + 1;
    	int numGuesses = 0;
    	boolean win = false;
    	boolean playAgain = false;
    		
    	Scanner guess = new Scanner(System.in);
    	System.out.println("Guess a number between 1 and " + maxNumber);
    	
    	while(win==false)
    	{
    		int userGuess = guess.nextInt();
    		numGuesses++;
    		if (userGuess > number)
    		{
    			System.out.println("The guess is too high.");
    		}
    		if (userGuess < number)
    		{
    			System.out.println("The guess is too low.");
    		}
    		if(userGuess == number)
    		{
    			System.out.println("Congratulations! You guessed the number in " + numGuesses + " tries!");
    			System.out.println("The number was: " + number);
    			Scanner pa = new Scanner(System.in);
    			System.out.println("Do you want to play again? Press 1 for yes or 2 for no");
    			int answer = pa.nextInt();
    			if (answer==1)
    			{
    				playAgain = true;
    			}
    		}
    	}
    	
    	if (playAgain==true)
    	{
    		Scanner nsc = new Scanner(System.in);
    		System.out.println(
    		"Guessing Game \n" + 
    		"1. Beginner Level (1-10) \n" + 
    			"2. Intermediate Level (1-100) \n" + 
    				"3. Advanced Level (1-1000) \n" + 
    					"4. Expert Level (1-10000) \n" +
    						"Type the number corresponding to the level you want to play: ");				
    		int nlevel = nsc.nextInt();
    		if (nlevel < 1)
    		{
    			System.out.println("This level is too low. Try again.");
    		}
	    	else if (nlevel > 4)
	    	{
	    		System.out.println("This level is too high. Try again.");
	    	}
	    	System.out.println("Level: " + nlevel);
	    	int nmaxNumber = (int)(Math.pow(10, nlevel));
	    	int nnumber = (int)(Math.random() * Math.pow(10, nlevel)) + 1;
	    	int nnumGuesses = 0;
	    	boolean nwin = false;
    		
    	Scanner nguess = new Scanner(System.in);
    	System.out.println("Guess a number between 1 and " + nmaxNumber);
    	
    	while(nwin==false)
    	{
    		int nuserGuess = nguess.nextInt();
    		nnumGuesses++;
    		if (nuserGuess > nnumber)
    		{
    			System.out.println("The guess is too high.");
    		}
    		if (nuserGuess < nnumber)
    		{
    			System.out.println("The guess is too low.");
    		}
    		if(nuserGuess == nnumber)
    		{
    			System.out.println("Congratulations! You guessed the number in " + nnumGuesses + " tries!");
    			System.out.println("The number was: " + nnumber);
    			Scanner pa = new Scanner(System.in);
    		}
    	}
	    }
   		}
}

