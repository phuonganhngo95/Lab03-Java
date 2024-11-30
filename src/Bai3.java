import java.util.Scanner;

public class Bai3 {
    static int ucln(int a, int b) {
        while (a * b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    static int bcnn(int a, int b) {
        if (b == 0) {
            return a;
        }
        return (a * b)/ ucln(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap a, b:");
        a = sc.nextInt();
        b = sc.nextInt();
        int p = ucln(a, b);
        int q = bcnn(a, b);

        System.out.println("UCLN: " + p);
        System.out.println("BCLN: " + q);
    }
}
