import java.util.Scanner;

public class Bai10 {
    static boolean so_hoan_hao(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        n = sc.nextInt();
        if (so_hoan_hao(n)) {
            System.out.println(n + " la so hoan hao");
        } else {
            System.out.println(n + " khong la so hoan hao");
        }
    }
}
