package p1;

import android.os.Build;
import cm.l;
import m1.n;
import o1.c;
import q1.h;
import r1.u;

public final class d extends c {

    /* renamed from: b  reason: collision with root package name */
    private final int f14606b = 7;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(h hVar) {
        super(hVar);
        l.f(hVar, "tracker");
    }

    public int b() {
        return this.f14606b;
    }

    public boolean c(u uVar) {
        l.f(uVar, "workSpec");
        return uVar.f15486j.d() == n.CONNECTED;
    }

    /* renamed from: g */
    public boolean d(c cVar) {
        l.f(cVar, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            if (!cVar.a() || !cVar.d()) {
                return true;
            }
        } else if (!cVar.a()) {
            return true;
        }
        return false;
    }
}
