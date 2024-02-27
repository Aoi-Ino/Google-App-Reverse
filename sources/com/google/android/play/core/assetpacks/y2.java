package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.concurrent.Executor;
import t5.y;

final class y2 {

    /* renamed from: a  reason: collision with root package name */
    private final e0 f7000a;

    /* renamed from: b  reason: collision with root package name */
    private final y f7001b;

    /* renamed from: c  reason: collision with root package name */
    private final w1 f7002c;

    /* renamed from: d  reason: collision with root package name */
    private final y f7003d;

    /* renamed from: e  reason: collision with root package name */
    private final h1 f7004e;

    y2(e0 e0Var, y yVar, w1 w1Var, y yVar2, h1 h1Var) {
        this.f7000a = e0Var;
        this.f7001b = yVar;
        this.f7002c = w1Var;
        this.f7003d = yVar2;
        this.f7004e = h1Var;
    }

    public final void a(w2 w2Var) {
        File u10 = this.f7000a.u(w2Var.f6999b, w2Var.f6961c, w2Var.f6963e);
        if (u10.exists()) {
            File u11 = this.f7000a.u(w2Var.f6999b, w2Var.f6962d, w2Var.f6963e);
            u11.mkdirs();
            if (u10.renameTo(u11)) {
                ((Executor) this.f7003d.a()).execute(new x2(this, w2Var));
                this.f7002c.i(w2Var.f6999b, w2Var.f6962d, w2Var.f6963e);
                this.f7004e.c(w2Var.f6999b);
                ((u3) this.f7001b.a()).j(w2Var.f6998a, w2Var.f6999b);
                return;
            }
            throw new d1(String.format("Cannot promote pack %s from %s to %s", new Object[]{w2Var.f6999b, u10.getAbsolutePath(), u11.getAbsolutePath()}), w2Var.f6998a);
        }
        throw new d1(String.format("Cannot find pack files to promote for pack %s at %s", new Object[]{w2Var.f6999b, u10.getAbsolutePath()}), w2Var.f6998a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(w2 w2Var) {
        this.f7000a.b(w2Var.f6999b, w2Var.f6962d, w2Var.f6963e);
    }
}
