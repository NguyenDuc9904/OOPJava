package KeThua;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong(){
        tenHinh = "Hinh Vuong";
    }
    public void nhapCanh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Canh = ");
        chieuDai = sc.nextFloat();
    }
    public void tinhChuVi(){
        ChuVi = chieuDai*4;
    }
    public void tinhDienTich(){
        DienTich = chieuDai*chieuDai;
    }
}
 