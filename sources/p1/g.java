package p1;

import android.os.Build;
import cm.l;
import m1.n;
import o1.c;
import q1.h;
import r1.u;

public final class g extends c {

    /* renamed from: b  reason: collision with root package name */
    private final int f14613b = 7;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(hVar);
        l.f(hVar, "tracker");
    }

    public int b() {
        return this.f14613b;
    }

    public boolean c(u uVar) {
        l.f(uVar, "workSpec");
        n d10 = uVar.f15486j.d();
        return d10 == n.UNMETERED || (Build.VERSION.SDK_INT >= 30 && d10 == n.TEMPORARILY_UNMETERED);
    }

    /* renamed from: g */
    public boolean d(c cVar) {
        l.f(cVar, "value");
        return !cVar.a() || cVar.b();
    }
}
