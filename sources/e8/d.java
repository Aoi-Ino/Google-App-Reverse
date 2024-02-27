package e8;

import a8.y;
import f.j;
import java.util.ArrayList;

public class d {

    /* renamed from: w  reason: collision with root package name */
    protected static final s f10582w;

    /* renamed from: a  reason: collision with root package name */
    protected int f10583a;

    /* renamed from: b  reason: collision with root package name */
    protected int f10584b = 256;

    /* renamed from: c  reason: collision with root package name */
    protected char[] f10585c = new char[256];

    /* renamed from: d  reason: collision with root package name */
    protected e0[] f10586d = new e0[256];

    /* renamed from: e  reason: collision with root package name */
    protected int f10587e = 0;

    /* renamed from: f  reason: collision with root package name */
    protected byte[] f10588f = new byte[256];

    /* renamed from: g  reason: collision with root package name */
    protected int[] f10589g = new int[256];

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList f10590h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    protected int f10591i = 0;

    /* renamed from: j  reason: collision with root package name */
    protected int f10592j = 0;

    /* renamed from: k  reason: collision with root package name */
    protected int f10593k = 0;

    /* renamed from: l  reason: collision with root package name */
    protected int f10594l;

    /* renamed from: m  reason: collision with root package name */
    protected char[] f10595m = new char[0];

    /* renamed from: n  reason: collision with root package name */
    protected e0[] f10596n = new e0[0];

    /* renamed from: o  reason: collision with root package name */
    protected int f10597o = 0;

    /* renamed from: p  reason: collision with root package name */
    protected byte[] f10598p = new byte[0];

    /* renamed from: q  reason: collision with root package name */
    protected int[] f10599q = new int[0];

    /* renamed from: r  reason: collision with root package name */
    protected int f10600r = 0;

    /* renamed from: s  reason: collision with root package name */
    protected int f10601s = 0;

    /* renamed from: t  reason: collision with root package name */
    protected int f10602t = 0;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f10603u;

    /* renamed from: v  reason: collision with root package name */
    protected int f10604v;

