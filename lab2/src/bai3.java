import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten :");
        String ten = sc.nextLine();
        System.out.print("nhap tuoi:");
        int tuoi = sc.nextInt();
        if(tuoi<16){
            System.out.println("dang o do tuoi vi thanh nien :");
        }
        if(tuoi>=16 && tuoi<18){
            System.out.println("dang o do tuoi truong thanh :");
        }
        if(tuoi>=18){
            System.out.println("ban da gia :");
        }

    }
}


