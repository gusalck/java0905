package chp08.ex8_2;

public class Drink {
    String name;
    int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("Drink(String name, int price) constructor 호출");
    }
    public Drink() {
        System.out.println("default constructor 호출");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
