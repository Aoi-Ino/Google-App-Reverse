package com.google.android.play.core.assetpacks;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;
import t5.a;

final class b3 {

    /* renamed from: h  reason: collision with root package name */
    private static final a f6626h = new a("SliceMetadataManager");

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f6627a = new byte[8192];

    /* renamed from: b  reason: collision with root package name */
    private final e0 f6628b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6629c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6630d;

    /* renamed from: e  reason: collision with root package name */
    private final long f6631e;

    /* renamed from: f  reason: collision with root package name */
    private final String f6632f;

    /* renamed from: g  reason: collision with root package name */
    private int f6633g;

    b3(e0 e0Var, String str, int i10, long j10, String str2) {
        this.f6628b = e0Var;
        this.f6629c = str;
        this.f6630d = i10;
        this.f6631e = j10;
        this.f6632f = str2;
        this.f6633g = -1;
    }

    private final File n() {
        File B = this.f6628b.B(this.f6629c, this.f6630d, this.f6631e, this.f6632f);
        if (!B.exists()) {
            B.mkdirs();
        }
        return B;
    }

    private final File o() {
        File A = this.f6628b.A(this.f6629c, this.f6630d, this.f6631e, this.f6632f);
        A.getParentFile().mkdirs();
        A.createNewFile();
        return A;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        File A = this.f6628b.A(this.f6629c, this.f6630d, this.f6631e, this.f6632f);
        if (!A.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(A);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new d1("Slice checkpoint file corrupt.");
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final a3 b() {
        File A = this.f6628b.A(this.f6629c, this.f6630d, this.f6631e, this.f6632f);
        if (A.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(A);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new d1("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f6633g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new l0(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e10) {
                    throw new d1("Slice checkpoint file corrupt.", (Exception) e10);
                }
            } catch (Throwable unused) {
            }
        } else {
            throw new d1("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final File c() {
        return new File(n(), String.format("%s-NAM.dat", new Object[]{Integer.valueOf(this.f6633g)}));
    }

    /* access modifiers changed from: package-private */
    public final void d(InputStream inputStream, long j10) {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j10);
            do {
                read = inputStream.read(this.f6627a);
                if (read > 0) {
                    randomAccessFile.write(this.f6627a, 0, read);
                }
            } while (read == 8192);
            randomAccessFile.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void e(long j10, byte[] bArr, int i10, int i11) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j10);
            randomAccessFile.write(bArr, i10, i11);
            randomAccessFile.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void f(int i10) {
        Properties properties = new Properties();
        properties.put("fileStatus", VContant.DUPLICATE_RC_PURPOSE_CODE);
        properties.put("fileOffset", String.valueOf(c().length()));
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f6633g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void g(String str, long j10, long j11, int i10) {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j10));
        properties.put("remainingBytes", String.valueOf(j11));
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f6633g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void h(byte[] bArr, int i10) {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f6633g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File z10 = this.f6628b.z(this.f6629c, this.f6630d, this.f6631e, this.f6632f);
            if (z10.exists()) {
                z10.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(z10);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                return;
            } catch (Throwable unused) {
            }
            throw th;
            throw th;
        } catch (Throwable unused2) {
        }
    }

    /* access modifiers changed from: package-private */
    public final void i(int i10) {
        Properties properties = new Properties();
        properties.put("fileStatus", VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE);
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f6633g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0031 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(byte[] r5) {
        /*
            r4 = this;
            int r0 = r4.f6633g
            int r0 = r0 + 1
            r4.f6633g = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.n()
            int r2 = r4.f6633g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "%s-LFH.dat"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r1, r2)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002b }
            r1.<init>(r0)     // Catch:{ IOException -> 0x002b }
            r1.write(r5)     // Catch:{ all -> 0x002d }
            r1.close()     // Catch:{ IOException -> 0x002b }
            return
        L_0x002b:
            r5 = move-exception
            goto L_0x0032
        L_0x002d:
            r5 = move-exception
            r1.close()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            throw r5     // Catch:{ IOException -> 0x002b }
        L_0x0032:
            com.google.android.play.core.assetpacks.d1 r0 = new com.google.android.play.core.assetpacks.d1
            java.lang.String r1 = "Could not write metadata file."
            r0.<init>((java.lang.String) r1, (java.lang.Exception) r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.b3.j(byte[]):void");
    }

    /* access modifiers changed from: package-private */
    public final void k(byte[] bArr, InputStream inputStream) {
        this.f6633g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f6627a);
            while (read > 0) {
                fileOutputStream.write(this.f6627a, 0, read);
                read = inputStream.read(this.f6627a);
            }
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final void l(byte[] bArr, int i10, int i11) {
        this.f6633g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr, 0, i11);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m() {
        /*
            r6 = this;
            com.google.android.play.core.assetpacks.e0 r0 = r6.f6628b
            java.lang.String r1 = r6.f6629c
            int r2 = r6.f6630d
            long r3 = r6.f6631e
            java.lang.String r5 = r6.f6632f
            java.io.File r0 = r0.A(r1, r2, r3, r5)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 != 0) goto L_0x0016
            return r2
        L_0x0016:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0046 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0046 }
            java.util.Properties r0 = new java.util.Properties     // Catch:{ all -> 0x0048 }
            r0.<init>()     // Catch:{ all -> 0x0048 }
            r0.load(r1)     // Catch:{ all -> 0x0048 }
            r1.close()     // Catch:{ IOException -> 0x0046 }
            java.lang.String r1 = "fileStatus"
            java.lang.String r3 = r0.getProperty(r1)
            if (r3 != 0) goto L_0x0038
            t5.a r0 = f6626h
            java.lang.String r1 = "Slice checkpoint file corrupt while checking if extraction finished."
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r0.b(r1, r3)
            return r2
        L_0x0038:
            java.lang.String r0 = r0.getProperty(r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r1 = 4
            if (r0 != r1) goto L_0x0045
            r0 = 1
            return r0
        L_0x0045:
            return r2
        L_0x0046:
            r0 = move-exception
            goto L_0x004d
        L_0x0048:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0     // Catch:{ IOException -> 0x0046 }
        L_0x004d:
            t5.a r1 = f6626h
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = "Could not read checkpoint while checking if extraction finished. %s"
            r1.b(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.b3.m():boolean");
    }
}
