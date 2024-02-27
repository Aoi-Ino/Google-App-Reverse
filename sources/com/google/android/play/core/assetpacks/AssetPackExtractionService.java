package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AssetPackExtractionService extends Service {

    /* renamed from: e  reason: collision with root package name */
    w f6608e;

    public final IBinder onBind(Intent intent) {
        return this.f6608e;
    }

    public final void onCreate() {
        super.onCreate();
        r1.a(getApplicationContext()).a(this);
    }
}
