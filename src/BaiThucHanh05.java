// Bài thực hành 5
import java.util.Scanner;

public class BaiThucHanh05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int number = scanner.nextInt();

        String[] units = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] tens = {"", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
        String result = "";

        if (number >= 100) {
            result += units[number / 100] + " trăm ";
            number %= 100;
        }

        if (number > 0) {
            if (number < 10) {
                result += units[number];
            } else {
                result += tens[number / 10] + " ";
                if (number % 10 != 0) {
                    result += units[number % 10];
                }
            }
        }
        System.out.println(result);
    }
}