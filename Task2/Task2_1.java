package Task2;

import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if(num % 3 == 0 && num % 5 ==0){
            System.out.println("Consultadd JAVA Training");
        } else if(num % 5 == 0){
            System.out.println("JAVA Training");
        } else if(num % 3 == 0){
            System.out.println("Consultadd");
        }
        else{
            System.out.println("Number is neither divided by 3 nor 5.");
        }
    }
}