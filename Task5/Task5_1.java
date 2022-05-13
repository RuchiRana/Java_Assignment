package Task5;

import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 words : ");
        String words[] = new String[5];

        for(int i = 0 ; i< words.length ; i++) {
            words[i] = sc.next();
        }
        int length = words[0].length();
        String word = "";

        for(int i = 0 ; i< words.length ; i++) {
            if(words[i].length() < length){
                length = words[i].length();
                word = words[i];
            }
        }
        System.out.println("length of the shortest word: " + length);
        System.out.println("Shortest Word: " + word);
    }
}
