package w2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import cm.g;
import cm.l;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import java.io.File;
import java.util.List;
import pl.o;
import x2.e;

public final class c extends a {

    /* renamed from: f  reason: collision with root package name */
    private static final String f17842f = c.class.getSimpleName();

    /* renamed from: g  reason: collision with root package name */
    public static final a f17843g = new a((g) null);

    /* renamed from: b  reason: collision with root package name */
    private final int f17844b;

    /* renamed from: c  reason: collision with root package name */
    private final int f17845c;

    /* renamed from: d  reason: collision with root package name */
    private final long f17846d;

    /* renamed from: e  reason: collision with root package name */
    private final File f17847e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public static final class b extends AsyncTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f17848a;

        b(c cVar) {
            this.f17848a = cVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public File doInBackground(Uri... uriArr) {
            l.f(uriArr, "params");
            File k10 = e.f18194a.k(this.f17848a, uriArr[0]);
            if (k10 != null) {
                return this.f17848a.r(k10);
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(File file) {
            super.onPostExecute(file);
            if (file != null) {
                this.f17848a.m(file);
            } else {
                this.f17848a.d(t2.e.error_failed_to_compress_image);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(ImagePickerActivity imagePickerActivity) {
        super(imagePickerActivity);
        l.f(imagePickerActivity, "activity");
        Intent intent = imagePickerActivity.getIntent();
        l.e(intent, "activity.intent");
        Bundle extras = intent.getExtras();
        extras = extras == null ? new Bundle() : extras;
        l.e(extras, "activity.intent.extras ?: Bundle()");
        this.f17844b = extras.getInt("extra.max_width", 0);
        this.f17845c = extras.getInt("extra.max_height", 0);
        this.f17846d = extras.getLong("extra.image_max_size", 0);
        this.f17847e = b(extras.getString("extra.save_directory"));
    }

    private final File i(File file, int i10) {
        int i11;
        List q10 = q();
        if (i10 >= q10.size()) {
            return null;
        }
        int[] iArr = (int[]) q10.get(i10);
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = this.f17844b;
        if (i14 > 0 && (i11 = this.f17845c) > 0 && (i12 > i14 || i13 > i11)) {
            i12 = i14;
            i13 = i11;
        }
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        String absolutePath = file.getAbsolutePath();
        l.e(absolutePath, "file.absolutePath");
        if (p.n(absolutePath, ".png", false, 2, (Object) null)) {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        e eVar = e.f18194a;
        File f10 = eVar.f(this.f17847e, eVar.e(file));
        if (f10 == null) {
            return null;
        }
        String absolutePath2 = f10.getAbsolutePath();
        l.e(absolutePath2, "compressFile.absolutePath");
        return x2.g.f18196a.c(file, (float) i12, (float) i13, compressFormat2, absolutePath2);
    }

    private final long k(Uri uri) {
        return e.f18194a.j(this, uri) - this.f17846d;
    }

    private final long l(File file) {
        return file.length() - this.f17846d;
    }

    /* access modifiers changed from: private */
    public final void m(File file) {
        ImagePickerActivity a10 = a();
        Uri fromFile = Uri.fromFile(file);
        l.e(fromFile, "Uri.fromFile(file)");
        a10.g1(fromFile);
    }

    private final boolean n() {
        return this.f17846d > 0;
    }

    private final boolean p(File file) {
        boolean z10 = n() && l(file) > 0;
        if (z10 || this.f17844b <= 0 || this.f17845c <= 0) {
            return z10;
        }
        o i10 = e.f18194a.i(file);
        return ((Number) i10.c()).intValue() > this.f17844b || ((Number) i10.d()).intValue() > this.f17845c;
    }

    private final List q() {
        return q.l(new int[]{2448, 3264}, new int[]{2008, 3032}, new int[]{1944, 2580}, new int[]{1680, 2240}, new int[]{1536, 2048}, new int[]{1200, 1600}, new int[]{1024, 1392}, new int[]{960, 1280}, new int[]{768, 1024}, new int[]{600, 800}, new int[]{480, 640}, new int[]{240, 320}, new int[]{120, 160}, new int[]{60, 80}, new int[]{30, 40});
    }

    /* access modifiers changed from: private */
    public final File r(File file) {
        int i10;
        int i11 = 0;
        File file2 = null;
        int i12 = 0;
        while (true) {
            if (file2 != null) {
                file2.delete();
            }
            file2 = i(file, i11);
            if (file2 != null) {
                if (this.f17846d > 0) {
                    long l10 = l(file2);
                    i10 = (l10 > ((long) 1048576) ? 3 : l10 > ((long) 512000) ? 2 : 1) + i11;
                } else {
                    i10 = i11 + 1;
                }
                if (!p(file2)) {
                    x2.b.f18192a.a(file, file2);
                    return file2;
                }
                int i13 = i10;
                i12 = i11;
                i11 = i13;
            } else if (i11 > 0) {
                return i(file, i12);
            } else {
                return null;
            }
        }
    }

    private final void s(Uri uri) {
        new b(this).execute(new Uri[]{uri});
    }

    public final void j(Uri uri) {
        l.f(uri, "uri");
        s(uri);
    }

    public final boolean o(Uri uri) {
        l.f(uri, "uri");
        boolean z10 = n() && k(uri) > 0;
        if (z10 || this.f17844b <= 0 || this.f17845c <= 0) {
            return z10;
        }
        o h10 = e.f18194a.h(this, uri);
        return ((Number) h10.c()).intValue() > this.f17844b || ((Number) h10.d()).intValue() > this.f17845c;
    }
}
