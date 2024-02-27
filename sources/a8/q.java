package a8;

public class q extends t {

    /* renamed from: p  reason: collision with root package name */
    protected c f318p;

    public q(String str) {
        super(str);
    }

    public int F() {
        return 15;
    }

    public c L0() {
        return this.f318p;
    }

    public void M0(float f10, boolean z10) {
        if (z10) {
            f10 = L0().h();
        }
        D0(f10);
    }

    public void N0(c cVar) {
        if (this.f318p == null) {
            this.f318p = cVar;
            if (cVar.d().l()) {
                this.f318p.m(this.f360f);
            }
        }
    }
}
