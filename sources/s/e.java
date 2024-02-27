package s;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.d;
import t.c;
import t.f;
import t.l;
import t.n;
import t.p;

public class e {
    public static float K0 = 0.5f;
    public int A = 0;
    int A0;
    public float B = 1.0f;
    boolean B0;
    public int C = 0;
    boolean C0;
    public int D = 0;
    public float[] D0;
    public float E = 1.0f;
    protected e[] E0;
    int F = -1;
    protected e[] F0;
    float G = 1.0f;
    e G0;
    private int[] H = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    e H0;
    private float I = 0.0f;
    public int I0;
    private boolean J = false;
    public int J0;
    private boolean K;
    private boolean L = false;
    private int M = 0;
    private int N = 0;
    public d O = new d(this, d.b.LEFT);
    public d P = new d(this, d.b.TOP);
    public d Q = new d(this, d.b.RIGHT);
    public d R = new d(this, d.b.BOTTOM);
    public d S = new d(this, d.b.BASELINE);
    d T = new d(this, d.b.CENTER_X);
    d U = new d(this, d.b.CENTER_Y);
    public d V;
    public d[] W;
    protected ArrayList X;
    private boolean[] Y;
    public b[] Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f15679a = false;

    /* renamed from: a0  reason: collision with root package name */
    public e f15680a0;

    /* renamed from: b  reason: collision with root package name */
    public p[] f15681b = new p[2];

    /* renamed from: b0  reason: collision with root package name */
    int f15682b0;

    /* renamed from: c  reason: collision with root package name */
    public c f15683c;

    /* renamed from: c0  reason: collision with root package name */
    int f15684c0;

    /* renamed from: d  reason: collision with root package name */
    public c f15685d;

    /* renamed from: d0  reason: collision with root package name */
    public float f15686d0;

    /* renamed from: e  reason: collision with root package name */
    public l f15687e = null;

    /* renamed from: e0  reason: collision with root package name */
    protected int f15688e0;

    /* renamed from: f  reason: collision with root package name */
    public n f15689f = null;

    /* renamed from: f0  reason: collision with root package name */
    protected int f15690f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f15691g = {true, true};

    /* renamed from: g0  reason: collision with root package name */
    protected int f15692g0;

    /* renamed from: h  reason: collision with root package name */
    boolean f15693h = false;

    /* renamed from: h0  reason: collision with root package name */
    int f15694h0;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15695i = true;

    /* renamed from: i0  reason: collision with root package name */
    int f15696i0;

    /* renamed from: j  reason: collision with root package name */
    private boolean f15697j = false;

    /* renamed from: j0  reason: collision with root package name */
    protected int f15698j0;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15699k = true;

    /* renamed from: k0  reason: collision with root package name */
    protected int f15700k0;

    /* renamed from: l  reason: collision with root package name */
    private int f15701l = -1;

    /* renamed from: l0  reason: collision with root package name */
    int f15702l0;

    /* renamed from: m  reason: collision with root package name */
    private int f15703m = -1;

    /* renamed from: m0  reason: collision with root package name */
    protected int f15704m0;

    /* renamed from: n  reason: collision with root package name */
    public r.a f15705n = new r.a(this);

    /* renamed from: n0  reason: collision with root package name */
    protected int f15706n0;

    /* renamed from: o  reason: collision with root package name */
    public String f15707o;

    /* renamed from: o0  reason: collision with root package name */
    float f15708o0;

    /* renamed from: p  reason: collision with root package name */
    private boolean f15709p = false;

    /* renamed from: p0  reason: collision with root package name */
    float f15710p0;

    /* renamed from: q  reason: collision with root package name */
    private boolean f15711q = false;

    /* renamed from: q0  reason: collision with root package name */
    private Object f15712q0;

    /* renamed from: r  reason: collision with root package name */
    private boolean f15713r = false;

    /* renamed from: r0  reason: collision with root package name */
    private int f15714r0;

    /* renamed from: s  reason: collision with root package name */
    private boolean f15715s = false;

    /* renamed from: s0  reason: collision with root package name */
    private int f15716s0;

    /* renamed from: t  reason: collision with root package name */
    public int f15717t = -1;

    /* renamed from: t0  reason: collision with root package name */
    private boolean f15718t0;

    /* renamed from: u  reason: collision with root package name */
    public int f15719u = -1;

    /* renamed from: u0  reason: collision with root package name */
    private String f15720u0;

    /* renamed from: v  reason: collision with root package name */
    private int f15721v = 0;

    /* renamed from: v0  reason: collision with root package name */
    private String f15722v0;

    /* renamed from: w  reason: collision with root package name */
    public int f15723w = 0;

    /* renamed from: w0  reason: collision with root package name */
    boolean f15724w0;

    /* renamed from: x  reason: collision with root package name */
    public int f15725x = 0;

    /* renamed from: x0  reason: collision with root package name */
    boolean f15726x0;

    /* renamed from: y  reason: collision with root package name */
    public int[] f15727y = new int[2];

    /* renamed from: y0  reason: collision with root package name */
    boolean f15728y0;

    /* renamed from: z  reason: collision with root package name */
    public int f15729z = 0;

