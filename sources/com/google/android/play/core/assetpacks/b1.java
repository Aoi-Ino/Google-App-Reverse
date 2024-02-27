package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import t5.a;
import t5.s0;

final class b1 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final a f6618a = new a("ExtractionForegroundServiceConnection");

    /* renamed from: b  reason: collision with root package name */
    private final List f6619b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final Context f6620c;

    /* renamed from: d  reason: collision with root package name */
    private ExtractionForegroundService f6621d;

    /* renamed from: e  reason: collision with root package name */
    private Notification f6622e;

    b1(Context context) {
        this.f6620c = context;
    }

    private final void d() {
        ArrayList arrayList;
        synchronized (this.f6619b) {
            arrayList = new ArrayList(this.f6619b);
            this.f6619b.clear();
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((s0) arrayList.get(i10)).p(new Bundle(), new Bundle());
            } catch (RemoteException unused) {
                this.f6618a.b("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Notification notification) {
        this.f6622e = notification;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f6618a.a("Stopping foreground installation service.", new Object[0]);
        this.f6620c.unbindService(this);
        ExtractionForegroundService extractionForegroundService = this.f6621d;
        if (extractionForegroundService != null) {
            extractionForegroundService.a();
        }
        d();
    }

    /* access modifiers changed from: package-private */
    public final void c(s0 s0Var) {
        synchronized (this.f6619b) {
            this.f6619b.add(s0Var);
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f6618a.a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((a1) iBinder).f6612b;
        this.f6621d = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.f6622e);
        d();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
