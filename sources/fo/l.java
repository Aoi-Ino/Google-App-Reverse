package fo;

import ap.a;
import qn.g;
import qn.p;
import qn.q1;
import qn.s;
import qn.u1;
import qn.z;

public class l extends s {

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f23673e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f23674f;

    public l(byte[] bArr, byte[] bArr2) {
        this.f23673e = a.d(bArr);
        this.f23674f = a.d(bArr2);
    }

    public z n() {
        g gVar = new g();
        gVar.a(new p(0));
        gVar.a(new q1(this.f23673e));
        gVar.a(new q1(this.f23674f));
        return new u1(gVar);
    }
}
