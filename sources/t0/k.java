package t0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.k;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.lifecycle.w0;
import cm.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import om.t;
import om.v;
import pl.x;
import t0.b0;
import t0.h;
import t0.l;
import t0.p;

public abstract class k {
    public static final a H = new a((cm.g) null);
    /* access modifiers changed from: private */
    public static boolean I = true;
    /* access modifiers changed from: private */
    public bm.l A;
    /* access modifiers changed from: private */
    public final Map B;
    private int C;
    private final List D;
    private final pl.h E;
    private final om.l F;
    private final om.d G;

    /* renamed from: a  reason: collision with root package name */
    private final Context f16309a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f16310b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public u f16311c;

    /* renamed from: d  reason: collision with root package name */
    private q f16312d;

    /* renamed from: e  reason: collision with root package name */
    private Bundle f16313e;

    /* renamed from: f  reason: collision with root package name */
    private Parcelable[] f16314f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f16315g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final ql.h f16316h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final om.m f16317i;

    /* renamed from: j  reason: collision with root package name */
    private final t f16318j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final om.m f16319k;

    /* renamed from: l  reason: collision with root package name */
    private final t f16320l;

    /* renamed from: m  reason: collision with root package name */
    private final Map f16321m;

    /* renamed from: n  reason: collision with root package name */
    private final Map f16322n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Map f16323o;

    /* renamed from: p  reason: collision with root package name */
    private final Map f16324p;

    /* renamed from: q  reason: collision with root package name */
    private s f16325q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public l f16326r;

    /* renamed from: s  reason: collision with root package name */
    private final CopyOnWriteArrayList f16327s;

    /* renamed from: t  reason: collision with root package name */
    private k.b f16328t;

    /* renamed from: u  reason: collision with root package name */
    private final r f16329u;

    /* renamed from: v  reason: collision with root package name */
    private final androidx.activity.p f16330v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f16331w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public c0 f16332x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final Map f16333y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public bm.l f16334z;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    private final class b extends d0 {

        /* renamed from: g  reason: collision with root package name */
        private final b0 f16335g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ k f16336h;

        static final class a extends cm.m implements bm.a {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ b f16337e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ h f16338f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ boolean f16339g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, h hVar, boolean z10) {
                super(0);
                this.f16337e = bVar;
                this.f16338f = hVar;
                this.f16339g = z10;
            }

            public /* bridge */ /* synthetic */ Object a() {
                b();
                return x.f30437a;
            }

            public final void b() {
                b.super.h(this.f16338f, this.f16339g);
            }
        }

        public b(k kVar, b0 b0Var) {
            cm.l.f(b0Var, "navigator");
            this.f16336h = kVar;
            this.f16335g = b0Var;
        }

        public h a(p pVar, Bundle bundle) {
            cm.l.f(pVar, "destination");
            return h.a.b(h.f16285s, this.f16336h.B(), pVar, bundle, this.f16336h.G(), this.f16336h.f16326r, (String) null, (Bundle) null, 96, (Object) null);
        }

        public void e(h hVar) {
            l k10;
            cm.l.f(hVar, "entry");
            boolean a10 = cm.l.a(this.f16336h.B.get(hVar), Boolean.TRUE);
            super.e(hVar);
            this.f16336h.B.remove(hVar);
            if (!this.f16336h.f16316h.contains(hVar)) {
                this.f16336h.s0(hVar);
                if (hVar.d0().b().b(k.b.CREATED)) {
                    hVar.m(k.b.DESTROYED);
                }
                ql.h d10 = this.f16336h.f16316h;
                if (!(d10 instanceof Collection) || !d10.isEmpty()) {
                    Iterator it = d10.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (cm.l.a(((h) it.next()).f(), hVar.f())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    this.f16336h.t0();
                }
                if (!a10 && (k10 = this.f16336h.f16326r) != null) {
                    k10.h(hVar.f());
                }
                this.f16336h.t0();
            } else if (!d()) {
                this.f16336h.t0();
                this.f16336h.f16317i.b(y.v0(this.f16336h.f16316h));
            } else {
                return;
            }
            this.f16336h.f16319k.b(this.f16336h.g0());
        }

        public void h(h hVar, boolean z10) {
            cm.l.f(hVar, "popUpTo");
            b0 d10 = this.f16336h.f16332x.d(hVar.e().T());
            if (cm.l.a(d10, this.f16335g)) {
                bm.l j10 = this.f16336h.A;
                if (j10 != null) {
                    j10.invoke(hVar);
                    super.h(hVar, z10);
                    return;
                }
                this.f16336h.Z(hVar, new a(this, hVar, z10));
                return;
            }
            Object obj = this.f16336h.f16333y.get(d10);
            cm.l.c(obj);
            ((b) obj).h(hVar, z10);
        }

        public void i(h hVar, boolean z10) {
            cm.l.f(hVar, "popUpTo");
            super.i(hVar, z10);
            this.f16336h.B.put(hVar, Boolean.valueOf(z10));
        }

        public void j(h hVar) {
            cm.l.f(hVar, "entry");
            super.j(hVar);
            if (this.f16336h.f16316h.contains(hVar)) {
                hVar.m(k.b.STARTED);
                return;
            }
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }

        public void k(h hVar) {
            cm.l.f(hVar, "backStackEntry");
            b0 d10 = this.f16336h.f16332x.d(hVar.e().T());
            if (cm.l.a(d10, this.f16335g)) {
                bm.l c10 = this.f16336h.f16334z;
                if (c10 != null) {
                    c10.invoke(hVar);
                    o(hVar);
                    return;
                }
                Log.i("NavController", "Ignoring add of destination " + hVar.e() + " outside of the call to navigate(). ");
                return;
            }
            Object obj = this.f16336h.f16333y.get(d10);
            if (obj != null) {
                ((b) obj).k(hVar);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + hVar.e().T() + " should already be created").toString());
        }

