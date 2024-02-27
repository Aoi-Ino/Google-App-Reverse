package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.q;
import androidx.lifecycle.k;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import bm.l;
import cm.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import pl.t;
import pl.x;
import r0.a;
import t0.b0;
import t0.d0;
import t0.p;
import t0.v;

@b0.b("fragment")
public class a extends b0 {

    /* renamed from: j  reason: collision with root package name */
    private static final b f3416j = new b((cm.g) null);

    /* renamed from: c  reason: collision with root package name */
    private final Context f3417c;

    /* renamed from: d  reason: collision with root package name */
    private final q f3418d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3419e;

    /* renamed from: f  reason: collision with root package name */
    private final Set f3420f = new LinkedHashSet();

    /* renamed from: g  reason: collision with root package name */
    private final List f3421g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final o f3422h = new v0.c(this);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final l f3423i = new h(this);

    /* renamed from: androidx.navigation.fragment.a$a  reason: collision with other inner class name */
    public static final class C0061a extends t0 {

        /* renamed from: d  reason: collision with root package name */
        public WeakReference f3424d;

        /* access modifiers changed from: protected */
        public void e() {
            super.e();
            bm.a aVar = (bm.a) g().get();
            if (aVar != null) {
                aVar.a();
            }
        }

        public final WeakReference g() {
            WeakReference weakReference = this.f3424d;
            if (weakReference != null) {
                return weakReference;
            }
            cm.l.v("completeTransition");
            return null;
        }

        public final void h(WeakReference weakReference) {
            cm.l.f(weakReference, "<set-?>");
            this.f3424d = weakReference;
        }
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(cm.g gVar) {
            this();
        }
    }

    public static class c extends p {

