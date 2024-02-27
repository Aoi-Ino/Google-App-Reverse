package g8;

import a8.e;
import e8.c1;
import e8.c2;
import e8.l0;
import e8.u;

public class b {

    /* renamed from: f  reason: collision with root package name */
    public static final byte[][] f11724f = {e.f("\n"), e.f("%PDF-"), e.f("\n%âãÏÓ\n")};

    /* renamed from: a  reason: collision with root package name */
    protected boolean f11725a = false;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f11726b = false;

    /* renamed from: c  reason: collision with root package name */
    protected char f11727c = '4';

    /* renamed from: d  reason: collision with root package name */
    protected c1 f11728d = null;

    /* renamed from: e  reason: collision with root package name */
    protected l0 f11729e = null;

    public void a(l0 l0Var) {
        c1 c1Var = this.f11728d;
        if (c1Var != null) {
            l0Var.r(c1.Ta, c1Var);
        }
        l0 l0Var2 = this.f11729e;
        if (l0Var2 != null) {
            l0Var.r(c1.L2, l0Var2);
        }
    }

    public byte[] b(char c10) {
        return e.f(c(c10).toString().substring(1));
    }

    public c1 c(char c10) {
        switch (c10) {
            case '2':
                return c2.f10535b0;
            case '3':
                return c2.f10536c0;
            case '4':
                return c2.f10537d0;
            case '5':
                return c2.f10538e0;
            case '6':
                return c2.f10539f0;
            case '7':
                return c2.f10540g0;
            default:
                return c2.f10537d0;
        }
    }

    public void d(u uVar) {
        if (this.f11726b) {
            uVar.write(f11724f[0]);
            return;
        }
        byte[][] bArr = f11724f;
        uVar.write(bArr[1]);
        uVar.write(b(this.f11727c));
        uVar.write(bArr[2]);
        this.f11725a = true;
    }
}
