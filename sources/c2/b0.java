package c2;

import b2.c;
import b2.d;
import java.nio.ByteBuffer;
import mn.a;
import pn.b;
import w7.e;

public class b0 extends a {

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4636t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4637u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4638v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4639w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4640x = null;

    /* renamed from: r  reason: collision with root package name */
    private int f4641r = 0;

    /* renamed from: s  reason: collision with root package name */
    private int[] f4642s = new int[3];

    static {
        n();
    }

    public b0() {
        super("vmhd");
        r(1);
    }

    private static /* synthetic */ void n() {
        b bVar = new b("VideoMediaHeaderBox.java", b0.class);
        f4636t = bVar.f("method-execution", bVar.e("1", "getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "int"), 39);
        f4637u = bVar.f("method-execution", bVar.e("1", "getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "[I"), 43);
        f4638v = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "java.lang.String"), 71);
        f4639w = bVar.f("method-execution", bVar.e("1", "setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "", "void"), 75);
        f4640x = bVar.f("method-execution", bVar.e("1", "setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "", "void"), 79);
    }

    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        this.f4641r = c.h(byteBuffer);
        this.f4642s = new int[3];
        for (int i10 = 0; i10 < 3; i10++) {
            this.f4642s[i10] = c.h(byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        d.e(byteBuffer, this.f4641r);
        for (int e10 : this.f4642s) {
            d.e(byteBuffer, e10);
        }
    }

    /* access modifiers changed from: protected */
    public long c() {
        return 12;
    }

    public String toString() {
        e.b().c(b.c(f4638v, this, this));
        return "VideoMediaHeaderBox[graphicsmode=" + u() + ";opcolor0=" + v()[0] + ";opcolor1=" + v()[1] + ";opcolor2=" + v()[2] + "]";
    }

    public int u() {
        e.b().c(b.c(f4636t, this, this));
        return this.f4641r;
    }

    public int[] v() {
        e.b().c(b.c(f4637u, this, this));
        return this.f4642s;
    }
}
