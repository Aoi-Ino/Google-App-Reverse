package m;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.j;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import androidx.lifecycle.x;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import m.a;
import m.q;

public class r extends t0 {
    private int A = 0;
    private a0 B;
    private a0 C;

    /* renamed from: d  reason: collision with root package name */
    private Executor f13609d;

    /* renamed from: e  reason: collision with root package name */
    private q.a f13610e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference f13611f;

    /* renamed from: g  reason: collision with root package name */
    private q.d f13612g;

    /* renamed from: h  reason: collision with root package name */
    private q.c f13613h;

    /* renamed from: i  reason: collision with root package name */
    private a f13614i;

    /* renamed from: j  reason: collision with root package name */
    private s f13615j;

    /* renamed from: k  reason: collision with root package name */
    private DialogInterface.OnClickListener f13616k;

    /* renamed from: l  reason: collision with root package name */
    private CharSequence f13617l;

    /* renamed from: m  reason: collision with root package name */
    private int f13618m = 0;

    /* renamed from: n  reason: collision with root package name */
    private boolean f13619n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13620o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f13621p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f13622q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f13623r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f13624s;

    /* renamed from: t  reason: collision with root package name */
    private a0 f13625t;

    /* renamed from: u  reason: collision with root package name */
    private a0 f13626u;

    /* renamed from: v  reason: collision with root package name */
    private a0 f13627v;

    /* renamed from: w  reason: collision with root package name */
    private a0 f13628w;

    /* renamed from: x  reason: collision with root package name */
    private a0 f13629x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f13630y = true;

    /* renamed from: z  reason: collision with root package name */
    private a0 f13631z;

    class a extends q.a {
        a() {
        }
    }

    private static final class b extends a.d {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference f13633a;

        b(r rVar) {
            this.f13633a = new WeakReference(rVar);
        }

        /* access modifiers changed from: package-private */
        public void a(int i10, CharSequence charSequence) {
            if (this.f13633a.get() != null && !((r) this.f13633a.get()).C() && ((r) this.f13633a.get()).A()) {
                ((r) this.f13633a.get()).K(new c(i10, charSequence));
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (this.f13633a.get() != null && ((r) this.f13633a.get()).A()) {
                ((r) this.f13633a.get()).L(true);
            }
        }

        /* access modifiers changed from: package-private */
        public void c(CharSequence charSequence) {
            if (this.f13633a.get() != null) {
                ((r) this.f13633a.get()).M(charSequence);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(q.b bVar) {
            if (this.f13633a.get() != null && ((r) this.f13633a.get()).A()) {
                if (bVar.a() == -1) {
                    bVar = new q.b(bVar.b(), ((r) this.f13633a.get()).u());
                }
                ((r) this.f13633a.get()).N(bVar);
            }
        }
    }

    private static class c implements Executor {

        /* renamed from: e  reason: collision with root package name */
        private final Handler f13634e = new Handler(Looper.getMainLooper());

        c() {
        }

        public void execute(Runnable runnable) {
            this.f13634e.post(runnable);
        }
    }

    private static class d implements DialogInterface.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        private final WeakReference f13635e;

        d(r rVar) {
            this.f13635e = new WeakReference(rVar);
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f13635e.get() != null) {
                ((r) this.f13635e.get()).c0(true);
            }
        }
    }

    private static void h0(a0 a0Var, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a0Var.m(obj);
        } else {
            a0Var.k(obj);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f13620o;
    }

    /* access modifiers changed from: package-private */
    public boolean B() {
        q.d dVar = this.f13612g;
        return dVar == null || dVar.f();
    }

    /* access modifiers changed from: package-private */
    public boolean C() {
        return this.f13621p;
    }

    /* access modifiers changed from: package-private */
    public boolean D() {
        return this.f13622q;
    }

    /* access modifiers changed from: package-private */
    public x E() {
        if (this.f13631z == null) {
            this.f13631z = new a0();
        }
        return this.f13631z;
    }

    /* access modifiers changed from: package-private */
    public boolean F() {
        return this.f13630y;
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return this.f13623r;
    }

    /* access modifiers changed from: package-private */
    public x H() {
        if (this.f13629x == null) {
            this.f13629x = new a0();
        }
        return this.f13629x;
    }

    /* access modifiers changed from: package-private */
    public boolean I() {
        return this.f13619n;
    }

    /* access modifiers changed from: package-private */
    public boolean J() {
        return this.f13624s;
    }

    /* access modifiers changed from: package-private */
    public void K(c cVar) {
        if (this.f13626u == null) {
            this.f13626u = new a0();
        }
        h0(this.f13626u, cVar);
    }

    /* access modifiers changed from: package-private */
    public void L(boolean z10) {
        if (this.f13628w == null) {
            this.f13628w = new a0();
        }
        h0(this.f13628w, Boolean.valueOf(z10));
    }

    /* access modifiers changed from: package-private */
    public void M(CharSequence charSequence) {
        if (this.f13627v == null) {
            this.f13627v = new a0();
        }
        h0(this.f13627v, charSequence);
    }

    /* access modifiers changed from: package-private */
    public void N(q.b bVar) {
        if (this.f13625t == null) {
            this.f13625t = new a0();
        }
        h0(this.f13625t, bVar);
    }

