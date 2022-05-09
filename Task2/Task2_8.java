package Task2;

import java.util.Scanner;

public class Task2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your a character: ");
        char c1 = sc.next().charAt(0);

       if (Character.toLowerCase(c1) == 'r' || Character.toLowerCase(c1) == 'a'||
               Character.toLowerCase(c1) == 'n' || Character.toLowerCase(c1) == 'd' ||
               Character.toLowerCase(c1) == 'o' || Character.toLowerCase(c1) == 'm') {
           System.out.print("FOUND");
       }
       else {
           System.out.print("NOT FOUND");
       }
    }
}