package t5;

import w5.p;

public abstract class b implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final p f16524e;

    b() {
        this.f16524e = null;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public final p b() {
        return this.f16524e;
    }

    public final void c(Exception exc) {
        p pVar = this.f16524e;
        if (pVar != null) {
            pVar.d(exc);
        }
    }

    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            c(e10);
        }
    }

    public b(p pVar) {
        this.f16524e = pVar;
    }
}
