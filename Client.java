/*
  Student Name : Garson Hutchinson
  Student ID # : 2101012660
  Due Date : February 21, 2024

*/


package creditsolution;
public class Client
    extends Card { // inheritance implemented here using the "extend" keyword

  // Attributes (Variables) of the class
  private int idNumber;
  private String firstName;
  private String lastName;
  private int age;
  private Card card;

  // Default Constructor
  public Client() {}

  // Primary Constructor
  public Client(int idNumber, String firstName, String lastName, int age) {
    super();
    this.idNumber = idNumber;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;

  }

  // copy constructor
  /*public Client(Client cn){
      idNumber = cn.idNumber;
      firstName = cn.firstName;
      lastName = cn.lastName;
      age = cn.age;

  }*/


  // Getters
  public int getIdNumber() { return idNumber; }

  // Setters
  public void setIdNumber(int idNumber) { this.idNumber = idNumber; }

  // Getters
  public String getFirstName() { return firstName; }

  // Setters
  public void setFirstName(String firstName) { this.firstName = firstName; }

  // Getters
  public String getLastName() { return lastName; }

  // Setters
  public void setLastName(String lastName) { this.lastName = lastName; }

  // Getters
  public int getAge() { return age; }

  // Setters
  public void setAge(int age) { this.age = age; }

  public void setCard(Card card) { this.card = card; }

  public Card getCard() { return card; }




  @Override
  public String toString() {
    return super.toString() + "Client{"
        + "idNumber=" + idNumber + ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' + ", age=" + age + '}';
  }

  public void Display() {

    System.out.println("Card INFO: ");
    super.Display();
    System.out.println("Client IdNumber:  " + idNumber);
    System.out.println("Client FirstName: " + firstName);
    System.out.println("Client LastName:  " + lastName);
    System.out.println("Client age: " + age);
    //System.out.println("Card INFO: " + card);

    // System.out.println("");
  }
}
