package KeThua;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float chieuDai;
    public float chieuRong;
    public HinhChuNhat(){
        tenHinh = "Hinh Chu Nhat";
    }
    public void nhapChieuDai(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu Dai = ");
        chieuDai = sc.nextFloat();
    }
    public void nhapChieuRong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu Rong = ");
        chieuRong = sc.nextFloat();
    }
    public void tinhChuVi(){
        ChuVi = (chieuDai+chieuRong)*2;
    }
    public void tinhDienTich(){
        DienTich = chieuDai*chieuRong;
    }
}
