package chp10.ex10_1;

public class RPGTest {
    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        wizard.name = "간달프";
        wizard.hp = 100;
        wizard.mp = 80;
        wizard.punch();
        wizard.fireball();

        Knight k1 = new Knight();
        k1.name = "아라곤";
        k1.hp = 150;
        k1.stamina = 70;
        k1.punch();
        k1.slash();
    }
}
