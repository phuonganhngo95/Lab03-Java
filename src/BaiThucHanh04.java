// Bài thực hành 4
public class BaiThucHanh04 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0) {
                count++;
                System.out.println(i);
            }
            if(count == 10) {
                break;
            }
        }
    }
}
