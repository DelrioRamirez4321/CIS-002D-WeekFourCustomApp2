package edu.whccd.dramirez;

import java.util.Scanner;



/*
This program is to be able to have a for loop and a while loop to count up and down of a number that is inputed by user
By: Delrio Ramirez
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Whole Number: ");
        int limit = sc.nextInt();

        System.out.println("Increasing even numbers using for Loop");
        for (int i = 1; i <= limit; i++) {
            if (limit < 20 || limit > 50) {
                System.out.println("invalid Input");
                System.exit(0);
            } else if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.print("\n");
        System.out.print("Decreasing odd Numbers using while Loop");
        int currentNumber =limit;
        while(currentNumber > 0){
            currentNumber--;
            if (currentNumber % 2 == 1){
                System.out.println(currentNumber);
            }
        }
    }
}
