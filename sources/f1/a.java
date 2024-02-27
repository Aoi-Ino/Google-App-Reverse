package f1;

import android.util.Log;
import cm.g;
import cm.l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0143a f11308e = new C0143a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Map f11309f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f11310a;

    /* renamed from: b  reason: collision with root package name */
    private final File f11311b;

    /* renamed from: c  reason: collision with root package name */
    private final Lock f11312c;

    /* renamed from: d  reason: collision with root package name */
    private FileChannel f11313d;

    /* renamed from: f1.a$a  reason: collision with other inner class name */
    public static final class C0143a {
        private C0143a() {
        }

        public /* synthetic */ C0143a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final Lock b(String str) {
            Lock lock;
            synchronized (a.f11309f) {
                try {
                    Map a10 = a.f11309f;
                    Object obj = a10.get(str);
                    if (obj == null) {
                        obj = new ReentrantLock();
                        a10.put(str, obj);
                    }
                    lock = (Lock) obj;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lock;
        }
    }

    public a(String str, File file, boolean z10) {
        l.f(str, "name");
        l.f(file, "lockDir");
        this.f11310a = z10;
        File file2 = new File(file, str + ".lck");
        this.f11311b = file2;
        C0143a aVar = f11308e;
        String absolutePath = file2.getAbsolutePath();
        l.e(absolutePath, "lockFile.absolutePath");
        this.f11312c = aVar.b(absolutePath);
    }

    public static /* synthetic */ void c(a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f11310a;
        }
        aVar.b(z10);
    }

    public final void b(boolean z10) {
        this.f11312c.lock();
        if (z10) {
            try {
                File parentFile = this.f11311b.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f11311b).getChannel();
                channel.lock();
                this.f11313d = channel;
            } catch (IOException e10) {
                this.f11313d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f11313d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f11312c.unlock();
    }
}
