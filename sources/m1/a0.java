package m1;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;

public abstract class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f13657a = m.i("WorkerFactory");

    class a extends a0 {
        a() {
        }

        public c a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static a0 c() {
        return new a();
    }

    public abstract c a(Context context, String str, WorkerParameters workerParameters);

    public final c b(Context context, String str, WorkerParameters workerParameters) {
        Class<? extends U> cls;
        c a10 = a(context, str, workerParameters);
        if (a10 == null) {
            try {
                cls = Class.forName(str).asSubclass(c.class);
            } catch (Throwable th2) {
                m e10 = m.e();
                String str2 = f13657a;
                e10.d(str2, "Invalid class: " + str, th2);
                cls = null;
            }
            if (cls != null) {
                try {
                    a10 = (c) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable th3) {
                    m e11 = m.e();
                    String str3 = f13657a;
                    e11.d(str3, "Could not instantiate " + str, th3);
                }
            }
        }
        if (a10 == null || !a10.k()) {
            return a10;
        }
        String name = getClass().getName();
        throw new IllegalStateException("WorkerFactory (" + name + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
