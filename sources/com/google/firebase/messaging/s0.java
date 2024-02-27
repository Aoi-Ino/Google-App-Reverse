package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

public class s0 {

    /* renamed from: e  reason: collision with root package name */
    private static s0 f7567e;

    /* renamed from: a  reason: collision with root package name */
    private String f7568a = null;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f7569b = null;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f7570c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Queue f7571d = new ArrayDeque();

    private s0() {
    }

    private int a(Context context, Intent intent) {
        ComponentName componentName;
        String f10 = f(context, intent);
        if (f10 != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + f10);
            }
            intent.setClassName(context.getPackageName(), f10);
        }
        try {
            if (e(context)) {
                componentName = d1.h(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
            return 401;
        } catch (IllegalStateException e11) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e11);
            return 402;
        }
    }

    static synchronized s0 b() {
        s0 s0Var;
        synchronized (s0.class) {
            try {
                if (f7567e == null) {
                    f7567e = new s0();
                }
                s0Var = f7567e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s0Var;
    }

    private synchronized String f(Context context, Intent intent) {
        String str;
        try {
            String str2 = this.f7568a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null) {
                ServiceInfo serviceInfo = resolveService.serviceInfo;
                if (serviceInfo != null) {
                    if (context.getPackageName().equals(serviceInfo.packageName)) {
                        String str3 = serviceInfo.name;
                        if (str3 != null) {
                            if (str3.startsWith(".")) {
                                str = context.getPackageName() + serviceInfo.name;
                            } else {
                                str = serviceInfo.name;
                            }
                            this.f7568a = str;
                            return this.f7568a;
                        }
                    }
                    Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                    return null;
                }
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public Intent c() {
        return (Intent) this.f7571d.poll();
    }

    /* access modifiers changed from: package-private */
    public boolean d(Context context) {
        if (this.f7570c == null) {
            this.f7570c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f7569b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f7570c.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean e(Context context) {
        if (this.f7569b == null) {
            this.f7569b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f7569b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f7569b.booleanValue();
    }

    public int g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f7571d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
