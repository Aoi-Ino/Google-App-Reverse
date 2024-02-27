package hp;

class n implements o {

    /* renamed from: a  reason: collision with root package name */
    private final p f24286a;

    /* renamed from: b  reason: collision with root package name */
    private final z f24287b;

    /* renamed from: c  reason: collision with root package name */
    private final o f24288c;

    /* renamed from: d  reason: collision with root package name */
    private final f f24289d;

    public n(o oVar, z zVar, f fVar) {
        this.f24286a = new p(this, fVar);
        this.f24287b = zVar;
        this.f24288c = oVar;
        this.f24289d = fVar;
    }

    public o a(String str) {
        return this.f24286a.i(str);
    }

    public boolean b() {
        return true;
    }

    public y c() {
        return this.f24286a;
    }

    public String getName() {
        return this.f24289d.getName();
    }

    public j0 getPosition() {
        return new q(this.f24289d);
    }

    public String getValue() {
        return this.f24287b.g(this);
    }

    public o l() {
        return this.f24287b.c(this);
    }

    public void n() {
        this.f24287b.h(this);
    }

    public String toString() {
        return String.format("element %s", new Object[]{getName()});
    }
}
