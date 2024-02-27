package cm;

import im.a;
import im.f;

public abstract class q extends c implements f {

    /* renamed from: l  reason: collision with root package name */
    private final boolean f20230l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        boolean z10 = false;
        this.f20230l = (i10 & 2) == 2 ? true : z10;
    }

    public a b() {
        return this.f20230l ? this : super.b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return i().equals(qVar.i()) && f().equals(qVar.f()) && j().equals(qVar.j()) && l.a(e(), qVar.e());
        } else if (obj instanceof f) {
            return obj.equals(b());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((i().hashCode() * 31) + f().hashCode()) * 31) + j().hashCode();
    }

    public String toString() {
        a b10 = b();
        if (b10 != this) {
            return b10.toString();
        }
        return "property " + f() + " (Kotlin reflection is not available)";
    }
}
