package Task4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task4_11 {
    public static void main(String[] args) {
        int[] numbers = {10, 0, -6, -599, 100, 200, -80, 55};
        int result[] = new int[numbers.length];

        Arrays.sort(numbers);
        System.out.print("After sorting: ");
        System.out.println(Arrays.toString(numbers));

        int max = 0, min = 1;

        for(int i = numbers.length-1 ; i>=0 ; i--) {
            if (max < numbers.length) {
                result[max] = numbers[i];
                max = max + 2;
            }
        }
            for(int i = 0 ; i<numbers.length ; i++){
                if(min < numbers.length){
                    result[min] = numbers[i];
                    min = min + 2;
                }
        }
        System.out.println("Final output: " + Arrays.toString(result));
    }
}