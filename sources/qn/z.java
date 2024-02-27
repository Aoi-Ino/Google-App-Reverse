package qn;

import java.io.IOException;
import java.io.OutputStream;

public abstract class z extends s {
    z() {
    }

    public static z e0(byte[] bArr) {
        o oVar = new o(bArr);
        try {
            z s10 = oVar.s();
            if (oVar.available() == 0) {
                return s10;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void B(x xVar, boolean z10);

    /* access modifiers changed from: package-private */
    public abstract boolean E();

    public void F(OutputStream outputStream) {
        x a10 = x.a(outputStream);
        a10.u(this, true);
        a10.c();
    }

    public void H(OutputStream outputStream, String str) {
        x b10 = x.b(outputStream, str);
        b10.u(this, true);
        b10.c();
    }

    /* access modifiers changed from: package-private */
    public abstract int T(boolean z10);

    public final boolean Y(z zVar) {
        return this == zVar || y(zVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && y(((f) obj).n());
    }

    /* access modifiers changed from: package-private */
    public z g0() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public z h0() {
        return this;
    }

    public abstract int hashCode();

    public final z n() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean y(z zVar);
}
