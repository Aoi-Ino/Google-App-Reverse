package com.google.firebase.messaging;

import android.content.Context;
import p4.j;

public final /* synthetic */ class k0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Context f7522e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f7523f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j f7524g;

    public /* synthetic */ k0(Context context, boolean z10, j jVar) {
        this.f7522e = context;
        this.f7523f = z10;
        this.f7524g = jVar;
    }

    public final void run() {
        l0.d(this.f7522e, this.f7523f, this.f7524g);
    }
}
