package chp08.ex7;

public class MainAccountTest {
    public static void main(String[] args) {
        Account a = new Account("123-45",10000);
        Account b = new Account("567-89",10000);
        while(a.transfer(b,3000)){
            System.out.println("송금완료");
        }
        System.out.println(a);
        System.out.println(b);
    }
}
