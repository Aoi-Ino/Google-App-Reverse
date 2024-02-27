package n5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import q5.c;
import t5.a;
import t5.g;
import t5.m;
import t5.p;
import t5.r;
import w5.e;

final class u {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final a f14178e = new a("AppUpdateService");

    /* renamed from: f  reason: collision with root package name */
    private static final Intent f14179f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a  reason: collision with root package name */
    m f14180a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f14181b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f14182c;

    /* renamed from: d  reason: collision with root package name */
    private final w f14183d;

    u(Context context, w wVar) {
        this.f14181b = context.getPackageName();
        this.f14182c = context;
        this.f14183d = wVar;
        if (r.b(context)) {
            this.f14180a = new m(p.a(context), f14178e, "AppUpdateService", f14179f, o.f14166a, (g) null);
        }
    }

    static /* bridge */ /* synthetic */ Bundle b(u uVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(i());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(uVar.f14182c.getPackageManager().getPackageInfo(uVar.f14182c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f14178e.b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    static /* bridge */ /* synthetic */ a d(u uVar, Bundle bundle, String str) {
        Bundle bundle2 = bundle;
        return a.h(str, bundle2.getInt("version.code", -1), bundle2.getInt("update.availability"), bundle2.getInt("install.status", 0), bundle2.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle2.getInt("client.version.staleness")), bundle2.getInt("in.app.update.priority", 0), bundle2.getLong("bytes.downloaded"), bundle2.getLong("total.bytes.to.download"), bundle2.getLong("additional.size.required"), uVar.f14183d.a(), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent"));
    }

    /* access modifiers changed from: private */
    public static Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putAll(c.a("app_update"));
        bundle.putInt("playcore.version.code", 11003);
        return bundle;
    }

    private static e j() {
        f14178e.b("onError(%d)", -9);
        return w5.g.b(new r5.a(-9));
    }

    public final e f(String str) {
        if (this.f14180a == null) {
            return j();
        }
        f14178e.d("completeUpdate(%s)", str);
        w5.p pVar = new w5.p();
        this.f14180a.q(new q(this, pVar, pVar, str), pVar);
        return pVar.a();
    }

    public final e g(String str) {
        if (this.f14180a == null) {
            return j();
        }
        f14178e.d("requestUpdateInfo(%s)", str);
        w5.p pVar = new w5.p();
        this.f14180a.q(new p(this, pVar, str, pVar), pVar);
        return pVar.a();
    }
}
