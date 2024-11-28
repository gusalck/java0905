package chp12.ex12_9;

import java.io.*;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("빌 게이츠","206-000001",10000000);
        BankAccount b2 = new BankAccount("워렌 버핏","206-000002",10000000);

        try {
            File file = new File("result_account.txt");
            FileWriter fw = new FileWriter(file);
            fw.write(b1.toString()+"\n");
            fw.write(b2.toString()+"\n");
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
