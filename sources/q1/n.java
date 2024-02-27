package q1;

import android.content.Context;
import cm.l;
import t1.b;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final h f14932a;

    /* renamed from: b  reason: collision with root package name */
    private final c f14933b;

    /* renamed from: c  reason: collision with root package name */
    private final h f14934c;

    /* renamed from: d  reason: collision with root package name */
    private final h f14935d;

    public n(Context context, b bVar, h hVar, c cVar, h hVar2, h hVar3) {
        l.f(context, "context");
        l.f(bVar, "taskExecutor");
        l.f(hVar, "batteryChargingTracker");
        l.f(cVar, "batteryNotLowTracker");
        l.f(hVar2, "networkStateTracker");
        l.f(hVar3, "storageNotLowTracker");
        this.f14932a = hVar;
        this.f14933b = cVar;
        this.f14934c = hVar2;
        this.f14935d = hVar3;
    }

    public final h a() {
        return this.f14932a;
    }

    public final c b() {
        return this.f14933b;
    }

    public final h c() {
        return this.f14934c;
    }

    public final h d() {
        return this.f14935d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ n(android.content.Context r8, t1.b r9, q1.h r10, q1.c r11, q1.h r12, q1.h r13, int r14, cm.g r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "context.applicationContext"
            if (r0 == 0) goto L_0x0014
            q1.a r0 = new q1.a
            android.content.Context r3 = r8.getApplicationContext()
            cm.l.e(r3, r1)
            r0.<init>(r3, r9)
            r3 = r0
            goto L_0x0015
        L_0x0014:
            r3 = r10
        L_0x0015:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x0027
            q1.c r0 = new q1.c
            android.content.Context r4 = r8.getApplicationContext()
            cm.l.e(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L_0x0028
        L_0x0027:
            r4 = r11
        L_0x0028:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0039
            android.content.Context r0 = r8.getApplicationContext()
            cm.l.e(r0, r1)
            q1.h r0 = q1.k.a(r0, r9)
            r5 = r0
            goto L_0x003a
        L_0x0039:
            r5 = r12
        L_0x003a:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x004c
            q1.l r0 = new q1.l
            android.content.Context r6 = r8.getApplicationContext()
            cm.l.e(r6, r1)
            r0.<init>(r6, r9)
            r6 = r0
            goto L_0x004d
        L_0x004c:
            r6 = r13
        L_0x004d:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.n.<init>(android.content.Context, t1.b, q1.h, q1.c, q1.h, q1.h, int, cm.g):void");
    }
}
