package Task7;

import java.util.Scanner;

public class Task7_8 {
    static void permutation(String s , String answer)
    {
        if (s.length() == 0)
        {
            System.out.print(answer + "  ");
            return;
        }

        for(int i = 0 ;i < s.length(); i++)
        {
            char ch = s.charAt(i);
            String str1 = s.substring(0, i);
            String str2 = s.substring(i + 1);
            String str3 = str1 + str2;
            permutation(str3, answer + ch);
        }
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String answer="";
        System.out.print("Enter the string : ");
        String s = scan.next();
        System.out.print("All permutations of the String : ");
        permutation(s, answer);
    }
}