package b3;

import b3.f;
import java.util.Arrays;

final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Iterable f4409a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f4410b;

    static final class b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private Iterable f4411a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f4412b;

        b() {
        }

        public f a() {
            String str = "";
            if (this.f4411a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new a(this.f4411a, this.f4412b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.a b(Iterable iterable) {
            if (iterable != null) {
                this.f4411a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        public f.a c(byte[] bArr) {
            this.f4412b = bArr;
            return this;
        }
    }

    private a(Iterable iterable, byte[] bArr) {
        this.f4409a = iterable;
        this.f4410b = bArr;
    }

    public Iterable b() {
        return this.f4409a;
    }

    public byte[] c() {
        return this.f4410b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f4409a.equals(fVar.b())) {
            if (Arrays.equals(this.f4410b, fVar instanceof a ? ((a) fVar).f4410b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4409a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4410b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f4409a + ", extras=" + Arrays.toString(this.f4410b) + "}";
    }
}
