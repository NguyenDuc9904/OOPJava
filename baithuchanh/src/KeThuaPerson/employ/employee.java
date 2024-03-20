package KeThuaPerson.employ;

import java.util.Scanner;

import KeThuaPerson.Person;

public class employee extends Person {
    public String Tencv;
    public String manv;
    public String PhongBan;
    public String ChucVu;
    public float Luong;
    public void xuatTen(){
         System.out.println(" ==== " + Tencv + " ===== " );
    }
    public void nhapThongTinnv(){
         Scanner sc = new Scanner(System.in);
         System.out.print("nhap ma nhan vien : ");
         manv = sc.nextLine();
         System.out.print("nhap phong ban : ");
         PhongBan = sc.nextLine();
         System.out.print("nhap chuc vu : ");
         ChucVu = sc.nextLine();
    }
     public void nhapLuong(){}
     public void inThongTinnv(){
         Scanner sc = new Scanner(System.in);
         System.out.println("ma nhan vien : " + manv);
         System.out.println("phong ban : " + PhongBan);
         System.out.println("chuc vu : " + ChucVu);
    }
     public void inLuongThang(){
         System.out.println("Luong thang : "+Luong);
    }


    public static void main(String[] args) {
        //luong Fulltime
        Fulltime ft = new Fulltime();
        ft.xuatTen();
        ft.nhapThongTinnv();
        ft.TinhTuoi();
        ft.inThongTinnv();
        ft.nhapLuong();
        ft.TinhLuong();
        ft.inLuongThang();
        //luong Parttime
        Parttime pt = new Parttime();
        pt.xuatTen();
        pt.nhapThongTinnv();
        pt.TinhTuoi();
        pt.inThongTinnv();
        pt.nhapSoNgayLamViec();
        pt.TinhLuong();
        pt.inLuongThang();
    }
}