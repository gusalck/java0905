package chp07.chp07prac;

public class Square {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getArea() {
//        return length*length;
        int result = (int)Math.pow(length, 2);
        return result;
    }
}
