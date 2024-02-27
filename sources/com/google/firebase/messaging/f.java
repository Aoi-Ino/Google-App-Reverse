package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.j;
import com.google.firebase.messaging.d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p4.l;
import w3.j;

class f {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f7485a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f7486b;

    /* renamed from: c  reason: collision with root package name */
    private final g0 f7487c;

    public f(Context context, g0 g0Var, ExecutorService executorService) {
        this.f7485a = executorService;
        this.f7486b = context;
        this.f7487c = g0Var;
    }

    private boolean b() {
        if (((KeyguardManager) this.f7486b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!j.e()) {
            SystemClock.sleep(10);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f7486b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid) {
                return next.importance == 100;
            }
        }
        return false;
    }

    private void c(d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f7486b.getSystemService("notification")).notify(aVar.f7478b, aVar.f7479c, aVar.f7477a.b());
    }

    private c0 d() {
        c0 g10 = c0.g(this.f7487c.p("gcm.n.image"));
        if (g10 != null) {
            g10.n(this.f7485a);
        }
        return g10;
    }

    private void e(j.e eVar, c0 c0Var) {
        if (c0Var != null) {
            try {
                Bitmap bitmap = (Bitmap) l.b(c0Var.h(), 5, TimeUnit.SECONDS);
                eVar.o(bitmap);
                eVar.x(new j.b().i(bitmap).h((Bitmap) null));
            } catch (ExecutionException e10) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                c0Var.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                c0Var.close();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        if (this.f7487c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        c0 d10 = d();
        d.a e10 = d.e(this.f7486b, this.f7487c);
        e(e10.f7477a, d10);
        c(e10);
        return true;
    }
}
