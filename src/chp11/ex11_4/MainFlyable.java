package chp11.ex11_4;

import java.util.ArrayList;

public class MainFlyable {
    public static void main(String[] args) {
        Bird bd = new Bird();
        Helicopter hc = new Helicopter();
        Rocket rc = new Rocket();
//        배열의 각 객체의 참조값을 저장한다.
        Flyable[] flyables = {bd,hc,rc};

        for (Flyable flyable : flyables) {
            flyable.fly();
        }
        System.out.println("\n--------------------------------------------\n");
        ArrayList<Flyable> flyablelist = new ArrayList<Flyable>();
        flyablelist.add(rc);
        flyablelist.add(bd);
        flyablelist.add(hc);


        for (Flyable flyable : flyablelist) {
            flyable.fly();
        }
    }
}
