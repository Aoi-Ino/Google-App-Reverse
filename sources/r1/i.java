package r1;

import cm.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f15450a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15451b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15452c;

    public i(String str, int i10, int i11) {
        l.f(str, "workSpecId");
        this.f15450a = str;
        this.f15451b = i10;
        this.f15452c = i11;
    }

    public final int a() {
        return this.f15451b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f15450a, iVar.f15450a) && this.f15451b == iVar.f15451b && this.f15452c == iVar.f15452c;
    }

    public int hashCode() {
        return (((this.f15450a.hashCode() * 31) + Integer.hashCode(this.f15451b)) * 31) + Integer.hashCode(this.f15452c);
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f15450a + ", generation=" + this.f15451b + ", systemId=" + this.f15452c + ')';
    }
}
