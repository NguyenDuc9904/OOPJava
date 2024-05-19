import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int namsinh;
        String ten;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten cua ban :");
        ten = sc.nextLine();
        System.out.println("nhap nam sinh cua ban :");
        namsinh = sc.nextInt();
        if (2024-namsinh<16){
        System.out.println("Ban "+ ten +" o do tuoi vi thanh nien");
        }
        else if (2024-namsinh>=16 && 2024-namsinh<18){
        System.out.println("Ban "+ ten +" o do tuoi truong thanh");
        }
        else{
        System.out.println("Ban "+ ten +" da gia");
        }
    }
}
