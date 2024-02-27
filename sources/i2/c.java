package i2;

import e2.h;
import e2.i;
import e2.j;
import k2.a;

public class c implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final h f12240e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12241f;

    /* renamed from: g  reason: collision with root package name */
    public final a f12242g;

    c(a aVar) {
        this.f12242g = aVar;
        this.f12240e = aVar.s();
        this.f12241f = aVar.v();
    }

    public void run() {
        this.f12242g.D(j.RUNNING);
        i k10 = d.d(this.f12242g).k();
        if (k10.d()) {
            this.f12242g.h();
        } else if (k10.c()) {
            this.f12242g.f();
        } else if (k10.a() != null) {
            this.f12242g.e(k10.a());
        } else if (!k10.b()) {
            this.f12242g.e(new e2.a());
        }
    }
}
