package Task5;

import java.util.Scanner;

public class Task5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = " ";
        Boolean boo = true;

        System.out.print("Enter a word: ");
        str = sc.nextLine();

        for(int i = 0 ; i< str.length() ; i++) {
            for(int j = i+1 ; j< str.length() ; j++) {
                if(str.charAt(i) == str.charAt(j)) boo = false;
            }
        }
        System.out.print("isogram: " + boo);
    }
}