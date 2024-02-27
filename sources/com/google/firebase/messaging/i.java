package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.profileinstaller.g;
import com.google.firebase.messaging.f1;
import java.util.concurrent.ExecutorService;
import p4.j;
import p4.l;

public abstract class i extends Service {

    /* renamed from: e  reason: collision with root package name */
    final ExecutorService f7503e = o.d();

    /* renamed from: f  reason: collision with root package name */
    private Binder f7504f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f7505g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private int f7506h;

    /* renamed from: i  reason: collision with root package name */
    private int f7507i = 0;

    class a implements f1.a {
        a() {
        }

        public p4.i a(Intent intent) {
            return i.this.j(intent);
        }
    }

    private void d(Intent intent) {
        if (intent != null) {
            d1.c(intent);
        }
        synchronized (this.f7505g) {
            try {
                int i10 = this.f7507i - 1;
                this.f7507i = i10;
                if (i10 == 0) {
                    k(this.f7506h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(Intent intent, p4.i iVar) {
        d(intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(Intent intent, j jVar) {
        try {
            f(intent);
        } finally {
            jVar.c((Object) null);
        }
    }

    /* access modifiers changed from: private */
    public p4.i j(Intent intent) {
        if (g(intent)) {
            return l.e((Object) null);
        }
        j jVar = new j();
        this.f7503e.execute(new h(this, intent, jVar));
        return jVar.a();
    }

    /* access modifiers changed from: protected */
    public abstract Intent e(Intent intent);

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean k(int i10) {
        return stopSelfResult(i10);
    }

    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f7504f == null) {
                this.f7504f = new f1(new a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f7504f;
    }

    public void onDestroy() {
        this.f7503e.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.f7505g) {
            this.f7506h = i11;
            this.f7507i++;
        }
        Intent e10 = e(intent);
        if (e10 == null) {
            d(intent);
            return 2;
        }
        p4.i j10 = j(e10);
        if (j10.l()) {
            d(intent);
            return 2;
        }
        j10.b(new g(), new g(this, intent));
        return 3;
    }
}
