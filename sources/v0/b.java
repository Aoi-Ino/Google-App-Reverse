package v0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.h;
import androidx.fragment.app.i;
import androidx.fragment.app.q;
import androidx.lifecycle.k;
import androidx.lifecycle.o;
import cm.g;
import cm.l;
import cm.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t0.b0;
import t0.d;
import t0.d0;
import t0.p;
import t0.v;

@b0.b("dialog")
public final class b extends b0 {

    /* renamed from: h  reason: collision with root package name */
    private static final a f17273h = new a((g) null);

    /* renamed from: c  reason: collision with root package name */
    private final Context f17274c;

    /* renamed from: d  reason: collision with root package name */
    private final q f17275d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f17276e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    private final c f17277f = new c(this);

    /* renamed from: g  reason: collision with root package name */
    private final Map f17278g = new LinkedHashMap();

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* renamed from: v0.b$b  reason: collision with other inner class name */
    public static class C0229b extends p implements d {

        /* renamed from: p  reason: collision with root package name */
        private String f17279p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0229b(b0 b0Var) {
            super(b0Var);
            l.f(b0Var, "fragmentNavigator");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C0229b)) {
                return false;
            }
            return super.equals(obj) && l.a(this.f17279p, ((C0229b) obj).f17279p);
        }

        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this.f17279p;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public void k0(Context context, AttributeSet attributeSet) {
            l.f(context, "context");
            l.f(attributeSet, "attrs");
            super.k0(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, f.f17285a);
            l.e(obtainAttributes, "context.resources.obtain…ntNavigator\n            )");
            String string = obtainAttributes.getString(f.f17286b);
            if (string != null) {
                r0(string);
            }
            obtainAttributes.recycle();
        }

        public final String q0() {
            String str = this.f17279p;
            if (str != null) {
                l.d(str, "null cannot be cast to non-null type kotlin.String");
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set".toString());
        }

        public final C0229b r0(String str) {
            l.f(str, "className");
            this.f17279p = str;
            return this;
        }
    }

    public static final class c implements o {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f17280e;

        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f17281a;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            static {
                /*
                    androidx.lifecycle.k$a[] r0 = androidx.lifecycle.k.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.lifecycle.k$a r1 = androidx.lifecycle.k.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.lifecycle.k$a r1 = androidx.lifecycle.k.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.lifecycle.k$a r1 = androidx.lifecycle.k.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.lifecycle.k$a r1 = androidx.lifecycle.k.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    f17281a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: v0.b.c.a.<clinit>():void");
            }
        }

        c(b bVar) {
            this.f17280e = bVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: t0.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: t0.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: t0.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: t0.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: t0.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: t0.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: t0.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: t0.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: t0.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(androidx.lifecycle.s r5, androidx.lifecycle.k.a r6) {
            /*
                r4 = this;
                java.lang.String r0 = "source"
                cm.l.f(r5, r0)
                java.lang.String r0 = "event"
                cm.l.f(r6, r0)
                int[] r0 = v0.b.c.a.f17281a
                int r6 = r6.ordinal()
                r6 = r0[r6]
                r0 = 1
                if (r6 == r0) goto L_0x0124
                r0 = 2
                r1 = 0
                if (r6 == r0) goto L_0x00e3
                r0 = 3
                if (r6 == r0) goto L_0x006a
                r0 = 4
                if (r6 == r0) goto L_0x0021
                goto L_0x0166
            L_0x0021:
                androidx.fragment.app.h r5 = (androidx.fragment.app.h) r5
                v0.b r6 = r4.f17280e
                t0.d0 r6 = r6.b()
                om.t r6 = r6.c()
                java.lang.Object r6 = r6.getValue()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
            L_0x0037:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L_0x0054
                java.lang.Object r0 = r6.next()
                r2 = r0
                t0.h r2 = (t0.h) r2
                java.lang.String r2 = r2.f()
                java.lang.String r3 = r5.f0()
                boolean r2 = cm.l.a(r2, r3)
                if (r2 == 0) goto L_0x0037
                r1 = r0
                goto L_0x0037
            L_0x0054:
                t0.h r1 = (t0.h) r1
                if (r1 == 0) goto L_0x0061
                v0.b r6 = r4.f17280e
                t0.d0 r6 = r6.b()
                r6.e(r1)
            L_0x0061:
                androidx.lifecycle.k r5 = r5.d0()
                r5.d(r4)
                goto L_0x0166
            L_0x006a:
                androidx.fragment.app.h r5 = (androidx.fragment.app.h) r5
                android.app.Dialog r6 = r5.h2()
                boolean r6 = r6.isShowing()
                if (r6 != 0) goto L_0x0166
                v0.b r6 = r4.f17280e
                t0.d0 r6 = r6.b()
                om.t r6 = r6.b()
                java.lang.Object r6 = r6.getValue()
                java.util.List r6 = (java.util.List) r6
                int r0 = r6.size()
                java.util.ListIterator r0 = r6.listIterator(r0)
            L_0x008e:
                boolean r1 = r0.hasPrevious()
                if (r1 == 0) goto L_0x00ad
                java.lang.Object r1 = r0.previous()
                t0.h r1 = (t0.h) r1
                java.lang.String r1 = r1.f()
                java.lang.String r2 = r5.f0()
                boolean r1 = cm.l.a(r1, r2)
                if (r1 == 0) goto L_0x008e
                int r0 = r0.nextIndex()
                goto L_0x00ae
            L_0x00ad:
                r0 = -1
            L_0x00ae:
                java.lang.Object r1 = ql.y.W(r6, r0)
                t0.h r1 = (t0.h) r1
                java.lang.Object r6 = ql.y.f0(r6)
                boolean r6 = cm.l.a(r6, r1)
                if (r6 != 0) goto L_0x00d9
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = "Dialog "
                r6.append(r2)
                r6.append(r5)
                java.lang.String r5 = " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog"
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                java.lang.String r6 = "DialogFragmentNavigator"
                android.util.Log.i(r6, r5)
            L_0x00d9:
                if (r1 == 0) goto L_0x0166
                v0.b r5 = r4.f17280e
                r6 = 0
                r5.s(r0, r1, r6)
                goto L_0x0166
            L_0x00e3:
                androidx.fragment.app.h r5 = (androidx.fragment.app.h) r5
                v0.b r6 = r4.f17280e
                t0.d0 r6 = r6.b()
                om.t r6 = r6.c()
                java.lang.Object r6 = r6.getValue()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
            L_0x00f9:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L_0x0116
                java.lang.Object r0 = r6.next()
                r2 = r0
                t0.h r2 = (t0.h) r2
                java.lang.String r2 = r2.f()
                java.lang.String r3 = r5.f0()
                boolean r2 = cm.l.a(r2, r3)
                if (r2 == 0) goto L_0x00f9
                r1 = r0
                goto L_0x00f9
            L_0x0116:
                t0.h r1 = (t0.h) r1
                if (r1 == 0) goto L_0x0166
                v0.b r5 = r4.f17280e
                t0.d0 r5 = r5.b()
                r5.e(r1)
                goto L_0x0166
            L_0x0124:
                androidx.fragment.app.h r5 = (androidx.fragment.app.h) r5
                v0.b r6 = r4.f17280e
                t0.d0 r6 = r6.b()
                om.t r6 = r6.b()
                java.lang.Object r6 = r6.getValue()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r0 = r6 instanceof java.util.Collection
                if (r0 == 0) goto L_0x0144
                r0 = r6
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0144
                goto L_0x0163
            L_0x0144:
                java.util.Iterator r6 = r6.iterator()
            L_0x0148:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L_0x0163
                java.lang.Object r0 = r6.next()
                t0.h r0 = (t0.h) r0
                java.lang.String r0 = r0.f()
                java.lang.String r1 = r5.f0()
                boolean r0 = cm.l.a(r0, r1)
                if (r0 == 0) goto L_0x0148
                goto L_0x0166
            L_0x0163:
                r5.Y1()
            L_0x0166:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v0.b.c.d(androidx.lifecycle.s, androidx.lifecycle.k$a):void");
        }
    }

    public b(Context context, q qVar) {
        l.f(context, "context");
        l.f(qVar, "fragmentManager");
        this.f17274c = context;
        this.f17275d = qVar;
    }

    private final h p(t0.h hVar) {
        p e10 = hVar.e();
        l.d(e10, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        C0229b bVar = (C0229b) e10;
        String q02 = bVar.q0();
        if (q02.charAt(0) == '.') {
            q02 = this.f17274c.getPackageName() + q02;
        }
        i a10 = this.f17275d.t0().a(this.f17274c.getClassLoader(), q02);
        l.e(a10, "fragmentManager.fragment…ader, className\n        )");
        if (h.class.isAssignableFrom(a10.getClass())) {
            h hVar2 = (h) a10;
            hVar2.K1(hVar.c());
            hVar2.d0().a(this.f17277f);
            this.f17278g.put(hVar.f(), hVar2);
            return hVar2;
        }
        throw new IllegalArgumentException(("Dialog destination " + bVar.q0() + " is not an instance of DialogFragment").toString());
    }

    private final void q(t0.h hVar) {
        p(hVar).k2(this.f17275d, hVar.f());
        t0.h hVar2 = (t0.h) y.f0((List) b().b().getValue());
        boolean R = y.R((Iterable) b().c().getValue(), hVar2);
        b().l(hVar);
        if (hVar2 != null && !R) {
            b().e(hVar2);
        }
    }

    /* access modifiers changed from: private */
    public static final void r(b bVar, q qVar, i iVar) {
        l.f(bVar, "this$0");
        l.f(qVar, "<anonymous parameter 0>");
        l.f(iVar, "childFragment");
        Set set = bVar.f17276e;
        if (y.a(set).remove(iVar.f0())) {
            iVar.d0().a(bVar.f17277f);
        }
        Map map = bVar.f17278g;
        y.c(map).remove(iVar.f0());
    }

    /* access modifiers changed from: private */
    public final void s(int i10, t0.h hVar, boolean z10) {
        t0.h hVar2 = (t0.h) y.W((List) b().b().getValue(), i10 - 1);
        boolean R = y.R((Iterable) b().c().getValue(), hVar2);
        b().i(hVar, z10);
        if (hVar2 != null && !R) {
            b().e(hVar2);
        }
    }

    public void e(List list, v vVar, b0.a aVar) {
        l.f(list, "entries");
        if (this.f17275d.Q0()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q((t0.h) it.next());
        }
    }

    public void f(d0 d0Var) {
        k d02;
        l.f(d0Var, "state");
        super.f(d0Var);
        for (t0.h hVar : (List) d0Var.b().getValue()) {
            h hVar2 = (h) this.f17275d.h0(hVar.f());
            if (hVar2 == null || (d02 = hVar2.d0()) == null) {
                this.f17276e.add(hVar.f());
            } else {
                d02.a(this.f17277f);
            }
        }
        this.f17275d.i(new a(this));
    }

    public void g(t0.h hVar) {
        l.f(hVar, "backStackEntry");
        if (this.f17275d.Q0()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        h hVar2 = (h) this.f17278g.get(hVar.f());
        if (hVar2 == null) {
            i h02 = this.f17275d.h0(hVar.f());
            hVar2 = h02 instanceof h ? (h) h02 : null;
        }
        if (hVar2 != null) {
            hVar2.d0().d(this.f17277f);
            hVar2.Y1();
        }
        p(hVar).k2(this.f17275d, hVar.f());
        b().g(hVar);
    }

    public void j(t0.h hVar, boolean z10) {
        l.f(hVar, "popUpTo");
        if (this.f17275d.Q0()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().b().getValue();
        int indexOf = list.indexOf(hVar);
        for (t0.h f10 : y.k0(list.subList(indexOf, list.size()))) {
            i h02 = this.f17275d.h0(f10.f());
            if (h02 != null) {
                ((h) h02).Y1();
            }
        }
        s(indexOf, hVar, z10);
    }

    /* renamed from: o */
    public C0229b a() {
        return new C0229b(this);
    }
}
