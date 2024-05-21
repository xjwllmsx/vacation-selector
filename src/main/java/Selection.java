import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Selection {
  int randomIndex;
  Random random;
  ArrayList<String[]> destinationList;
  boolean satisfaction;
  
  // Selection Constuctor
  public Selection(ArrayList<String[]> destinationList){
    this.destinationList = destinationList;
    this.random = new Random();
    this.randomIndex = random.nextInt(destinationList.size());
  }

  // Returns randomIndex
  public int getRandomIndex() {
    return randomIndex;
  }

  // Sets a new randomIndex
  public void setRandomIndex(){
    this.randomIndex = random.nextInt(destinationList.size());
  }

  // Returns destination
  public String getDestination(){
    String[] destination = destinationList.get(randomIndex);
    return destination[0] + ", " + destination[1];
  }

  // Prints destination statement
  public void printDestinationStatement(){
    // Print next destination to user
    System.out.println("Your next vacation will be in " + getDestination());
  }

  // Sets user satisfaction
  public boolean isSatisfied(){
    // Ask user if they are satisfied with their selection
    System.out.print("Are you satisfied with this destination? Enter 'yes' or 'no': ");
    // Create a new Scanner object
    Scanner input = new Scanner(System.in);
    // Save user's input in a variable
    String userInput = input.nextLine().toLowerCase();
    // If user is satisfied
    if (userInput.equals("yes")){
      satisfaction = true;
    }
    // If user is not satisfied
    else if (userInput.equals("no")){
      satisfaction = false;
    }
    return satisfaction;
  }
  
}