package Task1;

import java.util.*;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number1 between 1 - 10 : ");
        int num1 = sc.nextInt();
        if(10 < num1 || 1 > num1) {
            System.out.println("Number is not between 1 - 10.");
            System.exit(0);
        }
        System.out.print("Enter a number2 between 1 - 10 : ");
        int num2 = sc.nextInt();
        if(10 < num2 || 1 > num2) {
            System.out.println("Number is not between 1 - 10.");
            System.exit(0);
        }
        int z = num1 + num2;
        int results =  z + 30;

        System.out.print("Sum of 2 numbers are " + results);
    }
}