    static {
        s sVar = new s();
        f10582w = sVar;
        sVar.d(40, 41);
        sVar.d(41, 40);
        sVar.d(60, 62);
        sVar.d(62, 60);
        sVar.d(91, 93);
        sVar.d(93, 91);
        sVar.d(123, j.L0);
        sVar.d(j.L0, 123);
        sVar.d(171, 187);
        sVar.d(187, 171);
        sVar.d(8249, 8250);
        sVar.d(8250, 8249);
        sVar.d(8261, 8262);
        sVar.d(8262, 8261);
        sVar.d(8317, 8318);
        sVar.d(8318, 8317);
        sVar.d(8333, 8334);
        sVar.d(8334, 8333);
        sVar.d(8712, 8715);
        sVar.d(8713, 8716);
        sVar.d(8714, 8717);
        sVar.d(8715, 8712);
        sVar.d(8716, 8713);
        sVar.d(8717, 8714);
        sVar.d(8725, 10741);
        sVar.d(8764, 8765);
        sVar.d(8765, 8764);
        sVar.d(8771, 8909);
        sVar.d(8786, 8787);
        sVar.d(8787, 8786);
        sVar.d(8788, 8789);
        sVar.d(8789, 8788);
        sVar.d(8804, 8805);
        sVar.d(8805, 8804);
        sVar.d(8806, 8807);
        sVar.d(8807, 8806);
        sVar.d(8808, 8809);
        sVar.d(8809, 8808);
        sVar.d(8810, 8811);
        sVar.d(8811, 8810);
        sVar.d(8814, 8815);
        sVar.d(8815, 8814);
        sVar.d(8816, 8817);
        sVar.d(8817, 8816);
        sVar.d(8818, 8819);
        sVar.d(8819, 8818);
        sVar.d(8820, 8821);
        sVar.d(8821, 8820);
        sVar.d(8822, 8823);
        sVar.d(8823, 8822);
        sVar.d(8824, 8825);
        sVar.d(8825, 8824);
        sVar.d(8826, 8827);
        sVar.d(8827, 8826);
        sVar.d(8828, 8829);
        sVar.d(8829, 8828);
        sVar.d(8830, 8831);
        sVar.d(8831, 8830);
        sVar.d(8832, 8833);
        sVar.d(8833, 8832);
        sVar.d(8834, 8835);
        sVar.d(8835, 8834);
        sVar.d(8836, 8837);
        sVar.d(8837, 8836);
        sVar.d(8838, 8839);
        sVar.d(8839, 8838);
        sVar.d(8840, 8841);
        sVar.d(8841, 8840);
        sVar.d(8842, 8843);
        sVar.d(8843, 8842);
        sVar.d(8847, 8848);
        sVar.d(8848, 8847);
        sVar.d(8849, 8850);
        sVar.d(8850, 8849);
        sVar.d(8856, 10680);
        sVar.d(8866, 8867);
        sVar.d(8867, 8866);
        sVar.d(8870, 10974);
        sVar.d(8872, 10980);
        sVar.d(8873, 10979);
        sVar.d(8875, 10981);
        sVar.d(8880, 8881);
        sVar.d(8881, 8880);
        sVar.d(8882, 8883);
        sVar.d(8883, 8882);
        sVar.d(8884, 8885);
        sVar.d(8885, 8884);
        sVar.d(8886, 8887);
        sVar.d(8887, 8886);
        sVar.d(8905, 8906);
        sVar.d(8906, 8905);
        sVar.d(8907, 8908);
        sVar.d(8908, 8907);
        sVar.d(8909, 8771);
        sVar.d(8912, 8913);
        sVar.d(8913, 8912);
        sVar.d(8918, 8919);
        sVar.d(8919, 8918);
        sVar.d(8920, 8921);
        sVar.d(8921, 8920);
        sVar.d(8922, 8923);
        sVar.d(8923, 8922);
        sVar.d(8924, 8925);
        sVar.d(8925, 8924);
        sVar.d(8926, 8927);
        sVar.d(8927, 8926);
        sVar.d(8928, 8929);
        sVar.d(8929, 8928);
        sVar.d(8930, 8931);
        sVar.d(8931, 8930);
        sVar.d(8932, 8933);
        sVar.d(8933, 8932);
        sVar.d(8934, 8935);
        sVar.d(8935, 8934);
        sVar.d(8936, 8937);
        sVar.d(8937, 8936);
        sVar.d(8938, 8939);
        sVar.d(8939, 8938);
        sVar.d(8940, 8941);
        sVar.d(8941, 8940);
        sVar.d(8944, 8945);
        sVar.d(8945, 8944);
        sVar.d(8946, 8954);
        sVar.d(8947, 8955);
        sVar.d(8948, 8956);
        sVar.d(8950, 8957);
        sVar.d(8951, 8958);
        sVar.d(8954, 8946);
        sVar.d(8955, 8947);
        sVar.d(8956, 8948);
        sVar.d(8957, 8950);
        sVar.d(8958, 8951);
        sVar.d(8968, 8969);
        sVar.d(8969, 8968);
        sVar.d(8970, 8971);
        sVar.d(8971, 8970);
        sVar.d(9001, 9002);
        sVar.d(9002, 9001);
        sVar.d(10088, 10089);
        sVar.d(10089, 10088);
        sVar.d(10090, 10091);
        sVar.d(10091, 10090);
        sVar.d(10092, 10093);
        sVar.d(10093, 10092);
        sVar.d(10094, 10095);
        sVar.d(10095, 10094);
        sVar.d(10096, 10097);
        sVar.d(10097, 10096);
        sVar.d(10098, 10099);
        sVar.d(10099, 10098);
        sVar.d(10100, 10101);
        sVar.d(10101, 10100);
        sVar.d(10197, 10198);
        sVar.d(10198, 10197);
        sVar.d(10205, 10206);
        sVar.d(10206, 10205);
        sVar.d(10210, 10211);
        sVar.d(10211, 10210);
        sVar.d(10212, 10213);
        sVar.d(10213, 10212);
        sVar.d(10214, 10215);
        sVar.d(10215, 10214);
        sVar.d(10216, 10217);
        sVar.d(10217, 10216);
        sVar.d(10218, 10219);
        sVar.d(10219, 10218);
        sVar.d(10627, 10628);
        sVar.d(10628, 10627);
        sVar.d(10629, 10630);
        sVar.d(10630, 10629);
        sVar.d(10631, 10632);
        sVar.d(10632, 10631);
        sVar.d(10633, 10634);
        sVar.d(10634, 10633);
        sVar.d(10635, 10636);
        sVar.d(10636, 10635);
        sVar.d(10637, 10640);
        sVar.d(10638, 10639);
        sVar.d(10639, 10638);
        sVar.d(10640, 10637);
        sVar.d(10641, 10642);
        sVar.d(10642, 10641);
        sVar.d(10643, 10644);
        sVar.d(10644, 10643);
        sVar.d(10645, 10646);
        sVar.d(10646, 10645);
        sVar.d(10647, 10648);
        sVar.d(10648, 10647);
        sVar.d(10680, 8856);
        sVar.d(10688, 10689);
        sVar.d(10689, 10688);
        sVar.d(10692, 10693);
        sVar.d(10693, 10692);
        sVar.d(10703, 10704);
        sVar.d(10704, 10703);
        sVar.d(10705, 10706);
        sVar.d(10706, 10705);
        sVar.d(10708, 10709);
        sVar.d(10709, 10708);
        sVar.d(10712, 10713);
        sVar.d(10713, 10712);
        sVar.d(10714, 10715);
        sVar.d(10715, 10714);
        sVar.d(10741, 8725);
        sVar.d(10744, 10745);
        sVar.d(10745, 10744);
        sVar.d(10748, 10749);
        sVar.d(10749, 10748);
        sVar.d(10795, 10796);
        sVar.d(10796, 10795);
        sVar.d(10797, 10796);
        sVar.d(10798, 10797);
        sVar.d(10804, 10805);
        sVar.d(10805, 10804);
        sVar.d(10812, 10813);
        sVar.d(10813, 10812);
        sVar.d(10852, 10853);
        sVar.d(10853, 10852);
        sVar.d(10873, 10874);
        sVar.d(10874, 10873);
        sVar.d(10877, 10878);
        sVar.d(10878, 10877);
        sVar.d(10879, 10880);
        sVar.d(10880, 10879);
        sVar.d(10881, 10882);
        sVar.d(10882, 10881);
        sVar.d(10883, 10884);
        sVar.d(10884, 10883);
        sVar.d(10891, 10892);
        sVar.d(10892, 10891);
        sVar.d(10897, 10898);
        sVar.d(10898, 10897);
        sVar.d(10899, 10900);
        sVar.d(10900, 10899);
        sVar.d(10901, 10902);
        sVar.d(10902, 10901);
        sVar.d(10903, 10904);
        sVar.d(10904, 10903);
        sVar.d(10905, 10906);
        sVar.d(10906, 10905);
        sVar.d(10907, 10908);
        sVar.d(10908, 10907);
        sVar.d(10913, 10914);
        sVar.d(10914, 10913);
        sVar.d(10918, 10919);
        sVar.d(10919, 10918);
        sVar.d(10920, 10921);
        sVar.d(10921, 10920);
        sVar.d(10922, 10923);
        sVar.d(10923, 10922);
        sVar.d(10924, 10925);
        sVar.d(10925, 10924);
        sVar.d(10927, 10928);
        sVar.d(10928, 10927);
        sVar.d(10931, 10932);
        sVar.d(10932, 10931);
        sVar.d(10939, 10940);
        sVar.d(10940, 10939);
        sVar.d(10941, 10942);
        sVar.d(10942, 10941);
        sVar.d(10943, 10944);
        sVar.d(10944, 10943);
        sVar.d(10945, 10946);
        sVar.d(10946, 10945);
        sVar.d(10947, 10948);
        sVar.d(10948, 10947);
        sVar.d(10949, 10950);
        sVar.d(10950, 10949);
        sVar.d(10957, 10958);
        sVar.d(10958, 10957);
        sVar.d(10959, 10960);
        sVar.d(10960, 10959);
        sVar.d(10961, 10962);
        sVar.d(10962, 10961);
        sVar.d(10963, 10964);
        sVar.d(10964, 10963);
        sVar.d(10965, 10966);
        sVar.d(10966, 10965);
        sVar.d(10974, 8870);
        sVar.d(10979, 8873);
        sVar.d(10980, 8872);
        sVar.d(10981, 8875);
        sVar.d(10988, 10989);
        sVar.d(10989, 10988);
        sVar.d(10999, 11000);
        sVar.d(11000, 10999);
        sVar.d(11001, 11002);
        sVar.d(11002, 11001);
        sVar.d(12296, 12297);
        sVar.d(12297, 12296);
        sVar.d(12298, 12299);
        sVar.d(12299, 12298);
        sVar.d(12300, 12301);
        sVar.d(12301, 12300);
        sVar.d(12302, 12303);
        sVar.d(12303, 12302);
        sVar.d(12304, 12305);
        sVar.d(12305, 12304);
        sVar.d(12308, 12309);
        sVar.d(12309, 12308);
        sVar.d(12310, 12311);
        sVar.d(12311, 12310);
        sVar.d(12312, 12313);
        sVar.d(12313, 12312);
        sVar.d(12314, 12315);
        sVar.d(12315, 12314);
        sVar.d(65288, 65289);
        sVar.d(65289, 65288);
        sVar.d(65308, 65310);
        sVar.d(65310, 65308);
        sVar.d(65339, 65341);
        sVar.d(65341, 65339);
        sVar.d(65371, 65373);
        sVar.d(65373, 65371);
        sVar.d(65375, 65376);
        sVar.d(65376, 65375);
        sVar.d(65378, 65379);
        sVar.d(65379, 65378);
    }

