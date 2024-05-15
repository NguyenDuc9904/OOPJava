package Chuong4.Sets;

import java.util.HashSet;
import java.util.Scanner;

public class Slide57 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetStrings = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        hashSetStrings.add("Wilson");
        hashSetStrings.add("Nike");
        hashSetStrings.add("Volvo");
        hashSetStrings.add("Kia");
        hashSetStrings.add("Lenovo");
        hashSetStrings.add("RollRoy");

        System.out.println("Cac phan tu trong HashSetIntegers :");
        System.out.println(hashSetStrings);
        System.out.println("Nhap phan tu can xoa :");
        name = sc.nextLine();

        if (hashSetStrings.contains(name)){
            hashSetStrings.remove(name);
            System.out.println("Xoa thanh cong");
            System.out.println("Cac phan tu trong hashSetString sau khi xoa :");
            System.out.println(hashSetStrings);
        }
        else{
            System.out.println("Xoa khong thanh cong ");
        }
    }
}
