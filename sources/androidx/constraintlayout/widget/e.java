package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

public class e {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f1800f = {0, 4, 8};

    /* renamed from: g  reason: collision with root package name */
    private static SparseIntArray f1801g = new SparseIntArray();

    /* renamed from: h  reason: collision with root package name */
    private static SparseIntArray f1802h = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    public String f1803a = "";

    /* renamed from: b  reason: collision with root package name */
    public int f1804b = 0;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f1805c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private boolean f1806d = true;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f1807e = new HashMap();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f1808a;

        /* renamed from: b  reason: collision with root package name */
        String f1809b;

        /* renamed from: c  reason: collision with root package name */
        public final d f1810c = new d();

        /* renamed from: d  reason: collision with root package name */
        public final c f1811d = new c();

        /* renamed from: e  reason: collision with root package name */
        public final b f1812e = new b();

        /* renamed from: f  reason: collision with root package name */
        public final C0022e f1813f = new C0022e();

        /* renamed from: g  reason: collision with root package name */
        public HashMap f1814g = new HashMap();

        /* renamed from: h  reason: collision with root package name */
        C0021a f1815h;

        /* renamed from: androidx.constraintlayout.widget.e$a$a  reason: collision with other inner class name */
        static class C0021a {

            /* renamed from: a  reason: collision with root package name */
            int[] f1816a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            int[] f1817b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            int f1818c = 0;

            /* renamed from: d  reason: collision with root package name */
            int[] f1819d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            float[] f1820e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            int f1821f = 0;

            /* renamed from: g  reason: collision with root package name */
            int[] f1822g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            String[] f1823h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            int f1824i = 0;

            /* renamed from: j  reason: collision with root package name */
            int[] f1825j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            boolean[] f1826k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            int f1827l = 0;

            C0021a() {
            }

