package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import cm.l;
import java.util.concurrent.atomic.AtomicBoolean;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f3317a = new n();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f3318b = new AtomicBoolean(false);

    public static final class a extends g {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            l.f(activity, "activity");
            g0.f3283f.c(activity);
        }
    }

    private n() {
    }

    public static final void a(Context context) {
        l.f(context, "context");
        if (!f3318b.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            l.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
        }
    }
}
