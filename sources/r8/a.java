package r8;

import android.content.Context;
import cm.g;
import cm.l;
import m.p;
import ni.fc;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0209a f15612a = new C0209a((g) null);

    /* renamed from: r8.a$a  reason: collision with other inner class name */
    public static final class C0209a {
        private C0209a() {
        }

        public /* synthetic */ C0209a(g gVar) {
            this();
        }

        public final void a(Context context, fc fcVar) {
            l.f(context, "context");
            l.f(fcVar, "binding");
            p g10 = p.g(context);
            l.e(g10, "from(...)");
            int a10 = g10.a(33023);
            if (!(a10 == -2 || a10 == -1)) {
                if (a10 == 0) {
                    ld.g gVar = new ld.g(context);
                    if (gVar.t() && gVar.m() != null) {
                        fcVar.f26347h.setVisibility(0);
                        return;
                    }
                } else if (!(a10 == 1 || a10 == 11 || a10 == 12 || a10 == 15)) {
                    return;
                }
            }
            fcVar.f26347h.setVisibility(8);
        }
    }
}
