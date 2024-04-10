package slide79;

import util.Configs;

public class main {
    
    public static void main(String[] args) throws Exception {
        //sep full time
        NhanVienFullTime sep = new NhanVienFullTime("Tran Van Sep");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        // Nhan Vien full time

        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyen Van A");
        linh1.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanVienFullTime linh2 = new NhanVienFullTime("Nguyen Van B", 3);
        linh2.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        // Nhan Vien parttime

        NhanVienPartTime Tv = new NhanVienPartTime("Nguyen Van C", 240);
         
        // Tinh Luong Nhan Vien
        sep.TinhLuong();
        linh1.TinhLuong();
        linh2.TinhLuong();
        Tv.TinhLuong();
        
        //in thong Tin

        sep.xuatthongtin();
        linh1.xuatthongtin();
        linh2.xuatthongtin();
        Tv.xuatthongtin();
}      
}