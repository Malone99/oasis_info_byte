package com.fmc.oasisnifobyteTask2;



import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        System.out.println("Hi please there");
        System.out.println("What is your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hi there " + name);

        System.out.println("Do you want to play our Guessing Game");
        System.out.println("Press Y for yes and N for no");
        String answer = scanner.next();
        String answer2="";

        if (answer.equalsIgnoreCase("N")) {
            System.out.println("Exiting ......Bye Bye");
        } else
            if (!answer.equalsIgnoreCase("Y") || !answer.equalsIgnoreCase("N")) {
                System.out.println("In valid entry***");
                System.out.println("Press Y for yes and N for no");
              answer2=scanner.next();
        }
        System.out.println("Here are the instructions :");
        System.out.println("==============================");
        System.out.println("You have 3 chances to guess the correct number");
        System.out.println("Ti");

        int score=0;
        for (int i=0; i<3; i++){
            int guessnum=GenerateRandom.random(10);
            System.out.println(guessnum);
           int numEntered = scanner.nextInt();
            if(guessnum==numEntered){
                score+=3;
                System.out.println("well done you get 3 points");
            }else
            if(guessnum!=numEntered){
                System.out.println("wrong guess \n try Again ");
            }
        }
        System.out.println("thank you for playing: "+score);
    }

}
