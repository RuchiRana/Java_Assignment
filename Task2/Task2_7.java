package Task2;

import java.util.*;

public class Task2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your a floating-point number: ");
        double number = sc.nextDouble();

        if ( number != 0) {
            if (number > 0) {
                if (number < 1) {
                    System.out.print("positive small");
                } else if (number > 1000000) {
                    System.out.print("positive large");
                } else {
                    System.out.print("positive");
                }
            } else {
                if (Math.abs(number) < 1) {
                    System.out.print("negative small");
                } else if (Math.abs(number) > 1000000) {
                    System.out.print("negative large");
                } else {
                    System.out.print("negative");
                }
            }
        } else {
                System.out.print("zero");
            }
    }
}