package androidx.core.graphics;

import android.graphics.Paint;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal f2377a = new ThreadLocal();

    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }
}
