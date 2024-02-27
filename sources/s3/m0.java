package s3;

import android.os.Bundle;
import p3.a;

abstract class m0 extends t0 {

    /* renamed from: d  reason: collision with root package name */
    public final int f16012d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f16013e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ c f16014f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected m0(c cVar, int i10, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f16014f = cVar;
        this.f16012d = i10;
        this.f16013e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f16012d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.g()
            if (r3 != 0) goto L_0x001b
            s3.c r3 = r2.f16014f
            r3.g0(r0, (android.os.IInterface) null)
            p3.a r3 = new p3.a
            r0 = 8
            r3.<init>(r0, r1)
        L_0x0018:
            r2.f(r3)
        L_0x001b:
            return
        L_0x001c:
            s3.c r3 = r2.f16014f
            r3.g0(r0, (android.os.IInterface) null)
            android.os.Bundle r3 = r2.f16013e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            p3.a r3 = new p3.a
            int r0 = r2.f16012d
            r3.<init>(r0, r1)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.m0.a(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }

    /* access modifiers changed from: protected */
    public abstract void f(a aVar);

    /* access modifiers changed from: protected */
    public abstract boolean g();
}
