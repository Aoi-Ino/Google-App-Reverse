package i0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import androidx.emoji2.text.e;
import androidx.emoji2.text.g;

public final class d extends b {

    /* renamed from: f  reason: collision with root package name */
    private static Paint f12101f;

    public d(g gVar) {
        super(gVar);
    }

    private static Paint c() {
        if (f12101f == null) {
            TextPaint textPaint = new TextPaint();
            f12101f = textPaint;
            textPaint.setColor(e.b().c());
            f12101f.setStyle(Paint.Style.FILL);
        }
        return f12101f;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        if (e.b().i()) {
            canvas.drawRect(f10, (float) i12, f10 + ((float) b()), (float) i14, c());
        }
        a().a(canvas, f10, (float) i13, paint);
    }
}
