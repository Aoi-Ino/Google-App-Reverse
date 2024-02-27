package androidx.fragment.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.s;
import androidx.core.view.v;
import androidx.fragment.app.x;
import androidx.lifecycle.k;
import androidx.lifecycle.w0;
import d.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import o0.c;

public abstract class q {
    private static boolean S = false;
    private m A = new d();
    private g0 B = null;
    private g0 C = new e();
    private d.c D;
    private d.c E;
    private d.c F;
    ArrayDeque G = new ArrayDeque();
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private ArrayList M;
    private ArrayList N;
    private ArrayList O;
    private t P;
    private c.C0192c Q;
    private Runnable R = new f();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f3117a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f3118b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final w f3119c = new w();

    /* renamed from: d  reason: collision with root package name */
    ArrayList f3120d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList f3121e;

    /* renamed from: f  reason: collision with root package name */
    private final o f3122f = new o(this);

    /* renamed from: g  reason: collision with root package name */
    private androidx.activity.q f3123g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.activity.p f3124h = new b(false);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicInteger f3125i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    private final Map f3126j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    private final Map f3127k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    private final Map f3128l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    private ArrayList f3129m;

    /* renamed from: n  reason: collision with root package name */
    private final p f3130n = new p(this);

    /* renamed from: o  reason: collision with root package name */
    private final CopyOnWriteArrayList f3131o = new CopyOnWriteArrayList();

    /* renamed from: p  reason: collision with root package name */
    private final androidx.core.util.a f3132p = new n0.l(this);

    /* renamed from: q  reason: collision with root package name */
    private final androidx.core.util.a f3133q = new n0.m(this);

    /* renamed from: r  reason: collision with root package name */
    private final androidx.core.util.a f3134r = new n0.n(this);

    /* renamed from: s  reason: collision with root package name */
    private final androidx.core.util.a f3135s = new n0.o(this);

    /* renamed from: t  reason: collision with root package name */
    private final v f3136t = new c();

    /* renamed from: u  reason: collision with root package name */
    int f3137u = -1;

    /* renamed from: v  reason: collision with root package name */
    private n f3138v;

    /* renamed from: w  reason: collision with root package name */
    private n0.k f3139w;

    /* renamed from: x  reason: collision with root package name */
    private i f3140x;

    /* renamed from: y  reason: collision with root package name */
    i f3141y;

    /* renamed from: z  reason: collision with root package name */
    private m f3142z = null;

    class a implements d.b {
        a() {
        }

        /* renamed from: b */
        public void a(Map map) {
            StringBuilder sb2;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            k kVar = (k) q.this.G.pollFirst();
            if (kVar == null) {
                sb2 = new StringBuilder();
                sb2.append("No permissions were requested for ");
                sb2.append(this);
            } else {
                String str = kVar.f3153e;
                int i11 = kVar.f3154f;
                i i12 = q.this.f3119c.i(str);
                if (i12 == null) {
                    sb2 = new StringBuilder();
                    sb2.append("Permission request result delivered for unknown Fragment ");
                    sb2.append(str);
                } else {
                    i12.W0(i11, strArr, iArr);
                    return;
                }
            }
            Log.w("FragmentManager", sb2.toString());
        }
    }

    class b extends androidx.activity.p {
        b(boolean z10) {
            super(z10);
        }

        public void d() {
            q.this.F0();
        }
    }

    class c implements v {
        c() {
        }

        public boolean a(MenuItem menuItem) {
            return q.this.I(menuItem);
        }

        public void b(Menu menu) {
            q.this.J(menu);
        }

        public void c(Menu menu, MenuInflater menuInflater) {
            q.this.B(menu, menuInflater);
        }

        public void d(Menu menu) {
            q.this.N(menu);
        }
    }

    class d extends m {
        d() {
        }

        public i a(ClassLoader classLoader, String str) {
            return q.this.w0().b(q.this.w0().f(), str, (Bundle) null);
        }
    }

    class e implements g0 {
        e() {
        }

