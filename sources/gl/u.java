package gl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import gl.t;

final class u extends BitmapDrawable {

    /* renamed from: h  reason: collision with root package name */
    private static final Paint f23932h = new Paint();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f23933a;

    /* renamed from: b  reason: collision with root package name */
    private final float f23934b;

    /* renamed from: c  reason: collision with root package name */
    private final t.e f23935c;

    /* renamed from: d  reason: collision with root package name */
    Drawable f23936d;

    /* renamed from: e  reason: collision with root package name */
    long f23937e;

    /* renamed from: f  reason: collision with root package name */
    boolean f23938f;

    /* renamed from: g  reason: collision with root package name */
    int f23939g = 255;

    u(Context context, Bitmap bitmap, Drawable drawable, t.e eVar, boolean z10, boolean z11) {
        super(context.getResources(), bitmap);
        this.f23933a = z11;
        this.f23934b = context.getResources().getDisplayMetrics().density;
        this.f23935c = eVar;
        if (eVar != t.e.MEMORY && !z10) {
            this.f23936d = drawable;
            this.f23938f = true;
            this.f23937e = SystemClock.uptimeMillis();
        }
    }

    private void a(Canvas canvas) {
        Paint paint = f23932h;
        paint.setColor(-1);
        canvas.drawPath(b(new Point(0, 0), (int) (this.f23934b * 16.0f)), paint);
        paint.setColor(this.f23935c.f23926e);
        canvas.drawPath(b(new Point(0, 0), (int) (this.f23934b * 15.0f)), paint);
    }

    private static Path b(Point point, int i10) {
        Point point2 = new Point(point.x + i10, point.y);
        Point point3 = new Point(point.x, point.y + i10);
        Path path = new Path();
        path.moveTo((float) point.x, (float) point.y);
        path.lineTo((float) point2.x, (float) point2.y);
        path.lineTo((float) point3.x, (float) point3.y);
        return path;
    }

    static void c(ImageView imageView, Context context, Bitmap bitmap, t.e eVar, boolean z10, boolean z11) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new u(context, bitmap, drawable, eVar, z10, z11));
    }

    static void d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            boolean r0 = r4.f23938f
            if (r0 != 0) goto L_0x0008
        L_0x0004:
            super.draw(r5)
            goto L_0x0037
        L_0x0008:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r4.f23937e
            long r0 = r0 - r2
            float r0 = (float) r0
            r1 = 1128792064(0x43480000, float:200.0)
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0020
            r0 = 0
            r4.f23938f = r0
            r0 = 0
            r4.f23936d = r0
            goto L_0x0004
        L_0x0020:
            android.graphics.drawable.Drawable r1 = r4.f23936d
            if (r1 == 0) goto L_0x0027
            r1.draw(r5)
        L_0x0027:
            int r1 = r4.f23939g
            float r1 = (float) r1
            float r1 = r1 * r0
            int r0 = (int) r1
            super.setAlpha(r0)
            super.draw(r5)
            int r0 = r4.f23939g
            super.setAlpha(r0)
        L_0x0037:
            boolean r0 = r4.f23933a
            if (r0 == 0) goto L_0x003e
            r4.a(r5)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.u.draw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f23936d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i10) {
        this.f23939g = i10;
        Drawable drawable = this.f23936d;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
        super.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f23936d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
