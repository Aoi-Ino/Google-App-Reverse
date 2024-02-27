package com.google.android.play.core.assetpacks;

import t5.a;
import t5.y;

final class u2 {

    /* renamed from: c  reason: collision with root package name */
    private static final a f6913c = new a("PatchSliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    private final e0 f6914a;

    /* renamed from: b  reason: collision with root package name */
    private final y f6915b;

    u2(e0 e0Var, y yVar) {
        this.f6914a = e0Var;
        this.f6915b = yVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00aa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.play.core.assetpacks.t2 r15) {
        /*
            r14 = this;
            com.google.android.play.core.assetpacks.e0 r0 = r14.f6914a
            java.lang.String r1 = r15.f6999b
            int r2 = r15.f6892c
            long r3 = r15.f6893d
            java.io.File r0 = r0.u(r1, r2, r3)
            com.google.android.play.core.assetpacks.e0 r1 = r14.f6914a
            java.lang.String r2 = r15.f6999b
            int r3 = r15.f6892c
            long r4 = r15.f6893d
            java.lang.String r6 = r15.f6897h
            java.io.File r7 = new java.io.File
            java.io.File r1 = r1.v(r2, r3, r4)
            r7.<init>(r1, r6)
            java.io.InputStream r1 = r15.f6899j     // Catch:{ IOException -> 0x00a5 }
            int r2 = r15.f6896g     // Catch:{ IOException -> 0x00a5 }
            r3 = 2
            if (r2 == r3) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x00a5 }
            r3 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r1, r3)     // Catch:{ IOException -> 0x00a5 }
            r1 = r2
        L_0x002f:
            com.google.android.play.core.assetpacks.h0 r2 = new com.google.android.play.core.assetpacks.h0     // Catch:{ all -> 0x004c }
            r2.<init>(r0, r7)     // Catch:{ all -> 0x004c }
            com.google.android.play.core.assetpacks.e0 r8 = r14.f6914a     // Catch:{ all -> 0x004c }
            java.lang.String r9 = r15.f6999b     // Catch:{ all -> 0x004c }
            int r10 = r15.f6894e     // Catch:{ all -> 0x004c }
            long r11 = r15.f6895f     // Catch:{ all -> 0x004c }
            java.lang.String r13 = r15.f6897h     // Catch:{ all -> 0x004c }
            java.io.File r0 = r8.C(r9, r10, r11, r13)     // Catch:{ all -> 0x004c }
            boolean r3 = r0.exists()     // Catch:{ all -> 0x004c }
            if (r3 != 0) goto L_0x004e
            r0.mkdirs()     // Catch:{ all -> 0x004c }
            goto L_0x004e
        L_0x004c:
            r0 = move-exception
            goto L_0x00a7
        L_0x004e:
            com.google.android.play.core.assetpacks.b3 r10 = new com.google.android.play.core.assetpacks.b3     // Catch:{ all -> 0x004c }
            com.google.android.play.core.assetpacks.e0 r4 = r14.f6914a     // Catch:{ all -> 0x004c }
            java.lang.String r5 = r15.f6999b     // Catch:{ all -> 0x004c }
            int r6 = r15.f6894e     // Catch:{ all -> 0x004c }
            long r7 = r15.f6895f     // Catch:{ all -> 0x004c }
            java.lang.String r9 = r15.f6897h     // Catch:{ all -> 0x004c }
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ all -> 0x004c }
            com.google.android.play.core.assetpacks.g1 r3 = new com.google.android.play.core.assetpacks.g1     // Catch:{ all -> 0x004c }
            r3.<init>(r0, r10)     // Catch:{ all -> 0x004c }
            long r4 = r15.f6898i     // Catch:{ all -> 0x004c }
            t5.v.a(r2, r1, r3, r4)     // Catch:{ all -> 0x004c }
            r0 = 0
            r10.i(r0)     // Catch:{ all -> 0x004c }
            r1.close()     // Catch:{ IOException -> 0x00a5 }
            t5.a r1 = f6913c
            java.lang.String r2 = r15.f6897h
            java.lang.String r3 = r15.f6999b
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "Patching and extraction finished for slice %s of pack %s."
            r1.d(r3, r2)
            t5.y r1 = r14.f6915b
            java.lang.Object r1 = r1.a()
            com.google.android.play.core.assetpacks.u3 r1 = (com.google.android.play.core.assetpacks.u3) r1
            int r2 = r15.f6998a
            java.lang.String r3 = r15.f6999b
            java.lang.String r4 = r15.f6897h
            r1.h(r2, r3, r4, r0)
            java.io.InputStream r0 = r15.f6899j     // Catch:{ IOException -> 0x0095 }
            r0.close()     // Catch:{ IOException -> 0x0095 }
            return
        L_0x0095:
            t5.a r0 = f6913c
            java.lang.String r1 = r15.f6897h
            java.lang.String r15 = r15.f6999b
            java.lang.Object[] r15 = new java.lang.Object[]{r1, r15}
            java.lang.String r1 = "Could not close file for slice %s of pack %s."
            r0.e(r1, r15)
            return
        L_0x00a5:
            r0 = move-exception
            goto L_0x00ab
        L_0x00a7:
            r1.close()     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            throw r0     // Catch:{ IOException -> 0x00a5 }
        L_0x00ab:
            t5.a r1 = f6913c
            java.lang.String r2 = r0.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "IOException during patching %s."
            r1.b(r3, r2)
            com.google.android.play.core.assetpacks.d1 r1 = new com.google.android.play.core.assetpacks.d1
            java.lang.String r2 = r15.f6897h
            java.lang.String r3 = r15.f6999b
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "Error patching slice %s of pack %s."
            java.lang.String r2 = java.lang.String.format(r3, r2)
            int r15 = r15.f6998a
            r1.<init>(r2, r0, r15)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.u2.a(com.google.android.play.core.assetpacks.t2):void");
    }
}
