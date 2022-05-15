package Task7;

import java.util.*;
public class Task7_12 {
    int find_subarray(int numbers[], int given_num, int sub_array[])
    {
        int curr_sum = numbers[0], start = 0, count = 0;

        for (int i = 1; i <= numbers.length; i++) {
            while (curr_sum > given_num && start < i - 1) {
                curr_sum = curr_sum - numbers[start];
                start++;
            }

            if (curr_sum == given_num) {
                sub_array = Arrays.copyOfRange(numbers, start, i);
                System.out.println(Arrays.toString(sub_array));
                return 1;
            }

            if (i < numbers.length)
                curr_sum = curr_sum + numbers[i];
        }

        System.out.println("Subarray is not available.");
        return 0;
    }
    public static void main(String[] args)
    {
        Task7_12 arraysum = new Task7_12();
        int numbers[] = { 2, 6, 0, 9, 7, 3, 1, 4, 1, 10 };
        int given_num = 15;
        int sub_array[] = new int[10];
        arraysum.find_subarray(numbers, given_num, sub_array);
    }
}