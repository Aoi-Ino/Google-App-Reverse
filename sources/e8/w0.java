package e8;

import a8.e;
import java.io.OutputStream;

public class w0 {

    /* renamed from: e  reason: collision with root package name */
    static final byte[] f11045e;

    /* renamed from: f  reason: collision with root package name */
    static final byte[] f11046f;

    /* renamed from: g  reason: collision with root package name */
    static final int f11047g;

    /* renamed from: a  reason: collision with root package name */
    protected int f11048a;

    /* renamed from: b  reason: collision with root package name */
    protected int f11049b;

    /* renamed from: c  reason: collision with root package name */
    i1 f11050c;

    /* renamed from: d  reason: collision with root package name */
    c2 f11051d;

    static {
        byte[] f10 = e.f(" obj\n");
        f11045e = f10;
        byte[] f11 = e.f("\nendobj\n");
        f11046f = f11;
        f11047g = f10.length + f11.length;
    }

    w0(int i10, int i11, i1 i1Var, c2 c2Var) {
        this.f11051d = c2Var;
        this.f11048a = i10;
        this.f11049b = i11;
        this.f11050c = i1Var;
        if (c2Var != null) {
            c2Var.A();
        }
    }

    public x0 a() {
        return new x0(this.f11050c.l(), this.f11048a, this.f11049b);
    }

    /* access modifiers changed from: package-private */
    public void b(OutputStream outputStream) {
        outputStream.write(e.f(String.valueOf(this.f11048a)));
        outputStream.write(32);
        outputStream.write(e.f(String.valueOf(this.f11049b)));
        outputStream.write(f11045e);
        this.f11050c.k(this.f11051d, outputStream);
        outputStream.write(f11046f);
    }

    w0(int i10, i1 i1Var, c2 c2Var) {
        this(i10, 0, i1Var, c2Var);
    }
}
