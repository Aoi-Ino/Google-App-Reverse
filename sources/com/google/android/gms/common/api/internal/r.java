package com.google.android.gms.common.api.internal;

import p3.c;
import r3.b;
import r3.n;

final class r {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b f5341a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final c f5342b;

    /* synthetic */ r(b bVar, c cVar, n nVar) {
        this.f5341a = bVar;
        this.f5342b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof r)) {
            r rVar = (r) obj;
            return s3.n.a(this.f5341a, rVar.f5341a) && s3.n.a(this.f5342b, rVar.f5342b);
        }
    }

    public final int hashCode() {
        return s3.n.b(this.f5341a, this.f5342b);
    }

    public final String toString() {
        return s3.n.c(this).a("key", this.f5341a).a("feature", this.f5342b).toString();
    }
}
