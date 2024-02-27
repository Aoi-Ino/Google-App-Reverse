package e8;

import a8.c;
import a8.k;
import a8.n;
import a8.x;
import a8.y;
import android.support.v4.media.session.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class e0 {

    /* renamed from: l  reason: collision with root package name */
    private static final char[] f10613l = {' '};

    /* renamed from: m  reason: collision with root package name */
    private static final e0[] f10614m = new e0[1];

    /* renamed from: n  reason: collision with root package name */
    private static final HashSet f10615n;

    /* renamed from: o  reason: collision with root package name */
    private static final HashSet f10616o;

    /* renamed from: a  reason: collision with root package name */
    protected String f10617a = "";

    /* renamed from: b  reason: collision with root package name */
    protected String f10618b = "Cp1252";

    /* renamed from: c  reason: collision with root package name */
    protected s0 f10619c;

    /* renamed from: d  reason: collision with root package name */
    protected c f10620d;

    /* renamed from: e  reason: collision with root package name */
    protected x f10621e;

    /* renamed from: f  reason: collision with root package name */
    protected HashMap f10622f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    protected HashMap f10623g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    protected boolean f10624h;

    /* renamed from: i  reason: collision with root package name */
    protected float f10625i;

    /* renamed from: j  reason: collision with root package name */
    protected float f10626j;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f10627k = false;

    static {
        HashSet hashSet = new HashSet();
        f10615n = hashSet;
        HashSet hashSet2 = new HashSet();
        f10616o = hashSet2;
        hashSet.add("ACTION");
        hashSet.add("UNDERLINE");
        hashSet.add("REMOTEGOTO");
        hashSet.add("LOCALGOTO");
        hashSet.add("LOCALDESTINATION");
        hashSet.add("GENERICTAG");
        hashSet.add("NEWPAGE");
        hashSet.add("IMAGE");
        hashSet.add("BACKGROUND");
        hashSet.add("PDFANNOTATION");
        hashSet.add("SKEW");
        hashSet.add("HSCALE");
        hashSet.add("SEPARATOR");
        hashSet.add("TAB");
        hashSet.add("CHAR_SPACING");
        hashSet2.add("SUBSUPSCRIPT");
        hashSet2.add("SPLITCHARACTER");
        hashSet2.add("HYPHENATION");
        hashSet2.add("TEXTRENDERMODE");
    }

    e0(c cVar, z zVar) {
        HashMap hashMap;
        f10614m[0] = this;
        this.f10617a = cVar.c();
        k d10 = cVar.d();
        float j10 = d10.j();
        j10 = j10 == -1.0f ? 12.0f : j10;
        this.f10620d = d10.c();
        int k10 = d10.k();
        k10 = k10 == -1 ? 0 : k10;
        if (this.f10620d == null) {
            this.f10620d = d10.d(false);
        } else {
            if ((k10 & 1) != 0) {
                this.f10622f.put("TEXTRENDERMODE", new Object[]{2, new Float(j10 / 30.0f), null});
            }
            if ((k10 & 2) != 0) {
                this.f10622f.put("SKEW", new float[]{0.0f, 0.21256f});
            }
        }
        this.f10619c = new s0(this.f10620d, j10);
        HashMap b10 = cVar.b();
        if (b10 != null) {
            for (Map.Entry entry : b10.entrySet()) {
                String str = (String) entry.getKey();
                if (f10615n.contains(str)) {
                    hashMap = this.f10622f;
                } else if (f10616o.contains(str)) {
                    hashMap = this.f10623g;
                }
                hashMap.put(str, entry.getValue());
            }
            if ("".equals(b10.get("GENERICTAG"))) {
                this.f10622f.put("GENERICTAG", cVar.c());
            }
        }
        if (d10.n()) {
            this.f10622f.put("UNDERLINE", y.a((Object[][]) this.f10622f.get("UNDERLINE"), new Object[]{null, new float[]{0.0f, 0.06666667f, 0.0f, -0.33333334f, 0.0f}}));
        }
        if (d10.m()) {
            this.f10622f.put("UNDERLINE", y.a((Object[][]) this.f10622f.get("UNDERLINE"), new Object[]{null, new float[]{0.0f, 0.06666667f, 0.0f, 0.33333334f, 0.0f}}));
        }
        if (zVar != null) {
            this.f10622f.put("ACTION", zVar);
        }
        this.f10623g.put("COLOR", d10.g());
        this.f10623g.put("ENCODING", this.f10619c.b().j());
        Object[] objArr = (Object[]) this.f10622f.get("IMAGE");
        if (objArr != null) {
            this.f10622f.remove("HSCALE");
            b.a(objArr[0]);
            this.f10625i = ((Float) objArr[1]).floatValue();
            this.f10626j = ((Float) objArr[2]).floatValue();
            this.f10627k = ((Boolean) objArr[3]).booleanValue();
        }
        this.f10619c.d((n) null);
        Float f10 = (Float) this.f10622f.get("HSCALE");
        if (f10 != null) {
            this.f10619c.c(f10.floatValue());
        }
        this.f10618b = this.f10619c.b().j();
        x xVar = (x) this.f10623g.get("SPLITCHARACTER");
        this.f10621e = xVar;
        if (xVar == null) {
            this.f10621e = m.f10901a;
        }
    }

    public static boolean v(int i10) {
        return (i10 >= 8203 && i10 <= 8207) || (i10 >= 8234 && i10 <= 8238);
    }

    /* access modifiers changed from: package-private */
    public e0 A(float f10) {
        int i10 = 1;
        if (f10 < this.f10619c.f()) {
            String substring = this.f10617a.substring(1);
            this.f10617a = this.f10617a.substring(0, 1);
            return new e0(substring, this);
        }
        int length = this.f10617a.length();
        float f11 = 0.0f;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            z10 = y.g(this.f10617a, i11);
            String str = this.f10617a;
            f11 += e(z10 ? y.c(str, i11) : str.charAt(i11));
            if (f11 > f10) {
                break;
            }
            if (z10) {
                i11++;
            }
            i11++;
        }
        if (i11 == length) {
            return null;
        }
        if (i11 != 0) {
            i10 = i11;
        } else if (z10) {
            i10 = 2;
        }
        String substring2 = this.f10617a.substring(i10);
        this.f10617a = this.f10617a.substring(0, i10);
        return new e0(substring2, this);
    }

    /* access modifiers changed from: package-private */
    public float B() {
        if (k("CHAR_SPACING")) {
            return this.f10619c.h(this.f10617a) + (((float) this.f10617a.length()) * ((Float) d("CHAR_SPACING")).floatValue());
        }
        if (k("SEPARATOR")) {
            return 0.0f;
        }
        return this.f10619c.h(this.f10617a);
    }

    /* access modifiers changed from: package-private */
    public void a(float f10) {
        Object[] objArr = (Object[]) this.f10622f.get("TAB");
        if (objArr != null) {
            this.f10622f.put("TAB", new Object[]{objArr[0], objArr[1], objArr[2], new Float(f10)});
        }
    }

    /* access modifiers changed from: package-private */
    public a8.b b() {
        return (a8.b) this.f10623g.get("COLOR");
    }

    /* access modifiers changed from: package-private */
    public s0 c() {
        return this.f10619c;
    }

    /* access modifiers changed from: package-private */
    public Object d(String str) {
        return (this.f10622f.containsKey(str) ? this.f10622f : this.f10623g).get(str);
    }

    /* access modifiers changed from: package-private */
    public float e(int i10) {
        if (v(i10)) {
            return 0.0f;
        }
        return k("CHAR_SPACING") ? this.f10619c.g(i10) + ((Float) d("CHAR_SPACING")).floatValue() : this.f10619c.g(i10);
    }

    /* access modifiers changed from: package-private */
    public n f() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f10626j;
    }

    public float h() {
        Float f10 = (Float) d("SUBSUPSCRIPT");
        if (f10 != null) {
            return f10.floatValue();
        }
        return 0.0f;
    }

    public int i(int i10) {
        return this.f10620d.t(i10);
    }

    public float j(float f10, float f11) {
        int i10 = 0;
        int i11 = -1;
        while (true) {
            i11 = this.f10617a.indexOf(32, i11 + 1);
            if (i11 < 0) {
                return B() + (((float) this.f10617a.length()) * f10) + (((float) i10) * f11);
            }
            i10++;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean k(String str) {
        if (this.f10622f.containsKey(str)) {
            return true;
        }
        return this.f10623g.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    public boolean l(int i10, int i11, int i12, char[] cArr, e0[] e0VarArr) {
        return this.f10621e.a(i10, i11, i12, cArr, e0VarArr);
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        if (k("SEPARATOR")) {
            return !((Boolean) ((Object[]) d("SEPARATOR"))[1]).booleanValue();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return false;
    }

    public boolean o() {
        return this.f10624h;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return k("SEPARATOR");
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return this.f10618b.equals("UnicodeBigUnmarked") || this.f10618b.equals("Identity-H");
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        return !this.f10622f.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        return k("TAB");
    }

    /* access modifiers changed from: package-private */
    public int t() {
        return this.f10617a.length();
    }

    public String toString() {
        return this.f10617a;
    }

    /* access modifiers changed from: package-private */
    public int u() {
        if (!"Identity-H".equals(this.f10618b)) {
            return this.f10617a.length();
        }
        int length = this.f10617a.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            if (y.e(this.f10617a.charAt(i10))) {
                i10++;
            }
            i11++;
            i10++;
        }
        return i11;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0118 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e8.e0 w(float r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = 0
            r0.f10624h = r1
            java.util.HashMap r2 = r0.f10623g
            java.lang.String r3 = "HYPHENATION"
            java.lang.Object r2 = r2.get(r3)
            android.support.v4.media.session.b.a(r2)
            java.lang.String r2 = r0.f10617a
            int r2 = r2.length()
            java.lang.String r3 = r0.f10617a
            char[] r9 = r3.toCharArray()
            e8.s0 r3 = r0.f10619c
            e8.c r10 = r3.b()
            int r3 = r10.m()
            r11 = 2
            r4 = -1
            r12 = 10
            r13 = 32
            r14 = 1
            r5 = 0
            if (r3 != r11) goto L_0x0094
            int r3 = r10.t(r13)
            if (r3 == r13) goto L_0x0094
            r15 = r1
            r11 = r4
        L_0x0038:
            if (r15 >= r2) goto L_0x0116
            char r3 = r9[r15]
            int r6 = r10.t(r3)
            char r6 = (char) r6
            if (r6 != r12) goto L_0x0065
            r0.f10624h = r14
            java.lang.String r2 = r0.f10617a
            int r3 = r15 + 1
            java.lang.String r2 = r2.substring(r3)
            java.lang.String r3 = r0.f10617a
            java.lang.String r1 = r3.substring(r1, r15)
            r0.f10617a = r1
            int r1 = r1.length()
            if (r1 >= r14) goto L_0x005f
            java.lang.String r1 = "\u0001"
            r0.f10617a = r1
        L_0x005f:
            e8.e0 r1 = new e8.e0
            r1.<init>((java.lang.String) r2, (e8.e0) r0)
            return r1
        L_0x0065:
            float r3 = r0.e(r3)
            float r16 = r5 + r3
            if (r6 != r13) goto L_0x0072
            int r3 = r15 + 1
            r17 = r3
            goto L_0x0074
        L_0x0072:
            r17 = r4
        L_0x0074:
            int r3 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x007c
        L_0x0078:
            r4 = r17
            goto L_0x0116
        L_0x007c:
            a8.x r3 = r0.f10621e
            r4 = 0
            e8.e0[] r8 = f10614m
            r5 = r15
            r6 = r2
            r7 = r9
            boolean r3 = r3.a(r4, r5, r6, r7, r8)
            if (r3 == 0) goto L_0x008d
            int r3 = r15 + 1
            r11 = r3
        L_0x008d:
            int r15 = r15 + 1
            r5 = r16
            r4 = r17
            goto L_0x0038
        L_0x0094:
            r15 = r1
            r10 = r4
        L_0x0096:
            if (r15 >= r2) goto L_0x0115
            char r3 = r9[r15]
            r6 = 13
            if (r3 == r6) goto L_0x00e8
            if (r3 != r12) goto L_0x00a1
            goto L_0x00e8
        L_0x00a1:
            boolean r6 = a8.y.h(r9, r15)
            if (r6 == 0) goto L_0x00b9
            char r7 = r9[r15]
            int r8 = r15 + 1
            char r8 = r9[r8]
            int r7 = a8.y.b(r7, r8)
            float r7 = r0.e(r7)
        L_0x00b5:
            float r5 = r5 + r7
            r16 = r5
            goto L_0x00be
        L_0x00b9:
            float r7 = r0.e(r3)
            goto L_0x00b5
        L_0x00be:
            if (r3 != r13) goto L_0x00c5
            int r3 = r15 + 1
            r17 = r3
            goto L_0x00c7
        L_0x00c5:
            r17 = r4
        L_0x00c7:
            if (r6 == 0) goto L_0x00cb
            int r15 = r15 + 1
        L_0x00cb:
            int r3 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x00d1
            r11 = r10
            goto L_0x0078
        L_0x00d1:
            a8.x r3 = r0.f10621e
            r4 = 0
            r8 = 0
            r5 = r15
            r6 = r2
            r7 = r9
            boolean r3 = r3.a(r4, r5, r6, r7, r8)
            if (r3 == 0) goto L_0x00e1
            int r3 = r15 + 1
            r10 = r3
        L_0x00e1:
            int r15 = r15 + 1
            r5 = r16
            r4 = r17
            goto L_0x0096
        L_0x00e8:
            r0.f10624h = r14
            if (r3 != r6) goto L_0x00f5
            int r3 = r15 + 1
            if (r3 >= r2) goto L_0x00f5
            char r2 = r9[r3]
            if (r2 != r12) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = r14
        L_0x00f6:
            java.lang.String r2 = r0.f10617a
            int r11 = r11 + r15
            java.lang.String r2 = r2.substring(r11)
            java.lang.String r3 = r0.f10617a
            java.lang.String r1 = r3.substring(r1, r15)
            r0.f10617a = r1
            int r1 = r1.length()
            if (r1 >= r14) goto L_0x010f
            java.lang.String r1 = " "
            r0.f10617a = r1
        L_0x010f:
            e8.e0 r1 = new e8.e0
            r1.<init>((java.lang.String) r2, (e8.e0) r0)
            return r1
        L_0x0115:
            r11 = r10
        L_0x0116:
            if (r15 != r2) goto L_0x011a
            r1 = 0
            return r1
        L_0x011a:
            if (r11 >= 0) goto L_0x0128
            java.lang.String r1 = r0.f10617a
            java.lang.String r2 = ""
            r0.f10617a = r2
            e8.e0 r2 = new e8.e0
            r2.<init>((java.lang.String) r1, (e8.e0) r0)
            return r2
        L_0x0128:
            if (r4 <= r11) goto L_0x0139
            a8.x r5 = r0.f10621e
            r6 = 0
            r7 = 0
            r8 = 1
            char[] r9 = f10613l
            r10 = 0
            boolean r2 = r5.a(r6, r7, r8, r9, r10)
            if (r2 == 0) goto L_0x0139
            goto L_0x013a
        L_0x0139:
            r4 = r11
        L_0x013a:
            java.lang.String r2 = r0.f10617a
            java.lang.String r2 = r2.substring(r4)
            java.lang.String r3 = r0.f10617a
            java.lang.String r1 = r3.substring(r1, r4)
            java.lang.String r1 = r0.x(r1)
            r0.f10617a = r1
            e8.e0 r1 = new e8.e0
            r1.<init>((java.lang.String) r2, (e8.e0) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.e0.w(float):e8.e0");
    }

    /* access modifiers changed from: package-private */
    public String x(String str) {
        c b10 = this.f10619c.b();
        if (b10.m() != 2 || b10.t(32) == 32) {
            while (true) {
                if (!str.endsWith(" ") && !str.endsWith("\t")) {
                    break;
                }
                str = str.substring(0, str.length() - 1);
            }
        } else {
            while (str.endsWith("\u0001")) {
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }

    public float y() {
        c b10 = this.f10619c.b();
        if (b10.m() != 2 || b10.t(32) == 32) {
            if (this.f10617a.length() <= 1 || !this.f10617a.startsWith(" ")) {
                return 0.0f;
            }
            this.f10617a = this.f10617a.substring(1);
            return this.f10619c.g(32);
        } else if (this.f10617a.length() <= 1 || !this.f10617a.startsWith("\u0001")) {
            return 0.0f;
        } else {
            this.f10617a = this.f10617a.substring(1);
            return this.f10619c.g(1);
        }
    }

    public float z() {
        c b10 = this.f10619c.b();
        if (b10.m() != 2 || b10.t(32) == 32) {
            if (this.f10617a.length() <= 1 || !this.f10617a.endsWith(" ")) {
                return 0.0f;
            }
            String str = this.f10617a;
            this.f10617a = str.substring(0, str.length() - 1);
            return this.f10619c.g(32);
        } else if (this.f10617a.length() <= 1 || !this.f10617a.endsWith("\u0001")) {
            return 0.0f;
        } else {
            String str2 = this.f10617a;
            this.f10617a = str2.substring(0, str2.length() - 1);
            return this.f10619c.g(1);
        }
    }

    e0(String str, e0 e0Var) {
        f10614m[0] = this;
        this.f10617a = str;
        this.f10619c = e0Var.f10619c;
        HashMap hashMap = e0Var.f10622f;
        this.f10622f = hashMap;
        this.f10623g = e0Var.f10623g;
        this.f10620d = e0Var.f10620d;
        Object[] objArr = (Object[]) hashMap.get("IMAGE");
        if (objArr != null) {
            b.a(objArr[0]);
            this.f10625i = ((Float) objArr[1]).floatValue();
            this.f10626j = ((Float) objArr[2]).floatValue();
            this.f10627k = ((Boolean) objArr[3]).booleanValue();
        }
        this.f10618b = this.f10619c.b().j();
        x xVar = (x) this.f10623g.get("SPLITCHARACTER");
        this.f10621e = xVar;
        if (xVar == null) {
            this.f10621e = m.f10901a;
        }
    }
}
