import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        int n, tong = 0 ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap n :");
            n = sc.nextInt();
            tong += n ;
        }while (tong <100);
        System.out.println("tong cac so nguyen :");
    }
}
    