package chp08.ex8;

public class Monster {
    private String name;
    private int hp;
    private static int maxHp = 30;

    public Monster(String name) {
        this.name = name;
        this.hp = maxHp;
    }
    public void attack(Monster enemy) {
        enemy.hp -= 10;
        System.out.printf("[%s]의 공격 -> %s의 체력 : %d/%d\n",name,enemy.name,enemy.hp,maxHp);

    }
    public static void battle(Monster a,Monster b) {
        while (a.hp > 0 && b.hp > 0) {
            Monster attacker = (Math.random() < 0.5) ? a : b;
            Monster defender = (attacker == a) ? b : a;
            attacker.attack(defender);
        }
    }
}
