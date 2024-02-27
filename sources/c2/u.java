package c2;

import b2.c;
import b2.d;
import java.nio.ByteBuffer;
import mn.a;
import pn.b;
import w7.e;

public class u extends a {

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4719s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ a.C0323a f4720t = null;

    /* renamed from: r  reason: collision with root package name */
    private float f4721r;

    static {
        n();
    }

    public u() {
        super("smhd");
    }

    private static /* synthetic */ void n() {
        b bVar = new b("SoundMediaHeaderBox.java", u.class);
        f4719s = bVar.f("method-execution", bVar.e("1", "getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "", "float"), 36);
        f4720t = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "", "java.lang.String"), 58);
    }

    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        this.f4721r = c.e(byteBuffer);
        c.h(byteBuffer);
    }

    /* access modifiers changed from: protected */
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        d.c(byteBuffer, (double) this.f4721r);
        d.e(byteBuffer, 0);
    }

    /* access modifiers changed from: protected */
    public long c() {
        return 8;
    }

    public String toString() {
        e.b().c(b.c(f4720t, this, this));
        return "SoundMediaHeaderBox[balance=" + u() + "]";
    }

    public float u() {
        e.b().c(b.c(f4719s, this, this));
        return this.f4721r;
    }
}
