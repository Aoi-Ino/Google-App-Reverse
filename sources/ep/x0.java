package ep;

import hp.i;
import jp.a;
import jp.c;

class x0 {

    /* renamed from: a  reason: collision with root package name */
    private final a f23415a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final i f23416b;

    /* renamed from: c  reason: collision with root package name */
    private final Class f23417c;

    public x0(d0 d0Var, n3 n3Var) {
        this.f23416b = n3Var.f();
        this.f23417c = d0Var.getType();
    }

    private w0 b(String str) {
        l2 l2Var = new l2(str, new l(this.f23417c), this.f23416b);
        a aVar = this.f23415a;
        if (aVar != null) {
            aVar.a(str, l2Var);
        }
        return l2Var;
    }

    public w0 a(String str) {
        w0 w0Var = (w0) this.f23415a.b(str);
        return w0Var == null ? b(str) : w0Var;
    }
}
