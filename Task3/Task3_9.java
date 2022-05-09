package Task3;

import java.util.Scanner;

public class Task3_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int number = sc.nextInt();

        System.out.println("Expected Output :");

        for (int i = 1 ; i <= number ; i++){
           for ( int j = 1; j <= i; j++){
               System.out.print(j);
           }
           System.out.println();
        }
    }
}