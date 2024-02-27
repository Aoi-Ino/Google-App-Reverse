package d7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import v6.c;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9779a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f9780b;

    /* renamed from: c  reason: collision with root package name */
    private final c f9781c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9782d = c();

    public a(Context context, String str, c cVar) {
        Context a10 = a(context);
        this.f9779a = a10;
        this.f9780b = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f9781c = cVar;
    }

    private static Context a(Context context) {
        return androidx.core.content.a.b(context);
    }

    private boolean c() {
        return this.f9780b.contains("firebase_data_collection_default_enabled") ? this.f9780b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f9779a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f9779a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f9782d;
    }
}
