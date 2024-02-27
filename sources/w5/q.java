package w5;

public abstract class q extends RuntimeException {
    public q(String str) {
        super(str);
    }

    public q(Throwable th2) {
        super(th2);
    }
}
