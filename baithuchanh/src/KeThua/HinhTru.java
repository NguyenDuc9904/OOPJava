package KeThua;

import java.util.Scanner;

public class HinhTru extends Hinhtron {
    public float chieuCao;
    public HinhTru(){
        tenHinh = "Hinh Tru";
    }
    public void nhapChieuCao(){
        nhapBanKinh();
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu Cao = ");
        chieuCao = sc.nextFloat();
    }
    public void tinhTheTinh(){
        TheTich = Pi*banKinh*banKinh*chieuCao;
    }
}
