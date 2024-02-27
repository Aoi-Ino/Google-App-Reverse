package com.google.android.gms.common.api.internal;

import p3.c;
import p4.j;
import q3.a;
import r3.b0;
import r3.i;
import s3.o;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private final c[] f5300a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5301b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5302c;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public i f5303a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f5304b = true;

        /* renamed from: c  reason: collision with root package name */
        private c[] f5305c;

        /* renamed from: d  reason: collision with root package name */
        private int f5306d = 0;

        /* synthetic */ a(b0 b0Var) {
        }

        public g a() {
            o.b(this.f5303a != null, "execute parameter required");
            return new z(this, this.f5305c, this.f5304b, this.f5306d);
        }

        public a b(i iVar) {
            this.f5303a = iVar;
            return this;
        }

        public a c(boolean z10) {
            this.f5304b = z10;
            return this;
        }

        public a d(c... cVarArr) {
            this.f5305c = cVarArr;
            return this;
        }
    }

    protected g(c[] cVarArr, boolean z10, int i10) {
        this.f5300a = cVarArr;
        boolean z11 = false;
        if (cVarArr != null && z10) {
            z11 = true;
        }
        this.f5301b = z11;
        this.f5302c = i10;
    }

    public static a a() {
        return new a((b0) null);
    }

    /* access modifiers changed from: protected */
    public abstract void b(a.b bVar, j jVar);

    public boolean c() {
        return this.f5301b;
    }

    public final int d() {
        return this.f5302c;
    }

    public final c[] e() {
        return this.f5300a;
    }
}
