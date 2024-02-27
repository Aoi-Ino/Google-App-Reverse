package com.pdfview.subsamplincscaleimageview.decoder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import qk.c;
import rk.d;

public class SkiaImageRegionDecoder implements d {

    /* renamed from: a  reason: collision with root package name */
    private BitmapRegionDecoder f22452a;

    /* renamed from: b  reason: collision with root package name */
    private final ReadWriteLock f22453b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap.Config f22454c;

    @Keep
    public SkiaImageRegionDecoder() {
        this((Bitmap.Config) null);
    }

    private Lock e() {
        return this.f22453b.readLock();
    }

    public synchronized boolean a() {
        BitmapRegionDecoder bitmapRegionDecoder;
        bitmapRegionDecoder = this.f22452a;
        return bitmapRegionDecoder != null && !bitmapRegionDecoder.isRecycled();
    }

    public Bitmap b(Rect rect, int i10) {
        e().lock();
        try {
            BitmapRegionDecoder bitmapRegionDecoder = this.f22452a;
            if (bitmapRegionDecoder == null || bitmapRegionDecoder.isRecycled()) {
                throw new IllegalStateException("Cannot decode region after decoder has been recycled");
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i10;
            options.inPreferredConfig = this.f22454c;
            Bitmap decodeRegion = this.f22452a.decodeRegion(rect, options);
            if (decodeRegion != null) {
                e().unlock();
                return decodeRegion;
            }
            throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
        } catch (Throwable th2) {
            e().unlock();
            throw th2;
        }
    }

    public synchronized void c() {
        this.f22453b.writeLock().lock();
        try {
            this.f22452a.recycle();
            this.f22452a = null;
        } finally {
            this.f22453b.writeLock().unlock();
        }
    }

    public Point d(Context context, Uri uri) {
        BitmapRegionDecoder newInstance;
        InputStream open;
        int i10;
        String uri2 = uri.toString();
        if (uri2.startsWith("android.resource://")) {
            String authority = uri.getAuthority();
            Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            if (size != 2 || !pathSegments.get(0).equals("drawable")) {
                if (size == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                    try {
                        i10 = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused) {
                    }
                }
                i10 = 0;
            } else {
                i10 = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            }
            open = context.getResources().openRawResource(i10);
        } else if (uri2.startsWith("file:///android_asset/")) {
            open = context.getAssets().open(uri2.substring(22), 1);
        } else if (uri2.startsWith("file://")) {
            newInstance = BitmapRegionDecoder.newInstance(uri2.substring(7), false);
            this.f22452a = newInstance;
            return new Point(this.f22452a.getWidth(), this.f22452a.getHeight());
        } else {
            InputStream inputStream = null;
            try {
                inputStream = context.getContentResolver().openInputStream(uri);
                this.f22452a = BitmapRegionDecoder.newInstance(inputStream, false);
                return new Point(this.f22452a.getWidth(), this.f22452a.getHeight());
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        newInstance = BitmapRegionDecoder.newInstance(open, false);
        this.f22452a = newInstance;
        return new Point(this.f22452a.getWidth(), this.f22452a.getHeight());
    }

    public SkiaImageRegionDecoder(Bitmap.Config config) {
        this.f22453b = new ReentrantReadWriteLock(true);
        Bitmap.Config preferredBitmapConfig = c.getPreferredBitmapConfig();
        if (config == null) {
            if (preferredBitmapConfig != null) {
                this.f22454c = preferredBitmapConfig;
                return;
            }
            config = Bitmap.Config.RGB_565;
        }
        this.f22454c = config;
    }
}
