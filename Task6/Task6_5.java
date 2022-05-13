package Task6;

public class Task6_5 {
    public static void main(String[] args) {
        AddAmount a1 = new AddAmount();
        a1.AddAmount();
        a1.AddAmount(10);
        a1.AddAmount();
        a1.AddAmount(50);
        a1.AddAmount(100);
        a1.Calculate();

        System.out.println("Final amount : " + a1.amount);
        System.out.println("No. of transactions are done: " + a1.transactions);
    }
}
