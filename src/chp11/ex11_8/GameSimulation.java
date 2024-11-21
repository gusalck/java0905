package chp11.ex11_8;

public class GameSimulation {
    public static void main(String[] args) {
        Knight atomic = new Knight("아토믹"); // 휴먼
        Knight uther = new HolyKnight("우서"); // 신성한 능력을 가진
        Knight genji = new MagicKnight("겐지"); // 마법능력을 가진

        atomic.slash();
        uther.slash();
        genji.slash();

        Healer healer = (HolyKnight) uther;
        Healer healer2 = new HolyKnight("우서 동생");
        healer.heal();
        healer.recovery();

// healer.slash();
// Healer 인터페이스의 참조변수이므로 Healer 인터페이스를 통해 구현된 메소드만 호출할 수 있다.

        Magician magician = (MagicKnight) genji;
        magician.magicShield();
        magician.teleport();

        MagicKnight magicKnight = new MagicKnight("겐지동생");
        magicKnight.magicShield();
        magicKnight.teleport();
        magicKnight.slash();

    }
}
