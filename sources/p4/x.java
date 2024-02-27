package p4;

import s3.o;

final class x implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f14706e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ y f14707f;

    x(y yVar, i iVar) {
        this.f14707f = yVar;
        this.f14706e = iVar;
    }

    public final void run() {
        synchronized (this.f14707f.f14709b) {
            try {
                y yVar = this.f14707f;
                if (yVar.f14710c != null) {
                    yVar.f14710c.a((Exception) o.i(this.f14706e.h()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
