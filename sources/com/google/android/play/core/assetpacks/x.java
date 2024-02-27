package com.google.android.play.core.assetpacks;

public final /* synthetic */ class x implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ y f6964e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AssetPackState f6965f;

    public /* synthetic */ x(y yVar, AssetPackState assetPackState) {
        this.f6964e = yVar;
        this.f6965f = assetPackState;
    }

    public final void run() {
        this.f6964e.f(this.f6965f);
    }
}
