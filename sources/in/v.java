package in;

import cm.g;
import cm.l;

public final class v {

    /* renamed from: h  reason: collision with root package name */
    public static final a f24498h = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f24499a;

    /* renamed from: b  reason: collision with root package name */
    public int f24500b;

    /* renamed from: c  reason: collision with root package name */
    public int f24501c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f24502d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f24503e;

    /* renamed from: f  reason: collision with root package name */
    public v f24504f;

    /* renamed from: g  reason: collision with root package name */
    public v f24505g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public v() {
        this.f24499a = new byte[8192];
        this.f24503e = true;
        this.f24502d = false;
    }

    public final void a() {
        v vVar = this.f24505g;
        int i10 = 0;
        if (vVar != this) {
            l.c(vVar);
            if (vVar.f24503e) {
                int i11 = this.f24501c - this.f24500b;
                v vVar2 = this.f24505g;
                l.c(vVar2);
                int i12 = 8192 - vVar2.f24501c;
                v vVar3 = this.f24505g;
                l.c(vVar3);
                if (!vVar3.f24502d) {
                    v vVar4 = this.f24505g;
                    l.c(vVar4);
                    i10 = vVar4.f24500b;
                }
                if (i11 <= i12 + i10) {
                    v vVar5 = this.f24505g;
                    l.c(vVar5);
                    f(vVar5, i11);
                    b();
                    w.b(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    public final v b() {
        v vVar = this.f24504f;
        if (vVar == this) {
            vVar = null;
        }
        v vVar2 = this.f24505g;
        l.c(vVar2);
        vVar2.f24504f = this.f24504f;
        v vVar3 = this.f24504f;
        l.c(vVar3);
        vVar3.f24505g = this.f24505g;
        this.f24504f = null;
        this.f24505g = null;
        return vVar;
    }

    public final v c(v vVar) {
        l.f(vVar, "segment");
        vVar.f24505g = this;
        vVar.f24504f = this.f24504f;
        v vVar2 = this.f24504f;
        l.c(vVar2);
        vVar2.f24505g = vVar;
        this.f24504f = vVar;
        return vVar;
    }

    public final v d() {
        this.f24502d = true;
        return new v(this.f24499a, this.f24500b, this.f24501c, true, false);
    }

    public final v e(int i10) {
        v vVar;
        if (i10 > 0 && i10 <= this.f24501c - this.f24500b) {
            if (i10 >= 1024) {
                vVar = d();
            } else {
                vVar = w.c();
                byte[] bArr = this.f24499a;
                byte[] bArr2 = vVar.f24499a;
                int i11 = this.f24500b;
                byte[] unused = l.f(bArr, bArr2, 0, i11, i11 + i10, 2, (Object) null);
            }
            vVar.f24501c = vVar.f24500b + i10;
            this.f24500b += i10;
            v vVar2 = this.f24505g;
            l.c(vVar2);
            vVar2.c(vVar);
            return vVar;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    public final void f(v vVar, int i10) {
        l.f(vVar, "sink");
        if (vVar.f24503e) {
            int i11 = vVar.f24501c;
            if (i11 + i10 > 8192) {
                if (!vVar.f24502d) {
                    int i12 = vVar.f24500b;
                    if ((i11 + i10) - i12 <= 8192) {
                        byte[] bArr = vVar.f24499a;
                        byte[] unused = l.f(bArr, bArr, 0, i12, i11, 2, (Object) null);
                        vVar.f24501c -= vVar.f24500b;
                        vVar.f24500b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f24499a;
            byte[] bArr3 = vVar.f24499a;
            int i13 = vVar.f24501c;
            int i14 = this.f24500b;
            byte[] unused2 = l.d(bArr2, bArr3, i13, i14, i14 + i10);
            vVar.f24501c += i10;
            this.f24500b += i10;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public v(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        l.f(bArr, "data");
        this.f24499a = bArr;
        this.f24500b = i10;
        this.f24501c = i11;
        this.f24502d = z10;
        this.f24503e = z11;
    }
}
