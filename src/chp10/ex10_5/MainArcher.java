package chp10.ex10_5;

public class MainArcher {
    public static void main(String[] args) {
        Archer a1 = new Archer();
        MasterArcher ma = new MasterArcher();
        Archer a2 = new MasterArcher();
        Archer a3 = (Archer) new MasterArcher();


        a1.shoot(); // Archer의 shoot() 을 호출
        ma.shoot(); // MasterArcher의 shoot() 을 호출
        a2.shoot(); // MasterArcher의 shoot() 을 호출
        a3.shoot(); // MasterArcher의 shoot() 을 호출

    }
}
