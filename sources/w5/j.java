package w5;

final class j implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ e f17888e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ k f17889f;

    j(k kVar, e eVar) {
        this.f17889f = kVar;
        this.f17888e = eVar;
    }

    public final void run() {
        synchronized (this.f17889f.f17891b) {
            try {
                k kVar = this.f17889f;
                if (kVar.f17892c != null) {
                    kVar.f17892c.a(this.f17888e.e());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
