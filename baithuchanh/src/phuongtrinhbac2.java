import java.util.Scanner;

public class phuongtrinhbac2 {
    public static void main(String[] args) throws Exception {
        double a ,b ,c ,deltal ;
        double x1,x2,x3,phuongTrinh ;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a :");
        a = sc.nextDouble();
        System.out.print("nhap b :");
        b = sc.nextDouble();
        System.out.print("nhap c :");
        c = sc.nextDouble();
        System.out.print("nhap c :");
        deltal = b*b-4*a*c;

        phuongTrinh = -b/a;
        if(a==0 ){
            System.out.println("phuong.trinh"+phuongTrinh);
        }
        else if(a==0 && b==0){
            System.out.println("phuong trinh co nghiem la" +c);
        }
        else if(a==0 && b==0 && c==0){
            System.out.println("phuong trinh co vo so nghiem");
        }

    if(deltal > 0){
        System.out.println("phuong trinh co hai nghiem phan biet");
        x1 = -b+Math.sqrt(deltal)/2*a;
        x2 = -b-Math.sqrt(deltal)/2*a;
        System.out.println("phuong trinh co  hai nghiem phan biet la : " + "x1 = " + x1 +"x2 = " + x2);
    }
    else if(deltal == 0){
        System.out.println("phuong trinh co nghiem kep" );
        x1=x2=-b/(2*a);
        System.out.println("vay phuong trinh co nghiem kep la x1=x2 :" + x1);
    }
    else{
        System.out.println("phuong trinh vo nghiem ");
    }
}
}