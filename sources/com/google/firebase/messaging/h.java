package com.google.firebase.messaging;

import android.content.Intent;
import p4.j;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i f7498e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Intent f7499f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j f7500g;

    public /* synthetic */ h(i iVar, Intent intent, j jVar) {
        this.f7498e = iVar;
        this.f7499f = intent;
        this.f7500g = jVar;
    }

    public final void run() {
        this.f7498e.i(this.f7499f, this.f7500g);
    }
}
