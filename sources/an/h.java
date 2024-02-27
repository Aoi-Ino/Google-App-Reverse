package an;

import cm.l;
import in.g;
import um.e0;
import um.x;

public final class h extends e0 {

    /* renamed from: e  reason: collision with root package name */
    private final String f19405e;

    /* renamed from: f  reason: collision with root package name */
    private final long f19406f;

    /* renamed from: g  reason: collision with root package name */
    private final g f19407g;

    public h(String str, long j10, g gVar) {
        l.f(gVar, "source");
        this.f19405e = str;
        this.f19406f = j10;
        this.f19407g = gVar;
    }

    public long contentLength() {
        return this.f19406f;
    }

    public x contentType() {
        String str = this.f19405e;
        if (str != null) {
            return x.f32156g.b(str);
        }
        return null;
    }

    public g source() {
        return this.f19407g;
    }
}
