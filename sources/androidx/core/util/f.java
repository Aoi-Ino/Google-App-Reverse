package androidx.core.util;

public class f extends e {

    /* renamed from: c  reason: collision with root package name */
    private final Object f2519c = new Object();

    public f(int i10) {
        super(i10);
    }

    public boolean a(Object obj) {
        boolean a10;
        synchronized (this.f2519c) {
            a10 = super.a(obj);
        }
        return a10;
    }

    public Object b() {
        Object b10;
        synchronized (this.f2519c) {
            b10 = super.b();
        }
        return b10;
    }
}
