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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import x3.b;

class w0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final long f7592e;

    /* renamed from: f  reason: collision with root package name */
    private final PowerManager.WakeLock f7593f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final FirebaseMessaging f7594g;

    /* renamed from: h  reason: collision with root package name */
    ExecutorService f7595h = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("firebase-iid-executor"));

    static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private w0 f7596a;

        public a(w0 w0Var) {
            this.f7596a = w0Var;
        }

        public void a() {
            if (w0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f7596a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            w0 w0Var = this.f7596a;
            if (w0Var != null && w0Var.d()) {
                if (w0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f7596a.f7594g.i(this.f7596a, 0);
                this.f7596a.b().unregisterReceiver(this);
                this.f7596a = null;
            }
        }
    }

    public w0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f7594g = firebaseMessaging;
        this.f7592e = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f7593f = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* access modifiers changed from: package-private */
    public Context b() {
        return this.f7594g.j();
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        String str;
        try {
            if (this.f7594g.h() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            } else {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
        } catch (IOException e10) {
            if (a0.g(e10.getMessage())) {
                str = "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval";
            } else if (e10.getMessage() == null) {
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            } else {
                throw e10;
            }
            Log.w("FirebaseMessaging", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseMessaging", str);
            return false;
        }
    }

    public void run() {
        if (s0.b().e(b())) {
            this.f7593f.acquire();
        }
        try {
            this.f7594g.w(true);
            if (!this.f7594g.q()) {
                this.f7594g.w(false);
                if (s0.b().e(b())) {
                    this.f7593f.release();
                }
            } else if (!s0.b().d(b()) || d()) {
                if (e()) {
                    this.f7594g.w(false);
                } else {
                    this.f7594g.z(this.f7592e);
                }
                if (!s0.b().e(b())) {
                    return;
                }
                this.f7593f.release();
            } else {
                new a(this).a();
                if (s0.b().e(b())) {
                    this.f7593f.release();
                }
            }
        } catch (IOException e10) {
            Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
            this.f7594g.w(false);
            if (!s0.b().e(b())) {
            }
        } catch (Throwable th2) {
            if (s0.b().e(b())) {
                this.f7593f.release();
            }
            throw th2;
        }
    }
}
