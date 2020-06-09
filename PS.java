package bth_so5;


public class PS {
    int ts, ms;
    private void Toigian(){
        int a = UCLN(ts,ms);
        ts = ts/a;
        ms = ms/a;
    }
    //tim ucln:
    public int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b, a%b);
    }
    //Tim bcnn:
    public int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
    //ham tao:
    public PS (int n, int d){
        try {
            ts = n;
            ms = d;
            if (ms == 0) {
                throw new Exception("loi mau so = 0 !");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public PS(){
        ts = 1;
        ms = 1;
    }
    //Cac phep tinh:
    final PS add(PS p){
        PS d = new PS();
        d.ms = ms*p.ms;
        d.ts = ts*p.ms + ms*p.ts;
        return d;
    }
    final PS sub(PS p){
        PS d = new PS();
        d.ms = ms*p.ms;
        d.ts = ts*p.ms - ms*p.ts;
        return d;
    }
    final PS mul(PS p){
        PS d = new PS();
        d.ms = ms*p.ms;
        d.ts = ts*p.ts;
        return d;
    }
    final PS div(PS p){
        PS d = new PS();
        try {
            d.ms = ms*p.ts;
            d.ts = ts*p.ms;
            if (d.ms == 0) {
                throw new Exception("loi mau so = 0 !");
            } else return d;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return d;
    }
    //Nhap tu file:
    public void input(String fileName){

    }
    //In:
    public  String toString(){
        PS p = new PS(ts,ms);
        p.Toigian();
        if(p.ms<0){
            p.ts = - p.ts;
            p.ms = - p.ms;
        }
        String a = String.valueOf(p.ts); String b = String.valueOf(p.ms);
        if(p.ms==1) return a;
        else return a+"/"+b;
    }
}
