package ll;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class d extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f24919a = new Paint(2);

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f24920b;

    /* renamed from: c  reason: collision with root package name */
    private int f24921c = 255;

    /* renamed from: d  reason: collision with root package name */
    private int f24922d;

    /* renamed from: e  reason: collision with root package name */
    private int f24923e;

    public d(Bitmap bitmap) {
        b(bitmap);
    }

    public Bitmap a() {
        return this.f24920b;
    }

    public void b(Bitmap bitmap) {
        this.f24920b = bitmap;
        if (bitmap != null) {
            this.f24922d = bitmap.getWidth();
            this.f24923e = this.f24920b.getHeight();
            return;
        }
        this.f24923e = 0;
        this.f24922d = 0;
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f24920b;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.f24920b, (Rect) null, getBounds(), this.f24919a);
        }
    }

    public int getAlpha() {
        return this.f24921c;
    }

    public int getIntrinsicHeight() {
        return this.f24923e;
    }

    public int getIntrinsicWidth() {
        return this.f24922d;
    }

    public int getMinimumHeight() {
        return this.f24923e;
    }

    public int getMinimumWidth() {
        return this.f24922d;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i10) {
        this.f24921c = i10;
        this.f24919a.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f24919a.setColorFilter(colorFilter);
    }

    public void setFilterBitmap(boolean z10) {
        this.f24919a.setFilterBitmap(z10);
    }
}
