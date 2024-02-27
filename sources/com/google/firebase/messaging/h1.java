package com.google.firebase.messaging;

import java.util.concurrent.ScheduledFuture;
import p4.d;
import p4.i;

public final /* synthetic */ class h1 implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScheduledFuture f7502a;

    public /* synthetic */ h1(ScheduledFuture scheduledFuture) {
        this.f7502a = scheduledFuture;
    }

    public final void a(i iVar) {
        this.f7502a.cancel(false);
    }
}
