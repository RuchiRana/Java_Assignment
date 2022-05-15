package Task7;

import java.util.*;

public class Task7_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] first = {1,4,3,2,5,8,9};
        int[] second = {6,3,2,7,5};
        int[] result = new int[100];

        int c = 0;

        for (int i = 0; i < first.length; i++){
            for (int j = 0; j < second.length; j++){
                if(first[i] == second[j]){
                    result[c++] = first[i];
                }
            }
        }
        System.out.print("Intersection of two arrays: ");
        for (int i = 0; i < c; i++)
            System.out.print(result[i] + " ");
    }
}