package lm;

import bm.p;
import cm.m;
import cm.u;
import tl.d;
import tl.e;
import tl.g;
import tl.h;

public abstract class z {

    static final class a extends m implements p {

        /* renamed from: e  reason: collision with root package name */
        public static final a f25036e = new a();

        a() {
            super(2);
        }

        /* renamed from: b */
        public final g h(g gVar, g.b bVar) {
            return gVar.l(bVar);
        }
    }

    static final class b extends m implements p {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ u f25037e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f25038f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(u uVar, boolean z10) {
            super(2);
            this.f25037e = uVar;
            this.f25038f = z10;
        }

        /* renamed from: b */
        public final g h(g gVar, g.b bVar) {
            return gVar.l(bVar);
        }
    }

    static final class c extends m implements p {

        /* renamed from: e  reason: collision with root package name */
        public static final c f25039e = new c();

        c() {
            super(2);
        }

        public final Boolean b(boolean z10, g.b bVar) {
            return Boolean.valueOf(z10);
        }

        public /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
            return b(((Boolean) obj).booleanValue(), (g.b) obj2);
        }
    }

    private static final g a(g gVar, g gVar2, boolean z10) {
        boolean c10 = c(gVar);
        boolean c11 = c(gVar2);
        if (!c10 && !c11) {
            return gVar.l(gVar2);
        }
        u uVar = new u();
        uVar.f20234e = gVar2;
        h hVar = h.f31683e;
        g gVar3 = (g) gVar.X(hVar, new b(uVar, z10));
        if (c11) {
            uVar.f20234e = ((g) uVar.f20234e).X(hVar, a.f25036e);
        }
        return gVar3.l((g) uVar.f20234e);
    }

    public static final String b(g gVar) {
        return null;
    }

    private static final boolean c(g gVar) {
        return ((Boolean) gVar.X(Boolean.FALSE, c.f25039e)).booleanValue();
    }

    public static final g d(d0 d0Var, g gVar) {
        g a10 = a(d0Var.h(), gVar, true);
        return (a10 == q0.a() || a10.f(e.f31680d) != null) ? a10 : a10.l(q0.a());
    }

    public static final g e(g gVar, g gVar2) {
        return !c(gVar2) ? gVar.l(gVar2) : a(gVar, gVar2, false);
    }

    public static final h2 f(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof n0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof h2) {
                return (h2) eVar;
            }
        }
        return null;
    }

    public static final h2 g(d dVar, g gVar, Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e) || gVar.f(i2.f24968e) == null) {
            return null;
        }
        h2 f10 = f((kotlin.coroutines.jvm.internal.e) dVar);
        if (f10 != null) {
            f10.N0(gVar, obj);
        }
        return f10;
    }
}
