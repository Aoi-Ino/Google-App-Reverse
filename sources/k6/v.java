package k6;

public class v extends RuntimeException {
    public v(String str) {
        super(str);
    }

    public v(String str, Throwable th2) {
        super(str, th2);
    }
}
