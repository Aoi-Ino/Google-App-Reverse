package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

class b1 implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    private static final Object f7462j = new Object();

    /* renamed from: k  reason: collision with root package name */
    private static Boolean f7463k;

    /* renamed from: l  reason: collision with root package name */
    private static Boolean f7464l;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Context f7465e;

    /* renamed from: f  reason: collision with root package name */
    private final f0 f7466f;

    /* renamed from: g  reason: collision with root package name */
    private final PowerManager.WakeLock f7467g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final a1 f7468h;

    /* renamed from: i  reason: collision with root package name */
    private final long f7469i;

    class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private b1 f7470a;

        public a(b1 b1Var) {
            this.f7470a = b1Var;
        }

        public void a() {
            if (b1.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            b1.this.f7465e.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            try {
                b1 b1Var = this.f7470a;
                if (b1Var != null) {
                    if (b1Var.i()) {
                        if (b1.j()) {
                            Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                        }
                        this.f7470a.f7468h.l(this.f7470a, 0);
                        context.unregisterReceiver(this);
                        this.f7470a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    b1(a1 a1Var, Context context, f0 f0Var, long j10) {
        this.f7468h = a1Var;
        this.f7465e = context;
        this.f7469i = j10;
        this.f7466f = f0Var;
        this.f7467g = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        synchronized (f7462j) {
            try {
                Boolean bool = f7464l;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f7464l = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z10;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        synchronized (f7462j) {
            try {
                Boolean bool = f7463k;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f7463k = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }

    /* access modifiers changed from: private */
    public synchronized boolean i() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f7465e.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th2) {
            throw th2;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f7465e)) {
            this.f7467g.acquire(e.f7483a);
        }
        try {
            this.f7468h.m(true);
            if (!this.f7466f.g()) {
                this.f7468h.m(false);
                if (h(this.f7465e)) {
                    try {
                        this.f7467g.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!f(this.f7465e) || i()) {
                if (this.f7468h.p()) {
                    this.f7468h.m(false);
                } else {
                    this.f7468h.q(this.f7469i);
                }
                if (h(this.f7465e)) {
                    try {
                        wakeLock = this.f7467g;
                        wakeLock.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                new a(this).a();
                if (h(this.f7465e)) {
                    try {
                        this.f7467g.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e10) {
            Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
            this.f7468h.m(false);
            if (h(this.f7465e)) {
                wakeLock = this.f7467g;
            }
        } catch (Throwable th2) {
            if (h(this.f7465e)) {
                try {
                    this.f7467g.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th2;
        }
    }
}
