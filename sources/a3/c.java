package a3;

import a3.n;
import y2.d;
import y2.g;

final class c extends n {

    /* renamed from: a  reason: collision with root package name */
    private final o f150a;

    /* renamed from: b  reason: collision with root package name */
    private final String f151b;

    /* renamed from: c  reason: collision with root package name */
    private final d f152c;

    /* renamed from: d  reason: collision with root package name */
    private final g f153d;

    /* renamed from: e  reason: collision with root package name */
    private final y2.c f154e;

    static final class b extends n.a {

        /* renamed from: a  reason: collision with root package name */
        private o f155a;

        /* renamed from: b  reason: collision with root package name */
        private String f156b;

        /* renamed from: c  reason: collision with root package name */
        private d f157c;

        /* renamed from: d  reason: collision with root package name */
        private g f158d;

        /* renamed from: e  reason: collision with root package name */
        private y2.c f159e;

        b() {
        }

        public n a() {
            String str = "";
            if (this.f155a == null) {
                str = str + " transportContext";
            }
            if (this.f156b == null) {
                str = str + " transportName";
            }
            if (this.f157c == null) {
                str = str + " event";
            }
            if (this.f158d == null) {
                str = str + " transformer";
            }
            if (this.f159e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f155a, this.f156b, this.f157c, this.f158d, this.f159e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public n.a b(y2.c cVar) {
            if (cVar != null) {
                this.f159e = cVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* access modifiers changed from: package-private */
        public n.a c(d dVar) {
            if (dVar != null) {
                this.f157c = dVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* access modifiers changed from: package-private */
        public n.a d(g gVar) {
            if (gVar != null) {
                this.f158d = gVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        public n.a e(o oVar) {
            if (oVar != null) {
                this.f155a = oVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        public n.a f(String str) {
            if (str != null) {
                this.f156b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    private c(o oVar, String str, d dVar, g gVar, y2.c cVar) {
        this.f150a = oVar;
        this.f151b = str;
        this.f152c = dVar;
        this.f153d = gVar;
        this.f154e = cVar;
    }

    public y2.c b() {
        return this.f154e;
    }

    /* access modifiers changed from: package-private */
    public d c() {
        return this.f152c;
    }

    /* access modifiers changed from: package-private */
    public g e() {
        return this.f153d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f150a.equals(nVar.f()) && this.f151b.equals(nVar.g()) && this.f152c.equals(nVar.c()) && this.f153d.equals(nVar.e()) && this.f154e.equals(nVar.b());
    }

    public o f() {
        return this.f150a;
    }

    public String g() {
        return this.f151b;
    }

    public int hashCode() {
        return ((((((((this.f150a.hashCode() ^ 1000003) * 1000003) ^ this.f151b.hashCode()) * 1000003) ^ this.f152c.hashCode()) * 1000003) ^ this.f153d.hashCode()) * 1000003) ^ this.f154e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f150a + ", transportName=" + this.f151b + ", event=" + this.f152c + ", transformer=" + this.f153d + ", encoding=" + this.f154e + "}";
    }
}
