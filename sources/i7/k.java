package i7;

public class k extends RuntimeException {
    public k(String str) {
        super(str);
    }

    public k(String str, Throwable th2) {
        super(str, th2);
    }

    public k(Throwable th2) {
        super(th2);
    }
}
