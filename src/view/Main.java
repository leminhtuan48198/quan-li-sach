package view;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.sql.SQLOutput;
import java.util.Scanner;

import static controller.Manager.*;

public class Main {
    public static void main(String[] args) {
        int choice;
        do {
            Scanner scanner = showMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addProgrammingBook();
                    break;
                case 2:
                    addFictionBook();
                    break;
                case 3:
                    System.out.println("Giá tiền cuả tất cả sách là " + getSumCost());
                    break;
                case 4:
                    System.out.println("Số sách có ngôn ngữ Java là " + getCountOfJava());
                    break;
                case 5:
                    System.out.println("Số sách Fiction có thể loại Viễn tưởng 1 là " + getCountOfFiction1());
                    break;
                case 6:
                    System.out.println("Số sách Fiction có giá nhỏ hơn 100 là " + getCountOfFictionBookBelow100());
                    break;
                case 0:
                    System.exit(0);
                    break;
                case 7:
                    displayBook();
                    break;
                default:
                    System.out.println("Mời bạn chọn số");

            }
        } while (choice != 0);

    }

    private static Scanner showMenu() {
        System.out.println("--Danh mục--");
        System.out.println("1. Thêm Programming book ");
        System.out.println("2. Thêm Fiction book ");
        System.out.println("3. Tính tổng tiền của tất cả sách");
        System.out.println("4. Đếm số sách ProgrammingBook có language là Java");
        System.out.println("5. Đếm số sách Fiction có category là Viễn tưởng 1 ");
        System.out.println("6. Đếm số sách Fiction có giá < 100");
        System.out.println("7. Hiển thị danh mục sách");
        System.out.println("0. Kết thúc");
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
}