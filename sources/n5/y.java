package n5;

import n5.d;

final class y extends d.a {

    /* renamed from: a  reason: collision with root package name */
    private int f14188a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14189b;

    /* renamed from: c  reason: collision with root package name */
    private byte f14190c;

    y() {
    }

    public final d a() {
        if (this.f14190c == 3) {
            return new a0(this.f14188a, this.f14189b, (z) null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f14190c & 1) == 0) {
            sb2.append(" appUpdateType");
        }
        if ((this.f14190c & 2) == 0) {
            sb2.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final d.a b(boolean z10) {
        this.f14189b = z10;
        this.f14190c = (byte) (this.f14190c | 2);
        return this;
    }

    public final d.a c(int i10) {
        this.f14188a = i10;
        this.f14190c = (byte) (this.f14190c | 1);
        return this;
    }
}
