package u6;

import r6.b;
import r6.c;
import r6.g;

class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private boolean f16928a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f16929b = false;

    /* renamed from: c  reason: collision with root package name */
    private c f16930c;

    /* renamed from: d  reason: collision with root package name */
    private final f f16931d;

    i(f fVar) {
        this.f16931d = fVar;
    }

    private void a() {
        if (!this.f16928a) {
            this.f16928a = true;
            return;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* access modifiers changed from: package-private */
    public void b(c cVar, boolean z10) {
        this.f16928a = false;
        this.f16930c = cVar;
        this.f16929b = z10;
    }

    public g c(String str) {
        a();
        this.f16931d.g(this.f16930c, str, this.f16929b);
        return this;
    }

    public g d(boolean z10) {
        a();
        this.f16931d.l(this.f16930c, z10, this.f16929b);
        return this;
    }
}
