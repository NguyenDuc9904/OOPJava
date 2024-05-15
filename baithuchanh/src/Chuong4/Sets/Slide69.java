package Chuong4.Sets;

import java.util.Scanner;
import java.util.TreeSet;

public class Slide69 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetIntegers = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

         treeSetIntegers.add(0);
         treeSetIntegers.add(3);
         treeSetIntegers.add(1);
         treeSetIntegers.add(4);
         treeSetIntegers.add(2);
         treeSetIntegers.add(8);

        System.out.println("Cac phan tu trong HashSetIntegers :");
        System.out.println( treeSetIntegers);
        System.out.println("Nhap phan tu can them :");
        number = sc .nextInt();

        if (! treeSetIntegers.contains(number)){
             treeSetIntegers.add(number);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu trong TreeSetIntegerrs sau khi them :");
            System.out.println( treeSetIntegers);
        }
        else{
            System.out.println("Phan tu " + number + " da ton tai ");
        }
    }
}

