package Chuong4.Sets;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Slide60 {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Java");
        linkedHashSet.add("C++");
        linkedHashSet.add("Java");
        linkedHashSet.add("PHP");
        
        for (String str : linkedHashSet){
            System.out.println(str);
        }
        System.out.println("Cac phan tu trong linkedhashset :");
        System.out.println(linkedHashSet);
        System.out.println("Nhap phan tu can xoa :");
        name = sc.nextLine();

        if (linkedHashSet.contains(name)){
            linkedHashSet.remove(name);
            System.out.println("Xoa thanh cong");
            System.out.println("Cac phan tu trong linkedhashset sau khi xoa :");
            System.out.println(linkedHashSet);
        }
        else{
            System.out.println("Xoa khong thanh cong ");
        }
    }
    
}
