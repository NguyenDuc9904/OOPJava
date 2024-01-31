import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        float a,b,tong=0,hieu=0,tich=0,thuong=0,chialaydu=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a : ");
        a = sc.nextFloat();
        System.out.println("nhap so b : ");
        b = sc.nextFloat();
        tong = a+b;
        System.out.println("tong ="+tong);
        hieu = a-b;
        System.out.println("hieu ="+hieu);
        tich=a*b;
        System.out.println("tich ="+tich);
        thuong=a/b;
        System.out.println("thuong ="+thuong);
        chialaydu=a%b;
        System.out.println("du ="+chialaydu);

    if (a>b)
    System.out.println("a lon hon b");
    else if (a<b)
    System.out.println("a nho hon b");
    else 
    System.out.println("a bang b");

    }
}
