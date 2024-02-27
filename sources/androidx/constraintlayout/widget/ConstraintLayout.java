package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import s.d;
import s.e;
import s.f;
import s.h;
import t.b;

public class ConstraintLayout extends ViewGroup {
    private static j B;
    private int A = 0;

    /* renamed from: e  reason: collision with root package name */
    SparseArray f1674e = new SparseArray();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f1675f = new ArrayList(4);

    /* renamed from: g  reason: collision with root package name */
    protected f f1676g = new f();

    /* renamed from: h  reason: collision with root package name */
    private int f1677h = 0;

    /* renamed from: i  reason: collision with root package name */
    private int f1678i = 0;

    /* renamed from: j  reason: collision with root package name */
    private int f1679j = Integer.MAX_VALUE;

    /* renamed from: k  reason: collision with root package name */
    private int f1680k = Integer.MAX_VALUE;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f1681l = true;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f1682m = 257;

    /* renamed from: n  reason: collision with root package name */
    private e f1683n = null;

    /* renamed from: o  reason: collision with root package name */
    protected d f1684o = null;

    /* renamed from: p  reason: collision with root package name */
    private int f1685p = -1;

    /* renamed from: q  reason: collision with root package name */
    private HashMap f1686q = new HashMap();

    /* renamed from: r  reason: collision with root package name */
    private int f1687r = -1;

    /* renamed from: s  reason: collision with root package name */
    private int f1688s = -1;

    /* renamed from: t  reason: collision with root package name */
    int f1689t = -1;

    /* renamed from: u  reason: collision with root package name */
    int f1690u = -1;

    /* renamed from: v  reason: collision with root package name */
    int f1691v = 0;

    /* renamed from: w  reason: collision with root package name */
    int f1692w = 0;

    /* renamed from: x  reason: collision with root package name */
    private SparseArray f1693x = new SparseArray();

    /* renamed from: y  reason: collision with root package name */
    c f1694y = new c(this);

    /* renamed from: z  reason: collision with root package name */
    private int f1695z = 0;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1696a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                s.e$b[] r0 = s.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1696a = r0
                s.e$b r1 = s.e.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1696a     // Catch:{ NoSuchFieldError -> 0x001d }
                s.e$b r1 = s.e.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1696a     // Catch:{ NoSuchFieldError -> 0x0028 }
                s.e$b r1 = s.e.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1696a     // Catch:{ NoSuchFieldError -> 0x0033 }
                s.e$b r1 = s.e.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.<clinit>():void");
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A = Integer.MIN_VALUE;
        public int B = Integer.MIN_VALUE;
        public int C = Integer.MIN_VALUE;
        public int D = 0;
        boolean E = true;
        boolean F = true;
        public float G = 0.5f;
        public float H = 0.5f;
        public String I = null;
        float J = 0.0f;
        int K = 1;
        public float L = -1.0f;
        public float M = -1.0f;
        public int N = 0;
        public int O = 0;
        public int P = 0;
        public int Q = 0;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public float V = 1.0f;
        public float W = 1.0f;
        public int X = -1;
        public int Y = -1;
        public int Z = -1;

        /* renamed from: a  reason: collision with root package name */
        public int f1697a = -1;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f1698a0 = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1699b = -1;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f1700b0 = false;

        /* renamed from: c  reason: collision with root package name */
        public float f1701c = -1.0f;

        /* renamed from: c0  reason: collision with root package name */
        public String f1702c0 = null;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1703d = true;

        /* renamed from: d0  reason: collision with root package name */
        public int f1704d0 = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f1705e = -1;

        /* renamed from: e0  reason: collision with root package name */
        boolean f1706e0 = true;

        /* renamed from: f  reason: collision with root package name */
        public int f1707f = -1;

        /* renamed from: f0  reason: collision with root package name */
        boolean f1708f0 = true;

        /* renamed from: g  reason: collision with root package name */
        public int f1709g = -1;

        /* renamed from: g0  reason: collision with root package name */
        boolean f1710g0 = false;

        /* renamed from: h  reason: collision with root package name */
        public int f1711h = -1;

        /* renamed from: h0  reason: collision with root package name */
        boolean f1712h0 = false;

        /* renamed from: i  reason: collision with root package name */
        public int f1713i = -1;

        /* renamed from: i0  reason: collision with root package name */
        boolean f1714i0 = false;

        /* renamed from: j  reason: collision with root package name */
        public int f1715j = -1;

        /* renamed from: j0  reason: collision with root package name */
        boolean f1716j0 = false;

        /* renamed from: k  reason: collision with root package name */
        public int f1717k = -1;

        /* renamed from: k0  reason: collision with root package name */
        boolean f1718k0 = false;

        /* renamed from: l  reason: collision with root package name */
        public int f1719l = -1;

        /* renamed from: l0  reason: collision with root package name */
        int f1720l0 = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f1721m = -1;

        /* renamed from: m0  reason: collision with root package name */
        int f1722m0 = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f1723n = -1;

        /* renamed from: n0  reason: collision with root package name */
        int f1724n0 = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f1725o = -1;

        /* renamed from: o0  reason: collision with root package name */
        int f1726o0 = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f1727p = -1;

        /* renamed from: p0  reason: collision with root package name */
        int f1728p0 = Integer.MIN_VALUE;

        /* renamed from: q  reason: collision with root package name */
        public int f1729q = 0;

        /* renamed from: q0  reason: collision with root package name */
        int f1730q0 = Integer.MIN_VALUE;

        /* renamed from: r  reason: collision with root package name */
        public float f1731r = 0.0f;

        /* renamed from: r0  reason: collision with root package name */
        float f1732r0 = 0.5f;

        /* renamed from: s  reason: collision with root package name */
        public int f1733s = -1;

        /* renamed from: s0  reason: collision with root package name */
        int f1734s0;

        /* renamed from: t  reason: collision with root package name */
        public int f1735t = -1;

        /* renamed from: t0  reason: collision with root package name */
        int f1736t0;

        /* renamed from: u  reason: collision with root package name */
        public int f1737u = -1;

        /* renamed from: u0  reason: collision with root package name */
        float f1738u0;

        /* renamed from: v  reason: collision with root package name */
        public int f1739v = -1;

        /* renamed from: v0  reason: collision with root package name */
        e f1740v0 = new e();

        /* renamed from: w  reason: collision with root package name */
        public int f1741w = Integer.MIN_VALUE;

        /* renamed from: w0  reason: collision with root package name */
        public boolean f1742w0 = false;

        /* renamed from: x  reason: collision with root package name */
        public int f1743x = Integer.MIN_VALUE;

        /* renamed from: y  reason: collision with root package name */
        public int f1744y = Integer.MIN_VALUE;

        /* renamed from: z  reason: collision with root package name */
        public int f1745z = Integer.MIN_VALUE;

