package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import t5.b;
import t5.n0;
import w5.p;

final class i extends b {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f6737f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ String f6738g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ String f6739h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f6740i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ p f6741j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ s f6742k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    i(s sVar, p pVar, int i10, String str, String str2, int i11, p pVar2) {
        super(pVar);
        this.f6742k = sVar;
        this.f6737f = i10;
        this.f6738g = str;
        this.f6739h = str2;
        this.f6740i = i11;
        this.f6741j = pVar2;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ((n0) this.f6742k.f6874d.e()).n(this.f6742k.f6871a, s.e(this.f6737f, this.f6738g, this.f6739h, this.f6740i), s.a(), new m(this.f6742k, this.f6741j));
        } catch (RemoteException e10) {
            s.f6869g.b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f6738g, this.f6739h, Integer.valueOf(this.f6740i), Integer.valueOf(this.f6737f));
            this.f6741j.d(new RuntimeException(e10));
        }
    }
}