        /* renamed from: p  reason: collision with root package name */
        private String f3425p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b0 b0Var) {
            super(b0Var);
            cm.l.f(b0Var, "fragmentNavigator");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof c)) {
                return false;
            }
            return super.equals(obj) && cm.l.a(this.f3425p, ((c) obj).f3425p);
        }

        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this.f3425p;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public void k0(Context context, AttributeSet attributeSet) {
            cm.l.f(context, "context");
            cm.l.f(attributeSet, "attrs");
            super.k0(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, v0.f.f17287c);
            cm.l.e(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = obtainAttributes.getString(v0.f.f17288d);
            if (string != null) {
                r0(string);
            }
            x xVar = x.f30437a;
            obtainAttributes.recycle();
        }

        public final String q0() {
            String str = this.f3425p;
            if (str != null) {
                cm.l.d(str, "null cannot be cast to non-null type kotlin.String");
                return str;
            }
            throw new IllegalStateException("Fragment class was not set".toString());
        }

        public final c r0(String str) {
            cm.l.f(str, "className");
            this.f3425p = str;
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.f3425p;
            if (str == null) {
                str = "null";
            }
            sb2.append(str);
            String sb3 = sb2.toString();
            cm.l.e(sb3, "sb.toString()");
            return sb3;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f3426e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(1);
            this.f3426e = str;
        }

        /* renamed from: b */
        public final Boolean invoke(pl.o oVar) {
            cm.l.f(oVar, "it");
            return Boolean.valueOf(cm.l.a(oVar.c(), this.f3426e));
        }
    }

    static final class e extends m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ t0.h f3427e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d0 f3428f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.i f3429g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(t0.h hVar, d0 d0Var, androidx.fragment.app.i iVar) {
            super(0);
            this.f3427e = hVar;
            this.f3428f = d0Var;
            this.f3429g = iVar;
        }

        public /* bridge */ /* synthetic */ Object a() {
            b();
            return x.f30437a;
        }

        public final void b() {
            d0 d0Var = this.f3428f;
            androidx.fragment.app.i iVar = this.f3429g;
            for (t0.h hVar : (Iterable) d0Var.c().getValue()) {
                if (q.J0(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + hVar + " due to fragment " + iVar + " viewmodel being cleared");
                }
                d0Var.e(hVar);
            }
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final f f3430e = new f();

        f() {
            super(1);
        }

        /* renamed from: b */
        public final C0061a invoke(r0.a aVar) {
            cm.l.f(aVar, "$this$initializer");
            return new C0061a();
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f3431e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.i f3432f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ t0.h f3433g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, androidx.fragment.app.i iVar, t0.h hVar) {
            super(1);
            this.f3431e = aVar;
            this.f3432f = iVar;
            this.f3433g = hVar;
        }

        public final void b(s sVar) {
            Iterable w10 = this.f3431e.w();
            androidx.fragment.app.i iVar = this.f3432f;
            boolean z10 = false;
            if (!(w10 instanceof Collection) || !((Collection) w10).isEmpty()) {
                Iterator it = w10.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (cm.l.a(((pl.o) it.next()).c(), iVar.f0())) {
                            z10 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (sVar != null && !z10) {
                androidx.lifecycle.k d02 = this.f3432f.i0().d0();
                if (d02.b().b(k.b.CREATED)) {
                    d02.a((r) this.f3431e.f3423i.invoke(this.f3433g));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((s) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f3434e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(1);
            this.f3434e = aVar;
        }

        /* access modifiers changed from: private */
        public static final void e(a aVar, t0.h hVar, s sVar, k.a aVar2) {
            cm.l.f(aVar, "this$0");
            cm.l.f(hVar, "$entry");
            cm.l.f(sVar, "owner");
            cm.l.f(aVar2, "event");
            if (aVar2 == k.a.ON_RESUME && ((List) aVar.b().b().getValue()).contains(hVar)) {
                if (q.J0(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + hVar + " due to fragment " + sVar + " view lifecycle reaching RESUMED");
                }
                aVar.b().e(hVar);
            }
            if (aVar2 == k.a.ON_DESTROY) {
                if (q.J0(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + hVar + " due to fragment " + sVar + " view lifecycle reaching DESTROYED");
                }
                aVar.b().e(hVar);
            }
        }

        /* renamed from: c */
        public final o invoke(t0.h hVar) {
            cm.l.f(hVar, "entry");
            return new b(this.f3434e, hVar);
        }
    }

    public static final class i implements q.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d0 f3435a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f3436b;

        i(d0 d0Var, a aVar) {
            this.f3435a = d0Var;
            this.f3436b = aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: pl.o} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: pl.o} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: pl.o} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: pl.o} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(androidx.fragment.app.i r11, boolean r12) {
            /*
                r10 = this;
                java.lang.String r0 = "fragment"
                cm.l.f(r11, r0)
                t0.d0 r0 = r10.f3435a
                om.t r0 = r0.b()
                java.lang.Object r0 = r0.getValue()
                java.util.Collection r0 = (java.util.Collection) r0
                t0.d0 r1 = r10.f3435a
                om.t r1 = r1.c()
                java.lang.Object r1 = r1.getValue()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.List r0 = ql.y.i0(r0, r1)
                int r1 = r0.size()
                java.util.ListIterator r0 = r0.listIterator(r1)
            L_0x0029:
                boolean r1 = r0.hasPrevious()
                r2 = 0
                if (r1 == 0) goto L_0x0046
                java.lang.Object r1 = r0.previous()
                r3 = r1
                t0.h r3 = (t0.h) r3
                java.lang.String r3 = r3.f()
                java.lang.String r4 = r11.f0()
                boolean r3 = cm.l.a(r3, r4)
                if (r3 == 0) goto L_0x0029
                goto L_0x0047
            L_0x0046:
                r1 = r2
            L_0x0047:
                t0.h r1 = (t0.h) r1
                r0 = 1
                r3 = 0
                if (r12 == 0) goto L_0x0061
                androidx.navigation.fragment.a r4 = r10.f3436b
                java.util.List r4 = r4.w()
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L_0x0061
                boolean r4 = r11.s0()
                if (r4 == 0) goto L_0x0061
                r4 = r0
                goto L_0x0062
            L_0x0061:
                r4 = r3
            L_0x0062:
                androidx.navigation.fragment.a r5 = r10.f3436b
                java.util.List r5 = r5.w()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
            L_0x006e:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x008a
                java.lang.Object r6 = r5.next()
                r7 = r6
                pl.o r7 = (pl.o) r7
                java.lang.Object r7 = r7.c()
                java.lang.String r8 = r11.f0()
                boolean r7 = cm.l.a(r7, r8)
                if (r7 == 0) goto L_0x006e
                r2 = r6
            L_0x008a:
                pl.o r2 = (pl.o) r2
                if (r2 == 0) goto L_0x0097
                androidx.navigation.fragment.a r5 = r10.f3436b
                java.util.List r5 = r5.w()
                r5.remove(r2)
            L_0x0097:
                java.lang.String r5 = "OnBackStackChangedCommitted for fragment "
                java.lang.String r6 = "FragmentNavigator"
                r7 = 2
                if (r4 != 0) goto L_0x00be
                boolean r8 = androidx.fragment.app.q.J0(r7)
                if (r8 == 0) goto L_0x00be
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r5)
                r8.append(r11)
                java.lang.String r9 = " associated with entry "
                r8.append(r9)
                r8.append(r1)
                java.lang.String r8 = r8.toString()
                android.util.Log.v(r6, r8)
            L_0x00be:
                if (r2 == 0) goto L_0x00cd
                java.lang.Object r2 = r2.d()
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != r0) goto L_0x00cd
                goto L_0x00ce
            L_0x00cd:
                r0 = r3
            L_0x00ce:
                if (r12 != 0) goto L_0x00f5
                if (r0 != 0) goto L_0x00f5
                if (r1 == 0) goto L_0x00d5
                goto L_0x00f5
            L_0x00d5:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "The fragment "
                r12.append(r0)
                r12.append(r11)
                java.lang.String r11 = " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."
                r12.append(r11)
                java.lang.String r11 = r12.toString()
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r11 = r11.toString()
                r12.<init>(r11)
                throw r12
            L_0x00f5:
                if (r1 == 0) goto L_0x012a
                androidx.navigation.fragment.a r12 = r10.f3436b
                t0.d0 r0 = r10.f3435a
                r12.r(r11, r1, r0)
                if (r4 == 0) goto L_0x012a
                boolean r12 = androidx.fragment.app.q.J0(r7)
                if (r12 == 0) goto L_0x0125
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r5)
                r12.append(r11)
                java.lang.String r11 = " popping associated entry "
                r12.append(r11)
                r12.append(r1)
                java.lang.String r11 = " via system back"
                r12.append(r11)
                java.lang.String r11 = r12.toString()
                android.util.Log.v(r6, r11)
            L_0x0125:
                t0.d0 r11 = r10.f3435a
                r11.i(r1, r3)
            L_0x012a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.a.i.a(androidx.fragment.app.i, boolean):void");
        }

        public void b() {
        }

        public void c(androidx.fragment.app.i iVar, boolean z10) {
            Object obj;
            cm.l.f(iVar, "fragment");
            if (z10) {
                List list = (List) this.f3435a.b().getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (cm.l.a(((t0.h) obj).f(), iVar.f0())) {
                        break;
                    }
                }
                t0.h hVar = (t0.h) obj;
                if (q.J0(2)) {
                    Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + iVar + " associated with entry " + hVar);
                }
                if (hVar != null) {
                    this.f3435a.j(hVar);
                }
            }
        }
    }

    static final class j extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final j f3437e = new j();

        j() {
            super(1);
        }

        /* renamed from: b */
        public final String invoke(pl.o oVar) {
            cm.l.f(oVar, "it");
            return (String) oVar.c();
        }
    }

    static final class k implements androidx.lifecycle.b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f3438a;

        k(l lVar) {
            cm.l.f(lVar, "function");
            this.f3438a = lVar;
        }

        public final pl.c a() {
            return this.f3438a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f3438a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return cm.l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public a(Context context, q qVar, int i10) {
        cm.l.f(context, "context");
        cm.l.f(qVar, "fragmentManager");
        this.f3417c = context;
        this.f3418d = qVar;
        this.f3419e = i10;
    }

    private final void p(String str, boolean z10, boolean z11) {
        if (z11) {
            boolean unused = v.B(this.f3421g, new d(str));
        }
        this.f3421g.add(t.a(str, Boolean.valueOf(z10)));
    }

    static /* synthetic */ void q(a aVar, String str, boolean z10, boolean z11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = true;
            }
            aVar.p(str, z10, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPendingOps");
    }

    private final void s(t0.h hVar, androidx.fragment.app.i iVar) {
        iVar.j0().g(iVar, new k(new g(this, iVar, hVar)));
        iVar.d0().a(this.f3422h);
    }

    private final androidx.fragment.app.x u(t0.h hVar, v vVar) {
        p e10 = hVar.e();
        cm.l.d(e10, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle c10 = hVar.c();
        String q02 = ((c) e10).q0();
        int i10 = 0;
        if (q02.charAt(0) == '.') {
            q02 = this.f3417c.getPackageName() + q02;
        }
        androidx.fragment.app.i a10 = this.f3418d.t0().a(this.f3417c.getClassLoader(), q02);
        cm.l.e(a10, "fragmentManager.fragment…t.classLoader, className)");
        a10.K1(c10);
        androidx.fragment.app.x n10 = this.f3418d.n();
        cm.l.e(n10, "fragmentManager.beginTransaction()");
        int a11 = vVar != null ? vVar.a() : -1;
        int b10 = vVar != null ? vVar.b() : -1;
        int c11 = vVar != null ? vVar.c() : -1;
        int d10 = vVar != null ? vVar.d() : -1;
        if (!(a11 == -1 && b10 == -1 && c11 == -1 && d10 == -1)) {
            if (a11 == -1) {
                a11 = 0;
            }
            if (b10 == -1) {
                b10 = 0;
            }
            if (c11 == -1) {
                c11 = 0;
            }
            if (d10 != -1) {
                i10 = d10;
            }
            n10.q(a11, b10, c11, i10);
        }
        n10.p(this.f3419e, a10, hVar.f());
        n10.r(a10);
        n10.s(true);
        return n10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: t0.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: t0.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: t0.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: t0.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: t0.h} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v(androidx.navigation.fragment.a r5, androidx.lifecycle.s r6, androidx.lifecycle.k.a r7) {
        /*
            java.lang.String r0 = "this$0"
            cm.l.f(r5, r0)
            java.lang.String r0 = "source"
            cm.l.f(r6, r0)
            java.lang.String r0 = "event"
            cm.l.f(r7, r0)
            androidx.lifecycle.k$a r0 = androidx.lifecycle.k.a.ON_DESTROY
            if (r7 != r0) goto L_0x007b
            r7 = r6
            androidx.fragment.app.i r7 = (androidx.fragment.app.i) r7
            t0.d0 r0 = r5.b()
            om.t r0 = r0.c()
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0029:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0046
            java.lang.Object r2 = r0.next()
            r3 = r2
            t0.h r3 = (t0.h) r3
            java.lang.String r3 = r3.f()
            java.lang.String r4 = r7.f0()
            boolean r3 = cm.l.a(r3, r4)
            if (r3 == 0) goto L_0x0029
            r1 = r2
            goto L_0x0029
        L_0x0046:
            t0.h r1 = (t0.h) r1
            if (r1 == 0) goto L_0x007b
            r7 = 2
            boolean r7 = androidx.fragment.app.q.J0(r7)
            if (r7 == 0) goto L_0x0074
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Marking transition complete for entry "
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = " due to fragment "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = " lifecycle reaching DESTROYED"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "FragmentNavigator"
            android.util.Log.v(r7, r6)
        L_0x0074:
            t0.d0 r5 = r5.b()
            r5.e(r1)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.a.v(androidx.navigation.fragment.a, androidx.lifecycle.s, androidx.lifecycle.k$a):void");
    }

    private final void x(t0.h hVar, v vVar, b0.a aVar) {
        boolean isEmpty = ((List) b().b().getValue()).isEmpty();
        if (vVar == null || isEmpty || !vVar.j() || !this.f3420f.remove(hVar.f())) {
            androidx.fragment.app.x u10 = u(hVar, vVar);
            if (!isEmpty) {
                t0.h hVar2 = (t0.h) y.f0((List) b().b().getValue());
                if (hVar2 != null) {
                    q(this, hVar2.f(), false, false, 6, (Object) null);
                }
                q(this, hVar.f(), false, false, 6, (Object) null);
                u10.g(hVar.f());
            }
            u10.h();
            if (q.J0(2)) {
                Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + hVar);
            }
        } else {
            this.f3418d.l1(hVar.f());
        }
        b().l(hVar);
    }

    /* access modifiers changed from: private */
    public static final void y(d0 d0Var, a aVar, q qVar, androidx.fragment.app.i iVar) {
        Object obj;
        cm.l.f(d0Var, "$state");
        cm.l.f(aVar, "this$0");
        cm.l.f(qVar, "<anonymous parameter 0>");
        cm.l.f(iVar, "fragment");
        List list = (List) d0Var.b().getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (cm.l.a(((t0.h) obj).f(), iVar.f0())) {
                break;
            }
        }
        t0.h hVar = (t0.h) obj;
        if (q.J0(2)) {
            Log.v("FragmentNavigator", "Attaching fragment " + iVar + " associated with entry " + hVar + " to FragmentManager " + aVar.f3418d);
        }
        if (hVar != null) {
            aVar.s(hVar, iVar);
            aVar.r(iVar, hVar, d0Var);
        }
    }

    public void e(List list, v vVar, b0.a aVar) {
        cm.l.f(list, "entries");
        if (this.f3418d.Q0()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x((t0.h) it.next(), vVar, aVar);
        }
    }

    public void f(d0 d0Var) {
        cm.l.f(d0Var, "state");
        super.f(d0Var);
        if (q.J0(2)) {
            Log.v("FragmentNavigator", "onAttach");
        }
        this.f3418d.i(new v0.d(d0Var, this));
        this.f3418d.j(new i(d0Var, this));
    }

    public void g(t0.h hVar) {
        cm.l.f(hVar, "backStackEntry");
        if (this.f3418d.Q0()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        androidx.fragment.app.x u10 = u(hVar, (v) null);
        List list = (List) b().b().getValue();
        if (list.size() > 1) {
            t0.h hVar2 = (t0.h) y.W(list, q.k(list) - 1);
            if (hVar2 != null) {
                q(this, hVar2.f(), false, false, 6, (Object) null);
            }
            q(this, hVar.f(), true, false, 4, (Object) null);
            this.f3418d.d1(hVar.f(), 1);
            q(this, hVar.f(), false, false, 2, (Object) null);
            u10.g(hVar.f());
        }
        u10.h();
        b().f(hVar);
    }

    public void h(Bundle bundle) {
        cm.l.f(bundle, "savedState");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            this.f3420f.clear();
            boolean unused = v.v(this.f3420f, stringArrayList);
        }
    }

    public Bundle i() {
        if (this.f3420f.isEmpty()) {
            return null;
        }
        return androidx.core.os.d.a(t.a("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.f3420f)));
    }

    public void j(t0.h hVar, boolean z10) {
        cm.l.f(hVar, "popUpTo");
        if (this.f3418d.Q0()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().b().getValue();
        int indexOf = list.indexOf(hVar);
        List subList = list.subList(indexOf, list.size());
        t0.h hVar2 = (t0.h) y.U(list);
        if (z10) {
            for (t0.h hVar3 : y.k0(subList)) {
                if (cm.l.a(hVar3, hVar2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + hVar3);
                } else {
                    this.f3418d.q1(hVar3.f());
                    this.f3420f.add(hVar3.f());
                }
            }
        } else {
            this.f3418d.d1(hVar.f(), 1);
        }
        if (q.J0(2)) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + hVar + " with savedState " + z10);
        }
        t0.h hVar4 = (t0.h) y.W(list, indexOf - 1);
        if (hVar4 != null) {
            q(this, hVar4.f(), false, false, 6, (Object) null);
        }
        ArrayList<t0.h> arrayList = new ArrayList<>();
        for (Object next : subList) {
            t0.h hVar5 = (t0.h) next;
            if (o.f(o.p(y.O(this.f3421g), j.f3437e), hVar5.f()) || !cm.l.a(hVar5.f(), hVar2.f())) {
                arrayList.add(next);
            }
        }
        for (t0.h f10 : arrayList) {
            q(this, f10.f(), true, false, 4, (Object) null);
        }
        b().i(hVar, z10);
    }

    public final void r(androidx.fragment.app.i iVar, t0.h hVar, d0 d0Var) {
        cm.l.f(iVar, "fragment");
        cm.l.f(hVar, "entry");
        cm.l.f(d0Var, "state");
        w0 X = iVar.X();
        cm.l.e(X, "fragment.viewModelStore");
        r0.c cVar = new r0.c();
        Class<C0061a> cls = C0061a.class;
        cVar.a(cm.v.b(cls), f.f3430e);
        ((C0061a) new u0(X, cVar.b(), a.C0208a.f15425b).a(cls)).h(new WeakReference(new e(hVar, d0Var, iVar)));
    }

    /* renamed from: t */
    public c a() {
        return new c(this);
    }

    public final List w() {
        return this.f3421g;
    }
}
