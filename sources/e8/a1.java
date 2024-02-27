package e8;

import java.io.OutputStream;

public class a1 extends i1 {

    /* renamed from: g  reason: collision with root package name */
    private int f10174g;

    public a1(String str) {
        super(0, str);
    }

    public void k(c2 c2Var, OutputStream outputStream) {
        if (outputStream instanceof u) {
            this.f10174g = ((u) outputStream).c();
        }
        super.k(c2Var, outputStream);
    }

    public a1(byte[] bArr) {
        super(0, bArr);
    }
}
