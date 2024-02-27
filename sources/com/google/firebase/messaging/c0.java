package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p4.i;
import p4.j;
import s3.o;

public class c0 implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    private final URL f7472e;

    /* renamed from: f  reason: collision with root package name */
    private volatile Future f7473f;

    /* renamed from: g  reason: collision with root package name */
    private i f7474g;

    private c0(URL url) {
        this.f7472e = url;
    }

    private byte[] f() {
        URLConnection openConnection = this.f7472e.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d10 = b.d(b.b(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + d10.length + " bytes from " + this.f7472e);
                }
                if (d10.length <= 1048576) {
                    return d10;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public static c0 g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new c0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(j jVar) {
        try {
            jVar.c(e());
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    public void close() {
        this.f7473f.cancel(true);
    }

    public Bitmap e() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f7472e);
        }
        byte[] f10 = f();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(f10, 0, f10.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f7472e);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f7472e);
    }

    public i h() {
        return (i) o.i(this.f7474g);
    }

    public void n(ExecutorService executorService) {
        j jVar = new j();
        this.f7473f = executorService.submit(new b0(this, jVar));
        this.f7474g = jVar.a();
    }
}
