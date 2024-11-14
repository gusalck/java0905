package chp11.ex11_4;

public class Helicopter implements Flyable{
    @Override
    public void fly() {
        System.out.println("헬리콥터가 매우 시끄러운 소리로 이동한다.");
    }
}
