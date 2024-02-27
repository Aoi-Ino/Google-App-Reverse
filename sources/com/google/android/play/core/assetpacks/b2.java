package com.google.android.play.core.assetpacks;

public final /* synthetic */ class b2 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d2 f6623e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f6624f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f6625g;

    public /* synthetic */ b2(d2 d2Var, int i10, String str) {
        this.f6623e = d2Var;
        this.f6624f = i10;
        this.f6625g = str;
    }

    public final void run() {
        this.f6623e.c(this.f6624f, this.f6625g);
    }
}
