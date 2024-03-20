package KeThua;
import java.util.Scanner;

public class HinhHoc{
    public String tenHinh;
    public final float Pi = 3.14f;
    public float ChuVi;
    public float DienTich;
    public float TheTich;
    public void nhapTenHinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n==== " + tenHinh + " ====");
    }
     public void inChuVi(){
        System.out.println("Chu Vi : " + ChuVi);
     }
     public void inDienTich(){
        System.out.println("Dien Tich : " + DienTich);
     }
     public void inTheTich(){
        System.out.println("The Tich: " + TheTich);
     }
    
public static void main(String[] args) throws Exception {
    // hinh tron
    Hinhtron ht = new Hinhtron();
    ht.nhapTenHinh();
    ht.nhapBanKinh();
    ht.tinhChuVi();
    ht.tinhDienTich();
    ht.inChuVi();
    ht.inDienTich();
    // hinh tru
    HinhTru HT = new HinhTru();
    HT.nhapTenHinh();
    HT.nhapChieuCao();
    HT.tinhTheTinh();
    HT.inTheTich();
    // hinh chu nhat
    HinhChuNhat hcn = new HinhChuNhat();
    hcn.nhapTenHinh();
    hcn.nhapChieuDai();
    hcn.nhapChieuRong();
    hcn.tinhChuVi();
    hcn.tinhDienTich();
    hcn.inChuVi();
    hcn.inDienTich();
    // hinh vuong
    HinhVuong hv = new HinhVuong();
    hv.nhapTenHinh();
    hv.nhapCanh();
    hv.tinhChuVi();
    hv.tinhDienTich();
    hv.inChuVi();
    hv.inDienTich();

}
}
     