package t0;

import android.os.Bundle;
import bm.l;
import cm.m;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.ListIterator;
import pl.x;

public abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    private d0 f16244a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f16245b;

    public interface a {
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        String value();
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b0 f16246e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v f16247f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b0 b0Var, v vVar, a aVar) {
            super(1);
            this.f16246e = b0Var;
            this.f16247f = vVar;
        }

        /* renamed from: b */
        public final h invoke(h hVar) {
            cm.l.f(hVar, "backStackEntry");
            p e10 = hVar.e();
            if (!(e10 instanceof p)) {
                e10 = null;
            }
            if (e10 == null) {
                return null;
            }
            p d10 = this.f16246e.d(e10, hVar.c(), this.f16247f, (a) null);
            if (d10 == null) {
                return null;
            }
            return cm.l.a(d10, e10) ? hVar : this.f16246e.b().a(d10, d10.s(hVar.c()));
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final d f16248e = new d();

        d() {
            super(1);
        }

        public final void b(w wVar) {
            cm.l.f(wVar, "$this$navOptions");
            wVar.d(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((w) obj);
            return x.f30437a;
        }
    }

    public abstract p a();

    /* access modifiers changed from: protected */
    public final d0 b() {
        d0 d0Var = this.f16244a;
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public final boolean c() {
        return this.f16245b;
    }

    public p d(p pVar, Bundle bundle, v vVar, a aVar) {
        cm.l.f(pVar, "destination");
        return pVar;
    }

    public void e(List list, v vVar, a aVar) {
        cm.l.f(list, "entries");
        for (h k10 : o.i(o.p(y.O(list), new c(this, vVar, aVar)))) {
            b().k(k10);
        }
    }

    public void f(d0 d0Var) {
        cm.l.f(d0Var, "state");
        this.f16244a = d0Var;
        this.f16245b = true;
    }

    public void g(h hVar) {
        cm.l.f(hVar, "backStackEntry");
        p e10 = hVar.e();
        if (!(e10 instanceof p)) {
            e10 = null;
        }
        if (e10 != null) {
            d(e10, (Bundle) null, x.a(d.f16248e), (a) null);
            b().f(hVar);
        }
    }

    public void h(Bundle bundle) {
        cm.l.f(bundle, "savedState");
    }

    public Bundle i() {
        return null;
    }

    public void j(h hVar, boolean z10) {
        cm.l.f(hVar, "popUpTo");
        List list = (List) b().b().getValue();
        if (list.contains(hVar)) {
            ListIterator listIterator = list.listIterator(list.size());
            h hVar2 = null;
            while (k()) {
                hVar2 = (h) listIterator.previous();
                if (cm.l.a(hVar2, hVar)) {
                    break;
                }
            }
            if (hVar2 != null) {
                b().h(hVar2, z10);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + hVar + " which does not exist in back stack " + list).toString());
    }

    public boolean k() {
        return true;
    }
}
