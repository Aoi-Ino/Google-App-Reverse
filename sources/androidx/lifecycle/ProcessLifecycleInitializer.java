package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.e0;
import cm.l;
import g1.a;
import java.util.List;

public final class ProcessLifecycleInitializer implements a {
    public List a() {
        return q.i();
    }

    /* renamed from: c */
    public s b(Context context) {
        l.f(context, "context");
        androidx.startup.a e10 = androidx.startup.a.e(context);
        l.e(e10, "getInstance(context)");
        if (e10.g(ProcessLifecycleInitializer.class)) {
            n.a(context);
            e0.b bVar = e0.f3266m;
            bVar.b(context);
            return bVar.a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
