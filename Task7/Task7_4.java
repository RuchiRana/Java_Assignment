package Task7;

import java.util.*;

public class Task7_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int index = 0;
        char[] c = new char[500];

        for (int i = 0; i < str.length(); i++){
            c[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if(c[str.charAt(i)] > 1) {
                index++;
                break;
            }
        }
        if(index == 0)
            System.out.println("String has all Unique Characters");
    }
}