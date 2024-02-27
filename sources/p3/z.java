package p3;

import java.lang.ref.WeakReference;

abstract class z extends x {

    /* renamed from: d  reason: collision with root package name */
    private static final WeakReference f14661d = new WeakReference((Object) null);

    /* renamed from: c  reason: collision with root package name */
    private WeakReference f14662c = f14661d;

    z(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    public final byte[] j() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.f14662c.get();
                if (bArr == null) {
                    bArr = l0();
                    this.f14662c = new WeakReference(bArr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] l0();
}
