package chp07.chp07prac;

public class MainSquare {

    public static void main(String[] args) {

        Square s = new Square();
        s.setLength(10);

        Square s2 = new Square();
        s2.setLength(7);

        System.out.printf("한변의 길이가 %d㎝인 정사각형의 넓이 : %d㎠\n",s.getLength(),s.getArea());
        System.out.printf("한변의 길이가 %d㎝인 정사각형의 넓이 : %d㎠\n",s2.getLength(),s2.getArea());
    }
}
