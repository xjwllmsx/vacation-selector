import java.util.Scanner;

public class Destination{
  private String cityName;
  private String countryName;

  // City Constructor
  public Destination(){
    // Create a new Scanner object
    Scanner input = new Scanner(System.in);
    // Prompt user to enter the city name
    System.out.print("\nEnter city name: ");
    // Save user's input into a variable
    this.cityName = input.nextLine();
    // Prompt user to enter the country 
    System.out.print("Enter country name: ");
    // Save user's input into a variable
    this.countryName = input.nextLine();
  }

  // Sets cityName
  public void setCityName(String cityName){
    this.cityName = cityName;
  }

  // Sets countryName
  public void setCountryName(String countryName){
    this.countryName = countryName;
  }

  // Returns array with City and Country name
  public String[] destinationArray(){
    String[] array = {cityName, countryName};
    return array;
  }

  // Returns City's Name
  public String getCityName(){
    return cityName;
  }

  // Returns Country's Name
  public String getCountryName(){
    return countryName;
  }

  // Prints a statement with City and Country name
  public String printDestination(){
    return cityName + ", " + countryName;
  }
}