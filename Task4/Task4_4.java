package Task4;

public class Task4_4 {
    public static void main(String[] args) {
        int matrix1[][] = {{1,1,1}, {2,2,2}, {3,3,3}};
        int matrix2[][] = {{6,6,6}, {7,7,7}, {8,8,8}};
        int result[][] = new int[matrix1.length][matrix1.length];

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3 ; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}