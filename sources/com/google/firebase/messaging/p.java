package com.google.firebase.messaging;

import android.content.Intent;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q f7557e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Intent f7558f;

    public /* synthetic */ p(q qVar, Intent intent) {
        this.f7557e = qVar;
        this.f7558f = intent;
    }

    public final void run() {
        this.f7557e.b(this.f7558f);
    }
}
