package p4;

final class v implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f14701e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ w f14702f;

    v(w wVar, i iVar) {
        this.f14702f = wVar;
        this.f14701e = iVar;
    }

    public final void run() {
        synchronized (this.f14702f.f14704b) {
            try {
                w wVar = this.f14702f;
                if (wVar.f14705c != null) {
                    wVar.f14705c.a(this.f14701e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
