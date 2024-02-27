package com.google.firebase.messaging;

import com.google.firebase.messaging.q0;
import com.google.firebase.messaging.v0;
import p4.i;

public final /* synthetic */ class v implements q0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f7581a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f7582b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v0.a f7583c;

    public /* synthetic */ v(FirebaseMessaging firebaseMessaging, String str, v0.a aVar) {
        this.f7581a = firebaseMessaging;
        this.f7582b = str;
        this.f7583c = aVar;
    }

    public final i start() {
        return this.f7581a.r(this.f7582b, this.f7583c);
    }
}
