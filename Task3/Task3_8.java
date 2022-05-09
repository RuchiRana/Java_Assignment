package Task3;

import java.util.Scanner;

public class Task3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = sc.nextInt();
        if ( year % 4 == 0){
            System.out.print(year + " is a leap year");
        }
        else{
            System.out.print(year + " is not a leap year");
        }
    }
}