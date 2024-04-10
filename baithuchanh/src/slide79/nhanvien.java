package slide79;

import person.NhanVien;

public class nhanvien {
    protected String Ten;
    protected long Luong;

public nhanvien(){}
public nhanvien(String Ten){
    this.Ten =Ten;
}
protected String loaiNhanVien () {
    return "";
}
public void xuatthongtin(){
    System.out.println("====Nhan vien " + Ten + " ====");
    System.out.println("Luong : " + Luong + "VND" );
}
}