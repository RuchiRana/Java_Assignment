package Task3;

import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your a number: ");
        int num = sc.nextInt();

        int result = 0;
        System.out.println();
        for(int i = 1; i <= 10 ; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}