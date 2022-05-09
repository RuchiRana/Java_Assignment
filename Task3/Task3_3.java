package Task3;

import java.time.Month;
import java.util.Scanner;

public class Task3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month as a number: ");
        int number = sc.nextInt();

        if(number < 1 || number > 12){
            System.out.print("Invalid Details");
        } else {
            System.out.print("Number of days of a particular month: " + Month.of(number).length(false));
        }
    }
}