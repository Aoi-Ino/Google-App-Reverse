package z2;

import z2.o;

final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    private final o.c f18811a;

    /* renamed from: b  reason: collision with root package name */
    private final o.b f18812b;

    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private o.c f18813a;

        /* renamed from: b  reason: collision with root package name */
        private o.b f18814b;

        b() {
        }

        public o a() {
            return new i(this.f18813a, this.f18814b);
        }

        public o.a b(o.b bVar) {
            this.f18814b = bVar;
            return this;
        }

        public o.a c(o.c cVar) {
            this.f18813a = cVar;
            return this;
        }
    }

    private i(o.c cVar, o.b bVar) {
        this.f18811a = cVar;
        this.f18812b = bVar;
    }

    public o.b b() {
        return this.f18812b;
    }

    public o.c c() {
        return this.f18811a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.f18811a;
        if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
            o.b bVar = this.f18812b;
            o.b b10 = oVar.b();
            if (bVar == null) {
                if (b10 == null) {
                    return true;
                }
            } else if (bVar.equals(b10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f18811a;
        int i10 = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f18812b;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f18811a + ", mobileSubtype=" + this.f18812b + "}";
    }
}
