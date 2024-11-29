package jdbc3.view;

import java.util.Scanner;

public class MenuView {
    public static int printMenu(Scanner s1) {
        System.out.println("================= 제품 메뉴 =================");
        System.out.println("=\t\tmenu(1. 검색 2. 수정 3. 삭제)\t\t=");
        System.out.println("============================================");
        System.out.print("menu 입력 : ");
        int menu = s1.nextInt();
        return menu;
    }
}
