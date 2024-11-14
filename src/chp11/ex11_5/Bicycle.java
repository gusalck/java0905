package chp11.ex11_5;

public class Bicycle implements Vehicle {
    @Override
    public void horn() {
        System.out.println("🚲 따르릉 따르릉 🚲");
    }

// 인터페이스에 정의된 static 메소드 stop()은 오버라이딩할 수 없다.
// 인터페이스의 static 오버라이딩 할 수는 없지만 현재 클래스에서 정의는 할 수 있다.
// 사용할 때는 Bicycle.stop()
    static public void stop(String place){
        System.out.println(place + "에서 자전거가 멈춘다.");
    }
}
