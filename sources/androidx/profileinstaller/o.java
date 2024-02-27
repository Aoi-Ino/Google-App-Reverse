package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    private static final androidx.concurrent.futures.c f3486a = androidx.concurrent.futures.c.s();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f3487b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static c f3488c = null;

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0));
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f3489a;

        /* renamed from: b  reason: collision with root package name */
        final int f3490b;

        /* renamed from: c  reason: collision with root package name */
        final long f3491c;

        /* renamed from: d  reason: collision with root package name */
        final long f3492d;

        b(int i10, int i11, long j10, long j11) {
            this.f3489a = i10;
            this.f3490b = i11;
            this.f3491c = j10;
            this.f3492d = j11;
        }

        static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        public void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f3489a);
                dataOutputStream.writeInt(this.f3490b);
                dataOutputStream.writeLong(this.f3491c);
                dataOutputStream.writeLong(this.f3492d);
                dataOutputStream.close();
                return;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3490b == bVar.f3490b && this.f3491c == bVar.f3491c && this.f3489a == bVar.f3489a && this.f3492d == bVar.f3492d;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f3490b), Long.valueOf(this.f3491c), Integer.valueOf(this.f3489a), Long.valueOf(this.f3492d)});
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final int f3493a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f3494b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f3495c;

        c(int i10, boolean z10, boolean z11) {
            this.f3493a = i10;
            this.f3495c = z11;
            this.f3494b = z10;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return (Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context) : packageManager.getPackageInfo(context.getPackageName(), 0)).lastUpdateTime;
    }

    private static c b(int i10, boolean z10, boolean z11) {
        c cVar = new c(i10, z10, z11);
        f3488c = cVar;
        f3486a.o(cVar);
        return f3488c;
    }

    static c c(Context context, boolean z10) {
        boolean z11;
        boolean z12;
        b bVar;
        c cVar;
        if (!z10 && (cVar = f3488c) != null) {
            return cVar;
        }
        synchronized (f3487b) {
            if (!z10) {
                try {
                    c cVar2 = f3488c;
                    if (cVar2 != null) {
                        return cVar2;
                    }
                } catch (IOException unused) {
                    return b(131072, z11, z12);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int i10 = Build.VERSION.SDK_INT;
            int i11 = 0;
            if (i10 >= 28) {
                if (i10 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    z11 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    z12 = file2.exists() && length2 > 0;
                    try {
                        long a10 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        b a11 = file3.exists() ? b.a(file3) : null;
                        if (a11 != null && a11.f3491c == a10) {
                            int i12 = a11.f3490b;
                            if (i12 != 2) {
                                i11 = i12;
                                if (z10 && z12 && i11 != 1) {
                                    i11 = 2;
                                }
                                if (a11 != null && a11.f3490b == 2 && i11 == 1 && length < a11.f3492d) {
                                    i11 = 3;
                                }
                                bVar = new b(1, i11, a10, length2);
                                if (a11 == null || !a11.equals(bVar)) {
                                    bVar.b(file3);
                                }
                                c b10 = b(i11, z11, z12);
                                return b10;
                            }
                        }
                        if (z11) {
                            i11 = 1;
                        } else if (z12) {
                            i11 = 2;
                        }
                        i11 = 2;
                        i11 = 3;
                        bVar = new b(1, i11, a10, length2);
                        try {
                            bVar.b(file3);
                        } catch (IOException unused2) {
                            i11 = 196608;
                        }
                        c b102 = b(i11, z11, z12);
                        return b102;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        return b(65536, z11, z12);
                    }
                }
            }
            c b11 = b(262144, false, false);
            return b11;
        }
    }
}
