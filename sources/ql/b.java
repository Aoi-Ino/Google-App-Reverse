package ql;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class b implements Iterator, dm.a {

    /* renamed from: e  reason: collision with root package name */
    private t0 f30751e = t0.NotReady;

    /* renamed from: f  reason: collision with root package name */
    private Object f30752f;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f30753a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ql.t0[] r0 = ql.t0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ql.t0 r1 = ql.t0.Done     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ql.t0 r1 = ql.t0.Ready     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f30753a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ql.b.a.<clinit>():void");
        }
    }

    private final boolean e() {
        this.f30751e = t0.Failed;
        a();
        return this.f30751e == t0.Ready;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public final void b() {
        this.f30751e = t0.Done;
    }

    /* access modifiers changed from: protected */
    public final void d(Object obj) {
        this.f30752f = obj;
        this.f30751e = t0.Ready;
    }

    public boolean hasNext() {
        t0 t0Var = this.f30751e;
        if (t0Var != t0.Failed) {
            int i10 = a.f30753a[t0Var.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 != 2) {
                return e();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public Object next() {
        if (hasNext()) {
            this.f30751e = t0.NotReady;
            return this.f30752f;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
