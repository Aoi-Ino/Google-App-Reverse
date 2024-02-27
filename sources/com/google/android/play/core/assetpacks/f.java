package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import t5.b;
import t5.n0;
import w5.p;

final class f extends b {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f6684f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ String f6685g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ String f6686h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f6687i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ p f6688j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ s f6689k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    f(s sVar, p pVar, int i10, String str, String str2, int i11, p pVar2) {
        super(pVar);
        this.f6689k = sVar;
        this.f6684f = i10;
        this.f6685g = str;
        this.f6686h = str2;
        this.f6687i = i11;
        this.f6688j = pVar2;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ((n0) this.f6689k.f6874d.e()).F(this.f6689k.f6871a, s.e(this.f6684f, this.f6685g, this.f6686h, this.f6687i), s.a(), new p(this.f6689k, this.f6688j));
        } catch (RemoteException e10) {
            s.f6869g.c(e10, "notifyChunkTransferred", new Object[0]);
        }
    }
}
