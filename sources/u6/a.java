package u6;

import u6.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private int f16902a;

    /* renamed from: b  reason: collision with root package name */
    private d.a f16903b = d.a.DEFAULT;

    /* renamed from: u6.a$a  reason: collision with other inner class name */
    private static final class C0227a implements d {

        /* renamed from: a  reason: collision with root package name */
        private final int f16904a;

        /* renamed from: b  reason: collision with root package name */
        private final d.a f16905b;

        C0227a(int i10, d.a aVar) {
            this.f16904a = i10;
            this.f16905b = aVar;
        }

        public Class annotationType() {
            return d.class;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f16904a == dVar.tag() && this.f16905b.equals(dVar.intEncoding());
        }

        public int hashCode() {
            return (14552422 ^ this.f16904a) + (this.f16905b.hashCode() ^ 2041407134);
        }

        public d.a intEncoding() {
            return this.f16905b;
        }

        public int tag() {
            return this.f16904a;
        }

        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.f16904a + "intEncoding=" + this.f16905b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0227a(this.f16902a, this.f16903b);
    }

    public a c(int i10) {
        this.f16902a = i10;
        return this;
    }
}
