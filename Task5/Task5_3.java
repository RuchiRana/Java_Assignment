package Task5;

import java.util.*;

public class Task5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String with_paces = " ", without_spaces =" ";

        System.out.print("Enter a string with spaces : ");
        with_paces = sc.nextLine();

        without_spaces = with_paces.replaceAll("\\s", "");

        System.out.print(without_spaces);
    }
}
