package p3;

import android.content.Context;
import android.util.Log;

abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    static final z f14632a = new t(x.d("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));

    /* renamed from: b  reason: collision with root package name */
    static final z f14633b = new u(x.d("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));

    /* renamed from: c  reason: collision with root package name */
    static final z f14634c = new v(x.d("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: d  reason: collision with root package name */
    static final z f14635d = new w(x.d("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: e  reason: collision with root package name */
    private static final Object f14636e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private static Context f14637f;

    static synchronized void a(Context context) {
        synchronized (b0.class) {
            if (f14637f != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f14637f = context.getApplicationContext();
            }
        }
    }
}
