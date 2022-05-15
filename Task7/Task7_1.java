package Task7;

import java.util.*;

public class Task7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Stack<Character> st = new Stack<Character>();
        char[] c = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            c[i] = st.pop();
        }
        System.out.println(String.valueOf(c));
    }
}
