package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f7517a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f7518b;

    public /* synthetic */ j(Context context, Intent intent) {
        this.f7517a = context;
        this.f7518b = intent;
    }

    public final Object call() {
        return Integer.valueOf(s0.b().g(this.f7517a, this.f7518b));
    }
}
