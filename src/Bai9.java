import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        System.out.println("Cuối tuần bạn muốn làm gì?");
        System.out.println("1. Đi học Java");
        System.out.println("2. Đi chơi Công viên ngắm gấu");
        System.out.println("3. Đi (về) nhà nghỉ");
        System.out.println("4. Ra sông Hồng tắm biển");
        System.out.println("5. Ngủ cả ngày");
        System.out.println("6. Thoát");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lựa chọn:");
        int luachon = sc.nextInt();

        switch (luachon) {
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Mời nhập lại");
        }
    }
}
