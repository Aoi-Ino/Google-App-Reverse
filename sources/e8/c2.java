package e8;

import a8.e;
import a8.f;
import a8.j;
import e8.m0;
import g8.d;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class c2 extends e {

    /* renamed from: b0  reason: collision with root package name */
    public static final c1 f10535b0 = new c1("1.2");

    /* renamed from: c0  reason: collision with root package name */
    public static final c1 f10536c0 = new c1("1.3");

    /* renamed from: d0  reason: collision with root package name */
    public static final c1 f10537d0 = new c1("1.4");

    /* renamed from: e0  reason: collision with root package name */
    public static final c1 f10538e0 = new c1("1.5");

    /* renamed from: f0  reason: collision with root package name */
    public static final c1 f10539f0 = new c1("1.6");

    /* renamed from: g0  reason: collision with root package name */
    public static final c1 f10540g0 = new c1("1.7");

    /* renamed from: h0  reason: collision with root package name */
    public static final c1 f10541h0 = c1.f10299hb;

    /* renamed from: i0  reason: collision with root package name */
    public static final c1 f10542i0 = c1.f10442sb;

    /* renamed from: j0  reason: collision with root package name */
    public static final c1 f10543j0 = c1.f10381o2;

    /* renamed from: k0  reason: collision with root package name */
    public static final c1 f10544k0 = c1.f10429rb;

    /* renamed from: l0  reason: collision with root package name */
    public static final c1 f10545l0 = c1.f10355m2;

    /* renamed from: m0  reason: collision with root package name */
    public static final c1 f10546m0 = c1.f10411q6;

    /* renamed from: n0  reason: collision with root package name */
    public static final c1 f10547n0 = c1.f10496x0;
    protected HashMap A = new HashMap();
    protected HashMap B = new HashMap();
    protected int C = 1;
    protected HashMap D = new HashMap();
    protected int E = 1;
    protected HashSet F = new HashSet();
    protected HashSet G = new HashSet();
    protected HashMap H = new HashMap();
    protected HashMap I = new HashMap();
    protected boolean J = false;
    protected z1 K;
    protected HashSet L = new HashSet();
    protected ArrayList M = new ArrayList();
    protected h1 N;
    protected b0 O = new b0();
    protected b0 P = new b0();
    protected l0 Q;
    private float R = 2.5f;
    protected int S = 1;
    protected float T = 0.0f;
    protected l0 U = new l0();
    protected HashMap V = new HashMap();
    protected l0 W = new l0();
    private HashMap X = new HashMap();
    protected HashMap Y = new HashMap();
    private boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f10548a0;

    /* renamed from: g  reason: collision with root package name */
    protected m0 f10549g;

    /* renamed from: h  reason: collision with root package name */
    protected g0 f10550h;

    /* renamed from: i  reason: collision with root package name */
    protected g0 f10551i;

    /* renamed from: j  reason: collision with root package name */
    protected a f10552j;

    /* renamed from: k  reason: collision with root package name */
    protected l0 f10553k;

    /* renamed from: l  reason: collision with root package name */
    protected r1 f10554l = new r1(this);

    /* renamed from: m  reason: collision with root package name */
    protected ArrayList f10555m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    protected int f10556n = 1;

    /* renamed from: o  reason: collision with root package name */
    protected c1 f10557o = null;

    /* renamed from: p  reason: collision with root package name */
    protected int f10558p = 0;

    /* renamed from: q  reason: collision with root package name */
    protected List f10559q;

    /* renamed from: r  reason: collision with root package name */
    protected g8.b f10560r = new g8.b();

    /* renamed from: s  reason: collision with root package name */
    protected byte[] f10561s = null;

    /* renamed from: t  reason: collision with root package name */
    private d f10562t = new d();

    /* renamed from: u  reason: collision with root package name */
    protected boolean f10563u = false;

    /* renamed from: v  reason: collision with root package name */
    protected int f10564v = -1;

    /* renamed from: w  reason: collision with root package name */
    protected LinkedHashMap f10565w = new LinkedHashMap();

    /* renamed from: x  reason: collision with root package name */
    protected int f10566x = 1;

    /* renamed from: y  reason: collision with root package name */
    protected HashMap f10567y = new HashMap();

    /* renamed from: z  reason: collision with root package name */
    protected int f10568z = 1;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private TreeSet f10569a;

        /* renamed from: b  reason: collision with root package name */
        private int f10570b;

        /* renamed from: c  reason: collision with root package name */
        private int f10571c;

        /* renamed from: d  reason: collision with root package name */
        private c2 f10572d;

        /* renamed from: e  reason: collision with root package name */
        private f f10573e;

        /* renamed from: f  reason: collision with root package name */
        private f f10574f;

        /* renamed from: g  reason: collision with root package name */
        private int f10575g;

        /* renamed from: h  reason: collision with root package name */
        private int f10576h = 0;

        /* renamed from: e8.c2$a$a  reason: collision with other inner class name */
        static class C0140a implements Comparable {

            /* renamed from: e  reason: collision with root package name */
            private int f10577e;

            /* renamed from: f  reason: collision with root package name */
            private int f10578f;

            /* renamed from: g  reason: collision with root package name */
            private int f10579g;

            /* renamed from: h  reason: collision with root package name */
            private int f10580h;

            C0140a(int i10, int i11) {
                this.f10577e = 1;
                this.f10578f = i11;
                this.f10579g = i10;
                this.f10580h = 0;
            }

            /* renamed from: a */
            public int compareTo(C0140a aVar) {
                int i10 = this.f10579g;
                int i11 = aVar.f10579g;
                if (i10 < i11) {
                    return -1;
                }
                return i10 == i11 ? 0 : 1;
            }

            /* access modifiers changed from: package-private */
            public int b() {
                return this.f10579g;
            }

            public void c(int i10, OutputStream outputStream) {
                int i11 = this.f10577e;
                while (true) {
                    outputStream.write((byte) i11);
                    i10--;
                    if (i10 >= 0) {
                        i11 = (this.f10578f >>> (i10 * 8)) & 255;
                    } else {
                        outputStream.write((byte) ((this.f10580h >>> 8) & 255));
                        outputStream.write((byte) (this.f10580h & 255));
                        return;
                    }
                }
            }

            public void d(OutputStream outputStream) {
                StringBuffer stringBuffer = new StringBuffer("0000000000");
                stringBuffer.append(this.f10578f);
                stringBuffer.delete(0, stringBuffer.length() - 10);
                StringBuffer stringBuffer2 = new StringBuffer("00000");
                stringBuffer2.append(this.f10580h);
                stringBuffer2.delete(0, stringBuffer2.length() - 5);
                stringBuffer.append(' ');
                stringBuffer.append(stringBuffer2);
                stringBuffer.append(this.f10580h == 65535 ? " f \n" : " n \n");
                outputStream.write(e.f(stringBuffer.toString()));
            }

            public boolean equals(Object obj) {
                return (obj instanceof C0140a) && this.f10579g == ((C0140a) obj).f10579g;
            }

            public int hashCode() {
                return this.f10579g;
            }

            C0140a(int i10, int i11, int i12) {
                this.f10577e = 0;
                this.f10578f = i11;
                this.f10579g = i10;
                this.f10580h = i12;
            }

            C0140a(int i10, int i11, int i12, int i13) {
                this.f10577e = i10;
                this.f10578f = i12;
                this.f10579g = i11;
                this.f10580h = i13;
            }
        }

        a(c2 c2Var) {
            TreeSet treeSet = new TreeSet();
            this.f10569a = treeSet;
            treeSet.add(new C0140a(0, 0, 65535));
            this.f10571c = c2Var.F().c();
            this.f10570b = 1;
            this.f10572d = c2Var;
        }

        private C0140a h(i1 i1Var, int i10) {
            if (this.f10576h >= 200) {
                i();
            }
            if (this.f10573e == null) {
                this.f10573e = new f();
                this.f10574f = new f();
                this.f10575g = j();
                this.f10576h = 0;
            }
            int Y = this.f10574f.Y();
            int i11 = this.f10576h;
            this.f10576h = i11 + 1;
            this.f10572d.getClass();
            this.f10572d.getClass();
            i1Var.k(this.f10572d, this.f10574f);
            this.f10572d.getClass();
            this.f10574f.e(' ');
            this.f10573e.h(i10).e(' ').h(Y).e(' ');
            return new C0140a(2, i10, this.f10575g, i11);
        }

        /* access modifiers changed from: private */
        public void i() {
            if (this.f10576h != 0) {
                int Y = this.f10573e.Y();
                this.f10573e.l(this.f10574f);
                x1 x1Var = new x1(this.f10573e.Z());
                x1Var.v(this.f10572d.u());
                x1Var.r(c1.f10454ta, c1.f10450t6);
                x1Var.r(c1.S5, new f1(this.f10576h));
                x1Var.r(c1.f10254e3, new f1(Y));
                c(x1Var, this.f10575g);
                this.f10573e = null;
                this.f10574f = null;
                this.f10576h = 0;
            }
        }

        /* access modifiers changed from: package-private */
        public w0 b(i1 i1Var) {
            return c(i1Var, j());
        }

        /* access modifiers changed from: package-private */
        public w0 c(i1 i1Var, int i10) {
            return d(i1Var, i10, true);
        }

        /* access modifiers changed from: package-private */
        public w0 d(i1 i1Var, int i10, boolean z10) {
            if (!z10 || !i1Var.a() || !this.f10572d.Q()) {
                w0 w0Var = new w0(i10, i1Var, this.f10572d);
                C0140a aVar = new C0140a(i10, this.f10571c);
                if (!this.f10569a.add(aVar)) {
                    this.f10569a.remove(aVar);
                    this.f10569a.add(aVar);
                }
                w0Var.b(this.f10572d.F());
                this.f10571c = this.f10572d.F().c();
                return w0Var;
            }
            C0140a h10 = h(i1Var, i10);
            w0 w0Var2 = new w0(i10, i1Var, this.f10572d);
            if (!this.f10569a.add(h10)) {
                this.f10569a.remove(h10);
                this.f10569a.add(h10);
            }
            return w0Var2;
        }

        /* access modifiers changed from: package-private */
        public w0 e(i1 i1Var, x0 x0Var) {
            return c(i1Var, x0Var.m());
        }

        /* access modifiers changed from: package-private */
        public w0 f(i1 i1Var, x0 x0Var, boolean z10) {
            return d(i1Var, x0Var.m(), z10);
        }

        /* access modifiers changed from: package-private */
        public w0 g(i1 i1Var, boolean z10) {
            return d(i1Var, j(), z10);
        }

        /* access modifiers changed from: package-private */
        public int j() {
            int i10 = this.f10570b;
            this.f10570b = i10 + 1;
            this.f10569a.add(new C0140a(i10, 0, 65535));
            return i10;
        }

        /* access modifiers changed from: package-private */
        public x0 k() {
            return new x0(0, j());
        }

        /* access modifiers changed from: package-private */
        public int l() {
            return this.f10571c;
        }

        /* access modifiers changed from: package-private */
        public int m() {
            return Math.max(((C0140a) this.f10569a.last()).b() + 1, this.f10570b);
        }

        /* access modifiers changed from: package-private */
        public void n(OutputStream outputStream, x0 x0Var, x0 x0Var2, x0 x0Var3, i1 i1Var, int i10) {
            int i11;
            OutputStream outputStream2 = outputStream;
            x0 x0Var4 = x0Var2;
            x0 x0Var5 = x0Var3;
            i1 i1Var2 = i1Var;
            int i12 = i10;
            int i13 = 0;
            if (this.f10572d.Q()) {
                i();
                i11 = j();
                this.f10569a.add(new C0140a(i11, this.f10571c));
            } else {
                i11 = 0;
            }
            int b10 = ((C0140a) this.f10569a.first()).b();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f10569a.iterator();
            int i14 = 0;
            while (it.hasNext()) {
                C0140a aVar = (C0140a) it.next();
                if (b10 + i14 == aVar.b()) {
                    i14++;
                } else {
                    arrayList.add(Integer.valueOf(b10));
                    arrayList.add(Integer.valueOf(i14));
                    b10 = aVar.b();
                    i14 = 1;
                }
            }
            arrayList.add(Integer.valueOf(b10));
            arrayList.add(Integer.valueOf(i14));
            if (this.f10572d.Q()) {
                int i15 = 4;
                int i16 = -16777216;
                while (i15 > 1 && (this.f10571c & i16) == 0) {
                    i16 >>>= 8;
                    i15--;
                }
                f fVar = new f();
                Iterator it2 = this.f10569a.iterator();
                while (it2.hasNext()) {
                    ((C0140a) it2.next()).c(i15, fVar);
                }
                x1 x1Var = new x1(fVar.Z());
                x1Var.v(this.f10572d.u());
                x1Var.r(c1.W8, new f1(m()));
                x1Var.r(c1.f10530z8, x0Var);
                if (x0Var4 != null) {
                    x1Var.r(c1.I4, x0Var4);
                }
                if (x0Var5 != null) {
                    x1Var.r(c1.G2, x0Var5);
                }
                if (i1Var2 != null) {
                    x1Var.r(c1.f10500x4, i1Var2);
                }
                x1Var.r(c1.f10262eb, new b0(new int[]{1, i15, 2}));
                x1Var.r(c1.f10454ta, c1.Ab);
                b0 b0Var = new b0();
                while (i13 < arrayList.size()) {
                    b0Var.m(new f1(((Integer) arrayList.get(i13)).intValue()));
                    i13++;
                }
                x1Var.r(c1.G4, b0Var);
                if (i12 > 0) {
                    x1Var.r(c1.C7, new f1(i12));
                }
                this.f10572d.getClass();
                this.f10572d.getClass();
                new w0(i11, x1Var, this.f10572d).b(this.f10572d.F());
                this.f10572d.getClass();
                return;
            }
            outputStream2.write(e.f("xref\n"));
            Iterator it3 = this.f10569a.iterator();
            while (i13 < arrayList.size()) {
                int intValue = ((Integer) arrayList.get(i13)).intValue();
                int intValue2 = ((Integer) arrayList.get(i13 + 1)).intValue();
                outputStream2.write(e.f(String.valueOf(intValue)));
                outputStream2.write(e.f(" "));
                outputStream2.write(e.f(String.valueOf(intValue2)));
                outputStream2.write(10);
                while (true) {
                    int i17 = intValue2 - 1;
                    if (intValue2 <= 0) {
                        break;
                    }
                    ((C0140a) it3.next()).d(outputStream2);
                    intValue2 = i17;
                }
                i13 += 2;
            }
        }
    }

    static class b extends l0 {

        /* renamed from: n  reason: collision with root package name */
        int f10581n;

        b(int i10, int i11, x0 x0Var, x0 x0Var2, x0 x0Var3, i1 i1Var, int i12) {
            this.f10581n = i11;
            r(c1.W8, new f1(i10));
            r(c1.f10530z8, x0Var);
            if (x0Var2 != null) {
                r(c1.I4, x0Var2);
            }
            if (x0Var3 != null) {
                r(c1.G2, x0Var3);
            }
            if (i1Var != null) {
                r(c1.f10500x4, i1Var);
            }
            if (i12 > 0) {
                r(c1.C7, new f1(i12));
            }
        }

        public void k(c2 c2Var, OutputStream outputStream) {
            outputStream.write(e.f("trailer\n"));
            super.k((c2) null, outputStream);
            outputStream.write(e.f("\nstartxref\n"));
            outputStream.write(e.f(String.valueOf(this.f10581n)));
            outputStream.write(e.f("\n%%EOF\n"));
        }
    }

    protected c2(m0 m0Var, OutputStream outputStream) {
        super(m0Var, outputStream);
        this.f10549g = m0Var;
        this.f10550h = new g0(this);
        this.f10551i = new g0(this);
    }

    public static c2 D(f fVar, OutputStream outputStream) {
        m0 m0Var = new m0();
        fVar.h(m0Var);
        c2 c2Var = new c2(m0Var, outputStream);
        m0Var.y(c2Var);
        return c2Var;
    }

    private static void E(b0 b0Var, y0 y0Var) {
        throw null;
    }

    private void i(c1 c1Var, c1 c1Var2) {
        b0 b0Var = new b0();
        Iterator it = this.L.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            c1 c1Var3 = c1.f10287h;
            throw null;
        } else if (b0Var.t() != 0) {
            l0 l0Var = (l0) this.N.m(c1.E1);
            c1 c1Var4 = c1.P;
            b0 b0Var2 = (b0) l0Var.m(c1Var4);
            if (b0Var2 == null) {
                b0Var2 = new b0();
                l0Var.r(c1Var4, b0Var2);
            }
            l0 l0Var2 = new l0();
            l0Var2.r(c1.Q2, c1Var);
            l0Var2.r(c1.H0, new b0((i1) c1Var2));
            l0Var2.r(c1.f10489w6, b0Var);
            b0Var2.m(l0Var2);
        }
    }

    /* access modifiers changed from: package-private */
    public p0 A() {
        return null;
    }

    public l0 B() {
        if (this.f10553k == null) {
            this.f10553k = new l0();
        }
        return this.f10553k;
    }

    public l0 C() {
        return this.f10549g.G();
    }

    /* access modifiers changed from: package-private */
    public u F() {
        return this.f261c;
    }

    public int G() {
        return this.f10562t.d();
    }

    public q1 H() {
        return null;
    }

    public x0 I(int i10) {
        int i11 = i10 - 1;
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(b8.a.b("the.page.number.must.be.gt.eq.1", new Object[0]));
        } else if (i11 < this.f10555m.size()) {
            x0 x0Var = (x0) this.f10555m.get(i11);
            if (x0Var != null) {
                return x0Var;
            }
            x0 k10 = this.f10552j.k();
            this.f10555m.set(i11, k10);
            return k10;
        } else {
            int size = i11 - this.f10555m.size();
            for (int i12 = 0; i12 < size; i12++) {
                this.f10555m.add((Object) null);
            }
            x0 k11 = this.f10552j.k();
            this.f10555m.add(k11);
            return k11;
        }
    }

    /* access modifiers changed from: package-private */
    public m0 J() {
        return this.f10549g;
    }

    public x0 K() {
        return this.f10552j.k();
    }

    /* access modifiers changed from: package-private */
    public g8.b L() {
        return this.f10560r;
    }

    public float M() {
        return this.R;
    }

    public z1 N() {
        if (this.J && this.K == null) {
            this.K = new z1(this);
        }
        return this.K;
    }

    public c1 O() {
        return this.f10557o;
    }

    public float P() {
        return this.T;
    }

    public boolean Q() {
        return this.f10563u;
    }

    public boolean R() {
        return this.f10562t.f();
    }

    public boolean S() {
        return this.f10548a0;
    }

    public boolean T() {
        return this.J;
    }

    /* access modifiers changed from: package-private */
    public void U() {
        this.f10550h.B();
        this.f10551i.B();
    }

    public void V(c1 c1Var, i1 i1Var) {
        if (i1Var == null || i1Var.h()) {
            this.U.t(c1Var);
        }
        this.U.r(c1Var, i1Var);
    }

    /* access modifiers changed from: protected */
    public void W(l0 l0Var, boolean z10) {
        List list = this.f10559q;
        if (list != null && !list.isEmpty()) {
            l0 l0Var2 = new l0();
            x0 K2 = K();
            Object[] b10 = g2.b(this, K2, this.f10559q, z10);
            l0Var2.r(c1.f10254e3, (x0) b10[0]);
            l0Var2.r(c1.f10280g5, (x0) b10[1]);
            l0Var2.r(c1.f10419r1, new f1(((Integer) b10[2]).intValue()));
            o(l0Var2, K2);
            l0Var.r(c1.O6, K2);
        }
    }

    public void a() {
        super.a();
        try {
            this.f10560r.d(this.f261c);
            this.f10552j = new a(this);
            if (this.f10562t.h()) {
                l0 l0Var = new l0();
                l0Var.r(c1.P3, new b0(new float[]{2.2f, 2.2f, 2.2f}));
                l0Var.r(c1.A5, new b0(new float[]{0.4124f, 0.2126f, 0.0193f, 0.3576f, 0.7152f, 0.1192f, 0.1805f, 0.0722f, 0.9505f}));
                l0Var.r(c1.f10416qb, new b0(new float[]{0.9505f, 1.0f, 1.089f}));
                b0 b0Var = new b0((i1) c1.D0);
                b0Var.m(l0Var);
                V(c1.Q1, n(b0Var).a());
            }
        } catch (IOException e10) {
            throw new j(e10);
        }
    }

    public void close() {
        if (!this.f262d) {
            return;
        }
        if (this.f10556n - 1 == this.f10555m.size()) {
            this.f10549g.close();
            try {
                l();
                Iterator it = this.L.iterator();
                if (!it.hasNext()) {
                    l0 t10 = t(this.f10554l.b());
                    if (this.f10561s != null) {
                        x1 x1Var = new x1(this.f10561s);
                        c1 c1Var = c1.f10454ta;
                        c1 c1Var2 = c1.M5;
                        x1Var.r(c1Var, c1Var2);
                        x1Var.r(c1.f10492w9, c1.f10507xb);
                        t10.r(c1Var2, this.f10552j.b(x1Var).a());
                    }
                    if (R()) {
                        this.f10562t.c(C());
                        this.f10562t.b(B());
                    }
                    l0 l0Var = this.f10553k;
                    if (l0Var != null) {
                        t10.q(l0Var);
                    }
                    W(t10, false);
                    w0 q10 = q(t10, false);
                    w0 q11 = q(C(), false);
                    this.f10552j.i();
                    i1 b10 = p0.b(p0.a());
                    this.f10552j.n(this.f261c, q10.a(), q11.a(), (x0) null, b10, this.f10558p);
                    if (this.f10563u) {
                        this.f261c.write(e.f("startxref\n"));
                        this.f261c.write(e.f(String.valueOf(this.f10552j.l())));
                        this.f261c.write(e.f("\n%%EOF\n"));
                    } else {
                        new b(this.f10552j.m(), this.f10552j.l(), q10.a(), q11.a(), (x0) null, b10, this.f10558p).k(this, this.f261c);
                    }
                    super.close();
                    return;
                }
                android.support.v4.media.session.b.a(it.next());
                throw null;
            } catch (IOException e10) {
                throw new j(e10);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The page ");
            sb2.append(this.f10555m.size());
            sb2.append(" was requested but the document has only ");
            sb2.append(this.f10556n - 1);
            sb2.append(" pages.");
            throw new RuntimeException(sb2.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public x0 h(p1 p1Var, h0 h0Var) {
        if (this.f262d) {
            try {
                p1Var.v(n(h0Var).a());
                l0 l0Var = this.Q;
                if (l0Var != null) {
                    p1Var.r(c1.V3, l0Var);
                    this.Q = null;
                } else if (this.f10548a0) {
                    l0 l0Var2 = new l0();
                    c1 c1Var = c1.f10454ta;
                    c1 c1Var2 = c1.V3;
                    l0Var2.r(c1Var, c1Var2);
                    l0Var2.r(c1.F8, c1.f10298ha);
                    l0Var2.r(c1.B1, c1.Y1);
                    p1Var.r(c1Var2, l0Var2);
                }
                this.f10554l.a(p1Var);
                this.f10556n++;
                return null;
            } catch (IOException e10) {
                throw new j(e10);
            }
        } else {
            throw new q0(b8.a.b("the.document.is.not.open", new Object[0]));
        }
    }

    public void j(a0 a0Var) {
        this.f10549g.v(a0Var);
    }

    /* access modifiers changed from: package-private */
    public void k(TreeMap treeMap) {
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            m0.a aVar = (m0.a) entry.getValue();
            i1 i1Var = aVar.f10921c;
            if (aVar.f10920b == null) {
                aVar.f10920b = K();
            }
            if (i1Var == null) {
                i1Var = new y1("invalid_" + str);
            }
            o(i1Var, aVar.f10920b);
        }
    }

    /* access modifiers changed from: protected */
    public void l() {
        for (p e10 : this.f10565w.values()) {
            e10.e(this);
        }
        for (Object[] objArr : this.f10567y.values()) {
            a2 a2Var = (a2) objArr[1];
        }
        Iterator it = this.A.values().iterator();
        if (!it.hasNext()) {
            for (k kVar : this.B.values()) {
                o(kVar.b(this), kVar.a());
            }
            Iterator it2 = this.D.keySet().iterator();
            if (!it2.hasNext()) {
                Iterator it3 = this.F.iterator();
                if (!it3.hasNext()) {
                    Iterator it4 = this.G.iterator();
                    if (!it4.hasNext()) {
                        for (Map.Entry entry : this.H.entrySet()) {
                            o((l0) entry.getKey(), (x0) ((i1[]) entry.getValue())[1]);
                        }
                        for (Map.Entry entry2 : this.I.entrySet()) {
                            Object key = entry2.getKey();
                            i1[] i1VarArr = (i1[]) entry2.getValue();
                            if (key instanceof l0) {
                                o((l0) key, (x0) i1VarArr[1]);
                            }
                        }
                        return;
                    }
                    android.support.v4.media.session.b.a(it4.next());
                    throw null;
                }
                android.support.v4.media.session.b.a(it3.next());
                throw null;
            }
            android.support.v4.media.session.b.a(it2.next());
            throw null;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    /* access modifiers changed from: package-private */
    public p m(c cVar) {
        if (cVar.m() != 4) {
            p pVar = (p) this.f10565w.get(cVar);
            if (pVar != null) {
                return pVar;
            }
            d.a(this, 4, cVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("F");
            int i10 = this.f10566x;
            this.f10566x = i10 + 1;
            sb2.append(i10);
            p pVar2 = new p(new c1(sb2.toString()), this.f10552j.k(), cVar);
            this.f10565w.put(cVar, pVar2);
            return pVar2;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("F");
        int i11 = this.f10566x;
        this.f10566x = i11 + 1;
        sb3.append(i11);
        new c1(sb3.toString());
        android.support.v4.media.session.b.a(cVar);
        throw null;
    }

    public w0 n(i1 i1Var) {
        return this.f10552j.b(i1Var);
    }

    public w0 o(i1 i1Var, x0 x0Var) {
        return this.f10552j.e(i1Var, x0Var);
    }

    public w0 p(i1 i1Var, x0 x0Var, boolean z10) {
        return this.f10552j.f(i1Var, x0Var, z10);
    }

    public w0 q(i1 i1Var, boolean z10) {
        return this.f10552j.g(i1Var, z10);
    }

    /* access modifiers changed from: package-private */
    public void r(l0 l0Var) {
        for (p pVar : this.f10565w.values()) {
            if (l0Var.m(pVar.b()) != null) {
                pVar.d(false);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void s(boolean z10) {
        if (this.N == null) {
            this.N = new h1();
        }
        if (z10) {
            this.N.t(c1.f10489w6);
            this.N.t(c1.E1);
        }
        h1 h1Var = this.N;
        c1 c1Var = c1.f10489w6;
        if (h1Var.m(c1Var) == null) {
            b0 b0Var = new b0();
            Iterator it = this.L.iterator();
            if (!it.hasNext()) {
                this.N.r(c1Var, b0Var);
            } else {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        if (this.N.m(c1.E1) == null) {
            ArrayList arrayList = new ArrayList(this.M);
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                b0 b0Var2 = new b0();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    android.support.v4.media.session.b.a(it3.next());
                    E(b0Var2, (y0) null);
                }
                l0 l0Var = new l0();
                this.N.r(c1.E1, l0Var);
                l0Var.r(c1.K6, b0Var2);
                b0 b0Var3 = new b0();
                Iterator it4 = this.L.iterator();
                if (!it4.hasNext()) {
                    if (b0Var3.t() > 0) {
                        l0Var.r(c1.A6, b0Var3);
                    }
                    if (this.O.t() > 0) {
                        l0Var.r(c1.Y7, this.O);
                    }
                    if (this.P.t() > 0) {
                        l0Var.r(c1.f10488w5, this.P);
                    }
                    c1 c1Var2 = c1.Wa;
                    i(c1Var2, c1.Gb);
                    i(c1Var2, c1Var2);
                    c1 c1Var3 = c1.E7;
                    i(c1Var3, c1Var3);
                    c1 c1Var4 = c1.O2;
                    i(c1Var4, c1Var4);
                    l0Var.r(c1.f10449t5, c1.f10238cb);
                    return;
                }
                android.support.v4.media.session.b.a(it4.next());
                throw null;
            }
            android.support.v4.media.session.b.a(it2.next());
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public l0 t(x0 x0Var) {
        m0.c E2 = this.f10549g.E(x0Var);
        if (this.J) {
            try {
                N().v();
                E2.r(c1.f10427r9, this.K.w());
                l0 l0Var = new l0();
                c1 c1Var = c1.D5;
                c0 c0Var = c0.f10200h;
                l0Var.r(c1Var, c0Var);
                if (this.Z) {
                    l0Var.r(c1.La, c0Var);
                }
                E2.r(c1.E5, l0Var);
            } catch (Exception e10) {
                throw new j(e10);
            }
        }
        if (!this.L.isEmpty()) {
            s(false);
            E2.r(c1.f10515y6, this.N);
        }
        return E2;
    }

    public int u() {
        return this.f10564v;
    }

    /* access modifiers changed from: package-private */
    public x0 v() {
        return I(this.f10556n);
    }

    public int w() {
        return this.f10556n;
    }

    public l0 x() {
        return this.U;
    }

    public g0 y() {
        if (this.f262d) {
            return this.f10550h;
        }
        throw new RuntimeException(b8.a.b("the.document.is.not.open", new Object[0]));
    }

    public g0 z() {
        if (this.f262d) {
            return this.f10551i;
        }
        throw new RuntimeException(b8.a.b("the.document.is.not.open", new Object[0]));
    }
}
