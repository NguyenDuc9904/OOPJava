package baitapcuoichuong4.bai3c4;

import java.util.Scanner;

public class danhsachsv {


        String Name;
        int diem;
    
        public String getHoTen () {
            return Name;
        }
    
        public int getDiem () {
            return diem;
        }
        public void nhapGiaTri() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ten sinh vien : ");
            Name = sc.nextLine();
            System.out.println("Nhap diem cua sinh vien : ");
            diem = sc.nextInt();
        }
        public void inGiaTri() {
            System.out.println("Ten cua sinh vien la : " +Name);
            System.out.println("Diem cua sinh vien la : "+ diem);
        }
    }
    
