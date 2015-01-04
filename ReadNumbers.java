import java.io.*;
import java.util.Scanner;

/**
 * This simple program will read primitive values from a file
 * and add them up. 
 * It uses a while loop to determine if the hasNext method is true
 * as well as an accumulator value that keeps the total.
 */

public class ReadNumbers
{
  public static void main(String[] args) throws IOException
  {
 
    // Declare accumulator variable.
    double accumulator = 0; // Accumulates the numbers.
    
    
    // Create Scanner object to read keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    // Prompt the user for the filename.
    System.out.println("Enter the name of the file.");
    String filename = keyboard.nextLine();
    
    // Open the file.
    File file = new File(filename);
    
    // Create Scanner object to read from the file.
    Scanner inputFile = new Scanner(file);
    
    // Read all lines from the file.
    while (inputFile.hasNext())
    {
     double line = inputFile.nextDouble();
     System.out.println(line);
     accumulator += line;   // Add the value of line to accumulator.
      
    }
    
    // Display the sum of the numbers in the file.
    System.out.println("The sum of the numbers are: " + accumulator + ".");
      
    
    // Close the file.
    inputFile.close();
    
  }
}
