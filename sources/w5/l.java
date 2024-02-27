package w5;

final class l implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ e f17893e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ m f17894f;

    l(m mVar, e eVar) {
        this.f17894f = mVar;
        this.f17893e = eVar;
    }

    public final void run() {
        synchronized (this.f17894f.f17896b) {
            try {
                m mVar = this.f17894f;
                if (mVar.f17897c != null) {
                    mVar.f17897c.b(this.f17893e.f());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
