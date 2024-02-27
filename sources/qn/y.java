package qn;

public class y extends IllegalStateException {

    /* renamed from: e  reason: collision with root package name */
    private Throwable f31015e;

    public y(String str) {
        super(str);
    }

    public Throwable getCause() {
        return this.f31015e;
    }

    public y(String str, Throwable th2) {
        super(str);
        this.f31015e = th2;
    }
}
