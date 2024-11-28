package chp12.ex12_7;

public class MainThrows {
    public static void main(String[] args) {
        ThrowsTest t = new ThrowsTest();
        try {
            t.test1();
        } catch (MyAgeException2 e) {
            System.out.println(e.getMessage());
        }
    }
}
