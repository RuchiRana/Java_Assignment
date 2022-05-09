package Task3;

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;

        for (int i = 0; i < 10 ; i++){
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            result = result + num;
        }
        System.out.println("\nSum of all numbers: " + result);
        System.out.println("Average of all numbers: " + result/10);
    }
}