package i5;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final c f12354a;

    /* renamed from: b  reason: collision with root package name */
    private final float f12355b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f12354a;
            f10 += ((b) cVar).f12355b;
        }
        this.f12354a = cVar;
        this.f12355b = f10;
    }

    public float a(RectF rectF) {
        return Math.max(0.0f, this.f12354a.a(rectF) + this.f12355b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12354a.equals(bVar.f12354a) && this.f12355b == bVar.f12355b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12354a, Float.valueOf(this.f12355b)});
    }
}
