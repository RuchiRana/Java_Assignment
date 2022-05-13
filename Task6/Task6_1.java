package Task6;

import java.util.Scanner;

public class Task6_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first complex num: ");
        String c_num1_real = sc.next();
        String[] C1 = c_num1_real.split("[\\Q+-\\Ei]");

        System.out.print("Enter second complex num: ");
        String c_num2_real = sc.next();
        String[] C2 = c_num2_real.split("[\\Q+-\\Ei]");

        Complex C_num1 = new Complex(Integer.parseInt(C1[0]), Integer.parseInt(C1[1]));
        Complex C_num2 = new Complex(Integer.parseInt(C2[0]), Integer.parseInt(C2[1]));

        C_num1.sum(C_num2);
        C_num1.difference(C_num2);
        C_num1.product(C_num2);
    }
}
