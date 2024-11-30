import java.util.Scanner;

public class Bai11 {
    static boolean ktr_hoan_hao(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    static void so_hoan_hao(int a) {
        System.out.println("Day so hoan hao:");
        for (int i = 1; i <= a; i++) {
            if (ktr_hoan_hao(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so:");
        a = sc.nextInt();
        so_hoan_hao(a);
    }
}
