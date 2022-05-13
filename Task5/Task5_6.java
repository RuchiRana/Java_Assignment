package Task5;

import java.util.Scanner;

public class Task5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] c = str.toCharArray();

        for(int i = 0 ; i < c.length ; i++) {
             if(c[i] != ' ') {
                 if (Character.isUpperCase(c[i])) {
                     c[i] = Character.toLowerCase(c[i]);
                 } else {
                     c[i] = Character.toUpperCase(c[i]);
                 }
             }
        }

        str = new String(c);
        System.out.print("Output : " + str);
    }
}