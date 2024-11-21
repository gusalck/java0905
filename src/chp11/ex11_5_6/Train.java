package chp11.ex11_5_6;

public class Train implements Vehicle {
    @Override
    public void horn() {
        System.out.println("🚝 칙칙폭폭 🚝");
    }

    @Override
    public void move(String from, String to) {
        System.out.printf("%s에서 %s(으)로 이동합니다.\n", from, to);
    }
}
