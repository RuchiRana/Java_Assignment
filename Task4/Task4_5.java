package Task4;

import java.util.*;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 elements of array as a  number: ");
        int numbers[] = new int[5];

        for (int i = 0; i < 5 ; i++)
            numbers[i] = sc.nextInt();

        int[] result = new int[numbers.length];
        int j = 0, count_zero = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] != 0){
                result[j] = numbers[i];
                j++;
            }
            else count_zero++;
        }

        for (int i = numbers.length; i > 0; i--){
            if(count_zero != 0) {
                result[i-1] = 0; count_zero--;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}