import java.util.Scanner;

public class cau1 {
    public static void main(String[] args) {
        int bernums[];
        int kichthuoc;
        int tong = 0;
        System.out.println("Mời nhập kích thước của mảng:");
        Scanner scanner = new Scanner(System.in);
        kichthuoc = scanner.nextInt();
        bernums = new int[kichthuoc];
        for (int hi = 0; hi < bernums.length; hi++) {
            System.out.println("Element" + (hi + hi) + "in the array is" );
            bernums[hi] = scanner.nextInt();
        }
        for (int zi = 0; zi < bernums.length ; zi++) {
            System.out.println("Element in the array is: " + bernums[zi]);
            bernums[zi] = scanner.nextInt();
        }
    }
}
