package p;

import java.util.Arrays;
import java.util.HashSet;

public class i implements Comparable {

    /* renamed from: v  reason: collision with root package name */
    private static int f14553v = 1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14554e;

    /* renamed from: f  reason: collision with root package name */
    private String f14555f;

    /* renamed from: g  reason: collision with root package name */
    public int f14556g = -1;

    /* renamed from: h  reason: collision with root package name */
    int f14557h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f14558i = 0;

    /* renamed from: j  reason: collision with root package name */
    public float f14559j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f14560k = false;

    /* renamed from: l  reason: collision with root package name */
    float[] f14561l = new float[9];

    /* renamed from: m  reason: collision with root package name */
    float[] f14562m = new float[9];

    /* renamed from: n  reason: collision with root package name */
    a f14563n;

    /* renamed from: o  reason: collision with root package name */
    b[] f14564o = new b[16];

    /* renamed from: p  reason: collision with root package name */
    int f14565p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f14566q = 0;

    /* renamed from: r  reason: collision with root package name */
    boolean f14567r = false;

    /* renamed from: s  reason: collision with root package name */
    int f14568s = -1;

    /* renamed from: t  reason: collision with root package name */
    float f14569t = 0.0f;

    /* renamed from: u  reason: collision with root package name */
    HashSet f14570u = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f14563n = aVar;
    }

    static void c() {
        f14553v++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f14565p;
            if (i10 >= i11) {
                b[] bVarArr = this.f14564o;
                if (i11 >= bVarArr.length) {
                    this.f14564o = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f14564o;
                int i12 = this.f14565p;
                bVarArr2[i12] = bVar;
                this.f14565p = i12 + 1;
                return;
            } else if (this.f14564o[i10] != bVar) {
                i10++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public int compareTo(i iVar) {
        return this.f14556g - iVar.f14556g;
    }

    public final void d(b bVar) {
        int i10 = this.f14565p;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f14564o[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f14564o;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f14565p--;
                return;
            }
            i11++;
        }
    }

    public void e() {
        this.f14555f = null;
        this.f14563n = a.UNKNOWN;
        this.f14558i = 0;
        this.f14556g = -1;
        this.f14557h = -1;
        this.f14559j = 0.0f;
        this.f14560k = false;
        this.f14567r = false;
        this.f14568s = -1;
        this.f14569t = 0.0f;
        int i10 = this.f14565p;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f14564o[i11] = null;
        }
        this.f14565p = 0;
        this.f14566q = 0;
        this.f14554e = false;
        Arrays.fill(this.f14562m, 0.0f);
    }

    public void f(d dVar, float f10) {
        this.f14559j = f10;
        this.f14560k = true;
        this.f14567r = false;
        this.f14568s = -1;
        this.f14569t = 0.0f;
        int i10 = this.f14565p;
        this.f14557h = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f14564o[i11].A(dVar, this, false);
        }
        this.f14565p = 0;
    }

    public void g(a aVar, String str) {
        this.f14563n = aVar;
    }

    public final void h(d dVar, b bVar) {
        int i10 = this.f14565p;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f14564o[i11].B(dVar, bVar, false);
        }
        this.f14565p = 0;
    }

    public String toString() {
        StringBuilder sb2;
        if (this.f14555f != null) {
            sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(this.f14555f);
        } else {
            sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(this.f14556g);
        }
        return sb2.toString();
    }
}
