package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.k;
import androidx.lifecycle.o;
import androidx.lifecycle.s;
import bm.l;
import cm.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import pl.x;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f518a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.core.util.a f519b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final ql.h f520c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public p f521d;

    /* renamed from: e  reason: collision with root package name */
    private OnBackInvokedCallback f522e;

    /* renamed from: f  reason: collision with root package name */
    private OnBackInvokedDispatcher f523f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f524g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f525h;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q f526e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(q qVar) {
            super(1);
            this.f526e = qVar;
        }

        public final void b(b bVar) {
            cm.l.f(bVar, "backEvent");
            this.f526e.m(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((b) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q f527e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q qVar) {
            super(1);
            this.f527e = qVar;
        }

        public final void b(b bVar) {
            cm.l.f(bVar, "backEvent");
            this.f527e.l(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((b) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q f528e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(q qVar) {
            super(0);
            this.f528e = qVar;
        }

        public /* bridge */ /* synthetic */ Object a() {
            b();
            return x.f30437a;
        }

        public final void b() {
            this.f528e.k();
        }
    }

    static final class d extends m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q f529e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(q qVar) {
            super(0);
            this.f529e = qVar;
        }

        public /* bridge */ /* synthetic */ Object a() {
            b();
            return x.f30437a;
        }

        public final void b() {
            this.f529e.j();
        }
    }

    static final class e extends m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q f530e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(q qVar) {
            super(0);
            this.f530e = qVar;
        }

        public /* bridge */ /* synthetic */ Object a() {
            b();
            return x.f30437a;
        }

        public final void b() {
            this.f530e.k();
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f531a = new f();

        private f() {
        }

        /* access modifiers changed from: private */
        public static final void c(bm.a aVar) {
            cm.l.f(aVar, "$onBackInvoked");
            aVar.a();
        }

        public final OnBackInvokedCallback b(bm.a aVar) {
            cm.l.f(aVar, "onBackInvoked");
            return new r(aVar);
        }

        public final void d(Object obj, int i10, Object obj2) {
            cm.l.f(obj, "dispatcher");
            cm.l.f(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            cm.l.f(obj, "dispatcher");
            cm.l.f(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public static final g f532a = new g();

        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f533a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ l f534b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ bm.a f535c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ bm.a f536d;

            a(l lVar, l lVar2, bm.a aVar, bm.a aVar2) {
                this.f533a = lVar;
                this.f534b = lVar2;
                this.f535c = aVar;
                this.f536d = aVar2;
            }

            public void onBackCancelled() {
                this.f536d.a();
            }

            public void onBackInvoked() {
                this.f535c.a();
            }

            public void onBackProgressed(BackEvent backEvent) {
                cm.l.f(backEvent, "backEvent");
                this.f534b.invoke(new b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                cm.l.f(backEvent, "backEvent");
                this.f533a.invoke(new b(backEvent));
            }
        }

        private g() {
        }

        public final OnBackInvokedCallback a(l lVar, l lVar2, bm.a aVar, bm.a aVar2) {
            cm.l.f(lVar, "onBackStarted");
            cm.l.f(lVar2, "onBackProgressed");
            cm.l.f(aVar, "onBackInvoked");
            cm.l.f(aVar2, "onBackCancelled");
            return new a(lVar, lVar2, aVar, aVar2);
        }
    }

    private final class h implements o, c {

        /* renamed from: e  reason: collision with root package name */
        private final androidx.lifecycle.k f537e;

        /* renamed from: f  reason: collision with root package name */
        private final p f538f;

        /* renamed from: g  reason: collision with root package name */
        private c f539g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ q f540h;

        public h(q qVar, androidx.lifecycle.k kVar, p pVar) {
            cm.l.f(kVar, "lifecycle");
            cm.l.f(pVar, "onBackPressedCallback");
            this.f540h = qVar;
            this.f537e = kVar;
            this.f538f = pVar;
            kVar.a(this);
        }

        public void cancel() {
            this.f537e.d(this);
            this.f538f.i(this);
            c cVar = this.f539g;
            if (cVar != null) {
                cVar.cancel();
            }
            this.f539g = null;
        }

        public void d(s sVar, k.a aVar) {
            cm.l.f(sVar, "source");
            cm.l.f(aVar, "event");
            if (aVar == k.a.ON_START) {
                this.f539g = this.f540h.i(this.f538f);
            } else if (aVar == k.a.ON_STOP) {
                c cVar = this.f539g;
                if (cVar != null) {
                    cVar.cancel();
                }
            } else if (aVar == k.a.ON_DESTROY) {
                cancel();
            }
        }
    }

    private final class i implements c {

        /* renamed from: e  reason: collision with root package name */
        private final p f541e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q f542f;

        public i(q qVar, p pVar) {
            cm.l.f(pVar, "onBackPressedCallback");
            this.f542f = qVar;
            this.f541e = pVar;
        }

        public void cancel() {
            this.f542f.f520c.remove(this.f541e);
            if (cm.l.a(this.f542f.f521d, this.f541e)) {
                this.f541e.c();
                this.f542f.f521d = null;
            }
            this.f541e.i(this);
            bm.a b10 = this.f541e.b();
            if (b10 != null) {
                b10.a();
            }
            this.f541e.k((bm.a) null);
        }
    }

    /* synthetic */ class j extends cm.k implements bm.a {
        j(Object obj) {
            super(0, obj, q.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public /* bridge */ /* synthetic */ Object a() {
            k();
            return x.f30437a;
        }

        public final void k() {
            ((q) this.f20212f).p();
        }
    }

    /* synthetic */ class k extends cm.k implements bm.a {
        k(Object obj) {
            super(0, obj, q.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public /* bridge */ /* synthetic */ Object a() {
            k();
            return x.f30437a;
        }

        public final void k() {
            ((q) this.f20212f).p();
        }
    }

    public q(Runnable runnable) {
        this(runnable, (androidx.core.util.a) null);
    }

    /* access modifiers changed from: private */
    public final void j() {
        Object obj;
        ql.h hVar = this.f520c;
        ListIterator listIterator = hVar.listIterator(hVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((p) obj).g()) {
                break;
            }
        }
        p pVar = (p) obj;
        this.f521d = null;
        if (pVar != null) {
            pVar.c();
        }
    }

    /* access modifiers changed from: private */
    public final void l(b bVar) {
        Object obj;
        ql.h hVar = this.f520c;
        ListIterator listIterator = hVar.listIterator(hVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((p) obj).g()) {
                break;
            }
        }
        p pVar = (p) obj;
        if (pVar != null) {
            pVar.e(bVar);
        }
    }

    /* access modifiers changed from: private */
    public final void m(b bVar) {
        Object obj;
        ql.h hVar = this.f520c;
        ListIterator listIterator = hVar.listIterator(hVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((p) obj).g()) {
                break;
            }
        }
        p pVar = (p) obj;
        this.f521d = pVar;
        if (pVar != null) {
            pVar.f(bVar);
        }
    }

    private final void o(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f523f;
        OnBackInvokedCallback onBackInvokedCallback = this.f522e;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (z10 && !this.f524g) {
                f.f531a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f524g = true;
            } else if (!z10 && this.f524g) {
                f.f531a.e(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f524g = false;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void p() {
        boolean z10 = this.f525h;
        ql.h hVar = this.f520c;
        boolean z11 = false;
        if (!(hVar instanceof Collection) || !hVar.isEmpty()) {
            Iterator it = hVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((p) it.next()).g()) {
                        z11 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.f525h = z11;
        if (z11 != z10) {
            androidx.core.util.a aVar = this.f519b;
            if (aVar != null) {
                aVar.a(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                o(z11);
            }
        }
    }

    public final void h(s sVar, p pVar) {
        cm.l.f(sVar, "owner");
        cm.l.f(pVar, "onBackPressedCallback");
        androidx.lifecycle.k d02 = sVar.d0();
        if (d02.b() != k.b.DESTROYED) {
            pVar.a(new h(this, d02, pVar));
            p();
            pVar.k(new j(this));
        }
    }

    public final c i(p pVar) {
        cm.l.f(pVar, "onBackPressedCallback");
        this.f520c.add(pVar);
        i iVar = new i(this, pVar);
        pVar.a(iVar);
        p();
        pVar.k(new k(this));
        return iVar;
    }

    public final void k() {
        Object obj;
        ql.h hVar = this.f520c;
        ListIterator listIterator = hVar.listIterator(hVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((p) obj).g()) {
                break;
            }
        }
        p pVar = (p) obj;
        this.f521d = null;
        if (pVar != null) {
            pVar.d();
            return;
        }
        Runnable runnable = this.f518a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void n(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        cm.l.f(onBackInvokedDispatcher, "invoker");
        this.f523f = onBackInvokedDispatcher;
        o(this.f525h);
    }

    public q(Runnable runnable, androidx.core.util.a aVar) {
        this.f518a = runnable;
        this.f519b = aVar;
        this.f520c = new ql.h();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f522e = i10 >= 34 ? g.f532a.a(new a(this), new b(this), new c(this), new d(this)) : f.f531a.b(new e(this));
        }
    }
}
