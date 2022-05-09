package Task3;

import java.util.Scanner;

public class Task3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();
        System.out.println("All natural numbers till " + n);
        int sum = 0;
        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println("\nSum of " + n + "natural numbers: " + sum);
    }
}