    public d() {
    }

    public static boolean j(char c10) {
        return c10 <= ' ';
    }

    public void a(e0 e0Var) {
        this.f10590h.add(e0Var);
    }

    public void b(char c10, e0 e0Var) {
        int i10 = this.f10587e;
        int i11 = this.f10584b;
        if (i10 >= i11) {
            char[] cArr = this.f10585c;
            e0[] e0VarArr = this.f10586d;
            int i12 = i11 * 2;
            this.f10584b = i12;
            char[] cArr2 = new char[i12];
            this.f10585c = cArr2;
            this.f10586d = new e0[i12];
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            System.arraycopy(e0VarArr, 0, this.f10586d, 0, this.f10587e);
        }
        char[] cArr3 = this.f10585c;
        int i13 = this.f10587e;
        cArr3[i13] = c10;
        e0[] e0VarArr2 = this.f10586d;
        this.f10587e = i13 + 1;
        e0VarArr2[i13] = e0Var;
    }

    public ArrayList c(int i10, int i11) {
        return d(i10, i11, (e0) null);
    }

    public ArrayList d(int i10, int i11, e0 e0Var) {
        int i12 = this.f10583a;
        boolean z10 = i12 == 2 || i12 == 3;
        if (z10) {
            m(i10, i11);
        }
        ArrayList arrayList = new ArrayList();
        e0 e0Var2 = this.f10586d[i10];
        StringBuffer stringBuffer = new StringBuffer();
        while (i10 <= i11) {
            int i13 = z10 ? this.f10589g[i10] : i10;
            char c10 = this.f10585c[i13];
            e0 e0Var3 = this.f10586d[i13];
            if (!e0.v(e0Var3.i(c10))) {
                if (e0Var3.n() || e0Var3.p() || e0Var3.s()) {
                    if (stringBuffer.length() > 0) {
                        arrayList.add(new e0(stringBuffer.toString(), e0Var2));
                        stringBuffer = new StringBuffer();
                    }
                    arrayList.add(e0Var3);
                } else if (e0Var3 == e0Var2) {
                    stringBuffer.append(c10);
                } else {
                    if (stringBuffer.length() > 0) {
                        arrayList.add(new e0(stringBuffer.toString(), e0Var2));
                        stringBuffer = new StringBuffer();
                    }
                    if (!e0Var3.n() && !e0Var3.p() && !e0Var3.s()) {
                        stringBuffer.append(c10);
                    }
                    e0Var2 = e0Var3;
                }
            }
            i10++;
        }
        if (stringBuffer.length() > 0) {
            arrayList.add(new e0(stringBuffer.toString(), e0Var2));
        }
        if (e0Var != null) {
            arrayList.add(e0Var);
        }
        return arrayList;
    }

