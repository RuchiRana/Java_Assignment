package Task2;

import java.util.Scanner;

public class Task2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your an integer number: ");
        int number = sc.nextInt();

        if( number % 2 != 0){
            System.out.print("NEW");
        } else if ( 2 < number &&  5 > number)  {
            System.out.print("OLD");
        } else if ( 6 < number &&  30 > number)  {
            System.out.print("NEW");
        }else if ( 30 < number)  {
            System.out.print("OLD");
        }
    }
}