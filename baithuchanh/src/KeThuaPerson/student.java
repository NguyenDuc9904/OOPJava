package KeThuaPerson;

import java.util.Scanner;

public class student extends Person {
    public String masv;
    public String khoa;
    public void nhapThongTinsv(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma sinh vien : ");
        masv = sc.nextLine();
        System.out.print("nhap khoa : ");
        khoa = sc.nextLine();
    }
    public void inThongTinsv(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ma sinh vien : " + masv);
        System.out.println("khoa : " + khoa);
    }

    public static void main(String[] args) {
        student st = new student();
        st.nhapThongTin();
        st.nhapThongTinsv();
        st.TinhTuoi();
        st.inThongTin();
        st.inThongTinsv();
}
}
