package chp07.ex11;

public class Cylinder {
    int radius;
    double height;

    public double getVolume(){
        return radius * radius * Math.PI * height;
    }

    public double getSurfaceArea(){
        double circleArea = Math.PI * radius * radius;
        double rectangleArea = height * 2 * Math.PI *  radius;
        return 2 * circleArea + rectangleArea;
    }
}
