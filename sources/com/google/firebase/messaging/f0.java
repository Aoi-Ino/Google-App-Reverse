package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import h6.e;
import java.util.List;
import w3.j;

class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7488a;

    /* renamed from: b  reason: collision with root package name */
    private String f7489b;

    /* renamed from: c  reason: collision with root package name */
    private String f7490c;

    /* renamed from: d  reason: collision with root package name */
    private int f7491d;

    /* renamed from: e  reason: collision with root package name */
    private int f7492e = 0;

    f0(Context context) {
        this.f7488a = context;
    }

    static String c(e eVar) {
        String d10 = eVar.m().d();
        if (d10 != null) {
            return d10;
        }
        String c10 = eVar.m().c();
        if (!c10.startsWith("1:")) {
            return c10;
        }
        String[] split = c10.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f7488a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f10 = f(this.f7488a.getPackageName());
        if (f10 != null) {
            this.f7489b = Integer.toString(f10.versionCode);
            this.f7490c = f10.versionName;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized String a() {
        try {
            if (this.f7489b == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f7489b;
    }

    /* access modifiers changed from: package-private */
    public synchronized String b() {
        try {
            if (this.f7490c == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f7490c;
    }

    /* access modifiers changed from: package-private */
    public synchronized int d() {
        PackageInfo f10;
        try {
            if (this.f7491d == 0 && (f10 = f("com.google.android.gms")) != null) {
                this.f7491d = f10.versionCode;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f7491d;
    }

    /* access modifiers changed from: package-private */
    public synchronized int e() {
        int i10 = this.f7492e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f7488a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!j.g()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f7492e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
            if (j.g()) {
                this.f7492e = 2;
            } else {
                this.f7492e = 1;
            }
            return this.f7492e;
        }
        this.f7492e = 2;
        return 2;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return e() != 0;
    }
}
