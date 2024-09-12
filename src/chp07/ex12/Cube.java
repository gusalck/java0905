package chp07.ex12;

public class Cube {
    int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getArea(){
        return length*length*length;
    }
    public double getPerimeter(){
        return 6*length*length;
    }
}
