package chp07.ex12;

public class MainCube {
    public static void main(String[] args) {
        Cube c = new Cube();

        c.setLength(5);

        System.out.printf("한 변의 길이가 %d 인\n 정육면체의 부피 : %.2f\n " +
                "정육면체의 겉넓이 : %.2f",c.getLength(),c.getArea(),c.getPerimeter());
    }
}
