package y0;

import cm.l;
import d1.h;
import java.io.File;
import java.util.concurrent.Callable;

public final class z implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f18459a;

    /* renamed from: b  reason: collision with root package name */
    private final File f18460b;

    /* renamed from: c  reason: collision with root package name */
    private final Callable f18461c;

    /* renamed from: d  reason: collision with root package name */
    private final h.c f18462d;

    public z(String str, File file, Callable callable, h.c cVar) {
        l.f(cVar, "mDelegate");
        this.f18459a = str;
        this.f18460b = file;
        this.f18461c = callable;
        this.f18462d = cVar;
    }

    public h a(h.b bVar) {
        l.f(bVar, "configuration");
        return new y(bVar.f9672a, this.f18459a, this.f18460b, this.f18461c, bVar.f9674c.f9670a, this.f18462d.a(bVar));
    }
}
