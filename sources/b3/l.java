package b3;

import android.content.Context;
import c3.b;
import nl.a;

public final class l implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f4435a;

    /* renamed from: b  reason: collision with root package name */
    private final a f4436b;

    public l(a aVar, a aVar2) {
        this.f4435a = aVar;
        this.f4436b = aVar2;
    }

    public static l a(a aVar, a aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    /* renamed from: b */
    public k get() {
        return c((Context) this.f4435a.get(), this.f4436b.get());
    }
}
