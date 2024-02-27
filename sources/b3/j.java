package b3;

import android.content.Context;
import c3.b;
import nl.a;

public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f4427a;

    /* renamed from: b  reason: collision with root package name */
    private final a f4428b;

    /* renamed from: c  reason: collision with root package name */
    private final a f4429c;

    public j(a aVar, a aVar2, a aVar3) {
        this.f4427a = aVar;
        this.f4428b = aVar2;
        this.f4429c = aVar3;
    }

    public static j a(a aVar, a aVar2, a aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, k3.a aVar, k3.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    /* renamed from: b */
    public i get() {
        return c((Context) this.f4427a.get(), (k3.a) this.f4428b.get(), (k3.a) this.f4429c.get());
    }
}
