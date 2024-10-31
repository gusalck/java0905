package chp10.ex10_6;

public class Circle extends Shape{
    private int r;

    @Override
    public double area() {
        double result = Math.PI * r * r;
        return result;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
