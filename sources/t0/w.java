package t0;

import bm.l;
import t0.v;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final v.a f16474a = new v.a();

    /* renamed from: b  reason: collision with root package name */
    private boolean f16475b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16476c;

    /* renamed from: d  reason: collision with root package name */
    private int f16477d = -1;

    /* renamed from: e  reason: collision with root package name */
    private String f16478e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f16479f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f16480g;

    private final void f(String str) {
        if (str == null) {
            return;
        }
        if (!p.q(str)) {
            this.f16478e = str;
            this.f16479f = false;
            return;
        }
        throw new IllegalArgumentException("Cannot pop up to an empty route".toString());
    }

    public final void a(l lVar) {
        cm.l.f(lVar, "animBuilder");
        c cVar = new c();
        lVar.invoke(cVar);
        this.f16474a.b(cVar.a()).c(cVar.b()).e(cVar.c()).f(cVar.d());
    }

    public final v b() {
        v.a aVar = this.f16474a;
        aVar.d(this.f16475b);
        aVar.j(this.f16476c);
        String str = this.f16478e;
        if (str != null) {
            aVar.h(str, this.f16479f, this.f16480g);
        } else {
            aVar.g(this.f16477d, this.f16479f, this.f16480g);
        }
        return aVar.a();
    }

    public final void c(int i10, l lVar) {
        cm.l.f(lVar, "popUpToBuilder");
        e(i10);
        f((String) null);
        e0 e0Var = new e0();
        lVar.invoke(e0Var);
        this.f16479f = e0Var.a();
        this.f16480g = e0Var.b();
    }

    public final void d(boolean z10) {
        this.f16475b = z10;
    }

    public final void e(int i10) {
        this.f16477d = i10;
        this.f16479f = false;
    }

    public final void g(boolean z10) {
        this.f16476c = z10;
    }
}
