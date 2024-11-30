import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        n = sc.nextInt();

        float sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Tong: " + sum);
    }
}
