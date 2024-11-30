import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();

        System.out.print(n + " = ");
        primeFactorization(n);
    }

    private static void primeFactorization(int n) {
        int count = 0;
        while (n % 2 == 0) {
            n /= 2;
            count++;
        }
        if (count > 0) {
            System.out.print("2");
            if (count > 1) {
                System.out.print("^" + count);
            }
            if (n > 1) {
                System.out.print(" * ");
            }
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            count = 0;
            while (n % i == 0) {
                n /= i;
                count++;
            }
            if (count > 0) {
                System.out.print(i);
                if (count > 1) {
                    System.out.print("^" + count);
                }
                if (n > 1) {
                    System.out.print(" * ");
                }
            }
        }

        if (n > 2) {
            System.out.print(n);
        }
        System.out.println();
    }
}