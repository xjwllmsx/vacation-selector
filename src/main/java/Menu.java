import java.util.Scanner;

public class Menu{

  public String printMenu() {
    // Print statement greeting and menu options
    System.out.println("Welcome to the Vacation Selector!");
    System.out.println("\t1. Enter 'add' to add a desired city.");
    System.out.println("\t2. Enter 'list' to see your destination list.");
    System.out.println("\t3. Enter 'next' to select your next vacation destination.");
    System.out.println("\t4. Enter 'exit' to terminate the program.");
    System.out.print("\nWhat would you like to do: ");
    
    // Create new Scanner object
    Scanner input = new Scanner(System.in);
    
    // Save user input into a variable
    String userInput = input.nextLine();

    // Return userInput
    return userInput;
  }

  public void invalidInput(){
    System.out.println("Invalid input! Please try again.\n");
  }
}