import java.util.Scanner;

public class Bai7 {
    float n, sum = 0;
    void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        n = sc.nextFloat();
    }

    void Le() {
        for (int i = 0; i < n; i++) {
            if (i<n && i%2!=0) {
                System.out.println(i);
                sum += Math.pow(i, 2);
            }
        }
        System.out.println("Tong le: " + sum);
    }

    void Chan() {
        System.out.println("So chan > trung binh cong n: ");
        float tb = (n * (n + 1)) / (2 * n);
        for (int i = 1; i <= n; i++) {
            if (i%2==0 && i>tb) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Bai7 a = new Bai7();
        a.Nhap();
        a.Le();
        System.out.print("\n");
        a.Chan();
    }
}
