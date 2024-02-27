package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.j;
import java.util.concurrent.atomic.AtomicInteger;
import p3.h;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f7476a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final j.e f7477a;

        /* renamed from: b  reason: collision with root package name */
        public final String f7478b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7479c;

        a(j.e eVar, String str, int i10) {
            this.f7477a = eVar;
            this.f7478b = str;
            this.f7479c = i10;
        }
    }

    private static PendingIntent a(Context context, g0 g0Var, String str, PackageManager packageManager) {
        Intent f10 = f(str, g0Var, packageManager);
        if (f10 == null) {
            return null;
        }
        f10.addFlags(67108864);
        f10.putExtras(g0Var.y());
        if (q(g0Var)) {
            f10.putExtra("gcm.n.analytics_data", g0Var.x());
        }
        return PendingIntent.getActivity(context, g(), f10, l(1073741824));
    }

    private static PendingIntent b(Context context, Context context2, g0 g0Var) {
        if (!q(g0Var)) {
            return null;
        }
        return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(g0Var.x()));
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static a d(Context context, Context context2, g0 g0Var, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        j.e eVar = new j.e(context2, str);
        String n10 = g0Var.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(n10)) {
            eVar.k(n10);
        }
        String n11 = g0Var.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(n11)) {
            eVar.j(n11);
            eVar.x(new j.c().h(n11));
        }
        eVar.v(m(packageManager, resources, packageName, g0Var.p("gcm.n.icon"), bundle));
        Uri n12 = n(packageName, g0Var, resources);
        if (n12 != null) {
            eVar.w(n12);
        }
        eVar.i(a(context, g0Var, packageName, packageManager));
        PendingIntent b10 = b(context, context2, g0Var);
        if (b10 != null) {
            eVar.m(b10);
        }
        Integer h10 = h(context2, g0Var.p("gcm.n.color"), bundle);
        if (h10 != null) {
            eVar.g(h10.intValue());
        }
        eVar.e(!g0Var.a("gcm.n.sticky"));
        eVar.q(g0Var.a("gcm.n.local_only"));
        String p10 = g0Var.p("gcm.n.ticker");
        if (p10 != null) {
            eVar.y(p10);
        }
        Integer m10 = g0Var.m();
        if (m10 != null) {
            eVar.t(m10.intValue());
        }
        Integer r10 = g0Var.r();
        if (r10 != null) {
            eVar.A(r10.intValue());
        }
        Integer l10 = g0Var.l();
        if (l10 != null) {
            eVar.r(l10.intValue());
        }
        Long j10 = g0Var.j("gcm.n.event_time");
        if (j10 != null) {
            eVar.u(true);
            eVar.B(j10.longValue());
        }
        long[] q10 = g0Var.q();
        if (q10 != null) {
            eVar.z(q10);
        }
        int[] e10 = g0Var.e();
        if (e10 != null) {
            eVar.p(e10[0], e10[1], e10[2]);
        }
        eVar.l(i(g0Var));
        return new a(eVar, o(g0Var), 0);
    }

    static a e(Context context, g0 g0Var) {
        Bundle j10 = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, g0Var, k(context, g0Var.k(), j10), j10);
    }

    private static Intent f(String str, g0 g0Var, PackageManager packageManager) {
        String p10 = g0Var.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p10)) {
            Intent intent = new Intent(p10);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f10 = g0Var.f();
        if (f10 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f10);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int g() {
        return f7476a.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(androidx.core.content.a.c(context, i10));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    private static int i(g0 g0Var) {
        boolean a10 = g0Var.a("gcm.n.default_sound");
        if (g0Var.a("gcm.n.default_vibrate_timings")) {
            a10 |= true;
        }
        return g0Var.a("gcm.n.default_light_settings") ? a10 | true ? 1 : 0 : a10 ? 1 : 0;
    }

    private static Bundle j(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        return Bundle.EMPTY;
    }

    public static String k(Context context, String str, Bundle bundle) {
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string)) {
                str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
            } else if (notificationManager.getNotificationChannel(string) != null) {
                return string;
            } else {
                str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
            }
            Log.w("FirebaseMessaging", str2);
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    str3 = "Misc";
                } else {
                    str3 = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(h.a("fcm_fallback_notification_channel", str3, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int l(int i10) {
        return i10 | 67108864;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !p(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
            }
        }
        if (i10 == 0 || !p(resources, i10)) {
            return 17301651;
        }
        return i10;
    }

    private static Uri n(String str, g0 g0Var, Resources resources) {
        String o10 = g0Var.o();
        if (TextUtils.isEmpty(o10)) {
            return null;
        }
        if ("default".equals(o10) || resources.getIdentifier(o10, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + o10);
    }

    private static String o(g0 g0Var) {
        String p10 = g0Var.p("gcm.n.tag");
        if (!TextUtils.isEmpty(p10)) {
            return p10;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    private static boolean p(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!c.a(resources.getDrawable(i10, (Resources.Theme) null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean q(g0 g0Var) {
        return g0Var.a("google.c.a.e");
    }
}
