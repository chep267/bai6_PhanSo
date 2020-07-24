package dongcode.bai6;

import java.io.IOException;

public class Demo {

    public static void main(String arg[]) throws IOException {


        PhanSo p1 = new PhanSo(1,10);
        PhanSo p2 = new PhanSo(2,-5);

        System.out.println("PS 1 la: " + p1.toString());
        System.out.println("PS 2 la: " + p2.toString());


        PhanSo p3 = new PhanSo();
        p3.inputDataOnFile("/home/dongnt/Dong_Projects/dongcode/src/dongcode/bai6/input.txt");
        System.out.println("PS 3 la: " + p3.toString());


        //cong, tru, nhan, chia:
        PhanSo ps1 = p1.add(p2);
        System.out.println("Tong 2 PS la: " + ps1.toString());

        PhanSo ps2 = p1.sub(p2);
        System.out.println("Hieu 2 PS la: " + ps2.toString());

        PhanSo ps3 = p1.mul(p2);
        System.out.println("Tich 2 PS la: " + ps3.toString());

        PhanSo ps4 = p1.div(p2);
        System.out.println("Thuong 2 PS la: " + ps4.toString());
    }
}