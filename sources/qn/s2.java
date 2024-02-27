package qn;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

class s2 extends c0 {

    /* renamed from: g  reason: collision with root package name */
    private byte[] f30989g;

    s2(byte[] bArr) {
        if (bArr != null) {
            this.f30989g = bArr;
            return;
        }
        throw new NullPointerException("'encoded' cannot be null");
    }

    private synchronized void s0() {
        if (this.f30989g != null) {
            o oVar = new o(this.f30989g, true);
            try {
                g E = oVar.E();
                oVar.close();
                this.f30887e = E.g();
                this.f30989g = null;
            } catch (IOException e10) {
                throw new y("malformed ASN.1: " + e10, e10);
            }
        }
    }

    private synchronized byte[] t0() {
        return this.f30989g;
    }

    /* access modifiers changed from: package-private */
    public void B(x xVar, boolean z10) {
        byte[] t02 = t0();
        if (t02 != null) {
            xVar.o(z10, 48, t02);
        } else {
            super.h0().B(xVar, z10);
        }
    }

    /* access modifiers changed from: package-private */
    public int T(boolean z10) {
        byte[] t02 = t0();
        return t02 != null ? x.g(z10, t02.length) : super.h0().T(z10);
    }

    /* access modifiers changed from: package-private */
    public z g0() {
        s0();
        return super.g0();
    }

    /* access modifiers changed from: package-private */
    public z h0() {
        s0();
        return super.h0();
    }

    public int hashCode() {
        s0();
        return super.hashCode();
    }

    public Iterator iterator() {
        s0();
        return super.iterator();
    }

    public f l0(int i10) {
        s0();
        return super.l0(i10);
    }

    public Enumeration m0() {
        byte[] t02 = t0();
        return t02 != null ? new r2(t02) : super.m0();
    }

    /* access modifiers changed from: package-private */
    public c n0() {
        return ((c0) h0()).n0();
    }

    /* access modifiers changed from: package-private */
    public j o0() {
        return ((c0) h0()).o0();
    }

    /* access modifiers changed from: package-private */
    public v p0() {
        return ((c0) h0()).p0();
    }

    /* access modifiers changed from: package-private */
    public d0 q0() {
        return ((c0) h0()).q0();
    }

    public int size() {
        s0();
        return super.size();
    }
}
