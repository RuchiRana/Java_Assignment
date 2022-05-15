package Task7;

import java.util.*;

public class Task7_7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        Boolean boo = false;

        char[] c = new char[500];
        char[] c1 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            c[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < c1.length; j++) {
                if (c1[j] == str.charAt(i)){
                    boo = false;
                    break;
                }
                else {
                    boo = true;
                }
            }
            if (boo) {
                c1[i] = str.charAt(i);
                System.out.println(str.charAt(i) + ": " + (int) c[str.charAt(i)]);
            }
        }
    }
}