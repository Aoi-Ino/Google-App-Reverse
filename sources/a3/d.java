package a3;

import a3.o;
import java.util.Arrays;
import y2.e;

final class d extends o {

    /* renamed from: a  reason: collision with root package name */
    private final String f160a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f161b;

    /* renamed from: c  reason: collision with root package name */
    private final e f162c;

    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private String f163a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f164b;

        /* renamed from: c  reason: collision with root package name */
        private e f165c;

        b() {
        }

        public o a() {
            String str = "";
            if (this.f163a == null) {
                str = str + " backendName";
            }
            if (this.f165c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f163a, this.f164b, this.f165c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public o.a b(String str) {
            if (str != null) {
                this.f163a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public o.a c(byte[] bArr) {
            this.f164b = bArr;
            return this;
        }

        public o.a d(e eVar) {
            if (eVar != null) {
                this.f165c = eVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    private d(String str, byte[] bArr, e eVar) {
        this.f160a = str;
        this.f161b = bArr;
        this.f162c = eVar;
    }

    public String b() {
        return this.f160a;
    }

    public byte[] c() {
        return this.f161b;
    }

    public e d() {
        return this.f162c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f160a.equals(oVar.b())) {
            if (Arrays.equals(this.f161b, oVar instanceof d ? ((d) oVar).f161b : oVar.c()) && this.f162c.equals(oVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f160a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f161b)) * 1000003) ^ this.f162c.hashCode();
    }
}
