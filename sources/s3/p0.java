package s3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import y3.d;

public abstract class p0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f16021a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f16022b;

    /* renamed from: c  reason: collision with root package name */
    private static String f16023c;

    /* renamed from: d  reason: collision with root package name */
    private static int f16024d;

    public static int a(Context context) {
        b(context);
        return f16024d;
    }

    private static void b(Context context) {
        synchronized (f16021a) {
            try {
                if (!f16022b) {
                    f16022b = true;
                    Bundle bundle = d.a(context).b(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f16023c = bundle.getString("com.google.app.id");
                        f16024d = bundle.getInt("com.google.android.gms.version");
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("MetadataValueReader", "This should never happen.", e10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
