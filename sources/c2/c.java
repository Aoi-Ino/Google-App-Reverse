package c2;

import mn.a;
import pn.b;
import w7.e;

public abstract class c extends w7.c {

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4643r = null;

    static {
        n();
    }

    public c(String str) {
        super(str);
    }

    private static /* synthetic */ void n() {
        b bVar = new b("ChunkOffsetBox.java", c.class);
        f4643r = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "", "java.lang.String"), 18);
    }

    public String toString() {
        e.b().c(b.c(f4643r, this, this));
        return getClass().getSimpleName() + "[entryCount=" + u().length + "]";
    }

    public abstract long[] u();
}
