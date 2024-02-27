package ep;

public class n2 extends Exception {
    public n2(String str, Object... objArr) {
        super(String.format(str, objArr));
    }
}
