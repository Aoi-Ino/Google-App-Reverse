package bp;

public class c extends IllegalStateException {

    /* renamed from: e  reason: collision with root package name */
    private Throwable f20032e;

    c(String str, Throwable th2) {
        super(str);
        this.f20032e = th2;
    }

    public Throwable getCause() {
        return this.f20032e;
    }
}