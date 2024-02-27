package a5;

import android.content.Context;
import android.graphics.Color;
import f5.b;

public class a {

    /* renamed from: f  reason: collision with root package name */
    private static final int f206f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a  reason: collision with root package name */
    private final boolean f207a;

    /* renamed from: b  reason: collision with root package name */
    private final int f208b;

    /* renamed from: c  reason: collision with root package name */
    private final int f209c;

    /* renamed from: d  reason: collision with root package name */
    private final int f210d;

    /* renamed from: e  reason: collision with root package name */
    private final float f211e;

    public a(Context context) {
        this(b.b(context, q4.b.elevationOverlayEnabled, false), x4.a.b(context, q4.b.elevationOverlayColor, 0), x4.a.b(context, q4.b.elevationOverlayAccentColor, 0), x4.a.b(context, q4.b.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i10) {
        return androidx.core.graphics.a.k(i10, 255) == this.f210d;
    }

    public float a(float f10) {
        float f11 = this.f211e;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f10 / f11))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float a10 = a(f10);
        int alpha = Color.alpha(i10);
        int j10 = x4.a.j(androidx.core.graphics.a.k(i10, 255), this.f208b, a10);
        if (a10 > 0.0f && (i11 = this.f209c) != 0) {
            j10 = x4.a.i(j10, androidx.core.graphics.a.k(i11, f206f));
        }
        return androidx.core.graphics.a.k(j10, alpha);
    }

    public int c(int i10, float f10) {
        return (!this.f207a || !e(i10)) ? i10 : b(i10, f10);
    }

    public boolean d() {
        return this.f207a;
    }

    public a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f207a = z10;
        this.f208b = i10;
        this.f209c = i11;
        this.f210d = i12;
        this.f211e = f10;
    }
}
