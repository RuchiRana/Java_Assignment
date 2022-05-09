package Task1;

public class Task1_1 {
    public static void main(String[] args) {
        System.out.println("Using the third variable.");
        int a = 10, b = 20, result = 0;
        System.out.println("Value of a is " + a + " and b is " + b);

        result = b;  b = a;  a = result;

        System.out.println("After swapping value of a is " + a + " and b is " + b);

        System.out.println("\nWithout using the third variable.");
        int a1 = 10, b1 = 20;
        System.out.println("Value of a1 is " + a1 + " and b1 is " + b1);

        a1 = a1 + b1;  b1 = a1 - b1;  a1 = a1 - b1;

        System.out.println("After swapping value of a1 is " + a1 + " and b1 is " + b1);
    }
}