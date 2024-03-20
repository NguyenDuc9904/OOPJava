package KeThuaPerson.employ;

import java.util.Scanner;

public class Fulltime extends employee {
    public float luongcung;
    public float baoHiem;
    public float thuongThem;
    public Fulltime(){
        Tencv = "Full Time";
    }
    public void nhapLuong(){
        super.nhapLuong();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap luong cung : ");
        luongcung = sc.nextFloat();
         System.out.print("nhap bao hiem : ");
         baoHiem = sc.nextFloat();
         System.out.print("nhap thuong them : ");
         thuongThem = sc.nextFloat();
    }
    public void TinhLuong(){
        Luong = luongcung + thuongThem - baoHiem;
    }
}