        public f0 a(ViewGroup viewGroup) {
            return new f(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        public void run() {
            q.this.Z(true);
        }
    }

    class g implements n0.q {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f3149e;

        g(i iVar) {
            this.f3149e = iVar;
        }

        public void a(q qVar, i iVar) {
            this.f3149e.A0(iVar);
        }
    }

    class h implements d.b {
        h() {
        }

        /* renamed from: b */
        public void a(d.a aVar) {
            k kVar = (k) q.this.G.pollLast();
            if (kVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = kVar.f3153e;
            int i10 = kVar.f3154f;
            i i11 = q.this.f3119c.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i11.x0(i10, aVar.d(), aVar.c());
        }
    }

    class i implements d.b {
        i() {
        }

        /* renamed from: b */
        public void a(d.a aVar) {
            k kVar = (k) q.this.G.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = kVar.f3153e;
            int i10 = kVar.f3154f;
            i i11 = q.this.f3119c.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i11.x0(i10, aVar.d(), aVar.c());
        }
    }

    static class j extends e.a {
        j() {
        }

        /* renamed from: d */
        public Intent a(Context context, d.f fVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent c10 = fVar.c();
            if (!(c10 == null || (bundleExtra = c10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                c10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (c10.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    fVar = new f.a(fVar.f()).b((Intent) null).c(fVar.e(), fVar.d()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", fVar);
            if (q.J0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        /* renamed from: e */
        public d.a c(int i10, Intent intent) {
            return new d.a(i10, intent);
        }
    }

    static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        String f3153e;

        /* renamed from: f  reason: collision with root package name */
        int f3154f;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            /* renamed from: b */
            public k[] newArray(int i10) {
                return new k[i10];
            }
        }

        k(Parcel parcel) {
            this.f3153e = parcel.readString();
            this.f3154f = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f3153e);
            parcel.writeInt(this.f3154f);
        }

        k(String str, int i10) {
            this.f3153e = str;
            this.f3154f = i10;
        }
    }

    public interface l {
        void a(i iVar, boolean z10);

        void b();

        void c(i iVar, boolean z10);
    }

    interface m {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    private class n implements m {

        /* renamed from: a  reason: collision with root package name */
        final String f3155a;

        /* renamed from: b  reason: collision with root package name */
        final int f3156b;

        /* renamed from: c  reason: collision with root package name */
        final int f3157c;

        n(String str, int i10, int i11) {
            this.f3155a = str;
            this.f3156b = i10;
            this.f3157c = i11;
        }

        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            i iVar = q.this.f3141y;
            if (iVar != null && this.f3156b < 0 && this.f3155a == null && iVar.v().e1()) {
                return false;
            }
            return q.this.h1(arrayList, arrayList2, this.f3155a, this.f3156b, this.f3157c);
        }
    }

    private class o implements m {

        /* renamed from: a  reason: collision with root package name */
        private final String f3159a;

        o(String str) {
            this.f3159a = str;
        }

        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            return q.this.m1(arrayList, arrayList2, this.f3159a);
        }
    }

    private class p implements m {

        /* renamed from: a  reason: collision with root package name */
        private final String f3161a;

        p(String str) {
            this.f3161a = str;
        }

        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            return q.this.r1(arrayList, arrayList2, this.f3161a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r0 = r3.f3124h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        if (p0() <= 0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        if (O0(r3.f3140x) == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r0.j(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A1() {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.f3117a
            monitor-enter(r0)
            java.util.ArrayList r1 = r3.f3117a     // Catch:{ all -> 0x0013 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0013 }
            r2 = 1
            if (r1 != 0) goto L_0x0015
            androidx.activity.p r1 = r3.f3124h     // Catch:{ all -> 0x0013 }
            r1.j(r2)     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return
        L_0x0013:
            r1 = move-exception
            goto L_0x002c
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            androidx.activity.p r0 = r3.f3124h
            int r1 = r3.p0()
            if (r1 <= 0) goto L_0x0027
            androidx.fragment.app.i r1 = r3.f3140x
            boolean r1 = r3.O0(r1)
            if (r1 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            r0.j(r2)
            return
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q.A1():void");
    }

    static i D0(View view) {
        Object tag = view.getTag(m0.b.fragment_container_view_tag);
        if (tag instanceof i) {
            return (i) tag;
        }
        return null;
    }

    public static boolean J0(int i10) {
        return S || Log.isLoggable("FragmentManager", i10);
    }

    private void K(i iVar) {
        if (iVar != null && iVar.equals(e0(iVar.f3052j))) {
            iVar.v1();
        }
    }

    private boolean K0(i iVar) {
        return (iVar.I && iVar.J) || iVar.f3068z.o();
    }

    private boolean L0() {
        i iVar = this.f3140x;
        if (iVar == null) {
            return true;
        }
        return iVar.n0() && this.f3140x.O().L0();
    }

    /* JADX INFO: finally extract failed */
    private void R(int i10) {
        try {
            this.f3118b = true;
            this.f3119c.d(i10);
            Y0(i10, false);
            for (f0 n10 : s()) {
                n10.n();
            }
            this.f3118b = false;
            Z(true);
        } catch (Throwable th2) {
            this.f3118b = false;
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void S0(Configuration configuration) {
        if (L0()) {
            y(configuration, false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void T0(Integer num) {
        if (L0() && num.intValue() == 80) {
            E(false);
        }
    }

    private void U() {
        if (this.L) {
            this.L = false;
            y1();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void U0(androidx.core.app.g gVar) {
        if (L0()) {
            F(gVar.a(), false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void V0(androidx.core.app.p pVar) {
        if (L0()) {
            M(pVar.a(), false);
        }
    }

    private void W() {
        for (f0 n10 : s()) {
            n10.n();
        }
    }

    private void Y(boolean z10) {
        if (this.f3118b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f3138v == null) {
            if (this.K) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f3138v.g().getLooper()) {
            if (!z10) {
                p();
            }
            if (this.M == null) {
                this.M = new ArrayList();
                this.N = new ArrayList();
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    private static void b0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        while (i10 < i11) {
            a aVar = (a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                aVar.t(-1);
                aVar.z();
            } else {
                aVar.t(1);
                aVar.y();
            }
            i10++;
        }
    }

    private void c0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        ArrayList arrayList3;
        boolean z10 = ((a) arrayList.get(i10)).f3222r;
        ArrayList arrayList4 = this.O;
        if (arrayList4 == null) {
            this.O = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.O.addAll(this.f3119c.o());
        i A0 = A0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            a aVar = (a) arrayList.get(i12);
            A0 = !((Boolean) arrayList2.get(i12)).booleanValue() ? aVar.A(this.O, A0) : aVar.D(this.O, A0);
            z11 = z11 || aVar.f3213i;
        }
        this.O.clear();
        if (!z10 && this.f3137u >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator it = ((a) arrayList.get(i13)).f3207c.iterator();
                while (it.hasNext()) {
                    i iVar = ((x.a) it.next()).f3225b;
                    if (!(iVar == null || iVar.f3066x == null)) {
                        this.f3119c.r(u(iVar));
                    }
                }
            }
        }
        b0(arrayList, arrayList2, i10, i11);
        boolean booleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
        if (z11 && (arrayList3 = this.f3129m) != null && !arrayList3.isEmpty()) {
            LinkedHashSet<i> linkedHashSet = new LinkedHashSet<>();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(m0((a) it2.next()));
            }
            Iterator it3 = this.f3129m.iterator();
            while (it3.hasNext()) {
                l lVar = (l) it3.next();
                for (i c10 : linkedHashSet) {
                    lVar.c(c10, booleanValue);
                }
            }
            Iterator it4 = this.f3129m.iterator();
            while (it4.hasNext()) {
                l lVar2 = (l) it4.next();
                for (i a10 : linkedHashSet) {
                    lVar2.a(a10, booleanValue);
                }
            }
        }
        for (int i14 = i10; i14 < i11; i14++) {
            a aVar2 = (a) arrayList.get(i14);
            if (booleanValue) {
                for (int size = aVar2.f3207c.size() - 1; size >= 0; size--) {
                    i iVar2 = ((x.a) aVar2.f3207c.get(size)).f3225b;
                    if (iVar2 != null) {
                        u(iVar2).m();
                    }
                }
            } else {
                Iterator it5 = aVar2.f3207c.iterator();
                while (it5.hasNext()) {
                    i iVar3 = ((x.a) it5.next()).f3225b;
                    if (iVar3 != null) {
                        u(iVar3).m();
                    }
                }
            }
        }
        Y0(this.f3137u, true);
        for (f0 f0Var : t(arrayList, i10, i11)) {
            f0Var.v(booleanValue);
            f0Var.t();
            f0Var.k();
        }
        while (i10 < i11) {
            a aVar3 = (a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue() && aVar3.f2928v >= 0) {
                aVar3.f2928v = -1;
            }
            aVar3.C();
            i10++;
        }
        if (z11) {
            k1();
        }
    }

    private int f0(String str, int i10, boolean z10) {
        ArrayList arrayList = this.f3120d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str != null || i10 >= 0) {
            int size = this.f3120d.size() - 1;
            while (size >= 0) {
                a aVar = (a) this.f3120d.get(size);
                if ((str != null && str.equals(aVar.B())) || (i10 >= 0 && i10 == aVar.f2928v)) {
                    break;
                }
                size--;
            }
            if (size < 0) {
                return size;
            }
            if (z10) {
                while (size > 0) {
                    a aVar2 = (a) this.f3120d.get(size - 1);
                    if ((str == null || !str.equals(aVar2.B())) && (i10 < 0 || i10 != aVar2.f2928v)) {
                        return size;
                    }
                    size--;
                }
                return size;
            } else if (size == this.f3120d.size() - 1) {
                return -1;
            } else {
                return size + 1;
            }
        } else if (z10) {
            return 0;
        } else {
            return this.f3120d.size() - 1;
        }
    }

    private boolean g1(String str, int i10, int i11) {
        Z(false);
        Y(true);
        i iVar = this.f3141y;
        if (iVar != null && i10 < 0 && str == null && iVar.v().e1()) {
            return true;
        }
        boolean h12 = h1(this.M, this.N, str, i10, i11);
        if (h12) {
            this.f3118b = true;
            try {
                j1(this.M, this.N);
            } finally {
                q();
            }
        }
        A1();
        U();
        this.f3119c.b();
        return h12;
    }

    static q j0(View view) {
        j jVar;
        i k02 = k0(view);
        if (k02 == null) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    jVar = null;
                    break;
                } else if (context instanceof j) {
                    jVar = (j) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (jVar != null) {
                return jVar.F0();
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        } else if (k02.n0()) {
            return k02.v();
        } else {
            throw new IllegalStateException("The Fragment " + k02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
    }

    private void j1(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size) {
                    if (!((a) arrayList.get(i10)).f3222r) {
                        if (i11 != i10) {
                            c0(arrayList, arrayList2, i11, i10);
                        }
                        i11 = i10 + 1;
                        if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                            while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((a) arrayList.get(i11)).f3222r) {
                                i11++;
                            }
                        }
                        c0(arrayList, arrayList2, i10, i11);
                        i10 = i11 - 1;
                    }
                    i10++;
                }
                if (i11 != size) {
                    c0(arrayList, arrayList2, i11, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    static i k0(View view) {
        while (view != null) {
            i D0 = D0(view);
            if (D0 != null) {
                return D0;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void k1() {
        if (this.f3129m != null) {
            for (int i10 = 0; i10 < this.f3129m.size(); i10++) {
                ((l) this.f3129m.get(i10)).b();
            }
        }
    }

    private void l0() {
        for (f0 o10 : s()) {
            o10.o();
        }
    }

    private Set m0(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.f3207c.size(); i10++) {
            i iVar = ((x.a) aVar.f3207c.get(i10)).f3225b;
            if (iVar != null && aVar.f3213i) {
                hashSet.add(iVar);
            }
        }
        return hashSet;
    }

    private boolean n0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f3117a) {
            if (this.f3117a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f3117a.size();
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    z10 |= ((m) this.f3117a.get(i10)).a(arrayList, arrayList2);
                }
                return z10;
            } finally {
                this.f3117a.clear();
                this.f3138v.g().removeCallbacks(this.R);
            }
        }
    }

    static int o1(int i10) {
        int i11 = 4097;
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 != 8194) {
            i11 = 8197;
            if (i10 == 8197) {
                return 4100;
            }
            if (i10 == 4099) {
                return 4099;
            }
            if (i10 != 4100) {
                return 0;
            }
        }
        return i11;
    }

    private void p() {
        if (Q0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void q() {
        this.f3118b = false;
        this.N.clear();
        this.M.clear();
    }

    private t q0(i iVar) {
        return this.P.l(iVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r() {
        /*
            r5 = this;
            androidx.fragment.app.n r0 = r5.f3138v
            boolean r1 = r0 instanceof androidx.lifecycle.x0
            if (r1 == 0) goto L_0x0011
            androidx.fragment.app.w r0 = r5.f3119c
            androidx.fragment.app.t r0 = r0.p()
            boolean r0 = r0.p()
            goto L_0x0027
        L_0x0011:
            android.content.Context r0 = r0.f()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0029
            androidx.fragment.app.n r0 = r5.f3138v
            android.content.Context r0 = r0.f()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            r0 = r0 ^ 1
        L_0x0027:
            if (r0 == 0) goto L_0x005c
        L_0x0029:
            java.util.Map r0 = r5.f3126j
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0033:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.c r1 = (androidx.fragment.app.c) r1
            java.util.List r1 = r1.f2956e
            java.util.Iterator r1 = r1.iterator()
        L_0x0045:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0033
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            androidx.fragment.app.w r3 = r5.f3119c
            androidx.fragment.app.t r3 = r3.p()
            r4 = 0
            r3.i(r2, r4)
            goto L_0x0045
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q.r():void");
    }

    private Set s() {
        HashSet hashSet = new HashSet();
        for (v k10 : this.f3119c.k()) {
            ViewGroup viewGroup = k10.k().L;
            if (viewGroup != null) {
                hashSet.add(f0.s(viewGroup, B0()));
            }
        }
        return hashSet;
    }

    private ViewGroup s0(i iVar) {
        ViewGroup viewGroup = iVar.L;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (iVar.C > 0 && this.f3139w.d()) {
            View c10 = this.f3139w.c(iVar.C);
            if (c10 instanceof ViewGroup) {
                return (ViewGroup) c10;
            }
        }
        return null;
    }

    private Set t(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator it = ((a) arrayList.get(i10)).f3207c.iterator();
            while (it.hasNext()) {
                i iVar = ((x.a) it.next()).f3225b;
                if (!(iVar == null || (viewGroup = iVar.L) == null)) {
                    hashSet.add(f0.r(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    private void w1(i iVar) {
        ViewGroup s02 = s0(iVar);
        if (s02 != null && iVar.x() + iVar.B() + iVar.R() + iVar.S() > 0) {
            int i10 = m0.b.visible_removing_fragment_view_tag;
            if (s02.getTag(i10) == null) {
                s02.setTag(i10, iVar);
            }
            ((i) s02.getTag(i10)).N1(iVar.Q());
        }
    }

    private void y1() {
        for (v b12 : this.f3119c.k()) {
            b1(b12);
        }
    }

    private void z1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new c0("FragmentManager"));
        n nVar = this.f3138v;
        if (nVar != null) {
            try {
                nVar.h("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
            }
        } else {
            V("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* access modifiers changed from: package-private */
    public void A() {
        this.I = false;
        this.J = false;
        this.P.r(false);
        R(1);
    }

    public i A0() {
        return this.f3141y;
    }

    /* access modifiers changed from: package-private */
    public boolean B(Menu menu, MenuInflater menuInflater) {
        if (this.f3137u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (i iVar : this.f3119c.o()) {
            if (iVar != null && N0(iVar) && iVar.i1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(iVar);
                z10 = true;
            }
        }
        if (this.f3121e != null) {
            for (int i10 = 0; i10 < this.f3121e.size(); i10++) {
                i iVar2 = (i) this.f3121e.get(i10);
                if (arrayList == null || !arrayList.contains(iVar2)) {
                    iVar2.I0();
                }
            }
        }
        this.f3121e = arrayList;
        return z10;
    }

    /* access modifiers changed from: package-private */
    public g0 B0() {
        g0 g0Var = this.B;
        if (g0Var != null) {
            return g0Var;
        }
        i iVar = this.f3140x;
        return iVar != null ? iVar.f3066x.B0() : this.C;
    }

    /* access modifiers changed from: package-private */
    public void C() {
        this.K = true;
        Z(true);
        W();
        r();
        R(-1);
        n nVar = this.f3138v;
        if (nVar instanceof androidx.core.content.c) {
            ((androidx.core.content.c) nVar).E(this.f3133q);
        }
        n nVar2 = this.f3138v;
        if (nVar2 instanceof androidx.core.content.b) {
            ((androidx.core.content.b) nVar2).g0(this.f3132p);
        }
        n nVar3 = this.f3138v;
        if (nVar3 instanceof androidx.core.app.n) {
            ((androidx.core.app.n) nVar3).c0(this.f3134r);
        }
        n nVar4 = this.f3138v;
        if (nVar4 instanceof androidx.core.app.o) {
            ((androidx.core.app.o) nVar4).C(this.f3135s);
        }
        n nVar5 = this.f3138v;
        if ((nVar5 instanceof s) && this.f3140x == null) {
            ((s) nVar5).o(this.f3136t);
        }
        this.f3138v = null;
        this.f3139w = null;
        this.f3140x = null;
        if (this.f3123g != null) {
            this.f3124h.h();
            this.f3123g = null;
        }
        d.c cVar = this.D;
        if (cVar != null) {
            cVar.c();
            this.E.c();
            this.F.c();
        }
    }

    public c.C0192c C0() {
        return this.Q;
    }

    /* access modifiers changed from: package-private */
    public void D() {
        R(1);
    }

    /* access modifiers changed from: package-private */
    public void E(boolean z10) {
        if (z10 && (this.f3138v instanceof androidx.core.content.c)) {
            z1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (i iVar : this.f3119c.o()) {
            if (iVar != null) {
                iVar.o1();
                if (z10) {
                    iVar.f3068z.E(true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public w0 E0(i iVar) {
        return this.P.o(iVar);
    }

    /* access modifiers changed from: package-private */
    public void F(boolean z10, boolean z11) {
        if (z11 && (this.f3138v instanceof androidx.core.app.n)) {
            z1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (i iVar : this.f3119c.o()) {
            if (iVar != null) {
                iVar.p1(z10);
                if (z11) {
                    iVar.f3068z.F(z10, true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void F0() {
        Z(true);
        if (this.f3124h.g()) {
            e1();
        } else {
            this.f3123g.k();
        }
    }

    /* access modifiers changed from: package-private */
    public void G(i iVar) {
        Iterator it = this.f3131o.iterator();
        while (it.hasNext()) {
            ((n0.q) it.next()).a(this, iVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void G0(i iVar) {
        if (J0(2)) {
            Log.v("FragmentManager", "hide: " + iVar);
        }
        if (!iVar.E) {
            iVar.E = true;
            iVar.S = true ^ iVar.S;
            w1(iVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
        for (i iVar : this.f3119c.l()) {
            if (iVar != null) {
                iVar.M0(iVar.o0());
                iVar.f3068z.H();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void H0(i iVar) {
        if (iVar.f3058p && K0(iVar)) {
            this.H = true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean I(MenuItem menuItem) {
        if (this.f3137u < 1) {
            return false;
        }
        for (i iVar : this.f3119c.o()) {
            if (iVar != null && iVar.q1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean I0() {
        return this.K;
    }

    /* access modifiers changed from: package-private */
    public void J(Menu menu) {
        if (this.f3137u >= 1) {
            for (i iVar : this.f3119c.o()) {
                if (iVar != null) {
                    iVar.r1(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void L() {
        R(5);
    }

    /* access modifiers changed from: package-private */
    public void M(boolean z10, boolean z11) {
        if (z11 && (this.f3138v instanceof androidx.core.app.o)) {
            z1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (i iVar : this.f3119c.o()) {
            if (iVar != null) {
                iVar.t1(z10);
                if (z11) {
                    iVar.f3068z.M(z10, true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean M0(i iVar) {
        if (iVar == null) {
            return false;
        }
        return iVar.o0();
    }

    /* access modifiers changed from: package-private */
    public boolean N(Menu menu) {
        boolean z10 = false;
        if (this.f3137u < 1) {
            return false;
        }
        for (i iVar : this.f3119c.o()) {
            if (iVar != null && N0(iVar) && iVar.u1(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public boolean N0(i iVar) {
        if (iVar == null) {
            return true;
        }
        return iVar.q0();
    }

    /* access modifiers changed from: package-private */
    public void O() {
        A1();
        K(this.f3141y);
    }

    /* access modifiers changed from: package-private */
    public boolean O0(i iVar) {
        if (iVar == null) {
            return true;
        }
        q qVar = iVar.f3066x;
        return iVar.equals(qVar.A0()) && O0(qVar.f3140x);
    }

    /* access modifiers changed from: package-private */
    public void P() {
        this.I = false;
        this.J = false;
        this.P.r(false);
        R(7);
    }

    /* access modifiers changed from: package-private */
    public boolean P0(int i10) {
        return this.f3137u >= i10;
    }

    /* access modifiers changed from: package-private */
    public void Q() {
        this.I = false;
        this.J = false;
        this.P.r(false);
        R(5);
    }

    public boolean Q0() {
        return this.I || this.J;
    }

    /* access modifiers changed from: package-private */
    public void S() {
        this.J = true;
        this.P.r(true);
        R(4);
    }

    /* access modifiers changed from: package-private */
    public void T() {
        R(2);
    }

    public void V(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3119c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f3121e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(((i) this.f3121e.get(i10)).toString());
            }
        }
        ArrayList arrayList2 = this.f3120d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = (a) this.f3120d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.w(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3125i.get());
        synchronized (this.f3117a) {
            try {
                int size3 = this.f3117a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println((m) this.f3117a.get(i12));
                    }
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3138v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3139w);
        if (this.f3140x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3140x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3137u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    /* access modifiers changed from: package-private */
    public void W0(i iVar, String[] strArr, int i10) {
        if (this.F != null) {
            this.G.addLast(new k(iVar.f3052j, i10));
            this.F.a(strArr);
            return;
        }
        this.f3138v.m(iVar, strArr, i10);
    }

    /* access modifiers changed from: package-private */
    public void X(m mVar, boolean z10) {
        if (!z10) {
            if (this.f3138v != null) {
                p();
            } else if (this.K) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f3117a) {
            try {
                if (this.f3138v != null) {
                    this.f3117a.add(mVar);
                    s1();
                } else if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void X0(i iVar, Intent intent, int i10, Bundle bundle) {
        if (this.D != null) {
            this.G.addLast(new k(iVar.f3052j, i10));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.D.a(intent);
            return;
        }
        this.f3138v.p(iVar, intent, i10, bundle);
    }

    /* access modifiers changed from: package-private */
    public void Y0(int i10, boolean z10) {
        n nVar;
        if (this.f3138v == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z10 || i10 != this.f3137u) {
            this.f3137u = i10;
            this.f3119c.t();
            y1();
            if (this.H && (nVar = this.f3138v) != null && this.f3137u == 7) {
                nVar.q();
                this.H = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Z(boolean z10) {
        Y(z10);
        boolean z11 = false;
        while (n0(this.M, this.N)) {
            z11 = true;
            this.f3118b = true;
            try {
                j1(this.M, this.N);
            } finally {
                q();
            }
        }
        A1();
        U();
        this.f3119c.b();
        return z11;
    }

    /* access modifiers changed from: package-private */
    public void Z0() {
        if (this.f3138v != null) {
            this.I = false;
            this.J = false;
            this.P.r(false);
            for (i iVar : this.f3119c.o()) {
                if (iVar != null) {
                    iVar.v0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a0(m mVar, boolean z10) {
        if (!z10 || (this.f3138v != null && !this.K)) {
            Y(z10);
            if (mVar.a(this.M, this.N)) {
                this.f3118b = true;
                try {
                    j1(this.M, this.N);
                } finally {
                    q();
                }
            }
            A1();
            U();
            this.f3119c.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void a1(FragmentContainerView fragmentContainerView) {
        View view;
        for (v vVar : this.f3119c.k()) {
            i k10 = vVar.k();
            if (k10.C == fragmentContainerView.getId() && (view = k10.M) != null && view.getParent() == null) {
                k10.L = fragmentContainerView;
                vVar.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b1(v vVar) {
        i k10 = vVar.k();
        if (!k10.N) {
            return;
        }
        if (this.f3118b) {
            this.L = true;
            return;
        }
        k10.N = false;
        vVar.m();
    }

    /* access modifiers changed from: package-private */
    public void c1(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            X(new n((String) null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public boolean d0() {
        boolean Z = Z(true);
        l0();
        return Z;
    }

    public void d1(String str, int i10) {
        X(new n(str, -1, i10), false);
    }

    /* access modifiers changed from: package-private */
    public i e0(String str) {
        return this.f3119c.f(str);
    }

    public boolean e1() {
        return g1((String) null, -1, 0);
    }

    public boolean f1(int i10, int i11) {
        if (i10 >= 0) {
            return g1((String) null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    /* access modifiers changed from: package-private */
    public void g(a aVar) {
        if (this.f3120d == null) {
            this.f3120d = new ArrayList();
        }
        this.f3120d.add(aVar);
    }

    public i g0(int i10) {
        return this.f3119c.g(i10);
    }

    /* access modifiers changed from: package-private */
    public v h(i iVar) {
        String str = iVar.V;
        if (str != null) {
            o0.c.f(iVar, str);
        }
        if (J0(2)) {
            Log.v("FragmentManager", "add: " + iVar);
        }
        v u10 = u(iVar);
        iVar.f3066x = this;
        this.f3119c.r(u10);
        if (!iVar.F) {
            this.f3119c.a(iVar);
            iVar.f3059q = false;
            if (iVar.M == null) {
                iVar.S = false;
            }
            if (K0(iVar)) {
                this.H = true;
            }
        }
        return u10;
    }

    public i h0(String str) {
        return this.f3119c.h(str);
    }

    /* access modifiers changed from: package-private */
    public boolean h1(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        int f02 = f0(str, i10, (i11 & 1) != 0);
        if (f02 < 0) {
            return false;
        }
        for (int size = this.f3120d.size() - 1; size >= f02; size--) {
            arrayList.add((a) this.f3120d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public void i(n0.q qVar) {
        this.f3131o.add(qVar);
    }

    /* access modifiers changed from: package-private */
    public i i0(String str) {
        return this.f3119c.i(str);
    }

    /* access modifiers changed from: package-private */
    public void i1(i iVar) {
        if (J0(2)) {
            Log.v("FragmentManager", "remove: " + iVar + " nesting=" + iVar.f3065w);
        }
        boolean z10 = !iVar.p0();
        if (!iVar.F || z10) {
            this.f3119c.u(iVar);
            if (K0(iVar)) {
                this.H = true;
            }
            iVar.f3059q = true;
            w1(iVar);
        }
    }

    public void j(l lVar) {
        if (this.f3129m == null) {
            this.f3129m = new ArrayList();
        }
        this.f3129m.add(lVar);
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f3125i.getAndIncrement();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.activity.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: androidx.fragment.app.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: androidx.fragment.app.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: androidx.fragment.app.i} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(androidx.fragment.app.n r4, n0.k r5, androidx.fragment.app.i r6) {
        /*
            r3 = this;
            androidx.fragment.app.n r0 = r3.f3138v
            if (r0 != 0) goto L_0x0167
            r3.f3138v = r4
            r3.f3139w = r5
            r3.f3140x = r6
            if (r6 == 0) goto L_0x0015
            androidx.fragment.app.q$g r5 = new androidx.fragment.app.q$g
            r5.<init>(r6)
        L_0x0011:
            r3.i(r5)
            goto L_0x001d
        L_0x0015:
            boolean r5 = r4 instanceof n0.q
            if (r5 == 0) goto L_0x001d
            r5 = r4
            n0.q r5 = (n0.q) r5
            goto L_0x0011
        L_0x001d:
            androidx.fragment.app.i r5 = r3.f3140x
            if (r5 == 0) goto L_0x0024
            r3.A1()
        L_0x0024:
            boolean r5 = r4 instanceof androidx.activity.s
            if (r5 == 0) goto L_0x0039
            r5 = r4
            androidx.activity.s r5 = (androidx.activity.s) r5
            androidx.activity.q r0 = r5.k()
            r3.f3123g = r0
            if (r6 == 0) goto L_0x0034
            r5 = r6
        L_0x0034:
            androidx.activity.p r1 = r3.f3124h
            r0.h(r5, r1)
        L_0x0039:
            if (r6 == 0) goto L_0x0044
            androidx.fragment.app.q r4 = r6.f3066x
            androidx.fragment.app.t r4 = r4.q0(r6)
        L_0x0041:
            r3.P = r4
            goto L_0x005a
        L_0x0044:
            boolean r5 = r4 instanceof androidx.lifecycle.x0
            if (r5 == 0) goto L_0x0053
            androidx.lifecycle.x0 r4 = (androidx.lifecycle.x0) r4
            androidx.lifecycle.w0 r4 = r4.X()
            androidx.fragment.app.t r4 = androidx.fragment.app.t.m(r4)
            goto L_0x0041
        L_0x0053:
            androidx.fragment.app.t r4 = new androidx.fragment.app.t
            r5 = 0
            r4.<init>(r5)
            goto L_0x0041
        L_0x005a:
            androidx.fragment.app.t r4 = r3.P
            boolean r5 = r3.Q0()
            r4.r(r5)
            androidx.fragment.app.w r4 = r3.f3119c
            androidx.fragment.app.t r5 = r3.P
            r4.A(r5)
            androidx.fragment.app.n r4 = r3.f3138v
            boolean r5 = r4 instanceof b1.f
            if (r5 == 0) goto L_0x008b
            if (r6 != 0) goto L_0x008b
            b1.f r4 = (b1.f) r4
            b1.d r4 = r4.l()
            n0.p r5 = new n0.p
            r5.<init>(r3)
            java.lang.String r0 = "android:support:fragments"
            r4.h(r0, r5)
            android.os.Bundle r4 = r4.b(r0)
            if (r4 == 0) goto L_0x008b
            r3.n1(r4)
        L_0x008b:
            androidx.fragment.app.n r4 = r3.f3138v
            boolean r5 = r4 instanceof d.e
            if (r5 == 0) goto L_0x0123
            d.e r4 = (d.e) r4
            d.d r4 = r4.O()
            if (r6 == 0) goto L_0x00ad
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r6.f3052j
            r5.append(r0)
            java.lang.String r0 = ":"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            goto L_0x00af
        L_0x00ad:
            java.lang.String r5 = ""
        L_0x00af:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FragmentManager:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartActivityForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            e.d r1 = new e.d
            r1.<init>()
            androidx.fragment.app.q$h r2 = new androidx.fragment.app.q$h
            r2.<init>()
            d.c r0 = r4.j(r0, r1, r2)
            r3.D = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartIntentSenderForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.q$j r1 = new androidx.fragment.app.q$j
            r1.<init>()
            androidx.fragment.app.q$i r2 = new androidx.fragment.app.q$i
            r2.<init>()
            d.c r0 = r4.j(r0, r1, r2)
            r3.E = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "RequestPermissions"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            e.c r0 = new e.c
            r0.<init>()
            androidx.fragment.app.q$a r1 = new androidx.fragment.app.q$a
            r1.<init>()
            d.c r4 = r4.j(r5, r0, r1)
            r3.F = r4
        L_0x0123:
            androidx.fragment.app.n r4 = r3.f3138v
            boolean r5 = r4 instanceof androidx.core.content.b
            if (r5 == 0) goto L_0x0130
            androidx.core.content.b r4 = (androidx.core.content.b) r4
            androidx.core.util.a r5 = r3.f3132p
            r4.t(r5)
        L_0x0130:
            androidx.fragment.app.n r4 = r3.f3138v
            boolean r5 = r4 instanceof androidx.core.content.c
            if (r5 == 0) goto L_0x013d
            androidx.core.content.c r4 = (androidx.core.content.c) r4
            androidx.core.util.a r5 = r3.f3133q
            r4.F(r5)
        L_0x013d:
            androidx.fragment.app.n r4 = r3.f3138v
            boolean r5 = r4 instanceof androidx.core.app.n
            if (r5 == 0) goto L_0x014a
            androidx.core.app.n r4 = (androidx.core.app.n) r4
            androidx.core.util.a r5 = r3.f3134r
            r4.R(r5)
        L_0x014a:
            androidx.fragment.app.n r4 = r3.f3138v
            boolean r5 = r4 instanceof androidx.core.app.o
            if (r5 == 0) goto L_0x0157
            androidx.core.app.o r4 = (androidx.core.app.o) r4
            androidx.core.util.a r5 = r3.f3135s
            r4.L(r5)
        L_0x0157:
            androidx.fragment.app.n r4 = r3.f3138v
            boolean r5 = r4 instanceof androidx.core.view.s
            if (r5 == 0) goto L_0x0166
            if (r6 != 0) goto L_0x0166
            androidx.core.view.s r4 = (androidx.core.view.s) r4
            androidx.core.view.v r5 = r3.f3136t
            r4.M(r5)
        L_0x0166:
            return
        L_0x0167:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already attached"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q.l(androidx.fragment.app.n, n0.k, androidx.fragment.app.i):void");
    }

    public void l1(String str) {
        X(new o(str), false);
    }

    /* access modifiers changed from: package-private */
    public void m(i iVar) {
        if (J0(2)) {
            Log.v("FragmentManager", "attach: " + iVar);
        }
        if (iVar.F) {
            iVar.F = false;
            if (!iVar.f3058p) {
                this.f3119c.a(iVar);
                if (J0(2)) {
                    Log.v("FragmentManager", "add from attach: " + iVar);
                }
                if (K0(iVar)) {
                    this.H = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean m1(ArrayList arrayList, ArrayList arrayList2, String str) {
        c cVar = (c) this.f3126j.remove(str);
        if (cVar == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f2929w) {
                Iterator it2 = aVar.f3207c.iterator();
                while (it2.hasNext()) {
                    i iVar = ((x.a) it2.next()).f3225b;
                    if (iVar != null) {
                        hashMap.put(iVar.f3052j, iVar);
                    }
                }
            }
        }
        Iterator it3 = cVar.c(this, hashMap).iterator();
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!it3.hasNext()) {
                    return z10;
                }
                if (((a) it3.next()).a(arrayList, arrayList2) || z10) {
                    z10 = true;
                }
            }
        }
    }

    public x n() {
        return new a(this);
    }

    /* access modifiers changed from: package-private */
    public void n1(Parcelable parcelable) {
        v vVar;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable != null) {
            Bundle bundle3 = (Bundle) parcelable;
            for (String next : bundle3.keySet()) {
                if (next.startsWith("result_") && (bundle2 = bundle3.getBundle(next)) != null) {
                    bundle2.setClassLoader(this.f3138v.f().getClassLoader());
                    this.f3127k.put(next.substring(7), bundle2);
                }
            }
            HashMap hashMap = new HashMap();
            for (String next2 : bundle3.keySet()) {
                if (next2.startsWith("fragment_") && (bundle = bundle3.getBundle(next2)) != null) {
                    bundle.setClassLoader(this.f3138v.f().getClassLoader());
                    hashMap.put(next2.substring(9), bundle);
                }
            }
            this.f3119c.x(hashMap);
            s sVar = (s) bundle3.getParcelable("state");
            if (sVar != null) {
                this.f3119c.v();
                Iterator it = sVar.f3163e.iterator();
                while (it.hasNext()) {
                    Bundle B2 = this.f3119c.B((String) it.next(), (Bundle) null);
                    if (B2 != null) {
                        i k10 = this.P.k(((u) B2.getParcelable("state")).f3180f);
                        if (k10 != null) {
                            if (J0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + k10);
                            }
                            vVar = new v(this.f3130n, this.f3119c, k10, B2);
                        } else {
                            vVar = new v(this.f3130n, this.f3119c, this.f3138v.f().getClassLoader(), t0(), B2);
                        }
                        i k11 = vVar.k();
                        k11.f3047f = B2;
                        k11.f3066x = this;
                        if (J0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + k11.f3052j + "): " + k11);
                        }
                        vVar.o(this.f3138v.f().getClassLoader());
                        this.f3119c.r(vVar);
                        vVar.s(this.f3137u);
                    }
                }
                for (i iVar : this.P.n()) {
                    if (!this.f3119c.c(iVar.f3052j)) {
                        if (J0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + iVar + " that was not found in the set of active Fragments " + sVar.f3163e);
                        }
                        this.P.q(iVar);
                        iVar.f3066x = this;
                        v vVar2 = new v(this.f3130n, this.f3119c, iVar);
                        vVar2.s(1);
                        vVar2.m();
                        iVar.f3059q = true;
                        vVar2.m();
                    }
                }
                this.f3119c.w(sVar.f3164f);
                if (sVar.f3165g != null) {
                    this.f3120d = new ArrayList(sVar.f3165g.length);
                    int i10 = 0;
                    while (true) {
                        b[] bVarArr = sVar.f3165g;
                        if (i10 >= bVarArr.length) {
                            break;
                        }
                        a d10 = bVarArr[i10].d(this);
                        if (J0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + d10.f2928v + "): " + d10);
                            PrintWriter printWriter = new PrintWriter(new c0("FragmentManager"));
                            d10.x("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f3120d.add(d10);
                        i10++;
                    }
                } else {
                    this.f3120d = null;
                }
                this.f3125i.set(sVar.f3166h);
                String str = sVar.f3167i;
                if (str != null) {
                    i e02 = e0(str);
                    this.f3141y = e02;
                    K(e02);
                }
                ArrayList arrayList = sVar.f3168j;
                if (arrayList != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        this.f3126j.put((String) arrayList.get(i11), (c) sVar.f3169k.get(i11));
                    }
                }
                this.G = new ArrayDeque(sVar.f3170l);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        boolean z10 = false;
        for (i iVar : this.f3119c.l()) {
            if (iVar != null) {
                z10 = K0(iVar);
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public List o0() {
        return this.f3119c.l();
    }

    public int p0() {
        ArrayList arrayList = this.f3120d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public Bundle R0() {
        b[] bVarArr;
        int size;
        Bundle bundle = new Bundle();
        l0();
        W();
        Z(true);
        this.I = true;
        this.P.r(true);
        ArrayList y10 = this.f3119c.y();
        HashMap m10 = this.f3119c.m();
        if (!m10.isEmpty()) {
            ArrayList z10 = this.f3119c.z();
            ArrayList arrayList = this.f3120d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                bVarArr = null;
            } else {
                bVarArr = new b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    bVarArr[i10] = new b((a) this.f3120d.get(i10));
                    if (J0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f3120d.get(i10));
                    }
                }
            }
            s sVar = new s();
            sVar.f3163e = y10;
            sVar.f3164f = z10;
            sVar.f3165g = bVarArr;
            sVar.f3166h = this.f3125i.get();
            i iVar = this.f3141y;
            if (iVar != null) {
                sVar.f3167i = iVar.f3052j;
            }
            sVar.f3168j.addAll(this.f3126j.keySet());
            sVar.f3169k.addAll(this.f3126j.values());
            sVar.f3170l = new ArrayList(this.G);
            bundle.putParcelable("state", sVar);
            for (String str : this.f3127k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f3127k.get(str));
            }
            for (String str2 : m10.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) m10.get(str2));
            }
        } else if (J0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public void q1(String str) {
        X(new p(str), false);
    }

    /* access modifiers changed from: package-private */
    public n0.k r0() {
        return this.f3139w;
    }

    /* access modifiers changed from: package-private */
    public boolean r1(ArrayList arrayList, ArrayList arrayList2, String str) {
        StringBuilder sb2;
        Object obj;
        int i10;
        String str2 = str;
        int f02 = f0(str2, -1, true);
        if (f02 < 0) {
            return false;
        }
        for (int i11 = f02; i11 < this.f3120d.size(); i11++) {
            a aVar = (a) this.f3120d.get(i11);
            if (!aVar.f3222r) {
                z1(new IllegalArgumentException("saveBackStack(\"" + str2 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i12 = f02; i12 < this.f3120d.size(); i12++) {
            a aVar2 = (a) this.f3120d.get(i12);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator it = aVar2.f3207c.iterator();
            while (it.hasNext()) {
                x.a aVar3 = (x.a) it.next();
                i iVar = aVar3.f3225b;
                if (iVar != null) {
                    if (!aVar3.f3226c || (i10 = aVar3.f3224a) == 1 || i10 == 2 || i10 == 8) {
                        hashSet.add(iVar);
                        hashSet2.add(iVar);
                    }
                    int i13 = aVar3.f3224a;
                    if (i13 == 1 || i13 == 2) {
                        hashSet3.add(iVar);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("saveBackStack(\"");
                sb3.append(str2);
                sb3.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if (hashSet2.size() == 1) {
                    sb2 = new StringBuilder();
                    sb2.append(" ");
                    obj = hashSet2.iterator().next();
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("s ");
                    obj = hashSet2;
                }
                sb2.append(obj);
                sb3.append(sb2.toString());
                sb3.append(" in ");
                sb3.append(aVar2);
                sb3.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                z1(new IllegalArgumentException(sb3.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            i iVar2 = (i) arrayDeque.removeFirst();
            if (iVar2.G) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("saveBackStack(\"");
                sb4.append(str2);
                sb4.append("\") must not contain retained fragments. Found ");
                sb4.append(hashSet.contains(iVar2) ? "direct reference to retained " : "retained child ");
                sb4.append("fragment ");
                sb4.append(iVar2);
                z1(new IllegalArgumentException(sb4.toString()));
            }
            for (i iVar3 : iVar2.f3068z.o0()) {
                if (iVar3 != null) {
                    arrayDeque.addLast(iVar3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((i) it2.next()).f3052j);
        }
        ArrayList arrayList4 = new ArrayList(this.f3120d.size() - f02);
        for (int i14 = f02; i14 < this.f3120d.size(); i14++) {
            arrayList4.add((Object) null);
        }
        c cVar = new c(arrayList3, arrayList4);
        for (int size = this.f3120d.size() - 1; size >= f02; size--) {
            a aVar4 = (a) this.f3120d.remove(size);
            a aVar5 = new a(aVar4);
            aVar5.u();
            arrayList4.set(size - f02, new b(aVar5));
            aVar4.f2929w = true;
            arrayList.add(aVar4);
            arrayList2.add(Boolean.TRUE);
        }
        this.f3126j.put(str2, cVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void s1() {
        synchronized (this.f3117a) {
            try {
                if (this.f3117a.size() == 1) {
                    this.f3138v.g().removeCallbacks(this.R);
                    this.f3138v.g().post(this.R);
                    A1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m t0() {
        m mVar = this.f3142z;
        if (mVar != null) {
            return mVar;
        }
        i iVar = this.f3140x;
        return iVar != null ? iVar.f3066x.t0() : this.A;
    }

    /* access modifiers changed from: package-private */
    public void t1(i iVar, boolean z10) {
        ViewGroup s02 = s0(iVar);
        if (s02 != null && (s02 instanceof FragmentContainerView)) {
            ((FragmentContainerView) s02).setDrawDisappearingViewsLast(!z10);
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        i iVar = this.f3140x;
        if (iVar != null) {
            sb2.append(iVar.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f3140x;
        } else {
            n nVar = this.f3138v;
            if (nVar != null) {
                sb2.append(nVar.getClass().getSimpleName());
                sb2.append("{");
                obj = this.f3138v;
            } else {
                sb2.append("null");
                sb2.append("}}");
                return sb2.toString();
            }
        }
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        sb2.append("}");
        sb2.append("}}");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public v u(i iVar) {
        v n10 = this.f3119c.n(iVar.f3052j);
        if (n10 != null) {
            return n10;
        }
        v vVar = new v(this.f3130n, this.f3119c, iVar);
        vVar.o(this.f3138v.f().getClassLoader());
        vVar.s(this.f3137u);
        return vVar;
    }

    /* access modifiers changed from: package-private */
    public w u0() {
        return this.f3119c;
    }

    /* access modifiers changed from: package-private */
    public void u1(i iVar, k.b bVar) {
        if (!iVar.equals(e0(iVar.f3052j)) || !(iVar.f3067y == null || iVar.f3066x == this)) {
            throw new IllegalArgumentException("Fragment " + iVar + " is not an active fragment of FragmentManager " + this);
        }
        iVar.W = bVar;
    }

    /* access modifiers changed from: package-private */
    public void v(i iVar) {
        if (J0(2)) {
            Log.v("FragmentManager", "detach: " + iVar);
        }
        if (!iVar.F) {
            iVar.F = true;
            if (iVar.f3058p) {
                if (J0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + iVar);
                }
                this.f3119c.u(iVar);
                if (K0(iVar)) {
                    this.H = true;
                }
                w1(iVar);
            }
        }
    }

    public List v0() {
        return this.f3119c.o();
    }

    /* access modifiers changed from: package-private */
    public void v1(i iVar) {
        if (iVar == null || (iVar.equals(e0(iVar.f3052j)) && (iVar.f3067y == null || iVar.f3066x == this))) {
            i iVar2 = this.f3141y;
            this.f3141y = iVar;
            K(iVar2);
            K(this.f3141y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + iVar + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.I = false;
        this.J = false;
        this.P.r(false);
        R(4);
    }

    public n w0() {
        return this.f3138v;
    }

    /* access modifiers changed from: package-private */
    public void x() {
        this.I = false;
        this.J = false;
        this.P.r(false);
        R(0);
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 x0() {
        return this.f3122f;
    }

    /* access modifiers changed from: package-private */
    public void x1(i iVar) {
        if (J0(2)) {
            Log.v("FragmentManager", "show: " + iVar);
        }
        if (iVar.E) {
            iVar.E = false;
            iVar.S = !iVar.S;
        }
    }

    /* access modifiers changed from: package-private */
    public void y(Configuration configuration, boolean z10) {
        if (z10 && (this.f3138v instanceof androidx.core.content.b)) {
            z1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (i iVar : this.f3119c.o()) {
            if (iVar != null) {
                iVar.f1(configuration);
                if (z10) {
                    iVar.f3068z.y(configuration, true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public p y0() {
        return this.f3130n;
    }

    /* access modifiers changed from: package-private */
    public boolean z(MenuItem menuItem) {
        if (this.f3137u < 1) {
            return false;
        }
        for (i iVar : this.f3119c.o()) {
            if (iVar != null && iVar.g1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public i z0() {
        return this.f3140x;
    }
}
