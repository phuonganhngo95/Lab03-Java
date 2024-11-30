// Bài thực hành 6
import java.util.Scanner;

public class viewMenu {
    public static void main(String[] args) {
        System.out.println("===== MENU ============");
        System.out.println("1. Nhập thông tin sinh viên.");
        System.out.println("2. Hiển thị thông tin sinh viên.");
        System.out.println("3. Tìm kiếm sinh viên.");
        System.out.println("4. Sinh viên xuất sắc nhất.");
        System.out.println("5. Thoát.");
        System.out.println("Mời nhập từ 1 --> 5");
        System.out.println("-----------------------");

        int luachon;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap lua chon:");
        luachon = sc.nextInt();

        switch (luachon) {
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            default:
                System.out.println("Con lạy thánh, đừng trêu như vậy nữa");
        }
    }
}