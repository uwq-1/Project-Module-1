/*
  Student Name : Garson Hutchinson
  Student ID # : 2101012660
  Due Date : February 21, 2024

*/


package creditsolution;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // System.out.println("\n");
    // Create an object of the class "Card"
    //Card uni = new Card(23, 12, 45678, true);
    // Create an object of the class "Client"
    Client obj = new Client(12, "John", "Burke", 21);
    obj.setPin(45678);
    obj.setStatus(true);
    obj.Display();

    System.out.println("\n");
    System.out.println("**Card Info**");
    System.out.println("Pin Info: " + obj.getPin());
    System.out.println("Status Info: " + obj.getStatus());
    System.out.println("CARD BALANCE: " + obj.getBalance());
    System.out.println("CARD NUMBER :" + obj.getCardNumber());
    //System.out.println("Card info for client :" + obj.getCard());
    System.out.println("\n");


    // Hint to firstname and lastname implementation here :
    // https://stackoverflow.com/questions/47241665/using-user-selection-choice-using-switch-and-scanner-class-java

    int choice;
    while (true) {
      // prompt user for options (Client INFORMATION)
      System.out.println("General Menu INFORMATION\n"
                         + "General Client INFORMATION\n"
                         + "1 . First Name\n"
                         + "2 . Last Name\n"
                         + "3 . Age\n"
                         + "4 . ID Number\n"
                         + "5 . Display Client INFORMATION\n"
                         + "General Card INFORMATION\n"
                         + "6 . Card Number\n"
                         + "7 . Card Balance\n"
                         + "8 . Card Pin\n"
                         + "9 . Card Status\n"
                         + "10 . Display Card INFORMATION\n"
                         + "11 . Exit");

      Scanner myObj = new Scanner(System.in);

      choice = myObj.nextInt();

      switch (choice) {
      case 1:
        System.out.println("Enter firstname : ");
        myObj = new Scanner(System.in);
        String firstName = myObj.nextLine();              // Read user input
        System.out.println("Firstname is: " + firstName); // Output user input*/
        break;
      case 2:
        System.out.println("Enter Lastname : ");
        myObj = new Scanner(System.in);
        String lastName = myObj.nextLine();
        System.out.println("LastName: " + lastName);
        break;
      case 3:
        System.out.println("Enter your age : ");
        int age = myObj.nextInt(); // Read user input
        System.out.println("Age:  " + age);
        break;
      case 4:
        System.out.println("Enter your ID Number : ");
        int idNumber = myObj.nextInt(); // Read user input
        System.out.println("ID Number: " + idNumber);
        break;
        case 5:
          System.out.println("Display Client INFORMATION: ");
          System.out.println("Firstname is: " + obj.getFirstName());  // Output
          System.out.println("Lastname is: " + obj.getLastName());    // Output
          System.out.println("ID NUMBER #: " + obj.getIdNumber());    // Output
          System.out.println("Age is: " + obj.getAge());              // Output
          break;
      case 6:
        System.out.println("Enter your Card Number : ");
        int cardNumber = myObj.nextInt(); // Read user input
        System.out.println("Card Number : " + cardNumber);
        break;
      case 7:
        System.out.println("Enter your Card Balance :$ ");
        double balance = myObj.nextDouble(); // Read user input
        System.out.println("BALANCE :$ " + balance);
        break;
      case 8:
        System.out.println("Enter your Card Pin : ");
        int pin = myObj.nextInt(); // Read user input
        System.out.println("PIN #" + pin);
        break;
      case 9:
        System.out.println("Enter your Card Status (true or false): ");
        boolean status = myObj.nextBoolean(); // Read user input
        System.out.println("CARD STATUS :" + status);
        break;
      case 10:
        System.out.println("**Card Info**");
        System.out.println("Pin Info: " + obj.getPin());
        System.out.println("Status Info: " + obj.getStatus());
        System.out.println("CARD BALANCE: " + obj.getBalance());
        System.out.println("CARD NUMBER :" + obj.getCardNumber());
        break;
      case 11:
        System.exit(0);
        System.out.println("Exit System Safely !!!");
        break;
      default:
        System.out.println("Invalid options!!!");
      }
    }

  }
}
