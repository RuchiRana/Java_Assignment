package Task3;

import java.util.Scanner;

public class Task3_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter floating-point number 1: ");
        float number1 = sc.nextFloat();
        System.out.print("Enter floating-point number 2: ");
        float number2 = sc.nextFloat();

        if (Math.abs(number1 - number2) < 0.00999999) {
            System.out.println("These numbers are the same.");
        }
    }
}