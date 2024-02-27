package mm;

import android.os.Handler;
import android.os.Looper;
import cm.l;
import java.util.concurrent.CancellationException;
import lm.o1;
import lm.q0;
import tl.g;

public final class c extends d {
    private volatile c _immediate;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f25118g;

    /* renamed from: h  reason: collision with root package name */
    private final String f25119h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f25120i;

    /* renamed from: j  reason: collision with root package name */
    private final c f25121j;

    public c(Handler handler, String str) {
        this(handler, str, false);
    }

    private final void G0(g gVar, Runnable runnable) {
        o1.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        q0.b().A0(gVar, runnable);
    }

    public void A0(g gVar, Runnable runnable) {
        if (!this.f25118g.post(runnable)) {
            G0(gVar, runnable);
        }
    }

    public boolean C0(g gVar) {
        return !this.f25120i || !l.a(Looper.myLooper(), this.f25118g.getLooper());
    }

    /* renamed from: H0 */
    public c E0() {
        return this.f25121j;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f25118g == this.f25118g;
    }

    public int hashCode() {
        return System.identityHashCode(this.f25118g);
    }

    public String toString() {
        String F0 = F0();
        if (F0 != null) {
            return F0;
        }
        String str = this.f25119h;
        if (str == null) {
            str = this.f25118g.toString();
        }
        if (!this.f25120i) {
            return str;
        }
        return str + ".immediate";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Handler handler, String str, int i10, cm.g gVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Handler handler, String str, boolean z10) {
        super((cm.g) null);
        c cVar = null;
        this.f25118g = handler;
        this.f25119h = str;
        this.f25120i = z10;
        this._immediate = z10 ? this : cVar;
        c cVar2 = this._immediate;
        if (cVar2 == null) {
            cVar2 = new c(handler, str, true);
            this._immediate = cVar2;
        }
        this.f25121j = cVar2;
    }
}
