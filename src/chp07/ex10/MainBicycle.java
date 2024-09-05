package chp07.ex10;

public class MainBicycle {

    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();

        b1.setName("로드형 자전거");
        b1.setWeight(7.25);
        b1.setPrice(326000);

        System.out.printf("b1 => 이름 : %s ,무게 : %s, 가격 : %d",b1.getName(),b1.getWeight(),b1.getPrice());
    }
}
