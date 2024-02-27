package qn;

import java.io.InputStream;

abstract class t2 extends InputStream {

    /* renamed from: e  reason: collision with root package name */
    protected final InputStream f30994e;

    /* renamed from: f  reason: collision with root package name */
    private int f30995f;

    t2(InputStream inputStream, int i10) {
        this.f30994e = inputStream;
        this.f30995f = i10;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f30995f;
    }

    /* access modifiers changed from: protected */
    public void e(boolean z10) {
        InputStream inputStream = this.f30994e;
        if (inputStream instanceof q2) {
            ((q2) inputStream).g(z10);
        }
    }
}
