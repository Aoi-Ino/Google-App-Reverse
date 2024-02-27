package e4;

import com.google.android.gms.common.api.internal.c;
import p4.j;
import r3.i;

final class h implements i, p {

    /* renamed from: a  reason: collision with root package name */
    private final g f10055a;

    /* renamed from: b  reason: collision with root package name */
    private c f10056b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10057c = true;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ i f10058d;

    h(i iVar, c cVar, g gVar) {
        this.f10058d = iVar;
        this.f10056b = cVar;
        this.f10055a = gVar;
    }

    public final synchronized c a() {
        return this.f10056b;
    }

    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        c.a b10;
        boolean z10;
        v vVar = (v) obj;
        j jVar = (j) obj2;
        synchronized (this) {
            b10 = this.f10056b.b();
            z10 = this.f10057c;
            this.f10056b.a();
        }
        if (b10 == null) {
            jVar.c(Boolean.FALSE);
        } else {
            this.f10055a.a(vVar, b10, z10, jVar);
        }
    }

    public final void h() {
        c.a b10;
        synchronized (this) {
            this.f10057c = false;
            b10 = this.f10056b.b();
        }
        if (b10 != null) {
            this.f10058d.f(b10, 2441);
        }
    }

    public final synchronized void i(c cVar) {
        c cVar2 = this.f10056b;
        if (cVar2 != cVar) {
            cVar2.a();
            this.f10056b = cVar;
        }
    }
}
