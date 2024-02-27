package com.google.android.play.core.assetpacks;

import android.content.Intent;

public final /* synthetic */ class c2 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d2 f6636e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Intent f6637f;

    public /* synthetic */ c2(d2 d2Var, Intent intent) {
        this.f6636e = d2Var;
        this.f6637f = intent;
    }

    public final void run() {
        this.f6636e.b(this.f6637f);
    }
}
