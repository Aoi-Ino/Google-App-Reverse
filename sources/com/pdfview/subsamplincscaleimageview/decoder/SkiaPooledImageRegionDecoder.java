package com.pdfview.subsamplincscaleimageview.decoder;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Keep;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import qk.c;
import rk.d;

public class SkiaPooledImageRegionDecoder implements d {

    /* renamed from: i  reason: collision with root package name */
    private static final String f22455i = "SkiaPooledImageRegionDecoder";

    /* renamed from: j  reason: collision with root package name */
    private static boolean f22456j = false;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public b f22457a;

    /* renamed from: b  reason: collision with root package name */
    private final ReadWriteLock f22458b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap.Config f22459c;

    /* renamed from: d  reason: collision with root package name */
    private Context f22460d;

    /* renamed from: e  reason: collision with root package name */
    private Uri f22461e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public long f22462f;

    /* renamed from: g  reason: collision with root package name */
    private final Point f22463g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f22464h;

    class a extends Thread {
        a() {
        }

        public void run() {
            while (SkiaPooledImageRegionDecoder.this.f22457a != null) {
                SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder = SkiaPooledImageRegionDecoder.this;
                if (skiaPooledImageRegionDecoder.i(skiaPooledImageRegionDecoder.f22457a.n(), SkiaPooledImageRegionDecoder.this.f22462f)) {
                    try {
                        if (SkiaPooledImageRegionDecoder.this.f22457a != null) {
                            long currentTimeMillis = System.currentTimeMillis();
                            SkiaPooledImageRegionDecoder.this.j("Starting decoder");
                            SkiaPooledImageRegionDecoder.this.l();
                            long currentTimeMillis2 = System.currentTimeMillis();
                            SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder2 = SkiaPooledImageRegionDecoder.this;
                            skiaPooledImageRegionDecoder2.j("Started decoder, took " + (currentTimeMillis2 - currentTimeMillis) + "ms");
                        }
                    } catch (Exception e10) {
                        SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder3 = SkiaPooledImageRegionDecoder.this;
                        skiaPooledImageRegionDecoder3.j("Failed to start decoder: " + e10.getMessage());
                    }
                } else {
                    return;
                }
            }
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Semaphore f22466a;

        /* renamed from: b  reason: collision with root package name */
        private final Map f22467b;

        private b() {
            this.f22466a = new Semaphore(0, true);
            this.f22467b = new ConcurrentHashMap();
        }

        /* access modifiers changed from: private */
        public BitmapRegionDecoder g() {
            this.f22466a.acquireUninterruptibly();
            return i();
        }

        /* access modifiers changed from: private */
        public synchronized void h(BitmapRegionDecoder bitmapRegionDecoder) {
            this.f22467b.put(bitmapRegionDecoder, Boolean.FALSE);
            this.f22466a.release();
        }

        private synchronized BitmapRegionDecoder i() {
            for (Map.Entry entry : this.f22467b.entrySet()) {
                if (!((Boolean) entry.getValue()).booleanValue()) {
                    entry.setValue(Boolean.TRUE);
                    return (BitmapRegionDecoder) entry.getKey();
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public synchronized boolean j() {
            return this.f22467b.isEmpty();
        }

        private synchronized boolean k(BitmapRegionDecoder bitmapRegionDecoder) {
            for (Map.Entry entry : this.f22467b.entrySet()) {
                if (bitmapRegionDecoder == entry.getKey()) {
                    if (!((Boolean) entry.getValue()).booleanValue()) {
                        return false;
                    }
                    entry.setValue(Boolean.FALSE);
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        public synchronized void l() {
            while (!this.f22467b.isEmpty()) {
                BitmapRegionDecoder g10 = g();
                g10.recycle();
                this.f22467b.remove(g10);
            }
        }

        /* access modifiers changed from: private */
        public void m(BitmapRegionDecoder bitmapRegionDecoder) {
            if (k(bitmapRegionDecoder)) {
                this.f22466a.release();
            }
        }

        /* access modifiers changed from: private */
        public synchronized int n() {
            return this.f22467b.size();
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    @Keep
    public SkiaPooledImageRegionDecoder() {
        this((Bitmap.Config) null);
    }

    /* access modifiers changed from: private */
    public void j(String str) {
        if (f22456j) {
            Log.d(f22455i, str);
        }
    }

    private int k() {
        return Runtime.getRuntime().availableProcessors();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0123 A[Catch:{ all -> 0x0127 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l() {
        /*
            r10 = this;
            android.net.Uri r0 = r10.f22461e
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "android.resource://"
            boolean r1 = r0.startsWith(r1)
            r2 = 1
            r3 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 == 0) goto L_0x0096
            android.net.Uri r0 = r10.f22461e
            java.lang.String r0 = r0.getAuthority()
            android.content.Context r1 = r10.f22460d
            java.lang.String r1 = r1.getPackageName()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x002e
            android.content.Context r1 = r10.f22460d
            android.content.res.Resources r1 = r1.getResources()
            goto L_0x0038
        L_0x002e:
            android.content.Context r1 = r10.f22460d
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.res.Resources r1 = r1.getResourcesForApplication(r0)
        L_0x0038:
            android.net.Uri r6 = r10.f22461e
            java.util.List r6 = r6.getPathSegments()
            int r7 = r6.size()
            r8 = 2
            if (r7 != r8) goto L_0x005e
            java.lang.Object r8 = r6.get(r3)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "drawable"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x005e
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r1.getIdentifier(r2, r9, r0)
            goto L_0x0078
        L_0x005e:
            if (r7 != r2) goto L_0x0077
            java.lang.Object r0 = r6.get(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isDigitsOnly(r0)
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r6.get(r3)     // Catch:{ NumberFormatException -> 0x0077 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x0077 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0077 }
            goto L_0x0078
        L_0x0077:
            r0 = r3
        L_0x0078:
            android.content.Context r1 = r10.f22460d     // Catch:{ Exception -> 0x0086 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ Exception -> 0x0086 }
            android.content.res.AssetFileDescriptor r1 = r1.openRawResourceFd(r0)     // Catch:{ Exception -> 0x0086 }
            long r4 = r1.getLength()     // Catch:{ Exception -> 0x0086 }
        L_0x0086:
            android.content.Context r1 = r10.f22460d
            android.content.res.Resources r1 = r1.getResources()
            java.io.InputStream r0 = r1.openRawResource(r0)
        L_0x0090:
            android.graphics.BitmapRegionDecoder r0 = android.graphics.BitmapRegionDecoder.newInstance(r0, r3)
            goto L_0x0107
        L_0x0096:
            java.lang.String r1 = "file:///android_asset/"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x00bd
            r1 = 22
            java.lang.String r0 = r0.substring(r1)
            android.content.Context r1 = r10.f22460d     // Catch:{ Exception -> 0x00b2 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ Exception -> 0x00b2 }
            android.content.res.AssetFileDescriptor r1 = r1.openFd(r0)     // Catch:{ Exception -> 0x00b2 }
            long r4 = r1.getLength()     // Catch:{ Exception -> 0x00b2 }
        L_0x00b2:
            android.content.Context r1 = r10.f22460d
            android.content.res.AssetManager r1 = r1.getAssets()
            java.io.InputStream r0 = r1.open(r0, r2)
            goto L_0x0090
        L_0x00bd:
            java.lang.String r1 = "file://"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x00df
            r1 = 7
            java.lang.String r1 = r0.substring(r1)
            android.graphics.BitmapRegionDecoder r1 = android.graphics.BitmapRegionDecoder.newInstance(r1, r3)
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00dd }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00dd }
            boolean r0 = r2.exists()     // Catch:{ Exception -> 0x00dd }
            if (r0 == 0) goto L_0x00dd
            long r4 = r2.length()     // Catch:{ Exception -> 0x00dd }
        L_0x00dd:
            r0 = r1
            goto L_0x0107
        L_0x00df:
            r0 = 0
            android.content.Context r1 = r10.f22460d     // Catch:{ all -> 0x00ff }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x00ff }
            android.net.Uri r2 = r10.f22461e     // Catch:{ all -> 0x00ff }
            java.io.InputStream r0 = r1.openInputStream(r2)     // Catch:{ all -> 0x00ff }
            android.graphics.BitmapRegionDecoder r2 = android.graphics.BitmapRegionDecoder.newInstance(r0, r3)     // Catch:{ all -> 0x00ff }
            android.net.Uri r3 = r10.f22461e     // Catch:{ Exception -> 0x0101 }
            java.lang.String r6 = "r"
            android.content.res.AssetFileDescriptor r1 = r1.openAssetFileDescriptor(r3, r6)     // Catch:{ Exception -> 0x0101 }
            if (r1 == 0) goto L_0x0101
            long r4 = r1.getLength()     // Catch:{ Exception -> 0x0101 }
            goto L_0x0101
        L_0x00ff:
            r1 = move-exception
            goto L_0x013d
        L_0x0101:
            if (r0 == 0) goto L_0x0106
            r0.close()     // Catch:{ Exception -> 0x0106 }
        L_0x0106:
            r0 = r2
        L_0x0107:
            r10.f22462f = r4
            android.graphics.Point r1 = r10.f22463g
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            r1.set(r2, r3)
            java.util.concurrent.locks.ReadWriteLock r1 = r10.f22458b
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.lock()
            com.pdfview.subsamplincscaleimageview.decoder.SkiaPooledImageRegionDecoder$b r1 = r10.f22457a     // Catch:{ all -> 0x0127 }
            if (r1 == 0) goto L_0x0129
            r1.h(r0)     // Catch:{ all -> 0x0127 }
            goto L_0x0129
        L_0x0127:
            r0 = move-exception
            goto L_0x0133
        L_0x0129:
            java.util.concurrent.locks.ReadWriteLock r0 = r10.f22458b
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            return
        L_0x0133:
            java.util.concurrent.locks.ReadWriteLock r1 = r10.f22458b
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            throw r0
        L_0x013d:
            if (r0 == 0) goto L_0x0142
            r0.close()     // Catch:{ Exception -> 0x0142 }
        L_0x0142:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pdfview.subsamplincscaleimageview.decoder.SkiaPooledImageRegionDecoder.l():void");
    }

    private boolean m() {
        ActivityManager activityManager = (ActivityManager) this.f22460d.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    private void n() {
        if (this.f22464h.compareAndSet(false, true) && this.f22462f < Long.MAX_VALUE) {
            j("Starting lazy init of additional decoders");
            new a().start();
        }
    }

    @Keep
    public static void setDebug(boolean z10) {
        f22456j = z10;
    }

    public synchronized boolean a() {
        b bVar;
        bVar = this.f22457a;
        return bVar != null && !bVar.j();
    }

    public Bitmap b(Rect rect, int i10) {
        BitmapRegionDecoder d10;
        j("Decode region " + rect + " on thread " + Thread.currentThread().getName());
        if (rect.width() < this.f22463g.x || rect.height() < this.f22463g.y) {
            n();
        }
        this.f22458b.readLock().lock();
        try {
            b bVar = this.f22457a;
            if (bVar != null) {
                d10 = bVar.g();
                if (d10 != null) {
                    if (!d10.isRecycled()) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = i10;
                        options.inPreferredConfig = this.f22459c;
                        Bitmap decodeRegion = d10.decodeRegion(rect, options);
                        if (decodeRegion != null) {
                            this.f22457a.m(d10);
                            this.f22458b.readLock().unlock();
                            return decodeRegion;
                        }
                        throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
                    }
                }
                if (d10 != null) {
                    this.f22457a.m(d10);
                }
            }
            throw new IllegalStateException("Cannot decode region after decoder has been recycled");
        } catch (Throwable th2) {
            this.f22458b.readLock().unlock();
            throw th2;
        }
    }

    public synchronized void c() {
        this.f22458b.writeLock().lock();
        try {
            b bVar = this.f22457a;
            if (bVar != null) {
                bVar.l();
                this.f22457a = null;
                this.f22460d = null;
                this.f22461e = null;
            }
        } finally {
            this.f22458b.writeLock().unlock();
        }
    }

    public Point d(Context context, Uri uri) {
        this.f22460d = context;
        this.f22461e = uri;
        l();
        return this.f22463g;
    }

    /* access modifiers changed from: protected */
    public boolean i(int i10, long j10) {
        String str;
        if (i10 >= 4) {
            str = "No additional decoders allowed, reached hard limit (4)";
        } else {
            long j11 = ((long) i10) * j10;
            if (j11 > 20971520) {
                str = "No additional encoders allowed, reached hard memory limit (20Mb)";
            } else if (i10 >= k()) {
                str = "No additional encoders allowed, limited by CPU cores (" + k() + ")";
            } else if (m()) {
                str = "No additional encoders allowed, memory is low";
            } else {
                j("Additional decoder allowed, current count is " + i10 + ", estimated native memory " + (j11 / 1048576) + "Mb");
                return true;
            }
        }
        j(str);
        return false;
    }

    public SkiaPooledImageRegionDecoder(Bitmap.Config config) {
        this.f22457a = new b((a) null);
        this.f22458b = new ReentrantReadWriteLock(true);
        this.f22462f = Long.MAX_VALUE;
        this.f22463g = new Point(0, 0);
        this.f22464h = new AtomicBoolean(false);
        Bitmap.Config preferredBitmapConfig = c.getPreferredBitmapConfig();
        if (config == null) {
            if (preferredBitmapConfig != null) {
                this.f22459c = preferredBitmapConfig;
                return;
            }
            config = Bitmap.Config.RGB_565;
        }
        this.f22459c = config;
    }
}
