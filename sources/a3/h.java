package a3;

import java.util.Arrays;
import y2.c;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final c f180a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f181b;

    public h(c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f180a = cVar;
            this.f181b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public byte[] a() {
        return this.f181b;
    }

    public c b() {
        return this.f180a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f180a.equals(hVar.f180a)) {
            return false;
        }
        return Arrays.equals(this.f181b, hVar.f181b);
    }

    public int hashCode() {
        return ((this.f180a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f181b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f180a + ", bytes=[...]}";
    }
}
