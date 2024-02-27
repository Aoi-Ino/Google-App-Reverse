package x2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import cm.l;
import java.io.File;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f18196a = new g();

    private g() {
    }

    private final int a(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 > i11 || i13 > i10) {
            int i15 = i12 / 2;
            int i16 = i13 / 2;
            while (i15 / i14 >= i11 && i16 / i14 >= i10) {
                i14 *= 2;
            }
        }
        return i14;
    }

    private final boolean b(Bitmap bitmap, BitmapFactory.Options options) {
        int i10 = options.outWidth;
        int i11 = options.inSampleSize;
        int i12 = (i10 / i11) * (options.outHeight / i11);
        Bitmap.Config config = bitmap.getConfig();
        l.e(config, "candidate.config");
        return i12 * e(config) <= bitmap.getAllocationByteCount();
    }

    private final Bitmap d(File file, float f10, float f11) {
        Bitmap bitmap;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        int i10 = options.outHeight;
        int i11 = options.outWidth;
        float f12 = (float) i11;
        float f13 = (float) i10;
        float f14 = f12 / f13;
        float f15 = f10 / f11;
        if (f13 > f11 || f12 > f10) {
            if (f14 < f15) {
                i11 = (int) ((f11 / f13) * f12);
                i10 = (int) f11;
            } else {
                if (f14 > f15) {
                    f11 = (f10 / f12) * f13;
                }
                i10 = (int) f11;
                i11 = (int) f10;
            }
        }
        options.inSampleSize = a(options, i11, i10);
        options.inJustDecodeBounds = false;
        if (decodeFile != null && b(decodeFile, options)) {
            options.inMutable = true;
            options.inBitmap = decodeFile;
        }
        options.inTempStorage = new byte[16384];
        try {
            decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        } catch (OutOfMemoryError e10) {
            e10.printStackTrace();
        }
        try {
            bitmap = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError e11) {
            e11.printStackTrace();
            bitmap = null;
        }
        Bitmap bitmap2 = bitmap;
        float f16 = (float) i11;
        float f17 = f16 / ((float) options.outWidth);
        float f18 = (float) i10;
        float f19 = f18 / ((float) options.outHeight);
        float f20 = f16 / 2.0f;
        float f21 = f18 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(f17, f19, f20, f21);
        l.c(bitmap2);
        Canvas canvas = new Canvas(bitmap2);
        canvas.setMatrix(matrix);
        l.c(decodeFile);
        canvas.drawBitmap(decodeFile, f20 - ((float) (decodeFile.getWidth() / 2)), f21 - ((float) (decodeFile.getHeight() / 2)), new Paint(2));
        decodeFile.recycle();
        return Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), new Matrix(), true);
    }

    private final int e(Bitmap.Config config) {
        int i10 = f.f18195a[config.ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3) ? 2 : 1;
        }
        return 4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File c(java.io.File r3, float r4, float r5, android.graphics.Bitmap.CompressFormat r6, java.lang.String r7) {
        /*
            r2 = this;
            java.lang.String r0 = "imageFile"
            cm.l.f(r3, r0)
            java.lang.String r0 = "compressFormat"
            cm.l.f(r6, r0)
            java.lang.String r0 = "destinationPath"
            cm.l.f(r7, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            java.io.File r0 = r0.getParentFile()
            if (r0 == 0) goto L_0x0023
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0023
            r0.mkdirs()
        L_0x0023:
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0044 }
            r1.<init>(r7)     // Catch:{ all -> 0x0044 }
            android.graphics.Bitmap r3 = r2.d(r3, r4, r5)     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x0038
            r4 = 100
            r3.compress(r6, r4, r1)     // Catch:{ all -> 0x0035 }
            goto L_0x0038
        L_0x0035:
            r3 = move-exception
            r0 = r1
            goto L_0x0045
        L_0x0038:
            r1.flush()
            r1.close()
            java.io.File r3 = new java.io.File
            r3.<init>(r7)
            return r3
        L_0x0044:
            r3 = move-exception
        L_0x0045:
            if (r0 == 0) goto L_0x004d
            r0.flush()
            r0.close()
        L_0x004d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.g.c(java.io.File, float, float, android.graphics.Bitmap$CompressFormat, java.lang.String):java.io.File");
    }
}
