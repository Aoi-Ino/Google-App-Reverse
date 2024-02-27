package y0;

import cm.g;
import cm.l;
import d1.i;
import d1.j;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public final class x implements j, i {

    /* renamed from: m  reason: collision with root package name */
    public static final a f18441m = new a((g) null);

    /* renamed from: n  reason: collision with root package name */
    public static final TreeMap f18442n = new TreeMap();

    /* renamed from: e  reason: collision with root package name */
    private final int f18443e;

    /* renamed from: f  reason: collision with root package name */
    private volatile String f18444f;

    /* renamed from: g  reason: collision with root package name */
    public final long[] f18445g;

    /* renamed from: h  reason: collision with root package name */
    public final double[] f18446h;

    /* renamed from: i  reason: collision with root package name */
    public final String[] f18447i;

    /* renamed from: j  reason: collision with root package name */
    public final byte[][] f18448j;

    /* renamed from: k  reason: collision with root package name */
    private final int[] f18449k;

    /* renamed from: l  reason: collision with root package name */
    private int f18450l;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final x a(String str, int i10) {
            l.f(str, "query");
            TreeMap treeMap = x.f18442n;
            synchronized (treeMap) {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    x xVar = (x) ceilingEntry.getValue();
                    xVar.h(str, i10);
                    l.e(xVar, "sqliteQuery");
                    return xVar;
                }
                pl.x xVar2 = pl.x.f30437a;
                x xVar3 = new x(i10, (g) null);
                xVar3.h(str, i10);
                return xVar3;
            }
        }

        public final void b() {
            TreeMap treeMap = x.f18442n;
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                l.e(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i10 = size - 1;
                    if (size > 0) {
                        it.next();
                        it.remove();
                        size = i10;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private x(int i10) {
        this.f18443e = i10;
        int i11 = i10 + 1;
        this.f18449k = new int[i11];
        this.f18445g = new long[i11];
        this.f18446h = new double[i11];
        this.f18447i = new String[i11];
        this.f18448j = new byte[i11][];
    }

    public static final x f(String str, int i10) {
        return f18441m.a(str, i10);
    }

    public void G(int i10) {
        this.f18449k[i10] = 1;
    }

    public void K(int i10, double d10) {
        this.f18449k[i10] = 3;
        this.f18446h[i10] = d10;
    }

    public String c() {
        String str = this.f18444f;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public void close() {
    }

    public void e(i iVar) {
        l.f(iVar, "statement");
        int g10 = g();
        if (1 <= g10) {
            int i10 = 1;
            while (true) {
                int i11 = this.f18449k[i10];
                if (i11 == 1) {
                    iVar.G(i10);
                } else if (i11 == 2) {
                    iVar.f0(i10, this.f18445g[i10]);
                } else if (i11 == 3) {
                    iVar.K(i10, this.f18446h[i10]);
                } else if (i11 == 4) {
                    String str = this.f18447i[i10];
                    if (str != null) {
                        iVar.x(i10, str);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (i11 == 5) {
                    byte[] bArr = this.f18448j[i10];
                    if (bArr != null) {
                        iVar.n0(i10, bArr);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                if (i10 != g10) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void f0(int i10, long j10) {
        this.f18449k[i10] = 2;
        this.f18445g[i10] = j10;
    }

    public int g() {
        return this.f18450l;
    }

    public final void h(String str, int i10) {
        l.f(str, "query");
        this.f18444f = str;
        this.f18450l = i10;
    }

    public final void l() {
        TreeMap treeMap = f18442n;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f18443e), this);
            f18441m.b();
            pl.x xVar = pl.x.f30437a;
        }
    }

    public void n0(int i10, byte[] bArr) {
        l.f(bArr, "value");
        this.f18449k[i10] = 5;
        this.f18448j[i10] = bArr;
    }

    public void x(int i10, String str) {
        l.f(str, "value");
        this.f18449k[i10] = 4;
        this.f18447i[i10] = str;
    }

    public /* synthetic */ x(int i10, g gVar) {
        this(i10);
    }
}
