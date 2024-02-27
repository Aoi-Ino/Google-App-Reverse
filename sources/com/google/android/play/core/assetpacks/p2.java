package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;
import q5.d;
import t5.a;

final class p2 {

    /* renamed from: d  reason: collision with root package name */
    private static final a f6841d = new a("PackMetadataManager");

    /* renamed from: a  reason: collision with root package name */
    private final e0 f6842a;

    /* renamed from: b  reason: collision with root package name */
    private final r2 f6843b;

    /* renamed from: c  reason: collision with root package name */
    private final d f6844c;

    p2(e0 e0Var, r2 r2Var, d dVar) {
        this.f6842a = e0Var;
        this.f6843b = r2Var;
        this.f6844c = dVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r6) {
        /*
            r5 = this;
            q5.d r0 = r5.f6844c
            java.lang.String r1 = "assetOnlyUpdates"
            boolean r0 = r0.a(r1)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x005b
            com.google.android.play.core.assetpacks.e0 r0 = r5.f6842a
            boolean r0 = r0.f(r6)
            if (r0 != 0) goto L_0x0015
            goto L_0x005b
        L_0x0015:
            com.google.android.play.core.assetpacks.r2 r0 = r5.f6843b
            int r0 = r0.a()
            com.google.android.play.core.assetpacks.e0 r2 = r5.f6842a
            long r3 = r2.r(r6)
            java.io.File r2 = r2.x(r6, r0, r3)
            boolean r3 = r2.exists()     // Catch:{ IOException -> 0x0050 }
            if (r3 != 0) goto L_0x0030
        L_0x002b:
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0050 }
            goto L_0x004a
        L_0x0030:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0050 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0050 }
            java.util.Properties r2 = new java.util.Properties     // Catch:{ all -> 0x004b }
            r2.<init>()     // Catch:{ all -> 0x004b }
            r2.load(r3)     // Catch:{ all -> 0x004b }
            r3.close()     // Catch:{ IOException -> 0x0050 }
            java.lang.String r3 = "moduleVersionTag"
            java.lang.String r2 = r2.getProperty(r3)     // Catch:{ IOException -> 0x0050 }
            if (r2 != 0) goto L_0x0049
            goto L_0x002b
        L_0x0049:
            r6 = r2
        L_0x004a:
            return r6
        L_0x004b:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            t5.a r0 = f6841d
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r2 = "Failed to read pack version tag for pack %s"
            r0.b(r2, r6)
        L_0x005b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.p2.a(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, int i10, long j10, String str2) {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i10);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        File x10 = this.f6842a.x(str, i10, j10);
        x10.getParentFile().mkdirs();
        x10.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(x10);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
