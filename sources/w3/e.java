package w3;

import android.content.Context;
import android.util.Log;
import s3.o;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f17860a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th2) {
        try {
            o.i(context);
            o.i(th2);
            return false;
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
