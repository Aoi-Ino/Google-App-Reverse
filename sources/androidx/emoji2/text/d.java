package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.core.graphics.g;
import androidx.emoji2.text.e;

class d implements e.d {

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal f2844b = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f2845a;

    d() {
        TextPaint textPaint = new TextPaint();
        this.f2845a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal threadLocal = f2844b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    public boolean a(CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder b10 = b();
        b10.setLength(0);
        while (i10 < i11) {
            b10.append(charSequence.charAt(i10));
            i10++;
        }
        return g.a(this.f2845a, b10.toString());
    }
}
