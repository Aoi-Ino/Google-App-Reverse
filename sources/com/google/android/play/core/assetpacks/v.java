package com.google.android.play.core.assetpacks;

import android.os.Bundle;

public final /* synthetic */ class v implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ y f6916e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Bundle f6917f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ AssetPackState f6918g;

    public /* synthetic */ v(y yVar, Bundle bundle, AssetPackState assetPackState) {
        this.f6916e = yVar;
        this.f6917f = bundle;
        this.f6918g = assetPackState;
    }

    public final void run() {
        this.f6916e.i(this.f6917f, this.f6918g);
    }
}
