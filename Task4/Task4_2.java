package Task4;

import java.util.*;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 elements of array as a  number: ");
        int numbers[] = new int[5];

        for (int i = 0; i < 5 ; i++)
            numbers[i] = sc.nextInt();

        int[] result = new int[numbers.length];
        int j = 0;
        for (int i = 0; i < numbers.length-1; i++){
            if (numbers[i] != numbers[i+1]){
                result[j] = numbers[i];
                j++;
            }
        }
        result[j++] = numbers[numbers.length-1];
        for (int i=0; i<j; i++){
            numbers[i] = result[i];
        }
        Arrays.sort(numbers);
        System.out.println("Second largest number: " + numbers[numbers.length-2]);
    }
}