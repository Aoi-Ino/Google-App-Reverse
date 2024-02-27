package c2;

import java.nio.ByteBuffer;
import mn.a;
import pn.b;
import w7.e;

public class w extends a {

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4725r = null;

    static {
        n();
    }

    public w() {
        super("sthd");
    }

    private static /* synthetic */ void n() {
        b bVar = new b("SubtitleMediaHeaderBox.java", w.class);
        f4725r = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.SubtitleMediaHeaderBox", "", "", "", "java.lang.String"), 30);
    }

    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
    }

    /* access modifiers changed from: protected */
    public long c() {
        return 4;
    }

    public String toString() {
        e.b().c(b.c(f4725r, this, this));
        return "SubtitleMediaHeaderBox";
    }
}
