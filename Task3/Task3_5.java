package Task3;

import java.util.Scanner;

public class Task3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number(long-type): ");
        long number = sc.nextLong();

        int sum = 0, count = 0;
        while (number != 0) {
            System.out.print(number%10+ " fdfdfdfdf");
            sum += number % 10;
            count++;
            number /= 10;
        }
        System.out.println("\nNumber of digits: " + count + "\nSum of all digits: " + sum);
    }
}