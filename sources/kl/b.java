package kl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import jl.c;

public class b extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    private final Context f24730a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f24731b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f24732c;

    /* renamed from: d  reason: collision with root package name */
    private final int f24733d;

    /* renamed from: e  reason: collision with root package name */
    private final int f24734e;

    /* renamed from: f  reason: collision with root package name */
    private final il.b f24735f;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        Bitmap f24736a;

        /* renamed from: b  reason: collision with root package name */
        c f24737b;

        /* renamed from: c  reason: collision with root package name */
        Exception f24738c;

        public a(Bitmap bitmap, c cVar) {
            this.f24736a = bitmap;
            this.f24737b = cVar;
        }

        public a(Exception exc) {
            this.f24738c = exc;
        }
    }

    public b(Context context, Uri uri, Uri uri2, int i10, int i11, il.b bVar) {
        this.f24730a = context;
        this.f24731b = uri;
        this.f24732c = uri2;
        this.f24733d = i10;
        this.f24734e = i11;
        this.f24735f = bVar;
    }

    private boolean a(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap == null || bitmap.getByteCount() <= 104857600) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    private void b(Uri uri, Uri uri2) {
        InputStream inputStream;
        Log.d("BitmapWorkerTask", "copyFile");
        if (uri2 != null) {
            FileOutputStream fileOutputStream = null;
            try {
                inputStream = this.f24730a.getContentResolver().openInputStream(uri);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(new File(uri2.getPath()));
                    if (inputStream != null) {
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read > 0) {
                                    fileOutputStream2.write(bArr, 0, read);
                                } else {
                                    ll.a.c(fileOutputStream2);
                                    ll.a.c(inputStream);
                                    this.f24731b = this.f24732c;
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            ll.a.c(fileOutputStream);
                            ll.a.c(inputStream);
                            this.f24731b = this.f24732c;
                            throw th;
                        }
                    } else {
                        throw new NullPointerException("InputStream for given input Uri is null");
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ll.a.c(fileOutputStream);
                    ll.a.c(inputStream);
                    this.f24731b = this.f24732c;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                ll.a.c(fileOutputStream);
                ll.a.c(inputStream);
                this.f24731b = this.f24732c;
                throw th;
            }
        } else {
            throw new NullPointerException("Output Uri is null - cannot copy image");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(android.net.Uri r6, android.net.Uri r7) {
        /*
            r5 = this;
            java.lang.String r0 = "BitmapWorkerTask"
            java.lang.String r1 = "downloadFile"
            android.util.Log.d(r0, r1)
            if (r7 == 0) goto L_0x008c
            um.z r0 = new um.z
            r0.<init>()
            r1 = 0
            um.b0$a r2 = new um.b0$a     // Catch:{ all -> 0x006e }
            r2.<init>()     // Catch:{ all -> 0x006e }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x006e }
            um.b0$a r6 = r2.h(r6)     // Catch:{ all -> 0x006e }
            um.b0 r6 = r6.b()     // Catch:{ all -> 0x006e }
            um.e r6 = r0.a(r6)     // Catch:{ all -> 0x006e }
            um.d0 r6 = r6.execute()     // Catch:{ all -> 0x006e }
            um.e0 r2 = r6.c()     // Catch:{ all -> 0x006a }
            in.g r2 = r2.source()     // Catch:{ all -> 0x006a }
            android.content.Context r3 = r5.f24730a     // Catch:{ all -> 0x005c }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x005c }
            java.io.OutputStream r7 = r3.openOutputStream(r7)     // Catch:{ all -> 0x005c }
            if (r7 == 0) goto L_0x0062
            in.y r1 = in.o.d(r7)     // Catch:{ all -> 0x005c }
            r2.L(r1)     // Catch:{ all -> 0x005c }
            ll.a.c(r2)
            ll.a.c(r1)
            um.e0 r6 = r6.c()
            ll.a.c(r6)
            um.p r6 = r0.m()
            r6.a()
            android.net.Uri r6 = r5.f24732c
            r5.f24731b = r6
            return
        L_0x005c:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r1
            r1 = r4
            goto L_0x0071
        L_0x0062:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "OutputStream for given output Uri is null"
            r7.<init>(r3)     // Catch:{ all -> 0x005c }
            throw r7     // Catch:{ all -> 0x005c }
        L_0x006a:
            r7 = move-exception
            r2 = r6
            r6 = r1
            goto L_0x0071
        L_0x006e:
            r7 = move-exception
            r6 = r1
            r2 = r6
        L_0x0071:
            ll.a.c(r1)
            ll.a.c(r6)
            if (r2 == 0) goto L_0x0080
            um.e0 r6 = r2.c()
            ll.a.c(r6)
        L_0x0080:
            um.p r6 = r0.m()
            r6.a()
            android.net.Uri r6 = r5.f24732c
            r5.f24731b = r6
            throw r7
        L_0x008c:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "Output Uri is null - cannot download image"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kl.b.d(android.net.Uri, android.net.Uri):void");
    }

    private void f() {
        String scheme = this.f24731b.getScheme();
        Log.d("BitmapWorkerTask", "Uri scheme: " + scheme);
        if ("http".equals(scheme) || "https".equals(scheme)) {
            try {
                d(this.f24731b, this.f24732c);
            } catch (IOException | NullPointerException e10) {
                Log.e("BitmapWorkerTask", "Downloading failed", e10);
                throw e10;
            }
        } else if ("content".equals(scheme)) {
            try {
                b(this.f24731b, this.f24732c);
            } catch (IOException | NullPointerException e11) {
                Log.e("BitmapWorkerTask", "Copying failed", e11);
                throw e11;
            }
        } else if (!"file".equals(scheme)) {
            Log.e("BitmapWorkerTask", "Invalid Uri scheme " + scheme);
            throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public a doInBackground(Void... voidArr) {
        InputStream openInputStream;
        if (this.f24731b == null) {
            return new a(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            f();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = ll.a.a(options, this.f24733d, this.f24734e);
            boolean z10 = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmap = null;
            while (!z10) {
                try {
                    openInputStream = this.f24730a.getContentResolver().openInputStream(this.f24731b);
                    bitmap = BitmapFactory.decodeStream(openInputStream, (Rect) null, options);
                    if (options.outWidth == -1 || options.outHeight == -1) {
                        a aVar = new a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.f24731b + "]"));
                        ll.a.c(openInputStream);
                        return aVar;
                    }
                    ll.a.c(openInputStream);
                    if (!a(bitmap, options)) {
                        z10 = true;
                    }
                } catch (OutOfMemoryError e10) {
                    Log.e("BitmapWorkerTask", "doInBackground: BitmapFactory.decodeFileDescriptor: ", e10);
                    options.inSampleSize *= 2;
                } catch (IOException e11) {
                    Log.e("BitmapWorkerTask", "doInBackground: ImageDecoder.createSource: ", e11);
                    return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f24731b + "]", e11));
                } catch (Throwable th2) {
                    ll.a.c(openInputStream);
                    throw th2;
                }
            }
            if (bitmap == null) {
                return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f24731b + "]"));
            }
            int g10 = ll.a.g(this.f24730a, this.f24731b);
            int e12 = ll.a.e(g10);
            int f10 = ll.a.f(g10);
            c cVar = new c(g10, e12, f10);
            Matrix matrix = new Matrix();
            if (e12 != 0) {
                matrix.preRotate((float) e12);
            }
            if (f10 != 1) {
                matrix.postScale((float) f10, 1.0f);
            }
            return !matrix.isIdentity() ? new a(ll.a.h(bitmap, matrix), cVar) : new a(bitmap, cVar);
        } catch (IOException | NullPointerException e13) {
            return new a(e13);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void onPostExecute(a aVar) {
        Exception exc = aVar.f24738c;
        if (exc == null) {
            il.b bVar = this.f24735f;
            Bitmap bitmap = aVar.f24736a;
            c cVar = aVar.f24737b;
            String path = this.f24731b.getPath();
            Uri uri = this.f24732c;
            bVar.b(bitmap, cVar, path, uri == null ? null : uri.getPath());
            return;
        }
        this.f24735f.a(exc);
    }
}