            /* access modifiers changed from: package-private */
            public void a(int i10, float f10) {
                int i11 = this.f1821f;
                int[] iArr = this.f1819d;
                if (i11 >= iArr.length) {
                    this.f1819d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1820e;
                    this.f1820e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1819d;
                int i12 = this.f1821f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f1820e;
                this.f1821f = i12 + 1;
                fArr2[i12] = f10;
            }

            /* access modifiers changed from: package-private */
            public void b(int i10, int i11) {
                int i12 = this.f1818c;
                int[] iArr = this.f1816a;
                if (i12 >= iArr.length) {
                    this.f1816a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1817b;
                    this.f1817b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1816a;
                int i13 = this.f1818c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f1817b;
                this.f1818c = i13 + 1;
                iArr4[i13] = i11;
            }

            /* access modifiers changed from: package-private */
            public void c(int i10, String str) {
                int i11 = this.f1824i;
                int[] iArr = this.f1822g;
                if (i11 >= iArr.length) {
                    this.f1822g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1823h;
                    this.f1823h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1822g;
                int i12 = this.f1824i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f1823h;
                this.f1824i = i12 + 1;
                strArr2[i12] = str;
            }

            /* access modifiers changed from: package-private */
            public void d(int i10, boolean z10) {
                int i11 = this.f1827l;
                int[] iArr = this.f1825j;
                if (i11 >= iArr.length) {
                    this.f1825j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1826k;
                    this.f1826k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1825j;
                int i12 = this.f1827l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f1826k;
                this.f1827l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        /* access modifiers changed from: private */
        public void d(int i10, ConstraintLayout.b bVar) {
            this.f1808a = i10;
            b bVar2 = this.f1812e;
            bVar2.f1847j = bVar.f1705e;
            bVar2.f1849k = bVar.f1707f;
            bVar2.f1851l = bVar.f1709g;
            bVar2.f1853m = bVar.f1711h;
            bVar2.f1855n = bVar.f1713i;
            bVar2.f1857o = bVar.f1715j;
            bVar2.f1859p = bVar.f1717k;
            bVar2.f1861q = bVar.f1719l;
            bVar2.f1863r = bVar.f1721m;
            bVar2.f1864s = bVar.f1723n;
            bVar2.f1865t = bVar.f1725o;
            bVar2.f1866u = bVar.f1733s;
            bVar2.f1867v = bVar.f1735t;
            bVar2.f1868w = bVar.f1737u;
            bVar2.f1869x = bVar.f1739v;
            bVar2.f1870y = bVar.G;
            bVar2.f1871z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.f1727p;
            bVar2.C = bVar.f1729q;
            bVar2.D = bVar.f1731r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.f1843h = bVar.f1701c;
            bVar2.f1839f = bVar.f1697a;
            bVar2.f1841g = bVar.f1699b;
            bVar2.f1835d = bVar.width;
            bVar2.f1837e = bVar.height;
            bVar2.H = bVar.leftMargin;
            bVar2.I = bVar.rightMargin;
            bVar2.J = bVar.topMargin;
            bVar2.K = bVar.bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.f1856n0 = bVar.f1698a0;
            bVar2.f1858o0 = bVar.f1700b0;
            bVar2.Z = bVar.P;
            bVar2.f1830a0 = bVar.Q;
            bVar2.f1832b0 = bVar.T;
            bVar2.f1834c0 = bVar.U;
            bVar2.f1836d0 = bVar.R;
            bVar2.f1838e0 = bVar.S;
            bVar2.f1840f0 = bVar.V;
            bVar2.f1842g0 = bVar.W;
            bVar2.f1854m0 = bVar.f1702c0;
            bVar2.P = bVar.f1743x;
            bVar2.R = bVar.f1745z;
            bVar2.O = bVar.f1741w;
            bVar2.Q = bVar.f1744y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.f1862q0 = bVar.f1704d0;
            bVar2.L = bVar.getMarginEnd();
            this.f1812e.M = bVar.getMarginStart();
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f1812e;
            bVar.f1705e = bVar2.f1847j;
            bVar.f1707f = bVar2.f1849k;
            bVar.f1709g = bVar2.f1851l;
            bVar.f1711h = bVar2.f1853m;
            bVar.f1713i = bVar2.f1855n;
            bVar.f1715j = bVar2.f1857o;
            bVar.f1717k = bVar2.f1859p;
            bVar.f1719l = bVar2.f1861q;
            bVar.f1721m = bVar2.f1863r;
            bVar.f1723n = bVar2.f1864s;
            bVar.f1725o = bVar2.f1865t;
            bVar.f1733s = bVar2.f1866u;
            bVar.f1735t = bVar2.f1867v;
            bVar.f1737u = bVar2.f1868w;
            bVar.f1739v = bVar2.f1869x;
            bVar.leftMargin = bVar2.H;
            bVar.rightMargin = bVar2.I;
            bVar.topMargin = bVar2.J;
            bVar.bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.f1743x = bVar2.P;
            bVar.f1745z = bVar2.R;
            bVar.G = bVar2.f1870y;
            bVar.H = bVar2.f1871z;
            bVar.f1727p = bVar2.B;
            bVar.f1729q = bVar2.C;
            bVar.f1731r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.f1698a0 = bVar2.f1856n0;
            bVar.f1700b0 = bVar2.f1858o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f1830a0;
            bVar.T = bVar2.f1832b0;
            bVar.U = bVar2.f1834c0;
            bVar.R = bVar2.f1836d0;
            bVar.S = bVar2.f1838e0;
            bVar.V = bVar2.f1840f0;
            bVar.W = bVar2.f1842g0;
            bVar.Z = bVar2.G;
            bVar.f1701c = bVar2.f1843h;
            bVar.f1697a = bVar2.f1839f;
            bVar.f1699b = bVar2.f1841g;
            bVar.width = bVar2.f1835d;
            bVar.height = bVar2.f1837e;
            String str = bVar2.f1854m0;
            if (str != null) {
                bVar.f1702c0 = str;
            }
            bVar.f1704d0 = bVar2.f1862q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.f1812e.L);
            bVar.a();
        }

        /* renamed from: c */
        public a clone() {
            a aVar = new a();
            aVar.f1812e.a(this.f1812e);
            aVar.f1811d.a(this.f1811d);
            aVar.f1810c.a(this.f1810c);
            aVar.f1813f.a(this.f1813f);
            aVar.f1808a = this.f1808a;
            aVar.f1815h = this.f1815h;
            return aVar;
        }
    }

    public static class b {

        /* renamed from: r0  reason: collision with root package name */
        private static SparseIntArray f1828r0;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1829a = false;

        /* renamed from: a0  reason: collision with root package name */
        public int f1830a0 = 0;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1831b = false;

        /* renamed from: b0  reason: collision with root package name */
        public int f1832b0 = 0;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1833c = false;

        /* renamed from: c0  reason: collision with root package name */
        public int f1834c0 = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1835d;

        /* renamed from: d0  reason: collision with root package name */
        public int f1836d0 = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f1837e;

        /* renamed from: e0  reason: collision with root package name */
        public int f1838e0 = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f1839f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public float f1840f0 = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public int f1841g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public float f1842g0 = 1.0f;

        /* renamed from: h  reason: collision with root package name */
        public float f1843h = -1.0f;

        /* renamed from: h0  reason: collision with root package name */
        public int f1844h0 = -1;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1845i = true;

        /* renamed from: i0  reason: collision with root package name */
        public int f1846i0 = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f1847j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int f1848j0 = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f1849k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public int[] f1850k0;

        /* renamed from: l  reason: collision with root package name */
        public int f1851l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public String f1852l0;

        /* renamed from: m  reason: collision with root package name */
        public int f1853m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public String f1854m0;

        /* renamed from: n  reason: collision with root package name */
        public int f1855n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f1856n0 = false;

        /* renamed from: o  reason: collision with root package name */
        public int f1857o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f1858o0 = false;

        /* renamed from: p  reason: collision with root package name */
        public int f1859p = -1;

        /* renamed from: p0  reason: collision with root package name */
        public boolean f1860p0 = true;

        /* renamed from: q  reason: collision with root package name */
        public int f1861q = -1;

        /* renamed from: q0  reason: collision with root package name */
        public int f1862q0 = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f1863r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f1864s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f1865t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f1866u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f1867v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f1868w = -1;

        /* renamed from: x  reason: collision with root package name */
        public int f1869x = -1;

        /* renamed from: y  reason: collision with root package name */
        public float f1870y = 0.5f;

        /* renamed from: z  reason: collision with root package name */
        public float f1871z = 0.5f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1828r0 = sparseIntArray;
            sparseIntArray.append(i.X5, 24);
            f1828r0.append(i.Y5, 25);
            f1828r0.append(i.f1915a6, 28);
            f1828r0.append(i.f1924b6, 29);
            f1828r0.append(i.f1969g6, 35);
            f1828r0.append(i.f1960f6, 34);
            f1828r0.append(i.H5, 4);
            f1828r0.append(i.G5, 3);
            f1828r0.append(i.E5, 1);
            f1828r0.append(i.f2023m6, 6);
            f1828r0.append(i.f2032n6, 7);
            f1828r0.append(i.O5, 17);
            f1828r0.append(i.P5, 18);
            f1828r0.append(i.Q5, 19);
            f1828r0.append(i.A5, 90);
            f1828r0.append(i.f2022m5, 26);
            f1828r0.append(i.f1933c6, 31);
            f1828r0.append(i.f1942d6, 32);
            f1828r0.append(i.N5, 10);
            f1828r0.append(i.M5, 9);
            f1828r0.append(i.f2059q6, 13);
            f1828r0.append(i.f2086t6, 16);
            f1828r0.append(i.f2068r6, 14);
            f1828r0.append(i.f2041o6, 11);
            f1828r0.append(i.f2077s6, 15);
            f1828r0.append(i.f2050p6, 12);
            f1828r0.append(i.f1996j6, 38);
            f1828r0.append(i.V5, 37);
            f1828r0.append(i.U5, 39);
            f1828r0.append(i.f1987i6, 40);
            f1828r0.append(i.T5, 20);
            f1828r0.append(i.f1978h6, 36);
            f1828r0.append(i.L5, 5);
            f1828r0.append(i.W5, 91);
            f1828r0.append(i.f1951e6, 91);
            f1828r0.append(i.Z5, 91);
            f1828r0.append(i.F5, 91);
            f1828r0.append(i.D5, 91);
            f1828r0.append(i.f2049p5, 23);
            f1828r0.append(i.f2067r5, 27);
            f1828r0.append(i.f2085t5, 30);
            f1828r0.append(i.f2094u5, 8);
            f1828r0.append(i.f2058q5, 33);
            f1828r0.append(i.f2076s5, 2);
            f1828r0.append(i.f2031n5, 22);
            f1828r0.append(i.f2040o5, 21);
            f1828r0.append(i.f2005k6, 41);
            f1828r0.append(i.R5, 42);
            f1828r0.append(i.C5, 41);
            f1828r0.append(i.B5, 42);
            f1828r0.append(i.f2095u6, 76);
            f1828r0.append(i.I5, 61);
            f1828r0.append(i.K5, 62);
            f1828r0.append(i.J5, 63);
            f1828r0.append(i.f2014l6, 69);
            f1828r0.append(i.S5, 70);
            f1828r0.append(i.f2130y5, 71);
            f1828r0.append(i.f2112w5, 72);
            f1828r0.append(i.f2121x5, 73);
            f1828r0.append(i.f2139z5, 74);
            f1828r0.append(i.f2103v5, 75);
        }

        public void a(b bVar) {
            this.f1829a = bVar.f1829a;
            this.f1835d = bVar.f1835d;
            this.f1831b = bVar.f1831b;
            this.f1837e = bVar.f1837e;
            this.f1839f = bVar.f1839f;
            this.f1841g = bVar.f1841g;
            this.f1843h = bVar.f1843h;
            this.f1845i = bVar.f1845i;
            this.f1847j = bVar.f1847j;
            this.f1849k = bVar.f1849k;
            this.f1851l = bVar.f1851l;
            this.f1853m = bVar.f1853m;
            this.f1855n = bVar.f1855n;
            this.f1857o = bVar.f1857o;
            this.f1859p = bVar.f1859p;
            this.f1861q = bVar.f1861q;
            this.f1863r = bVar.f1863r;
            this.f1864s = bVar.f1864s;
            this.f1865t = bVar.f1865t;
            this.f1866u = bVar.f1866u;
            this.f1867v = bVar.f1867v;
            this.f1868w = bVar.f1868w;
            this.f1869x = bVar.f1869x;
            this.f1870y = bVar.f1870y;
            this.f1871z = bVar.f1871z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f1830a0 = bVar.f1830a0;
            this.f1832b0 = bVar.f1832b0;
            this.f1834c0 = bVar.f1834c0;
            this.f1836d0 = bVar.f1836d0;
            this.f1838e0 = bVar.f1838e0;
            this.f1840f0 = bVar.f1840f0;
            this.f1842g0 = bVar.f1842g0;
            this.f1844h0 = bVar.f1844h0;
            this.f1846i0 = bVar.f1846i0;
            this.f1848j0 = bVar.f1848j0;
            this.f1854m0 = bVar.f1854m0;
            int[] iArr = bVar.f1850k0;
            if (iArr == null || bVar.f1852l0 != null) {
                this.f1850k0 = null;
            } else {
                this.f1850k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f1852l0 = bVar.f1852l0;
            this.f1856n0 = bVar.f1856n0;
            this.f1858o0 = bVar.f1858o0;
            this.f1860p0 = bVar.f1860p0;
            this.f1862q0 = bVar.f1862q0;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            StringBuilder sb2;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f2013l5);
            this.f1831b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f1828r0.get(index);
                switch (i11) {
                    case 1:
                        this.f1863r = e.m(obtainStyledAttributes, index, this.f1863r);
                        break;
                    case 2:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f1861q = e.m(obtainStyledAttributes, index, this.f1861q);
                        break;
                    case 4:
                        this.f1859p = e.m(obtainStyledAttributes, index, this.f1859p);
                        break;
                    case 5:
                        this.A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = obtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.f1869x = e.m(obtainStyledAttributes, index, this.f1869x);
                        break;
                    case 10:
                        this.f1868w = e.m(obtainStyledAttributes, index, this.f1868w);
                        break;
                    case 11:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f1839f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1839f);
                        break;
                    case 18:
                        this.f1841g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1841g);
                        break;
                    case 19:
                        this.f1843h = obtainStyledAttributes.getFloat(index, this.f1843h);
                        break;
                    case 20:
                        this.f1870y = obtainStyledAttributes.getFloat(index, this.f1870y);
                        break;
                    case 21:
                        this.f1837e = obtainStyledAttributes.getLayoutDimension(index, this.f1837e);
                        break;
                    case 22:
                        this.f1835d = obtainStyledAttributes.getLayoutDimension(index, this.f1835d);
                        break;
                    case 23:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f1847j = e.m(obtainStyledAttributes, index, this.f1847j);
                        break;
                    case 25:
                        this.f1849k = e.m(obtainStyledAttributes, index, this.f1849k);
                        break;
                    case 26:
                        this.G = obtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f1851l = e.m(obtainStyledAttributes, index, this.f1851l);
                        break;
                    case 29:
                        this.f1853m = e.m(obtainStyledAttributes, index, this.f1853m);
                        break;
                    case 30:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.f1866u = e.m(obtainStyledAttributes, index, this.f1866u);
                        break;
                    case 32:
                        this.f1867v = e.m(obtainStyledAttributes, index, this.f1867v);
                        break;
                    case 33:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f1857o = e.m(obtainStyledAttributes, index, this.f1857o);
                        break;
                    case 35:
                        this.f1855n = e.m(obtainStyledAttributes, index, this.f1855n);
                        break;
                    case 36:
                        this.f1871z = obtainStyledAttributes.getFloat(index, this.f1871z);
                        break;
                    case 37:
                        this.W = obtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        e.n(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        e.n(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.B = e.m(obtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f1840f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.f1842g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.f1844h0 = obtainStyledAttributes.getInt(index, this.f1844h0);
                                        continue;
                                    case 73:
                                        this.f1846i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1846i0);
                                        continue;
                                    case 74:
                                        this.f1852l0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.f1860p0 = obtainStyledAttributes.getBoolean(index, this.f1860p0);
                                        continue;
                                    case 76:
                                        this.f1862q0 = obtainStyledAttributes.getInt(index, this.f1862q0);
                                        continue;
                                    case 77:
                                        this.f1864s = e.m(obtainStyledAttributes, index, this.f1864s);
                                        continue;
                                    case 78:
                                        this.f1865t = e.m(obtainStyledAttributes, index, this.f1865t);
                                        continue;
                                    case 79:
                                        this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        continue;
                                    case 80:
                                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        continue;
                                    case 81:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 82:
                                        this.f1830a0 = obtainStyledAttributes.getInt(index, this.f1830a0);
                                        continue;
                                    case 83:
                                        this.f1834c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1834c0);
                                        continue;
                                    case 84:
                                        this.f1832b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1832b0);
                                        continue;
                                    case 85:
                                        this.f1838e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1838e0);
                                        continue;
                                    case 86:
                                        this.f1836d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1836d0);
                                        continue;
                                    case 87:
                                        this.f1856n0 = obtainStyledAttributes.getBoolean(index, this.f1856n0);
                                        continue;
                                    case 88:
                                        this.f1858o0 = obtainStyledAttributes.getBoolean(index, this.f1858o0);
                                        continue;
                                    case 89:
                                        this.f1854m0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.f1845i = obtainStyledAttributes.getBoolean(index, this.f1845i);
                                        continue;
                                    case 91:
                                        sb2 = new StringBuilder();
                                        str = "unused attribute 0x";
                                        break;
                                    default:
                                        sb2 = new StringBuilder();
                                        str = "Unknown attribute 0x";
                                        break;
                                }
                                sb2.append(str);
                                sb2.append(Integer.toHexString(index));
                                sb2.append("   ");
                                sb2.append(f1828r0.get(index));
                                Log.w("ConstraintSet", sb2.toString());
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* renamed from: o  reason: collision with root package name */
        private static SparseIntArray f1872o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1873a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1874b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f1875c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f1876d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f1877e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1878f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f1879g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f1880h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f1881i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public float f1882j = Float.NaN;

        /* renamed from: k  reason: collision with root package name */
        public int f1883k = -1;

        /* renamed from: l  reason: collision with root package name */
        public String f1884l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f1885m = -3;

        /* renamed from: n  reason: collision with root package name */
        public int f1886n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1872o = sparseIntArray;
            sparseIntArray.append(i.G6, 1);
            f1872o.append(i.I6, 2);
            f1872o.append(i.M6, 3);
            f1872o.append(i.F6, 4);
            f1872o.append(i.E6, 5);
            f1872o.append(i.D6, 6);
            f1872o.append(i.H6, 7);
            f1872o.append(i.L6, 8);
            f1872o.append(i.K6, 9);
            f1872o.append(i.J6, 10);
        }

