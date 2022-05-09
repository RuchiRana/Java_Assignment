package Task3;

import java.util.Scanner;

public class Task3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int number = sc.nextInt();
        int c = 1 ;
        System.out.println("Expected Output :");

        for (int i = 0 ; i < number ; i++){
           for ( int j = 1; j <= number - i ; j++){
               System.out.print(" ");
           }
           for(int k = 0; k <= i; k++)
           {
               if (k == 0|| i == 0) {
                   c = 1;
               } else {
                   c = c * (i - k + 1) / k;
               }
                    System.out.print(" " + c);
                }
                System.out.print("\n");
        }
    }
}