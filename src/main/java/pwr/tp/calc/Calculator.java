package pwr.tp.calc;

public class Calculator {
    double sum;

    public Calculator(double firstVal, double secondVal) {
        this.sum = firstVal + secondVal;
    }
    public String getAnswer() {
        return String.valueOf(this.sum);
    }
}
