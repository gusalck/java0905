package chp11.ex11_5;

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Bicycle();
        v1.horn();
        v1.move("보광동","이태원");

        Bicycle v2 = new Bicycle();
        v2.horn();
        v2.move("한강진역","이태원");// Vehicle의 default메소드가 호출
        Bicycle.stop("맥심프랜트");

        Vehicle v3 = new Train();
        v3.horn();
        v3.move("서울","대전");//Train의 오버라이딩된 메소드 호출

        Vehicle.stop("강릉");

    }
}