    public void e() {
        char[] cArr;
        char c10;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = this.f10587e;
            if (i10 < i12 && ((c10 = cArr[i10]) < 1536 || c10 > 1791)) {
                if (i10 != i11) {
                    (cArr = this.f10585c)[i11] = c10;
                    e0[] e0VarArr = this.f10586d;
                    e0VarArr[i11] = e0VarArr[i10];
                    byte[] bArr = this.f10588f;
                    bArr[i11] = bArr[i10];
                }
                i10++;
                i11++;
            } else if (i10 >= i12) {
                this.f10587e = i11;
                return;
            } else {
                int i13 = i10 + 1;
                while (i13 < this.f10587e && (r1 = this.f10585c[i13]) >= 1536 && r1 <= 1791) {
                    i13++;
                }
                int i14 = i13 - i10;
                char[] cArr2 = this.f10585c;
                int a10 = a.a(cArr2, i10, i14, cArr2, i11, i14, this.f10604v);
                if (i10 != i11) {
                    int i15 = 0;
                    while (i15 < a10) {
                        e0[] e0VarArr2 = this.f10586d;
                        e0VarArr2[i11] = e0VarArr2[i10];
                        byte[] bArr2 = this.f10588f;
                        bArr2[i11] = bArr2[i10];
                        i15++;
                        i11++;
                        i10++;
                    }
                } else {
                    i11 += a10;
                }
                i10 = i13;
            }
        }
    }

    public void f(int i10, int i11) {
        int i12 = (i10 + i11) / 2;
        while (true) {
            i11--;
            if (i10 < i12) {
                int[] iArr = this.f10589g;
                int i13 = iArr[i10];
                iArr[i10] = iArr[i11];
                iArr[i11] = i13;
                i10++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        r1 = r11.f10592j + 1;
        r11.f10592j = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r1 < r6) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        r11.f10592j = 0;
        r11.f10591i++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (r11.f10587e != 0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r11.f10586d[0] = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r1 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(int r12) {
        /*
            r11 = this;
            r11.f10583a = r12
            r0 = 0
            r11.f10593k = r0
            r11.f10587e = r0
            r1 = r0
        L_0x0008:
            int r2 = r11.f10591i
            java.util.ArrayList r3 = r11.f10590h
            int r3 = r3.size()
            r4 = 1
            if (r2 >= r3) goto L_0x0083
            java.util.ArrayList r2 = r11.f10590h
            int r3 = r11.f10591i
            java.lang.Object r2 = r2.get(r3)
            e8.e0 r2 = (e8.e0) r2
            e8.s0 r3 = r2.c()
            e8.c r3 = r3.b()
            java.lang.String r5 = r2.toString()
            int r6 = r5.length()
        L_0x002d:
            int r7 = r11.f10592j
            if (r7 >= r6) goto L_0x0078
            char r7 = r5.charAt(r7)
            int r8 = r3.t(r7)
            char r8 = (char) r8
            r9 = 10
            r10 = 13
            if (r8 == r10) goto L_0x004c
            if (r8 != r9) goto L_0x0043
            goto L_0x004c
        L_0x0043:
            r11.b(r7, r2)
            int r7 = r11.f10592j
            int r7 = r7 + r4
            r11.f10592j = r7
            goto L_0x002d
        L_0x004c:
            if (r8 != r10) goto L_0x0061
            int r1 = r11.f10592j
            int r3 = r1 + 1
            if (r3 >= r6) goto L_0x0061
            int r1 = r1 + 1
            char r1 = r5.charAt(r1)
            if (r1 != r9) goto L_0x0061
            int r1 = r11.f10592j
            int r1 = r1 + r4
            r11.f10592j = r1
        L_0x0061:
            int r1 = r11.f10592j
            int r1 = r1 + r4
            r11.f10592j = r1
            if (r1 < r6) goto L_0x006f
            r11.f10592j = r0
            int r1 = r11.f10591i
            int r1 = r1 + r4
            r11.f10591i = r1
        L_0x006f:
            int r1 = r11.f10587e
            if (r1 != 0) goto L_0x0077
            e8.e0[] r1 = r11.f10586d
            r1[r0] = r2
        L_0x0077:
            r1 = r4
        L_0x0078:
            if (r1 == 0) goto L_0x007b
            goto L_0x0083
        L_0x007b:
            r11.f10592j = r0
            int r2 = r11.f10591i
            int r2 = r2 + r4
            r11.f10591i = r2
            goto L_0x0008
        L_0x0083:
            int r2 = r11.f10587e
            if (r2 != 0) goto L_0x0088
            return r1
        L_0x0088:
            int r2 = r2 - r4
            int r1 = r11.q(r0, r2)
            int r1 = r1 + r4
            r11.f10587e = r1
            if (r1 != 0) goto L_0x0093
            return r4
        L_0x0093:
            r2 = 2
            r3 = 3
            if (r12 == r2) goto L_0x0099
            if (r12 != r3) goto L_0x00da
        L_0x0099:
            byte[] r2 = r11.f10588f
            int r2 = r2.length
            if (r2 >= r1) goto L_0x00a8
            int r2 = r11.f10584b
            byte[] r5 = new byte[r2]
            r11.f10588f = r5
            int[] r2 = new int[r2]
            r11.f10589g = r2
        L_0x00a8:
            char[] r2 = r11.f10585c
            int r5 = r11.f10604v
            e8.a.h(r2, r0, r1, r5)
            e8.e r1 = new e8.e
            char[] r2 = r11.f10585c
            int r5 = r11.f10587e
            if (r12 != r3) goto L_0x00b9
            r12 = r4
            goto L_0x00ba
        L_0x00b9:
            r12 = r0
        L_0x00ba:
            byte r12 = (byte) r12
            r1.<init>(r2, r0, r5, r12)
            byte[] r12 = r1.e()
            r1 = r0
        L_0x00c3:
            int r2 = r11.f10587e
            if (r1 >= r2) goto L_0x00d4
            byte[] r2 = r11.f10588f
            byte r3 = r12[r1]
            r2[r1] = r3
            int[] r2 = r11.f10589g
            r2[r1] = r1
            int r1 = r1 + 1
            goto L_0x00c3
        L_0x00d4:
            r11.e()
            r11.k()
        L_0x00da:
            int r12 = r11.f10587e
            int r12 = r12 - r4
            int r12 = r11.r(r0, r12)
            int r12 = r12 + r4
            r11.f10587e = r12
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.d.g(int):boolean");
    }

    public float h(int i10, int i11) {
        float f10 = 0.0f;
        while (i10 <= i11) {
            if (y.h(this.f10585c, i10)) {
                f10 += this.f10586d[i10].e(y.d(this.f10585c, i10));
                i10++;
            } else {
                char c10 = this.f10585c[i10];
                if (!e0.v(this.f10586d[i10].i(c10))) {
                    f10 += this.f10586d[i10].e(c10);
                }
            }
            i10++;
        }
        return f10;
    }

    public boolean i() {
        return this.f10593k >= this.f10587e && this.f10591i >= this.f10590h.size();
    }

    public void k() {
        int b10;
        for (int i10 = 0; i10 < this.f10587e; i10++) {
            if ((this.f10588f[i10] & 1) == 1 && (b10 = f10582w.b(this.f10585c[i10])) != 0) {
                this.f10585c[i10] = (char) b10;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e8.z0 l(float r21, float r22, int r23, int r24, int r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r24
            r2 = r25
            r0.f10604v = r2
            r20.o()
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0012
            r12 = r4
            goto L_0x0013
        L_0x0012:
            r12 = r3
        L_0x0013:
            int r2 = r0.f10593k
            int r5 = r0.f10587e
            r6 = 0
            if (r2 < r5) goto L_0x0045
            boolean r1 = r0.g(r1)
            if (r1 != 0) goto L_0x0021
            return r6
        L_0x0021:
            int r1 = r0.f10587e
            if (r1 != 0) goto L_0x0045
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            e8.e0 r1 = new e8.e0
            e8.e0[] r2 = r0.f10586d
            r2 = r2[r3]
            java.lang.String r3 = ""
            r1.<init>((java.lang.String) r3, (e8.e0) r2)
            r11.add(r1)
            e8.z0 r1 = new e8.z0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 1
            r5 = r1
            r9 = r23
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r1
        L_0x0045:
            int r1 = r0.f10593k
            if (r1 == 0) goto L_0x0052
            int r2 = r0.f10587e
            int r2 = r2 - r4
            int r1 = r0.p(r1, r2)
            r0.f10593k = r1
        L_0x0052:
            int r1 = r0.f10593k
            r5 = r22
            r7 = r6
            r8 = -1
        L_0x0058:
            int r9 = r0.f10593k
            int r10 = r0.f10587e
            r11 = 2
            if (r9 >= r10) goto L_0x0138
            e8.e0[] r3 = r0.f10586d
            r3 = r3[r9]
            char[] r10 = r0.f10585c
            boolean r9 = a8.y.h(r10, r9)
            char[] r10 = r0.f10585c
            int r13 = r0.f10593k
            if (r9 == 0) goto L_0x0078
            int r10 = a8.y.d(r10, r13)
        L_0x0073:
            int r10 = r3.i(r10)
            goto L_0x007b
        L_0x0078:
            char r10 = r10[r13]
            goto L_0x0073
        L_0x007b:
            boolean r13 = e8.e0.v(r10)
            if (r13 == 0) goto L_0x0085
            r13 = r21
            goto L_0x0130
        L_0x0085:
            if (r9 == 0) goto L_0x008e
            float r13 = r3.e(r10)
        L_0x008b:
            r19 = r13
            goto L_0x0099
        L_0x008e:
            char[] r13 = r0.f10585c
            int r14 = r0.f10593k
            char r13 = r13[r14]
            float r13 = r3.e(r13)
            goto L_0x008b
        L_0x0099:
            int r15 = r0.f10593k
            int r14 = r0.f10587e
            char[] r13 = r0.f10585c
            e8.e0[] r2 = r0.f10586d
            r17 = r13
            r13 = r3
            r16 = r14
            r14 = r1
            r18 = r2
            boolean r2 = r13.l(r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x00b8
            char r10 = (char) r10
            boolean r10 = java.lang.Character.isWhitespace(r10)
            if (r10 == 0) goto L_0x00b8
            int r8 = r0.f10593k
        L_0x00b8:
            float r10 = r5 - r19
            r13 = 0
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 >= 0) goto L_0x00cc
            if (r7 != 0) goto L_0x00cc
            boolean r10 = r3.n()
            if (r10 != 0) goto L_0x00c8
            goto L_0x00cc
        L_0x00c8:
            r3.f()
            throw r6
        L_0x00cc:
            float r10 = r5 - r19
            int r13 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x00d5
            r3 = r9
            goto L_0x0138
        L_0x00d5:
            if (r2 == 0) goto L_0x00da
            int r2 = r0.f10593k
            r8 = r2
        L_0x00da:
            boolean r2 = r3.s()
            if (r2 == 0) goto L_0x0125
            java.lang.String r2 = "TAB"
            java.lang.Object r2 = r3.d(r2)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r5 = r2[r4]
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r2 = r2[r11]
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0116
            float r2 = r22 - r10
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0116
            e8.z0 r9 = new e8.z0
            r2 = 0
            r6 = 1
            int r3 = r0.f10593k
            int r3 = r3 - r4
            java.util.ArrayList r7 = r0.c(r1, r3)
            r1 = r9
            r3 = r22
            r4 = r10
            r5 = r23
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r9
        L_0x0116:
            e8.e0[] r2 = r0.f10586d
            int r7 = r0.f10593k
            r2 = r2[r7]
            r13 = r21
            r2.a(r13)
            float r2 = r22 - r5
            r5 = r2
            goto L_0x0128
        L_0x0125:
            r13 = r21
            r5 = r10
        L_0x0128:
            if (r9 == 0) goto L_0x012f
            int r2 = r0.f10593k
            int r2 = r2 + r4
            r0.f10593k = r2
        L_0x012f:
            r7 = r3
        L_0x0130:
            int r2 = r0.f10593k
            int r2 = r2 + r4
            r0.f10593k = r2
            r3 = r9
            goto L_0x0058
        L_0x0138:
            if (r7 != 0) goto L_0x015e
            int r1 = r0.f10593k
            int r2 = r1 + 1
            r0.f10593k = r2
            if (r3 == 0) goto L_0x0145
            int r1 = r1 + r11
            r0.f10593k = r1
        L_0x0145:
            e8.z0 r9 = new e8.z0
            r2 = 0
            r5 = 0
            r6 = 0
            int r1 = r0.f10593k
            int r3 = r1 + -1
            int r1 = r1 - r4
            java.util.ArrayList r7 = r0.c(r3, r1)
            r1 = r9
            r3 = r22
            r4 = r5
            r5 = r23
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r9
        L_0x015e:
            int r2 = r0.f10593k
            int r3 = r0.f10587e
            if (r2 < r3) goto L_0x0178
            e8.z0 r9 = new e8.z0
            r2 = 0
            r6 = 1
            int r3 = r3 - r4
            java.util.ArrayList r7 = r0.c(r1, r3)
            r1 = r9
            r3 = r22
            r4 = r5
            r5 = r23
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r9
        L_0x0178:
            int r2 = r2 - r4
            int r2 = r0.r(r1, r2)
            if (r2 >= r1) goto L_0x0195
            e8.z0 r9 = new e8.z0
            r2 = 0
            r6 = 0
            int r3 = r0.f10593k
            int r3 = r3 - r4
            java.util.ArrayList r7 = r0.c(r1, r3)
            r1 = r9
            r3 = r22
            r4 = r5
            r5 = r23
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r9
        L_0x0195:
            int r3 = r0.f10593k
            int r3 = r3 - r4
            if (r2 != r3) goto L_0x01a3
            java.lang.String r3 = "HYPHENATION"
            java.lang.Object r3 = r7.d(r3)
            android.support.v4.media.session.b.a(r3)
        L_0x01a3:
            r3 = -1
            if (r8 == r3) goto L_0x01cf
            if (r8 < r2) goto L_0x01a9
            goto L_0x01cf
        L_0x01a9:
            int r2 = r8 + 1
            r0.f10593k = r2
            int r2 = r0.r(r1, r8)
            if (r2 >= r1) goto L_0x01b6
            int r2 = r0.f10593k
            int r2 = r2 - r4
        L_0x01b6:
            e8.z0 r9 = new e8.z0
            r3 = 0
            float r4 = r0.h(r1, r2)
            float r4 = r22 - r4
            r6 = 0
            java.util.ArrayList r7 = r0.c(r1, r2)
            r1 = r9
            r2 = r3
            r3 = r22
            r5 = r23
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r9
        L_0x01cf:
            e8.z0 r9 = new e8.z0
            r3 = 0
            int r6 = r2 + 1
            int r7 = r0.f10593k
            int r7 = r7 - r4
            float r4 = r0.h(r6, r7)
            float r4 = r4 + r5
            r6 = 0
            java.util.ArrayList r7 = r0.c(r1, r2)
            r1 = r9
            r2 = r3
            r3 = r22
            r5 = r23
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.d.l(float, float, int, int, int):e8.z0");
    }

    public void m(int i10, int i11) {
        byte b10 = this.f10588f[i10];
        byte b11 = b10;
        byte b12 = b11;
        byte b13 = b12;
        for (int i12 = i10 + 1; i12 <= i11; i12++) {
            byte b14 = this.f10588f[i12];
            if (b14 > b13) {
                b13 = b14;
            } else if (b14 < b12) {
                b12 = b14;
            }
            b11 = (byte) (b11 & b14);
            b10 = (byte) (b10 | b14);
        }
        if ((b10 & 1) != 0) {
            if ((b11 & 1) == 1) {
                f(i10, i11 + 1);
                return;
            }
            byte b15 = (byte) (b12 | 1);
            while (b13 >= b15) {
                int i13 = i10;
                while (true) {
                    if (i13 <= i11 && this.f10588f[i13] < b13) {
                        i13++;
                    } else if (i13 > i11) {
                        break;
                    } else {
                        int i14 = i13 + 1;
                        while (i14 <= i11 && this.f10588f[i14] >= b13) {
                            i14++;
                        }
                        f(i13, i14);
                        i13 = i14 + 1;
                    }
                }
                b13 = (byte) (b13 - 1);
            }
        }
    }

    public void n() {
        this.f10583a = this.f10594l;
        int i10 = this.f10597o;
        this.f10587e = i10;
        this.f10591i = this.f10600r;
        this.f10592j = this.f10601s;
        this.f10593k = this.f10602t;
        if (!this.f10603u) {
            System.arraycopy(this.f10595m, 0, this.f10585c, 0, i10);
            System.arraycopy(this.f10596n, 0, this.f10586d, 0, this.f10587e);
        }
        int i11 = this.f10583a;
        if (i11 == 2 || i11 == 3) {
            byte[] bArr = this.f10598p;
            int i12 = this.f10593k;
            System.arraycopy(bArr, i12, this.f10588f, i12, this.f10587e - i12);
            int[] iArr = this.f10599q;
            int i13 = this.f10593k;
            System.arraycopy(iArr, i13, this.f10589g, i13, this.f10587e - i13);
        }
    }

    public void o() {
        int i10 = this.f10591i;
        boolean z10 = true;
        if (i10 > 0) {
            if (i10 < this.f10590h.size()) {
                while (true) {
                    this.f10591i--;
                    int i11 = this.f10591i;
                    if (i11 < 0) {
                        break;
                    }
                    this.f10590h.remove(i11);
                }
            } else {
                this.f10590h.clear();
            }
            this.f10591i = 0;
        }
        this.f10594l = this.f10583a;
        int i12 = this.f10587e;
        this.f10597o = i12;
        this.f10600r = this.f10591i;
        this.f10601s = this.f10592j;
        int i13 = this.f10593k;
        this.f10602t = i13;
        if (i13 >= i12) {
            z10 = false;
        }
        this.f10603u = z10;
        if (!z10) {
            if (this.f10595m.length < i12) {
                this.f10595m = new char[i12];
                this.f10596n = new e0[i12];
            }
            System.arraycopy(this.f10585c, 0, this.f10595m, 0, i12);
            System.arraycopy(this.f10586d, 0, this.f10596n, 0, this.f10587e);
        }
        int i14 = this.f10583a;
        if (i14 == 2 || i14 == 3) {
            int length = this.f10598p.length;
            int i15 = this.f10587e;
            if (length < i15) {
                this.f10598p = new byte[i15];
                this.f10599q = new int[i15];
            }
            byte[] bArr = this.f10588f;
            int i16 = this.f10593k;
            System.arraycopy(bArr, i16, this.f10598p, i16, i15 - i16);
            int[] iArr = this.f10589g;
            int i17 = this.f10593k;
            System.arraycopy(iArr, i17, this.f10599q, i17, this.f10587e - i17);
        }
    }

    public int p(int i10, int i11) {
        while (i10 <= i11) {
            char i12 = (char) this.f10586d[i10].i(this.f10585c[i10]);
            if (!j(i12) && !e0.v(i12)) {
                break;
            }
            i10++;
        }
        return i10;
    }

    public int q(int i10, int i11) {
        while (i11 >= i10 && j((char) this.f10586d[i11].i(this.f10585c[i11]))) {
            i11--;
        }
        return i11;
    }

    public int r(int i10, int i11) {
        while (i11 >= i10) {
            char i12 = (char) this.f10586d[i11].i(this.f10585c[i11]);
            if (!j(i12) && !e0.v(i12)) {
                break;
            }
            i11--;
        }
        return i11;
    }

    public d(d dVar) {
        this.f10583a = dVar.f10583a;
        this.f10584b = dVar.f10584b;
        this.f10585c = (char[]) dVar.f10585c.clone();
        this.f10586d = (e0[]) dVar.f10586d.clone();
        this.f10587e = dVar.f10587e;
        this.f10588f = (byte[]) dVar.f10588f.clone();
        this.f10589g = (int[]) dVar.f10589g.clone();
        this.f10590h = new ArrayList(dVar.f10590h);
        this.f10591i = dVar.f10591i;
        this.f10592j = dVar.f10592j;
        this.f10593k = dVar.f10593k;
        this.f10594l = dVar.f10594l;
        this.f10595m = (char[]) dVar.f10595m.clone();
        this.f10596n = (e0[]) dVar.f10596n.clone();
        this.f10597o = dVar.f10597o;
        this.f10598p = (byte[]) dVar.f10598p.clone();
        this.f10599q = (int[]) dVar.f10599q.clone();
        this.f10600r = dVar.f10600r;
        this.f10601s = dVar.f10601s;
        this.f10602t = dVar.f10602t;
        this.f10603u = dVar.f10603u;
        this.f10604v = dVar.f10604v;
    }
}
