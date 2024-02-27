package ja;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import cm.l;
import gl.c0;

public final class e implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final float f12793a;

    public e(float f10) {
        this.f12793a = f10;
    }

    public Bitmap a(Bitmap bitmap) {
        l.f(bitmap, "source");
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        l.e(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(5);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        float f10 = this.f12793a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        bitmap.recycle();
        return createBitmap;
    }

    public String b() {
        return "round_corners";
    }
}
