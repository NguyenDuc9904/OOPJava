package KeThua;

import java.util.Scanner;

public class Hinhtron extends HinhHoc {
    public float banKinh;
    public Hinhtron(){
        tenHinh = "Hinh Tron";
    }
    public void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban kinh = ");
        banKinh = sc.nextFloat();
    }
    public void tinhChuVi(){
        ChuVi = 2*Pi*banKinh;
    }
    public void tinhDienTich(){
        DienTich = Pi*banKinh*banKinh;
    }
}
