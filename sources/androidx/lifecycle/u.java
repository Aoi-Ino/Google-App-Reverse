package androidx.lifecycle;

import androidx.lifecycle.k;
import cm.g;
import cm.l;
import j.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import k.b;
import om.m;
import om.v;

public class u extends k {

    /* renamed from: k  reason: collision with root package name */
    public static final a f3341k = new a((g) null);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3342b;

    /* renamed from: c  reason: collision with root package name */
    private k.a f3343c;

    /* renamed from: d  reason: collision with root package name */
    private k.b f3344d;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference f3345e;

    /* renamed from: f  reason: collision with root package name */
    private int f3346f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3347g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3348h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList f3349i;

    /* renamed from: j  reason: collision with root package name */
    private final m f3350j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final k.b a(k.b bVar, k.b bVar2) {
            l.f(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private k.b f3351a;

        /* renamed from: b  reason: collision with root package name */
        private o f3352b;

        public b(r rVar, k.b bVar) {
            l.f(bVar, "initialState");
            l.c(rVar);
            this.f3352b = w.f(rVar);
            this.f3351a = bVar;
        }

        public final void a(s sVar, k.a aVar) {
            l.f(aVar, "event");
            k.b b10 = aVar.b();
            this.f3351a = u.f3341k.a(this.f3351a, b10);
            o oVar = this.f3352b;
            l.c(sVar);
            oVar.d(sVar, aVar);
            this.f3351a = b10;
        }

        public final k.b b() {
            return this.f3351a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public u(s sVar) {
        this(sVar, true);
        l.f(sVar, "provider");
    }

    private final void e(s sVar) {
        Iterator descendingIterator = this.f3343c.descendingIterator();
        l.e(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f3348h) {
            Map.Entry entry = (Map.Entry) descendingIterator.next();
            l.e(entry, "next()");
            r rVar = (r) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f3344d) > 0 && !this.f3348h && this.f3343c.contains(rVar)) {
                k.a a10 = k.a.Companion.a(bVar.b());
                if (a10 != null) {
                    n(a10.b());
                    bVar.a(sVar, a10);
                    m();
                } else {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r4 = (androidx.lifecycle.u.b) r4.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.lifecycle.k.b f(androidx.lifecycle.r r4) {
        /*
            r3 = this;
            k.a r0 = r3.f3343c
            java.util.Map$Entry r4 = r0.B(r4)
            r0 = 0
            if (r4 == 0) goto L_0x0016
            java.lang.Object r4 = r4.getValue()
            androidx.lifecycle.u$b r4 = (androidx.lifecycle.u.b) r4
            if (r4 == 0) goto L_0x0016
            androidx.lifecycle.k$b r4 = r4.b()
            goto L_0x0017
        L_0x0016:
            r4 = r0
        L_0x0017:
            java.util.ArrayList r1 = r3.f3349i
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x002f
            java.util.ArrayList r0 = r3.f3349i
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            androidx.lifecycle.k$b r0 = (androidx.lifecycle.k.b) r0
        L_0x002f:
            androidx.lifecycle.u$a r1 = f3341k
            androidx.lifecycle.k$b r2 = r3.f3344d
            androidx.lifecycle.k$b r4 = r1.a(r2, r4)
            androidx.lifecycle.k$b r4 = r1.a(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.u.f(androidx.lifecycle.r):androidx.lifecycle.k$b");
    }

    private final void g(String str) {
        if (this.f3342b && !c.g().b()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    private final void h(s sVar) {
        b.d o10 = this.f3343c.o();
        l.e(o10, "observerMap.iteratorWithAdditions()");
        while (o10.hasNext() && !this.f3348h) {
            Map.Entry entry = (Map.Entry) o10.next();
            r rVar = (r) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f3344d) < 0 && !this.f3348h && this.f3343c.contains(rVar)) {
                n(bVar.b());
                k.a b10 = k.a.Companion.b(bVar.b());
                if (b10 != null) {
                    bVar.a(sVar, b10);
                    m();
                } else {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
            }
        }
    }

    private final boolean j() {
        if (this.f3343c.size() == 0) {
            return true;
        }
        Map.Entry l10 = this.f3343c.l();
        l.c(l10);
        k.b b10 = ((b) l10.getValue()).b();
        Map.Entry r10 = this.f3343c.r();
        l.c(r10);
        k.b b11 = ((b) r10.getValue()).b();
        return b10 == b11 && this.f3344d == b11;
    }

    private final void l(k.b bVar) {
        k.b bVar2 = this.f3344d;
        if (bVar2 != bVar) {
            if (bVar2 == k.b.INITIALIZED && bVar == k.b.DESTROYED) {
                throw new IllegalStateException(("no event down from " + this.f3344d + " in component " + this.f3345e.get()).toString());
            }
            this.f3344d = bVar;
            if (this.f3347g || this.f3346f != 0) {
                this.f3348h = true;
                return;
            }
            this.f3347g = true;
            p();
            this.f3347g = false;
            if (this.f3344d == k.b.DESTROYED) {
                this.f3343c = new k.a();
            }
        }
    }

    private final void m() {
        ArrayList arrayList = this.f3349i;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void n(k.b bVar) {
        this.f3349i.add(bVar);
    }

    private final void p() {
        s sVar = (s) this.f3345e.get();
        if (sVar != null) {
            while (true) {
                boolean j10 = j();
                this.f3348h = false;
                if (!j10) {
                    k.b bVar = this.f3344d;
                    Map.Entry l10 = this.f3343c.l();
                    l.c(l10);
                    if (bVar.compareTo(((b) l10.getValue()).b()) < 0) {
                        e(sVar);
                    }
                    Map.Entry r10 = this.f3343c.r();
                    if (!this.f3348h && r10 != null && this.f3344d.compareTo(((b) r10.getValue()).b()) > 0) {
                        h(sVar);
                    }
                } else {
                    this.f3350j.setValue(b());
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
    }

    public void a(r rVar) {
        s sVar;
        l.f(rVar, "observer");
        g("addObserver");
        k.b bVar = this.f3344d;
        k.b bVar2 = k.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = k.b.INITIALIZED;
        }
        b bVar3 = new b(rVar, bVar2);
        if (((b) this.f3343c.v(rVar, bVar3)) == null && (sVar = (s) this.f3345e.get()) != null) {
            boolean z10 = this.f3346f != 0 || this.f3347g;
            k.b f10 = f(rVar);
            this.f3346f++;
            while (bVar3.b().compareTo(f10) < 0 && this.f3343c.contains(rVar)) {
                n(bVar3.b());
                k.a b10 = k.a.Companion.b(bVar3.b());
                if (b10 != null) {
                    bVar3.a(sVar, b10);
                    m();
                    f10 = f(rVar);
                } else {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
            }
            if (!z10) {
                p();
            }
            this.f3346f--;
        }
    }

    public k.b b() {
        return this.f3344d;
    }

    public void d(r rVar) {
        l.f(rVar, "observer");
        g("removeObserver");
        this.f3343c.y(rVar);
    }

    public void i(k.a aVar) {
        l.f(aVar, "event");
        g("handleLifecycleEvent");
        l(aVar.b());
    }

    public void k(k.b bVar) {
        l.f(bVar, "state");
        g("markState");
        o(bVar);
    }

    public void o(k.b bVar) {
        l.f(bVar, "state");
        g("setCurrentState");
        l(bVar);
    }

    private u(s sVar, boolean z10) {
        this.f3342b = z10;
        this.f3343c = new k.a();
        k.b bVar = k.b.INITIALIZED;
        this.f3344d = bVar;
        this.f3349i = new ArrayList();
        this.f3345e = new WeakReference(sVar);
        this.f3350j = v.a(bVar);
    }
}
