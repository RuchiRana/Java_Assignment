package Task4;

public class Task4_10 {
    public static void main(String[] args) {
        int[] numbers = {30, 60, -1, 50, -2};
        int result = 0, element1 = 0, element2 = 0;

        for(int i = 0 ; i<numbers.length ; i++){
            for(  int j = i+1; j< numbers.length ; j++){
                int temp = 0;
                if(i==0 && j==1){
                    result = Math.abs(numbers[i] + numbers[j]);
                    element1 = numbers[i];
                    element2 = numbers[j];
                }
                else{
                    temp = Math.abs(numbers[i] + numbers[j]);
                    if(temp < result){
                        result = temp;
                        element1 = numbers[i];
                        element2 = numbers[j];
                    }
                }
            }
        }
        System.out.println("Elements: " + element1 + " " + element2);
        System.out.println("Sum: " + result);
    }
}