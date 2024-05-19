
public class TriangleAreaCalculator {
    private double base;
    private double height;
    private Calculator calculator;

    public TriangleAreaCalculator(double base, double height) {
        this.base = base;
        this.height = height;
        this.calculator = new Calculator();
    }

    public double getArea() {
        Rectangle equivalentRectangle = new Rectangle(this.base, this.height / 2.0);
        return calculator.getArea(equivalentRectangle);
    }
}
