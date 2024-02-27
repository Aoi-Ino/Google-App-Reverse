package e8;

import a8.g;
import a8.j;
import b8.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class i2 {

    /* renamed from: s  reason: collision with root package name */
    static final String[] f10821s = {"cvt ", "fpgm", "glyf", "head", "hhea", "hmtx", "loca", "maxp", "prep"};

    /* renamed from: t  reason: collision with root package name */
    static final String[] f10822t = {"cmap", "cvt ", "fpgm", "glyf", "head", "hhea", "hmtx", "loca", "maxp", "prep"};

    /* renamed from: u  reason: collision with root package name */
    static final String[] f10823u = {"OS/2", "cmap", "cvt ", "fpgm", "glyf", "head", "hhea", "hmtx", "loca", "maxp", "name, prep"};

    /* renamed from: v  reason: collision with root package name */
    static final int[] f10824v = {0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4};

    /* renamed from: a  reason: collision with root package name */
    protected HashMap f10825a;

    /* renamed from: b  reason: collision with root package name */
    protected f2 f10826b;

    /* renamed from: c  reason: collision with root package name */
    protected String f10827c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f10828d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f10829e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f10830f;

    /* renamed from: g  reason: collision with root package name */
    protected int[] f10831g;

    /* renamed from: h  reason: collision with root package name */
    protected HashSet f10832h;

    /* renamed from: i  reason: collision with root package name */
    protected ArrayList f10833i;

    /* renamed from: j  reason: collision with root package name */
    protected int f10834j;

    /* renamed from: k  reason: collision with root package name */
    protected int[] f10835k;

    /* renamed from: l  reason: collision with root package name */
    protected byte[] f10836l;

    /* renamed from: m  reason: collision with root package name */
    protected byte[] f10837m;

    /* renamed from: n  reason: collision with root package name */
    protected int f10838n;

    /* renamed from: o  reason: collision with root package name */
    protected int f10839o;

    /* renamed from: p  reason: collision with root package name */
    protected byte[] f10840p;

    /* renamed from: q  reason: collision with root package name */
    protected int f10841q;

    /* renamed from: r  reason: collision with root package name */
    protected int f10842r;

    i2(String str, f2 f2Var, HashSet hashSet, int i10, boolean z10, boolean z11) {
        this.f10827c = str;
        this.f10826b = f2Var;
        this.f10832h = hashSet;
        this.f10828d = z10;
        this.f10829e = z11;
        this.f10842r = i10;
        this.f10833i = new ArrayList(hashSet);
    }

    /* access modifiers changed from: protected */
    public void a() {
        int i10;
        int[] iArr;
        String[] strArr = this.f10829e ? f10823u : this.f10828d ? f10822t : f10821s;
        int i11 = 2;
        int i12 = 0;
        for (String str : strArr) {
            if (!str.equals("glyf") && !str.equals("loca") && (iArr = (int[]) this.f10825a.get(str)) != null) {
                i11++;
                i12 += (iArr[2] + 3) & -4;
            }
        }
        int i13 = (i11 * 16) + 12;
        this.f10840p = new byte[(i12 + this.f10836l.length + this.f10837m.length + i13)];
        this.f10841q = 0;
        k(65536);
        l(i11);
        int i14 = f10824v[i11];
        int i15 = 1 << i14;
        l(i15 * 16);
        l(i14);
        l((i11 - i15) * 16);
        for (String str2 : strArr) {
            int[] iArr2 = (int[]) this.f10825a.get(str2);
            if (iArr2 != null) {
                m(str2);
                if (str2.equals("glyf")) {
                    k(b(this.f10837m));
                    i10 = this.f10838n;
                } else if (str2.equals("loca")) {
                    k(b(this.f10836l));
                    i10 = this.f10839o;
                } else {
                    k(iArr2[0]);
                    i10 = iArr2[2];
                }
                k(i13);
                k(i10);
                i13 += (i10 + 3) & -4;
            }
        }
        for (String str3 : strArr) {
            int[] iArr3 = (int[]) this.f10825a.get(str3);
            if (iArr3 != null) {
                if (str3.equals("glyf")) {
                    byte[] bArr = this.f10837m;
                    System.arraycopy(bArr, 0, this.f10840p, this.f10841q, bArr.length);
                    this.f10841q += this.f10837m.length;
                    this.f10837m = null;
                } else if (str3.equals("loca")) {
                    byte[] bArr2 = this.f10836l;
                    System.arraycopy(bArr2, 0, this.f10840p, this.f10841q, bArr2.length);
                    this.f10841q += this.f10836l.length;
                    this.f10836l = null;
                } else {
                    this.f10826b.j(iArr3[1]);
                    this.f10826b.readFully(this.f10840p, this.f10841q, iArr3[2]);
                    this.f10841q += (iArr3[2] + 3) & -4;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public int b(byte[] bArr) {
        int length = bArr.length / 4;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            i13 += bArr[i14] & 255;
            i12 += bArr[i14 + 1] & 255;
            int i16 = i14 + 3;
            i11 += bArr[i14 + 2] & 255;
            i14 += 4;
            i10 += bArr[i16] & 255;
        }
        return i10 + (i11 << 8) + (i12 << 16) + (i13 << 24);
    }

    /* access modifiers changed from: protected */
    public void c(int i10) {
        int[] iArr = this.f10831g;
        int i11 = iArr[i10];
        if (i11 != iArr[i10 + 1]) {
            this.f10826b.j(this.f10834j + i11);
            if (this.f10826b.readShort() < 0) {
                f2 f2Var = this.f10826b;
                int i12 = 8;
                while (true) {
                    f2Var.skipBytes(i12);
                    int readUnsignedShort = this.f10826b.readUnsignedShort();
                    Integer valueOf = Integer.valueOf(this.f10826b.readUnsignedShort());
                    if (!this.f10832h.contains(valueOf)) {
                        this.f10832h.add(valueOf);
                        this.f10833i.add(valueOf);
                    }
                    if ((readUnsignedShort & 32) != 0) {
                        i12 = (readUnsignedShort & 1) != 0 ? 4 : 2;
                        if ((readUnsignedShort & 8) != 0) {
                            i12 += 2;
                        } else if ((readUnsignedShort & 64) != 0) {
                            i12 += 4;
                        }
                        if ((readUnsignedShort & 128) != 0) {
                            i12 += 8;
                        }
                        f2Var = this.f10826b;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.f10835k = new int[this.f10831g.length];
        int size = this.f10833i.size();
        int[] iArr = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = ((Integer) this.f10833i.get(i11)).intValue();
        }
        Arrays.sort(iArr);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            int i14 = iArr[i13];
            int[] iArr2 = this.f10831g;
            i12 += iArr2[i14 + 1] - iArr2[i14];
        }
        this.f10838n = i12;
        this.f10837m = new byte[((i12 + 3) & -4)];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr3 = this.f10835k;
            if (i10 < iArr3.length) {
                iArr3[i10] = i15;
                if (i16 < size && iArr[i16] == i10) {
                    i16++;
                    iArr3[i10] = i15;
                    int[] iArr4 = this.f10831g;
                    int i17 = iArr4[i10];
                    int i18 = iArr4[i10 + 1] - i17;
                    if (i18 > 0) {
                        this.f10826b.j(this.f10834j + i17);
                        this.f10826b.readFully(this.f10837m, i15, i18);
                        i15 += i18;
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.f10825a = new HashMap();
        this.f10826b.j(this.f10842r);
        if (this.f10826b.readInt() == 65536) {
            int readUnsignedShort = this.f10826b.readUnsignedShort();
            this.f10826b.skipBytes(6);
            for (int i10 = 0; i10 < readUnsignedShort; i10++) {
                this.f10825a.put(j(4), new int[]{this.f10826b.readInt(), this.f10826b.readInt(), this.f10826b.readInt()});
            }
            return;
        }
        throw new g(a.b("1.is.not.a.true.type.file", this.f10827c));
    }

    /* access modifiers changed from: protected */
    public void f() {
        int[] iArr = (int[]) this.f10825a.get("glyf");
        if (iArr != null) {
            if (!this.f10832h.contains(0)) {
                this.f10832h.add(0);
                this.f10833i.add(0);
            }
            this.f10834j = iArr[1];
            for (int i10 = 0; i10 < this.f10833i.size(); i10++) {
                c(((Integer) this.f10833i.get(i10)).intValue());
            }
            return;
        }
        throw new g(a.b("table.1.does.not.exist.in.2", "glyf", this.f10827c));
    }

    /* access modifiers changed from: protected */
    public void g() {
        this.f10839o = this.f10830f ? this.f10835k.length * 2 : this.f10835k.length * 4;
        byte[] bArr = new byte[((this.f10839o + 3) & -4)];
        this.f10836l = bArr;
        this.f10840p = bArr;
        int i10 = 0;
        this.f10841q = 0;
        while (true) {
            int[] iArr = this.f10835k;
            if (i10 < iArr.length) {
                if (this.f10830f) {
                    l(iArr[i10] / 2);
                } else {
                    k(iArr[i10]);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public byte[] h() {
        try {
            this.f10826b.f();
            e();
            i();
            f();
            d();
            g();
            a();
            return this.f10840p;
        } finally {
            try {
                this.f10826b.close();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
        int[] iArr = (int[]) this.f10825a.get("head");
        if (iArr != null) {
            this.f10826b.j(iArr[1] + 51);
            int i10 = 0;
            this.f10830f = this.f10826b.readUnsignedShort() == 0;
            int[] iArr2 = (int[]) this.f10825a.get("loca");
            if (iArr2 != null) {
                this.f10826b.j(iArr2[1]);
                if (this.f10830f) {
                    int i11 = iArr2[2] / 2;
                    this.f10831g = new int[i11];
                    while (i10 < i11) {
                        this.f10831g[i10] = this.f10826b.readUnsignedShort() * 2;
                        i10++;
                    }
                    return;
                }
                int i12 = iArr2[2] / 4;
                this.f10831g = new int[i12];
                while (i10 < i12) {
                    this.f10831g[i10] = this.f10826b.readInt();
                    i10++;
                }
                return;
            }
            throw new g(a.b("table.1.does.not.exist.in.2", "loca", this.f10827c));
        }
        throw new g(a.b("table.1.does.not.exist.in.2", "head", this.f10827c));
    }

    /* access modifiers changed from: protected */
    public String j(int i10) {
        byte[] bArr = new byte[i10];
        this.f10826b.readFully(bArr);
        try {
            return new String(bArr, "Cp1252");
        } catch (Exception e10) {
            throw new j(e10);
        }
    }

    /* access modifiers changed from: protected */
    public void k(int i10) {
        byte[] bArr = this.f10840p;
        int i11 = this.f10841q;
        bArr[i11] = (byte) (i10 >> 24);
        bArr[i11 + 1] = (byte) (i10 >> 16);
        bArr[i11 + 2] = (byte) (i10 >> 8);
        this.f10841q = i11 + 4;
        bArr[i11 + 3] = (byte) i10;
    }

    /* access modifiers changed from: protected */
    public void l(int i10) {
        byte[] bArr = this.f10840p;
        int i11 = this.f10841q;
        bArr[i11] = (byte) (i10 >> 8);
        this.f10841q = i11 + 2;
        bArr[i11 + 1] = (byte) i10;
    }

    /* access modifiers changed from: protected */
    public void m(String str) {
        byte[] c10 = o0.c(str, "Cp1252");
        System.arraycopy(c10, 0, this.f10840p, this.f10841q, c10.length);
        this.f10841q += c10.length;
    }
}
