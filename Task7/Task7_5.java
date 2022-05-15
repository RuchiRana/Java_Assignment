package Task7;

import java.util.Scanner;

public class Task7_5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] new_str = str.split("\\s+");

        System.out.println("number of words in the String: " + new_str.length);
    }
}