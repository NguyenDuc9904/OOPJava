package slide79;

import java.io.ObjectInputFilter.Config;

import util.Configs;

public class NhanVienFullTime   extends nhanvien{
    private int ngayLamThem;
    private int loaiChucVu;
public NhanVienFullTime(String Ten){
    this.Ten=Ten;
}
public NhanVienFullTime(String Ten , int ngayLamThem){
    this.Ten=Ten;
    this.ngayLamThem=ngayLamThem;
}
public void setLoaiChucVu(int loaiChucVu){
    this.loaiChucVu=loaiChucVu;
}
@Override
public String loaiNhanVien () {
    return "Nhan Vien Chinh Thuc";
}
public void TinhLuong(){
    if (loaiChucVu==0){
        Luong=Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + Configs.LUONG_LAM_THEM_MOI_NGAY*ngayLamThem;
    }
    else if (loaiChucVu==1){
        Luong=Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + Configs.LUONG_LAM_THEM_MOI_NGAY*ngayLamThem;

    }
}
}