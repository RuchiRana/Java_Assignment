package Task6;

public class Task6_4 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2,4);
        Rectangle r3 = new Rectangle(2);

        System.out.println("Having no parameter: " + r1.area());
        System.out.println("Having two numbers as parameters: " + r2.area());
        System.out.println("Having one number as a parameter: " + r3.area());
    }
}
