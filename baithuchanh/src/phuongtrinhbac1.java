import java.util.Scanner;

public class phuongtrinhbac1 {
    public static void main(String[] args) throws Exception {
        double a ,b ;
        double phuongTrinh ;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a :");
        a = sc.nextDouble();
        System.out.print("nhap b :");
        b = sc.nextDouble();
        if(a==0 ){
            phuongTrinh = b;
        }
        else{
          phuongTrinh = -b/a;
        }
         System.out.println("phuong trinh in ra la" + phuongTrinh);
    }
   
 }
