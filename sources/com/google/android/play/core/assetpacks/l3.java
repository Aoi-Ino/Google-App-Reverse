package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import q5.d;
import t5.a;
import t5.y;
import w5.e;

final class l3 {

    /* renamed from: l  reason: collision with root package name */
    private static final a f6781l = new a("AssetPackManager");

    /* renamed from: a  reason: collision with root package name */
    private final e0 f6782a;

    /* renamed from: b  reason: collision with root package name */
    private final y f6783b;

    /* renamed from: c  reason: collision with root package name */
    private final y f6784c;

    /* renamed from: d  reason: collision with root package name */
    private final v5.a f6785d;

    /* renamed from: e  reason: collision with root package name */
    private final w1 f6786e;

    /* renamed from: f  reason: collision with root package name */
    private final h1 f6787f;

    /* renamed from: g  reason: collision with root package name */
    private final r0 f6788g;

    /* renamed from: h  reason: collision with root package name */
    private final y f6789h;

    /* renamed from: i  reason: collision with root package name */
    private final d f6790i;

    /* renamed from: j  reason: collision with root package name */
    private final p2 f6791j;

    /* renamed from: k  reason: collision with root package name */
    private final Handler f6792k = new Handler(Looper.getMainLooper());

    l3(e0 e0Var, y yVar, y yVar2, v5.a aVar, w1 w1Var, h1 h1Var, r0 r0Var, y yVar3, d dVar, p2 p2Var) {
        this.f6782a = e0Var;
        this.f6783b = yVar;
        this.f6784c = yVar2;
        this.f6785d = aVar;
        this.f6786e = w1Var;
        this.f6787f = h1Var;
        this.f6788g = r0Var;
        this.f6789h = yVar3;
        this.f6790i = dVar;
        this.f6791j = p2Var;
    }

    private final void d() {
        ((Executor) this.f6789h.a()).execute(new k3(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        e k10 = ((u3) this.f6783b.a()).k(this.f6782a.G());
        e0 e0Var = this.f6782a;
        e0Var.getClass();
        k10.c((Executor) this.f6789h.a(), new j3(e0Var));
        k10.b((Executor) this.f6789h.a(), i3.f6749a);
    }

    /* access modifiers changed from: package-private */
    public final void c(boolean z10) {
        boolean g10 = this.f6784c.g();
        this.f6784c.d(z10);
        if (z10 && !g10) {
            d();
        }
    }
}
