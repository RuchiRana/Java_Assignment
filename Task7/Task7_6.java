package Task7;

import java.util.Scanner;

public class Task7_6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String str = sc.nextLine();
        double[] num = new double[10];
        int sum=0;

        for (int i = 0; i < str.length(); i++){
            int c = Character.getNumericValue(str.charAt(i));
            num[i] = Math.pow(c,str.length());
        }
        for (int i = 0; i < num.length; i++){
            sum += num[i];
        }
        if(sum == Integer.parseInt(str))
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}