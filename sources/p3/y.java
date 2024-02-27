package p3;

import java.util.Arrays;

final class y extends x {

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f14660c;

    y(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f14660c = bArr;
    }

    /* access modifiers changed from: package-private */
    public final byte[] j() {
        return this.f14660c;
    }
}
