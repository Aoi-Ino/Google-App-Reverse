package n5;

final class a0 extends d {

    /* renamed from: a  reason: collision with root package name */
    private final int f14143a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14144b;

    /* synthetic */ a0(int i10, boolean z10, z zVar) {
        this.f14143a = i10;
        this.f14144b = z10;
    }

    public final boolean a() {
        return this.f14144b;
    }

    public final int b() {
        return this.f14143a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f14143a == dVar.b() && this.f14144b == dVar.a();
        }
    }

    public final int hashCode() {
        return ((this.f14143a ^ 1000003) * 1000003) ^ (true != this.f14144b ? 1237 : 1231);
    }

    public final String toString() {
        int i10 = this.f14143a;
        boolean z10 = this.f14144b;
        StringBuilder sb2 = new StringBuilder(73);
        sb2.append("AppUpdateOptions{appUpdateType=");
        sb2.append(i10);
        sb2.append(", allowAssetPackDeletion=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }
}
