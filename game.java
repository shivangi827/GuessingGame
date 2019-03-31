
/**
 * @(#)guessingGame.java
 *
 *
 * @Shivangi
 * @version 1.00 2017/1/23
 */

import static java.lang.System.*;
import java.util.Scanner;

public class game {
	private int computerNumber, guess,start , stop;
	private int chance=0;
	private Scanner kb;
	String result, answer ;
    public void game()
    {
					Scanner kb =new Scanner (in);

    			out.println("Let's play...! \n\nI will randomly choose a number between the range you like...:-)");
    	    out.println ("Choose the start and stop of the range ;-)");
    	    out.print("Start : ");
    	    start = kb.nextInt();
    	    out.print("Stop : ");
    	    stop = kb.nextInt();
    	    out.println();
    			setNumber();

    }

    public void setNumber()
    {
    	computerNumber = (int)(Math.random () * ((stop-start)+1)+start );
    }

    //this method starts and runs a do-while loop until the user guesses the correct answer
    //The number of times the user guessed is the number of times this loop runs
    public void play()
    {
		Scanner kb =new Scanner (in);

    	do
    	{
    		setNumber();



			do{
	    		out.print("Make a guess what that number is :-> ");

	    	    guess = kb.nextInt();
	    	    chance++;
	    	    out.println(checkGuess(guess));

			    if ( checkGuess(guess).contains("Yeah...!"))
				{
				   break;
				}
			}while(true);


			out.println("Isn't this game lit???");
			out.print("Do you want to play again (y/n)??");
			answer = kb.next();
			out.println("\n\n");
			chance = 0;





    	}while (answer.equalsIgnoreCase("y"));

    										//start a do-while loop

    											//prompt the user for their guess (see Word doc for suggested prompt)

    												//read the value from the user (put it in guess)

    													//use the checkGuess method (pass it the user's guess)

    														//print the response (see Word doc for suggested output)



    }


    //this method returns "smaller", "larger", or "is equal to" depending on the value of the guess from the user.
    //an if/else if/else ladder would be really helpful here to compare user's guess to computerNumber
    //this method is used for the play method above
    public String checkGuess(int guess)
    {

    	if (guess==computerNumber)
    	{

    		result = "Yeah...! you got it. I had chosen that \nAlso it took you " + chance + " times to get it! But you did :-)";


    	}

    	else if (guess > computerNumber)
    	{
    			result ="Sorry , My number is lower.";

    	}
    	else
    	{
    		result = "Sorry , My number is higher.";

    	}
    	return result;



    }

	 public static void main(String[] args)
	 {
	 	 			game yeah = new game();
	 	 			yeah.play();
	 	 										//Create a guessingGame object
	 	 											//call the play method using object.method()

	 	 //for fun, you could create a loop that keeps this loop running as long as the user answers yes....
	 }

}


