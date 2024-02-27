package w7;

import b2.d;
import java.nio.ByteBuffer;
import mn.a;
import pn.b;

public abstract class c extends a {

    /* renamed from: p  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f17940p = null;

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f17941q = null;

    /* renamed from: n  reason: collision with root package name */
    private int f17942n;

    /* renamed from: o  reason: collision with root package name */
    private int f17943o;

    static {
        n();
    }

    protected c(String str) {
        super(str);
    }

    private static /* synthetic */ void n() {
        b bVar = new b("AbstractFullBox.java", c.class);
        f17940p = bVar.f("method-execution", bVar.e("1", "setVersion", "com.googlecode.mp4parser.AbstractFullBox", "int", "version", "", "void"), 51);
        f17941q = bVar.f("method-execution", bVar.e("1", "setFlags", "com.googlecode.mp4parser.AbstractFullBox", "int", "flags", "", "void"), 64);
    }

    public int o() {
        if (!this.f17932h) {
            l();
        }
        return this.f17943o;
    }

    public int p() {
        if (!this.f17932h) {
            l();
        }
        return this.f17942n;
    }

    /* access modifiers changed from: protected */
    public final long q(ByteBuffer byteBuffer) {
        this.f17942n = b2.c.l(byteBuffer);
        this.f17943o = b2.c.i(byteBuffer);
        return 4;
    }

    public void r(int i10) {
        e.b().c(b.d(f17941q, this, this, on.a.d(i10)));
        this.f17943o = i10;
    }

    public void s(int i10) {
        e.b().c(b.d(f17940p, this, this, on.a.d(i10)));
        this.f17942n = i10;
    }

    /* access modifiers changed from: protected */
    public final void t(ByteBuffer byteBuffer) {
        d.i(byteBuffer, this.f17942n);
        d.f(byteBuffer, this.f17943o);
    }
}
