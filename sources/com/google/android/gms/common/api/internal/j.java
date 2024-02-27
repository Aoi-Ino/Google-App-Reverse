package com.google.android.gms.common.api.internal;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final Map f5318a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map f5319b = Collections.synchronizedMap(new WeakHashMap());

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f(boolean r5, com.google.android.gms.common.api.Status r6) {
        /*
            r4 = this;
            java.util.Map r0 = r4.f5318a
            monitor-enter(r0)
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0077 }
            java.util.Map r2 = r4.f5318a     // Catch:{ all -> 0x0077 }
            r1.<init>(r2)     // Catch:{ all -> 0x0077 }
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            java.util.Map r2 = r4.f5319b
            monitor-enter(r2)
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0074 }
            java.util.Map r3 = r4.f5319b     // Catch:{ all -> 0x0074 }
            r0.<init>(r3)     // Catch:{ all -> 0x0074 }
            monitor-exit(r2)     // Catch:{ all -> 0x0074 }
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x001e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r5 != 0) goto L_0x0039
            java.lang.Object r3 = r2.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0039
            goto L_0x001e
        L_0x0039:
            java.lang.Object r5 = r2.getKey()
            android.support.v4.media.session.b.a(r5)
            r5 = 0
            throw r5
        L_0x0042:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x004a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0073
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r5 != 0) goto L_0x0064
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x004a
        L_0x0064:
            java.lang.Object r1 = r1.getKey()
            p4.j r1 = (p4.j) r1
            q3.b r2 = new q3.b
            r2.<init>(r6)
            r1.d(r2)
            goto L_0x004a
        L_0x0073:
            return
        L_0x0074:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0074 }
            throw r5
        L_0x0077:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.j.f(boolean, com.google.android.gms.common.api.Status):void");
    }

    /* access modifiers changed from: package-private */
    public final void b(p4.j jVar, boolean z10) {
        this.f5319b.put(jVar, Boolean.valueOf(z10));
        jVar.a().c(new i(this, jVar));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The connection to Google Play services was lost"
            r0.<init>(r1)
            r1 = 1
            if (r4 != r1) goto L_0x0010
            java.lang.String r4 = " due to service disconnection."
        L_0x000c:
            r0.append(r4)
            goto L_0x0016
        L_0x0010:
            r2 = 3
            if (r4 != r2) goto L_0x0016
            java.lang.String r4 = " due to dead object exception."
            goto L_0x000c
        L_0x0016:
            if (r5 == 0) goto L_0x0020
            java.lang.String r4 = " Last reason for disconnect: "
            r0.append(r4)
            r0.append(r5)
        L_0x0020:
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status
            r5 = 20
            java.lang.String r0 = r0.toString()
            r4.<init>((int) r5, (java.lang.String) r0)
            r3.f(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.j.c(int, java.lang.String):void");
    }

    public final void d() {
        f(false, b.f5252r);
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return !this.f5318a.isEmpty() || !this.f5319b.isEmpty();
    }
}
