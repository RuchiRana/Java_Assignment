package Task6;

public class Complex {
    int real = 0, imaginary = 0;
    Complex(int Real_1, int Imaginary_1){
        this.real = Real_1;
        this.imaginary = Imaginary_1;
    }
    public void sum(Complex second ){
        int sum_real = this.real + second.real;
        int sum_imaginary = this.imaginary + second.imaginary;
         System.out.println("Sum: " + sum_real + "+" + sum_imaginary + "i");
    }
    public void difference(Complex second ){
        int dif_real = this.real - second.real;
        int dif_imaginary = this.imaginary - second.imaginary;

        System.out.println("Difference: " + dif_real + "+" + dif_imaginary + "i");
    }
    public void product(Complex second ){
        int mul_real = this.real * second.real;
        int mul_imaginary = this.imaginary * second.imaginary;

        System.out.println("Product: " + mul_real + "+" + mul_imaginary + "i");
    }
}

