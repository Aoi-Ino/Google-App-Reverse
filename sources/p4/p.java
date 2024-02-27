package p4;

final class p implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f14687e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ q f14688f;

    p(q qVar, i iVar) {
        this.f14688f = qVar;
        this.f14687e = iVar;
    }

    public final void run() {
        if (this.f14687e.k()) {
            this.f14688f.f14691c.q();
            return;
        }
        try {
            this.f14688f.f14691c.p(this.f14688f.f14690b.a(this.f14687e));
        } catch (g e10) {
            if (e10.getCause() instanceof Exception) {
                this.f14688f.f14691c.o((Exception) e10.getCause());
            } else {
                this.f14688f.f14691c.o(e10);
            }
        } catch (Exception e11) {
            this.f14688f.f14691c.o(e11);
        }
    }
}
