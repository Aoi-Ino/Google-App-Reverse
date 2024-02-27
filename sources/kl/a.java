package kl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import jl.b;
import jl.c;
import jl.d;
import ll.e;
import ll.f;

public class a extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f24712a;

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f24713b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f24714c;

    /* renamed from: d  reason: collision with root package name */
    private final RectF f24715d;

    /* renamed from: e  reason: collision with root package name */
    private float f24716e;

    /* renamed from: f  reason: collision with root package name */
    private float f24717f;

    /* renamed from: g  reason: collision with root package name */
    private final int f24718g;

    /* renamed from: h  reason: collision with root package name */
    private final int f24719h;

    /* renamed from: i  reason: collision with root package name */
    private final Bitmap.CompressFormat f24720i;

    /* renamed from: j  reason: collision with root package name */
    private final int f24721j;

    /* renamed from: k  reason: collision with root package name */
    private final String f24722k;

    /* renamed from: l  reason: collision with root package name */
    private final String f24723l;

    /* renamed from: m  reason: collision with root package name */
    private final c f24724m;

    /* renamed from: n  reason: collision with root package name */
    private final il.a f24725n;

    /* renamed from: o  reason: collision with root package name */
    private int f24726o;

    /* renamed from: p  reason: collision with root package name */
    private int f24727p;

    /* renamed from: q  reason: collision with root package name */
    private int f24728q;

    /* renamed from: r  reason: collision with root package name */
    private int f24729r;

    public a(Context context, Bitmap bitmap, d dVar, b bVar, il.a aVar) {
        this.f24712a = new WeakReference(context);
        this.f24713b = bitmap;
        this.f24714c = dVar.a();
        this.f24715d = dVar.c();
        this.f24716e = dVar.d();
        this.f24717f = dVar.b();
        this.f24718g = bVar.f();
        this.f24719h = bVar.g();
        this.f24720i = bVar.a();
        this.f24721j = bVar.b();
        this.f24722k = bVar.d();
        this.f24723l = bVar.e();
        this.f24724m = bVar.c();
        this.f24725n = aVar;
    }

    private boolean a() {
        if (this.f24718g > 0 && this.f24719h > 0) {
            float width = this.f24714c.width() / this.f24716e;
            float height = this.f24714c.height() / this.f24716e;
            int i10 = this.f24718g;
            if (width > ((float) i10) || height > ((float) this.f24719h)) {
                float min = Math.min(((float) i10) / width, ((float) this.f24719h) / height);
                Bitmap bitmap = this.f24713b;
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(((float) bitmap.getWidth()) * min), Math.round(((float) this.f24713b.getHeight()) * min), false);
                Bitmap bitmap2 = this.f24713b;
                if (bitmap2 != createScaledBitmap) {
                    bitmap2.recycle();
                }
                this.f24713b = createScaledBitmap;
                this.f24716e /= min;
            }
        }
        if (this.f24717f != 0.0f) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.f24717f, (float) (this.f24713b.getWidth() / 2), (float) (this.f24713b.getHeight() / 2));
            Bitmap bitmap3 = this.f24713b;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap3, 0, 0, bitmap3.getWidth(), this.f24713b.getHeight(), matrix, true);
            Bitmap bitmap4 = this.f24713b;
            if (bitmap4 != createBitmap) {
                bitmap4.recycle();
            }
            this.f24713b = createBitmap;
        }
        this.f24728q = Math.round((this.f24714c.left - this.f24715d.left) / this.f24716e);
        this.f24729r = Math.round((this.f24714c.top - this.f24715d.top) / this.f24716e);
        this.f24726o = Math.round(this.f24714c.width() / this.f24716e);
        int round = Math.round(this.f24714c.height() / this.f24716e);
        this.f24727p = round;
        boolean e10 = e(this.f24726o, round);
        Log.i("BitmapCropTask", "Should crop: " + e10);
        if (e10) {
            l0.a aVar = new l0.a(this.f24722k);
            d(Bitmap.createBitmap(this.f24713b, this.f24728q, this.f24729r, this.f24726o, this.f24727p));
            if (!this.f24720i.equals(Bitmap.CompressFormat.JPEG)) {
                return true;
            }
            f.b(aVar, this.f24726o, this.f24727p, this.f24723l);
            return true;
        }
        e.a(this.f24722k, this.f24723l);
        return false;
    }

    private void d(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (((Context) this.f24712a.get()) != null) {
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(this.f24723l), false);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(this.f24720i, this.f24721j, byteArrayOutputStream);
                        fileOutputStream2.write(byteArrayOutputStream.toByteArray());
                        bitmap.recycle();
                        ll.a.c(fileOutputStream2);
                    } catch (IOException e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        try {
                            Log.e("BitmapCropTask", e.getLocalizedMessage());
                            ll.a.c(fileOutputStream);
                            ll.a.c(byteArrayOutputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            ll.a.c(fileOutputStream);
                            ll.a.c(byteArrayOutputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = fileOutputStream2;
                        ll.a.c(fileOutputStream);
                        ll.a.c(byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException e11) {
                    e = e11;
                    byteArrayOutputStream = null;
                    fileOutputStream = fileOutputStream2;
                    Log.e("BitmapCropTask", e.getLocalizedMessage());
                    ll.a.c(fileOutputStream);
                    ll.a.c(byteArrayOutputStream);
                } catch (Throwable th4) {
                    th = th4;
                    byteArrayOutputStream = null;
                    fileOutputStream = fileOutputStream2;
                    ll.a.c(fileOutputStream);
                    ll.a.c(byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
                byteArrayOutputStream = null;
                Log.e("BitmapCropTask", e.getLocalizedMessage());
                ll.a.c(fileOutputStream);
                ll.a.c(byteArrayOutputStream);
            } catch (Throwable th5) {
                th = th5;
                byteArrayOutputStream = null;
                ll.a.c(fileOutputStream);
                ll.a.c(byteArrayOutputStream);
                throw th;
            }
            ll.a.c(byteArrayOutputStream);
        }
    }

    private boolean e(int i10, int i11) {
        int round = Math.round(((float) Math.max(i10, i11)) / 1000.0f) + 1;
        if (this.f24718g > 0 && this.f24719h > 0) {
            return true;
        }
        float f10 = (float) round;
        return Math.abs(this.f24714c.left - this.f24715d.left) > f10 || Math.abs(this.f24714c.top - this.f24715d.top) > f10 || Math.abs(this.f24714c.bottom - this.f24715d.bottom) > f10 || Math.abs(this.f24714c.right - this.f24715d.right) > f10 || this.f24717f != 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.f24713b;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.f24715d.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        try {
            a();
            this.f24713b = null;
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void onPostExecute(Throwable th2) {
        il.a aVar = this.f24725n;
        if (aVar == null) {
            return;
        }
        if (th2 == null) {
            this.f24725n.b(Uri.fromFile(new File(this.f24723l)), this.f24728q, this.f24729r, this.f24726o, this.f24727p);
            return;
        }
        aVar.a(th2);
    }
}
