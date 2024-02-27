package z2;

import z2.k;

final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    private final k.b f18778a;

    /* renamed from: b  reason: collision with root package name */
    private final a f18779b;

    static final class b extends k.a {

        /* renamed from: a  reason: collision with root package name */
        private k.b f18780a;

        /* renamed from: b  reason: collision with root package name */
        private a f18781b;

        b() {
        }

        public k a() {
            return new e(this.f18780a, this.f18781b);
        }

        public k.a b(a aVar) {
            this.f18781b = aVar;
            return this;
        }

        public k.a c(k.b bVar) {
            this.f18780a = bVar;
            return this;
        }
    }

    private e(k.b bVar, a aVar) {
        this.f18778a = bVar;
        this.f18779b = aVar;
    }

    public a b() {
        return this.f18779b;
    }

    public k.b c() {
        return this.f18778a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f18778a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            a aVar = this.f18779b;
            a b10 = kVar.b();
            if (aVar == null) {
                if (b10 == null) {
                    return true;
                }
            } else if (aVar.equals(b10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f18778a;
        int i10 = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        a aVar = this.f18779b;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f18778a + ", androidClientInfo=" + this.f18779b + "}";
    }
}
