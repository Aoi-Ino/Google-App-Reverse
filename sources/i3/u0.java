package i3;

import android.content.Context;
import c3.b;
import nl.a;

public final class u0 implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f12323a;

    /* renamed from: b  reason: collision with root package name */
    private final a f12324b;

    /* renamed from: c  reason: collision with root package name */
    private final a f12325c;

    public u0(a aVar, a aVar2, a aVar3) {
        this.f12323a = aVar;
        this.f12324b = aVar2;
        this.f12325c = aVar3;
    }

    public static u0 a(a aVar, a aVar2, a aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 c(Context context, String str, int i10) {
        return new t0(context, str, i10);
    }

    /* renamed from: b */
    public t0 get() {
        return c((Context) this.f12323a.get(), (String) this.f12324b.get(), ((Integer) this.f12325c.get()).intValue());
    }
}
