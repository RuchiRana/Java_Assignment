package Task7;

import java.util.*;

public class Task7_9 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 elements of array as a  number: ");
        int numbers[] = new int[5];

        for (int i = 0; i < 5 ; i++)
            numbers[i] = sc.nextInt();
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max)
                max = numbers[i];
        }
        System.out.println("Max: " + max);
    }
}