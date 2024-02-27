package x7;

import java.nio.ByteBuffer;
import mn.a;
import w7.e;
import y7.h;

public class b extends a {
    private static final /* synthetic */ a.C0323a A = null;
    private static final /* synthetic */ a.C0323a B = null;
    private static final /* synthetic */ a.C0323a C = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f18211z = null;

    static {
        n();
    }

    public b() {
        super("esds");
    }

    private static /* synthetic */ void n() {
        pn.b bVar = new pn.b("ESDescriptorBox.java", b.class);
        f18211z = bVar.f("method-execution", bVar.e("1", "getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"), 33);
        A = bVar.f("method-execution", bVar.e("1", "setEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "esDescriptor", "", "void"), 37);
        B = bVar.f("method-execution", bVar.e("1", "equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "", "boolean"), 42);
        C = bVar.f("method-execution", bVar.e("1", "hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "", "int"), 53);
    }

    public boolean equals(Object obj) {
        e.b().c(pn.b.d(B, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f18210s;
        ByteBuffer byteBuffer2 = ((b) obj).f18210s;
        return byteBuffer == null ? byteBuffer2 == null : byteBuffer.equals(byteBuffer2);
    }

    public int hashCode() {
        e.b().c(pn.b.c(C, this, this));
        ByteBuffer byteBuffer = this.f18210s;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public void w(h hVar) {
        e.b().c(pn.b.d(A, this, this, hVar));
        super.v(hVar);
    }
}
