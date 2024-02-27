package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import q5.d;
import t5.y;

final class n2 {

    /* renamed from: a  reason: collision with root package name */
    private final e0 f6816a;

    /* renamed from: b  reason: collision with root package name */
    private final y f6817b;

    /* renamed from: c  reason: collision with root package name */
    private final w1 f6818c;

    /* renamed from: d  reason: collision with root package name */
    private final y f6819d;

    /* renamed from: e  reason: collision with root package name */
    private final h1 f6820e;

    /* renamed from: f  reason: collision with root package name */
    private final d f6821f;

    /* renamed from: g  reason: collision with root package name */
    private final p2 f6822g;

    n2(e0 e0Var, y yVar, w1 w1Var, y yVar2, h1 h1Var, d dVar, p2 p2Var) {
        this.f6816a = e0Var;
        this.f6817b = yVar;
        this.f6818c = w1Var;
        this.f6819d = yVar2;
        this.f6820e = h1Var;
        this.f6821f = dVar;
        this.f6822g = p2Var;
    }

    public final void a(k2 k2Var) {
        File w10 = this.f6816a.w(k2Var.f6999b, k2Var.f6769c, k2Var.f6770d);
        File y10 = this.f6816a.y(k2Var.f6999b, k2Var.f6769c, k2Var.f6770d);
        if (!w10.exists() || !y10.exists()) {
            throw new d1(String.format("Cannot find pack files to move for pack %s.", new Object[]{k2Var.f6999b}), k2Var.f6998a);
        }
        File u10 = this.f6816a.u(k2Var.f6999b, k2Var.f6769c, k2Var.f6770d);
        u10.mkdirs();
        if (w10.renameTo(u10)) {
            new File(this.f6816a.u(k2Var.f6999b, k2Var.f6769c, k2Var.f6770d), "merge.tmp").delete();
            File v10 = this.f6816a.v(k2Var.f6999b, k2Var.f6769c, k2Var.f6770d);
            v10.mkdirs();
            if (y10.renameTo(v10)) {
                if (this.f6821f.a("assetOnlyUpdates")) {
                    try {
                        this.f6822g.b(k2Var.f6999b, k2Var.f6769c, k2Var.f6770d, k2Var.f6771e);
                        ((Executor) this.f6819d.a()).execute(new m2(this, k2Var));
                    } catch (IOException e10) {
                        throw new d1(String.format("Could not write asset pack version tag for pack %s: %s", new Object[]{k2Var.f6999b, e10.getMessage()}), k2Var.f6998a);
                    }
                } else {
                    e0 e0Var = this.f6816a;
                    e0Var.getClass();
                    ((Executor) this.f6819d.a()).execute(new l2(e0Var));
                }
                this.f6818c.i(k2Var.f6999b, k2Var.f6769c, k2Var.f6770d);
                this.f6820e.c(k2Var.f6999b);
                ((u3) this.f6817b.a()).j(k2Var.f6998a, k2Var.f6999b);
                return;
            }
            throw new d1("Cannot move metadata files to final location.", k2Var.f6998a);
        }
        throw new d1("Cannot move merged pack files to final location.", k2Var.f6998a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(k2 k2Var) {
        this.f6816a.b(k2Var.f6999b, k2Var.f6769c, k2Var.f6770d);
    }
}
