package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import t5.a0;
import t5.c0;

public final class e2 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final c0 f6673a;

    /* renamed from: b  reason: collision with root package name */
    private final c0 f6674b;

    /* renamed from: c  reason: collision with root package name */
    private final c0 f6675c;

    /* renamed from: d  reason: collision with root package name */
    private final c0 f6676d;

    /* renamed from: e  reason: collision with root package name */
    private final c0 f6677e;

    /* renamed from: f  reason: collision with root package name */
    private final c0 f6678f;

    /* renamed from: g  reason: collision with root package name */
    private final c0 f6679g;

    public e2(c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4, c0 c0Var5, c0 c0Var6, c0 c0Var7) {
        this.f6673a = c0Var;
        this.f6674b = c0Var2;
        this.f6675c = c0Var3;
        this.f6676d = c0Var4;
        this.f6677e = c0Var5;
        this.f6678f = c0Var6;
        this.f6679g = c0Var7;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        String str = (String) this.f6673a.a();
        Object a10 = this.f6674b.a();
        Object a11 = this.f6675c.a();
        Context b10 = ((r3) this.f6676d).b();
        Object a12 = this.f6677e.a();
        return new d2(str != null ? new File(b10.getExternalFilesDir((String) null), str) : b10.getExternalFilesDir((String) null), (y) a10, (h1) a11, b10, (r2) a12, a0.b(this.f6678f), (p2) this.f6679g.a());
    }
}