        private static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f1746a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1746a = sparseIntArray;
                sparseIntArray.append(i.R2, 64);
                sparseIntArray.append(i.f2091u2, 65);
                sparseIntArray.append(i.D2, 8);
                sparseIntArray.append(i.E2, 9);
                sparseIntArray.append(i.G2, 10);
                sparseIntArray.append(i.H2, 11);
                sparseIntArray.append(i.N2, 12);
                sparseIntArray.append(i.M2, 13);
                sparseIntArray.append(i.f2001k2, 14);
                sparseIntArray.append(i.f1992j2, 15);
                sparseIntArray.append(i.f1956f2, 16);
                sparseIntArray.append(i.f1974h2, 52);
                sparseIntArray.append(i.f1965g2, 53);
                sparseIntArray.append(i.f2010l2, 2);
                sparseIntArray.append(i.f2028n2, 3);
                sparseIntArray.append(i.f2019m2, 4);
                sparseIntArray.append(i.W2, 49);
                sparseIntArray.append(i.X2, 50);
                sparseIntArray.append(i.f2064r2, 5);
                sparseIntArray.append(i.f2073s2, 6);
                sparseIntArray.append(i.f2082t2, 7);
                sparseIntArray.append(i.f1911a2, 67);
                sparseIntArray.append(i.f2036o1, 1);
                sparseIntArray.append(i.I2, 17);
                sparseIntArray.append(i.J2, 18);
                sparseIntArray.append(i.f2055q2, 19);
                sparseIntArray.append(i.f2046p2, 20);
                sparseIntArray.append(i.f1921b3, 21);
                sparseIntArray.append(i.f1948e3, 22);
                sparseIntArray.append(i.f1930c3, 23);
                sparseIntArray.append(i.Z2, 24);
                sparseIntArray.append(i.f1939d3, 25);
                sparseIntArray.append(i.f1912a3, 26);
                sparseIntArray.append(i.Y2, 55);
                sparseIntArray.append(i.f1957f3, 54);
                sparseIntArray.append(i.f2136z2, 29);
                sparseIntArray.append(i.O2, 30);
                sparseIntArray.append(i.f2037o2, 44);
                sparseIntArray.append(i.B2, 45);
                sparseIntArray.append(i.Q2, 46);
                sparseIntArray.append(i.A2, 47);
                sparseIntArray.append(i.P2, 48);
                sparseIntArray.append(i.f1938d2, 27);
                sparseIntArray.append(i.f1929c2, 28);
                sparseIntArray.append(i.S2, 31);
                sparseIntArray.append(i.f2100v2, 32);
                sparseIntArray.append(i.U2, 33);
                sparseIntArray.append(i.T2, 34);
                sparseIntArray.append(i.V2, 35);
                sparseIntArray.append(i.f2118x2, 36);
                sparseIntArray.append(i.f2109w2, 37);
                sparseIntArray.append(i.f2127y2, 38);
                sparseIntArray.append(i.C2, 39);
                sparseIntArray.append(i.L2, 40);
                sparseIntArray.append(i.F2, 41);
                sparseIntArray.append(i.f1983i2, 42);
                sparseIntArray.append(i.f1947e2, 43);
                sparseIntArray.append(i.K2, 51);
                sparseIntArray.append(i.f1975h3, 66);
            }
        }

        public b(int i10, int i11) {
            super(i10, i11);
        }

        public void a() {
            this.f1712h0 = false;
            this.f1706e0 = true;
            this.f1708f0 = true;
            int i10 = this.width;
            if (i10 == -2 && this.f1698a0) {
                this.f1706e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i11 = this.height;
            if (i11 == -2 && this.f1700b0) {
                this.f1708f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f1706e0 = false;
                if (i10 == 0 && this.P == 1) {
                    this.width = -2;
                    this.f1698a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f1708f0 = false;
                if (i11 == 0 && this.Q == 1) {
                    this.height = -2;
                    this.f1700b0 = true;
                }
            }
            if (this.f1701c != -1.0f || this.f1697a != -1 || this.f1699b != -1) {
                this.f1712h0 = true;
                this.f1706e0 = true;
                this.f1708f0 = true;
                if (!(this.f1740v0 instanceof h)) {
                    this.f1740v0 = new h();
                }
                ((h) this.f1740v0).A1(this.Z);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d0, code lost:
            if (r1 > 0) goto L_0x00d2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x00df, code lost:
            if (r1 > 0) goto L_0x00d2;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x00f1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = r3
                goto L_0x0012
            L_0x0011:
                r11 = r2
            L_0x0012:
                r4 = -1
                r10.f1724n0 = r4
                r10.f1726o0 = r4
                r10.f1720l0 = r4
                r10.f1722m0 = r4
                int r5 = r10.f1741w
                r10.f1728p0 = r5
                int r5 = r10.f1744y
                r10.f1730q0 = r5
                float r5 = r10.G
                r10.f1732r0 = r5
                int r6 = r10.f1697a
                r10.f1734s0 = r6
                int r7 = r10.f1699b
                r10.f1736t0 = r7
                float r8 = r10.f1701c
                r10.f1738u0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0092
                int r11 = r10.f1733s
                if (r11 == r4) goto L_0x003f
                r10.f1724n0 = r11
            L_0x003d:
                r2 = r3
                goto L_0x0046
            L_0x003f:
                int r11 = r10.f1735t
                if (r11 == r4) goto L_0x0046
                r10.f1726o0 = r11
                goto L_0x003d
            L_0x0046:
                int r11 = r10.f1737u
                if (r11 == r4) goto L_0x004d
                r10.f1722m0 = r11
                r2 = r3
            L_0x004d:
                int r11 = r10.f1739v
                if (r11 == r4) goto L_0x0054
                r10.f1720l0 = r11
                r2 = r3
            L_0x0054:
                int r11 = r10.A
                if (r11 == r9) goto L_0x005a
                r10.f1730q0 = r11
            L_0x005a:
                int r11 = r10.B
                if (r11 == r9) goto L_0x0060
                r10.f1728p0 = r11
            L_0x0060:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0068
                float r2 = r11 - r5
                r10.f1732r0 = r2
            L_0x0068:
                boolean r2 = r10.f1712h0
                if (r2 == 0) goto L_0x00b6
                int r2 = r10.Z
                if (r2 != r3) goto L_0x00b6
                boolean r2 = r10.f1703d
                if (r2 == 0) goto L_0x00b6
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0082
                float r11 = r11 - r8
                r10.f1738u0 = r11
                r10.f1734s0 = r4
                r10.f1736t0 = r4
                goto L_0x00b6
            L_0x0082:
                if (r6 == r4) goto L_0x008b
                r10.f1736t0 = r6
                r10.f1734s0 = r4
            L_0x0088:
                r10.f1738u0 = r2
                goto L_0x00b6
            L_0x008b:
                if (r7 == r4) goto L_0x00b6
                r10.f1734s0 = r7
                r10.f1736t0 = r4
                goto L_0x0088
            L_0x0092:
                int r11 = r10.f1733s
                if (r11 == r4) goto L_0x0098
                r10.f1722m0 = r11
            L_0x0098:
                int r11 = r10.f1735t
                if (r11 == r4) goto L_0x009e
                r10.f1720l0 = r11
            L_0x009e:
                int r11 = r10.f1737u
                if (r11 == r4) goto L_0x00a4
                r10.f1724n0 = r11
            L_0x00a4:
                int r11 = r10.f1739v
                if (r11 == r4) goto L_0x00aa
                r10.f1726o0 = r11
            L_0x00aa:
                int r11 = r10.A
                if (r11 == r9) goto L_0x00b0
                r10.f1728p0 = r11
            L_0x00b0:
                int r11 = r10.B
                if (r11 == r9) goto L_0x00b6
                r10.f1730q0 = r11
            L_0x00b6:
                int r11 = r10.f1737u
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f1739v
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f1735t
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f1733s
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f1709g
                if (r11 == r4) goto L_0x00d5
                r10.f1724n0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e2
                if (r1 <= 0) goto L_0x00e2
            L_0x00d2:
                r10.rightMargin = r1
                goto L_0x00e2
            L_0x00d5:
                int r11 = r10.f1711h
                if (r11 == r4) goto L_0x00e2
                r10.f1726o0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e2
                if (r1 <= 0) goto L_0x00e2
                goto L_0x00d2
            L_0x00e2:
                int r11 = r10.f1705e
                if (r11 == r4) goto L_0x00f1
                r10.f1720l0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x00fe
                if (r0 <= 0) goto L_0x00fe
            L_0x00ee:
                r10.leftMargin = r0
                goto L_0x00fe
            L_0x00f1:
                int r11 = r10.f1707f
                if (r11 == r4) goto L_0x00fe
                r10.f1722m0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x00fe
                if (r0 <= 0) goto L_0x00fe
                goto L_0x00ee
            L_0x00fe:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x01f0, code lost:
            android.util.Log.e("ConstraintLayout", r5);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(android.content.Context r11, android.util.AttributeSet r12) {
            /*
                r10 = this;
                r10.<init>(r11, r12)
                r0 = -1
                r10.f1697a = r0
                r10.f1699b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r10.f1701c = r1
                r2 = 1
                r10.f1703d = r2
                r10.f1705e = r0
                r10.f1707f = r0
                r10.f1709g = r0
                r10.f1711h = r0
                r10.f1713i = r0
                r10.f1715j = r0
                r10.f1717k = r0
                r10.f1719l = r0
                r10.f1721m = r0
                r10.f1723n = r0
                r10.f1725o = r0
                r10.f1727p = r0
                r3 = 0
                r10.f1729q = r3
                r4 = 0
                r10.f1731r = r4
                r10.f1733s = r0
                r10.f1735t = r0
                r10.f1737u = r0
                r10.f1739v = r0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r10.f1741w = r5
                r10.f1743x = r5
                r10.f1744y = r5
                r10.f1745z = r5
                r10.A = r5
                r10.B = r5
                r10.C = r5
                r10.D = r3
                r10.E = r2
                r10.F = r2
                r6 = 1056964608(0x3f000000, float:0.5)
                r10.G = r6
                r10.H = r6
                r7 = 0
                r10.I = r7
                r10.J = r4
                r10.K = r2
                r10.L = r1
                r10.M = r1
                r10.N = r3
                r10.O = r3
                r10.P = r3
                r10.Q = r3
                r10.R = r3
                r10.S = r3
                r10.T = r3
                r10.U = r3
                r1 = 1065353216(0x3f800000, float:1.0)
                r10.V = r1
                r10.W = r1
                r10.X = r0
                r10.Y = r0
                r10.Z = r0
                r10.f1698a0 = r3
                r10.f1700b0 = r3
                r10.f1702c0 = r7
                r10.f1704d0 = r3
                r10.f1706e0 = r2
                r10.f1708f0 = r2
                r10.f1710g0 = r3
                r10.f1712h0 = r3
                r10.f1714i0 = r3
                r10.f1716j0 = r3
                r10.f1718k0 = r3
                r10.f1720l0 = r0
                r10.f1722m0 = r0
                r10.f1724n0 = r0
                r10.f1726o0 = r0
                r10.f1728p0 = r5
                r10.f1730q0 = r5
                r10.f1732r0 = r6
                s.e r1 = new s.e
                r1.<init>()
                r10.f1740v0 = r1
                r10.f1742w0 = r3
                int[] r1 = androidx.constraintlayout.widget.i.f2027n1
                android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r1)
                int r12 = r11.getIndexCount()
                r1 = r3
            L_0x00b0:
                if (r1 >= r12) goto L_0x03a2
                int r5 = r11.getIndex(r1)
                android.util.SparseIntArray r6 = androidx.constraintlayout.widget.ConstraintLayout.b.a.f1746a
                int r6 = r6.get(r5)
                java.lang.String r7 = "ConstraintLayout"
                r8 = 2
                r9 = -2
                switch(r6) {
                    case 1: goto L_0x0396;
                    case 2: goto L_0x0385;
                    case 3: goto L_0x037c;
                    case 4: goto L_0x0367;
                    case 5: goto L_0x035e;
                    case 6: goto L_0x0355;
                    case 7: goto L_0x034c;
                    case 8: goto L_0x033b;
                    case 9: goto L_0x032a;
                    case 10: goto L_0x0318;
                    case 11: goto L_0x0306;
                    case 12: goto L_0x02f4;
                    case 13: goto L_0x02e2;
                    case 14: goto L_0x02d0;
                    case 15: goto L_0x02be;
                    case 16: goto L_0x02ac;
                    case 17: goto L_0x029a;
                    case 18: goto L_0x0288;
                    case 19: goto L_0x0276;
                    case 20: goto L_0x0264;
                    case 21: goto L_0x025a;
                    case 22: goto L_0x0250;
                    case 23: goto L_0x0246;
                    case 24: goto L_0x023c;
                    case 25: goto L_0x0232;
                    case 26: goto L_0x0228;
                    case 27: goto L_0x021e;
                    case 28: goto L_0x0214;
                    case 29: goto L_0x020a;
                    case 30: goto L_0x0200;
                    case 31: goto L_0x01f5;
                    case 32: goto L_0x01e6;
                    case 33: goto L_0x01d0;
                    case 34: goto L_0x01ba;
                    case 35: goto L_0x01aa;
                    case 36: goto L_0x0194;
                    case 37: goto L_0x017e;
                    case 38: goto L_0x016e;
                    default: goto L_0x00c3;
                }
            L_0x00c3:
                switch(r6) {
                    case 44: goto L_0x0165;
                    case 45: goto L_0x015b;
                    case 46: goto L_0x0151;
                    case 47: goto L_0x0149;
                    case 48: goto L_0x0141;
                    case 49: goto L_0x0137;
                    case 50: goto L_0x012d;
                    case 51: goto L_0x0125;
                    case 52: goto L_0x0113;
                    case 53: goto L_0x0101;
                    case 54: goto L_0x00f7;
                    case 55: goto L_0x00ed;
                    default: goto L_0x00c6;
                }
            L_0x00c6:
                switch(r6) {
                    case 64: goto L_0x00e6;
                    case 65: goto L_0x00df;
                    case 66: goto L_0x00d5;
                    case 67: goto L_0x00cb;
                    default: goto L_0x00c9;
                }
            L_0x00c9:
                goto L_0x039e
            L_0x00cb:
                boolean r6 = r10.f1703d
                boolean r5 = r11.getBoolean(r5, r6)
                r10.f1703d = r5
                goto L_0x039e
            L_0x00d5:
                int r6 = r10.f1704d0
                int r5 = r11.getInt(r5, r6)
                r10.f1704d0 = r5
                goto L_0x039e
            L_0x00df:
                androidx.constraintlayout.widget.e.n(r10, r11, r5, r2)
                r10.F = r2
                goto L_0x039e
            L_0x00e6:
                androidx.constraintlayout.widget.e.n(r10, r11, r5, r3)
                r10.E = r2
                goto L_0x039e
            L_0x00ed:
                int r6 = r10.C
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.C = r5
                goto L_0x039e
            L_0x00f7:
                int r6 = r10.D
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.D = r5
                goto L_0x039e
            L_0x0101:
                int r6 = r10.f1725o
                int r6 = r11.getResourceId(r5, r6)
                r10.f1725o = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1725o = r5
                goto L_0x039e
            L_0x0113:
                int r6 = r10.f1723n
                int r6 = r11.getResourceId(r5, r6)
                r10.f1723n = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1723n = r5
                goto L_0x039e
            L_0x0125:
                java.lang.String r5 = r11.getString(r5)
                r10.f1702c0 = r5
                goto L_0x039e
            L_0x012d:
                int r6 = r10.Y
                int r5 = r11.getDimensionPixelOffset(r5, r6)
                r10.Y = r5
                goto L_0x039e
            L_0x0137:
                int r6 = r10.X
                int r5 = r11.getDimensionPixelOffset(r5, r6)
                r10.X = r5
                goto L_0x039e
            L_0x0141:
                int r5 = r11.getInt(r5, r3)
                r10.O = r5
                goto L_0x039e
            L_0x0149:
                int r5 = r11.getInt(r5, r3)
                r10.N = r5
                goto L_0x039e
            L_0x0151:
                float r6 = r10.M
                float r5 = r11.getFloat(r5, r6)
                r10.M = r5
                goto L_0x039e
            L_0x015b:
                float r6 = r10.L
                float r5 = r11.getFloat(r5, r6)
                r10.L = r5
                goto L_0x039e
            L_0x0165:
                java.lang.String r5 = r11.getString(r5)
                androidx.constraintlayout.widget.e.p(r10, r5)
                goto L_0x039e
            L_0x016e:
                float r6 = r10.W
                float r5 = r11.getFloat(r5, r6)
                float r5 = java.lang.Math.max(r4, r5)
                r10.W = r5
                r10.Q = r8
                goto L_0x039e
            L_0x017e:
                int r6 = r10.U     // Catch:{ Exception -> 0x0188 }
                int r6 = r11.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x0188 }
                r10.U = r6     // Catch:{ Exception -> 0x0188 }
                goto L_0x039e
            L_0x0188:
                int r6 = r10.U
                int r5 = r11.getInt(r5, r6)
                if (r5 != r9) goto L_0x039e
                r10.U = r9
                goto L_0x039e
            L_0x0194:
                int r6 = r10.S     // Catch:{ Exception -> 0x019e }
                int r6 = r11.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x019e }
                r10.S = r6     // Catch:{ Exception -> 0x019e }
                goto L_0x039e
            L_0x019e:
                int r6 = r10.S
                int r5 = r11.getInt(r5, r6)
                if (r5 != r9) goto L_0x039e
                r10.S = r9
                goto L_0x039e
            L_0x01aa:
                float r6 = r10.V
                float r5 = r11.getFloat(r5, r6)
                float r5 = java.lang.Math.max(r4, r5)
                r10.V = r5
                r10.P = r8
                goto L_0x039e
            L_0x01ba:
                int r6 = r10.T     // Catch:{ Exception -> 0x01c4 }
                int r6 = r11.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x01c4 }
                r10.T = r6     // Catch:{ Exception -> 0x01c4 }
                goto L_0x039e
            L_0x01c4:
                int r6 = r10.T
                int r5 = r11.getInt(r5, r6)
                if (r5 != r9) goto L_0x039e
                r10.T = r9
                goto L_0x039e
            L_0x01d0:
                int r6 = r10.R     // Catch:{ Exception -> 0x01da }
                int r6 = r11.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x01da }
                r10.R = r6     // Catch:{ Exception -> 0x01da }
                goto L_0x039e
            L_0x01da:
                int r6 = r10.R
                int r5 = r11.getInt(r5, r6)
                if (r5 != r9) goto L_0x039e
                r10.R = r9
                goto L_0x039e
            L_0x01e6:
                int r5 = r11.getInt(r5, r3)
                r10.Q = r5
                if (r5 != r2) goto L_0x039e
                java.lang.String r5 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
            L_0x01f0:
                android.util.Log.e(r7, r5)
                goto L_0x039e
            L_0x01f5:
                int r5 = r11.getInt(r5, r3)
                r10.P = r5
                if (r5 != r2) goto L_0x039e
                java.lang.String r5 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
                goto L_0x01f0
            L_0x0200:
                float r6 = r10.H
                float r5 = r11.getFloat(r5, r6)
                r10.H = r5
                goto L_0x039e
            L_0x020a:
                float r6 = r10.G
                float r5 = r11.getFloat(r5, r6)
                r10.G = r5
                goto L_0x039e
            L_0x0214:
                boolean r6 = r10.f1700b0
                boolean r5 = r11.getBoolean(r5, r6)
                r10.f1700b0 = r5
                goto L_0x039e
            L_0x021e:
                boolean r6 = r10.f1698a0
                boolean r5 = r11.getBoolean(r5, r6)
                r10.f1698a0 = r5
                goto L_0x039e
            L_0x0228:
                int r6 = r10.B
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.B = r5
                goto L_0x039e
            L_0x0232:
                int r6 = r10.A
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.A = r5
                goto L_0x039e
            L_0x023c:
                int r6 = r10.f1745z
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f1745z = r5
                goto L_0x039e
            L_0x0246:
                int r6 = r10.f1744y
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f1744y = r5
                goto L_0x039e
            L_0x0250:
                int r6 = r10.f1743x
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f1743x = r5
                goto L_0x039e
            L_0x025a:
                int r6 = r10.f1741w
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f1741w = r5
                goto L_0x039e
            L_0x0264:
                int r6 = r10.f1739v
                int r6 = r11.getResourceId(r5, r6)
                r10.f1739v = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1739v = r5
                goto L_0x039e
            L_0x0276:
                int r6 = r10.f1737u
                int r6 = r11.getResourceId(r5, r6)
                r10.f1737u = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1737u = r5
                goto L_0x039e
            L_0x0288:
                int r6 = r10.f1735t
                int r6 = r11.getResourceId(r5, r6)
                r10.f1735t = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1735t = r5
                goto L_0x039e
            L_0x029a:
                int r6 = r10.f1733s
                int r6 = r11.getResourceId(r5, r6)
                r10.f1733s = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1733s = r5
                goto L_0x039e
            L_0x02ac:
                int r6 = r10.f1721m
                int r6 = r11.getResourceId(r5, r6)
                r10.f1721m = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1721m = r5
                goto L_0x039e
            L_0x02be:
                int r6 = r10.f1719l
                int r6 = r11.getResourceId(r5, r6)
                r10.f1719l = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1719l = r5
                goto L_0x039e
            L_0x02d0:
                int r6 = r10.f1717k
                int r6 = r11.getResourceId(r5, r6)
                r10.f1717k = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1717k = r5
                goto L_0x039e
            L_0x02e2:
                int r6 = r10.f1715j
                int r6 = r11.getResourceId(r5, r6)
                r10.f1715j = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1715j = r5
                goto L_0x039e
            L_0x02f4:
                int r6 = r10.f1713i
                int r6 = r11.getResourceId(r5, r6)
                r10.f1713i = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1713i = r5
                goto L_0x039e
            L_0x0306:
                int r6 = r10.f1711h
                int r6 = r11.getResourceId(r5, r6)
                r10.f1711h = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1711h = r5
                goto L_0x039e
            L_0x0318:
                int r6 = r10.f1709g
                int r6 = r11.getResourceId(r5, r6)
                r10.f1709g = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1709g = r5
                goto L_0x039e
            L_0x032a:
                int r6 = r10.f1707f
                int r6 = r11.getResourceId(r5, r6)
                r10.f1707f = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1707f = r5
                goto L_0x039e
            L_0x033b:
                int r6 = r10.f1705e
                int r6 = r11.getResourceId(r5, r6)
                r10.f1705e = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1705e = r5
                goto L_0x039e
            L_0x034c:
                float r6 = r10.f1701c
                float r5 = r11.getFloat(r5, r6)
                r10.f1701c = r5
                goto L_0x039e
            L_0x0355:
                int r6 = r10.f1699b
                int r5 = r11.getDimensionPixelOffset(r5, r6)
                r10.f1699b = r5
                goto L_0x039e
            L_0x035e:
                int r6 = r10.f1697a
                int r5 = r11.getDimensionPixelOffset(r5, r6)
                r10.f1697a = r5
                goto L_0x039e
            L_0x0367:
                float r6 = r10.f1731r
                float r5 = r11.getFloat(r5, r6)
                r6 = 1135869952(0x43b40000, float:360.0)
                float r5 = r5 % r6
                r10.f1731r = r5
                int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r7 >= 0) goto L_0x039e
                float r5 = r6 - r5
                float r5 = r5 % r6
                r10.f1731r = r5
                goto L_0x039e
            L_0x037c:
                int r6 = r10.f1729q
                int r5 = r11.getDimensionPixelSize(r5, r6)
                r10.f1729q = r5
                goto L_0x039e
            L_0x0385:
                int r6 = r10.f1727p
                int r6 = r11.getResourceId(r5, r6)
                r10.f1727p = r6
                if (r6 != r0) goto L_0x039e
                int r5 = r11.getInt(r5, r0)
                r10.f1727p = r5
                goto L_0x039e
            L_0x0396:
                int r6 = r10.Z
                int r5 = r11.getInt(r5, r6)
                r10.Z = r5
            L_0x039e:
                int r1 = r1 + 1
                goto L_0x00b0
            L_0x03a2:
                r11.recycle()
                r10.a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    class c implements b.C0215b {

        /* renamed from: a  reason: collision with root package name */
        ConstraintLayout f1747a;

        /* renamed from: b  reason: collision with root package name */
        int f1748b;

        /* renamed from: c  reason: collision with root package name */
        int f1749c;

        /* renamed from: d  reason: collision with root package name */
        int f1750d;

        /* renamed from: e  reason: collision with root package name */
        int f1751e;

        /* renamed from: f  reason: collision with root package name */
        int f1752f;

        /* renamed from: g  reason: collision with root package name */
        int f1753g;

        public c(ConstraintLayout constraintLayout) {
            this.f1747a = constraintLayout;
        }

        private boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }

        public final void a() {
            int childCount = this.f1747a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f1747a.getChildAt(i10);
            }
            int size = this.f1747a.f1675f.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((c) this.f1747a.f1675f.get(i11)).l(this.f1747a);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x017b  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x018e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(s.e r18, t.b.a r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r18.V()
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001f
                boolean r3 = r18.j0()
                if (r3 != 0) goto L_0x001f
                r2.f16149e = r5
                r2.f16150f = r5
                r2.f16151g = r5
                return
            L_0x001f:
                s.e r3 = r18.K()
                if (r3 != 0) goto L_0x0026
                return
            L_0x0026:
                s.e$b r3 = r2.f16145a
                s.e$b r4 = r2.f16146b
                int r6 = r2.f16147c
                int r7 = r2.f16148d
                int r8 = r0.f1748b
                int r9 = r0.f1749c
                int r8 = r8 + r9
                int r9 = r0.f1750d
                java.lang.Object r10 = r18.s()
                android.view.View r10 = (android.view.View) r10
                int[] r11 = androidx.constraintlayout.widget.ConstraintLayout.a.f1696a
                int r12 = r3.ordinal()
                r12 = r11[r12]
                r13 = 4
                r14 = 3
                r15 = 2
                r5 = 1
                if (r12 == r5) goto L_0x008c
                if (r12 == r15) goto L_0x00a2
                if (r12 == r14) goto L_0x0093
                if (r12 == r13) goto L_0x0051
                r6 = 0
                goto L_0x00a8
            L_0x0051:
                int r6 = r0.f1752f
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int r9 = r1.f15723w
                if (r9 != r5) goto L_0x005e
                r9 = r5
                goto L_0x005f
            L_0x005e:
                r9 = 0
            L_0x005f:
                int r12 = r2.f16154j
                int r13 = t.b.a.f16143l
                if (r12 == r13) goto L_0x0069
                int r13 = t.b.a.f16144m
                if (r12 != r13) goto L_0x00a8
            L_0x0069:
                int r12 = r10.getMeasuredHeight()
                int r13 = r18.x()
                if (r12 != r13) goto L_0x0075
                r12 = r5
                goto L_0x0076
            L_0x0075:
                r12 = 0
            L_0x0076:
                int r13 = r2.f16154j
                int r14 = t.b.a.f16144m
                if (r13 == r14) goto L_0x0088
                if (r9 == 0) goto L_0x0088
                if (r9 == 0) goto L_0x0082
                if (r12 != 0) goto L_0x0088
            L_0x0082:
                boolean r9 = r18.n0()
                if (r9 == 0) goto L_0x00a8
            L_0x0088:
                int r6 = r18.W()
            L_0x008c:
                r12 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r12)
                goto L_0x00a8
            L_0x0093:
                r12 = 1073741824(0x40000000, float:2.0)
                int r6 = r0.f1752f
                int r13 = r18.B()
                int r9 = r9 + r13
                r13 = -1
            L_0x009d:
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r13)
                goto L_0x00a8
            L_0x00a2:
                r12 = 1073741824(0x40000000, float:2.0)
                int r6 = r0.f1752f
                r13 = -2
                goto L_0x009d
            L_0x00a8:
                int r9 = r4.ordinal()
                r9 = r11[r9]
                if (r9 == r5) goto L_0x00f5
                if (r9 == r15) goto L_0x010b
                r7 = 3
                if (r9 == r7) goto L_0x00fc
                r7 = 4
                if (r9 == r7) goto L_0x00ba
                r7 = 0
                goto L_0x0111
            L_0x00ba:
                int r7 = r0.f1753g
                r9 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
                int r8 = r1.f15725x
                if (r8 != r5) goto L_0x00c7
                r8 = r5
                goto L_0x00c8
            L_0x00c7:
                r8 = 0
            L_0x00c8:
                int r9 = r2.f16154j
                int r11 = t.b.a.f16143l
                if (r9 == r11) goto L_0x00d2
                int r11 = t.b.a.f16144m
                if (r9 != r11) goto L_0x0111
            L_0x00d2:
                int r9 = r10.getMeasuredWidth()
                int r11 = r18.W()
                if (r9 != r11) goto L_0x00de
                r9 = r5
                goto L_0x00df
            L_0x00de:
                r9 = 0
            L_0x00df:
                int r11 = r2.f16154j
                int r12 = t.b.a.f16144m
                if (r11 == r12) goto L_0x00f1
                if (r8 == 0) goto L_0x00f1
                if (r8 == 0) goto L_0x00eb
                if (r9 != 0) goto L_0x00f1
            L_0x00eb:
                boolean r8 = r18.o0()
                if (r8 == 0) goto L_0x0111
            L_0x00f1:
                int r7 = r18.x()
            L_0x00f5:
                r9 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
                goto L_0x0111
            L_0x00fc:
                r9 = 1073741824(0x40000000, float:2.0)
                int r7 = r0.f1753g
                int r11 = r18.U()
                int r8 = r8 + r11
                r11 = -1
            L_0x0106:
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r11)
                goto L_0x0111
            L_0x010b:
                r9 = 1073741824(0x40000000, float:2.0)
                int r7 = r0.f1753g
                r11 = -2
                goto L_0x0106
            L_0x0111:
                s.e r8 = r18.K()
                s.f r8 = (s.f) r8
                if (r8 == 0) goto L_0x018e
                androidx.constraintlayout.widget.ConstraintLayout r9 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r9 = r9.f1682m
                r11 = 256(0x100, float:3.59E-43)
                boolean r9 = s.k.b(r9, r11)
                if (r9 == 0) goto L_0x018e
                int r9 = r10.getMeasuredWidth()
                int r11 = r18.W()
                if (r9 != r11) goto L_0x018e
                int r9 = r10.getMeasuredWidth()
                int r11 = r8.W()
                if (r9 >= r11) goto L_0x018e
                int r9 = r10.getMeasuredHeight()
                int r11 = r18.x()
                if (r9 != r11) goto L_0x018e
                int r9 = r10.getMeasuredHeight()
                int r8 = r8.x()
                if (r9 >= r8) goto L_0x018e
                int r8 = r10.getBaseline()
                int r9 = r18.p()
                if (r8 != r9) goto L_0x018e
                boolean r8 = r18.m0()
                if (r8 != 0) goto L_0x018e
                int r8 = r18.C()
                int r9 = r18.W()
                boolean r8 = r0.d(r8, r6, r9)
                if (r8 == 0) goto L_0x018e
                int r8 = r18.D()
                int r9 = r18.x()
                boolean r8 = r0.d(r8, r7, r9)
                if (r8 == 0) goto L_0x018e
                int r3 = r18.W()
                r2.f16149e = r3
                int r3 = r18.x()
                r2.f16150f = r3
                int r1 = r18.p()
                r2.f16151g = r1
                return
            L_0x018e:
                s.e$b r8 = s.e.b.MATCH_CONSTRAINT
                if (r3 != r8) goto L_0x0194
                r9 = r5
                goto L_0x0195
            L_0x0194:
                r9 = 0
            L_0x0195:
                if (r4 != r8) goto L_0x0199
                r8 = r5
                goto L_0x019a
            L_0x0199:
                r8 = 0
            L_0x019a:
                s.e$b r11 = s.e.b.MATCH_PARENT
                if (r4 == r11) goto L_0x01a5
                s.e$b r12 = s.e.b.FIXED
                if (r4 != r12) goto L_0x01a3
                goto L_0x01a5
            L_0x01a3:
                r4 = 0
                goto L_0x01a6
            L_0x01a5:
                r4 = r5
            L_0x01a6:
                if (r3 == r11) goto L_0x01af
                s.e$b r11 = s.e.b.FIXED
                if (r3 != r11) goto L_0x01ad
                goto L_0x01af
            L_0x01ad:
                r3 = 0
                goto L_0x01b0
            L_0x01af:
                r3 = r5
            L_0x01b0:
                r11 = 0
                if (r9 == 0) goto L_0x01bb
                float r12 = r1.f15686d0
                int r12 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
                if (r12 <= 0) goto L_0x01bb
                r12 = r5
                goto L_0x01bc
            L_0x01bb:
                r12 = 0
            L_0x01bc:
                if (r8 == 0) goto L_0x01c6
                float r13 = r1.f15686d0
                int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r11 <= 0) goto L_0x01c6
                r11 = r5
                goto L_0x01c7
            L_0x01c6:
                r11 = 0
            L_0x01c7:
                if (r10 != 0) goto L_0x01ca
                return
            L_0x01ca:
                android.view.ViewGroup$LayoutParams r13 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$b r13 = (androidx.constraintlayout.widget.ConstraintLayout.b) r13
                int r14 = r2.f16154j
                int r15 = t.b.a.f16143l
                if (r14 == r15) goto L_0x01ed
                int r15 = t.b.a.f16144m
                if (r14 == r15) goto L_0x01ed
                if (r9 == 0) goto L_0x01ed
                int r9 = r1.f15723w
                if (r9 != 0) goto L_0x01ed
                if (r8 == 0) goto L_0x01ed
                int r8 = r1.f15725x
                if (r8 == 0) goto L_0x01e7
                goto L_0x01ed
            L_0x01e7:
                r0 = -1
                r5 = 0
                r14 = 0
                r15 = 0
                goto L_0x0288
            L_0x01ed:
                boolean r8 = r10 instanceof androidx.constraintlayout.widget.k
                if (r8 == 0) goto L_0x01ff
                boolean r8 = r1 instanceof s.l
                if (r8 == 0) goto L_0x01ff
                r8 = r1
                s.l r8 = (s.l) r8
                r9 = r10
                androidx.constraintlayout.widget.k r9 = (androidx.constraintlayout.widget.k) r9
                r9.p(r8, r6, r7)
                goto L_0x0202
            L_0x01ff:
                r10.measure(r6, r7)
            L_0x0202:
                r1.V0(r6, r7)
                int r8 = r10.getMeasuredWidth()
                int r9 = r10.getMeasuredHeight()
                int r14 = r10.getBaseline()
                int r15 = r1.f15729z
                if (r15 <= 0) goto L_0x021a
                int r15 = java.lang.Math.max(r15, r8)
                goto L_0x021b
            L_0x021a:
                r15 = r8
            L_0x021b:
                int r5 = r1.A
                if (r5 <= 0) goto L_0x0223
                int r15 = java.lang.Math.min(r5, r15)
            L_0x0223:
                int r5 = r1.C
                if (r5 <= 0) goto L_0x022e
                int r5 = java.lang.Math.max(r5, r9)
                r16 = r6
                goto L_0x0231
            L_0x022e:
                r16 = r6
                r5 = r9
            L_0x0231:
                int r6 = r1.D
                if (r6 <= 0) goto L_0x0239
                int r5 = java.lang.Math.min(r6, r5)
            L_0x0239:
                androidx.constraintlayout.widget.ConstraintLayout r6 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r6 = r6.f1682m
                r0 = 1
                boolean r6 = s.k.b(r6, r0)
                if (r6 != 0) goto L_0x025d
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r12 == 0) goto L_0x0253
                if (r4 == 0) goto L_0x0253
                float r3 = r1.f15686d0
                float r4 = (float) r5
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r15 = (int) r4
                goto L_0x025d
            L_0x0253:
                if (r11 == 0) goto L_0x025d
                if (r3 == 0) goto L_0x025d
                float r3 = r1.f15686d0
                float r4 = (float) r15
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r5 = (int) r4
            L_0x025d:
                if (r8 != r15) goto L_0x0264
                if (r9 == r5) goto L_0x0262
                goto L_0x0264
            L_0x0262:
                r0 = -1
                goto L_0x0288
            L_0x0264:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r8 == r15) goto L_0x026d
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
                goto L_0x026f
            L_0x026d:
                r6 = r16
            L_0x026f:
                if (r9 == r5) goto L_0x0275
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            L_0x0275:
                r10.measure(r6, r7)
                r1.V0(r6, r7)
                int r15 = r10.getMeasuredWidth()
                int r5 = r10.getMeasuredHeight()
                int r14 = r10.getBaseline()
                goto L_0x0262
            L_0x0288:
                if (r14 == r0) goto L_0x028c
                r0 = 1
                goto L_0x028d
            L_0x028c:
                r0 = 0
            L_0x028d:
                int r3 = r2.f16147c
                if (r15 != r3) goto L_0x0298
                int r3 = r2.f16148d
                if (r5 == r3) goto L_0x0296
                goto L_0x0298
            L_0x0296:
                r3 = 0
                goto L_0x0299
            L_0x0298:
                r3 = 1
            L_0x0299:
                r2.f16153i = r3
                boolean r3 = r13.f1710g0
                if (r3 == 0) goto L_0x02a0
                r0 = 1
            L_0x02a0:
                if (r0 == 0) goto L_0x02ae
                r3 = -1
                if (r14 == r3) goto L_0x02ae
                int r1 = r18.p()
                if (r1 == r14) goto L_0x02ae
                r1 = 1
                r2.f16153i = r1
            L_0x02ae:
                r2.f16149e = r15
                r2.f16150f = r5
                r2.f16152h = r0
                r2.f16151g = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c.b(s.e, t.b$a):void");
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f1748b = i12;
            this.f1749c = i13;
            this.f1750d = i14;
            this.f1751e = i15;
            this.f1752f = i10;
            this.f1753g = i11;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q(attributeSet, 0, 0);
    }

    private boolean A() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            w();
        }
        return z10;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    public static j getSharedValues() {
        if (B == null) {
            B = new j();
        }
        return B;
    }

    private final e k(int i10) {
        if (i10 == 0) {
            return this.f1676g;
        }
        View view = (View) this.f1674e.get(i10);
        if (view == null && (view = findViewById(i10)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f1676g;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f1740v0;
    }

    private void q(AttributeSet attributeSet, int i10, int i11) {
        this.f1676g.B0(this);
        this.f1676g.V1(this.f1694y);
        this.f1674e.put(getId(), this);
        this.f1683n = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f2027n1, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == i.f2117x1) {
                    this.f1677h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1677h);
                } else if (index == i.f2126y1) {
                    this.f1678i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1678i);
                } else if (index == i.f2099v1) {
                    this.f1679j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1679j);
                } else if (index == i.f2108w1) {
                    this.f1680k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1680k);
                } else if (index == i.f1966g3) {
                    this.f1682m = obtainStyledAttributes.getInt(index, this.f1682m);
                } else if (index == i.f1920b2) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            t(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1684o = null;
                        }
                    }
                } else if (index == i.F1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.f1683n = eVar;
                        eVar.k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1683n = null;
                    }
                    this.f1685p = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1676g.W1(this.f1682m);
    }

    private void s() {
        this.f1681l = true;
        this.f1687r = -1;
        this.f1688s = -1;
        this.f1689t = -1;
        this.f1690u = -1;
        this.f1691v = 0;
        this.f1692w = 0;
    }

    private void w() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            e p10 = p(getChildAt(i10));
            if (p10 != null) {
                p10.t0();
            }
        }
        if (isInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    x(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    k(childAt.getId()).C0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f1685p != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                getChildAt(i12).getId();
            }
        }
        e eVar = this.f1683n;
        if (eVar != null) {
            eVar.d(this, true);
        }
        this.f1676g.u1();
        int size = this.f1675f.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                ((c) this.f1675f.get(i13)).n(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            getChildAt(i14);
        }
        this.f1693x.clear();
        this.f1693x.put(0, this.f1676g);
        this.f1693x.put(getId(), this.f1676g);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            this.f1693x.put(childAt2.getId(), p(childAt2));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt3 = getChildAt(i16);
            e p11 = p(childAt3);
            if (p11 != null) {
                this.f1676g.a(p11);
                d(isInEditMode, childAt3, p11, (b) childAt3.getLayoutParams(), this.f1693x);
            }
        }
    }

    private void z(e eVar, b bVar, SparseArray sparseArray, int i10, d.b bVar2) {
        View view = (View) this.f1674e.get(i10);
        e eVar2 = (e) sparseArray.get(i10);
        if (eVar2 != null && view != null && (view.getLayoutParams() instanceof b)) {
            bVar.f1710g0 = true;
            d.b bVar3 = d.b.BASELINE;
            if (bVar2 == bVar3) {
                b bVar4 = (b) view.getLayoutParams();
                bVar4.f1710g0 = true;
                bVar4.f1740v0.K0(true);
            }
            eVar.o(bVar3).b(eVar2.o(bVar2), bVar.D, bVar.C, true);
            eVar.K0(true);
            eVar.o(d.b.TOP).q();
            eVar.o(d.b.BOTTOM).q();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: s.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: s.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: s.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: s.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: s.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: s.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: s.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v67, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: s.e} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(boolean r17, android.view.View r18, s.e r19, androidx.constraintlayout.widget.ConstraintLayout.b r20, android.util.SparseArray r21) {
        /*
            r16 = this;
            r0 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r20.a()
            r9 = 0
            r7.f1742w0 = r9
            int r1 = r18.getVisibility()
            r6.j1(r1)
            boolean r1 = r7.f1716j0
            if (r1 == 0) goto L_0x0022
            r1 = 1
            r6.T0(r1)
            r1 = 8
            r6.j1(r1)
        L_0x0022:
            r6.B0(r0)
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.c
            if (r1 == 0) goto L_0x0037
            androidx.constraintlayout.widget.c r0 = (androidx.constraintlayout.widget.c) r0
            r10 = r16
            s.f r1 = r10.f1676g
            boolean r1 = r1.P1()
            r0.j(r6, r1)
            goto L_0x0039
        L_0x0037:
            r10 = r16
        L_0x0039:
            boolean r0 = r7.f1712h0
            r11 = -1
            if (r0 == 0) goto L_0x0060
            r0 = r6
            s.h r0 = (s.h) r0
            int r1 = r7.f1734s0
            int r2 = r7.f1736t0
            float r3 = r7.f1738u0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0052
            r0.z1(r3)
            goto L_0x0239
        L_0x0052:
            if (r1 == r11) goto L_0x0059
            r0.x1(r1)
            goto L_0x0239
        L_0x0059:
            if (r2 == r11) goto L_0x0239
            r0.y1(r2)
            goto L_0x0239
        L_0x0060:
            int r0 = r7.f1720l0
            int r1 = r7.f1722m0
            int r12 = r7.f1724n0
            int r13 = r7.f1726o0
            int r5 = r7.f1728p0
            int r14 = r7.f1730q0
            float r15 = r7.f1732r0
            int r2 = r7.f1727p
            if (r2 == r11) goto L_0x0083
            java.lang.Object r0 = r8.get(r2)
            s.e r0 = (s.e) r0
            if (r0 == 0) goto L_0x0169
            float r1 = r7.f1731r
            int r2 = r7.f1729q
            r6.l(r0, r1, r2)
            goto L_0x0169
        L_0x0083:
            if (r0 == r11) goto L_0x0096
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            s.e r2 = (s.e) r2
            if (r2 == 0) goto L_0x00ac
            s.d$b r3 = s.d.b.LEFT
            int r4 = r7.leftMargin
            r0 = r19
            r1 = r3
            goto L_0x00a9
        L_0x0096:
            if (r1 == r11) goto L_0x00ac
            java.lang.Object r0 = r8.get(r1)
            r2 = r0
            s.e r2 = (s.e) r2
            if (r2 == 0) goto L_0x00ac
            s.d$b r1 = s.d.b.LEFT
            s.d$b r3 = s.d.b.RIGHT
            int r4 = r7.leftMargin
            r0 = r19
        L_0x00a9:
            r0.e0(r1, r2, r3, r4, r5)
        L_0x00ac:
            if (r12 == r11) goto L_0x00c0
            java.lang.Object r0 = r8.get(r12)
            r2 = r0
            s.e r2 = (s.e) r2
            if (r2 == 0) goto L_0x00d6
            s.d$b r1 = s.d.b.RIGHT
            s.d$b r3 = s.d.b.LEFT
            int r4 = r7.rightMargin
            r0 = r19
            goto L_0x00d2
        L_0x00c0:
            if (r13 == r11) goto L_0x00d6
            java.lang.Object r0 = r8.get(r13)
            r2 = r0
            s.e r2 = (s.e) r2
            if (r2 == 0) goto L_0x00d6
            s.d$b r3 = s.d.b.RIGHT
            int r4 = r7.rightMargin
            r0 = r19
            r1 = r3
        L_0x00d2:
            r5 = r14
            r0.e0(r1, r2, r3, r4, r5)
        L_0x00d6:
            int r0 = r7.f1713i
            if (r0 == r11) goto L_0x00ed
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            s.e r2 = (s.e) r2
            if (r2 == 0) goto L_0x0107
            s.d$b r3 = s.d.b.TOP
            int r4 = r7.topMargin
            int r5 = r7.f1743x
            r0 = r19
            r1 = r3
            goto L_0x0104
        L_0x00ed:
            int r0 = r7.f1715j
            if (r0 == r11) goto L_0x0107
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            s.e r2 = (s.e) r2
            if (r2 == 0) goto L_0x0107
            s.d$b r1 = s.d.b.TOP
            s.d$b r3 = s.d.b.BOTTOM
            int r4 = r7.topMargin
            int r5 = r7.f1743x
            r0 = r19
        L_0x0104:
            r0.e0(r1, r2, r3, r4, r5)
        L_0x0107:
            int r0 = r7.f1717k
            if (r0 == r11) goto L_0x011f
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            s.e r2 = (s.e) r2
            if (r2 == 0) goto L_0x0138
            s.d$b r1 = s.d.b.BOTTOM
            s.d$b r3 = s.d.b.TOP
            int r4 = r7.bottomMargin
            int r5 = r7.f1745z
            r0 = r19
            goto L_0x0135
        L_0x011f:
            int r0 = r7.f1719l
            if (r0 == r11) goto L_0x0138
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            s.e r2 = (s.e) r2
            if (r2 == 0) goto L_0x0138
            s.d$b r3 = s.d.b.BOTTOM
            int r4 = r7.bottomMargin
            int r5 = r7.f1745z
            r0 = r19
            r1 = r3
        L_0x0135:
            r0.e0(r1, r2, r3, r4, r5)
        L_0x0138:
            int r4 = r7.f1721m
            if (r4 == r11) goto L_0x014a
            s.d$b r5 = s.d.b.BASELINE
        L_0x013e:
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = r21
            r0.z(r1, r2, r3, r4, r5)
            goto L_0x0158
        L_0x014a:
            int r4 = r7.f1723n
            if (r4 == r11) goto L_0x0151
            s.d$b r5 = s.d.b.TOP
            goto L_0x013e
        L_0x0151:
            int r4 = r7.f1725o
            if (r4 == r11) goto L_0x0158
            s.d$b r5 = s.d.b.BOTTOM
            goto L_0x013e
        L_0x0158:
            r0 = 0
            int r1 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r1 < 0) goto L_0x0160
            r6.M0(r15)
        L_0x0160:
            float r1 = r7.H
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0169
            r6.d1(r1)
        L_0x0169:
            if (r17 == 0) goto L_0x0178
            int r0 = r7.X
            if (r0 != r11) goto L_0x0173
            int r1 = r7.Y
            if (r1 == r11) goto L_0x0178
        L_0x0173:
            int r1 = r7.Y
            r6.b1(r0, r1)
        L_0x0178:
            boolean r0 = r7.f1706e0
            r1 = -2
            if (r0 != 0) goto L_0x01ac
            int r0 = r7.width
            if (r0 != r11) goto L_0x01a3
            boolean r0 = r7.f1698a0
            if (r0 == 0) goto L_0x018b
            s.e$b r0 = s.e.b.MATCH_CONSTRAINT
        L_0x0187:
            r6.P0(r0)
            goto L_0x018e
        L_0x018b:
            s.e$b r0 = s.e.b.MATCH_PARENT
            goto L_0x0187
        L_0x018e:
            s.d$b r0 = s.d.b.LEFT
            s.d r0 = r6.o(r0)
            int r2 = r7.leftMargin
            r0.f15665g = r2
            s.d$b r0 = s.d.b.RIGHT
            s.d r0 = r6.o(r0)
            int r2 = r7.rightMargin
            r0.f15665g = r2
            goto L_0x01bf
        L_0x01a3:
            s.e$b r0 = s.e.b.MATCH_CONSTRAINT
            r6.P0(r0)
            r6.k1(r9)
            goto L_0x01bf
        L_0x01ac:
            s.e$b r0 = s.e.b.FIXED
            r6.P0(r0)
            int r0 = r7.width
            r6.k1(r0)
            int r0 = r7.width
            if (r0 != r1) goto L_0x01bf
            s.e$b r0 = s.e.b.WRAP_CONTENT
            r6.P0(r0)
        L_0x01bf:
            boolean r0 = r7.f1708f0
            if (r0 != 0) goto L_0x01f2
            int r0 = r7.height
            if (r0 != r11) goto L_0x01e9
            boolean r0 = r7.f1700b0
            if (r0 == 0) goto L_0x01d1
            s.e$b r0 = s.e.b.MATCH_CONSTRAINT
        L_0x01cd:
            r6.g1(r0)
            goto L_0x01d4
        L_0x01d1:
            s.e$b r0 = s.e.b.MATCH_PARENT
            goto L_0x01cd
        L_0x01d4:
            s.d$b r0 = s.d.b.TOP
            s.d r0 = r6.o(r0)
            int r1 = r7.topMargin
            r0.f15665g = r1
            s.d$b r0 = s.d.b.BOTTOM
            s.d r0 = r6.o(r0)
            int r1 = r7.bottomMargin
            r0.f15665g = r1
            goto L_0x0205
        L_0x01e9:
            s.e$b r0 = s.e.b.MATCH_CONSTRAINT
            r6.g1(r0)
            r6.L0(r9)
            goto L_0x0205
        L_0x01f2:
            s.e$b r0 = s.e.b.FIXED
            r6.g1(r0)
            int r0 = r7.height
            r6.L0(r0)
            int r0 = r7.height
            if (r0 != r1) goto L_0x0205
            s.e$b r0 = s.e.b.WRAP_CONTENT
            r6.g1(r0)
        L_0x0205:
            java.lang.String r0 = r7.I
            r6.D0(r0)
            float r0 = r7.L
            r6.R0(r0)
            float r0 = r7.M
            r6.i1(r0)
            int r0 = r7.N
            r6.N0(r0)
            int r0 = r7.O
            r6.e1(r0)
            int r0 = r7.f1704d0
            r6.l1(r0)
            int r0 = r7.P
            int r1 = r7.R
            int r2 = r7.T
            float r3 = r7.V
            r6.Q0(r0, r1, r2, r3)
            int r0 = r7.Q
            int r1 = r7.S
            int r2 = r7.U
            float r3 = r7.W
            r6.h1(r0, r1, r2, r3)
        L_0x0239:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.d(boolean, android.view.View, s.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1675f;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((c) this.f1675f.get(i10)).m(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i13 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = (float) i12;
                        float f11 = (float) i13;
                        float f12 = (float) (i12 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f13 = f11;
                        float f14 = f11;
                        float f15 = f12;
                        float f16 = f10;
                        Paint paint2 = paint;
                        canvas2.drawLine(f10, f13, f15, f14, paint);
                        float parseInt4 = (float) (i13 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f17 = f12;
                        float f18 = parseInt4;
                        canvas2.drawLine(f17, f14, f15, f18, paint);
                        float f19 = parseInt4;
                        float f20 = f16;
                        canvas2.drawLine(f17, f19, f20, f18, paint);
                        float f21 = f16;
                        canvas2.drawLine(f21, f19, f20, f14, paint);
                        paint.setColor(-16711936);
                        float f22 = f12;
                        Paint paint3 = paint;
                        canvas2.drawLine(f21, f14, f22, parseInt4, paint);
                        canvas2.drawLine(f21, parseInt4, f22, f14, paint);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    /* renamed from: f */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public void forceLayout() {
        s();
        super.forceLayout();
    }

    public Object g(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap hashMap = this.f1686q;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f1686q.get(str);
    }

    public int getMaxHeight() {
        return this.f1680k;
    }

    public int getMaxWidth() {
        return this.f1679j;
    }

    public int getMinHeight() {
        return this.f1678i;
    }

    public int getMinWidth() {
        return this.f1677h;
    }

    public int getOptimizationLevel() {
        return this.f1676g.J1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f1676g.f15707o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f1676g.f15707o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f1676g.f15707o = "parent";
            }
        }
        if (this.f1676g.t() == null) {
            f fVar = this.f1676g;
            fVar.C0(fVar.f15707o);
            Log.v("ConstraintLayout", " setDebugName " + this.f1676g.t());
        }
        Iterator it = this.f1676g.r1().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            View view = (View) eVar.s();
            if (view != null) {
                if (eVar.f15707o == null && (id2 = view.getId()) != -1) {
                    eVar.f15707o = getContext().getResources().getResourceEntryName(id2);
                }
                if (eVar.t() == null) {
                    eVar.C0(eVar.f15707o);
                    Log.v("ConstraintLayout", " setDebugName " + eVar.t());
                }
            }
        }
        this.f1676g.O(sb2);
        return sb2.toString();
    }

    public View l(int i10) {
        return (View) this.f1674e.get(i10);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            e eVar = bVar.f1740v0;
            if ((childAt.getVisibility() != 8 || bVar.f1712h0 || bVar.f1714i0 || bVar.f1718k0 || isInEditMode) && !bVar.f1716j0) {
                int X = eVar.X();
                int Y = eVar.Y();
                childAt.layout(X, Y, eVar.W() + X, eVar.x() + Y);
            }
        }
        int size = this.f1675f.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((c) this.f1675f.get(i15)).k(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (this.f1695z == i10) {
            int i12 = this.A;
        }
        if (!this.f1681l) {
            int childCount = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                } else if (getChildAt(i13).isLayoutRequested()) {
                    this.f1681l = true;
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.f1695z = i10;
        this.A = i11;
        this.f1676g.Y1(r());
        if (this.f1681l) {
            this.f1681l = false;
            if (A()) {
                this.f1676g.a2();
            }
        }
        v(this.f1676g, this.f1682m, i10, i11);
        u(i10, i11, this.f1676g.W(), this.f1676g.x(), this.f1676g.Q1(), this.f1676g.O1());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        e p10 = p(view);
        if ((view instanceof g) && !(p10 instanceof h)) {
            b bVar = (b) view.getLayoutParams();
            h hVar = new h();
            bVar.f1740v0 = hVar;
            bVar.f1712h0 = true;
            hVar.A1(bVar.Z);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.o();
            ((b) view.getLayoutParams()).f1714i0 = true;
            if (!this.f1675f.contains(cVar)) {
                this.f1675f.add(cVar);
            }
        }
        this.f1674e.put(view.getId(), view);
        this.f1681l = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1674e.remove(view.getId());
        this.f1676g.t1(p(view));
        this.f1675f.remove(view);
        this.f1681l = true;
    }

    public final e p(View view) {
        if (view == this) {
            return this.f1676g;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof b)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof b)) {
                return null;
            }
        }
        return ((b) view.getLayoutParams()).f1740v0;
    }

    /* access modifiers changed from: protected */
    public boolean r() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void requestLayout() {
        s();
        super.requestLayout();
    }

    public void setConstraintSet(e eVar) {
        this.f1683n = eVar;
    }

    public void setId(int i10) {
        this.f1674e.remove(getId());
        super.setId(i10);
        this.f1674e.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 != this.f1680k) {
            this.f1680k = i10;
            requestLayout();
        }
    }

    public void setMaxWidth(int i10) {
        if (i10 != this.f1679j) {
            this.f1679j = i10;
            requestLayout();
        }
    }

    public void setMinHeight(int i10) {
        if (i10 != this.f1678i) {
            this.f1678i = i10;
            requestLayout();
        }
    }

    public void setMinWidth(int i10) {
        if (i10 != this.f1677h) {
            this.f1677h = i10;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(f fVar) {
        d dVar = this.f1684o;
        if (dVar != null) {
            dVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f1682m = i10;
        this.f1676g.W1(i10);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void t(int i10) {
        this.f1684o = new d(getContext(), this, i10);
    }

    /* access modifiers changed from: protected */
    public void u(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f1694y;
        int i14 = cVar.f1751e;
        int resolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f1750d, i10, 0);
        int min = Math.min(this.f1679j, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1680k, View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f1687r = min;
        this.f1688s = min2;
    }

    /* access modifiers changed from: protected */
    public void v(f fVar, int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i13 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f1694y.c(i11, i12, max, max2, paddingWidth, i13);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? r() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i14 = size - paddingWidth;
        int i15 = size2 - i13;
        y(fVar, mode, i14, mode2, i15);
        fVar.R1(i10, mode, i14, mode2, i15, this.f1687r, this.f1688s, max5, max);
    }

    public void x(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1686q == null) {
                this.f1686q = new HashMap();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1686q.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r3 == 0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r3 == 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r3 == 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3 == 0) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void y(s.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f1694y
            int r1 = r0.f1751e
            int r0 = r0.f1750d
            s.e$b r2 = s.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L_0x002e
            if (r9 == 0) goto L_0x0023
            if (r9 == r4) goto L_0x001a
            r9 = r2
        L_0x0018:
            r10 = r6
            goto L_0x0033
        L_0x001a:
            int r9 = r7.f1679j
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L_0x0033
        L_0x0023:
            s.e$b r9 = s.e.b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0018
        L_0x0027:
            int r10 = r7.f1677h
            int r10 = java.lang.Math.max(r6, r10)
            goto L_0x0033
        L_0x002e:
            s.e$b r9 = s.e.b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0033
            goto L_0x0027
        L_0x0033:
            if (r11 == r5) goto L_0x004e
            if (r11 == 0) goto L_0x0043
            if (r11 == r4) goto L_0x003b
        L_0x0039:
            r12 = r6
            goto L_0x0053
        L_0x003b:
            int r11 = r7.f1680k
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L_0x0053
        L_0x0043:
            s.e$b r2 = s.e.b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0039
        L_0x0047:
            int r11 = r7.f1678i
            int r12 = java.lang.Math.max(r6, r11)
            goto L_0x0053
        L_0x004e:
            s.e$b r2 = s.e.b.WRAP_CONTENT
            if (r3 != 0) goto L_0x0053
            goto L_0x0047
        L_0x0053:
            int r11 = r8.W()
            if (r10 != r11) goto L_0x005f
            int r11 = r8.x()
            if (r12 == r11) goto L_0x0062
        L_0x005f:
            r8.N1()
        L_0x0062:
            r8.m1(r6)
            r8.n1(r6)
            int r11 = r7.f1679j
            int r11 = r11 - r0
            r8.X0(r11)
            int r11 = r7.f1680k
            int r11 = r11 - r1
            r8.W0(r11)
            r8.a1(r6)
            r8.Z0(r6)
            r8.P0(r9)
            r8.k1(r10)
            r8.g1(r2)
            r8.L0(r12)
            int r9 = r7.f1677h
            int r9 = r9 - r0
            r8.a1(r9)
            int r9 = r7.f1678i
            int r9 = r9 - r1
            r8.Z0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.y(s.f, int, int, int, int):void");
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q(attributeSet, i10, 0);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }
}
