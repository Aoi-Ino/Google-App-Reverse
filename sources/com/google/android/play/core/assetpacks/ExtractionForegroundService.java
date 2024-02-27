package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class ExtractionForegroundService extends Service {

    /* renamed from: e  reason: collision with root package name */
    private final IBinder f6609e = new a1(this);

    public final synchronized void a() {
        stopForeground(true);
        stopSelf();
    }

    public final IBinder onBind(Intent intent) {
        return this.f6609e;
    }
}
