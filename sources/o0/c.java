package o0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.i;
import androidx.fragment.app.q;
import cm.g;
import cm.l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f14319a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static C0192c f14320b = C0192c.f14332d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
    }

    /* renamed from: o0.c$c  reason: collision with other inner class name */
    public static final class C0192c {

        /* renamed from: c  reason: collision with root package name */
        public static final a f14331c = new a((g) null);

        /* renamed from: d  reason: collision with root package name */
        public static final C0192c f14332d = new C0192c(q0.d(), (b) null, i0.g());

        /* renamed from: a  reason: collision with root package name */
        private final Set f14333a;

        /* renamed from: b  reason: collision with root package name */
        private final Map f14334b;

        /* renamed from: o0.c$c$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }
        }

        public C0192c(Set set, b bVar, Map map) {
            l.f(set, "flags");
            l.f(map, "allowedViolations");
            this.f14333a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f14334b = linkedHashMap;
        }

        public final Set a() {
            return this.f14333a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f14334b;
        }
    }

    private c() {
    }

    private final C0192c b(i iVar) {
        while (iVar != null) {
            if (iVar.n0()) {
                q O = iVar.O();
                l.e(O, "declaringFragment.parentFragmentManager");
                if (O.C0() != null) {
                    C0192c C0 = O.C0();
                    l.c(C0);
                    return C0;
                }
            }
            iVar = iVar.M();
        }
        return f14320b;
    }

    private final void c(C0192c cVar, g gVar) {
        i a10 = gVar.a();
        String name = a10.getClass().getName();
        if (cVar.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, gVar);
        }
        cVar.b();
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            k(a10, new b(name, gVar));
        }
    }

    /* access modifiers changed from: private */
    public static final void d(String str, g gVar) {
        l.f(gVar, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, gVar);
        throw gVar;
    }

    private final void e(g gVar) {
        if (q.J0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + gVar.a().getClass().getName(), gVar);
        }
    }

    public static final void f(i iVar, String str) {
        l.f(iVar, "fragment");
        l.f(str, "previousFragmentId");
        a aVar = new a(iVar, str);
        c cVar = f14319a;
        cVar.e(aVar);
        C0192c b10 = cVar.b(iVar);
        if (b10.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.l(b10, iVar.getClass(), aVar.getClass())) {
            cVar.c(b10, aVar);
        }
    }

    public static final void g(i iVar, ViewGroup viewGroup) {
        l.f(iVar, "fragment");
        d dVar = new d(iVar, viewGroup);
        c cVar = f14319a;
        cVar.e(dVar);
        C0192c b10 = cVar.b(iVar);
        if (b10.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.l(b10, iVar.getClass(), dVar.getClass())) {
            cVar.c(b10, dVar);
        }
    }

    public static final void h(i iVar) {
        l.f(iVar, "fragment");
        e eVar = new e(iVar);
        c cVar = f14319a;
        cVar.e(eVar);
        C0192c b10 = cVar.b(iVar);
        if (b10.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.l(b10, iVar.getClass(), eVar.getClass())) {
            cVar.c(b10, eVar);
        }
    }

    public static final void i(i iVar, ViewGroup viewGroup) {
        l.f(iVar, "fragment");
        l.f(viewGroup, "container");
        h hVar = new h(iVar, viewGroup);
        c cVar = f14319a;
        cVar.e(hVar);
        C0192c b10 = cVar.b(iVar);
        if (b10.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.l(b10, iVar.getClass(), hVar.getClass())) {
            cVar.c(b10, hVar);
        }
    }

    public static final void j(i iVar, i iVar2, int i10) {
        l.f(iVar, "fragment");
        l.f(iVar2, "expectedParentFragment");
        i iVar3 = new i(iVar, iVar2, i10);
        c cVar = f14319a;
        cVar.e(iVar3);
        C0192c b10 = cVar.b(iVar);
        if (b10.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && cVar.l(b10, iVar.getClass(), iVar3.getClass())) {
            cVar.c(b10, iVar3);
        }
    }

    private final void k(i iVar, Runnable runnable) {
        if (iVar.n0()) {
            Handler g10 = iVar.O().w0().g();
            l.e(g10, "fragment.parentFragmentManager.host.handler");
            if (!l.a(g10.getLooper(), Looper.myLooper())) {
                g10.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    private final boolean l(C0192c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (l.a(cls2.getSuperclass(), g.class) || !y.R(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
