package k6;

import y6.a;
import y6.b;

class b0 implements b {

    /* renamed from: c  reason: collision with root package name */
    private static final a f12946c = new z();

    /* renamed from: d  reason: collision with root package name */
    private static final b f12947d = new a0();

    /* renamed from: a  reason: collision with root package name */
    private a f12948a;

    /* renamed from: b  reason: collision with root package name */
    private volatile b f12949b;

    private b0(a aVar, b bVar) {
        this.f12948a = aVar;
        this.f12949b = bVar;
    }

    static b0 c() {
        return new b0(f12946c, f12947d);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(b bVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object e() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void f(b bVar) {
        a aVar;
        if (this.f12949b == f12947d) {
            synchronized (this) {
                aVar = this.f12948a;
                this.f12948a = null;
                this.f12949b = bVar;
            }
            aVar.a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    public Object get() {
        return this.f12949b.get();
    }
}
