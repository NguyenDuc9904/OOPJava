package Chuong4.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        ArrayList<student> Arraylist = new ArrayList<student>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu cua mang ");
        n = sc.nextInt();
        //nhap thong tin
        for(int i = 0; i < n ; i++) {
            student st =new student();
            st.nhapThongTin();
            Arraylist.add(st);
        }
        System.out.println(Arraylist.get(100));
        System.out.println(Arraylist.set(n, null));
        System.out.println(Arraylist.remove(100));
        System.out.println(Arraylist);
        //xuat thong tin
         for(int i = 0; i < Arraylist.size();i++){
            System.out.println("<------ham duoc in ra la ----->");
           Arraylist.get(i).inThongTin();
         }

       
    }

}