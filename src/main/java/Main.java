import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    // boolean terminateProgram = false;
    boolean continueProgram = true;

    // Create an ArrayList to store vacation destinations
    ArrayList<String[]> destinationList = new ArrayList<String[]>();
    
    // Create a new Menu object
    Menu menu = new Menu();
    
    // Run program while condition is met
    while(continueProgram) {
      // Save user input from Menu object in a variable
      String cmd = menu.printMenu().toLowerCase();

      // If user wants to terminate the program
      if(cmd.equals("exit")) {
        continueProgram = false;
        System.out.println("\nTerminating the program. Take care!");
      }
  
      // Run if user wants to add a new destination
      else if(cmd.equals("add")) {
        // Create a variable that will be a condition for the loo
        boolean addADestination = true;
        // Run while variable is true
        while(addADestination){
          // Create new Destination object
          Destination newDestination = new Destination();
  
          // Add new destination to ArrayList
          destinationList.add(newDestination.destinationArray());
  
          // Notify the user of ArrayList addition
          System.out.println(newDestination.printDestination() + " has been added to your list of desired vacation destinations.\n");

          // Create boolean variable for while loop condition
          boolean addAnother = true;

          // Loops question if user inputs an invalid option
          while(addAnother){
            
            // Ask user if they would like to add another destination
            System.out.print("Would you like to add another destination? Enter 'yes' or 'no': ");
            
            // New Scanner object
            Scanner input = new Scanner(System.in);

            // Save user input into a variable
            String userInput = input.nextLine().toLowerCase();
            
            // Conditional statement
            if(userInput.equals("yes")){
              // Restarts loop
              break;
            }
            else if(userInput.equals("no")){
              // Ends while loops
              addAnother = false;
              addADestination = false;
              // Adds blank line for space
              System.out.println();
            }
            else{
              System.out.println("Invalid entry!\n");
              continue;
            }
          }
        }
      }
        
      // If user wants to see their list of destinations
      else if(cmd.equals("list")) {
        // Runs when there are no destinations saved to the list
        if(destinationList.size() <= 0){
          System.out.println("\nYou do not have any cities saved in your list at this time. Please select 'add' from the main menu to add a city to your desired destination list.");
          System.out.println();
        }
        // Runs when there is at least one destination saved in list
        else {
          System.out.println("\nHere is your list of destinations:");
          // Iterate through destinationList and print each city
          for(int i = 0, k = 1; i < destinationList.size(); i++, k++) {
            // Create a temporary array
            String[] arr = destinationList.get(i);
            // Print statement with array items
            System.out.println("\t" + k + ") " + arr[0] + ", " + arr[1]);
          }
        }
        // Prints a new line for seperation
        System.out.println();
      }
      
      // If user wants to have a city randomly selected
      else if(cmd.equals("next")){
        if(destinationList.size() < 2) {
          System.out.println("\nYou do not have enough cities saved in your list of destinations. Please add a city to your list.\n");
        }
        else{
          // Create a new Selection object
          Selection select = new Selection(destinationList);
          // Let the user know their destination is being selected
          System.out.println("\nSelecting your next destination...");
          // Print next destination to user
          select.printDestinationStatement();

          // Run while until user is satisfied with their destination
          while(!select.isSatisfied()){
            // Let the user know a new destination is being selected
            System.out.println("\nSelecting a new destination...");
            // Change the random index
            select.setRandomIndex();
            // Print next destination to user
            select.printDestinationStatement();
          }
          // End program
          System.out.println("\nHave a great trip to " + select.getDestination() + "!");
          continueProgram = false;
        }
      }

      // If the user input does not match any of the listed commands
      else{
        menu.invalidInput();
      }
    }
  }
}