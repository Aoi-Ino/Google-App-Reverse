package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private static long f2426a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f2427b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f2428c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f2429d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f2430e;

    static class a {
        static void a(String str) {
            Trace.beginSection(str);
        }

        static void b() {
            Trace.endSection();
        }
    }

    static {
        Class<String> cls = String.class;
        Class<Trace> cls2 = Trace.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f2426a = cls2.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls3 = Long.TYPE;
                f2427b = cls2.getMethod("isTagEnabled", new Class[]{cls3});
                Class cls4 = Integer.TYPE;
                f2428c = cls2.getMethod("asyncTraceBegin", new Class[]{cls3, cls, cls4});
                f2429d = cls2.getMethod("asyncTraceEnd", new Class[]{cls3, cls, cls4});
                f2430e = cls2.getMethod("traceCounter", new Class[]{cls3, cls, cls4});
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        a.a(str);
    }

    public static void b() {
        a.b();
    }
}
