package cm;

import im.a;
import im.d;

public abstract class j extends c implements i, d {

    /* renamed from: l  reason: collision with root package name */
    private final int f20226l;

    /* renamed from: m  reason: collision with root package name */
    private final int f20227m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.f20226l = i10;
        this.f20227m = i11 >> 1;
    }

    /* access modifiers changed from: protected */
    public a c() {
        return v.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return f().equals(jVar.f()) && j().equals(jVar.j()) && this.f20227m == jVar.f20227m && this.f20226l == jVar.f20226l && l.a(e(), jVar.e()) && l.a(i(), jVar.i());
        } else if (obj instanceof d) {
            return obj.equals(b());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.f20226l;
    }

    public int hashCode() {
        return (((i() == null ? 0 : i().hashCode() * 31) + f().hashCode()) * 31) + j().hashCode();
    }

    public String toString() {
        a b10 = b();
        if (b10 != this) {
            return b10.toString();
        }
        if ("<init>".equals(f())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + f() + " (Kotlin reflection is not available)";
    }
}
