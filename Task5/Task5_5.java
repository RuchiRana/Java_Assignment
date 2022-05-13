package Task5;

import java.util.Scanner;

public class Task5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 numbers : ");
        int numbers[] = new int[5];
        Boolean boo;
        int output = 0;

        for(int i = 0 ; i<  numbers.length ; i++) {
            numbers[i] = sc.nextInt();
        }

        if(numbers[0] %2 == 0 && numbers[numbers.length-1] %2 == 0 ||
                numbers[1] %2 == 0 && numbers[numbers.length-2] %2 == 0){
            boo = true;
        } else boo = false;

        if(boo){
            System.out.println("String is even.");
            for(int i = 0 ; i< numbers.length ; i++) {
                if(numbers[i] %2 != 0)  output = numbers[i];
            }
            System.out.print("Output for this case => " + output);
        }
        else{
            System.out.println("String is odd.");
            for(int i = 0 ; i< numbers.length ; i++) {
                if(numbers[i] %2 == 0)  output = numbers[i];
            }
            System.out.print("Output for this case => " + output);
        }
    }
}