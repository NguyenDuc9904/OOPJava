package slide79;

import java.io.ObjectInputFilter.Config;

import util.Configs;

public class NhanVienPartTime extends nhanvien{
    private int gioLamViec;
    public NhanVienPartTime(String Ten , int gioLamViec){
    this.Ten = Ten;
    this.gioLamViec=gioLamViec;
}
@Override
    public String loaiNhanVien () {
        return "Nhan Vien Thoi Vu";
}
public void TinhLuong(){
    Luong=Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
}
}