package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.c;
import p3.c;
import r3.i;
import r3.u;
import r3.v;
import r3.w;
import s3.o;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final e f5288a;

    /* renamed from: b  reason: collision with root package name */
    public final h f5289b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f5290c;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public i f5291a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public i f5292b;

        /* renamed from: c  reason: collision with root package name */
        private Runnable f5293c = u.f15578e;

        /* renamed from: d  reason: collision with root package name */
        private c f5294d;

        /* renamed from: e  reason: collision with root package name */
        private c[] f5295e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f5296f = true;

        /* renamed from: g  reason: collision with root package name */
        private int f5297g;

        /* synthetic */ a(v vVar) {
        }

        public f a() {
            boolean z10 = false;
            o.b(this.f5291a != null, "Must set register function");
            o.b(this.f5292b != null, "Must set unregister function");
            if (this.f5294d != null) {
                z10 = true;
            }
            o.b(z10, "Must set holder");
            return new f(new x(this, this.f5294d, this.f5295e, this.f5296f, this.f5297g), new y(this, (c.a) o.j(this.f5294d.b(), "Key must not be null")), this.f5293c, (w) null);
        }

        public a b(i iVar) {
            this.f5291a = iVar;
            return this;
        }

        public a c(int i10) {
            this.f5297g = i10;
            return this;
        }

        public a d(i iVar) {
            this.f5292b = iVar;
            return this;
        }

        public a e(c cVar) {
            this.f5294d = cVar;
            return this;
        }
    }

    /* synthetic */ f(e eVar, h hVar, Runnable runnable, w wVar) {
        this.f5288a = eVar;
        this.f5289b = hVar;
        this.f5290c = runnable;
    }

    public static a a() {
        return new a((v) null);
    }
}
