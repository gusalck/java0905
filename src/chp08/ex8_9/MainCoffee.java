package chp08.ex8_9;

public class MainCoffee {
    public static void main(String[] args) {
        Coffee c = new Coffee("아메리카노",3000);
        System.out.printf("%s(%d)원 -> ",c.getName(),c.getPrice());
        // 기존커피가격에서 500원 인상된 값을 설정
        c.setPrice(c.getPrice() + 500);
        System.out.printf("%s(%d)원 ",c.getName(),c.getPrice());
    }
}
