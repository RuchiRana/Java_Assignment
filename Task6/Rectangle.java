package Task6;

public class Rectangle {
    int length = 0, breadth = 0;
    public Rectangle(){
        this.length = 0;
        this.breadth = 0;
    }
    public Rectangle(int num1, int num2){
        this.length = num1;
        this.breadth = num2;
    }
    public Rectangle(int num1){
        this.length = num1;
        this.breadth = num1;
    }
    public int area(){
        int cal = length * breadth;
        return cal;
    }
}

