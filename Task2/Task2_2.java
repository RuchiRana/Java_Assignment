package Task2;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        System.out.println("Enter 1 - Addition \nEnter 2 - Subtraction " +
                "\nEnter 3 - Division \nEnter 4 - Multiplication \nEnter 5 - Average");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your option no.: ");
        int option = sc.nextInt();

        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        int result = 0; float result1 = 0;
        if( option == 1 ) {
            result = first + second;
            System.out.println("Addition of given numbers: " + result);
        } else if (option == 2 ) {
                result = first - second;
                System.out.println("Subtraction of given numbers: " + result);
        } else if (option == 3) {
            float res =0;
            res = first / (float) second;
            System.out.println("Division of given numbers: " + res);
        } else if (option == 4) {
            result = first * second;
            System.out.println("Multiplication of given numbers: " + result);
        } else if (option == 5) {
            System.out.print("Enter first number: ");
            float first1 = sc.nextInt();
            System.out.print("Enter second number: ");
            float second2 = sc.nextInt();
            result1 = ((float)first + (float)second + first1 + second2) / 4;
            System.out.println("Average of given numbers: " + result1);
        }
        if ( result < 0 || result1 < 0){
            System.out.println("Oops option " + option + " is returning the negative number");
        }
    }
}