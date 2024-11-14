package chp11.ex11_1_2_3;

public interface Phone {
//    인터페이스는 상수, 추상메소드, defalut, static 메소드 등을 사용할 수 있다.
//    인터페이스에서는 static,final 생략가능
    String PRODUCT_NAME = "APPLE";
    public abstract void callPhone(String phoneNumber);

//    추상메소드는 public abstract를 생략 가능
    void receivePhone(String phoneNumber);
}