        public void a(c cVar) {
            this.f1873a = cVar.f1873a;
            this.f1874b = cVar.f1874b;
            this.f1876d = cVar.f1876d;
            this.f1877e = cVar.f1877e;
            this.f1878f = cVar.f1878f;
            this.f1881i = cVar.f1881i;
            this.f1879g = cVar.f1879g;
            this.f1880h = cVar.f1880h;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.C6);
            this.f1873a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f1872o.get(index)) {
                    case 1:
                        this.f1881i = obtainStyledAttributes.getFloat(index, this.f1881i);
                        break;
                    case 2:
                        this.f1877e = obtainStyledAttributes.getInt(index, this.f1877e);
                        break;
                    case 3:
                        this.f1876d = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : q.a.f14912c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f1878f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1874b = e.m(obtainStyledAttributes, index, this.f1874b);
                        break;
                    case 6:
                        this.f1875c = obtainStyledAttributes.getInteger(index, this.f1875c);
                        break;
                    case 7:
                        this.f1879g = obtainStyledAttributes.getFloat(index, this.f1879g);
                        break;
                    case 8:
                        this.f1883k = obtainStyledAttributes.getInteger(index, this.f1883k);
                        break;
                    case 9:
                        this.f1882j = obtainStyledAttributes.getFloat(index, this.f1882j);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 != 1) {
                            if (i11 != 3) {
                                this.f1885m = obtainStyledAttributes.getInteger(index, this.f1886n);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f1884l = string;
                                if (string.indexOf("/") <= 0) {
                                    this.f1885m = -1;
                                    break;
                                } else {
                                    this.f1886n = obtainStyledAttributes.getResourceId(index, -1);
                                }
                            }
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f1886n = resourceId;
                            if (resourceId == -1) {
                                break;
                            }
                        }
                        this.f1885m = -2;
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1887a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1888b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1889c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f1890d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1891e = Float.NaN;

        public void a(d dVar) {
            this.f1887a = dVar.f1887a;
            this.f1888b = dVar.f1888b;
            this.f1890d = dVar.f1890d;
            this.f1891e = dVar.f1891e;
            this.f1889c = dVar.f1889c;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.X6);
            this.f1887a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.Z6) {
                    this.f1890d = obtainStyledAttributes.getFloat(index, this.f1890d);
                } else if (index == i.Y6) {
                    this.f1888b = obtainStyledAttributes.getInt(index, this.f1888b);
                    this.f1888b = e.f1800f[this.f1888b];
                } else if (index == i.f1925b7) {
                    this.f1889c = obtainStyledAttributes.getInt(index, this.f1889c);
                } else if (index == i.f1916a7) {
                    this.f1891e = obtainStyledAttributes.getFloat(index, this.f1891e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$e  reason: collision with other inner class name */
    public static class C0022e {

        /* renamed from: o  reason: collision with root package name */
        private static SparseIntArray f1892o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1893a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f1894b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f1895c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f1896d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1897e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f1898f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f1899g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f1900h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f1901i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f1902j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f1903k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f1904l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1905m = false;

        /* renamed from: n  reason: collision with root package name */
        public float f1906n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1892o = sparseIntArray;
            sparseIntArray.append(i.f2114w7, 1);
            f1892o.append(i.f2123x7, 2);
            f1892o.append(i.f2132y7, 3);
            f1892o.append(i.f2096u7, 4);
            f1892o.append(i.f2105v7, 5);
            f1892o.append(i.f2060q7, 6);
            f1892o.append(i.f2069r7, 7);
            f1892o.append(i.f2078s7, 8);
            f1892o.append(i.f2087t7, 9);
            f1892o.append(i.f2141z7, 10);
            f1892o.append(i.A7, 11);
            f1892o.append(i.B7, 12);
        }

        public void a(C0022e eVar) {
            this.f1893a = eVar.f1893a;
            this.f1894b = eVar.f1894b;
            this.f1895c = eVar.f1895c;
            this.f1896d = eVar.f1896d;
            this.f1897e = eVar.f1897e;
            this.f1898f = eVar.f1898f;
            this.f1899g = eVar.f1899g;
            this.f1900h = eVar.f1900h;
            this.f1901i = eVar.f1901i;
            this.f1902j = eVar.f1902j;
            this.f1903k = eVar.f1903k;
            this.f1904l = eVar.f1904l;
            this.f1905m = eVar.f1905m;
            this.f1906n = eVar.f1906n;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f2051p7);
            this.f1893a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f1892o.get(index)) {
                    case 1:
                        this.f1894b = obtainStyledAttributes.getFloat(index, this.f1894b);
                        break;
                    case 2:
                        this.f1895c = obtainStyledAttributes.getFloat(index, this.f1895c);
                        break;
                    case 3:
                        this.f1896d = obtainStyledAttributes.getFloat(index, this.f1896d);
                        break;
                    case 4:
                        this.f1897e = obtainStyledAttributes.getFloat(index, this.f1897e);
                        break;
                    case 5:
                        this.f1898f = obtainStyledAttributes.getFloat(index, this.f1898f);
                        break;
                    case 6:
                        this.f1899g = obtainStyledAttributes.getDimension(index, this.f1899g);
                        break;
                    case 7:
                        this.f1900h = obtainStyledAttributes.getDimension(index, this.f1900h);
                        break;
                    case 8:
                        this.f1902j = obtainStyledAttributes.getDimension(index, this.f1902j);
                        break;
                    case 9:
                        this.f1903k = obtainStyledAttributes.getDimension(index, this.f1903k);
                        break;
                    case 10:
                        this.f1904l = obtainStyledAttributes.getDimension(index, this.f1904l);
                        break;
                    case 11:
                        this.f1905m = true;
                        this.f1906n = obtainStyledAttributes.getDimension(index, this.f1906n);
                        break;
                    case 12:
                        this.f1901i = e.m(obtainStyledAttributes, index, this.f1901i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f1801g.append(i.A0, 25);
        f1801g.append(i.B0, 26);
        f1801g.append(i.D0, 29);
        f1801g.append(i.E0, 30);
        f1801g.append(i.K0, 36);
        f1801g.append(i.J0, 35);
        f1801g.append(i.f1972h0, 4);
        f1801g.append(i.f1963g0, 3);
        f1801g.append(i.f1927c0, 1);
        f1801g.append(i.f1945e0, 91);
        f1801g.append(i.f1936d0, 92);
        f1801g.append(i.T0, 6);
        f1801g.append(i.U0, 7);
        f1801g.append(i.f2035o0, 17);
        f1801g.append(i.f2044p0, 18);
        f1801g.append(i.f2053q0, 19);
        f1801g.append(i.Y, 99);
        f1801g.append(i.f2088u, 27);
        f1801g.append(i.F0, 32);
        f1801g.append(i.G0, 33);
        f1801g.append(i.f2026n0, 10);
        f1801g.append(i.f2017m0, 9);
        f1801g.append(i.X0, 13);
        f1801g.append(i.f1910a1, 16);
        f1801g.append(i.Y0, 14);
        f1801g.append(i.V0, 11);
        f1801g.append(i.Z0, 15);
        f1801g.append(i.W0, 12);
        f1801g.append(i.N0, 40);
        f1801g.append(i.f2125y0, 39);
        f1801g.append(i.f2116x0, 41);
        f1801g.append(i.M0, 42);
        f1801g.append(i.f2107w0, 20);
        f1801g.append(i.L0, 37);
        f1801g.append(i.f2008l0, 5);
        f1801g.append(i.f2134z0, 87);
        f1801g.append(i.I0, 87);
        f1801g.append(i.C0, 87);
        f1801g.append(i.f1954f0, 87);
        f1801g.append(i.f1918b0, 87);
        f1801g.append(i.f2133z, 24);
        f1801g.append(i.B, 28);
        f1801g.append(i.N, 31);
        f1801g.append(i.O, 8);
        f1801g.append(i.A, 34);
        f1801g.append(i.C, 2);
        f1801g.append(i.f2115x, 23);
        f1801g.append(i.f2124y, 21);
        f1801g.append(i.O0, 95);
        f1801g.append(i.f2062r0, 96);
        f1801g.append(i.f2106w, 22);
        f1801g.append(i.D, 43);
        f1801g.append(i.Q, 44);
        f1801g.append(i.L, 45);
        f1801g.append(i.M, 46);
        f1801g.append(i.K, 60);
        f1801g.append(i.I, 47);
        f1801g.append(i.J, 48);
        f1801g.append(i.E, 49);
        f1801g.append(i.F, 50);
        f1801g.append(i.G, 51);
        f1801g.append(i.H, 52);
        f1801g.append(i.P, 53);
        f1801g.append(i.P0, 54);
        f1801g.append(i.f2071s0, 55);
        f1801g.append(i.Q0, 56);
        f1801g.append(i.f2080t0, 57);
        f1801g.append(i.R0, 58);
        f1801g.append(i.f2089u0, 59);
        f1801g.append(i.f1981i0, 61);
        f1801g.append(i.f1999k0, 62);
        f1801g.append(i.f1990j0, 63);
        f1801g.append(i.R, 64);
        f1801g.append(i.f2000k1, 65);
        f1801g.append(i.X, 66);
        f1801g.append(i.f2009l1, 67);
        f1801g.append(i.f1937d1, 79);
        f1801g.append(i.f2097v, 38);
        f1801g.append(i.f1928c1, 68);
        f1801g.append(i.S0, 69);
        f1801g.append(i.f2098v0, 70);
        f1801g.append(i.f1919b1, 97);
        f1801g.append(i.V, 71);
        f1801g.append(i.T, 72);
        f1801g.append(i.U, 73);
        f1801g.append(i.W, 74);
        f1801g.append(i.S, 75);
        f1801g.append(i.f1946e1, 76);
        f1801g.append(i.H0, 77);
        f1801g.append(i.f2018m1, 78);
        f1801g.append(i.f1909a0, 80);
        f1801g.append(i.Z, 81);
        f1801g.append(i.f1955f1, 82);
        f1801g.append(i.f1991j1, 83);
        f1801g.append(i.f1982i1, 84);
        f1801g.append(i.f1973h1, 85);
        f1801g.append(i.f1964g1, 86);
        SparseIntArray sparseIntArray = f1802h;
        int i10 = i.f2057q4;
        sparseIntArray.append(i10, 6);
        f1802h.append(i10, 7);
        f1802h.append(i.f2011l3, 27);
        f1802h.append(i.f2084t4, 13);
        f1802h.append(i.f2111w4, 16);
        f1802h.append(i.f2093u4, 14);
        f1802h.append(i.f2066r4, 11);
        f1802h.append(i.f2102v4, 15);
        f1802h.append(i.f2075s4, 12);
        f1802h.append(i.f2003k4, 40);
        f1802h.append(i.f1940d4, 39);
        f1802h.append(i.f1931c4, 41);
        f1802h.append(i.f1994j4, 42);
        f1802h.append(i.f1922b4, 20);
        f1802h.append(i.f1985i4, 37);
        f1802h.append(i.V3, 5);
        f1802h.append(i.f1949e4, 87);
        f1802h.append(i.f1976h4, 87);
        f1802h.append(i.f1958f4, 87);
        f1802h.append(i.S3, 87);
        f1802h.append(i.R3, 87);
        f1802h.append(i.f2056q3, 24);
        f1802h.append(i.f2074s3, 28);
        f1802h.append(i.E3, 31);
        f1802h.append(i.F3, 8);
        f1802h.append(i.f2065r3, 34);
        f1802h.append(i.f2083t3, 2);
        f1802h.append(i.f2038o3, 23);
        f1802h.append(i.f2047p3, 21);
        f1802h.append(i.f2012l4, 95);
        f1802h.append(i.W3, 96);
        f1802h.append(i.f2029n3, 22);
        f1802h.append(i.f2092u3, 43);
        f1802h.append(i.H3, 44);
        f1802h.append(i.C3, 45);
        f1802h.append(i.D3, 46);
        f1802h.append(i.B3, 60);
        f1802h.append(i.f2137z3, 47);
        f1802h.append(i.A3, 48);
        f1802h.append(i.f2101v3, 49);
        f1802h.append(i.f2110w3, 50);
        f1802h.append(i.f2119x3, 51);
        f1802h.append(i.f2128y3, 52);
        f1802h.append(i.G3, 53);
        f1802h.append(i.f2021m4, 54);
        f1802h.append(i.X3, 55);
        f1802h.append(i.f2030n4, 56);
        f1802h.append(i.Y3, 57);
        f1802h.append(i.f2039o4, 58);
        f1802h.append(i.Z3, 59);
        f1802h.append(i.U3, 62);
        f1802h.append(i.T3, 63);
        f1802h.append(i.I3, 64);
        f1802h.append(i.H4, 65);
        f1802h.append(i.O3, 66);
        f1802h.append(i.I4, 67);
        f1802h.append(i.f2138z4, 79);
        f1802h.append(i.f2020m3, 38);
        f1802h.append(i.A4, 98);
        f1802h.append(i.f2129y4, 68);
        f1802h.append(i.f2048p4, 69);
        f1802h.append(i.f1913a4, 70);
        f1802h.append(i.M3, 71);
        f1802h.append(i.K3, 72);
        f1802h.append(i.L3, 73);
        f1802h.append(i.N3, 74);
        f1802h.append(i.J3, 75);
        f1802h.append(i.B4, 76);
        f1802h.append(i.f1967g4, 77);
        f1802h.append(i.J4, 78);
        f1802h.append(i.Q3, 80);
        f1802h.append(i.P3, 81);
        f1802h.append(i.C4, 82);
        f1802h.append(i.G4, 83);
        f1802h.append(i.F4, 84);
        f1802h.append(i.E4, 85);
        f1802h.append(i.D4, 86);
        f1802h.append(i.f2120x4, 97);
    }

    private int[] h(View view, String str) {
        int i10;
        Object g10;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = h.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (g10 = ((ConstraintLayout) view.getParent()).g(0, trim)) != null && (g10 instanceof Integer)) {
                i10 = ((Integer) g10).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        return i12 != split.length ? Arrays.copyOf(iArr, i12) : iArr;
    }

    private a i(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? i.f2002k3 : i.f2079t);
        q(context, aVar, obtainStyledAttributes, z10);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a j(int i10) {
        if (!this.f1807e.containsKey(Integer.valueOf(i10))) {
            this.f1807e.put(Integer.valueOf(i10), new a());
        }
        return (a) this.f1807e.get(Integer.valueOf(i10));
    }

    /* access modifiers changed from: private */
    public static int m(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void n(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L_0x006f
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L_0x002a
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L_0x0026
            r6 = -3
            if (r5 == r6) goto L_0x0020
            if (r5 == r0) goto L_0x0022
            r6 = -1
            if (r5 == r6) goto L_0x0022
        L_0x0020:
            r5 = r2
            goto L_0x002f
        L_0x0022:
            r3 = r2
            r2 = r5
            r5 = r3
            goto L_0x002f
        L_0x0026:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L_0x002f
        L_0x002a:
            int r5 = r5.getDimensionPixelSize(r6, r2)
            goto L_0x0022
        L_0x002f:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r6 == 0) goto L_0x0041
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.b) r4
            if (r7 != 0) goto L_0x003c
            r4.width = r2
            r4.f1698a0 = r5
            goto L_0x006e
        L_0x003c:
            r4.height = r2
            r4.f1700b0 = r5
            goto L_0x006e
        L_0x0041:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.e.b
            if (r6 == 0) goto L_0x0053
            androidx.constraintlayout.widget.e$b r4 = (androidx.constraintlayout.widget.e.b) r4
            if (r7 != 0) goto L_0x004e
            r4.f1835d = r2
            r4.f1856n0 = r5
            goto L_0x006e
        L_0x004e:
            r4.f1837e = r2
            r4.f1858o0 = r5
            goto L_0x006e
        L_0x0053:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.e.a.C0021a
            if (r6 == 0) goto L_0x006e
            androidx.constraintlayout.widget.e$a$a r4 = (androidx.constraintlayout.widget.e.a.C0021a) r4
            if (r7 != 0) goto L_0x0066
            r6 = 23
            r4.b(r6, r2)
            r6 = 80
        L_0x0062:
            r4.d(r6, r5)
            goto L_0x006e
        L_0x0066:
            r6 = 21
            r4.b(r6, r2)
            r6 = 81
            goto L_0x0062
        L_0x006e:
            return
        L_0x006f:
            java.lang.String r5 = r5.getString(r6)
            o(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.n(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void o(Object obj, String str, int i10) {
        int i11;
        int i12;
        if (str != null) {
            int indexOf = str.indexOf(61);
            int length = str.length();
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    String trim = substring.trim();
                    String trim2 = substring2.trim();
                    if ("ratio".equalsIgnoreCase(trim)) {
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                            if (i10 == 0) {
                                bVar.width = 0;
                            } else {
                                bVar.height = 0;
                            }
                            p(bVar, trim2);
                        } else if (obj instanceof b) {
                            ((b) obj).A = trim2;
                        } else if (obj instanceof a.C0021a) {
                            ((a.C0021a) obj).c(5, trim2);
                        }
                    } else if ("weight".equalsIgnoreCase(trim)) {
                        try {
                            float parseFloat = Float.parseFloat(trim2);
                            if (obj instanceof ConstraintLayout.b) {
                                ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                                if (i10 == 0) {
                                    bVar2.width = 0;
                                    bVar2.L = parseFloat;
                                    return;
                                }
                                bVar2.height = 0;
                                bVar2.M = parseFloat;
                            } else if (obj instanceof b) {
                                b bVar3 = (b) obj;
                                if (i10 == 0) {
                                    bVar3.f1835d = 0;
                                    bVar3.W = parseFloat;
                                    return;
                                }
                                bVar3.f1837e = 0;
                                bVar3.V = parseFloat;
                            } else if (obj instanceof a.C0021a) {
                                a.C0021a aVar = (a.C0021a) obj;
                                if (i10 == 0) {
                                    aVar.b(23, 0);
                                    i12 = 39;
                                } else {
                                    aVar.b(21, 0);
                                    i12 = 40;
                                }
                                aVar.a(i12, parseFloat);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                            if (i10 == 0) {
                                bVar4.width = 0;
                                bVar4.V = max;
                                bVar4.P = 2;
                                return;
                            }
                            bVar4.height = 0;
                            bVar4.W = max;
                            bVar4.Q = 2;
                        } else if (obj instanceof b) {
                            b bVar5 = (b) obj;
                            if (i10 == 0) {
                                bVar5.f1835d = 0;
                                bVar5.f1840f0 = max;
                                bVar5.Z = 2;
                                return;
                            }
                            bVar5.f1837e = 0;
                            bVar5.f1842g0 = max;
                            bVar5.f1830a0 = 2;
                        } else if (obj instanceof a.C0021a) {
                            a.C0021a aVar2 = (a.C0021a) obj;
                            if (i10 == 0) {
                                aVar2.b(23, 0);
                                i11 = 54;
                            } else {
                                aVar2.b(21, 0);
                                i11 = 55;
                            }
                            aVar2.b(i11, 2);
                        }
                    }
                }
            }
        }
    }

    static void p(ConstraintLayout.b bVar, String str) {
        float f10 = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i11 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i11);
                if (substring2.length() > 0) {
                    f10 = Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i11, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f10 = i10 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        bVar.I = str;
        bVar.J = f10;
        bVar.K = i10;
    }

    private void q(Context context, a aVar, TypedArray typedArray, boolean z10) {
        c cVar;
        String str;
        c cVar2;
        StringBuilder sb2;
        String str2;
        if (z10) {
            r(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (!(index == i.f2097v || i.N == index || i.O == index)) {
                aVar.f1811d.f1873a = true;
                aVar.f1812e.f1831b = true;
                aVar.f1810c.f1887a = true;
                aVar.f1813f.f1893a = true;
            }
            switch (f1801g.get(index)) {
                case 1:
                    b bVar = aVar.f1812e;
                    bVar.f1863r = m(typedArray, index, bVar.f1863r);
                    continue;
                case 2:
                    b bVar2 = aVar.f1812e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    continue;
                case 3:
                    b bVar3 = aVar.f1812e;
                    bVar3.f1861q = m(typedArray, index, bVar3.f1861q);
                    continue;
                case 4:
                    b bVar4 = aVar.f1812e;
                    bVar4.f1859p = m(typedArray, index, bVar4.f1859p);
                    continue;
                case 5:
                    aVar.f1812e.A = typedArray.getString(index);
                    continue;
                case 6:
                    b bVar5 = aVar.f1812e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    continue;
                case 7:
                    b bVar6 = aVar.f1812e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    continue;
                case 8:
                    b bVar7 = aVar.f1812e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    continue;
                case 9:
                    b bVar8 = aVar.f1812e;
                    bVar8.f1869x = m(typedArray, index, bVar8.f1869x);
                    continue;
                case 10:
                    b bVar9 = aVar.f1812e;
                    bVar9.f1868w = m(typedArray, index, bVar9.f1868w);
                    continue;
                case 11:
                    b bVar10 = aVar.f1812e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    continue;
                case 12:
                    b bVar11 = aVar.f1812e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    continue;
                case 13:
                    b bVar12 = aVar.f1812e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    continue;
                case 14:
                    b bVar13 = aVar.f1812e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    continue;
                case 15:
                    b bVar14 = aVar.f1812e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    continue;
                case 16:
                    b bVar15 = aVar.f1812e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    continue;
                case 17:
                    b bVar16 = aVar.f1812e;
                    bVar16.f1839f = typedArray.getDimensionPixelOffset(index, bVar16.f1839f);
                    continue;
                case 18:
                    b bVar17 = aVar.f1812e;
                    bVar17.f1841g = typedArray.getDimensionPixelOffset(index, bVar17.f1841g);
                    continue;
                case 19:
                    b bVar18 = aVar.f1812e;
                    bVar18.f1843h = typedArray.getFloat(index, bVar18.f1843h);
                    continue;
                case 20:
                    b bVar19 = aVar.f1812e;
                    bVar19.f1870y = typedArray.getFloat(index, bVar19.f1870y);
                    continue;
                case 21:
                    b bVar20 = aVar.f1812e;
                    bVar20.f1837e = typedArray.getLayoutDimension(index, bVar20.f1837e);
                    continue;
                case 22:
                    d dVar = aVar.f1810c;
                    dVar.f1888b = typedArray.getInt(index, dVar.f1888b);
                    d dVar2 = aVar.f1810c;
                    dVar2.f1888b = f1800f[dVar2.f1888b];
                    continue;
                case 23:
                    b bVar21 = aVar.f1812e;
                    bVar21.f1835d = typedArray.getLayoutDimension(index, bVar21.f1835d);
                    continue;
                case 24:
                    b bVar22 = aVar.f1812e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    continue;
                case 25:
                    b bVar23 = aVar.f1812e;
                    bVar23.f1847j = m(typedArray, index, bVar23.f1847j);
                    continue;
                case 26:
                    b bVar24 = aVar.f1812e;
                    bVar24.f1849k = m(typedArray, index, bVar24.f1849k);
                    continue;
                case 27:
                    b bVar25 = aVar.f1812e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    continue;
                case 28:
                    b bVar26 = aVar.f1812e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    continue;
                case 29:
                    b bVar27 = aVar.f1812e;
                    bVar27.f1851l = m(typedArray, index, bVar27.f1851l);
                    continue;
                case 30:
                    b bVar28 = aVar.f1812e;
                    bVar28.f1853m = m(typedArray, index, bVar28.f1853m);
                    continue;
                case 31:
                    b bVar29 = aVar.f1812e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    continue;
                case 32:
                    b bVar30 = aVar.f1812e;
                    bVar30.f1866u = m(typedArray, index, bVar30.f1866u);
                    continue;
                case 33:
                    b bVar31 = aVar.f1812e;
                    bVar31.f1867v = m(typedArray, index, bVar31.f1867v);
                    continue;
                case 34:
                    b bVar32 = aVar.f1812e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    continue;
                case 35:
                    b bVar33 = aVar.f1812e;
                    bVar33.f1857o = m(typedArray, index, bVar33.f1857o);
                    continue;
                case 36:
                    b bVar34 = aVar.f1812e;
                    bVar34.f1855n = m(typedArray, index, bVar34.f1855n);
                    continue;
                case 37:
                    b bVar35 = aVar.f1812e;
                    bVar35.f1871z = typedArray.getFloat(index, bVar35.f1871z);
                    continue;
                case 38:
                    aVar.f1808a = typedArray.getResourceId(index, aVar.f1808a);
                    continue;
                case 39:
                    b bVar36 = aVar.f1812e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    continue;
                case 40:
                    b bVar37 = aVar.f1812e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    continue;
                case 41:
                    b bVar38 = aVar.f1812e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    continue;
                case 42:
                    b bVar39 = aVar.f1812e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    continue;
                case 43:
                    d dVar3 = aVar.f1810c;
                    dVar3.f1890d = typedArray.getFloat(index, dVar3.f1890d);
                    continue;
                case 44:
                    C0022e eVar = aVar.f1813f;
                    eVar.f1905m = true;
                    eVar.f1906n = typedArray.getDimension(index, eVar.f1906n);
                    continue;
                case 45:
                    C0022e eVar2 = aVar.f1813f;
                    eVar2.f1895c = typedArray.getFloat(index, eVar2.f1895c);
                    continue;
                case 46:
                    C0022e eVar3 = aVar.f1813f;
                    eVar3.f1896d = typedArray.getFloat(index, eVar3.f1896d);
                    continue;
                case 47:
                    C0022e eVar4 = aVar.f1813f;
                    eVar4.f1897e = typedArray.getFloat(index, eVar4.f1897e);
                    continue;
                case 48:
                    C0022e eVar5 = aVar.f1813f;
                    eVar5.f1898f = typedArray.getFloat(index, eVar5.f1898f);
                    continue;
                case 49:
                    C0022e eVar6 = aVar.f1813f;
                    eVar6.f1899g = typedArray.getDimension(index, eVar6.f1899g);
                    continue;
                case 50:
                    C0022e eVar7 = aVar.f1813f;
                    eVar7.f1900h = typedArray.getDimension(index, eVar7.f1900h);
                    continue;
                case 51:
                    C0022e eVar8 = aVar.f1813f;
                    eVar8.f1902j = typedArray.getDimension(index, eVar8.f1902j);
                    continue;
                case 52:
                    C0022e eVar9 = aVar.f1813f;
                    eVar9.f1903k = typedArray.getDimension(index, eVar9.f1903k);
                    continue;
                case 53:
                    C0022e eVar10 = aVar.f1813f;
                    eVar10.f1904l = typedArray.getDimension(index, eVar10.f1904l);
                    continue;
                case 54:
                    b bVar40 = aVar.f1812e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    continue;
                case 55:
                    b bVar41 = aVar.f1812e;
                    bVar41.f1830a0 = typedArray.getInt(index, bVar41.f1830a0);
                    continue;
                case 56:
                    b bVar42 = aVar.f1812e;
                    bVar42.f1832b0 = typedArray.getDimensionPixelSize(index, bVar42.f1832b0);
                    continue;
                case 57:
                    b bVar43 = aVar.f1812e;
                    bVar43.f1834c0 = typedArray.getDimensionPixelSize(index, bVar43.f1834c0);
                    continue;
                case 58:
                    b bVar44 = aVar.f1812e;
                    bVar44.f1836d0 = typedArray.getDimensionPixelSize(index, bVar44.f1836d0);
                    continue;
                case 59:
                    b bVar45 = aVar.f1812e;
                    bVar45.f1838e0 = typedArray.getDimensionPixelSize(index, bVar45.f1838e0);
                    continue;
                case 60:
                    C0022e eVar11 = aVar.f1813f;
                    eVar11.f1894b = typedArray.getFloat(index, eVar11.f1894b);
                    continue;
                case 61:
                    b bVar46 = aVar.f1812e;
                    bVar46.B = m(typedArray, index, bVar46.B);
                    continue;
                case 62:
                    b bVar47 = aVar.f1812e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    continue;
                case 63:
                    b bVar48 = aVar.f1812e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    continue;
                case 64:
                    c cVar3 = aVar.f1811d;
                    cVar3.f1874b = m(typedArray, index, cVar3.f1874b);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f1811d;
                        str = typedArray.getString(index);
                    } else {
                        cVar = aVar.f1811d;
                        str = q.a.f14912c[typedArray.getInteger(index, 0)];
                    }
                    cVar.f1876d = str;
                    continue;
                case 66:
                    aVar.f1811d.f1878f = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    c cVar4 = aVar.f1811d;
                    cVar4.f1881i = typedArray.getFloat(index, cVar4.f1881i);
                    continue;
                case 68:
                    d dVar4 = aVar.f1810c;
                    dVar4.f1891e = typedArray.getFloat(index, dVar4.f1891e);
                    continue;
                case 69:
                    aVar.f1812e.f1840f0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f1812e.f1842g0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    b bVar49 = aVar.f1812e;
                    bVar49.f1844h0 = typedArray.getInt(index, bVar49.f1844h0);
                    continue;
                case 73:
                    b bVar50 = aVar.f1812e;
                    bVar50.f1846i0 = typedArray.getDimensionPixelSize(index, bVar50.f1846i0);
                    continue;
                case 74:
                    aVar.f1812e.f1852l0 = typedArray.getString(index);
                    continue;
                case 75:
                    b bVar51 = aVar.f1812e;
                    bVar51.f1860p0 = typedArray.getBoolean(index, bVar51.f1860p0);
                    continue;
                case 76:
                    c cVar5 = aVar.f1811d;
                    cVar5.f1877e = typedArray.getInt(index, cVar5.f1877e);
                    continue;
                case 77:
                    aVar.f1812e.f1854m0 = typedArray.getString(index);
                    continue;
                case 78:
                    d dVar5 = aVar.f1810c;
                    dVar5.f1889c = typedArray.getInt(index, dVar5.f1889c);
                    continue;
                case 79:
                    c cVar6 = aVar.f1811d;
                    cVar6.f1879g = typedArray.getFloat(index, cVar6.f1879g);
                    continue;
                case 80:
                    b bVar52 = aVar.f1812e;
                    bVar52.f1856n0 = typedArray.getBoolean(index, bVar52.f1856n0);
                    continue;
                case 81:
                    b bVar53 = aVar.f1812e;
                    bVar53.f1858o0 = typedArray.getBoolean(index, bVar53.f1858o0);
                    continue;
                case 82:
                    c cVar7 = aVar.f1811d;
                    cVar7.f1875c = typedArray.getInteger(index, cVar7.f1875c);
                    continue;
                case 83:
                    C0022e eVar12 = aVar.f1813f;
                    eVar12.f1901i = m(typedArray, index, eVar12.f1901i);
                    continue;
                case 84:
                    c cVar8 = aVar.f1811d;
                    cVar8.f1883k = typedArray.getInteger(index, cVar8.f1883k);
                    continue;
                case 85:
                    c cVar9 = aVar.f1811d;
                    cVar9.f1882j = typedArray.getFloat(index, cVar9.f1882j);
                    continue;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 != 1) {
                        if (i11 != 3) {
                            c cVar10 = aVar.f1811d;
                            cVar10.f1885m = typedArray.getInteger(index, cVar10.f1886n);
                            break;
                        } else {
                            aVar.f1811d.f1884l = typedArray.getString(index);
                            if (aVar.f1811d.f1884l.indexOf("/") <= 0) {
                                aVar.f1811d.f1885m = -1;
                                break;
                            } else {
                                aVar.f1811d.f1886n = typedArray.getResourceId(index, -1);
                                cVar2 = aVar.f1811d;
                            }
                        }
                    } else {
                        aVar.f1811d.f1886n = typedArray.getResourceId(index, -1);
                        cVar2 = aVar.f1811d;
                        if (cVar2.f1886n == -1) {
                            continue;
                        }
                    }
                    cVar2.f1885m = -2;
                    break;
                case 87:
                    sb2 = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                case 91:
                    b bVar54 = aVar.f1812e;
                    bVar54.f1864s = m(typedArray, index, bVar54.f1864s);
                    continue;
                case 92:
                    b bVar55 = aVar.f1812e;
                    bVar55.f1865t = m(typedArray, index, bVar55.f1865t);
                    continue;
                case 93:
                    b bVar56 = aVar.f1812e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    continue;
                case 94:
                    b bVar57 = aVar.f1812e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    continue;
                case 95:
                    n(aVar.f1812e, typedArray, index, 0);
                    continue;
                case 96:
                    n(aVar.f1812e, typedArray, index, 1);
                    continue;
                case 97:
                    b bVar58 = aVar.f1812e;
                    bVar58.f1862q0 = typedArray.getInt(index, bVar58.f1862q0);
                    continue;
                default:
                    sb2 = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            sb2.append(str2);
            sb2.append(Integer.toHexString(index));
            sb2.append("   ");
            sb2.append(f1801g.get(index));
            Log.w("ConstraintSet", sb2.toString());
        }
        b bVar59 = aVar.f1812e;
        if (bVar59.f1852l0 != null) {
            bVar59.f1850k0 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0482, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009d, code lost:
        r0.b(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x014b, code lost:
        r0.a(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01a5, code lost:
        r0.c(r4, r13.getString(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01ea, code lost:
        r3 = r13.getFloat(r3, 1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003c, code lost:
        r4.append(r5);
        r4.append(java.lang.Integer.toHexString(r3));
        r4.append("   ");
        r4.append(f1801g.get(r3));
        android.util.Log.w("ConstraintSet", r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0065, code lost:
        r0.d(r4, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void r(android.content.Context r11, androidx.constraintlayout.widget.e.a r12, android.content.res.TypedArray r13) {
        /*
            int r11 = r13.getIndexCount()
            androidx.constraintlayout.widget.e$a$a r0 = new androidx.constraintlayout.widget.e$a$a
            r0.<init>()
            r12.f1815h = r0
            androidx.constraintlayout.widget.e$c r1 = r12.f1811d
            r2 = 0
            r1.f1873a = r2
            androidx.constraintlayout.widget.e$b r1 = r12.f1812e
            r1.f1831b = r2
            androidx.constraintlayout.widget.e$d r1 = r12.f1810c
            r1.f1887a = r2
            androidx.constraintlayout.widget.e$e r1 = r12.f1813f
            r1.f1893a = r2
            r1 = r2
        L_0x001d:
            if (r1 >= r11) goto L_0x0486
            int r3 = r13.getIndex(r1)
            android.util.SparseIntArray r4 = f1802h
            int r4 = r4.get(r3)
            r5 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r6 = "   "
            r7 = 3
            java.lang.String r8 = "ConstraintSet"
            r9 = 1
            r10 = -1
            switch(r4) {
                case 2: goto L_0x0477;
                case 3: goto L_0x0035;
                case 4: goto L_0x0035;
                case 5: goto L_0x0474;
                case 6: goto L_0x0469;
                case 7: goto L_0x045e;
                case 8: goto L_0x0452;
                case 9: goto L_0x0035;
                case 10: goto L_0x0035;
                case 11: goto L_0x0446;
                case 12: goto L_0x043a;
                case 13: goto L_0x042e;
                case 14: goto L_0x0422;
                case 15: goto L_0x0416;
                case 16: goto L_0x040a;
                case 17: goto L_0x03fe;
                case 18: goto L_0x03f2;
                case 19: goto L_0x03e6;
                case 20: goto L_0x03da;
                case 21: goto L_0x03ce;
                case 22: goto L_0x03be;
                case 23: goto L_0x03b2;
                case 24: goto L_0x03a6;
                case 25: goto L_0x0035;
                case 26: goto L_0x0035;
                case 27: goto L_0x039a;
                case 28: goto L_0x038e;
                case 29: goto L_0x0035;
                case 30: goto L_0x0035;
                case 31: goto L_0x0382;
                case 32: goto L_0x0035;
                case 33: goto L_0x0035;
                case 34: goto L_0x0376;
                case 35: goto L_0x0035;
                case 36: goto L_0x0035;
                case 37: goto L_0x036a;
                case 38: goto L_0x035e;
                case 39: goto L_0x0352;
                case 40: goto L_0x0346;
                case 41: goto L_0x033a;
                case 42: goto L_0x032e;
                case 43: goto L_0x0322;
                case 44: goto L_0x0313;
                case 45: goto L_0x0307;
                case 46: goto L_0x02fb;
                case 47: goto L_0x02ef;
                case 48: goto L_0x02e3;
                case 49: goto L_0x02d7;
                case 50: goto L_0x02cb;
                case 51: goto L_0x02bf;
                case 52: goto L_0x02b3;
                case 53: goto L_0x02a7;
                case 54: goto L_0x029b;
                case 55: goto L_0x028f;
                case 56: goto L_0x0283;
                case 57: goto L_0x0277;
                case 58: goto L_0x026b;
                case 59: goto L_0x025f;
                case 60: goto L_0x0253;
                case 61: goto L_0x0035;
                case 62: goto L_0x0247;
                case 63: goto L_0x023b;
                case 64: goto L_0x022f;
                case 65: goto L_0x0213;
                case 66: goto L_0x020b;
                case 67: goto L_0x01ff;
                case 68: goto L_0x01f3;
                case 69: goto L_0x01f0;
                case 70: goto L_0x01e8;
                case 71: goto L_0x01e1;
                case 72: goto L_0x01d5;
                case 73: goto L_0x01c9;
                case 74: goto L_0x01c6;
                case 75: goto L_0x01ba;
                case 76: goto L_0x01ae;
                case 77: goto L_0x01a3;
                case 78: goto L_0x0197;
                case 79: goto L_0x018c;
                case 80: goto L_0x0180;
                case 81: goto L_0x0174;
                case 82: goto L_0x0168;
                case 83: goto L_0x015c;
                case 84: goto L_0x0150;
                case 85: goto L_0x0141;
                case 86: goto L_0x00cb;
                case 87: goto L_0x00c2;
                case 88: goto L_0x0035;
                case 89: goto L_0x0035;
                case 90: goto L_0x0035;
                case 91: goto L_0x0035;
                case 92: goto L_0x0035;
                case 93: goto L_0x00b7;
                case 94: goto L_0x00ac;
                case 95: goto L_0x00a7;
                case 96: goto L_0x00a2;
                case 97: goto L_0x0093;
                case 98: goto L_0x006a;
                case 99: goto L_0x005b;
                default: goto L_0x0035;
            }
        L_0x0035:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unknown attribute 0x"
        L_0x003c:
            r4.append(r5)
            java.lang.String r5 = java.lang.Integer.toHexString(r3)
            r4.append(r5)
            r4.append(r6)
            android.util.SparseIntArray r5 = f1801g
            int r3 = r5.get(r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r8, r3)
            goto L_0x0482
        L_0x005b:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            boolean r4 = r4.f1845i
            boolean r3 = r13.getBoolean(r3, r4)
            r4 = 99
        L_0x0065:
            r0.d(r4, r3)
            goto L_0x0482
        L_0x006a:
            boolean r4 = u.b.C
            if (r4 == 0) goto L_0x0080
            int r4 = r12.f1808a
            int r4 = r13.getResourceId(r3, r4)
            r12.f1808a = r4
            if (r4 != r10) goto L_0x0482
        L_0x0078:
            java.lang.String r3 = r13.getString(r3)
            r12.f1809b = r3
            goto L_0x0482
        L_0x0080:
            android.util.TypedValue r4 = r13.peekValue(r3)
            int r4 = r4.type
            if (r4 != r7) goto L_0x0089
            goto L_0x0078
        L_0x0089:
            int r4 = r12.f1808a
            int r3 = r13.getResourceId(r3, r4)
            r12.f1808a = r3
            goto L_0x0482
        L_0x0093:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.f1862q0
            int r3 = r13.getInt(r3, r4)
            r4 = 97
        L_0x009d:
            r0.b(r4, r3)
            goto L_0x0482
        L_0x00a2:
            n(r0, r13, r3, r9)
            goto L_0x0482
        L_0x00a7:
            n(r0, r13, r3, r2)
            goto L_0x0482
        L_0x00ac:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.U
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 94
            goto L_0x009d
        L_0x00b7:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.N
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 93
            goto L_0x009d
        L_0x00c2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "unused attribute 0x"
            goto L_0x003c
        L_0x00cb:
            android.util.TypedValue r4 = r13.peekValue(r3)
            int r4 = r4.type
            r5 = -2
            r6 = 89
            r8 = 88
            if (r4 != r9) goto L_0x00f4
            androidx.constraintlayout.widget.e$c r4 = r12.f1811d
            int r3 = r13.getResourceId(r3, r10)
            r4.f1886n = r3
            androidx.constraintlayout.widget.e$c r3 = r12.f1811d
            int r3 = r3.f1886n
            r0.b(r6, r3)
            androidx.constraintlayout.widget.e$c r3 = r12.f1811d
            int r4 = r3.f1886n
            if (r4 == r10) goto L_0x0482
        L_0x00ed:
            r3.f1885m = r5
            r0.b(r8, r5)
            goto L_0x0482
        L_0x00f4:
            if (r4 != r7) goto L_0x012e
            androidx.constraintlayout.widget.e$c r4 = r12.f1811d
            java.lang.String r7 = r13.getString(r3)
            r4.f1884l = r7
            androidx.constraintlayout.widget.e$c r4 = r12.f1811d
            java.lang.String r4 = r4.f1884l
            r7 = 90
            r0.c(r7, r4)
            androidx.constraintlayout.widget.e$c r4 = r12.f1811d
            java.lang.String r4 = r4.f1884l
            java.lang.String r7 = "/"
            int r4 = r4.indexOf(r7)
            if (r4 <= 0) goto L_0x0125
            androidx.constraintlayout.widget.e$c r4 = r12.f1811d
            int r3 = r13.getResourceId(r3, r10)
            r4.f1886n = r3
            androidx.constraintlayout.widget.e$c r3 = r12.f1811d
            int r3 = r3.f1886n
            r0.b(r6, r3)
            androidx.constraintlayout.widget.e$c r3 = r12.f1811d
            goto L_0x00ed
        L_0x0125:
            androidx.constraintlayout.widget.e$c r3 = r12.f1811d
            r3.f1885m = r10
            r0.b(r8, r10)
            goto L_0x0482
        L_0x012e:
            androidx.constraintlayout.widget.e$c r4 = r12.f1811d
            int r5 = r4.f1886n
            int r3 = r13.getInteger(r3, r5)
            r4.f1885m = r3
            androidx.constraintlayout.widget.e$c r3 = r12.f1811d
            int r3 = r3.f1885m
            r0.b(r8, r3)
            goto L_0x0482
        L_0x0141:
            androidx.constraintlayout.widget.e$c r4 = r12.f1811d
            float r4 = r4.f1882j
            float r3 = r13.getFloat(r3, r4)
            r4 = 85
        L_0x014b:
            r0.a(r4, r3)
            goto L_0x0482
        L_0x0150:
            androidx.constraintlayout.widget.e$c r4 = r12.f1811d
            int r4 = r4.f1883k
            int r3 = r13.getInteger(r3, r4)
            r4 = 84
            goto L_0x009d
        L_0x015c:
            androidx.constraintlayout.widget.e$e r4 = r12.f1813f
            int r4 = r4.f1901i
            int r3 = m(r13, r3, r4)
            r4 = 83
            goto L_0x009d
        L_0x0168:
            androidx.constraintlayout.widget.e$c r4 = r12.f1811d
            int r4 = r4.f1875c
            int r3 = r13.getInteger(r3, r4)
            r4 = 82
            goto L_0x009d
        L_0x0174:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            boolean r4 = r4.f1858o0
            boolean r3 = r13.getBoolean(r3, r4)
            r4 = 81
            goto L_0x0065
        L_0x0180:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            boolean r4 = r4.f1856n0
            boolean r3 = r13.getBoolean(r3, r4)
            r4 = 80
            goto L_0x0065
        L_0x018c:
            androidx.constraintlayout.widget.e$c r4 = r12.f1811d
            float r4 = r4.f1879g
            float r3 = r13.getFloat(r3, r4)
            r4 = 79
            goto L_0x014b
        L_0x0197:
            androidx.constraintlayout.widget.e$d r4 = r12.f1810c
            int r4 = r4.f1889c
            int r3 = r13.getInt(r3, r4)
            r4 = 78
            goto L_0x009d
        L_0x01a3:
            r4 = 77
        L_0x01a5:
            java.lang.String r3 = r13.getString(r3)
            r0.c(r4, r3)
            goto L_0x0482
        L_0x01ae:
            androidx.constraintlayout.widget.e$c r4 = r12.f1811d
            int r4 = r4.f1877e
            int r3 = r13.getInt(r3, r4)
            r4 = 76
            goto L_0x009d
        L_0x01ba:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            boolean r4 = r4.f1860p0
            boolean r3 = r13.getBoolean(r3, r4)
            r4 = 75
            goto L_0x0065
        L_0x01c6:
            r4 = 74
            goto L_0x01a5
        L_0x01c9:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.f1846i0
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 73
            goto L_0x009d
        L_0x01d5:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.f1844h0
            int r3 = r13.getInt(r3, r4)
            r4 = 72
            goto L_0x009d
        L_0x01e1:
            java.lang.String r3 = "CURRENTLY UNSUPPORTED"
            android.util.Log.e(r8, r3)
            goto L_0x0482
        L_0x01e8:
            r4 = 70
        L_0x01ea:
            float r3 = r13.getFloat(r3, r5)
            goto L_0x014b
        L_0x01f0:
            r4 = 69
            goto L_0x01ea
        L_0x01f3:
            androidx.constraintlayout.widget.e$d r4 = r12.f1810c
            float r4 = r4.f1891e
            float r3 = r13.getFloat(r3, r4)
            r4 = 68
            goto L_0x014b
        L_0x01ff:
            androidx.constraintlayout.widget.e$c r4 = r12.f1811d
            float r4 = r4.f1881i
            float r3 = r13.getFloat(r3, r4)
            r4 = 67
            goto L_0x014b
        L_0x020b:
            r4 = 66
            int r3 = r13.getInt(r3, r2)
            goto L_0x009d
        L_0x0213:
            android.util.TypedValue r4 = r13.peekValue(r3)
            int r4 = r4.type
            r5 = 65
            if (r4 != r7) goto L_0x0226
            java.lang.String r3 = r13.getString(r3)
        L_0x0221:
            r0.c(r5, r3)
            goto L_0x0482
        L_0x0226:
            java.lang.String[] r4 = q.a.f14912c
            int r3 = r13.getInteger(r3, r2)
            r3 = r4[r3]
            goto L_0x0221
        L_0x022f:
            androidx.constraintlayout.widget.e$c r4 = r12.f1811d
            int r4 = r4.f1874b
            int r3 = m(r13, r3, r4)
            r4 = 64
            goto L_0x009d
        L_0x023b:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            float r4 = r4.D
            float r3 = r13.getFloat(r3, r4)
            r4 = 63
            goto L_0x014b
        L_0x0247:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.C
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 62
            goto L_0x009d
        L_0x0253:
            androidx.constraintlayout.widget.e$e r4 = r12.f1813f
            float r4 = r4.f1894b
            float r3 = r13.getFloat(r3, r4)
            r4 = 60
            goto L_0x014b
        L_0x025f:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.f1838e0
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 59
            goto L_0x009d
        L_0x026b:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.f1836d0
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 58
            goto L_0x009d
        L_0x0277:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.f1834c0
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 57
            goto L_0x009d
        L_0x0283:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.f1832b0
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 56
            goto L_0x009d
        L_0x028f:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.f1830a0
            int r3 = r13.getInt(r3, r4)
            r4 = 55
            goto L_0x009d
        L_0x029b:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.Z
            int r3 = r13.getInt(r3, r4)
            r4 = 54
            goto L_0x009d
        L_0x02a7:
            androidx.constraintlayout.widget.e$e r4 = r12.f1813f
            float r4 = r4.f1904l
            float r3 = r13.getDimension(r3, r4)
            r4 = 53
            goto L_0x014b
        L_0x02b3:
            androidx.constraintlayout.widget.e$e r4 = r12.f1813f
            float r4 = r4.f1903k
            float r3 = r13.getDimension(r3, r4)
            r4 = 52
            goto L_0x014b
        L_0x02bf:
            androidx.constraintlayout.widget.e$e r4 = r12.f1813f
            float r4 = r4.f1902j
            float r3 = r13.getDimension(r3, r4)
            r4 = 51
            goto L_0x014b
        L_0x02cb:
            androidx.constraintlayout.widget.e$e r4 = r12.f1813f
            float r4 = r4.f1900h
            float r3 = r13.getDimension(r3, r4)
            r4 = 50
            goto L_0x014b
        L_0x02d7:
            androidx.constraintlayout.widget.e$e r4 = r12.f1813f
            float r4 = r4.f1899g
            float r3 = r13.getDimension(r3, r4)
            r4 = 49
            goto L_0x014b
        L_0x02e3:
            androidx.constraintlayout.widget.e$e r4 = r12.f1813f
            float r4 = r4.f1898f
            float r3 = r13.getFloat(r3, r4)
            r4 = 48
            goto L_0x014b
        L_0x02ef:
            androidx.constraintlayout.widget.e$e r4 = r12.f1813f
            float r4 = r4.f1897e
            float r3 = r13.getFloat(r3, r4)
            r4 = 47
            goto L_0x014b
        L_0x02fb:
            androidx.constraintlayout.widget.e$e r4 = r12.f1813f
            float r4 = r4.f1896d
            float r3 = r13.getFloat(r3, r4)
            r4 = 46
            goto L_0x014b
        L_0x0307:
            androidx.constraintlayout.widget.e$e r4 = r12.f1813f
            float r4 = r4.f1895c
            float r3 = r13.getFloat(r3, r4)
            r4 = 45
            goto L_0x014b
        L_0x0313:
            r4 = 44
            r0.d(r4, r9)
            androidx.constraintlayout.widget.e$e r5 = r12.f1813f
            float r5 = r5.f1906n
            float r3 = r13.getDimension(r3, r5)
            goto L_0x014b
        L_0x0322:
            androidx.constraintlayout.widget.e$d r4 = r12.f1810c
            float r4 = r4.f1890d
            float r3 = r13.getFloat(r3, r4)
            r4 = 43
            goto L_0x014b
        L_0x032e:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.Y
            int r3 = r13.getInt(r3, r4)
            r4 = 42
            goto L_0x009d
        L_0x033a:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.X
            int r3 = r13.getInt(r3, r4)
            r4 = 41
            goto L_0x009d
        L_0x0346:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            float r4 = r4.V
            float r3 = r13.getFloat(r3, r4)
            r4 = 40
            goto L_0x014b
        L_0x0352:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            float r4 = r4.W
            float r3 = r13.getFloat(r3, r4)
            r4 = 39
            goto L_0x014b
        L_0x035e:
            int r4 = r12.f1808a
            int r3 = r13.getResourceId(r3, r4)
            r12.f1808a = r3
            r4 = 38
            goto L_0x009d
        L_0x036a:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            float r4 = r4.f1871z
            float r3 = r13.getFloat(r3, r4)
            r4 = 37
            goto L_0x014b
        L_0x0376:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.J
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 34
            goto L_0x009d
        L_0x0382:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.M
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 31
            goto L_0x009d
        L_0x038e:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.I
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 28
            goto L_0x009d
        L_0x039a:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.G
            int r3 = r13.getInt(r3, r4)
            r4 = 27
            goto L_0x009d
        L_0x03a6:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.H
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 24
            goto L_0x009d
        L_0x03b2:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.f1835d
            int r3 = r13.getLayoutDimension(r3, r4)
            r4 = 23
            goto L_0x009d
        L_0x03be:
            int[] r4 = f1800f
            androidx.constraintlayout.widget.e$d r5 = r12.f1810c
            int r5 = r5.f1888b
            int r3 = r13.getInt(r3, r5)
            r3 = r4[r3]
            r4 = 22
            goto L_0x009d
        L_0x03ce:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.f1837e
            int r3 = r13.getLayoutDimension(r3, r4)
            r4 = 21
            goto L_0x009d
        L_0x03da:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            float r4 = r4.f1870y
            float r3 = r13.getFloat(r3, r4)
            r4 = 20
            goto L_0x014b
        L_0x03e6:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            float r4 = r4.f1843h
            float r3 = r13.getFloat(r3, r4)
            r4 = 19
            goto L_0x014b
        L_0x03f2:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.f1841g
            int r3 = r13.getDimensionPixelOffset(r3, r4)
            r4 = 18
            goto L_0x009d
        L_0x03fe:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.f1839f
            int r3 = r13.getDimensionPixelOffset(r3, r4)
            r4 = 17
            goto L_0x009d
        L_0x040a:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.P
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 16
            goto L_0x009d
        L_0x0416:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.T
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 15
            goto L_0x009d
        L_0x0422:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.Q
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 14
            goto L_0x009d
        L_0x042e:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.O
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 13
            goto L_0x009d
        L_0x043a:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.S
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 12
            goto L_0x009d
        L_0x0446:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.R
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 11
            goto L_0x009d
        L_0x0452:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.L
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 8
            goto L_0x009d
        L_0x045e:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.F
            int r3 = r13.getDimensionPixelOffset(r3, r4)
            r4 = 7
            goto L_0x009d
        L_0x0469:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.E
            int r3 = r13.getDimensionPixelOffset(r3, r4)
            r4 = 6
            goto L_0x009d
        L_0x0474:
            r4 = 5
            goto L_0x01a5
        L_0x0477:
            androidx.constraintlayout.widget.e$b r4 = r12.f1812e
            int r4 = r4.K
            int r3 = r13.getDimensionPixelSize(r3, r4)
            r4 = 2
            goto L_0x009d
        L_0x0482:
            int r1 = r1 + 1
            goto L_0x001d
        L_0x0486:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.r(android.content.Context, androidx.constraintlayout.widget.e$a, android.content.res.TypedArray):void");
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet((e) null);
        constraintLayout.requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1807e.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f1807e.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + u.a.a(childAt));
            } else if (this.f1806d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id2 != -1) {
                if (this.f1807e.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    a aVar = (a) this.f1807e.get(Integer.valueOf(id2));
                    if (aVar != null) {
                        if (childAt instanceof a) {
                            aVar.f1812e.f1848j0 = 1;
                            a aVar2 = (a) childAt;
                            aVar2.setId(id2);
                            aVar2.setType(aVar.f1812e.f1844h0);
                            aVar2.setMargin(aVar.f1812e.f1846i0);
                            aVar2.setAllowsGoneWidget(aVar.f1812e.f1860p0);
                            b bVar = aVar.f1812e;
                            int[] iArr = bVar.f1850k0;
                            if (iArr != null) {
                                aVar2.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f1852l0;
                                if (str != null) {
                                    bVar.f1850k0 = h(aVar2, str);
                                    aVar2.setReferencedIds(aVar.f1812e.f1850k0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.b(bVar2);
                        if (z10) {
                            b.c(childAt, aVar.f1814g);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f1810c;
                        if (dVar.f1889c == 0) {
                            childAt.setVisibility(dVar.f1888b);
                        }
                        childAt.setAlpha(aVar.f1810c.f1890d);
                        childAt.setRotation(aVar.f1813f.f1894b);
                        childAt.setRotationX(aVar.f1813f.f1895c);
                        childAt.setRotationY(aVar.f1813f.f1896d);
                        childAt.setScaleX(aVar.f1813f.f1897e);
                        childAt.setScaleY(aVar.f1813f.f1898f);
                        C0022e eVar = aVar.f1813f;
                        if (eVar.f1901i != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(aVar.f1813f.f1901i);
                            if (findViewById != null) {
                                float top = ((float) (findViewById.getTop() + findViewById.getBottom())) / 2.0f;
                                float left = ((float) (findViewById.getLeft() + findViewById.getRight())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(left - ((float) childAt.getLeft()));
                                    childAt.setPivotY(top - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f1899g)) {
                                childAt.setPivotX(aVar.f1813f.f1899g);
                            }
                            if (!Float.isNaN(aVar.f1813f.f1900h)) {
                                childAt.setPivotY(aVar.f1813f.f1900h);
                            }
                        }
                        childAt.setTranslationX(aVar.f1813f.f1902j);
                        childAt.setTranslationY(aVar.f1813f.f1903k);
                        childAt.setTranslationZ(aVar.f1813f.f1904l);
                        C0022e eVar2 = aVar.f1813f;
                        if (eVar2.f1905m) {
                            childAt.setElevation(eVar2.f1906n);
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = (a) this.f1807e.get(num);
            if (aVar3 != null) {
                if (aVar3.f1812e.f1848j0 == 1) {
                    a aVar4 = new a(constraintLayout.getContext());
                    aVar4.setId(num.intValue());
                    b bVar3 = aVar3.f1812e;
                    int[] iArr2 = bVar3.f1850k0;
                    if (iArr2 != null) {
                        aVar4.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f1852l0;
                        if (str2 != null) {
                            bVar3.f1850k0 = h(aVar4, str2);
                            aVar4.setReferencedIds(aVar3.f1812e.f1850k0);
                        }
                    }
                    aVar4.setType(aVar3.f1812e.f1844h0);
                    aVar4.setMargin(aVar3.f1812e.f1846i0);
                    ConstraintLayout.b e10 = constraintLayout.generateDefaultLayoutParams();
                    aVar4.o();
                    aVar3.b(e10);
                    constraintLayout.addView(aVar4, e10);
                }
                if (aVar3.f1812e.f1829a) {
                    g gVar = new g(constraintLayout.getContext());
                    gVar.setId(num.intValue());
                    ConstraintLayout.b e11 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.b(e11);
                    constraintLayout.addView(gVar, e11);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof c) {
                ((c) childAt2).f(constraintLayout);
            }
        }
    }

    public void e(Context context, int i10) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1807e.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!this.f1806d || id2 != -1) {
                if (!this.f1807e.containsKey(Integer.valueOf(id2))) {
                    this.f1807e.put(Integer.valueOf(id2), new a());
                }
                a aVar = (a) this.f1807e.get(Integer.valueOf(id2));
                if (aVar != null) {
                    aVar.f1814g = b.a(this.f1805c, childAt);
                    aVar.d(id2, bVar);
                    aVar.f1810c.f1888b = childAt.getVisibility();
                    aVar.f1810c.f1890d = childAt.getAlpha();
                    aVar.f1813f.f1894b = childAt.getRotation();
                    aVar.f1813f.f1895c = childAt.getRotationX();
                    aVar.f1813f.f1896d = childAt.getRotationY();
                    aVar.f1813f.f1897e = childAt.getScaleX();
                    aVar.f1813f.f1898f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        C0022e eVar = aVar.f1813f;
                        eVar.f1899g = pivotX;
                        eVar.f1900h = pivotY;
                    }
                    aVar.f1813f.f1902j = childAt.getTranslationX();
                    aVar.f1813f.f1903k = childAt.getTranslationY();
                    aVar.f1813f.f1904l = childAt.getTranslationZ();
                    C0022e eVar2 = aVar.f1813f;
                    if (eVar2.f1905m) {
                        eVar2.f1906n = childAt.getElevation();
                    }
                    if (childAt instanceof a) {
                        a aVar2 = (a) childAt;
                        aVar.f1812e.f1860p0 = aVar2.getAllowsGoneWidget();
                        aVar.f1812e.f1850k0 = aVar2.getReferencedIds();
                        aVar.f1812e.f1844h0 = aVar2.getType();
                        aVar.f1812e.f1846i0 = aVar2.getMargin();
                    }
                }
                i10++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void g(int i10, int i11, int i12, float f10) {
        b bVar = j(i10).f1812e;
        bVar.B = i11;
        bVar.C = i12;
        bVar.D = f10;
    }

    public void k(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a i11 = i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        i11.f1812e.f1829a = true;
                    }
                    this.f1807e.put(Integer.valueOf(i11.f1808a), i11);
                }
            }
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01cf, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x01dc
            if (r0 == 0) goto L_0x01cc
            r4 = -1
            r5 = 3
            r6 = 2
            r7 = 0
            if (r0 == r6) goto L_0x006d
            if (r0 == r5) goto L_0x0015
            goto L_0x01cf
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.String r0 = r0.toLowerCase(r8)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            switch(r8) {
                case -2075718416: goto L_0x004b;
                case -190376483: goto L_0x0041;
                case 426575017: goto L_0x0037;
                case 2146106725: goto L_0x0027;
                default: goto L_0x0026;
            }     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
        L_0x0026:
            goto L_0x0054
        L_0x0027:
            java.lang.String r8 = "constraintset"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x0054
            r4 = r7
            goto L_0x0054
        L_0x0031:
            r10 = move-exception
            goto L_0x01d5
        L_0x0034:
            r10 = move-exception
            goto L_0x01d9
        L_0x0037:
            java.lang.String r7 = "constraintoverride"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x0054
            r4 = r6
            goto L_0x0054
        L_0x0041:
            java.lang.String r7 = "constraint"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x0054
            r4 = r3
            goto L_0x0054
        L_0x004b:
            java.lang.String r7 = "guideline"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x0054
            r4 = r5
        L_0x0054:
            if (r4 == 0) goto L_0x006c
            if (r4 == r3) goto L_0x005e
            if (r4 == r6) goto L_0x005e
            if (r4 == r5) goto L_0x005e
            goto L_0x01cf
        L_0x005e:
            java.util.HashMap r0 = r9.f1807e     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            int r3 = r2.f1808a     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r2 = r1
            goto L_0x01cf
        L_0x006c:
            return
        L_0x006d:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            switch(r8) {
                case -2025855158: goto L_0x00d6;
                case -1984451626: goto L_0x00cc;
                case -1962203927: goto L_0x00c2;
                case -1269513683: goto L_0x00b8;
                case -1238332596: goto L_0x00ae;
                case -71750448: goto L_0x00a4;
                case 366511058: goto L_0x0099;
                case 1331510167: goto L_0x008f;
                case 1791837707: goto L_0x0084;
                case 1803088381: goto L_0x007a;
                default: goto L_0x0078;
            }     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
        L_0x0078:
            goto L_0x00df
        L_0x007a:
            java.lang.String r5 = "Constraint"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = r7
            goto L_0x00df
        L_0x0084:
            java.lang.String r5 = "CustomAttribute"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = 8
            goto L_0x00df
        L_0x008f:
            java.lang.String r6 = "Barrier"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = r5
            goto L_0x00df
        L_0x0099:
            java.lang.String r5 = "CustomMethod"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = 9
            goto L_0x00df
        L_0x00a4:
            java.lang.String r5 = "Guideline"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = r6
            goto L_0x00df
        L_0x00ae:
            java.lang.String r5 = "Transform"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = 5
            goto L_0x00df
        L_0x00b8:
            java.lang.String r5 = "PropertySet"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = 4
            goto L_0x00df
        L_0x00c2:
            java.lang.String r5 = "ConstraintOverride"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = r3
            goto L_0x00df
        L_0x00cc:
            java.lang.String r5 = "Motion"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = 7
            goto L_0x00df
        L_0x00d6:
            java.lang.String r5 = "Layout"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            if (r0 == 0) goto L_0x00df
            r4 = 6
        L_0x00df:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r4) {
                case 0: goto L_0x01c3;
                case 1: goto L_0x01ba;
                case 2: goto L_0x01ab;
                case 3: goto L_0x019e;
                case 4: goto L_0x0179;
                case 5: goto L_0x0154;
                case 6: goto L_0x012e;
                case 7: goto L_0x0108;
                case 8: goto L_0x00e6;
                case 9: goto L_0x00e6;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            goto L_0x01cf
        L_0x00e6:
            if (r2 == 0) goto L_0x00ef
            java.util.HashMap r0 = r2.f1814g     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            androidx.constraintlayout.widget.b.b(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x01cf
        L_0x00ef:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
        L_0x0108:
            if (r2 == 0) goto L_0x0115
            androidx.constraintlayout.widget.e$c r0 = r2.f1811d     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x01cf
        L_0x0115:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
        L_0x012e:
            if (r2 == 0) goto L_0x013b
            androidx.constraintlayout.widget.e$b r0 = r2.f1812e     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x01cf
        L_0x013b:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
        L_0x0154:
            if (r2 == 0) goto L_0x0160
            androidx.constraintlayout.widget.e$e r0 = r2.f1813f     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x01cf
        L_0x0160:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
        L_0x0179:
            if (r2 == 0) goto L_0x0185
            androidx.constraintlayout.widget.e$d r0 = r2.f1810c     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x01cf
        L_0x0185:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
        L_0x019e:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            androidx.constraintlayout.widget.e$a r2 = r9.i(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            androidx.constraintlayout.widget.e$b r0 = r2.f1812e     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r0.f1848j0 = r3     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x01cf
        L_0x01ab:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            androidx.constraintlayout.widget.e$a r2 = r9.i(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            androidx.constraintlayout.widget.e$b r0 = r2.f1812e     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r0.f1829a = r3     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            r0.f1831b = r3     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x01cf
        L_0x01ba:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            androidx.constraintlayout.widget.e$a r2 = r9.i(r10, r0, r3)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x01cf
        L_0x01c3:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            androidx.constraintlayout.widget.e$a r2 = r9.i(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x01cf
        L_0x01cc:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
        L_0x01cf:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x0031 }
            goto L_0x0006
        L_0x01d5:
            r10.printStackTrace()
            goto L_0x01dc
        L_0x01d9:
            r10.printStackTrace()
        L_0x01dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.l(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
