package w5;

final class h implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ e f17883e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i f17884f;

    h(i iVar, e eVar) {
        this.f17884f = iVar;
        this.f17883e = eVar;
    }

    public final void run() {
        synchronized (this.f17884f.f17886b) {
            try {
                i iVar = this.f17884f;
                if (iVar.f17887c != null) {
                    iVar.f17887c.a(this.f17883e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
