package hp;

class z {

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f24315a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    private final g f24316b;

    /* renamed from: c  reason: collision with root package name */
    private final r f24317c = new r();

    public z(g gVar) {
        this.f24316b = gVar;
    }

    private void a(o oVar) {
        f peek = this.f24316b.peek();
        if (peek.h()) {
            this.f24315a.append(peek.getValue());
        }
    }

    private String b(o oVar) {
        if (this.f24315a.length() <= 0) {
            return null;
        }
        String sb2 = this.f24315a.toString();
        this.f24315a.setLength(0);
        return sb2;
    }

    private o e(o oVar, f fVar) {
        n nVar = new n(oVar, this, fVar);
        if (this.f24315a.length() > 0) {
            this.f24315a.setLength(0);
        }
        return fVar.t() ? (o) this.f24317c.r(nVar) : nVar;
    }

    private String f(o oVar) {
        while (true) {
            f peek = this.f24316b.peek();
            if (this.f24317c.v() == oVar && peek.h()) {
                a(oVar);
                this.f24316b.next();
            }
        }
        return b(oVar);
    }

    public o c(o oVar) {
        if (!this.f24317c.F(oVar)) {
            return null;
        }
        while (true) {
            f next = this.f24316b.next();
            if (next == null) {
                return null;
            }
            if (next.b0()) {
                if (this.f24317c.pop() == oVar) {
                    return null;
                }
            } else if (next.t()) {
                return e(oVar, next);
            }
        }
    }

    public o d() {
        if (!this.f24317c.isEmpty()) {
            return null;
        }
        o c10 = c((o) null);
        if (c10 != null) {
            return c10;
        }
        throw new w("Document has no root element");
    }

    public String g(o oVar) {
        if (!this.f24317c.F(oVar)) {
            return null;
        }
        if (this.f24315a.length() <= 0 && this.f24316b.peek().b0()) {
            if (this.f24317c.v() == oVar) {
                return null;
            }
            this.f24317c.pop();
            this.f24316b.next();
        }
        return f(oVar);
    }

    public void h(o oVar) {
        do {
        } while (c(oVar) != null);
    }
}
