public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    
    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
        System.out.println("The sum is: " + this.real + " + " + this.imaginary + "i");

    }
    
    public void add(ComplexNumber complexNumber){
        this.real += complexNumber.real;
        this.imaginary += complexNumber.imaginary;
        System.out.println("The sum is: " + this.real + " + " + this.imaginary + "i");
    }

    public void subtract(double real, double imaginary){
        //make sure to fix whatever is causing incorrect subtractions
        this.real -= real;
        this.imaginary -= imaginary;
        System.out.println("The difference is: " + this.real + " + " + this.imaginary + "i");

    }
    
    public void subtract(ComplexNumber complexNumber){
        this.real -= complexNumber.real;
        this.imaginary -= complexNumber.imaginary;
        System.out.println("The difference is: " + this.real + " + " + this.imaginary + "i");

    }
    
}
