package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import t5.a;
import u5.d;

final class y extends d {

    /* renamed from: g  reason: collision with root package name */
    private final w1 f6982g;

    /* renamed from: h  reason: collision with root package name */
    private final e1 f6983h;

    /* renamed from: i  reason: collision with root package name */
    private final t5.y f6984i;

    /* renamed from: j  reason: collision with root package name */
    private final r0 f6985j;

    /* renamed from: k  reason: collision with root package name */
    private final h1 f6986k;

    /* renamed from: l  reason: collision with root package name */
    private final t5.y f6987l;

    /* renamed from: m  reason: collision with root package name */
    private final t5.y f6988m;

    /* renamed from: n  reason: collision with root package name */
    private final p2 f6989n;

    /* renamed from: o  reason: collision with root package name */
    private final Handler f6990o = new Handler(Looper.getMainLooper());

    y(Context context, w1 w1Var, e1 e1Var, t5.y yVar, h1 h1Var, r0 r0Var, t5.y yVar2, t5.y yVar3, p2 p2Var) {
        super(new a("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f6982g = w1Var;
        this.f6983h = e1Var;
        this.f6984i = yVar;
        this.f6986k = h1Var;
        this.f6985j = r0Var;
        this.f6987l = yVar2;
        this.f6988m = yVar3;
        this.f6989n = p2Var;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f16896a.b("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            AssetPackState i10 = AssetPackState.i(bundleExtra, stringArrayList.get(0), this.f6986k, this.f6989n, a0.f6611a);
            this.f16896a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", i10);
            PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
            if (pendingIntent != null) {
                this.f6985j.a(pendingIntent);
            }
            ((Executor) this.f6988m.a()).execute(new v(this, bundleExtra, i10));
            ((Executor) this.f6987l.a()).execute(new u(this, bundleExtra));
            return;
        }
        this.f16896a.b("Empty bundle received from broadcast.", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(Bundle bundle) {
        if (this.f6982g.n(bundle)) {
            this.f6983h.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i(Bundle bundle, AssetPackState assetPackState) {
        if (this.f6982g.m(bundle)) {
            j(assetPackState);
            ((u3) this.f6984i.a()).g();
        }
    }

    /* access modifiers changed from: package-private */
    public final void j(AssetPackState assetPackState) {
        this.f6990o.post(new x(this, assetPackState));
    }
}
