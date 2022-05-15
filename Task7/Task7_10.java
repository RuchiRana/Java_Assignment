package Task7;

public class Task7_10 {
        private static void swap(char[] c1, int i, int j)
        {
            char temp = c1[i];
            c1[i] = c1[j];
            c1[j] = temp;
        }
        private static void permutations(char[] c1, int count)
        {
            if (count == c1.length - 1) {
                System.out.println(String.valueOf(c1));
            }

            for (int i = count; i < c1.length; i++)
            {
                swap(c1, count, i);
                permutations(c1, count + 1);
                swap(c1, count, i);
            }
        }
        public static void Permutations1(String str) {
            if (str == null || str.length() == 0) {
                return;
            }
            permutations(str.toCharArray(), 0);
        }
        public static void main(String[] args)
        {
            String str = "ABC";
            System.out.println("Possible combinations (using recursion): ");
            Permutations1(str);
        }
}