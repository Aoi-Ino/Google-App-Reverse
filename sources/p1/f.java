package p1;

import cm.g;
import cm.l;
import m1.m;
import m1.n;
import o1.c;
import q1.h;
import r1.u;

public final class f extends c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f14610c = new a((g) null);

    /* renamed from: d  reason: collision with root package name */
    private static final String f14611d;

    /* renamed from: b  reason: collision with root package name */
    private final int f14612b = 7;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    static {
        String i10 = m.i("NetworkNotRoamingCtrlr");
        l.e(i10, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f14611d = i10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(h hVar) {
        super(hVar);
        l.f(hVar, "tracker");
    }

    public int b() {
        return this.f14612b;
    }

    public boolean c(u uVar) {
        l.f(uVar, "workSpec");
        return uVar.f15486j.d() == n.NOT_ROAMING;
    }

    /* renamed from: g */
    public boolean d(c cVar) {
        l.f(cVar, "value");
        return !cVar.a() || !cVar.c();
    }
}
