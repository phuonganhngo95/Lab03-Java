import java.util.Scanner;

public class Bai8 {
    static int giai_thua(int n) {
        if(n == 0) {
            return 1;
        }
        return n*giai_thua(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = sc.nextInt();
        int factorial = giai_thua(n);
        System.out.println(factorial);
    }
}
