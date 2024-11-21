package chp11.ex11_8;

public class MagicKnight extends Knight implements Magician {

    public int mp = 100;

    public MagicKnight(String name) {
        super(name);
    }

    @Override
    public void magicShield() {
        System.out.printf("[%s]가 모든 공격을 튕겨냅니다.\n",name);
    }

    @Override
    public void teleport() {
        System.out.printf("[%s]가 순간이동을 시전합니다.\n",name);
    }

    public void slash(){
        System.out.printf("[%s]의 마력이 깃든 베기 공격🪓🪓🪓\n",name);
    }
}
