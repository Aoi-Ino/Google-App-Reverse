package com.google.android.play.core.assetpacks;

import android.content.Context;
import t5.a;

final class r2 {

    /* renamed from: c  reason: collision with root package name */
    private static final a f6865c = new a("PackageStateCache");

    /* renamed from: a  reason: collision with root package name */
    private final Context f6866a;

    /* renamed from: b  reason: collision with root package name */
    private int f6867b = -1;

    r2(Context context) {
        this.f6866a = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f6867b     // Catch:{ all -> 0x001c }
            r1 = -1
            if (r0 != r1) goto L_0x0027
            r0 = 0
            android.content.Context r1 = r3.f6866a     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.Context r2 = r3.f6866a     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x001e }
            int r1 = r1.versionCode     // Catch:{ NameNotFoundException -> 0x001e }
            r3.f6867b = r1     // Catch:{ NameNotFoundException -> 0x001e }
            goto L_0x0027
        L_0x001c:
            r0 = move-exception
            goto L_0x002b
        L_0x001e:
            t5.a r1 = f6865c     // Catch:{ all -> 0x001c }
            java.lang.String r2 = "The current version of the app could not be retrieved"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x001c }
            r1.b(r2, r0)     // Catch:{ all -> 0x001c }
        L_0x0027:
            int r0 = r3.f6867b     // Catch:{ all -> 0x001c }
            monitor-exit(r3)
            return r0
        L_0x002b:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.r2.a():int");
    }
}
