package Task4;

public class Task4_9 {
    public static void main(String[] args) {
        int[] numbers = {1,2,4,5,6};

        for(int i = 0 ; i<numbers.length ; i++){
            for(  int j = i+1; j< numbers.length ; j++){
                if(numbers[i] + numbers[j] == 6){
                    System.out.print("Sum of these two elements: "+ numbers[i] + "  " +numbers[j]);
                }
            }
            System.out.println();
        }
    }
}