package x7;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import mn.a;
import w7.c;
import w7.e;
import y7.b;
import y7.l;

public abstract class a extends c {

    /* renamed from: t  reason: collision with root package name */
    private static Logger f18203t = Logger.getLogger(a.class.getName());

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f18204u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f18205v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f18206w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f18207x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f18208y = null;

    /* renamed from: r  reason: collision with root package name */
    protected b f18209r;

    /* renamed from: s  reason: collision with root package name */
    protected ByteBuffer f18210s;

    static {
        n();
    }

    public a(String str) {
        super(str);
    }

    private static /* synthetic */ void n() {
        pn.b bVar = new pn.b("AbstractDescriptorBox.java", a.class);
        f18204u = bVar.f("method-execution", bVar.e("1", "getData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "java.nio.ByteBuffer"), 42);
        f18205v = bVar.f("method-execution", bVar.e("1", "getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"), 58);
        f18206w = bVar.f("method-execution", bVar.e("1", "getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "java.lang.String"), 62);
        f18207x = bVar.f("method-execution", bVar.e("1", "setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "", "void"), 66);
        f18208y = bVar.f("method-execution", bVar.e("1", "setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "", "void"), 70);
    }

    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        this.f18210s = byteBuffer.slice();
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
        try {
            this.f18210s.rewind();
            this.f18209r = l.a(-1, this.f18210s);
        } catch (IOException | IndexOutOfBoundsException e10) {
            f18203t.log(Level.WARNING, "Error parsing ObjectDescriptor", e10);
        }
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f18210s.rewind();
        byteBuffer.put(this.f18210s);
    }

    /* access modifiers changed from: protected */
    public long c() {
        return (long) (this.f18210s.limit() + 4);
    }

    public void u(ByteBuffer byteBuffer) {
        e.b().c(pn.b.d(f18208y, this, this, byteBuffer));
        this.f18210s = byteBuffer;
    }

    public void v(b bVar) {
        e.b().c(pn.b.d(f18207x, this, this, bVar));
        this.f18209r = bVar;
    }
}
