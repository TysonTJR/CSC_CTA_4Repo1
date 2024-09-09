package SrcCode;

import java.util.Scanner;    //imports the scanner class

public class LoopingConstruct {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);   //Creates a Scanner object from Scanner class
		
		
		double interestOnTotal = 0.20;      // declaring double variable for interest on the total
		
		
		double userInputInLoop;          // declaring and assigning variable for user input 
		
		
		
		int i = 2;             // Declaring and assigning counter variable for while loop, it is two because the first user input comes outside the while loop
		
		
		System.out.println("Enter number 1 : ");  // printing to console asking the user to enter first number
		double firstUserInput = scnr.nextDouble();   // assigning variable to user input that is a double
		
		
		double total = firstUserInput;    //total is assigned to firstUserInput because this variable which contains user input is before the while loop, So I'll first assign it to the total to account for it.
		double average = 0;
		double maximum;         //declaring and assigning variables for total, average, maximum, and minimum
		double minimum;   
		
		
		maximum = firstUserInput;  //assigning maximum to firstUserInput outside of the loop so I can compare it to the other numbers
		minimum = firstUserInput; // assigning minimum to firstUserInput so I can prepare to compare it to the other numbers in the loop
		
		
		while (i < 6) {    // this is a while loop which executes when this statement is true: the iteration the loop is on is not more than 6 runs
			
			System.out.println("Enter number " + i);  // a statement which prints out enter your "iteration number" number
			userInputInLoop = scnr.nextDouble();  //assigns the variable user input to the user input each iteration
			++i;  // increments the i variable in the while loop each iteration

			total += userInputInLoop;  // This is the total: it is calculated by adding the total which is first equal to firstUserInput out of the while  loop to the current user input each iteration
			
			if(userInputInLoop > maximum) { //This is an if statement inside the while loop to calculate the maximum: in each iteration it calculates whether the user input is greater than the maximum  which is first set to 0
				maximum = userInputInLoop;
			}
			if(userInputInLoop < minimum) {    // Calculation of minimum is based off the assumption user inputed numbers are entered from smallest to greatest.
				minimum = userInputInLoop;
			}
			
		}
		
		average = total / 5;   //Calculates the average of the total by adding all the numbers together then divide by 5
		
		interestOnTotal = total * 0.20;   //Calculates the interest on the total by multiplying the total by 0.20
	
		
		System.out.printf("your total is " + "%.2f", total);
		System.out.println("");                                   //this statement adds a space and enter for the output lines
		System.out.printf("your average is " + "%.2f", average);
		System.out.println("");                                   //this statement adds a space and enter for the output lines
		System.out.printf("your maximum is " + "%.2f", maximum);
		System.out.println("");                                   //this statement adds a space and enter for the output lines
		System.out.printf("your minimum is " + "%.2f", minimum);                            //block of statements which print out the total, average, max, min, and interest on total
		System.out.println("");                                   //this statement adds a space and enter for the output lines
		System.out.printf("your interest on the total is " + "%.2f", interestOnTotal);
		
		}
	}



