package Task3;

import java.util.Scanner;

public class Task3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if ( number1 < number2 && number2 < number3){
            System.out.print("INCREASING");
        } else if (number1 > number2 && number2 > number3) {
            System.out.print("DECREASING");
        }else {
            System.out.print("Neither increasing nor decreasing order");
        }
    }
}