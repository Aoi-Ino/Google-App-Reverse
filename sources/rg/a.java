package rg;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f31057a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f31058b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f31059c;

    public a(int i10, boolean z10, boolean z11) {
        this.f31057a = i10;
        this.f31058b = z10;
        this.f31059c = z11;
    }

    public final int a() {
        return this.f31057a;
    }

    public final boolean b() {
        return this.f31058b;
    }

    public final boolean c() {
        return this.f31059c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f31057a == aVar.f31057a && this.f31058b == aVar.f31058b && this.f31059c == aVar.f31059c;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f31057a) * 31;
        boolean z10 = this.f31058b;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (hashCode + (z10 ? 1 : 0)) * 31;
        boolean z12 = this.f31059c;
        if (!z12) {
            z11 = z12;
        }
        return i10 + (z11 ? 1 : 0);
    }

    public String toString() {
        return "ServiceListTO(purposeCode=" + this.f31057a + ", selectService=" + this.f31058b + ", isEnable=" + this.f31059c + ')';
    }
}
