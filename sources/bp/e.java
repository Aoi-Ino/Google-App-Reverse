package bp;

public class e extends IllegalStateException {

    /* renamed from: e  reason: collision with root package name */
    private Throwable f20033e;

    e(String str, Throwable th2) {
        super(str);
        this.f20033e = th2;
    }

    public Throwable getCause() {
        return this.f20033e;
    }
}
