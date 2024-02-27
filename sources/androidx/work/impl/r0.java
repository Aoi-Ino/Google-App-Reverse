package androidx.work.impl;

import android.content.Context;
import cm.l;
import d1.g;
import s1.q;
import z0.b;

public final class r0 extends b {

    /* renamed from: c  reason: collision with root package name */
    private final Context f4277c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0(Context context) {
        super(9, 10);
        l.f(context, "context");
        this.f4277c = context;
    }

    public void a(g gVar) {
        l.f(gVar, "db");
        gVar.w("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        q.c(this.f4277c, gVar);
        s1.l.c(this.f4277c, gVar);
    }
}
