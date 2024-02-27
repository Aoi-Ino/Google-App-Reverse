package g3;

import android.content.Context;
import c3.b;
import h3.f;
import h3.x;
import i3.d;
import nl.a;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f11624a;

    /* renamed from: b  reason: collision with root package name */
    private final a f11625b;

    /* renamed from: c  reason: collision with root package name */
    private final a f11626c;

    /* renamed from: d  reason: collision with root package name */
    private final a f11627d;

    public i(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f11624a = aVar;
        this.f11625b = aVar2;
        this.f11626c = aVar3;
        this.f11627d = aVar4;
    }

    public static i a(a aVar, a aVar2, a aVar3, a aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, d dVar, f fVar, k3.a aVar) {
        return (x) c3.d.c(h.a(context, dVar, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public x get() {
        return c((Context) this.f11624a.get(), (d) this.f11625b.get(), (f) this.f11626c.get(), (k3.a) this.f11627d.get());
    }
}
