package c;

import android.content.Context;
import cm.l;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Set f4551a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f4552b;

    public final void a(b bVar) {
        l.f(bVar, "listener");
        Context context = this.f4552b;
        if (context != null) {
            bVar.a(context);
        }
        this.f4551a.add(bVar);
    }

    public final void b() {
        this.f4552b = null;
    }

    public final void c(Context context) {
        l.f(context, "context");
        this.f4552b = context;
        for (b a10 : this.f4551a) {
            a10.a(context);
        }
    }
}
