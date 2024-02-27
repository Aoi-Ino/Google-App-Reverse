package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.c;
import p3.c;
import p4.j;
import q3.a;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private final c f5283a;

    /* renamed from: b  reason: collision with root package name */
    private final c[] f5284b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5285c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5286d;

    protected e(c cVar, c[] cVarArr, boolean z10, int i10) {
        this.f5283a = cVar;
        this.f5284b = cVarArr;
        this.f5285c = z10;
        this.f5286d = i10;
    }

    public void a() {
        this.f5283a.a();
    }

    public c.a b() {
        return this.f5283a.b();
    }

    public p3.c[] c() {
        return this.f5284b;
    }

    /* access modifiers changed from: protected */
    public abstract void d(a.b bVar, j jVar);

    public final int e() {
        return this.f5286d;
    }

    public final boolean f() {
        return this.f5285c;
    }
}
