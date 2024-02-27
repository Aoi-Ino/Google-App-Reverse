package e;

import android.content.Context;
import android.content.Intent;
import cm.l;

public abstract class a {

    /* renamed from: e.a$a  reason: collision with other inner class name */
    public static final class C0134a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f9965a;

        public C0134a(Object obj) {
            this.f9965a = obj;
        }

        public final Object a() {
            return this.f9965a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0134a b(Context context, Object obj) {
        l.f(context, "context");
        return null;
    }

    public abstract Object c(int i10, Intent intent);
}
