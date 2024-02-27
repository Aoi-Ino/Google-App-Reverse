package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

public final /* synthetic */ class z0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f7607a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorService f7608b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f7609c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f0 f7610d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a0 f7611e;

    public /* synthetic */ z0(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, f0 f0Var, a0 a0Var) {
        this.f7607a = context;
        this.f7608b = scheduledExecutorService;
        this.f7609c = firebaseMessaging;
        this.f7610d = f0Var;
        this.f7611e = a0Var;
    }

    public final Object call() {
        return a1.i(this.f7607a, this.f7608b, this.f7609c, this.f7610d, this.f7611e);
    }
}
