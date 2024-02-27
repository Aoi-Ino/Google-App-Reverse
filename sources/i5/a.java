package i5;

import android.graphics.RectF;
import java.util.Arrays;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final float f12353a;

    public a(float f10) {
        this.f12353a = f10;
    }

    public float a(RectF rectF) {
        return this.f12353a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f12353a == ((a) obj).f12353a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f12353a)});
    }
}
