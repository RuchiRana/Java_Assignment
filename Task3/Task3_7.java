package Task3;

import java.time.*;
import java.util.Scanner;

public class Task3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a month number: ");
        int month = sc.nextInt();

        System.out.print("Input a year: ");
        int year = sc.nextInt();

        YearMonth yearMonthObject = YearMonth.of(year, month);
        int days = yearMonthObject.lengthOfMonth();

        System.out.println(Month.of(month) + " " + year + " has " + days + " days");
    }
}