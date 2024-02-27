package i5;

import android.graphics.RectF;
import java.util.Arrays;

public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private final float f12404a;

    public i(float f10) {
        this.f12404a = f10;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    public float a(RectF rectF) {
        return this.f12404a * b(rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return this.f12404a == ((i) obj).f12404a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f12404a)});
    }
}
