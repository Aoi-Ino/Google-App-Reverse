package mm;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import cm.g;
import cm.l;
import pl.p;
import pl.q;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final d f25122a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        d dVar = null;
        try {
            p.a aVar = p.f30426e;
            obj = p.a(new c(a(Looper.getMainLooper(), true), (String) null, 2, (g) null));
        } catch (Throwable th2) {
            p.a aVar2 = p.f30426e;
            obj = p.a(q.a(th2));
        }
        if (!p.c(obj)) {
            dVar = obj;
        }
        f25122a = dVar;
    }

    public static final Handler a(Looper looper, boolean z10) {
        Object newInstance;
        if (!z10) {
            return new Handler(looper);
        }
        Class<Looper> cls = Looper.class;
        Class cls2 = Handler.class;
        if (Build.VERSION.SDK_INT >= 28) {
            newInstance = cls2.getDeclaredMethod("createAsync", new Class[]{cls}).invoke((Object) null, new Object[]{looper});
            l.d(newInstance, "null cannot be cast to non-null type android.os.Handler");
        } else {
            try {
                newInstance = cls2.getDeclaredConstructor(new Class[]{cls, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) newInstance;
    }
}
