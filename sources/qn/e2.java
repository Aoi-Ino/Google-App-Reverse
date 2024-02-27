package qn;

import java.io.IOException;
import java.io.InputStream;

public class e2 implements d {

    /* renamed from: e  reason: collision with root package name */
    private final o2 f30912e;

    /* renamed from: f  reason: collision with root package name */
    private int f30913f = 0;

    e2(o2 o2Var) {
        this.f30912e = o2Var;
    }

    private InputStream a(boolean z10) {
        int f10 = this.f30912e.f();
        if (f10 >= 1) {
            int read = this.f30912e.read();
            this.f30913f = read;
            if (read > 0) {
                if (f10 < 2) {
                    throw new IllegalStateException("zero length data with non-zero pad bits");
                } else if (read > 7) {
                    throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
                } else if (z10) {
                    throw new IOException("expected octet-aligned bitstring, but found padBits: " + this.f30913f);
                }
            }
            return this.f30912e;
        }
        throw new IllegalStateException("content octets cannot be empty");
    }

    public z n() {
        try {
            return r();
        } catch (IOException e10) {
            throw new y("IOException converting stream to byte array: " + e10.getMessage(), e10);
        }
    }

    public int o() {
        return this.f30913f;
    }

    public z r() {
        return c.i0(this.f30912e.h());
    }

    public InputStream s() {
        return a(false);
    }
}
