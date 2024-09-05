package chp07.ex11;

public class MainCylinder {

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.radius = 4;
        c1.height = 5;

        System.out.printf("원기둥의 부피 : %.2f\n", c1.getVolume());
        System.out.printf("원기둥의 겉넓이 : %.2f\n", c1.getSurfaceArea());
    }
}
