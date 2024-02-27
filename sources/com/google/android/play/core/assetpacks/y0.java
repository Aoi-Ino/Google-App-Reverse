package com.google.android.play.core.assetpacks;

import java.io.File;
import t5.a;
import t5.y;

final class y0 {

    /* renamed from: g  reason: collision with root package name */
    private static final a f6991g = new a("ExtractChunkTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f6992a = new byte[8192];

    /* renamed from: b  reason: collision with root package name */
    private final e0 f6993b;

    /* renamed from: c  reason: collision with root package name */
    private final y f6994c;

    /* renamed from: d  reason: collision with root package name */
    private final y f6995d;

    /* renamed from: e  reason: collision with root package name */
    private final h1 f6996e;

    /* renamed from: f  reason: collision with root package name */
    private final p2 f6997f;

    y0(e0 e0Var, y yVar, y yVar2, h1 h1Var, p2 p2Var) {
        this.f6993b = e0Var;
        this.f6994c = yVar;
        this.f6995d = yVar2;
        this.f6996e = h1Var;
        this.f6997f = p2Var;
    }

    private final File b(x0 x0Var) {
        File C = this.f6993b.C(x0Var.f6999b, x0Var.f6966c, x0Var.f6967d, x0Var.f6969f);
        if (!C.exists()) {
            C.mkdirs();
        }
        return C;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:110:0x0328 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0177 A[Catch:{ all -> 0x007e, all -> 0x0328, IOException -> 0x0323 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019c A[Catch:{ all -> 0x007e, all -> 0x0328, IOException -> 0x0323 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01d0 A[Catch:{ all -> 0x007e, all -> 0x0328, IOException -> 0x0323 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x028b A[SYNTHETIC, Splitter:B:94:0x028b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.play.core.assetpacks.x0 r21) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            com.google.android.play.core.assetpacks.b3 r0 = new com.google.android.play.core.assetpacks.b3
            com.google.android.play.core.assetpacks.e0 r10 = r1.f6993b
            java.lang.String r11 = r2.f6999b
            int r12 = r2.f6966c
            long r13 = r2.f6967d
            java.lang.String r15 = r2.f6969f
            r3 = r0
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r9 = r15
            r3.<init>(r4, r5, r6, r7, r9)
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r8 = r15
            java.io.File r3 = r3.B(r4, r5, r6, r8)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L_0x002b
            r3.mkdirs()
        L_0x002b:
            java.io.InputStream r3 = r2.f6975l     // Catch:{ IOException -> 0x0323 }
            int r4 = r2.f6970g     // Catch:{ IOException -> 0x0323 }
            r10 = 8192(0x2000, float:1.14794E-41)
            r5 = 1
            if (r4 == r5) goto L_0x0036
            r11 = r3
            goto L_0x003c
        L_0x0036:
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0323 }
            r4.<init>(r3, r10)     // Catch:{ IOException -> 0x0323 }
            r11 = r4
        L_0x003c:
            int r3 = r2.f6971h     // Catch:{ all -> 0x007e }
            r12 = 3
            r13 = 0
            if (r3 <= 0) goto L_0x0174
            com.google.android.play.core.assetpacks.a3 r3 = r0.b()     // Catch:{ all -> 0x007e }
            int r4 = r3.b()     // Catch:{ all -> 0x007e }
            int r6 = r2.f6971h     // Catch:{ all -> 0x007e }
            int r7 = r6 + -1
            r8 = 2
            if (r4 != r7) goto L_0x0154
            int r4 = r3.a()     // Catch:{ all -> 0x007e }
            if (r4 == r5) goto L_0x00d4
            if (r4 == r8) goto L_0x009b
            if (r4 != r12) goto L_0x0081
            t5.a r4 = f6991g     // Catch:{ all -> 0x007e }
            java.lang.String r5 = "Resuming central directory from last chunk."
            java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch:{ all -> 0x007e }
            r4.a(r5, r6)     // Catch:{ all -> 0x007e }
            long r3 = r3.c()     // Catch:{ all -> 0x007e }
            r0.d(r11, r3)     // Catch:{ all -> 0x007e }
            boolean r3 = r21.a()     // Catch:{ all -> 0x007e }
            if (r3 == 0) goto L_0x0074
        L_0x0071:
            r14 = 0
            goto L_0x0175
        L_0x0074:
            com.google.android.play.core.assetpacks.d1 r0 = new com.google.android.play.core.assetpacks.d1     // Catch:{ all -> 0x007e }
            java.lang.String r3 = "Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB."
            int r4 = r2.f6998a     // Catch:{ all -> 0x007e }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x007e }
        L_0x007e:
            r0 = move-exception
            goto L_0x0325
        L_0x0081:
            com.google.android.play.core.assetpacks.d1 r0 = new com.google.android.play.core.assetpacks.d1     // Catch:{ all -> 0x007e }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ all -> 0x007e }
            int r3 = r3.a()     // Catch:{ all -> 0x007e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x007e }
            r4[r13] = r3     // Catch:{ all -> 0x007e }
            java.lang.String r3 = "Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s."
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x007e }
            int r4 = r2.f6998a     // Catch:{ all -> 0x007e }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x007e }
        L_0x009b:
            t5.a r3 = f6991g     // Catch:{ all -> 0x007e }
            java.lang.String r4 = "Resuming zip entry from last chunk during local file header."
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x007e }
            r3.a(r4, r5)     // Catch:{ all -> 0x007e }
            com.google.android.play.core.assetpacks.e0 r14 = r1.f6993b     // Catch:{ all -> 0x007e }
            java.lang.String r15 = r2.f6999b     // Catch:{ all -> 0x007e }
            int r3 = r2.f6966c     // Catch:{ all -> 0x007e }
            long r4 = r2.f6967d     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r2.f6969f     // Catch:{ all -> 0x007e }
            r16 = r3
            r17 = r4
            r19 = r6
            java.io.File r3 = r14.z(r15, r16, r17, r19)     // Catch:{ all -> 0x007e }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x007e }
            if (r4 == 0) goto L_0x00ca
            java.io.SequenceInputStream r14 = new java.io.SequenceInputStream     // Catch:{ all -> 0x007e }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x007e }
            r4.<init>(r3)     // Catch:{ all -> 0x007e }
            r14.<init>(r4, r11)     // Catch:{ all -> 0x007e }
            goto L_0x0175
        L_0x00ca:
            com.google.android.play.core.assetpacks.d1 r0 = new com.google.android.play.core.assetpacks.d1     // Catch:{ all -> 0x007e }
            java.lang.String r3 = "Checkpoint extension file not found."
            int r4 = r2.f6998a     // Catch:{ all -> 0x007e }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x007e }
        L_0x00d4:
            t5.a r4 = f6991g     // Catch:{ all -> 0x007e }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r3.e()     // Catch:{ all -> 0x007e }
            r5[r13] = r6     // Catch:{ all -> 0x007e }
            java.lang.String r6 = "Resuming zip entry from last chunk during file %s."
            r4.a(r6, r5)     // Catch:{ all -> 0x007e }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x007e }
            java.lang.String r5 = r3.e()     // Catch:{ all -> 0x007e }
            r4.<init>(r5)     // Catch:{ all -> 0x007e }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x014a
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x007e }
            java.lang.String r6 = "rw"
            r5.<init>(r4, r6)     // Catch:{ all -> 0x007e }
            long r6 = r3.c()     // Catch:{ all -> 0x007e }
            r5.seek(r6)     // Catch:{ all -> 0x007e }
            long r6 = r3.d()     // Catch:{ all -> 0x007e }
        L_0x0104:
            r8 = 8192(0x2000, double:4.0474E-320)
            long r8 = java.lang.Math.min(r6, r8)     // Catch:{ all -> 0x007e }
            int r3 = (int) r8     // Catch:{ all -> 0x007e }
            byte[] r8 = r1.f6992a     // Catch:{ all -> 0x007e }
            int r8 = r11.read(r8, r13, r3)     // Catch:{ all -> 0x007e }
            int r8 = java.lang.Math.max(r8, r13)     // Catch:{ all -> 0x007e }
            if (r8 <= 0) goto L_0x011c
            byte[] r9 = r1.f6992a     // Catch:{ all -> 0x007e }
            r5.write(r9, r13, r8)     // Catch:{ all -> 0x007e }
        L_0x011c:
            long r14 = (long) r8     // Catch:{ all -> 0x007e }
            long r14 = r6 - r14
            r6 = 0
            int r6 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x012a
            if (r8 > 0) goto L_0x0128
            goto L_0x012a
        L_0x0128:
            r6 = r14
            goto L_0x0104
        L_0x012a:
            long r6 = r5.length()     // Catch:{ all -> 0x007e }
            r5.close()     // Catch:{ all -> 0x007e }
            if (r8 == r3) goto L_0x0174
            t5.a r3 = f6991g     // Catch:{ all -> 0x007e }
            java.lang.String r5 = "Chunk has ended while resuming the previous chunks file content."
            java.lang.Object[] r8 = new java.lang.Object[r13]     // Catch:{ all -> 0x007e }
            r3.a(r5, r8)     // Catch:{ all -> 0x007e }
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x007e }
            int r9 = r2.f6971h     // Catch:{ all -> 0x007e }
            r3 = r0
            r5 = r6
            r7 = r14
            r3.g(r4, r5, r7, r9)     // Catch:{ all -> 0x007e }
            goto L_0x0071
        L_0x014a:
            com.google.android.play.core.assetpacks.d1 r0 = new com.google.android.play.core.assetpacks.d1     // Catch:{ all -> 0x007e }
            java.lang.String r3 = "Partial file specified in checkpoint does not exist. Corrupt directory."
            int r4 = r2.f6998a     // Catch:{ all -> 0x007e }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x007e }
        L_0x0154:
            com.google.android.play.core.assetpacks.d1 r0 = new com.google.android.play.core.assetpacks.d1     // Catch:{ all -> 0x007e }
            java.lang.String r4 = "Trying to resume with chunk number %s when previously processed chunk was number %s."
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch:{ all -> 0x007e }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x007e }
            r7[r13] = r6     // Catch:{ all -> 0x007e }
            int r3 = r3.b()     // Catch:{ all -> 0x007e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x007e }
            r7[r5] = r3     // Catch:{ all -> 0x007e }
            java.lang.String r3 = java.lang.String.format(r4, r7)     // Catch:{ all -> 0x007e }
            int r4 = r2.f6998a     // Catch:{ all -> 0x007e }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x007e }
        L_0x0174:
            r14 = r11
        L_0x0175:
            if (r14 == 0) goto L_0x0282
            com.google.android.play.core.assetpacks.q0 r3 = new com.google.android.play.core.assetpacks.q0     // Catch:{ all -> 0x007e }
            r3.<init>(r14)     // Catch:{ all -> 0x007e }
            java.io.File r4 = r20.b(r21)     // Catch:{ all -> 0x007e }
        L_0x0180:
            com.google.android.play.core.assetpacks.h3 r5 = r3.e()     // Catch:{ all -> 0x007e }
            boolean r6 = r5.e()     // Catch:{ all -> 0x007e }
            if (r6 != 0) goto L_0x01d7
            boolean r6 = r3.f()     // Catch:{ all -> 0x007e }
            if (r6 != 0) goto L_0x01d7
            boolean r6 = r5.h()     // Catch:{ all -> 0x007e }
            if (r6 == 0) goto L_0x01d0
            boolean r6 = r5.g()     // Catch:{ all -> 0x007e }
            if (r6 != 0) goto L_0x01d0
            byte[] r6 = r5.f()     // Catch:{ all -> 0x007e }
            r0.j(r6)     // Catch:{ all -> 0x007e }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x007e }
            java.lang.String r7 = r5.c()     // Catch:{ all -> 0x007e }
            r6.<init>(r4, r7)     // Catch:{ all -> 0x007e }
            java.io.File r7 = r6.getParentFile()     // Catch:{ all -> 0x007e }
            r7.mkdirs()     // Catch:{ all -> 0x007e }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x007e }
            r7.<init>(r6)     // Catch:{ all -> 0x007e }
            byte[] r6 = r1.f6992a     // Catch:{ all -> 0x007e }
            int r6 = r3.read(r6, r13, r10)     // Catch:{ all -> 0x007e }
        L_0x01be:
            if (r6 <= 0) goto L_0x01cc
            byte[] r8 = r1.f6992a     // Catch:{ all -> 0x007e }
            r7.write(r8, r13, r6)     // Catch:{ all -> 0x007e }
            byte[] r6 = r1.f6992a     // Catch:{ all -> 0x007e }
            int r6 = r3.read(r6, r13, r10)     // Catch:{ all -> 0x007e }
            goto L_0x01be
        L_0x01cc:
            r7.close()     // Catch:{ all -> 0x007e }
            goto L_0x01d7
        L_0x01d0:
            byte[] r6 = r5.f()     // Catch:{ all -> 0x007e }
            r0.k(r6, r3)     // Catch:{ all -> 0x007e }
        L_0x01d7:
            boolean r6 = r3.g()     // Catch:{ all -> 0x007e }
            if (r6 != 0) goto L_0x01e3
            boolean r6 = r3.f()     // Catch:{ all -> 0x007e }
            if (r6 == 0) goto L_0x0180
        L_0x01e3:
            boolean r4 = r3.f()     // Catch:{ all -> 0x007e }
            if (r4 == 0) goto L_0x01f9
            t5.a r4 = f6991g     // Catch:{ all -> 0x007e }
            java.lang.String r6 = "Writing central directory metadata."
            java.lang.Object[] r7 = new java.lang.Object[r13]     // Catch:{ all -> 0x007e }
            r4.a(r6, r7)     // Catch:{ all -> 0x007e }
            byte[] r4 = r5.f()     // Catch:{ all -> 0x007e }
            r0.k(r4, r14)     // Catch:{ all -> 0x007e }
        L_0x01f9:
            boolean r4 = r21.a()     // Catch:{ all -> 0x007e }
            if (r4 != 0) goto L_0x0282
            boolean r4 = r5.e()     // Catch:{ all -> 0x007e }
            if (r4 == 0) goto L_0x0218
            t5.a r3 = f6991g     // Catch:{ all -> 0x007e }
            java.lang.String r4 = "Writing slice checkpoint for partial local file header."
            java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch:{ all -> 0x007e }
            r3.a(r4, r6)     // Catch:{ all -> 0x007e }
            byte[] r3 = r5.f()     // Catch:{ all -> 0x007e }
            int r4 = r2.f6971h     // Catch:{ all -> 0x007e }
            r0.h(r3, r4)     // Catch:{ all -> 0x007e }
            goto L_0x0282
        L_0x0218:
            boolean r4 = r3.f()     // Catch:{ all -> 0x007e }
            if (r4 == 0) goto L_0x022d
            t5.a r3 = f6991g     // Catch:{ all -> 0x007e }
            java.lang.String r4 = "Writing slice checkpoint for central directory."
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x007e }
            r3.a(r4, r5)     // Catch:{ all -> 0x007e }
            int r3 = r2.f6971h     // Catch:{ all -> 0x007e }
            r0.f(r3)     // Catch:{ all -> 0x007e }
            goto L_0x0282
        L_0x022d:
            int r4 = r5.a()     // Catch:{ all -> 0x007e }
            if (r4 != 0) goto L_0x0263
            t5.a r4 = f6991g     // Catch:{ all -> 0x007e }
            java.lang.String r6 = "Writing slice checkpoint for partial file."
            java.lang.Object[] r7 = new java.lang.Object[r13]     // Catch:{ all -> 0x007e }
            r4.a(r6, r7)     // Catch:{ all -> 0x007e }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x007e }
            java.io.File r6 = r20.b(r21)     // Catch:{ all -> 0x007e }
            java.lang.String r7 = r5.c()     // Catch:{ all -> 0x007e }
            r4.<init>(r6, r7)     // Catch:{ all -> 0x007e }
            long r5 = r5.b()     // Catch:{ all -> 0x007e }
            long r7 = r3.c()     // Catch:{ all -> 0x007e }
            long r5 = r5 - r7
            long r7 = r4.length()     // Catch:{ all -> 0x007e }
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x025b
            goto L_0x0274
        L_0x025b:
            com.google.android.play.core.assetpacks.d1 r0 = new com.google.android.play.core.assetpacks.d1     // Catch:{ all -> 0x007e }
            java.lang.String r3 = "Partial file is of unexpected size."
            r0.<init>(r3)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x007e }
        L_0x0263:
            t5.a r4 = f6991g     // Catch:{ all -> 0x007e }
            java.lang.String r5 = "Writing slice checkpoint for partial unextractable file."
            java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch:{ all -> 0x007e }
            r4.a(r5, r6)     // Catch:{ all -> 0x007e }
            java.io.File r4 = r0.c()     // Catch:{ all -> 0x007e }
            long r5 = r4.length()     // Catch:{ all -> 0x007e }
        L_0x0274:
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x007e }
            long r7 = r3.c()     // Catch:{ all -> 0x007e }
            int r9 = r2.f6971h     // Catch:{ all -> 0x007e }
            r3 = r0
            r3.g(r4, r5, r7, r9)     // Catch:{ all -> 0x007e }
        L_0x0282:
            r11.close()     // Catch:{ IOException -> 0x0323 }
            boolean r3 = r21.a()
            if (r3 == 0) goto L_0x02ab
            int r3 = r2.f6971h     // Catch:{ IOException -> 0x0291 }
            r0.i(r3)     // Catch:{ IOException -> 0x0291 }
            goto L_0x02ab
        L_0x0291:
            r0 = move-exception
            t5.a r3 = f6991g
            java.lang.String r4 = r0.getMessage()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "Writing extraction finished checkpoint failed with %s."
            r3.b(r5, r4)
            com.google.android.play.core.assetpacks.d1 r3 = new com.google.android.play.core.assetpacks.d1
            java.lang.String r4 = "Writing extraction finished checkpoint failed."
            int r2 = r2.f6998a
            r3.<init>(r4, r0, r2)
            throw r3
        L_0x02ab:
            t5.a r0 = f6991g
            int r3 = r2.f6971h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = r2.f6969f
            java.lang.String r5 = r2.f6999b
            int r6 = r2.f6998a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r6}
            java.lang.String r4 = "Extraction finished for chunk %s of slice %s of pack %s of session %s."
            r0.d(r4, r3)
            t5.y r0 = r1.f6994c
            java.lang.Object r0 = r0.a()
            com.google.android.play.core.assetpacks.u3 r0 = (com.google.android.play.core.assetpacks.u3) r0
            int r3 = r2.f6998a
            java.lang.String r4 = r2.f6999b
            java.lang.String r5 = r2.f6969f
            int r6 = r2.f6971h
            r0.h(r3, r4, r5, r6)
            java.io.InputStream r0 = r2.f6975l     // Catch:{ IOException -> 0x02df }
            r0.close()     // Catch:{ IOException -> 0x02df }
            goto L_0x02f4
        L_0x02df:
            t5.a r0 = f6991g
            int r3 = r2.f6971h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = r2.f6969f
            java.lang.String r5 = r2.f6999b
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5}
            java.lang.String r4 = "Could not close file for chunk %s of slice %s of pack %s."
            r0.e(r4, r3)
        L_0x02f4:
            int r0 = r2.f6974k
            if (r0 != r12) goto L_0x0322
            t5.y r0 = r1.f6995d
            java.lang.Object r0 = r0.a()
            com.google.android.play.core.assetpacks.y r0 = (com.google.android.play.core.assetpacks.y) r0
            java.lang.String r3 = r2.f6999b
            long r7 = r2.f6973j
            r4 = 3
            r5 = 0
            com.google.android.play.core.assetpacks.h1 r6 = r1.f6996e
            double r9 = r6.b(r3, r2)
            r11 = 1
            java.lang.String r12 = r2.f6968e
            com.google.android.play.core.assetpacks.p2 r6 = r1.f6997f
            java.lang.String r2 = r2.f6999b
            java.lang.String r13 = r6.a(r2)
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            com.google.android.play.core.assetpacks.AssetPackState r2 = com.google.android.play.core.assetpacks.AssetPackState.h(r2, r3, r4, r5, r7, r9, r11, r12, r13)
            r0.j(r2)
        L_0x0322:
            return
        L_0x0323:
            r0 = move-exception
            goto L_0x0329
        L_0x0325:
            r11.close()     // Catch:{ all -> 0x0328 }
        L_0x0328:
            throw r0     // Catch:{ IOException -> 0x0323 }
        L_0x0329:
            t5.a r3 = f6991g
            java.lang.String r4 = r0.getMessage()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "IOException during extraction %s."
            r3.b(r5, r4)
            com.google.android.play.core.assetpacks.d1 r3 = new com.google.android.play.core.assetpacks.d1
            int r4 = r2.f6971h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = r2.f6969f
            java.lang.String r6 = r2.f6999b
            int r7 = r2.f6998a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r7}
            java.lang.String r5 = "Error extracting chunk %s of slice %s of pack %s of session %s."
            java.lang.String r4 = java.lang.String.format(r5, r4)
            int r2 = r2.f6998a
            r3.<init>(r4, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.y0.a(com.google.android.play.core.assetpacks.x0):void");
    }
}