    /* access modifiers changed from: package-private */
    public void O(boolean z10) {
        this.f13620o = z10;
    }

    /* access modifiers changed from: package-private */
    public void P(int i10) {
        this.f13618m = i10;
    }

    /* access modifiers changed from: package-private */
    public void Q(j jVar) {
        this.f13611f = new WeakReference(jVar);
    }

    /* access modifiers changed from: package-private */
    public void R(q.a aVar) {
        this.f13610e = aVar;
    }

    /* access modifiers changed from: package-private */
    public void S(Executor executor) {
        this.f13609d = executor;
    }

    /* access modifiers changed from: package-private */
    public void T(boolean z10) {
        this.f13621p = z10;
    }

    /* access modifiers changed from: package-private */
    public void U(q.c cVar) {
        this.f13613h = cVar;
    }

    /* access modifiers changed from: package-private */
    public void V(boolean z10) {
        this.f13622q = z10;
    }

    /* access modifiers changed from: package-private */
    public void W(boolean z10) {
        if (this.f13631z == null) {
            this.f13631z = new a0();
        }
        h0(this.f13631z, Boolean.valueOf(z10));
    }

    /* access modifiers changed from: package-private */
    public void X(boolean z10) {
        this.f13630y = z10;
    }

    /* access modifiers changed from: package-private */
    public void Y(CharSequence charSequence) {
        if (this.C == null) {
            this.C = new a0();
        }
        h0(this.C, charSequence);
    }

    /* access modifiers changed from: package-private */
    public void Z(int i10) {
        this.A = i10;
    }

    /* access modifiers changed from: package-private */
    public void a0(int i10) {
        if (this.B == null) {
            this.B = new a0();
        }
        h0(this.B, Integer.valueOf(i10));
    }

    /* access modifiers changed from: package-private */
    public void b0(boolean z10) {
        this.f13623r = z10;
    }

    /* access modifiers changed from: package-private */
    public void c0(boolean z10) {
        if (this.f13629x == null) {
            this.f13629x = new a0();
        }
        h0(this.f13629x, Boolean.valueOf(z10));
    }

    /* access modifiers changed from: package-private */
    public void d0(CharSequence charSequence) {
        this.f13617l = charSequence;
    }

    /* access modifiers changed from: package-private */
    public void e0(q.d dVar) {
        this.f13612g = dVar;
    }

    /* access modifiers changed from: package-private */
    public void f0(boolean z10) {
        this.f13619n = z10;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        q.d dVar = this.f13612g;
        if (dVar != null) {
            return b.c(dVar, this.f13613h);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void g0(boolean z10) {
        this.f13624s = z10;
    }

    /* access modifiers changed from: package-private */
    public a h() {
        if (this.f13614i == null) {
            this.f13614i = new a(new b(this));
        }
        return this.f13614i;
    }

    /* access modifiers changed from: package-private */
    public a0 i() {
        if (this.f13626u == null) {
            this.f13626u = new a0();
        }
        return this.f13626u;
    }

    /* access modifiers changed from: package-private */
    public x j() {
        if (this.f13627v == null) {
            this.f13627v = new a0();
        }
        return this.f13627v;
    }

    /* access modifiers changed from: package-private */
    public x k() {
        if (this.f13625t == null) {
            this.f13625t = new a0();
        }
        return this.f13625t;
    }

    /* access modifiers changed from: package-private */
    public int l() {
        return this.f13618m;
    }

    /* access modifiers changed from: package-private */
    public s m() {
        if (this.f13615j == null) {
            this.f13615j = new s();
        }
        return this.f13615j;
    }

    /* access modifiers changed from: package-private */
    public q.a n() {
        if (this.f13610e == null) {
            this.f13610e = new a();
        }
        return this.f13610e;
    }

    /* access modifiers changed from: package-private */
    public Executor o() {
        Executor executor = this.f13609d;
        return executor != null ? executor : new c();
    }

    /* access modifiers changed from: package-private */
    public q.c p() {
        return this.f13613h;
    }

    /* access modifiers changed from: package-private */
    public CharSequence q() {
        q.d dVar = this.f13612g;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public x r() {
        if (this.C == null) {
            this.C = new a0();
        }
        return this.C;
    }

    /* access modifiers changed from: package-private */
    public int s() {
        return this.A;
    }

    /* access modifiers changed from: package-private */
    public x t() {
        if (this.B == null) {
            this.B = new a0();
        }
        return this.B;
    }

    /* access modifiers changed from: package-private */
    public int u() {
        int g10 = g();
        return (!b.e(g10) || b.d(g10)) ? -1 : 2;
    }

    /* access modifiers changed from: package-private */
    public DialogInterface.OnClickListener v() {
        if (this.f13616k == null) {
            this.f13616k = new d(this);
        }
        return this.f13616k;
    }

    /* access modifiers changed from: package-private */
    public CharSequence w() {
        CharSequence charSequence = this.f13617l;
        if (charSequence != null) {
            return charSequence;
        }
        q.d dVar = this.f13612g;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence x() {
        q.d dVar = this.f13612g;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence y() {
        q.d dVar = this.f13612g;
        if (dVar != null) {
            return dVar.e();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public x z() {
        if (this.f13628w == null) {
            this.f13628w = new a0();
        }
        return this.f13628w;
    }
}
