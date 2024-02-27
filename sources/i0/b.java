package i0;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.emoji2.text.g;

public abstract class b extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    private final Paint.FontMetricsInt f12092a = new Paint.FontMetricsInt();

    /* renamed from: b  reason: collision with root package name */
    private final g f12093b;

    /* renamed from: c  reason: collision with root package name */
    private short f12094c = -1;

    /* renamed from: d  reason: collision with root package name */
    private short f12095d = -1;

    /* renamed from: e  reason: collision with root package name */
    private float f12096e = 1.0f;

    b(g gVar) {
        androidx.core.util.g.h(gVar, "metadata cannot be null");
        this.f12093b = gVar;
    }

    public final g a() {
        return this.f12093b;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.f12094c;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f12092a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f12092a;
        this.f12096e = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f12093b.e());
        this.f12095d = (short) ((int) (((float) this.f12093b.e()) * this.f12096e));
        short i12 = (short) ((int) (((float) this.f12093b.i()) * this.f12096e));
        this.f12094c = i12;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f12092a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i12;
    }
}
