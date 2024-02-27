package i3;

import android.content.Context;
import c3.b;
import c3.d;
import nl.a;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f12275a;

    public h(a aVar) {
        this.f12275a = aVar;
    }

    public static h a(a aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public String get() {
        return c((Context) this.f12275a.get());
    }
}
