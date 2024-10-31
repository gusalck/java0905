package chp10.ex10_6;

public class Triangle extends Shape{
    private int width;
    private int height;
    public double area(){
        double result = (width * height) / 2.0;
        return result;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
