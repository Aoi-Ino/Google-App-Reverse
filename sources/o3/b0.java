package o3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import w3.j;
import y3.d;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f14367a;

    /* renamed from: b  reason: collision with root package name */
    private int f14368b;

    /* renamed from: c  reason: collision with root package name */
    private int f14369c = 0;

    public b0(Context context) {
        this.f14367a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfo;
        if (this.f14368b == 0) {
            try {
                packageInfo = d.a(this.f14367a).d("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f14368b = packageInfo.versionCode;
            }
        }
        return this.f14368b;
    }

    public final synchronized int b() {
        int i10 = this.f14369c;
        if (i10 != 0) {
            return i10;
        }
        Context context = this.f14367a;
        PackageManager packageManager = context.getPackageManager();
        if (d.a(context).a("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!j.g()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f14369c = i11;
                return i11;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (true == j.g()) {
                i11 = 2;
            }
            this.f14369c = i11;
            return i11;
        }
        i11 = 2;
        this.f14369c = i11;
        return i11;
    }
}
