package dongcode.bai6;

import java.io.*;


public class PhanSo implements toan{

    int ts, ms; // tu so va mau so

    //toi gian phan so:
    private void toigianPS() {
        int a = ucln(ts,ms);
        ts = ts / a;
        ms = ms / a;

        if( ms < 0 ){
            ts = -ts;
            ms = -ms;
        }
    }

    //ham tao:
    public PhanSo () {
        ts = 1; ms = 1;
    }

    public PhanSo (int n, int d) {
        ts = n;
        ms = d;
    }

    //Cac phep tinh:

    final PhanSo add( PhanSo p2) {
        PhanSo ps = new PhanSo();
        ps.ms = ms * p2.ms;
        ps.ts = ts * p2.ms  +  ms * p2.ts;
        ps.toigianPS();
        return ps;
    }

    final PhanSo sub( PhanSo p2) {
        PhanSo ps = new PhanSo();
        ps.ms = ms * p2.ms;
        ps.ts = ts * p2.ms  -  ms * p2.ts;
        ps.toigianPS();
        return ps;
    }

    final PhanSo mul( PhanSo p2) {
        PhanSo ps = new PhanSo();
        ps.ms = ms * p2.ms;
        ps.ts = ts * p2.ts;
        ps.toigianPS();
        return ps;
    }

    final PhanSo div( PhanSo p2) {
        PhanSo ps = new PhanSo();
        ps.ms = ms * p2.ts;
        ps.ts = ts * p2.ms;
        ps.toigianPS();
        return ps;
    }

    //Nhap tu file:
    public void inputDataOnFile(String fileName) throws IOException {
        InputStream fis = new FileInputStream(fileName);
        DataInputStream dis = new DataInputStream(fis);

        ts = dis.readInt();
        ms = dis.readInt();

    }

    //In:
    public  String toString() {
        toigianPS();

        String a = String.valueOf(ts); String b = String.valueOf(ms);
        if( ms == 1 ) return a;
        else return (a + "/" + b);
    }
}