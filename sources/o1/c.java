package o1;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f14342a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14343b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14344c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f14345d;

    public c(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f14342a = z10;
        this.f14343b = z11;
        this.f14344c = z12;
        this.f14345d = z13;
    }

    public final boolean a() {
        return this.f14342a;
    }

    public final boolean b() {
        return this.f14344c;
    }

    public final boolean c() {
        return this.f14345d;
    }

    public final boolean d() {
        return this.f14343b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14342a == cVar.f14342a && this.f14343b == cVar.f14343b && this.f14344c == cVar.f14344c && this.f14345d == cVar.f14345d;
    }

    public int hashCode() {
        boolean z10 = this.f14342a;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (z10 ? 1 : 0) * true;
        boolean z12 = this.f14343b;
        if (z12) {
            z12 = true;
        }
        int i11 = (i10 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.f14344c;
        if (z13) {
            z13 = true;
        }
        int i12 = (i11 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.f14345d;
        if (!z14) {
            z11 = z14;
        }
        return i12 + (z11 ? 1 : 0);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f14342a + ", isValidated=" + this.f14343b + ", isMetered=" + this.f14344c + ", isNotRoaming=" + this.f14345d + ')';
    }
}
