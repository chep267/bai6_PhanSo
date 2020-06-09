package bth_so5;

import java.util.Scanner;

public class Demo {

    public static void main(String arg[]){
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap tu so va mau so cho PS 1: ");
        a = sc.nextInt(); b = sc.nextInt();
        System.out.print("\nNhap tu so va mau so cho PS 2: ");
        c = sc.nextInt(); d = sc.nextInt();
        PS p1 = new PS(a,b);
        PS p2 = new PS(c,d);

        //cong, tru, nhan, chia:
        PS p3 = p1.add(p2);
        System.out.print("\nTong 2 PS la: "+ p3.toString());
        PS p4 = p1.sub(p2);
        System.out.print("\nHieu 2 PS la: "+ p4.toString());
        PS p5 = p1.mul(p2);
        System.out.print("\nTich 2 PS la: "+ p5.toString());
        PS p6 = p1.div(p2);
        System.out.print("\nThuong 2 PS la: "+ p6.toString());
    }
}
