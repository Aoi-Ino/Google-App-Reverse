package p4;

final class z implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f14711e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ a0 f14712f;

    z(a0 a0Var, i iVar) {
        this.f14712f = a0Var;
        this.f14711e = iVar;
    }

    public final void run() {
        synchronized (this.f14712f.f14664b) {
            try {
                a0 a0Var = this.f14712f;
                if (a0Var.f14665c != null) {
                    a0Var.f14665c.b(this.f14711e.i());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
