package Task5;

import java.util.*;

public class Task5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 numbers : ");
        int numbers[] = new int[10], temp[] = new int[100];
        int k = 0;

        for(int i = 0 ; i< numbers.length ; i++) {
            numbers[i] = sc.nextInt();
        }

        for(int i = 0 ; i< numbers.length ; i++) {
            for(int j = i+1 ; j< numbers.length ; j++) {
                temp[k++] = numbers[i] + numbers[j];
            }
        }
        int[] sum = new int[k];
        for(int i = 0 ; i< k ; i++) {
            sum[i] = temp[i];
        }
        Arrays.sort(sum);

        for(int i = 1 ; i< sum.length-1 ; i++) {
            System.out.print(sum[i] + " ");
        }
    }
}
