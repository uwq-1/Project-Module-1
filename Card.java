/*
  Student Name : Garson Hutchinson
  Student ID # : 2101012660
  Due Date : February 21, 2024

*/


package creditsolution;
public class Card {
    // Variables
    private int cardNumber = 140;
    private double balance = 2000;
    private int pin = 0;
    private boolean status = true;


    // Constructor
    public Card(){

    }

    public Card(int cardNumber, double balance,  int pin, boolean status) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.pin = pin;
        this.status = status;

    }

    // copy constructor
    /*public Card(Card material){
        cardNumber = material.cardNumber;
        balance = material.balance;
        pin = material.pin;
        status = material.status;
    }*/



    // Getters
    public int getCardNumber() {
        return cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public  int getPin() {
        return pin;
    }

    public boolean getStatus() {
        return status;
    }


    // Setters
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }



    @Override
    public String toString() {
        return "Card{" +
                "cardNumber=" + cardNumber +
                ", balance=" + balance +
                ", pin=" + pin +
                ", status=" + status +
                '}';
    }

    public void Display(){
        System.out.println("Card Number:  " + cardNumber);
        System.out.println("Card Balance: " + balance);
        System.out.println("Card Pin: " + pin);
        System.out.println("Status: " + status);
    }

}
