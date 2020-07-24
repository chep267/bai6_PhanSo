package dongcode.bai6;

public interface toan {

    //tim ucln:
    public default int ucln(int a, int b) {
        if (b == 0) return a;
        return ucln( b , a%b);
    }

    //Tim bcnn:
    public default int bcnn(int a, int b) {
        return (a * b) / ucln(a,b);
    }
}
