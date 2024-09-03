package com.B_02_Project;
import java.util.Random;
import java.util.Scanner;

class Game{

    public int number ;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random random=new Random();
       this.number= random.nextInt(100);
    }
    void takeUserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess the number :");
        inputNumber=sc.nextInt();

    }
    boolean isCorrectNumber(){

        noOfGuesses++;
        if(inputNumber==number){
            System.out.format("Yes you guess it right, it was %d/n you guess it in %d attempts ", number,noOfGuesses);
        }
        else if(inputNumber>number){
            System.out.println("Too High...");

        }
        else if (inputNumber < number){
            System.out.println("Too Low...");
        }
        return false;
    }
}

public class B_02_Game_Guess_The_Number {
    public static void main(String[] args) {
        /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:

            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */

        Game game=new Game();
        boolean b=false;
        while(!b){
            game.takeUserInput();
            b=game.isCorrectNumber();

        }

    }

}
