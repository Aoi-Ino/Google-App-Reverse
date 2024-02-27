package gl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import gl.t;
import java.io.InputStream;

public abstract class y {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final t.e f23988a;

        /* renamed from: b  reason: collision with root package name */
        private final Bitmap f23989b;

        /* renamed from: c  reason: collision with root package name */
        private final InputStream f23990c;

        /* renamed from: d  reason: collision with root package name */
        private final int f23991d;

        public a(Bitmap bitmap, t.e eVar) {
            this((Bitmap) e0.d(bitmap, "bitmap == null"), (InputStream) null, eVar, 0);
        }

        public Bitmap a() {
            return this.f23989b;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f23991d;
        }

        public t.e c() {
            return this.f23988a;
        }

        public InputStream d() {
            return this.f23990c;
        }

        a(Bitmap bitmap, InputStream inputStream, t.e eVar, int i10) {
            boolean z10 = true;
            if ((inputStream == null ? false : z10) ^ (bitmap != null)) {
                this.f23989b = bitmap;
                this.f23990c = inputStream;
                this.f23988a = (t.e) e0.d(eVar, "loadedFrom == null");
                this.f23991d = i10;
                return;
            }
            throw new AssertionError();
        }

        public a(InputStream inputStream, t.e eVar) {
            this((Bitmap) null, (InputStream) e0.d(inputStream, "stream == null"), eVar, 0);
        }
    }

    static void a(int i10, int i11, int i12, int i13, BitmapFactory.Options options, w wVar) {
        int i14;
        double d10;
        if (i13 > i11 || i12 > i10) {
            if (i11 == 0) {
                d10 = (double) (((float) i12) / ((float) i10));
            } else if (i10 == 0) {
                d10 = (double) (((float) i13) / ((float) i11));
            } else {
                int floor = (int) Math.floor((double) (((float) i13) / ((float) i11)));
                int floor2 = (int) Math.floor((double) (((float) i12) / ((float) i10)));
                i14 = wVar.f23952k ? Math.max(floor, floor2) : Math.min(floor, floor2);
            }
            i14 = (int) Math.floor(d10);
        } else {
            i14 = 1;
        }
        options.inSampleSize = i14;
        options.inJustDecodeBounds = false;
    }

    static void b(int i10, int i11, BitmapFactory.Options options, w wVar) {
        a(i10, i11, options.outWidth, options.outHeight, options, wVar);
    }

    static BitmapFactory.Options d(w wVar) {
        boolean c10 = wVar.c();
        boolean z10 = wVar.f23958q != null;
        if (!c10 && !z10) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = c10;
        if (z10) {
            options.inPreferredConfig = wVar.f23958q;
        }
        return options;
    }

    static boolean g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean c(w wVar);

    /* access modifiers changed from: package-private */
    public int e() {
        return 0;
    }

    public abstract a f(w wVar, int i10);

    /* access modifiers changed from: package-private */
    public boolean h(boolean z10, NetworkInfo networkInfo) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return false;
    }
}
