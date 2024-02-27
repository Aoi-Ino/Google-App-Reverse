package o3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b f14392e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Intent f14393f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Context f14394g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f14395h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f14396i;

    public /* synthetic */ l(b bVar, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f14392e = bVar;
        this.f14393f = intent;
        this.f14394g = context;
        this.f14395h = z10;
        this.f14396i = pendingResult;
    }

    public final void run() {
        this.f14392e.d(this.f14393f, this.f14394g, this.f14395h, this.f14396i);
    }
}
