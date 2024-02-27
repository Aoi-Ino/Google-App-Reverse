package p1;

import android.os.Build;
import cm.g;
import cm.l;
import m1.m;
import m1.n;
import o1.c;
import q1.h;
import r1.u;

public final class e extends c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f14607c = new a((g) null);

    /* renamed from: d  reason: collision with root package name */
    private static final String f14608d;

    /* renamed from: b  reason: collision with root package name */
    private final int f14609b = 7;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    static {
        String i10 = m.i("NetworkMeteredCtrlr");
        l.e(i10, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f14608d = i10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(h hVar) {
        super(hVar);
        l.f(hVar, "tracker");
    }

    public int b() {
        return this.f14609b;
    }

    public boolean c(u uVar) {
        l.f(uVar, "workSpec");
        return uVar.f15486j.d() == n.METERED;
    }

    /* renamed from: g */
    public boolean d(c cVar) {
        l.f(cVar, "value");
        if (Build.VERSION.SDK_INT < 26) {
            m.e().a(f14608d, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (cVar.a()) {
                return false;
            }
        } else if (cVar.a() && cVar.b()) {
            return false;
        }
        return true;
    }
}