    /* renamed from: z0  reason: collision with root package name */
    int f15730z0;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15731a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f15732b;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                s.e$b[] r0 = s.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15732b = r0
                r1 = 1
                s.e$b r2 = s.e.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f15732b     // Catch:{ NoSuchFieldError -> 0x001d }
                s.e$b r3 = s.e.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f15732b     // Catch:{ NoSuchFieldError -> 0x0028 }
                s.e$b r4 = s.e.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f15732b     // Catch:{ NoSuchFieldError -> 0x0033 }
                s.e$b r5 = s.e.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                s.d$b[] r4 = s.d.b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f15731a = r4
                s.d$b r5 = s.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f15731a     // Catch:{ NoSuchFieldError -> 0x004e }
                s.d$b r4 = s.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f15731a     // Catch:{ NoSuchFieldError -> 0x0058 }
                s.d$b r1 = s.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f15731a     // Catch:{ NoSuchFieldError -> 0x0062 }
                s.d$b r1 = s.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f15731a     // Catch:{ NoSuchFieldError -> 0x006d }
                s.d$b r1 = s.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f15731a     // Catch:{ NoSuchFieldError -> 0x0078 }
                s.d$b r1 = s.d.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f15731a     // Catch:{ NoSuchFieldError -> 0x0083 }
                s.d$b r1 = s.d.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f15731a     // Catch:{ NoSuchFieldError -> 0x008f }
                s.d$b r1 = s.d.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f15731a     // Catch:{ NoSuchFieldError -> 0x009b }
                s.d$b r1 = s.d.b.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s.e.a.<clinit>():void");
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.V = dVar;
        this.W = new d[]{this.O, this.Q, this.P, this.R, this.S, dVar};
        this.X = new ArrayList();
        this.Y = new boolean[2];
        b bVar = b.FIXED;
        this.Z = new b[]{bVar, bVar};
        this.f15680a0 = null;
        this.f15682b0 = 0;
        this.f15684c0 = 0;
        this.f15686d0 = 0.0f;
        this.f15688e0 = -1;
        this.f15690f0 = 0;
        this.f15692g0 = 0;
        this.f15694h0 = 0;
        this.f15696i0 = 0;
        this.f15698j0 = 0;
        this.f15700k0 = 0;
        this.f15702l0 = 0;
        float f10 = K0;
        this.f15708o0 = f10;
        this.f15710p0 = f10;
        this.f15714r0 = 0;
        this.f15716s0 = 0;
        this.f15718t0 = false;
        this.f15720u0 = null;
        this.f15722v0 = null;
        this.f15728y0 = false;
        this.f15730z0 = 0;
        this.A0 = 0;
        this.D0 = new float[]{-1.0f, -1.0f};
        this.E0 = new e[]{null, null};
        this.F0 = new e[]{null, null};
        this.G0 = null;
        this.H0 = null;
        this.I0 = -1;
        this.J0 = -1;
        d();
    }

    private void P(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        y0(sb2, "      size", i10, 0);
        y0(sb2, "      min", i11, 0);
        y0(sb2, "      max", i12, Integer.MAX_VALUE);
        y0(sb2, "      matchMin", i14, 0);
        y0(sb2, "      matchDef", i15, 0);
        x0(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    private void Q(StringBuilder sb2, String str, d dVar) {
        if (dVar.f15664f != null) {
            sb2.append("    ");
            sb2.append(str);
            sb2.append(" : [ '");
            sb2.append(dVar.f15664f);
            sb2.append("'");
            if (!(dVar.f15666h == Integer.MIN_VALUE && dVar.f15665g == 0)) {
                sb2.append(",");
                sb2.append(dVar.f15665g);
                if (dVar.f15666h != Integer.MIN_VALUE) {
                    sb2.append(",");
                    sb2.append(dVar.f15666h);
                    sb2.append(",");
                }
            }
            sb2.append(" ] ,\n");
        }
    }

    private void d() {
        this.X.add(this.O);
        this.X.add(this.P);
        this.X.add(this.Q);
        this.X.add(this.R);
        this.X.add(this.T);
        this.X.add(this.U);
        this.X.add(this.V);
        this.X.add(this.S);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r4 = r0[r4 + 1];
        r0 = r4.f15664f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean f0(int r4) {
        /*
            r3 = this;
            int r4 = r4 * 2
            s.d[] r0 = r3.W
            r1 = r0[r4]
            s.d r2 = r1.f15664f
            if (r2 == 0) goto L_0x001b
            s.d r2 = r2.f15664f
            if (r2 == r1) goto L_0x001b
            r1 = 1
            int r4 = r4 + r1
            r4 = r0[r4]
            s.d r0 = r4.f15664f
            if (r0 == 0) goto L_0x001b
            s.d r0 = r0.f15664f
            if (r0 != r4) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.f0(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0483, code lost:
        if ((r4 instanceof s.a) != false) goto L_0x0488;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01c9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x046e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0514  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0532  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0537  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0543 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0571 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:366:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:370:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i(p.d r38, boolean r39, boolean r40, boolean r41, boolean r42, p.i r43, p.i r44, s.e.b r45, boolean r46, s.d r47, s.d r48, int r49, int r50, int r51, int r52, float r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, int r59, int r60, int r61, int r62, float r63, boolean r64) {
        /*
            r37 = this;
            r0 = r37
            r10 = r38
            r11 = r43
            r12 = r44
            r13 = r47
            r14 = r48
            r15 = r51
            r1 = r52
            r2 = r60
            r3 = r61
            r4 = r62
            p.i r9 = r10.q(r13)
            p.i r8 = r10.q(r14)
            s.d r5 = r47.j()
            p.i r7 = r10.q(r5)
            s.d r5 = r48.j()
            p.i r6 = r10.q(r5)
            p.d.w()
            boolean r16 = r47.o()
            boolean r17 = r48.o()
            s.d r5 = r0.V
            boolean r18 = r5.o()
            if (r17 == 0) goto L_0x0044
            int r5 = r16 + 1
            goto L_0x0046
        L_0x0044:
            r5 = r16
        L_0x0046:
            if (r18 == 0) goto L_0x004a
            int r5 = r5 + 1
        L_0x004a:
            if (r54 == 0) goto L_0x004f
            r19 = 3
            goto L_0x0051
        L_0x004f:
            r19 = r59
        L_0x0051:
            int[] r20 = s.e.a.f15732b
            int r21 = r45.ordinal()
            r12 = r20[r21]
            r2 = 1
            if (r12 == r2) goto L_0x0065
            r2 = 2
            if (r12 == r2) goto L_0x0065
            r2 = 3
            if (r12 == r2) goto L_0x0065
            r2 = 4
            if (r12 == r2) goto L_0x006a
        L_0x0065:
            r12 = r19
        L_0x0067:
            r19 = 0
            goto L_0x0070
        L_0x006a:
            r12 = r19
            if (r12 == r2) goto L_0x0067
            r19 = 1
        L_0x0070:
            int r2 = r0.f15701l
            r14 = -1
            if (r2 == r14) goto L_0x007d
            if (r39 == 0) goto L_0x007d
            r0.f15701l = r14
            r50 = r2
            r19 = 0
        L_0x007d:
            int r2 = r0.f15703m
            if (r2 == r14) goto L_0x0088
            if (r39 != 0) goto L_0x0088
            r0.f15703m = r14
            r19 = 0
            goto L_0x008a
        L_0x0088:
            r2 = r50
        L_0x008a:
            int r14 = r0.f15716s0
            r50 = r2
            r2 = 8
            if (r14 != r2) goto L_0x0096
            r14 = 0
            r19 = 0
            goto L_0x0098
        L_0x0096:
            r14 = r50
        L_0x0098:
            if (r64 == 0) goto L_0x00ba
            if (r16 != 0) goto L_0x00aa
            if (r17 != 0) goto L_0x00aa
            if (r18 != 0) goto L_0x00aa
            r2 = r49
            r10.f(r9, r2)
        L_0x00a5:
            r24 = r6
            r6 = 8
            goto L_0x00bd
        L_0x00aa:
            if (r16 == 0) goto L_0x00a5
            if (r17 != 0) goto L_0x00a5
            int r2 = r47.f()
            r24 = r6
            r6 = 8
            r10.e(r9, r7, r2, r6)
            goto L_0x00bd
        L_0x00ba:
            r24 = r6
            r6 = r2
        L_0x00bd:
            if (r19 != 0) goto L_0x00e7
            if (r46 == 0) goto L_0x00d6
            r2 = 3
            r6 = 0
            r10.e(r8, r9, r6, r2)
            r2 = 8
            if (r15 <= 0) goto L_0x00cd
            r10.h(r8, r9, r15, r2)
        L_0x00cd:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r6) goto L_0x00da
            r10.j(r8, r9, r1, r2)
            goto L_0x00da
        L_0x00d6:
            r2 = r6
            r10.e(r8, r9, r14, r2)
        L_0x00da:
            r1 = r5
            r2 = r7
            r14 = r8
            r25 = r19
            r15 = r24
            r19 = r42
        L_0x00e3:
            r24 = r3
            goto L_0x01c7
        L_0x00e7:
            r1 = 2
            if (r5 == r1) goto L_0x010a
            if (r54 != 0) goto L_0x010a
            r1 = 1
            if (r12 == r1) goto L_0x00f1
            if (r12 != 0) goto L_0x010a
        L_0x00f1:
            int r1 = java.lang.Math.max(r3, r14)
            if (r4 <= 0) goto L_0x00fb
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00fb:
            r2 = 8
            r10.e(r8, r9, r1, r2)
            r19 = r42
            r1 = r5
            r2 = r7
            r14 = r8
            r15 = r24
            r25 = 0
            goto L_0x00e3
        L_0x010a:
            r1 = -2
            if (r3 != r1) goto L_0x010f
            r2 = r14
            goto L_0x0110
        L_0x010f:
            r2 = r3
        L_0x0110:
            if (r4 != r1) goto L_0x0114
            r1 = r14
            goto L_0x0115
        L_0x0114:
            r1 = r4
        L_0x0115:
            if (r14 <= 0) goto L_0x011b
            r3 = 1
            if (r12 == r3) goto L_0x011b
            r14 = 0
        L_0x011b:
            r3 = 8
            if (r2 <= 0) goto L_0x0126
            r10.h(r8, r9, r2, r3)
            int r14 = java.lang.Math.max(r14, r2)
        L_0x0126:
            r4 = 1
            if (r1 <= 0) goto L_0x0135
            if (r40 == 0) goto L_0x012e
            if (r12 != r4) goto L_0x012e
            goto L_0x0131
        L_0x012e:
            r10.j(r8, r9, r1, r3)
        L_0x0131:
            int r14 = java.lang.Math.min(r14, r1)
        L_0x0135:
            if (r12 != r4) goto L_0x0152
            if (r40 == 0) goto L_0x013d
            r10.e(r8, r9, r14, r3)
            goto L_0x0144
        L_0x013d:
            r4 = 5
            r10.e(r8, r9, r14, r4)
            r10.j(r8, r9, r14, r3)
        L_0x0144:
            r4 = r1
            r1 = r5
            r14 = r8
            r25 = r19
            r15 = r24
            r19 = r42
            r24 = r2
            r2 = r7
            goto L_0x01c7
        L_0x0152:
            r3 = 2
            if (r12 != r3) goto L_0x01b6
            s.d$b r3 = r47.k()
            s.d$b r4 = s.d.b.TOP
            if (r3 == r4) goto L_0x0181
            s.d$b r3 = r47.k()
            s.d$b r6 = s.d.b.BOTTOM
            if (r3 != r6) goto L_0x0166
            goto L_0x0181
        L_0x0166:
            s.e r3 = r0.f15680a0
            s.d$b r4 = s.d.b.LEFT
            s.d r3 = r3.o(r4)
            p.i r3 = r10.q(r3)
            s.e r4 = r0.f15680a0
            s.d$b r6 = s.d.b.RIGHT
        L_0x0176:
            s.d r4 = r4.o(r6)
            p.i r4 = r10.q(r4)
            r14 = r3
            r6 = r4
            goto L_0x0190
        L_0x0181:
            s.e r3 = r0.f15680a0
            s.d r3 = r3.o(r4)
            p.i r3 = r10.q(r3)
            s.e r4 = r0.f15680a0
            s.d$b r6 = s.d.b.BOTTOM
            goto L_0x0176
        L_0x0190:
            p.b r3 = r38.r()
            r4 = r8
            r46 = r1
            r1 = r5
            r5 = r9
            r15 = r24
            r52 = r2
            r2 = r7
            r7 = r14
            r14 = r8
            r8 = r63
            p.b r3 = r3.k(r4, r5, r6, r7, r8)
            r10.d(r3)
            if (r40 == 0) goto L_0x01ad
            r19 = 0
        L_0x01ad:
            r4 = r46
            r24 = r52
            r25 = r19
            r19 = r42
            goto L_0x01c7
        L_0x01b6:
            r46 = r1
            r52 = r2
            r1 = r5
            r2 = r7
            r14 = r8
            r15 = r24
            r4 = r46
            r24 = r52
            r25 = r19
            r19 = 1
        L_0x01c7:
            if (r64 == 0) goto L_0x01cb
            if (r56 == 0) goto L_0x01d6
        L_0x01cb:
            r5 = r44
            r8 = r9
            r3 = 0
            r7 = 2
            r13 = 8
            r18 = 1
            goto L_0x056f
        L_0x01d6:
            if (r16 != 0) goto L_0x01e1
            if (r17 != 0) goto L_0x01e1
            if (r18 != 0) goto L_0x01e1
        L_0x01dc:
            r2 = r15
            r1 = 5
            r3 = 0
            goto L_0x053f
        L_0x01e1:
            if (r16 == 0) goto L_0x01fa
            if (r17 != 0) goto L_0x01fa
            s.d r1 = r13.f15664f
            s.e r1 = r1.f15662d
            if (r40 == 0) goto L_0x01f2
            boolean r1 = r1 instanceof s.a
            if (r1 == 0) goto L_0x01f2
            r2 = 8
            goto L_0x01f3
        L_0x01f2:
            r2 = 5
        L_0x01f3:
            r20 = r40
            r1 = r2
        L_0x01f6:
            r2 = r15
        L_0x01f7:
            r3 = 0
            goto L_0x0541
        L_0x01fa:
            if (r16 != 0) goto L_0x022c
            if (r17 == 0) goto L_0x022c
            int r1 = r48.f()
            int r1 = -r1
            r2 = 8
            r10.e(r14, r15, r1, r2)
            if (r40 == 0) goto L_0x01dc
            boolean r1 = r0.f15697j
            if (r1 == 0) goto L_0x0222
            boolean r1 = r9.f14560k
            if (r1 == 0) goto L_0x0222
            s.e r1 = r0.f15680a0
            if (r1 == 0) goto L_0x0222
            s.f r1 = (s.f) r1
            if (r39 == 0) goto L_0x021e
            r1.z1(r13)
            goto L_0x01dc
        L_0x021e:
            r1.E1(r13)
            goto L_0x01dc
        L_0x0222:
            r1 = 0
            r2 = 5
            r10.h(r9, r11, r1, r2)
            r3 = r1
            r1 = r2
            r2 = r15
            goto L_0x053f
        L_0x022c:
            r1 = 0
            if (r16 == 0) goto L_0x053c
            if (r17 == 0) goto L_0x053c
            s.d r3 = r13.f15664f
            s.e r8 = r3.f15662d
            r6 = r48
            r7 = r1
            s.d r1 = r6.f15664f
            s.e r5 = r1.f15662d
            s.e r3 = r37.K()
            r16 = 6
            if (r25 == 0) goto L_0x03a6
            if (r12 != 0) goto L_0x02ac
            if (r4 != 0) goto L_0x0270
            if (r24 != 0) goto L_0x0270
            boolean r1 = r2.f14560k
            if (r1 == 0) goto L_0x0264
            boolean r1 = r15.f14560k
            if (r1 == 0) goto L_0x0264
            int r1 = r47.f()
            r4 = 8
            r10.e(r9, r2, r1, r4)
            int r1 = r48.f()
            int r1 = -r1
            r10.e(r14, r15, r1, r4)
            return
        L_0x0264:
            r4 = 8
            r1 = r4
            r17 = r1
            r18 = r7
            r23 = r18
            r21 = 1
            goto L_0x027b
        L_0x0270:
            r4 = 8
            r21 = r7
            r1 = 5
            r17 = 5
            r18 = 1
            r23 = 1
        L_0x027b:
            boolean r4 = r8 instanceof s.a
            if (r4 != 0) goto L_0x029a
            boolean r4 = r5 instanceof s.a
            if (r4 == 0) goto L_0x0284
            goto L_0x029a
        L_0x0284:
            r4 = r44
            r20 = r16
            r22 = r17
            r27 = r18
            r28 = r21
            r26 = r23
            r7 = 1
            r17 = 8
            r18 = 5
        L_0x0295:
            r23 = r1
            r1 = 3
            goto L_0x03f9
        L_0x029a:
            r4 = r44
            r20 = r16
            r27 = r18
            r28 = r21
            r26 = r23
            r7 = 1
            r17 = 8
            r18 = 5
            r22 = 4
            goto L_0x0295
        L_0x02ac:
            r1 = 2
            r17 = 8
            if (r12 != r1) goto L_0x02db
            boolean r1 = r8 instanceof s.a
            if (r1 != 0) goto L_0x02ce
            boolean r1 = r5 instanceof s.a
            if (r1 == 0) goto L_0x02ba
            goto L_0x02ce
        L_0x02ba:
            r4 = r44
            r28 = r7
            r20 = r16
            r1 = 3
            r7 = 1
            r18 = 5
            r22 = 5
        L_0x02c6:
            r23 = 5
        L_0x02c8:
            r26 = 1
            r27 = 1
            goto L_0x03f9
        L_0x02ce:
            r4 = r44
            r28 = r7
            r20 = r16
            r1 = 3
            r7 = 1
            r18 = 5
            r22 = 4
            goto L_0x02c6
        L_0x02db:
            r1 = 1
            if (r12 != r1) goto L_0x02ed
            r4 = r44
            r28 = r7
            r20 = r16
            r23 = r17
            r1 = 3
            r7 = 1
            r18 = 5
            r22 = 4
            goto L_0x02c8
        L_0x02ed:
            r1 = 3
            if (r12 != r1) goto L_0x0394
            int r1 = r0.F
            r7 = -1
            if (r1 != r7) goto L_0x0319
            r4 = r44
            if (r57 == 0) goto L_0x0310
            r23 = r17
            r1 = 3
            r7 = 1
            r18 = 5
            if (r40 == 0) goto L_0x030d
            r20 = 5
        L_0x0303:
            r22 = 5
            r26 = 1
            r27 = 1
            r28 = 1
            goto L_0x03f9
        L_0x030d:
            r20 = 4
            goto L_0x0303
        L_0x0310:
            r20 = r17
            r23 = r20
            r1 = 3
            r7 = 1
            r18 = 5
            goto L_0x0303
        L_0x0319:
            if (r54 == 0) goto L_0x033e
            r1 = r60
            r7 = 2
            if (r1 == r7) goto L_0x0328
            r7 = 1
            if (r1 != r7) goto L_0x0324
            goto L_0x0329
        L_0x0324:
            r1 = r17
            r4 = 5
            goto L_0x032b
        L_0x0328:
            r7 = 1
        L_0x0329:
            r1 = 5
            r4 = 4
        L_0x032b:
            r23 = r1
            r22 = r4
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r1 = 3
            r18 = 5
            r4 = r44
            goto L_0x03f9
        L_0x033e:
            r7 = 1
            if (r4 <= 0) goto L_0x0354
            r4 = r44
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r1 = 3
            r18 = 5
            r22 = 5
        L_0x0350:
            r23 = 5
            goto L_0x03f9
        L_0x0354:
            if (r4 != 0) goto L_0x0384
            if (r24 != 0) goto L_0x0384
            if (r57 != 0) goto L_0x036a
            r4 = r44
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r22 = r17
            r1 = 3
            r18 = 5
            goto L_0x0350
        L_0x036a:
            if (r8 == r3) goto L_0x0370
            if (r5 == r3) goto L_0x0370
            r1 = 4
            goto L_0x0371
        L_0x0370:
            r1 = 5
        L_0x0371:
            r4 = r44
            r23 = r1
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r1 = 3
            r18 = 5
            r22 = 4
            goto L_0x03f9
        L_0x0384:
            r4 = r44
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r1 = 3
            r18 = 5
            r22 = 4
            goto L_0x0350
        L_0x0394:
            r7 = 1
            r4 = r44
            r20 = r16
            r18 = 5
            r22 = 4
            r23 = 5
            r26 = 0
            r27 = 0
        L_0x03a3:
            r28 = 0
            goto L_0x03f9
        L_0x03a6:
            r7 = 1
            r17 = 8
            boolean r1 = r2.f14560k
            if (r1 == 0) goto L_0x03e9
            boolean r1 = r15.f14560k
            if (r1 == 0) goto L_0x03e9
            int r1 = r47.f()
            int r3 = r48.f()
            r4 = 8
            r54 = r38
            r55 = r9
            r56 = r2
            r57 = r1
            r58 = r53
            r59 = r15
            r60 = r14
            r61 = r3
            r62 = r4
            r54.c(r55, r56, r57, r58, r59, r60, r61, r62)
            if (r40 == 0) goto L_0x03e8
            if (r19 == 0) goto L_0x03e8
            s.d r1 = r6.f15664f
            if (r1 == 0) goto L_0x03df
            int r1 = r48.f()
            r4 = r44
            goto L_0x03e2
        L_0x03df:
            r4 = r44
            r1 = 0
        L_0x03e2:
            if (r15 == r4) goto L_0x03e8
            r2 = 5
            r10.h(r4, r14, r1, r2)
        L_0x03e8:
            return
        L_0x03e9:
            r4 = r44
            r1 = 3
            r18 = 5
            r26 = r7
            r27 = r26
            r20 = r16
            r23 = r18
            r22 = 4
            goto L_0x03a3
        L_0x03f9:
            if (r26 == 0) goto L_0x0404
            if (r2 != r15) goto L_0x0404
            if (r8 == r3) goto L_0x0404
            r26 = 0
            r29 = 0
            goto L_0x0406
        L_0x0404:
            r29 = r7
        L_0x0406:
            if (r27 == 0) goto L_0x0451
            if (r25 != 0) goto L_0x041b
            if (r55 != 0) goto L_0x041b
            if (r57 != 0) goto L_0x041b
            if (r2 != r11) goto L_0x041b
            if (r15 != r4) goto L_0x041b
            r23 = r17
            r27 = r23
            r20 = 0
            r29 = 0
            goto L_0x041f
        L_0x041b:
            r27 = r20
            r20 = r40
        L_0x041f:
            int r30 = r47.f()
            int r31 = r48.f()
            r13 = r1
            r1 = r38
            r42 = r2
            r13 = r17
            r17 = 4
            r36 = r18
            r18 = r7
            r7 = r36
            r2 = r9
            r32 = r3
            r3 = r42
            r4 = r30
            r33 = r5
            r5 = r53
            r6 = r15
            r7 = r14
            r34 = r8
            r8 = r31
            r35 = r9
            r9 = r27
            r1.c(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x044e:
            r2 = r29
            goto L_0x0464
        L_0x0451:
            r42 = r2
            r32 = r3
            r33 = r5
            r18 = r7
            r34 = r8
            r35 = r9
            r13 = r17
            r17 = 4
            r20 = r40
            goto L_0x044e
        L_0x0464:
            int r1 = r0.f15716s0
            if (r1 != r13) goto L_0x046f
            boolean r1 = r48.m()
            if (r1 != 0) goto L_0x046f
            return
        L_0x046f:
            r1 = r42
            if (r26 == 0) goto L_0x04a5
            if (r20 == 0) goto L_0x048b
            if (r1 == r15) goto L_0x048b
            if (r25 != 0) goto L_0x048b
            r3 = r34
            boolean r4 = r3 instanceof s.a
            if (r4 != 0) goto L_0x0486
            r4 = r33
            boolean r5 = r4 instanceof s.a
            if (r5 == 0) goto L_0x048f
            goto L_0x0488
        L_0x0486:
            r4 = r33
        L_0x0488:
            r5 = r16
            goto L_0x0491
        L_0x048b:
            r4 = r33
            r3 = r34
        L_0x048f:
            r5 = r23
        L_0x0491:
            int r6 = r47.f()
            r8 = r35
            r10.h(r8, r1, r6, r5)
            int r6 = r48.f()
            int r6 = -r6
            r10.j(r14, r15, r6, r5)
            r23 = r5
            goto L_0x04ab
        L_0x04a5:
            r4 = r33
            r3 = r34
            r8 = r35
        L_0x04ab:
            if (r20 == 0) goto L_0x04c1
            if (r58 == 0) goto L_0x04c1
            boolean r5 = r3 instanceof s.a
            if (r5 != 0) goto L_0x04c1
            boolean r5 = r4 instanceof s.a
            if (r5 != 0) goto L_0x04c1
            r5 = r32
            if (r4 == r5) goto L_0x04c3
            r6 = r16
            r7 = r6
            r2 = r18
            goto L_0x04c7
        L_0x04c1:
            r5 = r32
        L_0x04c3:
            r6 = r22
            r7 = r23
        L_0x04c7:
            if (r2 == 0) goto L_0x0512
            if (r28 == 0) goto L_0x04f2
            if (r57 == 0) goto L_0x04cf
            if (r41 == 0) goto L_0x04f2
        L_0x04cf:
            if (r3 == r5) goto L_0x04d6
            if (r4 != r5) goto L_0x04d4
            goto L_0x04d6
        L_0x04d4:
            r2 = r6
            goto L_0x04d8
        L_0x04d6:
            r2 = r16
        L_0x04d8:
            boolean r9 = r3 instanceof s.h
            if (r9 != 0) goto L_0x04e0
            boolean r9 = r4 instanceof s.h
            if (r9 == 0) goto L_0x04e1
        L_0x04e0:
            r2 = 5
        L_0x04e1:
            boolean r9 = r3 instanceof s.a
            if (r9 != 0) goto L_0x04e9
            boolean r9 = r4 instanceof s.a
            if (r9 == 0) goto L_0x04ea
        L_0x04e9:
            r2 = 5
        L_0x04ea:
            if (r57 == 0) goto L_0x04ed
            r2 = 5
        L_0x04ed:
            int r2 = java.lang.Math.max(r2, r6)
            goto L_0x04f3
        L_0x04f2:
            r2 = r6
        L_0x04f3:
            if (r20 == 0) goto L_0x0503
            int r2 = java.lang.Math.min(r7, r2)
            if (r54 == 0) goto L_0x0503
            if (r57 != 0) goto L_0x0503
            if (r3 == r5) goto L_0x0501
            if (r4 != r5) goto L_0x0503
        L_0x0501:
            r2 = r17
        L_0x0503:
            int r3 = r47.f()
            r10.e(r8, r1, r3, r2)
            int r3 = r48.f()
            int r3 = -r3
            r10.e(r14, r15, r3, r2)
        L_0x0512:
            if (r20 == 0) goto L_0x0523
            if (r11 != r1) goto L_0x051b
            int r2 = r47.f()
            goto L_0x051c
        L_0x051b:
            r2 = 0
        L_0x051c:
            if (r1 == r11) goto L_0x0523
            r1 = 5
            r10.h(r8, r11, r2, r1)
            goto L_0x0524
        L_0x0523:
            r1 = 5
        L_0x0524:
            if (r20 == 0) goto L_0x01f6
            if (r25 == 0) goto L_0x01f6
            r2 = r15
            if (r51 != 0) goto L_0x01f7
            if (r24 != 0) goto L_0x01f7
            if (r25 == 0) goto L_0x0537
            r3 = 3
            if (r12 != r3) goto L_0x0537
            r3 = 0
            r10.h(r14, r8, r3, r13)
            goto L_0x0541
        L_0x0537:
            r3 = 0
            r10.h(r14, r8, r3, r1)
            goto L_0x0541
        L_0x053c:
            r3 = r1
            r2 = r15
            r1 = 5
        L_0x053f:
            r20 = r40
        L_0x0541:
            if (r20 == 0) goto L_0x056e
            if (r19 == 0) goto L_0x056e
            r4 = r48
            s.d r5 = r4.f15664f
            if (r5 == 0) goto L_0x054f
            int r3 = r48.f()
        L_0x054f:
            r5 = r44
            if (r2 == r5) goto L_0x056e
            boolean r2 = r0.f15697j
            if (r2 == 0) goto L_0x056b
            boolean r2 = r14.f14560k
            if (r2 == 0) goto L_0x056b
            s.e r2 = r0.f15680a0
            if (r2 == 0) goto L_0x056b
            s.f r2 = (s.f) r2
            if (r39 == 0) goto L_0x0567
            r2.y1(r4)
            goto L_0x056a
        L_0x0567:
            r2.D1(r4)
        L_0x056a:
            return
        L_0x056b:
            r10.h(r5, r14, r3, r1)
        L_0x056e:
            return
        L_0x056f:
            if (r1 >= r7) goto L_0x05a8
            if (r40 == 0) goto L_0x05a8
            if (r19 == 0) goto L_0x05a8
            r10.h(r8, r11, r3, r13)
            if (r39 != 0) goto L_0x0583
            s.d r1 = r0.S
            s.d r1 = r1.f15664f
            if (r1 != 0) goto L_0x0581
            goto L_0x0583
        L_0x0581:
            r2 = r3
            goto L_0x0585
        L_0x0583:
            r2 = r18
        L_0x0585:
            if (r39 != 0) goto L_0x05a3
            s.d r1 = r0.S
            s.d r1 = r1.f15664f
            if (r1 == 0) goto L_0x05a3
            s.e r1 = r1.f15662d
            float r2 = r1.f15686d0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x05a8
            s.e$b[] r1 = r1.Z
            r2 = r1[r3]
            s.e$b r4 = s.e.b.MATCH_CONSTRAINT
            if (r2 != r4) goto L_0x05a8
            r1 = r1[r18]
            if (r1 != r4) goto L_0x05a8
            goto L_0x05a5
        L_0x05a3:
            if (r2 == 0) goto L_0x05a8
        L_0x05a5:
            r10.h(r5, r14, r3, r13)
        L_0x05a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.i(p.d, boolean, boolean, boolean, boolean, p.i, p.i, s.e$b, boolean, s.d, s.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private void x0(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 != f11) {
            sb2.append(str);
            sb2.append(" :   ");
            sb2.append(f10);
            sb2.append(",\n");
        }
    }

    private void y0(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 != i11) {
            sb2.append(str);
            sb2.append(" :   ");
            sb2.append(i10);
            sb2.append(",\n");
        }
    }

    private void z0(StringBuilder sb2, String str, float f10, int i10) {
        if (f10 != 0.0f) {
            sb2.append(str);
            sb2.append(" :  [");
            sb2.append(f10);
            sb2.append(",");
            sb2.append(i10);
            sb2.append("");
            sb2.append("],\n");
        }
    }

    public b A() {
        return this.Z[0];
    }

    public void A0(int i10) {
        this.f15702l0 = i10;
        this.J = i10 > 0;
    }

    public int B() {
        d dVar = this.O;
        int i10 = dVar != null ? dVar.f15665g : 0;
        d dVar2 = this.Q;
        return dVar2 != null ? i10 + dVar2.f15665g : i10;
    }

    public void B0(Object obj) {
        this.f15712q0 = obj;
    }

    public int C() {
        return this.M;
    }

    public void C0(String str) {
        this.f15720u0 = str;
    }

    public int D() {
        return this.N;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0090
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x0090
        L_0x000b:
            int r1 = r9.length()
            r2 = 44
            int r2 = r9.indexOf(r2)
            r3 = 0
            r4 = 1
            r5 = -1
            if (r2 <= 0) goto L_0x0039
            int r6 = r1 + -1
            if (r2 >= r6) goto L_0x0039
            java.lang.String r6 = r9.substring(r3, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002b
            goto L_0x0036
        L_0x002b:
            java.lang.String r3 = "H"
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0035
            r3 = r4
            goto L_0x0036
        L_0x0035:
            r3 = r5
        L_0x0036:
            int r2 = r2 + r4
            r5 = r3
            r3 = r2
        L_0x0039:
            r2 = 58
            int r2 = r9.indexOf(r2)
            if (r2 < 0) goto L_0x0077
            int r1 = r1 - r4
            if (r2 >= r1) goto L_0x0077
            java.lang.String r1 = r9.substring(r3, r2)
            int r2 = r2 + r4
            java.lang.String r9 = r9.substring(r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x0086
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0086
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x0086 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0086 }
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0086
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0086
            if (r5 != r4) goto L_0x0071
            float r9 = r9 / r1
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x0087
        L_0x0071:
            float r1 = r1 / r9
            float r9 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x0087
        L_0x0077:
            java.lang.String r9 = r9.substring(r3)
            int r1 = r9.length()
            if (r1 <= 0) goto L_0x0086
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x0087
        L_0x0086:
            r9 = r0
        L_0x0087:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008f
            r8.f15686d0 = r9
            r8.f15688e0 = r5
        L_0x008f:
            return
        L_0x0090:
            r8.f15686d0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.D0(java.lang.String):void");
    }

    public int E(int i10) {
        if (i10 == 0) {
            return W();
        }
        if (i10 == 1) {
            return x();
        }
        return 0;
    }

    public void E0(int i10) {
        if (this.J) {
            int i11 = i10 - this.f15702l0;
            int i12 = this.f15684c0 + i11;
            this.f15692g0 = i11;
            this.P.t(i11);
            this.R.t(i12);
            this.S.t(i10);
            this.f15711q = true;
        }
    }

    public int F() {
        return this.H[1];
    }

    public void F0(int i10, int i11) {
        if (!this.f15709p) {
            this.O.t(i10);
            this.Q.t(i11);
            this.f15690f0 = i10;
            this.f15682b0 = i11 - i10;
            this.f15709p = true;
        }
    }

    public int G() {
        return this.H[0];
    }

    public void G0(int i10) {
        this.O.t(i10);
        this.f15690f0 = i10;
    }

    public int H() {
        return this.f15706n0;
    }

    public void H0(int i10) {
        this.P.t(i10);
        this.f15692g0 = i10;
    }

    public int I() {
        return this.f15704m0;
    }

    public void I0(int i10, int i11) {
        if (!this.f15711q) {
            this.P.t(i10);
            this.R.t(i11);
            this.f15692g0 = i10;
            this.f15684c0 = i11 - i10;
            if (this.J) {
                this.S.t(i10 + this.f15702l0);
            }
            this.f15711q = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.R;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s.e J(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            s.d r3 = r2.Q
            s.d r0 = r3.f15664f
            if (r0 == 0) goto L_0x001f
            s.d r1 = r0.f15664f
            if (r1 != r3) goto L_0x001f
            s.e r3 = r0.f15662d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            s.d r3 = r2.R
            s.d r0 = r3.f15664f
            if (r0 == 0) goto L_0x001f
            s.d r1 = r0.f15664f
            if (r1 != r3) goto L_0x001f
            s.e r3 = r0.f15662d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.J(int):s.e");
    }

    public void J0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f15690f0 = i10;
        this.f15692g0 = i11;
        if (this.f15716s0 == 8) {
            this.f15682b0 = 0;
            this.f15684c0 = 0;
            return;
        }
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f15682b0)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f15684c0)) {
            i17 = i14;
        }
        this.f15682b0 = i16;
        this.f15684c0 = i17;
        int i18 = this.f15706n0;
        if (i17 < i18) {
            this.f15684c0 = i18;
        }
        int i19 = this.f15704m0;
        if (i16 < i19) {
            this.f15682b0 = i19;
        }
        int i20 = this.A;
        if (i20 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f15682b0 = Math.min(this.f15682b0, i20);
        }
        int i21 = this.D;
        if (i21 > 0 && this.Z[1] == b.MATCH_CONSTRAINT) {
            this.f15684c0 = Math.min(this.f15684c0, i21);
        }
        int i22 = this.f15682b0;
        if (i16 != i22) {
            this.f15701l = i22;
        }
        int i23 = this.f15684c0;
        if (i17 != i23) {
            this.f15703m = i23;
        }
    }

    public e K() {
        return this.f15680a0;
    }

    public void K0(boolean z10) {
        this.J = z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.P;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s.e L(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            s.d r3 = r2.O
            s.d r0 = r3.f15664f
            if (r0 == 0) goto L_0x001f
            s.d r1 = r0.f15664f
            if (r1 != r3) goto L_0x001f
            s.e r3 = r0.f15662d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            s.d r3 = r2.P
            s.d r0 = r3.f15664f
            if (r0 == 0) goto L_0x001f
            s.d r1 = r0.f15664f
            if (r1 != r3) goto L_0x001f
            s.e r3 = r0.f15662d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.L(int):s.e");
    }

    public void L0(int i10) {
        this.f15684c0 = i10;
        int i11 = this.f15706n0;
        if (i10 < i11) {
            this.f15684c0 = i11;
        }
    }

    public int M() {
        return X() + this.f15682b0;
    }

    public void M0(float f10) {
        this.f15708o0 = f10;
    }

    public p N(int i10) {
        if (i10 == 0) {
            return this.f15687e;
        }
        if (i10 == 1) {
            return this.f15689f;
        }
        return null;
    }

    public void N0(int i10) {
        this.f15730z0 = i10;
    }

    public void O(StringBuilder sb2) {
        sb2.append("  " + this.f15707o + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.f15682b0);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f15684c0);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f15690f0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f15692g0);
        sb2.append("\n");
        Q(sb2, "left", this.O);
        Q(sb2, "top", this.P);
        Q(sb2, "right", this.Q);
        Q(sb2, "bottom", this.R);
        Q(sb2, "baseline", this.S);
        Q(sb2, "centerX", this.T);
        Q(sb2, "centerY", this.U);
        P(sb2, "    width", this.f15682b0, this.f15704m0, this.H[0], this.f15701l, this.f15729z, this.f15723w, this.B, this.D0[0]);
        P(sb2, "    height", this.f15684c0, this.f15706n0, this.H[1], this.f15703m, this.C, this.f15725x, this.E, this.D0[1]);
        z0(sb2, "    dimensionRatio", this.f15686d0, this.f15688e0);
        x0(sb2, "    horizontalBias", this.f15708o0, K0);
        x0(sb2, "    verticalBias", this.f15710p0, K0);
        y0(sb2, "    horizontalChainStyle", this.f15730z0, 0);
        y0(sb2, "    verticalChainStyle", this.A0, 0);
        sb2.append("  }");
    }

    public void O0(int i10, int i11) {
        this.f15690f0 = i10;
        int i12 = i11 - i10;
        this.f15682b0 = i12;
        int i13 = this.f15704m0;
        if (i12 < i13) {
            this.f15682b0 = i13;
        }
    }

    public void P0(b bVar) {
        this.Z[0] = bVar;
    }

    public void Q0(int i10, int i11, int i12, float f10) {
        this.f15723w = i10;
        this.f15729z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.A = i12;
        this.B = f10;
        if (f10 > 0.0f && f10 < 1.0f && i10 == 0) {
            this.f15723w = 2;
        }
    }

    public float R() {
        return this.f15710p0;
    }

    public void R0(float f10) {
        this.D0[0] = f10;
    }

    public int S() {
        return this.A0;
    }

    /* access modifiers changed from: protected */
    public void S0(int i10, boolean z10) {
        this.Y[i10] = z10;
    }

    public b T() {
        return this.Z[1];
    }

    public void T0(boolean z10) {
        this.K = z10;
    }

    public int U() {
        int i10 = this.O != null ? this.P.f15665g : 0;
        return this.Q != null ? i10 + this.R.f15665g : i10;
    }

    public void U0(boolean z10) {
        this.L = z10;
    }

    public int V() {
        return this.f15716s0;
    }

    public void V0(int i10, int i11) {
        this.M = i10;
        this.N = i11;
        Y0(false);
    }

    public int W() {
        if (this.f15716s0 == 8) {
            return 0;
        }
        return this.f15682b0;
    }

    public void W0(int i10) {
        this.H[1] = i10;
    }

    public int X() {
        e eVar = this.f15680a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f15690f0 : ((f) eVar).S0 + this.f15690f0;
    }

    public void X0(int i10) {
        this.H[0] = i10;
    }

    public int Y() {
        e eVar = this.f15680a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f15692g0 : ((f) eVar).T0 + this.f15692g0;
    }

    public void Y0(boolean z10) {
        this.f15695i = z10;
    }

    public boolean Z() {
        return this.J;
    }

    public void Z0(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f15706n0 = i10;
    }

    public boolean a0(int i10) {
        if (i10 == 0) {
            return (this.O.f15664f != null ? 1 : 0) + (this.Q.f15664f != null ? 1 : 0) < 2;
        }
        return ((this.P.f15664f != null ? 1 : 0) + (this.R.f15664f != null ? 1 : 0)) + (this.S.f15664f != null ? 1 : 0) < 2;
    }

    public void a1(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f15704m0 = i10;
    }

    public boolean b0() {
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((d) this.X.get(i10)).m()) {
                return true;
            }
        }
        return false;
    }

    public void b1(int i10, int i11) {
        this.f15690f0 = i10;
        this.f15692g0 = i11;
    }

    public boolean c0() {
        return (this.f15701l == -1 && this.f15703m == -1) ? false : true;
    }

    public void c1(e eVar) {
        this.f15680a0 = eVar;
    }

    public boolean d0(int i10, int i11) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.O.f15664f;
            if (dVar3 != null && dVar3.n() && (dVar2 = this.Q.f15664f) != null && dVar2.n()) {
                return (this.Q.f15664f.e() - this.Q.f()) - (this.O.f15664f.e() + this.O.f()) >= i11;
            }
        } else {
            d dVar4 = this.P.f15664f;
            if (dVar4 != null && dVar4.n() && (dVar = this.R.f15664f) != null && dVar.n()) {
                return (this.R.f15664f.e() - this.R.f()) - (this.P.f15664f.e() + this.P.f()) >= i11;
            }
        }
        return false;
    }

    public void d1(float f10) {
        this.f15710p0 = f10;
    }

    public void e(f fVar, p.d dVar, HashSet hashSet, int i10, boolean z10) {
        if (z10) {
            if (hashSet.contains(this)) {
                k.a(fVar, dVar, this);
                hashSet.remove(this);
                g(dVar, fVar.T1(64));
            } else {
                return;
            }
        }
        if (i10 == 0) {
            HashSet d10 = this.O.d();
            if (d10 != null) {
                Iterator it = d10.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f15662d.e(fVar, dVar, hashSet, i10, true);
                }
            }
            HashSet d11 = this.Q.d();
            if (d11 != null) {
                Iterator it2 = d11.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).f15662d.e(fVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet d12 = this.P.d();
        if (d12 != null) {
            Iterator it3 = d12.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).f15662d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet d13 = this.R.d();
        if (d13 != null) {
            Iterator it4 = d13.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).f15662d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet d14 = this.S.d();
        if (d14 != null) {
            Iterator it5 = d14.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).f15662d.e(fVar, dVar, hashSet, i10, true);
            }
        }
    }

    public void e0(d.b bVar, e eVar, d.b bVar2, int i10, int i11) {
        o(bVar).b(eVar.o(bVar2), i10, i11, true);
    }

    public void e1(int i10) {
        this.A0 = i10;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return (this instanceof l) || (this instanceof h);
    }

    public void f1(int i10, int i11) {
        this.f15692g0 = i10;
        int i12 = i11 - i10;
        this.f15684c0 = i12;
        int i13 = this.f15706n0;
        if (i12 < i13) {
            this.f15684c0 = i13;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04a5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0540  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0543  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x05ad  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x05b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(p.d r54, boolean r55) {
        /*
            r53 = this;
            r15 = r53
            r14 = r54
            s.d r0 = r15.O
            p.i r13 = r14.q(r0)
            s.d r0 = r15.Q
            p.i r12 = r14.q(r0)
            s.d r0 = r15.P
            p.i r11 = r14.q(r0)
            s.d r0 = r15.R
            p.i r10 = r14.q(r0)
            s.d r0 = r15.S
            p.i r9 = r14.q(r0)
            s.e r0 = r15.f15680a0
            r8 = 2
            r1 = 3
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x004f
            if (r0 == 0) goto L_0x0036
            s.e$b[] r2 = r0.Z
            r2 = r2[r6]
            s.e$b r3 = s.e.b.WRAP_CONTENT
            if (r2 != r3) goto L_0x0036
            r2 = r7
            goto L_0x0037
        L_0x0036:
            r2 = r6
        L_0x0037:
            if (r0 == 0) goto L_0x0043
            s.e$b[] r0 = r0.Z
            r0 = r0[r7]
            s.e$b r3 = s.e.b.WRAP_CONTENT
            if (r0 != r3) goto L_0x0043
            r0 = r7
            goto L_0x0044
        L_0x0043:
            r0 = r6
        L_0x0044:
            int r3 = r15.f15721v
            if (r3 == r7) goto L_0x0055
            if (r3 == r8) goto L_0x0052
            if (r3 == r1) goto L_0x004f
            r5 = r0
            r4 = r2
            goto L_0x0057
        L_0x004f:
            r4 = r6
            r5 = r4
            goto L_0x0057
        L_0x0052:
            r5 = r0
            r4 = r6
            goto L_0x0057
        L_0x0055:
            r4 = r2
            r5 = r6
        L_0x0057:
            int r0 = r15.f15716s0
            r3 = 8
            if (r0 != r3) goto L_0x0072
            boolean r0 = r15.f15718t0
            if (r0 != 0) goto L_0x0072
            boolean r0 = r53.b0()
            if (r0 != 0) goto L_0x0072
            boolean[] r0 = r15.Y
            boolean r2 = r0[r6]
            if (r2 != 0) goto L_0x0072
            boolean r0 = r0[r7]
            if (r0 != 0) goto L_0x0072
            return
        L_0x0072:
            boolean r0 = r15.f15709p
            r2 = 5
            if (r0 != 0) goto L_0x007b
            boolean r8 = r15.f15711q
            if (r8 == 0) goto L_0x00f8
        L_0x007b:
            if (r0 == 0) goto L_0x00aa
            int r0 = r15.f15690f0
            r14.f(r13, r0)
            int r0 = r15.f15690f0
            int r8 = r15.f15682b0
            int r0 = r0 + r8
            r14.f(r12, r0)
            if (r4 == 0) goto L_0x00aa
            s.e r0 = r15.f15680a0
            if (r0 == 0) goto L_0x00aa
            boolean r8 = r15.f15699k
            if (r8 == 0) goto L_0x00a1
            s.f r0 = (s.f) r0
            s.d r8 = r15.O
            r0.z1(r8)
            s.d r8 = r15.Q
            r0.y1(r8)
            goto L_0x00aa
        L_0x00a1:
            s.d r0 = r0.Q
            p.i r0 = r14.q(r0)
            r14.h(r0, r12, r6, r2)
        L_0x00aa:
            boolean r0 = r15.f15711q
            if (r0 == 0) goto L_0x00eb
            int r0 = r15.f15692g0
            r14.f(r11, r0)
            int r0 = r15.f15692g0
            int r8 = r15.f15684c0
            int r0 = r0 + r8
            r14.f(r10, r0)
            s.d r0 = r15.S
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x00cb
            int r0 = r15.f15692g0
            int r8 = r15.f15702l0
            int r0 = r0 + r8
            r14.f(r9, r0)
        L_0x00cb:
            if (r5 == 0) goto L_0x00eb
            s.e r0 = r15.f15680a0
            if (r0 == 0) goto L_0x00eb
            boolean r8 = r15.f15699k
            if (r8 == 0) goto L_0x00e2
            s.f r0 = (s.f) r0
            s.d r8 = r15.P
            r0.E1(r8)
            s.d r8 = r15.R
            r0.D1(r8)
            goto L_0x00eb
        L_0x00e2:
            s.d r0 = r0.R
            p.i r0 = r14.q(r0)
            r14.h(r0, r10, r6, r2)
        L_0x00eb:
            boolean r0 = r15.f15709p
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r15.f15711q
            if (r0 == 0) goto L_0x00f8
            r15.f15709p = r6
            r15.f15711q = r6
            return
        L_0x00f8:
            boolean r0 = p.d.f14515r
            if (r55 == 0) goto L_0x0180
            t.l r0 = r15.f15687e
            if (r0 == 0) goto L_0x0180
            t.n r8 = r15.f15689f
            if (r8 == 0) goto L_0x0180
            t.f r2 = r0.f16226h
            boolean r1 = r2.f16175j
            if (r1 == 0) goto L_0x0180
            t.f r0 = r0.f16227i
            boolean r0 = r0.f16175j
            if (r0 == 0) goto L_0x0180
            t.f r0 = r8.f16226h
            boolean r0 = r0.f16175j
            if (r0 == 0) goto L_0x0180
            t.f r0 = r8.f16227i
            boolean r0 = r0.f16175j
            if (r0 == 0) goto L_0x0180
            int r0 = r2.f16172g
            r14.f(r13, r0)
            t.l r0 = r15.f15687e
            t.f r0 = r0.f16227i
            int r0 = r0.f16172g
            r14.f(r12, r0)
            t.n r0 = r15.f15689f
            t.f r0 = r0.f16226h
            int r0 = r0.f16172g
            r14.f(r11, r0)
            t.n r0 = r15.f15689f
            t.f r0 = r0.f16227i
            int r0 = r0.f16172g
            r14.f(r10, r0)
            t.n r0 = r15.f15689f
            t.f r0 = r0.f16201k
            int r0 = r0.f16172g
            r14.f(r9, r0)
            s.e r0 = r15.f15680a0
            if (r0 == 0) goto L_0x017b
            if (r4 == 0) goto L_0x0162
            boolean[] r0 = r15.f15691g
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x0162
            boolean r0 = r53.i0()
            if (r0 != 0) goto L_0x0162
            s.e r0 = r15.f15680a0
            s.d r0 = r0.Q
            p.i r0 = r14.q(r0)
            r14.h(r0, r12, r6, r3)
        L_0x0162:
            if (r5 == 0) goto L_0x017b
            boolean[] r0 = r15.f15691g
            boolean r0 = r0[r7]
            if (r0 == 0) goto L_0x017b
            boolean r0 = r53.k0()
            if (r0 != 0) goto L_0x017b
            s.e r0 = r15.f15680a0
            s.d r0 = r0.R
            p.i r0 = r14.q(r0)
            r14.h(r0, r10, r6, r3)
        L_0x017b:
            r15.f15709p = r6
            r15.f15711q = r6
            return
        L_0x0180:
            s.e r0 = r15.f15680a0
            if (r0 == 0) goto L_0x01f1
            boolean r0 = r15.f0(r6)
            if (r0 == 0) goto L_0x0193
            s.e r0 = r15.f15680a0
            s.f r0 = (s.f) r0
            r0.v1(r15, r6)
            r0 = r7
            goto L_0x0197
        L_0x0193:
            boolean r0 = r53.i0()
        L_0x0197:
            boolean r1 = r15.f0(r7)
            if (r1 == 0) goto L_0x01a6
            s.e r1 = r15.f15680a0
            s.f r1 = (s.f) r1
            r1.v1(r15, r7)
            r1 = r7
            goto L_0x01aa
        L_0x01a6:
            boolean r1 = r53.k0()
        L_0x01aa:
            if (r0 != 0) goto L_0x01c9
            if (r4 == 0) goto L_0x01c9
            int r2 = r15.f15716s0
            if (r2 == r3) goto L_0x01c9
            s.d r2 = r15.O
            s.d r2 = r2.f15664f
            if (r2 != 0) goto L_0x01c9
            s.d r2 = r15.Q
            s.d r2 = r2.f15664f
            if (r2 != 0) goto L_0x01c9
            s.e r2 = r15.f15680a0
            s.d r2 = r2.Q
            p.i r2 = r14.q(r2)
            r14.h(r2, r12, r6, r7)
        L_0x01c9:
            if (r1 != 0) goto L_0x01ec
            if (r5 == 0) goto L_0x01ec
            int r2 = r15.f15716s0
            if (r2 == r3) goto L_0x01ec
            s.d r2 = r15.P
            s.d r2 = r2.f15664f
            if (r2 != 0) goto L_0x01ec
            s.d r2 = r15.R
            s.d r2 = r2.f15664f
            if (r2 != 0) goto L_0x01ec
            s.d r2 = r15.S
            if (r2 != 0) goto L_0x01ec
            s.e r2 = r15.f15680a0
            s.d r2 = r2.R
            p.i r2 = r14.q(r2)
            r14.h(r2, r10, r6, r7)
        L_0x01ec:
            r29 = r0
            r28 = r1
            goto L_0x01f5
        L_0x01f1:
            r28 = r6
            r29 = r28
        L_0x01f5:
            int r0 = r15.f15682b0
            int r1 = r15.f15704m0
            if (r0 >= r1) goto L_0x01fc
            goto L_0x01fd
        L_0x01fc:
            r1 = r0
        L_0x01fd:
            int r2 = r15.f15684c0
            int r8 = r15.f15706n0
            if (r2 >= r8) goto L_0x0204
            goto L_0x0205
        L_0x0204:
            r8 = r2
        L_0x0205:
            s.e$b[] r3 = r15.Z
            r7 = r3[r6]
            s.e$b r6 = s.e.b.MATCH_CONSTRAINT
            r22 = r1
            if (r7 == r6) goto L_0x0213
            r1 = 1
        L_0x0210:
            r20 = 1
            goto L_0x0215
        L_0x0213:
            r1 = 0
            goto L_0x0210
        L_0x0215:
            r3 = r3[r20]
            r23 = r8
            r27 = r9
            if (r3 == r6) goto L_0x021f
            r8 = 1
            goto L_0x0220
        L_0x021f:
            r8 = 0
        L_0x0220:
            int r9 = r15.f15688e0
            r15.F = r9
            r30 = r10
            float r10 = r15.f15686d0
            r15.G = r10
            r31 = r11
            int r11 = r15.f15723w
            r32 = r12
            int r12 = r15.f15725x
            r24 = 0
            int r24 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1))
            r33 = r13
            if (r24 <= 0) goto L_0x02a7
            int r13 = r15.f15716s0
            r14 = 8
            if (r13 == r14) goto L_0x02a7
            if (r7 != r6) goto L_0x0245
            if (r11 != 0) goto L_0x0245
            r11 = 3
        L_0x0245:
            if (r3 != r6) goto L_0x024a
            if (r12 != 0) goto L_0x024a
            r12 = 3
        L_0x024a:
            if (r7 != r6) goto L_0x0257
            if (r3 != r6) goto L_0x0257
            r13 = 3
            if (r11 != r13) goto L_0x0258
            if (r12 != r13) goto L_0x0258
            r15.o1(r4, r5, r1, r8)
            goto L_0x02a0
        L_0x0257:
            r13 = 3
        L_0x0258:
            r1 = 4
            if (r7 != r6) goto L_0x0277
            if (r11 != r13) goto L_0x0277
            r8 = 0
            r15.F = r8
            float r0 = (float) r2
            float r10 = r10 * r0
            int r0 = (int) r10
            if (r3 == r6) goto L_0x026e
            r36 = r1
            r35 = r12
            r34 = r23
            r14 = 0
            r1 = r0
            goto L_0x02b0
        L_0x026e:
            r1 = r0
            r36 = r11
            r35 = r12
        L_0x0273:
            r34 = r23
        L_0x0275:
            r14 = 1
            goto L_0x02b0
        L_0x0277:
            if (r3 != r6) goto L_0x02a0
            if (r12 != r13) goto L_0x02a0
            r2 = 1
            r15.F = r2
            r2 = -1
            if (r9 != r2) goto L_0x0286
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r10
            r15.G = r2
        L_0x0286:
            float r2 = r15.G
            float r0 = (float) r0
            float r2 = r2 * r0
            int r8 = (int) r2
            if (r7 == r6) goto L_0x0297
            r35 = r1
            r34 = r8
            r36 = r11
            r1 = r22
        L_0x0295:
            r14 = 0
            goto L_0x02b0
        L_0x0297:
            r34 = r8
            r36 = r11
            r35 = r12
            r1 = r22
            goto L_0x0275
        L_0x02a0:
            r36 = r11
            r35 = r12
            r1 = r22
            goto L_0x0273
        L_0x02a7:
            r36 = r11
            r35 = r12
            r1 = r22
            r34 = r23
            goto L_0x0295
        L_0x02b0:
            int[] r0 = r15.f15727y
            r2 = 0
            r0[r2] = r36
            r2 = 1
            r0[r2] = r35
            r15.f15693h = r14
            if (r14 == 0) goto L_0x02c6
            int r0 = r15.F
            r2 = -1
            if (r0 == 0) goto L_0x02c3
            if (r0 != r2) goto L_0x02c7
        L_0x02c3:
            r18 = 1
            goto L_0x02c9
        L_0x02c6:
            r2 = -1
        L_0x02c7:
            r18 = 0
        L_0x02c9:
            if (r14 == 0) goto L_0x02d5
            int r0 = r15.F
            r3 = 1
            if (r0 == r3) goto L_0x02d2
            if (r0 != r2) goto L_0x02d5
        L_0x02d2:
            r37 = 1
            goto L_0x02d7
        L_0x02d5:
            r37 = 0
        L_0x02d7:
            s.e$b[] r0 = r15.Z
            r2 = 0
            r0 = r0[r2]
            s.e$b r13 = s.e.b.WRAP_CONTENT
            if (r0 != r13) goto L_0x02e6
            boolean r0 = r15 instanceof s.f
            if (r0 == 0) goto L_0x02e6
            r9 = 1
            goto L_0x02e7
        L_0x02e6:
            r9 = 0
        L_0x02e7:
            if (r9 == 0) goto L_0x02ec
            r22 = 0
            goto L_0x02ee
        L_0x02ec:
            r22 = r1
        L_0x02ee:
            s.d r0 = r15.V
            boolean r0 = r0.o()
            r1 = 1
            r38 = r0 ^ 1
            boolean[] r0 = r15.Y
            r2 = 0
            boolean r23 = r0[r2]
            boolean r39 = r0[r1]
            int r0 = r15.f15717t
            r40 = 0
            r8 = 2
            if (r0 == r8) goto L_0x0373
            boolean r0 = r15.f15709p
            if (r0 != 0) goto L_0x0373
            if (r55 == 0) goto L_0x031b
            t.l r0 = r15.f15687e
            if (r0 == 0) goto L_0x031b
            t.f r1 = r0.f16226h
            boolean r2 = r1.f16175j
            if (r2 == 0) goto L_0x031b
            t.f r0 = r0.f16227i
            boolean r0 = r0.f16175j
            if (r0 != 0) goto L_0x0325
        L_0x031b:
            r12 = r54
            r10 = r32
            r11 = r33
            r3 = 8
            goto L_0x0389
        L_0x0325:
            if (r55 == 0) goto L_0x0371
            int r0 = r1.f16172g
            r12 = r54
            r11 = r33
            r12.f(r11, r0)
            t.l r0 = r15.f15687e
            t.f r0 = r0.f16227i
            int r0 = r0.f16172g
            r10 = r32
            r12.f(r10, r0)
            s.e r0 = r15.f15680a0
            if (r0 == 0) goto L_0x035b
            if (r4 == 0) goto L_0x035b
            boolean[] r0 = r15.f15691g
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x035b
            boolean r0 = r53.i0()
            if (r0 != 0) goto L_0x035b
            s.e r0 = r15.f15680a0
            s.d r0 = r0.Q
            p.i r0 = r12.q(r0)
            r3 = 8
            r12.h(r0, r10, r1, r3)
        L_0x035b:
            r43 = r4
            r47 = r5
            r48 = r6
            r52 = r13
            r32 = r14
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r10
            r31 = r11
            goto L_0x0429
        L_0x0371:
            r12 = r54
        L_0x0373:
            r43 = r4
            r47 = r5
            r48 = r6
            r52 = r13
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r32
            r31 = r33
            r32 = r14
            goto L_0x0429
        L_0x0389:
            s.e r0 = r15.f15680a0
            if (r0 == 0) goto L_0x0395
            s.d r0 = r0.Q
            p.i r0 = r12.q(r0)
            r7 = r0
            goto L_0x0397
        L_0x0395:
            r7 = r40
        L_0x0397:
            s.e r0 = r15.f15680a0
            if (r0 == 0) goto L_0x03a4
            s.d r0 = r0.O
            p.i r0 = r12.q(r0)
            r16 = r0
            goto L_0x03a6
        L_0x03a4:
            r16 = r40
        L_0x03a6:
            boolean[] r0 = r15.f15691g
            r19 = 0
            boolean r21 = r0[r19]
            s.e$b[] r0 = r15.Z
            r32 = r0[r19]
            s.d r1 = r15.O
            s.d r2 = r15.Q
            r41 = r2
            int r2 = r15.f15690f0
            r42 = r2
            int r2 = r15.f15704m0
            int[] r3 = r15.H
            r44 = r3[r19]
            float r3 = r15.f15708o0
            r20 = 1
            r0 = r0[r20]
            if (r0 != r6) goto L_0x03cb
            r45 = r20
            goto L_0x03cd
        L_0x03cb:
            r45 = r19
        L_0x03cd:
            int r0 = r15.f15729z
            r24 = r0
            int r0 = r15.A
            r25 = r0
            float r0 = r15.B
            r26 = r0
            r0 = r53
            r46 = r1
            r1 = r54
            r17 = r41
            r33 = r42
            r41 = r2
            r2 = 1
            r42 = r3
            r3 = r4
            r43 = r4
            r4 = r5
            r47 = r5
            r5 = r21
            r48 = r6
            r6 = r16
            r8 = r32
            r49 = r27
            r16 = r10
            r50 = r30
            r10 = r46
            r19 = r11
            r51 = r31
            r11 = r17
            r30 = r16
            r12 = r33
            r52 = r13
            r31 = r19
            r13 = r22
            r32 = r14
            r14 = r41
            r15 = r44
            r16 = r42
            r17 = r18
            r18 = r45
            r19 = r29
            r20 = r28
            r21 = r23
            r22 = r36
            r23 = r35
            r27 = r38
            r0.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0429:
            if (r55 == 0) goto L_0x048f
            r15 = r53
            t.n r0 = r15.f15689f
            if (r0 == 0) goto L_0x0482
            t.f r1 = r0.f16226h
            boolean r2 = r1.f16175j
            if (r2 == 0) goto L_0x0482
            t.f r0 = r0.f16227i
            boolean r0 = r0.f16175j
            if (r0 == 0) goto L_0x0482
            int r0 = r1.f16172g
            r14 = r54
            r13 = r51
            r14.f(r13, r0)
            t.n r0 = r15.f15689f
            t.f r0 = r0.f16227i
            int r0 = r0.f16172g
            r12 = r50
            r14.f(r12, r0)
            t.n r0 = r15.f15689f
            t.f r0 = r0.f16201k
            int r0 = r0.f16172g
            r1 = r49
            r14.f(r1, r0)
            s.e r0 = r15.f15680a0
            if (r0 == 0) goto L_0x047c
            if (r28 != 0) goto L_0x047c
            if (r47 == 0) goto L_0x047c
            boolean[] r2 = r15.f15691g
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x0478
            s.d r0 = r0.R
            p.i r0 = r14.q(r0)
            r2 = 8
            r10 = 0
            r14.h(r0, r12, r10, r2)
            goto L_0x0480
        L_0x0478:
            r2 = 8
            r10 = 0
            goto L_0x0480
        L_0x047c:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x0480:
            r7 = r10
            goto L_0x049e
        L_0x0482:
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x049d
        L_0x048f:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r53
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
        L_0x049d:
            r7 = r11
        L_0x049e:
            int r0 = r15.f15719u
            r3 = 2
            if (r0 != r3) goto L_0x04a5
            goto L_0x0583
        L_0x04a5:
            if (r7 == 0) goto L_0x0583
            boolean r0 = r15.f15711q
            if (r0 != 0) goto L_0x0583
            s.e$b[] r0 = r15.Z
            r0 = r0[r11]
            r3 = r52
            if (r0 != r3) goto L_0x04b9
            boolean r0 = r15 instanceof s.f
            if (r0 == 0) goto L_0x04b9
            r9 = r11
            goto L_0x04ba
        L_0x04b9:
            r9 = r10
        L_0x04ba:
            if (r9 == 0) goto L_0x04be
            r34 = r10
        L_0x04be:
            s.e r0 = r15.f15680a0
            if (r0 == 0) goto L_0x04ca
            s.d r0 = r0.R
            p.i r0 = r14.q(r0)
            r7 = r0
            goto L_0x04cc
        L_0x04ca:
            r7 = r40
        L_0x04cc:
            s.e r0 = r15.f15680a0
            if (r0 == 0) goto L_0x04d8
            s.d r0 = r0.P
            p.i r0 = r14.q(r0)
            r6 = r0
            goto L_0x04da
        L_0x04d8:
            r6 = r40
        L_0x04da:
            int r0 = r15.f15702l0
            if (r0 > 0) goto L_0x04e2
            int r0 = r15.f15716s0
            if (r0 != r2) goto L_0x0520
        L_0x04e2:
            s.d r0 = r15.S
            s.d r3 = r0.f15664f
            if (r3 == 0) goto L_0x050f
            int r0 = r53.p()
            r14.e(r1, r13, r0, r2)
            s.d r0 = r15.S
            s.d r0 = r0.f15664f
            p.i r0 = r14.q(r0)
            s.d r3 = r15.S
            int r3 = r3.f()
            r14.e(r1, r0, r3, r2)
            if (r47 == 0) goto L_0x050c
            s.d r0 = r15.R
            p.i r0 = r14.q(r0)
            r1 = 5
            r14.h(r7, r0, r10, r1)
        L_0x050c:
            r27 = r10
            goto L_0x0522
        L_0x050f:
            int r3 = r15.f15716s0
            if (r3 != r2) goto L_0x051b
            int r0 = r0.f()
        L_0x0517:
            r14.e(r1, r13, r0, r2)
            goto L_0x0520
        L_0x051b:
            int r0 = r53.p()
            goto L_0x0517
        L_0x0520:
            r27 = r38
        L_0x0522:
            boolean[] r0 = r15.f15691g
            boolean r5 = r0[r11]
            s.e$b[] r0 = r15.Z
            r8 = r0[r11]
            s.d r4 = r15.P
            s.d r3 = r15.R
            int r1 = r15.f15692g0
            int r2 = r15.f15706n0
            int[] r10 = r15.H
            r16 = r10[r11]
            float r10 = r15.f15710p0
            r17 = 0
            r0 = r0[r17]
            r11 = r48
            if (r0 != r11) goto L_0x0543
            r18 = 1
            goto L_0x0545
        L_0x0543:
            r18 = r17
        L_0x0545:
            int r0 = r15.C
            r24 = r0
            int r0 = r15.D
            r25 = r0
            float r0 = r15.E
            r26 = r0
            r0 = r53
            r19 = r1
            r1 = r54
            r20 = r2
            r2 = 0
            r11 = r3
            r3 = r47
            r21 = r4
            r4 = r43
            r17 = r10
            r10 = r21
            r33 = r12
            r12 = r19
            r38 = r13
            r13 = r34
            r14 = r20
            r15 = r16
            r16 = r17
            r17 = r37
            r19 = r28
            r20 = r29
            r21 = r39
            r22 = r35
            r23 = r36
            r0.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0587
        L_0x0583:
            r33 = r12
            r38 = r13
        L_0x0587:
            if (r32 == 0) goto L_0x05ad
            r6 = 8
            r7 = r53
            int r0 = r7.F
            r1 = 1
            float r5 = r7.G
            if (r0 != r1) goto L_0x05a2
            r0 = r54
            r1 = r33
            r2 = r38
            r3 = r30
            r4 = r31
        L_0x059e:
            r0.k(r1, r2, r3, r4, r5, r6)
            goto L_0x05af
        L_0x05a2:
            r0 = r54
            r1 = r30
            r2 = r31
            r3 = r33
            r4 = r38
            goto L_0x059e
        L_0x05ad:
            r7 = r53
        L_0x05af:
            s.d r0 = r7.V
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x05d7
            s.d r0 = r7.V
            s.d r0 = r0.j()
            s.e r0 = r0.h()
            float r1 = r7.I
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            s.d r2 = r7.V
            int r2 = r2.f()
            r3 = r54
            r3.b(r7, r0, r1, r2)
        L_0x05d7:
            r0 = 0
            r7.f15709p = r0
            r7.f15711q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.g(p.d, boolean):void");
    }

    public boolean g0() {
        return this.f15713r;
    }

    public void g1(b bVar) {
        this.Z[1] = bVar;
    }

    public boolean h() {
        return this.f15716s0 != 8;
    }

    public boolean h0(int i10) {
        return this.Y[i10];
    }

    public void h1(int i10, int i11, int i12, float f10) {
        this.f15725x = i10;
        this.C = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.D = i12;
        this.E = f10;
        if (f10 > 0.0f && f10 < 1.0f && i10 == 0) {
            this.f15725x = 2;
        }
    }

    public boolean i0() {
        d dVar = this.O;
        d dVar2 = dVar.f15664f;
        if (dVar2 != null && dVar2.f15664f == dVar) {
            return true;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f15664f;
        return dVar4 != null && dVar4.f15664f == dVar3;
    }

    public void i1(float f10) {
        this.D0[1] = f10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0156, code lost:
        if (r11 != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0187, code lost:
        if (r11.o() != false) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b6, code lost:
        if (r11.o() != false) goto L_0x0189;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(s.d.b r9, s.e r10, s.d.b r11, int r12) {
        /*
            r8 = this;
            s.d$b r0 = s.d.b.CENTER
            r1 = 0
            if (r9 != r0) goto L_0x009e
            s.d$b r9 = s.d.b.LEFT
            if (r11 != r0) goto L_0x0074
            s.d r11 = r8.o(r9)
            s.d$b r12 = s.d.b.RIGHT
            s.d r2 = r8.o(r12)
            s.d$b r3 = s.d.b.TOP
            s.d r4 = r8.o(r3)
            s.d$b r5 = s.d.b.BOTTOM
            s.d r6 = r8.o(r5)
            r7 = 1
            if (r11 == 0) goto L_0x0028
            boolean r11 = r11.o()
            if (r11 != 0) goto L_0x0030
        L_0x0028:
            if (r2 == 0) goto L_0x0032
            boolean r11 = r2.o()
            if (r11 == 0) goto L_0x0032
        L_0x0030:
            r9 = r1
            goto L_0x0039
        L_0x0032:
            r8.j(r9, r10, r9, r1)
            r8.j(r12, r10, r12, r1)
            r9 = r7
        L_0x0039:
            if (r4 == 0) goto L_0x0041
            boolean r11 = r4.o()
            if (r11 != 0) goto L_0x0049
        L_0x0041:
            if (r6 == 0) goto L_0x004b
            boolean r11 = r6.o()
            if (r11 == 0) goto L_0x004b
        L_0x0049:
            r7 = r1
            goto L_0x0051
        L_0x004b:
            r8.j(r3, r10, r3, r1)
            r8.j(r5, r10, r5, r1)
        L_0x0051:
            if (r9 == 0) goto L_0x005e
            if (r7 == 0) goto L_0x005e
            s.d r9 = r8.o(r0)
            s.d r10 = r10.o(r0)
            goto L_0x0093
        L_0x005e:
            if (r9 == 0) goto L_0x006f
            s.d$b r9 = s.d.b.CENTER_X
        L_0x0062:
            s.d r11 = r8.o(r9)
            s.d r9 = r10.o(r9)
            r11.a(r9, r1)
            goto L_0x01bc
        L_0x006f:
            if (r7 == 0) goto L_0x01bc
            s.d$b r9 = s.d.b.CENTER_Y
            goto L_0x0062
        L_0x0074:
            if (r11 == r9) goto L_0x0098
            s.d$b r12 = s.d.b.RIGHT
            if (r11 != r12) goto L_0x007b
            goto L_0x0098
        L_0x007b:
            s.d$b r9 = s.d.b.TOP
            if (r11 == r9) goto L_0x0083
            s.d$b r12 = s.d.b.BOTTOM
            if (r11 != r12) goto L_0x01bc
        L_0x0083:
            r8.j(r9, r10, r11, r1)
            s.d$b r9 = s.d.b.BOTTOM
        L_0x0088:
            r8.j(r9, r10, r11, r1)
            s.d r9 = r8.o(r0)
        L_0x008f:
            s.d r10 = r10.o(r11)
        L_0x0093:
            r9.a(r10, r1)
            goto L_0x01bc
        L_0x0098:
            r8.j(r9, r10, r11, r1)
            s.d$b r9 = s.d.b.RIGHT
            goto L_0x0088
        L_0x009e:
            s.d$b r2 = s.d.b.CENTER_X
            if (r9 != r2) goto L_0x00c3
            s.d$b r3 = s.d.b.LEFT
            if (r11 == r3) goto L_0x00aa
            s.d$b r4 = s.d.b.RIGHT
            if (r11 != r4) goto L_0x00c3
        L_0x00aa:
            s.d r9 = r8.o(r3)
            s.d r10 = r10.o(r11)
            s.d$b r11 = s.d.b.RIGHT
            s.d r11 = r8.o(r11)
            r9.a(r10, r1)
            r11.a(r10, r1)
            s.d r9 = r8.o(r2)
            goto L_0x0093
        L_0x00c3:
            s.d$b r3 = s.d.b.CENTER_Y
            if (r9 != r3) goto L_0x00ec
            s.d$b r4 = s.d.b.TOP
            if (r11 == r4) goto L_0x00cf
            s.d$b r5 = s.d.b.BOTTOM
            if (r11 != r5) goto L_0x00ec
        L_0x00cf:
            s.d r9 = r10.o(r11)
            s.d r10 = r8.o(r4)
            r10.a(r9, r1)
            s.d$b r10 = s.d.b.BOTTOM
            s.d r10 = r8.o(r10)
            r10.a(r9, r1)
            s.d r10 = r8.o(r3)
            r10.a(r9, r1)
            goto L_0x01bc
        L_0x00ec:
            if (r9 != r2) goto L_0x010f
            if (r11 != r2) goto L_0x010f
            s.d$b r9 = s.d.b.LEFT
            s.d r12 = r8.o(r9)
            s.d r9 = r10.o(r9)
            r12.a(r9, r1)
            s.d$b r9 = s.d.b.RIGHT
            s.d r12 = r8.o(r9)
            s.d r9 = r10.o(r9)
            r12.a(r9, r1)
            s.d r9 = r8.o(r2)
            goto L_0x008f
        L_0x010f:
            if (r9 != r3) goto L_0x0133
            if (r11 != r3) goto L_0x0133
            s.d$b r9 = s.d.b.TOP
            s.d r12 = r8.o(r9)
            s.d r9 = r10.o(r9)
            r12.a(r9, r1)
            s.d$b r9 = s.d.b.BOTTOM
            s.d r12 = r8.o(r9)
            s.d r9 = r10.o(r9)
            r12.a(r9, r1)
            s.d r9 = r8.o(r3)
            goto L_0x008f
        L_0x0133:
            s.d r1 = r8.o(r9)
            s.d r10 = r10.o(r11)
            boolean r11 = r1.p(r10)
            if (r11 == 0) goto L_0x01bc
            s.d$b r11 = s.d.b.BASELINE
            if (r9 != r11) goto L_0x0159
            s.d$b r9 = s.d.b.TOP
            s.d r9 = r8.o(r9)
            s.d$b r11 = s.d.b.BOTTOM
            s.d r11 = r8.o(r11)
            if (r9 == 0) goto L_0x0156
            r9.q()
        L_0x0156:
            if (r11 == 0) goto L_0x01b9
            goto L_0x018c
        L_0x0159:
            s.d$b r4 = s.d.b.TOP
            if (r9 == r4) goto L_0x0190
            s.d$b r4 = s.d.b.BOTTOM
            if (r9 != r4) goto L_0x0162
            goto L_0x0190
        L_0x0162:
            s.d$b r11 = s.d.b.LEFT
            if (r9 == r11) goto L_0x016a
            s.d$b r11 = s.d.b.RIGHT
            if (r9 != r11) goto L_0x01b9
        L_0x016a:
            s.d r11 = r8.o(r0)
            s.d r0 = r11.j()
            if (r0 == r10) goto L_0x0177
            r11.q()
        L_0x0177:
            s.d r9 = r8.o(r9)
            s.d r9 = r9.g()
            s.d r11 = r8.o(r2)
            boolean r0 = r11.o()
            if (r0 == 0) goto L_0x01b9
        L_0x0189:
            r9.q()
        L_0x018c:
            r11.q()
            goto L_0x01b9
        L_0x0190:
            s.d r11 = r8.o(r11)
            if (r11 == 0) goto L_0x0199
            r11.q()
        L_0x0199:
            s.d r11 = r8.o(r0)
            s.d r0 = r11.j()
            if (r0 == r10) goto L_0x01a6
            r11.q()
        L_0x01a6:
            s.d r9 = r8.o(r9)
            s.d r9 = r9.g()
            s.d r11 = r8.o(r3)
            boolean r0 = r11.o()
            if (r0 == 0) goto L_0x01b9
            goto L_0x0189
        L_0x01b9:
            r1.a(r10, r12)
        L_0x01bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.e.j(s.d$b, s.e, s.d$b, int):void");
    }

    public boolean j0() {
        return this.K;
    }

    public void j1(int i10) {
        this.f15716s0 = i10;
    }

    public void k(d dVar, d dVar2, int i10) {
        if (dVar.h() == this) {
            j(dVar.k(), dVar2.h(), dVar2.k(), i10);
        }
    }

    public boolean k0() {
        d dVar = this.P;
        d dVar2 = dVar.f15664f;
        if (dVar2 != null && dVar2.f15664f == dVar) {
            return true;
        }
        d dVar3 = this.R;
        d dVar4 = dVar3.f15664f;
        return dVar4 != null && dVar4.f15664f == dVar3;
    }

    public void k1(int i10) {
        this.f15682b0 = i10;
        int i11 = this.f15704m0;
        if (i10 < i11) {
            this.f15682b0 = i11;
        }
    }

    public void l(e eVar, float f10, int i10) {
        d.b bVar = d.b.CENTER;
        e0(bVar, eVar, bVar, i10, 0);
        this.I = f10;
    }

    public boolean l0() {
        return this.L;
    }

    public void l1(int i10) {
        if (i10 >= 0 && i10 <= 3) {
            this.f15721v = i10;
        }
    }

    public void m(p.d dVar) {
        dVar.q(this.O);
        dVar.q(this.P);
        dVar.q(this.Q);
        dVar.q(this.R);
        if (this.f15702l0 > 0) {
            dVar.q(this.S);
        }
    }

    public boolean m0() {
        return this.f15695i && this.f15716s0 != 8;
    }

    public void m1(int i10) {
        this.f15690f0 = i10;
    }

    public void n() {
        if (this.f15687e == null) {
            this.f15687e = new l(this);
        }
        if (this.f15689f == null) {
            this.f15689f = new n(this);
        }
    }

    public boolean n0() {
        return this.f15709p || (this.O.n() && this.Q.n());
    }

    public void n1(int i10) {
        this.f15692g0 = i10;
    }

    public d o(d.b bVar) {
        switch (a.f15731a[bVar.ordinal()]) {
            case 1:
                return this.O;
            case 2:
                return this.P;
            case 3:
                return this.Q;
            case 4:
                return this.R;
            case 5:
                return this.S;
            case 6:
                return this.V;
            case 7:
                return this.T;
            case 8:
                return this.U;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public boolean o0() {
        return this.f15711q || (this.P.n() && this.R.n());
    }

    public void o1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.F == -1) {
            if (z12 && !z13) {
                this.F = 0;
            } else if (!z12 && z13) {
                this.F = 1;
                if (this.f15688e0 == -1) {
                    this.G = 1.0f / this.G;
                }
            }
        }
        if (this.F == 0 && (!this.P.o() || !this.R.o())) {
            this.F = 1;
        } else if (this.F == 1 && (!this.O.o() || !this.Q.o())) {
            this.F = 0;
        }
        if (this.F == -1 && (!this.P.o() || !this.R.o() || !this.O.o() || !this.Q.o())) {
            if (this.P.o() && this.R.o()) {
                this.F = 0;
            } else if (this.O.o() && this.Q.o()) {
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
        if (this.F == -1) {
            int i10 = this.f15729z;
            if (i10 > 0 && this.C == 0) {
                this.F = 0;
            } else if (i10 == 0 && this.C > 0) {
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
    }

    public int p() {
        return this.f15702l0;
    }

    public boolean p0() {
        return this.f15715s;
    }

    public void p1(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean k10 = z10 & this.f15687e.k();
        boolean k11 = z11 & this.f15689f.k();
        l lVar = this.f15687e;
        int i12 = lVar.f16226h.f16172g;
        n nVar = this.f15689f;
        int i13 = nVar.f16226h.f16172g;
        int i14 = lVar.f16227i.f16172g;
        int i15 = nVar.f16227i.f16172g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (k10) {
            this.f15690f0 = i12;
        }
        if (k11) {
            this.f15692g0 = i13;
        }
        if (this.f15716s0 == 8) {
            this.f15682b0 = 0;
            this.f15684c0 = 0;
            return;
        }
        if (k10) {
            if (this.Z[0] == b.FIXED && i17 < (i11 = this.f15682b0)) {
                i17 = i11;
            }
            this.f15682b0 = i17;
            int i19 = this.f15704m0;
            if (i17 < i19) {
                this.f15682b0 = i19;
            }
        }
        if (k11) {
            if (this.Z[1] == b.FIXED && i18 < (i10 = this.f15684c0)) {
                i18 = i10;
            }
            this.f15684c0 = i18;
            int i20 = this.f15706n0;
            if (i18 < i20) {
                this.f15684c0 = i20;
            }
        }
    }

    public float q(int i10) {
        if (i10 == 0) {
            return this.f15708o0;
        }
        if (i10 == 1) {
            return this.f15710p0;
        }
        return -1.0f;
    }

    public void q0() {
        this.f15713r = true;
    }

    public void q1(p.d dVar, boolean z10) {
        n nVar;
        l lVar;
        int x10 = dVar.x(this.O);
        int x11 = dVar.x(this.P);
        int x12 = dVar.x(this.Q);
        int x13 = dVar.x(this.R);
        if (z10 && (lVar = this.f15687e) != null) {
            f fVar = lVar.f16226h;
            if (fVar.f16175j) {
                f fVar2 = lVar.f16227i;
                if (fVar2.f16175j) {
                    x10 = fVar.f16172g;
                    x12 = fVar2.f16172g;
                }
            }
        }
        if (z10 && (nVar = this.f15689f) != null) {
            f fVar3 = nVar.f16226h;
            if (fVar3.f16175j) {
                f fVar4 = nVar.f16227i;
                if (fVar4.f16175j) {
                    x11 = fVar3.f16172g;
                    x13 = fVar4.f16172g;
                }
            }
        }
        int i10 = x13 - x11;
        if (x12 - x10 < 0 || i10 < 0 || x10 == Integer.MIN_VALUE || x10 == Integer.MAX_VALUE || x11 == Integer.MIN_VALUE || x11 == Integer.MAX_VALUE || x12 == Integer.MIN_VALUE || x12 == Integer.MAX_VALUE || x13 == Integer.MIN_VALUE || x13 == Integer.MAX_VALUE) {
            x10 = 0;
            x13 = 0;
            x11 = 0;
            x12 = 0;
        }
        J0(x10, x11, x12, x13);
    }

    public int r() {
        return Y() + this.f15684c0;
    }

    public void r0() {
        this.f15715s = true;
    }

    public Object s() {
        return this.f15712q0;
    }

    public boolean s0() {
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public String t() {
        return this.f15720u0;
    }

    public void t0() {
        this.O.q();
        this.P.q();
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.f15680a0 = null;
        this.I = 0.0f;
        this.f15682b0 = 0;
        this.f15684c0 = 0;
        this.f15686d0 = 0.0f;
        this.f15688e0 = -1;
        this.f15690f0 = 0;
        this.f15692g0 = 0;
        this.f15698j0 = 0;
        this.f15700k0 = 0;
        this.f15702l0 = 0;
        this.f15704m0 = 0;
        this.f15706n0 = 0;
        float f10 = K0;
        this.f15708o0 = f10;
        this.f15710p0 = f10;
        b[] bVarArr = this.Z;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f15712q0 = null;
        this.f15714r0 = 0;
        this.f15716s0 = 0;
        this.f15722v0 = null;
        this.f15724w0 = false;
        this.f15726x0 = false;
        this.f15730z0 = 0;
        this.A0 = 0;
        this.B0 = false;
        this.C0 = false;
        float[] fArr = this.D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f15717t = -1;
        this.f15719u = -1;
        int[] iArr = this.H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f15723w = 0;
        this.f15725x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.f15729z = 0;
        this.C = 0;
        this.f15693h = false;
        this.F = -1;
        this.G = 1.0f;
        this.f15728y0 = false;
        boolean[] zArr = this.f15691g;
        zArr[0] = true;
        zArr[1] = true;
        this.L = false;
        boolean[] zArr2 = this.Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f15695i = true;
        int[] iArr2 = this.f15727y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f15701l = -1;
        this.f15703m = -1;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f15722v0 != null) {
            str = "type: " + this.f15722v0 + " ";
        } else {
            str = str2;
        }
        sb2.append(str);
        if (this.f15720u0 != null) {
            str2 = "id: " + this.f15720u0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f15690f0);
        sb2.append(", ");
        sb2.append(this.f15692g0);
        sb2.append(") - (");
        sb2.append(this.f15682b0);
        sb2.append(" x ");
        sb2.append(this.f15684c0);
        sb2.append(")");
        return sb2.toString();
    }

    public b u(int i10) {
        if (i10 == 0) {
            return A();
        }
        if (i10 == 1) {
            return T();
        }
        return null;
    }

    public void u0() {
        e K2 = K();
        if (K2 == null || !(K2 instanceof f) || !((f) K()).L1()) {
            int size = this.X.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((d) this.X.get(i10)).q();
            }
        }
    }

    public float v() {
        return this.f15686d0;
    }

    public void v0() {
        this.f15709p = false;
        this.f15711q = false;
        this.f15713r = false;
        this.f15715s = false;
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.X.get(i10)).r();
        }
    }

    public int w() {
        return this.f15688e0;
    }

    public void w0(p.c cVar) {
        this.O.s(cVar);
        this.P.s(cVar);
        this.Q.s(cVar);
        this.R.s(cVar);
        this.S.s(cVar);
        this.V.s(cVar);
        this.T.s(cVar);
        this.U.s(cVar);
    }

    public int x() {
        if (this.f15716s0 == 8) {
            return 0;
        }
        return this.f15684c0;
    }

    public float y() {
        return this.f15708o0;
    }

    public int z() {
        return this.f15730z0;
    }
}
