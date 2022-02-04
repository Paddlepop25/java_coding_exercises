public class SimpleCalculator {
    // state or fields of class
    private double firstNumberX;
    private double secondNumberX;

    public void setFirstNumber(double num1) {
        this.firstNumberX = num1;
    }

    public void setSecondNumber(double num2) {
        this.secondNumberX = num2;
    }
    public double getFirstNumber() {
        return this.firstNumberX;
    }

    public double getSecondNumber() {
        return this.secondNumberX;
    }

    public double getAdditionResult() {
        return firstNumberX + secondNumberX;
    }

    public double getSubtractionResult() {
        return firstNumberX -  secondNumberX;
    }

    public double getMultiplicationResult() {
        return firstNumberX * secondNumberX;
    }

    public double getDivisionResult() {
        if (secondNumberX == 0) {
            return 0;
        }
        return firstNumberX / secondNumberX;
    }
}