        public final void o(h hVar) {
            cm.l.f(hVar, "backStackEntry");
            super.k(hVar);
        }
    }

    public interface c {
        void a(k kVar, p pVar, Bundle bundle);
    }

    static final class d extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final d f16340e = new d();

        d() {
            super(1);
        }

        /* renamed from: b */
        public final Context invoke(Context context) {
            cm.l.f(context, "it");
            if (context instanceof ContextWrapper) {
                return ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }

    static final class e extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final e f16341e = new e();

        e() {
            super(1);
        }

        public final void b(w wVar) {
            cm.l.f(wVar, "$this$navOptions");
            wVar.g(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((w) obj);
            return x.f30437a;
        }
    }

    static final class f extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ cm.r f16342e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ cm.r f16343f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ k f16344g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f16345h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ql.h f16346i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(cm.r rVar, cm.r rVar2, k kVar, boolean z10, ql.h hVar) {
            super(1);
            this.f16342e = rVar;
            this.f16343f = rVar2;
            this.f16344g = kVar;
            this.f16345h = z10;
            this.f16346i = hVar;
        }

        public final void b(h hVar) {
            cm.l.f(hVar, "entry");
            this.f16342e.f20231e = true;
            this.f16343f.f20231e = true;
            this.f16344g.e0(hVar, this.f16345h, this.f16346i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((h) obj);
            return x.f30437a;
        }
    }

    static final class g extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final g f16347e = new g();

        g() {
            super(1);
        }

        /* renamed from: b */
        public final p invoke(p pVar) {
            cm.l.f(pVar, "destination");
            q Y = pVar.Y();
            if (Y == null || Y.x0() != pVar.H()) {
                return null;
            }
            return pVar.Y();
        }
    }

    static final class h extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f16348e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(k kVar) {
            super(1);
            this.f16348e = kVar;
        }

        /* renamed from: b */
        public final Boolean invoke(p pVar) {
            cm.l.f(pVar, "destination");
            return Boolean.valueOf(!this.f16348e.f16323o.containsKey(Integer.valueOf(pVar.H())));
        }
    }

    static final class i extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final i f16349e = new i();

        i() {
            super(1);
        }

        /* renamed from: b */
        public final p invoke(p pVar) {
            cm.l.f(pVar, "destination");
            q Y = pVar.Y();
            if (Y == null || Y.x0() != pVar.H()) {
                return null;
            }
            return pVar.Y();
        }
    }

    static final class j extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f16350e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(k kVar) {
            super(1);
            this.f16350e = kVar;
        }

        /* renamed from: b */
        public final Boolean invoke(p pVar) {
            cm.l.f(pVar, "destination");
            return Boolean.valueOf(!this.f16350e.f16323o.containsKey(Integer.valueOf(pVar.H())));
        }
    }

    /* renamed from: t0.k$k  reason: collision with other inner class name */
    static final class C0217k extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ cm.r f16351e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List f16352f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ cm.s f16353g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ k f16354h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Bundle f16355i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0217k(cm.r rVar, List list, cm.s sVar, k kVar, Bundle bundle) {
            super(1);
            this.f16351e = rVar;
            this.f16352f = list;
            this.f16353g = sVar;
            this.f16354h = kVar;
            this.f16355i = bundle;
        }

        public final void b(h hVar) {
            List list;
            cm.l.f(hVar, "entry");
            this.f16351e.f20231e = true;
            int indexOf = this.f16352f.indexOf(hVar);
            if (indexOf != -1) {
                int i10 = indexOf + 1;
                list = this.f16352f.subList(this.f16353g.f20232e, i10);
                this.f16353g.f20232e = i10;
            } else {
                list = q.i();
            }
            this.f16354h.p(hVar.e(), this.f16355i, hVar, list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((h) obj);
            return x.f30437a;
        }
    }

    static final class l extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f16356e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k f16357f;

        static final class a extends cm.m implements bm.l {

            /* renamed from: e  reason: collision with root package name */
            public static final a f16358e = new a();

            a() {
                super(1);
            }

            public final void b(c cVar) {
                cm.l.f(cVar, "$this$anim");
                cVar.e(0);
                cVar.f(0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((c) obj);
                return x.f30437a;
            }
        }

        static final class b extends cm.m implements bm.l {

            /* renamed from: e  reason: collision with root package name */
            public static final b f16359e = new b();

            b() {
                super(1);
            }

            public final void b(e0 e0Var) {
                cm.l.f(e0Var, "$this$popUpTo");
                e0Var.c(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((e0) obj);
                return x.f30437a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(p pVar, k kVar) {
            super(1);
            this.f16356e = pVar;
            this.f16357f = kVar;
        }

        public final void b(w wVar) {
            cm.l.f(wVar, "$this$navOptions");
            wVar.a(a.f16358e);
            p pVar = this.f16356e;
            if (pVar instanceof q) {
                jm.g<p> c10 = p.f16420n.c(pVar);
                k kVar = this.f16357f;
                for (p pVar2 : c10) {
                    p D = kVar.D();
                    if (cm.l.a(pVar2, D != null ? D.Y() : null)) {
                        return;
                    }
                }
                if (k.I) {
                    wVar.c(q.f16440t.a(this.f16357f.F()).H(), b.f16359e);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((w) obj);
            return x.f30437a;
        }
    }

    static final class m extends cm.m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f16360e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(k kVar) {
            super(0);
            this.f16360e = kVar;
        }

        /* renamed from: b */
        public final u a() {
            u h10 = this.f16360e.f16311c;
            return h10 == null ? new u(this.f16360e.B(), this.f16360e.f16332x) : h10;
        }
    }

    static final class n extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ cm.r f16361e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k f16362f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p f16363g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Bundle f16364h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(cm.r rVar, k kVar, p pVar, Bundle bundle) {
            super(1);
            this.f16361e = rVar;
            this.f16362f = kVar;
            this.f16363g = pVar;
            this.f16364h = bundle;
        }

        public final void b(h hVar) {
            cm.l.f(hVar, "it");
            this.f16361e.f20231e = true;
            k.q(this.f16362f, this.f16363g, this.f16364h, hVar, (List) null, 8, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((h) obj);
            return x.f30437a;
        }
    }

    public static final class o extends androidx.activity.p {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f16365d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(k kVar) {
            super(false);
            this.f16365d = kVar;
        }

        public void d() {
            this.f16365d.U();
        }
    }

    static final class p extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f16366e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(String str) {
            super(1);
            this.f16366e = str;
        }

        /* renamed from: b */
        public final Boolean invoke(String str) {
            return Boolean.valueOf(cm.l.a(str, this.f16366e));
        }
    }

    public k(Context context) {
        Object obj;
        cm.l.f(context, "context");
        this.f16309a = context;
        Iterator it = m.d(context, d.f16340e).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f16310b = (Activity) obj;
        this.f16316h = new ql.h();
        om.m a10 = v.a(q.i());
        this.f16317i = a10;
        this.f16318j = om.f.b(a10);
        om.m a11 = v.a(q.i());
        this.f16319k = a11;
        this.f16320l = om.f.b(a11);
        this.f16321m = new LinkedHashMap();
        this.f16322n = new LinkedHashMap();
        this.f16323o = new LinkedHashMap();
        this.f16324p = new LinkedHashMap();
        this.f16327s = new CopyOnWriteArrayList();
        this.f16328t = k.b.INITIALIZED;
        this.f16329u = new j(this);
        this.f16330v = new o(this);
        this.f16331w = true;
        this.f16332x = new c0();
        this.f16333y = new LinkedHashMap();
        this.B = new LinkedHashMap();
        c0 c0Var = this.f16332x;
        c0Var.c(new r(c0Var));
        this.f16332x.c(new b(this.f16309a));
        this.D = new ArrayList();
        this.E = j.a(new m(this));
        om.l b10 = om.r.b(1, 0, nm.a.DROP_OLDEST, 2, (Object) null);
        this.F = b10;
        this.G = om.f.a(b10);
    }

    private final int E() {
        ql.h<h> hVar = this.f16316h;
        int i10 = 0;
        if (!(hVar instanceof Collection) || !hVar.isEmpty()) {
            for (h e10 : hVar) {
                if ((!(e10.e() instanceof q)) && (i10 = i10 + 1) < 0) {
                    q.q();
                }
            }
        }
        return i10;
    }

    private final List K(ql.h hVar) {
        p pVar;
        ArrayList arrayList = new ArrayList();
        h hVar2 = (h) this.f16316h.H();
        if (hVar2 == null || (pVar = hVar2.e()) == null) {
            pVar = F();
        }
        if (hVar != null) {
            Iterator it = hVar.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                p y10 = y(pVar, iVar.c());
                if (y10 != null) {
                    arrayList.add(iVar.e(this.f16309a, y10, G(), this.f16326r));
                    pVar = y10;
                } else {
                    String b10 = p.f16420n.b(this.f16309a, iVar.c());
                    throw new IllegalStateException(("Restore State failed: destination " + b10 + " cannot be found from the current destination " + pVar).toString());
                }
            }
        }
        return arrayList;
    }

    private final boolean L(p pVar, Bundle bundle) {
        p e10;
        int i10;
        h C2 = C();
        int H2 = pVar instanceof q ? q.f16440t.a((q) pVar).H() : pVar.H();
        if (C2 == null || (e10 = C2.e()) == null || H2 != e10.H()) {
            return false;
        }
        ql.h<h> hVar = new ql.h();
        ql.h hVar2 = this.f16316h;
        ListIterator listIterator = hVar2.listIterator(hVar2.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (((h) listIterator.previous()).e() == pVar) {
                    i10 = listIterator.nextIndex();
                    break;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        while (q.k(this.f16316h) >= i10) {
            h hVar3 = (h) this.f16316h.removeLast();
            s0(hVar3);
            hVar.addFirst(new h(hVar3, hVar3.e().s(bundle)));
        }
        for (h hVar4 : hVar) {
            q Y = hVar4.e().Y();
            if (Y != null) {
                N(hVar4, A(Y.H()));
            }
            this.f16316h.add(hVar4);
        }
        for (h hVar5 : hVar) {
            this.f16332x.d(hVar5.e().T()).g(hVar5);
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final void M(k kVar, s sVar, k.a aVar) {
        cm.l.f(kVar, "this$0");
        cm.l.f(sVar, "<anonymous parameter 0>");
        cm.l.f(aVar, "event");
        kVar.f16328t = aVar.b();
        if (kVar.f16312d != null) {
            Iterator it = kVar.f16316h.iterator();
            while (it.hasNext()) {
                ((h) it.next()).h(aVar);
            }
        }
    }

    private final void N(h hVar, h hVar2) {
        this.f16321m.put(hVar, hVar2);
        if (this.f16322n.get(hVar2) == null) {
            this.f16322n.put(hVar2, new AtomicInteger(0));
        }
        Object obj = this.f16322n.get(hVar2);
        cm.l.c(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ee A[LOOP:1: B:32:0x00e8->B:34:0x00ee, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void Q(t0.p r22, android.os.Bundle r23, t0.v r24, t0.b0.a r25) {
        /*
            r21 = this;
            r6 = r21
            r3 = r24
            java.util.Map r0 = r6.f16333y
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L_0x0021
            java.lang.Object r1 = r0.next()
            t0.k$b r1 = (t0.k.b) r1
            r1.m(r2)
            goto L_0x0010
        L_0x0021:
            cm.r r7 = new cm.r
            r7.<init>()
            r8 = 0
            if (r3 == 0) goto L_0x005c
            java.lang.String r0 = r24.f()
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = r24.f()
            cm.l.c(r0)
            boolean r1 = r24.g()
            boolean r4 = r24.i()
            boolean r0 = r6.c0(r0, r1, r4)
        L_0x0042:
            r9 = r0
            goto L_0x005d
        L_0x0044:
            int r0 = r24.e()
            r1 = -1
            if (r0 == r1) goto L_0x005c
            int r0 = r24.e()
            boolean r1 = r24.g()
            boolean r4 = r24.i()
            boolean r0 = r6.b0(r0, r1, r4)
            goto L_0x0042
        L_0x005c:
            r9 = r8
        L_0x005d:
            android.os.Bundle r0 = r22.s(r23)
            if (r3 == 0) goto L_0x0088
            boolean r1 = r24.j()
            if (r1 != r2) goto L_0x0088
            java.util.Map r1 = r6.f16323o
            int r4 = r22.H()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L_0x0088
            int r1 = r22.H()
            r4 = r25
            boolean r0 = r6.j0(r1, r0, r3, r4)
            r7.f20231e = r0
            r20 = r8
            goto L_0x00d9
        L_0x0088:
            r4 = r25
            if (r3 == 0) goto L_0x009b
            boolean r1 = r24.h()
            if (r1 != r2) goto L_0x009b
            boolean r1 = r21.L(r22, r23)
            if (r1 == 0) goto L_0x009b
            r20 = r2
            goto L_0x009d
        L_0x009b:
            r20 = r8
        L_0x009d:
            if (r20 != 0) goto L_0x00d9
            t0.h$a r10 = t0.h.f16285s
            android.content.Context r11 = r6.f16309a
            androidx.lifecycle.k$b r14 = r21.G()
            t0.l r15 = r6.f16326r
            r16 = 0
            r17 = 0
            r18 = 96
            r19 = 0
            r12 = r22
            r13 = r0
            t0.h r1 = t0.h.a.b(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            t0.c0 r2 = r6.f16332x
            java.lang.String r5 = r22.T()
            t0.b0 r2 = r2.d(r5)
            java.util.List r5 = ql.p.d(r1)
            t0.k$n r10 = new t0.k$n
            r1 = r22
            r10.<init>(r7, r6, r1, r0)
            r0 = r21
            r1 = r2
            r2 = r5
            r3 = r24
            r4 = r25
            r5 = r10
            r0.R(r1, r2, r3, r4, r5)
        L_0x00d9:
            r21.u0()
            java.util.Map r0 = r6.f16333y
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x00e8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00f8
            java.lang.Object r1 = r0.next()
            t0.k$b r1 = (t0.k.b) r1
            r1.m(r8)
            goto L_0x00e8
        L_0x00f8:
            if (r9 != 0) goto L_0x0105
            boolean r0 = r7.f20231e
            if (r0 != 0) goto L_0x0105
            if (r20 == 0) goto L_0x0101
            goto L_0x0105
        L_0x0101:
            r21.t0()
            goto L_0x0108
        L_0x0105:
            r21.u()
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.k.Q(t0.p, android.os.Bundle, t0.v, t0.b0$a):void");
    }

    private final void R(b0 b0Var, List list, v vVar, b0.a aVar, bm.l lVar) {
        this.f16334z = lVar;
        b0Var.e(list, vVar, aVar);
        this.f16334z = null;
    }

    private final void T(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f16313e;
        if (!(bundle2 == null || (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) == null)) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                c0 c0Var = this.f16332x;
                cm.l.e(next, "name");
                b0 d10 = c0Var.d(next);
                Bundle bundle3 = bundle2.getBundle(next);
                if (bundle3 != null) {
                    d10.h(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f16314f;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            int i10 = 0;
            while (i10 < length) {
                Parcelable parcelable = parcelableArr[i10];
                cm.l.d(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                i iVar = (i) parcelable;
                p x10 = x(iVar.c());
                if (x10 != null) {
                    h e10 = iVar.e(this.f16309a, x10, G(), this.f16326r);
                    b0 d11 = this.f16332x.d(x10.T());
                    Map map = this.f16333y;
                    Object obj = map.get(d11);
                    if (obj == null) {
                        obj = new b(this, d11);
                        map.put(d11, obj);
                    }
                    this.f16316h.add(e10);
                    ((b) obj).o(e10);
                    q Y = e10.e().Y();
                    if (Y != null) {
                        N(e10, A(Y.H()));
                    }
                    i10++;
                } else {
                    String b10 = p.f16420n.b(this.f16309a, iVar.c());
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + b10 + " cannot be found from the current destination " + D());
                }
            }
            u0();
            this.f16314f = null;
        }
        ArrayList<b0> arrayList = new ArrayList<>();
        for (Object next2 : this.f16332x.e().values()) {
            if (!((b0) next2).c()) {
                arrayList.add(next2);
            }
        }
        for (b0 b0Var : arrayList) {
            Map map2 = this.f16333y;
            Object obj2 = map2.get(b0Var);
            if (obj2 == null) {
                obj2 = new b(this, b0Var);
                map2.put(b0Var, obj2);
            }
            b0Var.f((b) obj2);
        }
        if (this.f16312d == null || !this.f16316h.isEmpty()) {
            u();
            return;
        }
        if (!this.f16315g && (activity = this.f16310b) != null) {
            cm.l.c(activity);
            if (J(activity.getIntent())) {
                return;
            }
        }
        q qVar = this.f16312d;
        cm.l.c(qVar);
        Q(qVar, bundle, (v) null, (b0.a) null);
    }

    public static /* synthetic */ boolean Y(k kVar, String str, boolean z10, boolean z11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return kVar.X(str, z10, z11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
    }

    private final void a0(b0 b0Var, h hVar, boolean z10, bm.l lVar) {
        this.A = lVar;
        b0Var.j(hVar, z10);
        this.A = null;
    }

    private final boolean b0(int i10, boolean z10, boolean z11) {
        p pVar;
        if (this.f16316h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = y.k0(this.f16316h).iterator();
        while (true) {
            if (!it.hasNext()) {
                pVar = null;
                break;
            }
            pVar = ((h) it.next()).e();
            b0 d10 = this.f16332x.d(pVar.T());
            if (z10 || pVar.H() != i10) {
                arrayList.add(d10);
            }
            if (pVar.H() == i10) {
                break;
            }
        }
        if (pVar != null) {
            return v(arrayList, pVar, z10, z11);
        }
        String b10 = p.f16420n.b(this.f16309a, i10);
        Log.i("NavController", "Ignoring popBackStack to destination " + b10 + " as it was not found on the current back stack");
        return false;
    }

    private final boolean c0(String str, boolean z10, boolean z11) {
        p pVar;
        Object obj;
        if (this.f16316h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ql.h hVar = this.f16316h;
        ListIterator listIterator = hVar.listIterator(hVar.size());
        while (true) {
            pVar = null;
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            h hVar2 = (h) obj;
            boolean h02 = hVar2.e().h0(str, hVar2.c());
            if (z10 || !h02) {
                arrayList.add(this.f16332x.d(hVar2.e().T()));
                continue;
            }
            if (h02) {
                break;
            }
        }
        h hVar3 = (h) obj;
        if (hVar3 != null) {
            pVar = hVar3.e();
        }
        if (pVar != null) {
            return v(arrayList, pVar, z10, z11);
        }
        Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
        return false;
    }

    static /* synthetic */ boolean d0(k kVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return kVar.b0(i10, z10, z11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    /* access modifiers changed from: private */
    public final void e0(h hVar, boolean z10, ql.h hVar2) {
        l lVar;
        t c10;
        Set set;
        h hVar3 = (h) this.f16316h.F();
        if (cm.l.a(hVar3, hVar)) {
            this.f16316h.removeLast();
            b bVar = (b) this.f16333y.get(I().d(hVar3.e().T()));
            boolean z11 = true;
            if ((bVar == null || (c10 = bVar.c()) == null || (set = (Set) c10.getValue()) == null || !set.contains(hVar3)) && !this.f16322n.containsKey(hVar3)) {
                z11 = false;
            }
            k.b b10 = hVar3.d0().b();
            k.b bVar2 = k.b.CREATED;
            if (b10.b(bVar2)) {
                if (z10) {
                    hVar3.m(bVar2);
                    hVar2.addFirst(new i(hVar3));
                }
                if (!z11) {
                    hVar3.m(k.b.DESTROYED);
                    s0(hVar3);
                } else {
                    hVar3.m(bVar2);
                }
            }
            if (!z10 && !z11 && (lVar = this.f16326r) != null) {
                lVar.h(hVar3.f());
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + hVar.e() + ", which is not the top of the back stack (" + hVar3.e() + ')').toString());
    }

    static /* synthetic */ void f0(k kVar, h hVar, boolean z10, ql.h hVar2, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                hVar2 = new ql.h();
            }
            kVar.e0(hVar, z10, hVar2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
    }

    private final boolean j0(int i10, Bundle bundle, v vVar, b0.a aVar) {
        if (!this.f16323o.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        String str = (String) this.f16323o.get(Integer.valueOf(i10));
        boolean unused = v.A(this.f16323o.values(), new p(str));
        return w(K((ql.h) y.c(this.f16324p).remove(str)), bundle, vVar, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: t0.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: t0.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: t0.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: t0.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: t0.q} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(t0.p r33, android.os.Bundle r34, t0.h r35, java.util.List r36) {
        /*
            r32 = this;
            r6 = r32
            r7 = r33
            r15 = r34
            r14 = r35
            r13 = r36
            t0.p r12 = r35.e()
            boolean r0 = r12 instanceof t0.d
            if (r0 != 0) goto L_0x0046
        L_0x0012:
            ql.h r0 = r6.f16316h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0046
            ql.h r0 = r6.f16316h
            java.lang.Object r0 = r0.F()
            t0.h r0 = (t0.h) r0
            t0.p r0 = r0.e()
            boolean r0 = r0 instanceof t0.d
            if (r0 == 0) goto L_0x0046
            ql.h r0 = r6.f16316h
            java.lang.Object r0 = r0.F()
            t0.h r0 = (t0.h) r0
            t0.p r0 = r0.e()
            int r1 = r0.H()
            r2 = 1
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r32
            boolean r0 = d0(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0012
        L_0x0046:
            ql.h r5 = new ql.h
            r5.<init>()
            boolean r0 = r7 instanceof t0.q
            r4 = 1
            r18 = 0
            if (r0 == 0) goto L_0x0103
            r0 = r12
        L_0x0053:
            cm.l.c(r0)
            t0.q r3 = r0.Y()
            if (r3 == 0) goto L_0x00ee
            int r0 = r36.size()
            java.util.ListIterator r0 = r13.listIterator(r0)
        L_0x0064:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x007c
            java.lang.Object r1 = r0.previous()
            r2 = r1
            t0.h r2 = (t0.h) r2
            t0.p r2 = r2.e()
            boolean r2 = cm.l.a(r2, r3)
            if (r2 == 0) goto L_0x0064
            goto L_0x007e
        L_0x007c:
            r1 = r18
        L_0x007e:
            t0.h r1 = (t0.h) r1
            if (r1 != 0) goto L_0x00ae
            t0.h$a r8 = t0.h.f16285s
            android.content.Context r9 = r6.f16309a
            androidx.lifecycle.k$b r0 = r32.G()
            t0.l r1 = r6.f16326r
            r2 = 0
            r16 = 0
            r17 = 96
            r19 = 0
            r10 = r3
            r11 = r34
            r20 = r12
            r12 = r0
            r0 = r13
            r13 = r1
            r1 = r14
            r14 = r2
            r2 = r15
            r15 = r16
            r16 = r17
            r17 = r19
            t0.h r8 = t0.h.a.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r31 = r8
            r8 = r1
            r1 = r31
            goto L_0x00b3
        L_0x00ae:
            r20 = r12
            r0 = r13
            r8 = r14
            r2 = r15
        L_0x00b3:
            r5.addFirst(r1)
            ql.h r1 = r6.f16316h
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x00e8
            ql.h r1 = r6.f16316h
            java.lang.Object r1 = r1.F()
            t0.h r1 = (t0.h) r1
            t0.p r1 = r1.e()
            if (r1 != r3) goto L_0x00e8
            ql.h r1 = r6.f16316h
            java.lang.Object r1 = r1.F()
            t0.h r1 = (t0.h) r1
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            r13 = r0
            r0 = r32
            r14 = r2
            r2 = r9
            r9 = r3
            r3 = r10
            r10 = r4
            r4 = r11
            r11 = r5
            r5 = r12
            f0(r0, r1, r2, r3, r4, r5)
            goto L_0x00f5
        L_0x00e8:
            r13 = r0
            r14 = r2
            r9 = r3
            r10 = r4
            r11 = r5
            goto L_0x00f5
        L_0x00ee:
            r9 = r3
            r10 = r4
            r11 = r5
            r20 = r12
            r8 = r14
            r14 = r15
        L_0x00f5:
            if (r9 == 0) goto L_0x0109
            if (r9 != r7) goto L_0x00fa
            goto L_0x0109
        L_0x00fa:
            r0 = r9
            r4 = r10
            r5 = r11
            r15 = r14
            r12 = r20
            r14 = r8
            goto L_0x0053
        L_0x0103:
            r10 = r4
            r11 = r5
            r20 = r12
            r8 = r14
            r14 = r15
        L_0x0109:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0112
            r12 = r20
            goto L_0x011c
        L_0x0112:
            java.lang.Object r0 = r11.y()
            t0.h r0 = (t0.h) r0
            t0.p r12 = r0.e()
        L_0x011c:
            if (r12 == 0) goto L_0x0184
            int r0 = r12.H()
            t0.p r0 = r6.x(r0)
            if (r0 == r12) goto L_0x0184
            t0.q r12 = r12.Y()
            if (r12 == 0) goto L_0x011c
            if (r14 == 0) goto L_0x0139
            boolean r0 = r34.isEmpty()
            if (r0 != r10) goto L_0x0139
            r15 = r18
            goto L_0x013a
        L_0x0139:
            r15 = r14
        L_0x013a:
            int r0 = r36.size()
            java.util.ListIterator r0 = r13.listIterator(r0)
        L_0x0142:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x015a
            java.lang.Object r1 = r0.previous()
            r2 = r1
            t0.h r2 = (t0.h) r2
            t0.p r2 = r2.e()
            boolean r2 = cm.l.a(r2, r12)
            if (r2 == 0) goto L_0x0142
            goto L_0x015c
        L_0x015a:
            r1 = r18
        L_0x015c:
            t0.h r1 = (t0.h) r1
            if (r1 != 0) goto L_0x0180
            t0.h$a r21 = t0.h.f16285s
            android.content.Context r0 = r6.f16309a
            android.os.Bundle r24 = r12.s(r15)
            androidx.lifecycle.k$b r25 = r32.G()
            t0.l r1 = r6.f16326r
            r27 = 0
            r28 = 0
            r29 = 96
            r30 = 0
            r22 = r0
            r23 = r12
            r26 = r1
            t0.h r1 = t0.h.a.b(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x0180:
            r11.addFirst(r1)
            goto L_0x011c
        L_0x0184:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x018d
            r12 = r20
            goto L_0x0197
        L_0x018d:
            java.lang.Object r0 = r11.y()
            t0.h r0 = (t0.h) r0
            t0.p r12 = r0.e()
        L_0x0197:
            ql.h r0 = r6.f16316h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01e0
            ql.h r0 = r6.f16316h
            java.lang.Object r0 = r0.F()
            t0.h r0 = (t0.h) r0
            t0.p r0 = r0.e()
            boolean r0 = r0 instanceof t0.q
            if (r0 == 0) goto L_0x01e0
            ql.h r0 = r6.f16316h
            java.lang.Object r0 = r0.F()
            t0.h r0 = (t0.h) r0
            t0.p r0 = r0.e()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.navigation.NavGraph"
            cm.l.d(r0, r1)
            t0.q r0 = (t0.q) r0
            int r1 = r12.H()
            r2 = 0
            t0.p r0 = r0.s0(r1, r2)
            if (r0 != 0) goto L_0x01e0
            ql.h r0 = r6.f16316h
            java.lang.Object r0 = r0.F()
            r1 = r0
            t0.h r1 = (t0.h) r1
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r32
            f0(r0, r1, r2, r3, r4, r5)
            goto L_0x0197
        L_0x01e0:
            ql.h r0 = r6.f16316h
            java.lang.Object r0 = r0.B()
            t0.h r0 = (t0.h) r0
            if (r0 != 0) goto L_0x01f0
            java.lang.Object r0 = r11.B()
            t0.h r0 = (t0.h) r0
        L_0x01f0:
            if (r0 == 0) goto L_0x01f7
            t0.p r0 = r0.e()
            goto L_0x01f9
        L_0x01f7:
            r0 = r18
        L_0x01f9:
            t0.q r1 = r6.f16312d
            boolean r0 = cm.l.a(r0, r1)
            if (r0 != 0) goto L_0x025a
            int r0 = r36.size()
            java.util.ListIterator r0 = r13.listIterator(r0)
        L_0x0209:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x0227
            java.lang.Object r1 = r0.previous()
            r2 = r1
            t0.h r2 = (t0.h) r2
            t0.p r2 = r2.e()
            t0.q r3 = r6.f16312d
            cm.l.c(r3)
            boolean r2 = cm.l.a(r2, r3)
            if (r2 == 0) goto L_0x0209
            r18 = r1
        L_0x0227:
            t0.h r18 = (t0.h) r18
            if (r18 != 0) goto L_0x0255
            t0.h$a r19 = t0.h.f16285s
            android.content.Context r0 = r6.f16309a
            t0.q r1 = r6.f16312d
            cm.l.c(r1)
            t0.q r2 = r6.f16312d
            cm.l.c(r2)
            android.os.Bundle r22 = r2.s(r14)
            androidx.lifecycle.k$b r23 = r32.G()
            t0.l r2 = r6.f16326r
            r25 = 0
            r26 = 0
            r27 = 96
            r28 = 0
            r20 = r0
            r21 = r1
            r24 = r2
            t0.h r18 = t0.h.a.b(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x0255:
            r0 = r18
            r11.addFirst(r0)
        L_0x025a:
            java.util.Iterator r0 = r11.iterator()
        L_0x025e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02aa
            java.lang.Object r1 = r0.next()
            t0.h r1 = (t0.h) r1
            t0.c0 r2 = r6.f16332x
            t0.p r3 = r1.e()
            java.lang.String r3 = r3.T()
            t0.b0 r2 = r2.d(r3)
            java.util.Map r3 = r6.f16333y
            java.lang.Object r2 = r3.get(r2)
            if (r2 == 0) goto L_0x0286
            t0.k$b r2 = (t0.k.b) r2
            r2.o(r1)
            goto L_0x025e
        L_0x0286:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NavigatorBackStack for "
            r0.append(r1)
            java.lang.String r1 = r33.T()
            r0.append(r1)
            java.lang.String r1 = " should already be created"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x02aa:
            ql.h r0 = r6.f16316h
            r0.addAll(r11)
            ql.h r0 = r6.f16316h
            r0.add(r8)
            java.util.List r0 = ql.y.j0(r11, r8)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x02be:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02e0
            java.lang.Object r1 = r0.next()
            t0.h r1 = (t0.h) r1
            t0.p r2 = r1.e()
            t0.q r2 = r2.Y()
            if (r2 == 0) goto L_0x02be
            int r2 = r2.H()
            t0.h r2 = r6.A(r2)
            r6.N(r1, r2)
            goto L_0x02be
        L_0x02e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.k.p(t0.p, android.os.Bundle, t0.h, java.util.List):void");
    }

    static /* synthetic */ void q(k kVar, p pVar, Bundle bundle, h hVar, List list, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 8) != 0) {
                list = q.i();
            }
            kVar.p(pVar, bundle, hVar, list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
    }

    private final boolean q0() {
        int i10 = 0;
        if (!this.f16315g) {
            return false;
        }
        Activity activity = this.f16310b;
        cm.l.c(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        cm.l.c(extras);
        int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
        cm.l.c(intArray);
        List H2 = m.H(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        int intValue = ((Number) v.D(H2)).intValue();
        if (parcelableArrayList != null) {
            Bundle bundle = (Bundle) v.D(parcelableArrayList);
        }
        if (H2.isEmpty()) {
            return false;
        }
        p y10 = y(F(), intValue);
        if (y10 instanceof q) {
            intValue = q.f16440t.a((q) y10).H();
        }
        p D2 = D();
        if (D2 == null || intValue != D2.H()) {
            return false;
        }
        n t10 = t();
        Bundle a10 = androidx.core.os.d.a(pl.t.a("android-support-nav:controller:deepLinkIntent", intent));
        Bundle bundle2 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
        if (bundle2 != null) {
            a10.putAll(bundle2);
        }
        t10.e(a10);
        for (Object next : H2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                q.r();
            }
            t10.a(((Number) next).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i10) : null);
            i10 = i11;
        }
        t10.b().B();
        Activity activity2 = this.f16310b;
        if (activity2 == null) {
            return true;
        }
        activity2.finish();
        return true;
    }

    private final boolean r0() {
        int H2;
        q Y;
        int x02;
        p D2 = D();
        cm.l.c(D2);
        q qVar = D2;
        do {
            H2 = qVar.H();
            Y = qVar.Y();
            if (Y == null) {
                return false;
            }
            x02 = Y.x0();
            qVar = Y;
        } while (x02 == H2);
        Bundle bundle = new Bundle();
        Activity activity = this.f16310b;
        if (activity != null) {
            cm.l.c(activity);
            if (activity.getIntent() != null) {
                Activity activity2 = this.f16310b;
                cm.l.c(activity2);
                if (activity2.getIntent().getData() != null) {
                    Activity activity3 = this.f16310b;
                    cm.l.c(activity3);
                    bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity3.getIntent());
                    q qVar2 = this.f16312d;
                    cm.l.c(qVar2);
                    Activity activity4 = this.f16310b;
                    cm.l.c(activity4);
                    Intent intent = activity4.getIntent();
                    cm.l.e(intent, "activity!!.intent");
                    p.b j02 = qVar2.j0(new o(intent));
                    if ((j02 != null ? j02.c() : null) != null) {
                        bundle.putAll(j02.b().s(j02.c()));
                    }
                }
            }
        }
        n.g(new n(this), Y.H(), (Bundle) null, 2, (Object) null).e(bundle).b().B();
        Activity activity5 = this.f16310b;
        if (activity5 == null) {
            return true;
        }
        activity5.finish();
        return true;
    }

    private final boolean s(int i10) {
        for (b m10 : this.f16333y.values()) {
            m10.m(true);
        }
        boolean j02 = j0(i10, (Bundle) null, x.a(e.f16341e), (b0.a) null);
        for (b m11 : this.f16333y.values()) {
            m11.m(false);
        }
        return j02 && b0(i10, true, false);
    }

    private final boolean u() {
        while (!this.f16316h.isEmpty() && (((h) this.f16316h.F()).e() instanceof q)) {
            f0(this, (h) this.f16316h.F(), false, (ql.h) null, 6, (Object) null);
        }
        h hVar = (h) this.f16316h.H();
        if (hVar != null) {
            this.D.add(hVar);
        }
        this.C++;
        t0();
        int i10 = this.C - 1;
        this.C = i10;
        if (i10 == 0) {
            List<h> v02 = y.v0(this.D);
            this.D.clear();
            for (h hVar2 : v02) {
                Iterator it = this.f16327s.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).a(this, hVar2.e(), hVar2.c());
                }
                this.F.b(hVar2);
            }
            this.f16317i.b(y.v0(this.f16316h));
            this.f16319k.b(g0());
        }
        return hVar != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (E() > 1) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void u0() {
        /*
            r3 = this;
            androidx.activity.p r0 = r3.f16330v
            boolean r1 = r3.f16331w
            if (r1 == 0) goto L_0x000e
            int r1 = r3.E()
            r2 = 1
            if (r1 <= r2) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            r0.j(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.k.u0():void");
    }

    private final boolean v(List list, p pVar, boolean z10, boolean z11) {
        boolean z12 = z11;
        cm.r rVar = new cm.r();
        ql.h hVar = new ql.h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cm.r rVar2 = new cm.r();
            a0((b0) it.next(), (h) this.f16316h.F(), z12, new f(rVar2, rVar, this, z11, hVar));
            if (!rVar2.f20231e) {
                break;
            }
        }
        if (z12) {
            if (!z10) {
                for (p H2 : o.r(m.d(pVar, g.f16347e), new h(this))) {
                    Map map = this.f16323o;
                    Integer valueOf = Integer.valueOf(H2.H());
                    i iVar = (i) hVar.B();
                    map.put(valueOf, iVar != null ? iVar.d() : null);
                }
            }
            if (!hVar.isEmpty()) {
                i iVar2 = (i) hVar.y();
                for (p H3 : o.r(m.d(x(iVar2.c()), i.f16349e), new j(this))) {
                    this.f16323o.put(Integer.valueOf(H3.H()), iVar2.d());
                }
                this.f16324p.put(iVar2.d(), hVar);
            }
        }
        u0();
        return rVar.f20231e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        r4 = (r4 = (t0.h) ql.y.e0(r3)).e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean w(java.util.List r12, android.os.Bundle r13, t0.v r14, t0.b0.a r15) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r12
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0011:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x002a
            java.lang.Object r3 = r1.next()
            r4 = r3
            t0.h r4 = (t0.h) r4
            t0.p r4 = r4.e()
            boolean r4 = r4 instanceof t0.q
            if (r4 != 0) goto L_0x0011
            r2.add(r3)
            goto L_0x0011
        L_0x002a:
            java.util.Iterator r1 = r2.iterator()
        L_0x002e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0076
            java.lang.Object r2 = r1.next()
            t0.h r2 = (t0.h) r2
            java.lang.Object r3 = ql.y.f0(r0)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0055
            java.lang.Object r4 = ql.y.e0(r3)
            t0.h r4 = (t0.h) r4
            if (r4 == 0) goto L_0x0055
            t0.p r4 = r4.e()
            if (r4 == 0) goto L_0x0055
            java.lang.String r4 = r4.T()
            goto L_0x0056
        L_0x0055:
            r4 = 0
        L_0x0056:
            t0.p r5 = r2.e()
            java.lang.String r5 = r5.T()
            boolean r4 = cm.l.a(r4, r5)
            if (r4 == 0) goto L_0x006a
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r2)
            goto L_0x002e
        L_0x006a:
            t0.h[] r2 = new t0.h[]{r2}
            java.util.List r2 = ql.q.n(r2)
            r0.add(r2)
            goto L_0x002e
        L_0x0076:
            cm.r r1 = new cm.r
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x007f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b8
            java.lang.Object r2 = r0.next()
            java.util.List r2 = (java.util.List) r2
            t0.c0 r3 = r11.f16332x
            java.lang.Object r4 = ql.y.U(r2)
            t0.h r4 = (t0.h) r4
            t0.p r4 = r4.e()
            java.lang.String r4 = r4.T()
            t0.b0 r9 = r3.d(r4)
            cm.s r6 = new cm.s
            r6.<init>()
            t0.k$k r10 = new t0.k$k
            r3 = r10
            r4 = r1
            r5 = r12
            r7 = r11
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r3 = r11
            r4 = r9
            r5 = r2
            r6 = r14
            r7 = r15
            r8 = r10
            r3.R(r4, r5, r6, r7, r8)
            goto L_0x007f
        L_0x00b8:
            boolean r12 = r1.f20231e
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.k.w(java.util.List, android.os.Bundle, t0.v, t0.b0$a):boolean");
    }

    private final p y(p pVar, int i10) {
        q qVar;
        if (pVar.H() == i10) {
            return pVar;
        }
        if (pVar instanceof q) {
            qVar = (q) pVar;
        } else {
            qVar = pVar.Y();
            cm.l.c(qVar);
        }
        return qVar.r0(i10);
    }

    private final String z(int[] iArr) {
        q qVar;
        q qVar2 = this.f16312d;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            p pVar = null;
            if (i10 >= length) {
                return null;
            }
            int i11 = iArr[i10];
            if (i10 == 0) {
                q qVar3 = this.f16312d;
                cm.l.c(qVar3);
                if (qVar3.H() == i11) {
                    pVar = this.f16312d;
                }
            } else {
                cm.l.c(qVar2);
                pVar = qVar2.r0(i11);
            }
            if (pVar == null) {
                return p.f16420n.b(this.f16309a, i11);
            }
            if (i10 != iArr.length - 1 && (pVar instanceof q)) {
                while (true) {
                    qVar = (q) pVar;
                    cm.l.c(qVar);
                    if (!(qVar.r0(qVar.x0()) instanceof q)) {
                        break;
                    }
                    pVar = qVar.r0(qVar.x0());
                }
                qVar2 = qVar;
            }
            i10++;
        }
    }

    public h A(int i10) {
        Object obj;
        ql.h hVar = this.f16316h;
        ListIterator listIterator = hVar.listIterator(hVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((h) obj).e().H() == i10) {
                break;
            }
        }
        h hVar2 = (h) obj;
        if (hVar2 != null) {
            return hVar2;
        }
        throw new IllegalArgumentException(("No destination with ID " + i10 + " is on the NavController's back stack. The current destination is " + D()).toString());
    }

    public final Context B() {
        return this.f16309a;
    }

    public h C() {
        return (h) this.f16316h.H();
    }

    public p D() {
        h C2 = C();
        if (C2 != null) {
            return C2.e();
        }
        return null;
    }

    public q F() {
        q qVar = this.f16312d;
        if (qVar != null) {
            cm.l.d(qVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            return qVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    public final k.b G() {
        return this.f16325q == null ? k.b.CREATED : this.f16328t;
    }

    public u H() {
        return (u) this.E.getValue();
    }

    public c0 I() {
        return this.f16332x;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01f0 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean J(android.content.Intent r20) {
        /*
            r19 = this;
            r7 = r19
            r1 = r20
            r8 = 0
            if (r1 != 0) goto L_0x0008
            return r8
        L_0x0008:
            android.os.Bundle r2 = r20.getExtras()
            java.lang.String r3 = "NavController"
            r9 = 0
            if (r2 == 0) goto L_0x002d
            java.lang.String r0 = "android-support-nav:controller:deepLinkIds"
            int[] r0 = r2.getIntArray(r0)     // Catch:{ Exception -> 0x0018 }
            goto L_0x002e
        L_0x0018:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "handleDeepLink() could not extract deepLink from "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r3, r4, r0)
        L_0x002d:
            r0 = r9
        L_0x002e:
            if (r2 == 0) goto L_0x0037
            java.lang.String r4 = "android-support-nav:controller:deepLinkArgs"
            java.util.ArrayList r4 = r2.getParcelableArrayList(r4)
            goto L_0x0038
        L_0x0037:
            r4 = r9
        L_0x0038:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            if (r2 == 0) goto L_0x0046
            java.lang.String r6 = "android-support-nav:controller:deepLinkExtras"
            android.os.Bundle r2 = r2.getBundle(r6)
            goto L_0x0047
        L_0x0046:
            r2 = r9
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r5.putAll(r2)
        L_0x004c:
            r10 = 1
            if (r0 == 0) goto L_0x0052
            int r2 = r0.length
            if (r2 != 0) goto L_0x0079
        L_0x0052:
            t0.q r2 = r7.f16312d
            cm.l.c(r2)
            t0.o r6 = new t0.o
            r6.<init>(r1)
            t0.p$b r2 = r2.j0(r6)
            if (r2 == 0) goto L_0x0079
            t0.p r0 = r2.b()
            int[] r4 = t0.p.y(r0, r9, r10, r9)
            android.os.Bundle r2 = r2.c()
            android.os.Bundle r0 = r0.s(r2)
            if (r0 == 0) goto L_0x0077
            r5.putAll(r0)
        L_0x0077:
            r0 = r4
            r4 = r9
        L_0x0079:
            if (r0 == 0) goto L_0x01f0
            int r2 = r0.length
            if (r2 != 0) goto L_0x0080
            goto L_0x01f0
        L_0x0080:
            java.lang.String r2 = r7.z(r0)
            if (r2 == 0) goto L_0x00a3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Could not find destination "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = " in the navigation graph, ignoring the deep link from "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r3, r0)
            return r8
        L_0x00a3:
            java.lang.String r2 = "android-support-nav:controller:deepLinkIntent"
            r5.putParcelable(r2, r1)
            int r2 = r0.length
            android.os.Bundle[] r11 = new android.os.Bundle[r2]
            r3 = r8
        L_0x00ac:
            if (r3 >= r2) goto L_0x00c8
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r6.putAll(r5)
            if (r4 == 0) goto L_0x00c3
            java.lang.Object r12 = r4.get(r3)
            android.os.Bundle r12 = (android.os.Bundle) r12
            if (r12 == 0) goto L_0x00c3
            r6.putAll(r12)
        L_0x00c3:
            r11[r3] = r6
            int r3 = r3 + 1
            goto L_0x00ac
        L_0x00c8:
            int r2 = r20.getFlags()
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 & r2
            if (r3 == 0) goto L_0x00f7
            r4 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r4
            if (r2 != 0) goto L_0x00f7
            r1.addFlags(r4)
            android.content.Context r0 = r7.f16309a
            androidx.core.app.s r0 = androidx.core.app.s.s(r0)
            androidx.core.app.s r0 = r0.n(r1)
            java.lang.String r1 = "create(context)\n        …ntWithParentStack(intent)"
            cm.l.e(r0, r1)
            r0.B()
            android.app.Activity r0 = r7.f16310b
            if (r0 == 0) goto L_0x00f6
            r0.finish()
            r0.overridePendingTransition(r8, r8)
        L_0x00f6:
            return r10
        L_0x00f7:
            java.lang.String r12 = "Deep Linking failed: destination "
            if (r3 == 0) goto L_0x015e
            ql.h r1 = r7.f16316h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0115
            t0.q r1 = r7.f16312d
            cm.l.c(r1)
            int r2 = r1.H()
            r3 = 1
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r19
            d0(r1, r2, r3, r4, r5, r6)
        L_0x0115:
            int r1 = r0.length
            if (r8 >= r1) goto L_0x015b
            r1 = r0[r8]
            int r2 = r8 + 1
            r3 = r11[r8]
            t0.p r4 = r7.x(r1)
            if (r4 == 0) goto L_0x0132
            t0.k$l r1 = new t0.k$l
            r1.<init>(r4, r7)
            t0.v r1 = t0.x.a(r1)
            r7.Q(r4, r3, r1, r9)
            r8 = r2
            goto L_0x0115
        L_0x0132:
            t0.p$a r0 = t0.p.f16420n
            android.content.Context r2 = r7.f16309a
            java.lang.String r0 = r0.b(r2, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r0)
            java.lang.String r0 = " cannot be found from the current destination "
            r2.append(r0)
            t0.p r0 = r19.D()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x015b:
            r7.f16315g = r10
            return r10
        L_0x015e:
            t0.q r1 = r7.f16312d
            int r2 = r0.length
            r3 = r8
        L_0x0162:
            if (r3 >= r2) goto L_0x01ed
            r4 = r0[r3]
            r5 = r11[r3]
            if (r3 != 0) goto L_0x016d
            t0.q r6 = r7.f16312d
            goto L_0x0174
        L_0x016d:
            cm.l.c(r1)
            t0.p r6 = r1.r0(r4)
        L_0x0174:
            if (r6 == 0) goto L_0x01c8
            int r4 = r0.length
            int r4 = r4 - r10
            if (r3 == r4) goto L_0x019d
            boolean r4 = r6 instanceof t0.q
            if (r4 == 0) goto L_0x01c5
            t0.q r6 = (t0.q) r6
        L_0x0180:
            cm.l.c(r6)
            int r1 = r6.x0()
            t0.p r1 = r6.r0(r1)
            boolean r1 = r1 instanceof t0.q
            if (r1 == 0) goto L_0x019b
            int r1 = r6.x0()
            t0.p r1 = r6.r0(r1)
            r6 = r1
            t0.q r6 = (t0.q) r6
            goto L_0x0180
        L_0x019b:
            r1 = r6
            goto L_0x01c5
        L_0x019d:
            t0.v$a r13 = new t0.v$a
            r13.<init>()
            t0.q r4 = r7.f16312d
            cm.l.c(r4)
            int r14 = r4.H()
            r15 = 1
            r16 = 0
            r17 = 4
            r18 = 0
            t0.v$a r4 = t0.v.a.i(r13, r14, r15, r16, r17, r18)
            t0.v$a r4 = r4.b(r8)
            t0.v$a r4 = r4.c(r8)
            t0.v r4 = r4.a()
            r7.Q(r6, r5, r4, r9)
        L_0x01c5:
            int r3 = r3 + 1
            goto L_0x0162
        L_0x01c8:
            t0.p$a r0 = t0.p.f16420n
            android.content.Context r2 = r7.f16309a
            java.lang.String r0 = r0.b(r2, r4)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            r3.append(r0)
            java.lang.String r0 = " cannot be found in graph "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01ed:
            r7.f16315g = r10
            return r10
        L_0x01f0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.k.J(android.content.Intent):boolean");
    }

    public void O(int i10, Bundle bundle, v vVar) {
        P(i10, bundle, vVar, (b0.a) null);
    }

    public void P(int i10, Bundle bundle, v vVar, b0.a aVar) {
        int i11;
        p e10 = this.f16316h.isEmpty() ? this.f16312d : ((h) this.f16316h.F()).e();
        if (e10 != null) {
            e E2 = e10.E(i10);
            Bundle bundle2 = null;
            if (E2 != null) {
                if (vVar == null) {
                    vVar = E2.c();
                }
                i11 = E2.b();
                Bundle a10 = E2.a();
                if (a10 != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(a10);
                }
            } else {
                i11 = i10;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i11 != 0 || vVar == null || (vVar.e() == -1 && vVar.f() == null)) {
                if (i11 != 0) {
                    p x10 = x(i11);
                    if (x10 == null) {
                        p.a aVar2 = p.f16420n;
                        String b10 = aVar2.b(this.f16309a, i11);
                        if (E2 == null) {
                            throw new IllegalArgumentException("Navigation action/destination " + b10 + " cannot be found from the current destination " + e10);
                        }
                        throw new IllegalArgumentException(("Navigation destination " + b10 + " referenced from action " + aVar2.b(this.f16309a, i10) + " cannot be found from the current destination " + e10).toString());
                    }
                    Q(x10, bundle2, vVar, aVar);
                    return;
                }
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
            } else if (vVar.f() != null) {
                String f10 = vVar.f();
                cm.l.c(f10);
                Y(this, f10, vVar.g(), false, 4, (Object) null);
            } else if (vVar.e() != -1) {
                V(vVar.e(), vVar.g());
            }
        } else {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r0.getIntent();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean S() {
        /*
            r2 = this;
            int r0 = r2.E()
            r1 = 1
            if (r0 != r1) goto L_0x002c
            android.app.Activity r0 = r2.f16310b
            r1 = 0
            if (r0 == 0) goto L_0x0017
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0017
            android.os.Bundle r0 = r0.getExtras()
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            if (r0 == 0) goto L_0x0020
            java.lang.String r1 = "android-support-nav:controller:deepLinkIds"
            int[] r1 = r0.getIntArray(r1)
        L_0x0020:
            if (r1 == 0) goto L_0x0027
            boolean r0 = r2.q0()
            return r0
        L_0x0027:
            boolean r0 = r2.r0()
            return r0
        L_0x002c:
            boolean r0 = r2.U()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.k.S():boolean");
    }

    public boolean U() {
        if (this.f16316h.isEmpty()) {
            return false;
        }
        p D2 = D();
        cm.l.c(D2);
        return V(D2.H(), true);
    }

    public boolean V(int i10, boolean z10) {
        return W(i10, z10, false);
    }

    public boolean W(int i10, boolean z10, boolean z11) {
        return b0(i10, z10, z11) && u();
    }

    public final boolean X(String str, boolean z10, boolean z11) {
        cm.l.f(str, "route");
        return c0(str, z10, z11) && u();
    }

    public final void Z(h hVar, bm.a aVar) {
        cm.l.f(hVar, "popUpTo");
        cm.l.f(aVar, "onComplete");
        int indexOf = this.f16316h.indexOf(hVar);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + hVar + " as it was not found on the current back stack");
            return;
        }
        int i10 = indexOf + 1;
        if (i10 != this.f16316h.size()) {
            b0(((h) this.f16316h.get(i10)).e().H(), true, false);
        }
        f0(this, hVar, false, (ql.h) null, 6, (Object) null);
        aVar.a();
        u0();
        u();
    }

    public final List g0() {
        ArrayList arrayList = new ArrayList();
        for (b c10 : this.f16333y.values()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : (Iterable) c10.c().getValue()) {
                h hVar = (h) next;
                if (!arrayList.contains(hVar) && !hVar.g().b(k.b.STARTED)) {
                    arrayList2.add(next);
                }
            }
            boolean unused = v.v(arrayList, arrayList2);
        }
        ql.h hVar2 = this.f16316h;
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : hVar2) {
            h hVar3 = (h) next2;
            if (!arrayList.contains(hVar3) && hVar3.g().b(k.b.STARTED)) {
                arrayList3.add(next2);
            }
        }
        boolean unused2 = v.v(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object next3 : arrayList) {
            if (!(((h) next3).e() instanceof q)) {
                arrayList4.add(next3);
            }
        }
        return arrayList4;
    }

    public void h0(c cVar) {
        cm.l.f(cVar, "listener");
        this.f16327s.remove(cVar);
    }

    public void i0(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.f16309a.getClassLoader());
            this.f16313e = bundle.getBundle("android-support-nav:controller:navigatorState");
            this.f16314f = bundle.getParcelableArray("android-support-nav:controller:backStack");
            this.f16324p.clear();
            int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
            if (!(intArray == null || stringArrayList == null)) {
                int length = intArray.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    this.f16323o.put(Integer.valueOf(intArray[i10]), stringArrayList.get(i11));
                    i10++;
                    i11++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String str : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                    if (parcelableArray != null) {
                        Map map = this.f16324p;
                        cm.l.e(str, "id");
                        ql.h hVar = new ql.h(parcelableArray.length);
                        Iterator a10 = cm.b.a(parcelableArray);
                        while (a10.hasNext()) {
                            Parcelable parcelable = (Parcelable) a10.next();
                            cm.l.d(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            hVar.add((i) parcelable);
                        }
                        map.put(str, hVar);
                    }
                }
            }
            this.f16315g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
    }

    public Bundle k0() {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.f16332x.e().entrySet()) {
            String str = (String) entry.getKey();
            Bundle i10 = ((b0) entry.getValue()).i();
            if (i10 != null) {
                arrayList.add(str);
                bundle2.putBundle(str, i10);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!this.f16316h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f16316h.size()];
            Iterator it = this.f16316h.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                parcelableArr[i11] = new i((h) it.next());
                i11++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.f16323o.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.f16323o.size()];
            ArrayList arrayList2 = new ArrayList();
            int i12 = 0;
            for (Map.Entry entry2 : this.f16323o.entrySet()) {
                iArr[i12] = ((Number) entry2.getKey()).intValue();
                arrayList2.add((String) entry2.getValue());
                i12++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.f16324p.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry3 : this.f16324p.entrySet()) {
                String str2 = (String) entry3.getKey();
                ql.h hVar = (ql.h) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[hVar.size()];
                int i13 = 0;
                for (Object next : hVar) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        q.r();
                    }
                    parcelableArr2[i13] = (i) next;
                    i13 = i14;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f16315g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f16315g);
        }
        return bundle;
    }

    public void l0(int i10) {
        n0(H().b(i10), (Bundle) null);
    }

    public void m0(int i10, Bundle bundle) {
        n0(H().b(i10), bundle);
    }

    public void n0(q qVar, Bundle bundle) {
        cm.l.f(qVar, "graph");
        if (!cm.l.a(this.f16312d, qVar)) {
            q qVar2 = this.f16312d;
            if (qVar2 != null) {
                for (Integer num : new ArrayList(this.f16323o.keySet())) {
                    cm.l.e(num, "id");
                    s(num.intValue());
                }
                d0(this, qVar2.H(), true, false, 4, (Object) null);
            }
            this.f16312d = qVar;
            T(bundle);
            return;
        }
        int q10 = qVar.v0().q();
        for (int i10 = 0; i10 < q10; i10++) {
            q qVar3 = this.f16312d;
            cm.l.c(qVar3);
            int j10 = qVar3.v0().j(i10);
            q qVar4 = this.f16312d;
            cm.l.c(qVar4);
            qVar4.v0().p(j10, (p) qVar.v0().r(i10));
        }
        for (h hVar : this.f16316h) {
            p pVar = this.f16312d;
            cm.l.c(pVar);
            for (p pVar2 : w.J(o.s(p.f16420n.c(hVar.e())))) {
                if ((!cm.l.a(pVar2, this.f16312d) || !cm.l.a(pVar, qVar)) && (pVar instanceof q)) {
                    pVar = ((q) pVar).r0(pVar2.H());
                    cm.l.c(pVar);
                }
            }
            hVar.j(pVar);
        }
    }

    public void o0(s sVar) {
        androidx.lifecycle.k d02;
        cm.l.f(sVar, "owner");
        if (!cm.l.a(sVar, this.f16325q)) {
            s sVar2 = this.f16325q;
            if (!(sVar2 == null || (d02 = sVar2.d0()) == null)) {
                d02.d(this.f16329u);
            }
            this.f16325q = sVar;
            sVar.d0().a(this.f16329u);
        }
    }

    public void p0(w0 w0Var) {
        cm.l.f(w0Var, "viewModelStore");
        l lVar = this.f16326r;
        l.b bVar = l.f16367e;
        if (!cm.l.a(lVar, bVar.a(w0Var))) {
            if (this.f16316h.isEmpty()) {
                this.f16326r = bVar.a(w0Var);
                return;
            }
            throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
        }
    }

    public void r(c cVar) {
        cm.l.f(cVar, "listener");
        this.f16327s.add(cVar);
        if (!this.f16316h.isEmpty()) {
            h hVar = (h) this.f16316h.F();
            cVar.a(this, hVar.e(), hVar.c());
        }
    }

    public final h s0(h hVar) {
        cm.l.f(hVar, "child");
        h hVar2 = (h) this.f16321m.remove(hVar);
        Integer num = null;
        if (hVar2 == null) {
            return null;
        }
        AtomicInteger atomicInteger = (AtomicInteger) this.f16322n.get(hVar2);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        }
        if (num != null && num.intValue() == 0) {
            b bVar = (b) this.f16333y.get(this.f16332x.d(hVar2.e().T()));
            if (bVar != null) {
                bVar.e(hVar2);
            }
            this.f16322n.remove(hVar2);
        }
        return hVar2;
    }

    public n t() {
        return new n(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009a, code lost:
        r6 = (java.util.Set) (r6 = r6.c()).getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t0() {
        /*
            r10 = this;
            ql.h r0 = r10.f16316h
            java.util.List r0 = ql.y.v0(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r1 = ql.y.e0(r0)
            t0.h r1 = (t0.h) r1
            t0.p r1 = r1.e()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r3 = r1 instanceof t0.d
            if (r3 == 0) goto L_0x0046
            r3 = r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = ql.y.k0(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x002b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0046
            java.lang.Object r4 = r3.next()
            t0.h r4 = (t0.h) r4
            t0.p r4 = r4.e()
            r2.add(r4)
            boolean r5 = r4 instanceof t0.d
            if (r5 != 0) goto L_0x002b
            boolean r4 = r4 instanceof t0.q
            if (r4 != 0) goto L_0x002b
        L_0x0046:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = ql.y.k0(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x0056:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0130
            java.lang.Object r5 = r4.next()
            t0.h r5 = (t0.h) r5
            androidx.lifecycle.k$b r6 = r5.g()
            t0.p r7 = r5.e()
            if (r1 == 0) goto L_0x00e9
            int r8 = r7.H()
            int r9 = r1.H()
            if (r8 != r9) goto L_0x00e9
            androidx.lifecycle.k$b r8 = androidx.lifecycle.k.b.RESUMED
            if (r6 == r8) goto L_0x00ce
            t0.c0 r6 = r10.I()
            t0.p r9 = r5.e()
            java.lang.String r9 = r9.T()
            t0.b0 r6 = r6.d(r9)
            java.util.Map r9 = r10.f16333y
            java.lang.Object r6 = r9.get(r6)
            t0.k$b r6 = (t0.k.b) r6
            if (r6 == 0) goto L_0x00ab
            om.t r6 = r6.c()
            if (r6 == 0) goto L_0x00ab
            java.lang.Object r6 = r6.getValue()
            java.util.Set r6 = (java.util.Set) r6
            if (r6 == 0) goto L_0x00ab
            boolean r6 = r6.contains(r5)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x00ac
        L_0x00ab:
            r6 = 0
        L_0x00ac:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r6 = cm.l.a(r6, r9)
            if (r6 != 0) goto L_0x00c9
            java.util.Map r6 = r10.f16322n
            java.lang.Object r6 = r6.get(r5)
            java.util.concurrent.atomic.AtomicInteger r6 = (java.util.concurrent.atomic.AtomicInteger) r6
            if (r6 == 0) goto L_0x00c5
            int r6 = r6.get()
            if (r6 != 0) goto L_0x00c5
            goto L_0x00c9
        L_0x00c5:
            r3.put(r5, r8)
            goto L_0x00ce
        L_0x00c9:
            androidx.lifecycle.k$b r6 = androidx.lifecycle.k.b.STARTED
            r3.put(r5, r6)
        L_0x00ce:
            java.lang.Object r5 = ql.y.V(r2)
            t0.p r5 = (t0.p) r5
            if (r5 == 0) goto L_0x00e3
            int r5 = r5.H()
            int r6 = r7.H()
            if (r5 != r6) goto L_0x00e3
            java.lang.Object unused = ql.v.C(r2)
        L_0x00e3:
            t0.q r1 = r1.Y()
            goto L_0x0056
        L_0x00e9:
            boolean r8 = r2.isEmpty()
            r8 = r8 ^ 1
            if (r8 == 0) goto L_0x0129
            int r7 = r7.H()
            java.lang.Object r8 = ql.y.U(r2)
            t0.p r8 = (t0.p) r8
            int r8 = r8.H()
            if (r7 != r8) goto L_0x0129
            java.lang.Object r7 = ql.v.C(r2)
            t0.p r7 = (t0.p) r7
            androidx.lifecycle.k$b r8 = androidx.lifecycle.k.b.RESUMED
            if (r6 != r8) goto L_0x0111
            androidx.lifecycle.k$b r6 = androidx.lifecycle.k.b.STARTED
            r5.m(r6)
            goto L_0x0118
        L_0x0111:
            androidx.lifecycle.k$b r8 = androidx.lifecycle.k.b.STARTED
            if (r6 == r8) goto L_0x0118
            r3.put(r5, r8)
        L_0x0118:
            t0.q r5 = r7.Y()
            if (r5 == 0) goto L_0x0056
            boolean r6 = r2.contains(r5)
            if (r6 != 0) goto L_0x0056
            r2.add(r5)
            goto L_0x0056
        L_0x0129:
            androidx.lifecycle.k$b r6 = androidx.lifecycle.k.b.CREATED
            r5.m(r6)
            goto L_0x0056
        L_0x0130:
            java.util.Iterator r0 = r0.iterator()
        L_0x0134:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0150
            java.lang.Object r1 = r0.next()
            t0.h r1 = (t0.h) r1
            java.lang.Object r2 = r3.get(r1)
            androidx.lifecycle.k$b r2 = (androidx.lifecycle.k.b) r2
            if (r2 == 0) goto L_0x014c
            r1.m(r2)
            goto L_0x0134
        L_0x014c:
            r1.n()
            goto L_0x0134
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.k.t0():void");
    }

    public final p x(int i10) {
        p pVar;
        q qVar = this.f16312d;
        if (qVar == null) {
            return null;
        }
        cm.l.c(qVar);
        if (qVar.H() == i10) {
            return this.f16312d;
        }
        h hVar = (h) this.f16316h.H();
        if (hVar == null || (pVar = hVar.e()) == null) {
            pVar = this.f16312d;
            cm.l.c(pVar);
        }
        return y(pVar, i10);
    }
}
