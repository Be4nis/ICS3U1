import java.util.*;
import java.lang.Math;

/*
simpleCalculator.java
Brian Zhang
Oct 6th, 2022
This is a simple calculator program that can solve 8 basic equations.
*/
public class simpleCalculator {
	public static void main(String[] args) {
		// Set the boolean condition to true in order to use the while loop
		boolean condition = true;

		// Imported the input scanner and welcomed the user to the calculator
		// application
		Scanner input = new Scanner(System.in);
		System.out.println("WELCOME TO THE SIMPLE CALCULATOR APPLICATION");

		// Initialize the while loop
		while (condition) {

			// Show the user the possible operations they can do.
			System.out.println("\n======= Type 9 to Stop the Program ========");
			System.out.println("1. Addition\t\t 5. Mean");
			System.out.println("2. Subtraction\t\t 6. Sine");
			System.out.println("3. Multiplication\t 7. Tangent");
			System.out.println("4. Division\t\t 8. Divisibility");
			System.out.println("============================================");

			// Ask the user what operation they want to solve and store it into the
			// operation variable.
			System.out.print("Which operation would you like to perform? ");
			int operation = input.nextInt();
			// This switch statment is used to determine which operation the user chose.
			switch (operation) {
				// Case number 1 is used to solve addition
				case 1:
					System.out.println("============================================");
					// Ask the user how many numbers they want to find the sum of and store that
					// into the variable amountOfNums so that the for loop knows how many times it
					// should repeat.
					System.out.println("How many numbers are you trying to add? ");
					int amountOfNums = input.nextInt();

					// Initializze the sum as 0 so that the for loop can add the numbers into the
					// sum.
					double sum = 0;
					for (int i = 0; i < amountOfNums; i++) {

						// The if statments are to add the suffixes to the numbers in the print
						// statements. If it's the first number it adds the suffix st to 1st, second
						// number would add the suffix nd to 2nd.
						if (i == 0 || i == 20) {
							String suffix = "st";
							System.out.println("Enter the " + (i + 1) + suffix + " number: ");

						} else if (i == 1 || i == 21) {
							String suffix = "nd";
							System.out.println("Enter the " + (i + 1) + suffix + " number: ");

						} else if (i == 2 || i == 22) {
							String suffix = "rd";
							System.out.println("Enter the " + (i + 1) + suffix + " number: ");

						} else {
							String suffix = "th";
							System.out.println("Enter the " + (i + 1) + suffix + " number: ");
						}
						// After telling the user to enter their number, the user enters the number into
						// the num variable and then it is added to the sum variable we initialized
						// before the for loop.
						double num = input.nextDouble();
						sum += num;
					}
					System.out.println("Your answer is " + sum);
					break;

				// Case number 2 is used to solve subtraction, this case asks for 2 numbers and
				// subtracts the second number from the third.
				case 2:
					System.out.println("============================================");
					System.out.println("Enter your first number: ");
					double firstSubNum = input.nextDouble();
					System.out.println("Enter your second number: ");
					double secondSubNum = input.nextDouble();
					double difference = (firstSubNum - secondSubNum);
					System.out.println("Your answer is " + difference);
					break;

				// Case number 3 is used to solve multiplication, it asks for two numbers and
				// multiplies the first and the second and gives the product.
				case 3:
					System.out.println("============================================");
					System.out.println("Enter your first number: ");
					double firstMulNum = input.nextDouble();
					System.out.println("Enter your second number: ");
					double secondMulNum = input.nextDouble();
					double product = (firstMulNum * secondMulNum);
					System.out.println("Your answer is " + product);
					break;

				// Case number 4 is used to solve division, it prompts the user to provide two
				// numbers and it divides the second number the user gave by the first number
				// that the use gave.
				case 4:
					System.out.println("============================================");
					System.out.println("Enter your first number: ");
					double firstDivNum = input.nextDouble();
					System.out.println("Enter your second number: ");
					double secondDivNum = input.nextDouble();
					double quotient = (firstDivNum / secondDivNum);
					System.out.println("Your answer is " + quotient);
					break;

				// Case number 5 is used to find the mean of however many numbers the user wants
				// to find the mean of.
				case 5:
					System.out.println("============================================");
					// Initialize a double that can store the sum of user inputted variables
					double totalAmount = 0;

					System.out.println("How many integers do you want to find the average of? ");
					int numOfInts = input.nextInt();
					// Ask the user for how many integers they want to find the average of and loops that many times.
					for (int h = 0; h < numOfInts; h++) {
						if (h == 0 || h == 20) {
							String suffix = "st";
							System.out.println("Enter the " + (h + 1) + suffix + " number: ");

						} else if (h == 1 || h == 21) {
							String suffix = "nd";
							System.out.println("Enter the " + (h + 1) + suffix + " number: ");

						} else if (h == 2 || h == 22) {
							String suffix = "rd";
							System.out.println("Enter the " + (h + 1) + suffix + " number: ");

						} else {
							String suffix = "th";
							System.out.println("Enter the " + (h + 1) + suffix + " number: ");
						}						double num = input.nextDouble();
						//Adds the number the user inputted to totalAmount 
						totalAmount += num;
					}
					//Divides the total amount by the number of integers there are and gets the average.
					double average = totalAmount / numOfInts;
					System.out.println("The average of these numbers is " + average);
					break;
				case 6:
					System.out.println("============================================");
					System.out.println("Enter your number: ");
					double sineNum = input.nextDouble();
					System.out.println("Your answer is " + Math.sin(sineNum));
					break;

				// Case number 7 is used to find the TANGENT
				case 7:
					System.out.println("============================================");
					System.out.println("Enter your number: ");
					double tanNum = input.nextDouble();
					System.out.println("Your answer is " + Math.tan(tanNum));
					break;

				// Case 8 is used to find the DIVISIBILITY of an equation
				case 8:
					System.out.println("============================================");
					System.out.println("Enter your first number: ");
					double firstModNum = input.nextDouble();
					System.out.println("Enter your second number: ");
					double secondModNum = input.nextDouble();
					double remainder = (firstModNum % secondModNum);
					if (remainder != 0) {
						System.out.println(firstModNum + " isn't divisible by " + secondModNum
								+ " since the remainder of these two numbers are " + remainder + " and not 0.");
					} else {
						System.out.println("These two numbers are divisible!");
					}
					break;
				default:
					System.out.println("============================================");
					System.out.println("============================================");
					System.out.println("This is an invalid operation!");
				case 9:
					condition = !condition;
					System.out.println("============================================");
					System.out.println("Thank you for usin	g this application! See you next time.");
					break;
			}

		}
		input.close();
	}
}
