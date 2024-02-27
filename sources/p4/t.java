package p4;

final class t implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ u f14697e;

    t(u uVar) {
        this.f14697e = uVar;
    }

    public final void run() {
        synchronized (this.f14697e.f14699b) {
            try {
                u uVar = this.f14697e;
                if (uVar.f14700c != null) {
                    uVar.f14700c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
