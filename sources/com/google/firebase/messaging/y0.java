package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

final class y0 {

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference f7602d;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f7603a;

    /* renamed from: b  reason: collision with root package name */
    private u0 f7604b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f7605c;

    private y0(SharedPreferences sharedPreferences, Executor executor) {
        this.f7605c = executor;
        this.f7603a = sharedPreferences;
    }

    public static synchronized y0 a(Context context, Executor executor) {
        y0 y0Var;
        synchronized (y0.class) {
            try {
                WeakReference weakReference = f7602d;
                y0Var = weakReference != null ? (y0) weakReference.get() : null;
                if (y0Var == null) {
                    y0Var = new y0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    y0Var.c();
                    f7602d = new WeakReference(y0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y0Var;
    }

    private synchronized void c() {
        this.f7604b = u0.c(this.f7603a, "topic_operation_queue", ",", this.f7605c);
    }

    /* access modifiers changed from: package-private */
    public synchronized x0 b() {
        return x0.a(this.f7604b.e());
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean d(x0 x0Var) {
        return this.f7604b.f(x0Var.e());
    }
}
