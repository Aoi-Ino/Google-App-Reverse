package p;

import java.util.Arrays;
import java.util.Comparator;
import p.b;

public class h extends b {

    /* renamed from: g  reason: collision with root package name */
    private int f14543g = 128;

    /* renamed from: h  reason: collision with root package name */
    private i[] f14544h = new i[128];

    /* renamed from: i  reason: collision with root package name */
    private i[] f14545i = new i[128];

    /* renamed from: j  reason: collision with root package name */
    private int f14546j = 0;

    /* renamed from: k  reason: collision with root package name */
    b f14547k = new b(this);

    /* renamed from: l  reason: collision with root package name */
    c f14548l;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            return iVar.f14556g - iVar2.f14556g;
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        i f14550a;

        /* renamed from: b  reason: collision with root package name */
        h f14551b;

        public b(h hVar) {
            this.f14551b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (this.f14550a.f14554e) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr = this.f14550a.f14562m;
                    float f11 = fArr[i10] + (iVar.f14562m[i10] * f10);
                    fArr[i10] = f11;
                    if (Math.abs(f11) < 1.0E-4f) {
                        this.f14550a.f14562m[i10] = 0.0f;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    h.this.G(this.f14550a);
                }
                return false;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float f12 = iVar.f14562m[i11];
                if (f12 != 0.0f) {
                    float f13 = f12 * f10;
                    if (Math.abs(f13) < 1.0E-4f) {
                        f13 = 0.0f;
                    }
                    this.f14550a.f14562m[i11] = f13;
                } else {
                    this.f14550a.f14562m[i11] = 0.0f;
                }
            }
            return true;
        }

        public void b(i iVar) {
            this.f14550a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f14550a.f14562m[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = iVar.f14562m[i10];
                float f11 = this.f14550a.f14562m[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f14550a.f14562m, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f14550a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f14550a.f14562m[i10] + " ";
                }
            }
            return str + "] " + this.f14550a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f14548l = cVar;
    }

    private final void F(i iVar) {
        int i10;
        int i11 = this.f14546j + 1;
        i[] iVarArr = this.f14544h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f14544h = iVarArr2;
            this.f14545i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f14544h;
        int i12 = this.f14546j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f14546j = i13;
        if (i13 > 1 && iVarArr3[i12].f14556g > iVar.f14556g) {
            int i14 = 0;
            while (true) {
                i10 = this.f14546j;
                if (i14 >= i10) {
                    break;
                }
                this.f14545i[i14] = this.f14544h[i14];
                i14++;
            }
            Arrays.sort(this.f14545i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f14546j; i15++) {
                this.f14544h[i15] = this.f14545i[i15];
            }
        }
        iVar.f14554e = true;
        iVar.a(this);
    }

    /* access modifiers changed from: private */
    public final void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f14546j) {
            if (this.f14544h[i10] == iVar) {
                while (true) {
                    int i11 = this.f14546j;
                    if (i10 < i11 - 1) {
                        i[] iVarArr = this.f14544h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    } else {
                        this.f14546j = i11 - 1;
                        iVar.f14554e = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        i iVar = bVar.f14505a;
        if (iVar != null) {
            b.a aVar = bVar.f14509e;
            int g10 = aVar.g();
            for (int i10 = 0; i10 < g10; i10++) {
                i h10 = aVar.h(i10);
                float a10 = aVar.a(i10);
                this.f14547k.b(h10);
                if (this.f14547k.a(iVar, a10)) {
                    F(h10);
                }
                this.f14506b += bVar.f14506b * a10;
            }
            G(iVar);
        }
    }

    public void a(i iVar) {
        this.f14547k.b(iVar);
        this.f14547k.e();
        iVar.f14562m[iVar.f14558i] = 1.0f;
        F(iVar);
    }

    public i c(d dVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f14546j; i11++) {
            i iVar = this.f14544h[i11];
            if (!zArr[iVar.f14556g]) {
                this.f14547k.b(iVar);
                b bVar = this.f14547k;
                if (i10 == -1) {
                    if (!bVar.c()) {
                    }
                } else if (!bVar.d(this.f14544h[i10])) {
                }
                i10 = i11;
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f14544h[i10];
    }

    public void clear() {
        this.f14546j = 0;
        this.f14506b = 0.0f;
    }

    public boolean isEmpty() {
        return this.f14546j == 0;
    }

    public String toString() {
        String str = "" + " goal -> (" + this.f14506b + ") : ";
        for (int i10 = 0; i10 < this.f14546j; i10++) {
            this.f14547k.b(this.f14544h[i10]);
            str = str + this.f14547k + " ";
        }
        return str;
    }
}
