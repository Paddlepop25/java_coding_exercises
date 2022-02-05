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
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
    public void add(ComplexNumber compxNum) {
//        this.real += compxNum.real;
//        this.imaginary += compxNum.imaginary;
        add(compxNum.real, compxNum.imaginary);
    }
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(ComplexNumber compxNum) {
//        this.real -= compxNum.real;
//        this.imaginary -= compxNum.imaginary;
        subtract(compxNum.real, compxNum.imaginary);
    }
}
