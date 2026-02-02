import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
    //Name: Harper Larsen
    //Assignment: Program 1
    //Class: TTH 1-2:15
    //Lab: W 1-3:30
    
    //create variables

    Scanner scanner = new Scanner(System.in);
    int inValue;

    //practice input
    System.out.println("Please enter your next value: ");
    inValue = scanner.nextInt();
    System.out.println("Why did you enter " + inValue + "?");

    //setting up other variable types
    char letter = 'A';
    String words = "The Words";

    //LECTURE 1
    //add code to input a string replacing the variable 
    //words with the input value
    scanner.nextLine();
    System.out.print("Enter a string: ");
    words = scanner.nextLine();

    //print the string

    System.out.println("You entered: " + words);


    //add code to input a new value for the variable
    //letter

    System.out.print("Enter a new character (A-F): "); 
    letter = scanner.nextLine().toUpperCase().charAt(0);


    //LECTURE 2
    //if the letter entered is A or B - print "You did GREAT!"
    //if the letter is C - print "You did GOOD!"
    //if the letter is D or F - print "Try again"
    //if the letter is something else, print "Incorrect value"

    if (letter == 'a' || letter == 'B') {
      System.out.println("You did GREAT!");
    } else if (letter == 'C') {
      System.out.println("You did GOOD!");
    } else if (letter == 'D' || letter == 'F') {
       System.out.println("Try again");
    } else {
      System.out.println("Incorrect value");
    }

    //LECTURE 1
    //this is demonstrating different values
    String bigTheta = "\u0398";

    System.out.println(bigTheta + "    \u03B1" + "   " + 0b1111);
    

    //LECTURE 1
    //formatting values for output
    double value = 16.404674;
    System.out.printf("Value is $%4.2f", value);

    scanner.close();
  }

}
