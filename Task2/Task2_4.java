package Task2;

import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            if (num > 0) {
                System.out.println("Good Going");
            } else {
                System.out.println("It’s Over");
                break;
            }
        }
    }
}