package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import t5.b0;
import t5.c0;
import t5.o;

public final class p3 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final c0 f6845a;

    /* renamed from: b  reason: collision with root package name */
    private final c0 f6846b;

    public p3(c0 c0Var, c0 c0Var2) {
        this.f6845a = c0Var;
        this.f6846b = c0Var2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Object a10 = this.f6845a.a();
        Context b10 = ((r3) this.f6846b).b();
        l3 l3Var = (l3) a10;
        o.a(b10.getPackageManager(), new ComponentName(b10.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        o.a(b10.getPackageManager(), new ComponentName(b10.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
        b0.a(l3Var);
        return l3Var;
    }
}
