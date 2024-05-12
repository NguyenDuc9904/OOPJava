package Chuong4.Lists;

import java.util.LinkedList;

public class slide38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("phuong thuc removeAll()");
        System.out.println("---------------");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("listA");
        ShowList(listA);
        System.out.println("phuong thuc retainAll()");
        System.out.println("-------------");
        
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");

        listA.retainAll(listB);
        System.out.println("listA");
        ShowList(listA);
        System.out.println("phuong thuc removeAll()");
        System.out.println("---------------");
        list.removeAll(listB);
        System.out.println("list:");
        ShowList(list);

    }
    public static void ShowList(LinkedList<String> list){

        for (String obj : list){
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
    }
        
 }

