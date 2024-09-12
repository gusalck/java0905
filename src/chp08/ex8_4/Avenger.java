package chp08.ex8_4;

public class Avenger {
    private String name;
    private int healthPower;

    public Avenger(String name, int healthPower) {
        this.name = name;
        this.healthPower = healthPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPower() {
        return healthPower;
    }

    public void setHealthPower(int healthPower) {
        this.healthPower = healthPower;
    }

    public void punch(Avenger enemy) {
        System.out.printf("%s가 펀치를 날림 ",name);
        enemy.setHealthPower(enemy.getHealthPower()-10);
        System.out.printf("아야! 아야! 아파요~");
        System.out.printf("🤜 %s의 체력이 %d로 감소됨\n",enemy.getName(),enemy.getHealthPower());
    }
}
