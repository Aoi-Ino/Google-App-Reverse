package u5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import t5.a;
import t5.p;
import t5.s;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    protected final a f16896a;

    /* renamed from: b  reason: collision with root package name */
    private final IntentFilter f16897b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f16898c;

    /* renamed from: d  reason: collision with root package name */
    protected final Set f16899d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private c f16900e = null;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f16901f = false;

    protected d(a aVar, IntentFilter intentFilter, Context context) {
        this.f16896a = aVar;
        this.f16897b = intentFilter;
        this.f16898c = p.a(context);
    }

    private final void b() {
        c cVar;
        if ((this.f16901f || !this.f16899d.isEmpty()) && this.f16900e == null) {
            c cVar2 = new c(this, (b) null);
            this.f16900e = cVar2;
            this.f16898c.registerReceiver(cVar2, this.f16897b);
        }
        if (!this.f16901f && this.f16899d.isEmpty() && (cVar = this.f16900e) != null) {
            this.f16898c.unregisterReceiver(cVar);
            this.f16900e = null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(Context context, Intent intent);

    public final synchronized void c(a aVar) {
        this.f16896a.d("registerListener", new Object[0]);
        s.a(aVar, "Registered Play Core listener should not be null.");
        this.f16899d.add(aVar);
        b();
    }

    public final synchronized void d(boolean z10) {
        this.f16901f = z10;
        b();
    }

    public final synchronized void e(a aVar) {
        this.f16896a.d("unregisterListener", new Object[0]);
        s.a(aVar, "Unregistered Play Core listener should not be null.");
        this.f16899d.remove(aVar);
        b();
    }

    public final synchronized void f(Object obj) {
        Iterator it = new HashSet(this.f16899d).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(obj);
        }
    }

    public final synchronized boolean g() {
        return this.f16900e != null;
    }
}
