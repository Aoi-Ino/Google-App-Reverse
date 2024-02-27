package f5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.h;
import q4.k;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f11331a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f11332b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f11333c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11334d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11335e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11336f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f11337g;

    /* renamed from: h  reason: collision with root package name */
    public final float f11338h;

    /* renamed from: i  reason: collision with root package name */
    public final float f11339i;

    /* renamed from: j  reason: collision with root package name */
    public final float f11340j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f11341k;

    /* renamed from: l  reason: collision with root package name */
    public final float f11342l;

    /* renamed from: m  reason: collision with root package name */
    private ColorStateList f11343m;

    /* renamed from: n  reason: collision with root package name */
    private float f11344n;

    /* renamed from: o  reason: collision with root package name */
    private final int f11345o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f11346p = false;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public Typeface f11347q;

    class a extends h.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f11348a;

        a(f fVar) {
            this.f11348a = fVar;
        }

        public void h(int i10) {
            boolean unused = d.this.f11346p = true;
            this.f11348a.a(i10);
        }

        public void i(Typeface typeface) {
            d dVar = d.this;
            Typeface unused = dVar.f11347q = Typeface.create(typeface, dVar.f11335e);
            boolean unused2 = d.this.f11346p = true;
            this.f11348a.b(d.this.f11347q, false);
        }
    }

    class b extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f11350a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextPaint f11351b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f11352c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f11350a = context;
            this.f11351b = textPaint;
            this.f11352c = fVar;
        }

        public void a(int i10) {
            this.f11352c.a(i10);
        }

        public void b(Typeface typeface, boolean z10) {
            d.this.p(this.f11350a, this.f11351b, typeface);
            this.f11352c.b(typeface, z10);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, k.f15132q6);
        l(obtainStyledAttributes.getDimension(k.f15141r6, 0.0f));
        k(c.a(context, obtainStyledAttributes, k.f15168u6));
        this.f11331a = c.a(context, obtainStyledAttributes, k.f15177v6);
        this.f11332b = c.a(context, obtainStyledAttributes, k.f15186w6);
        this.f11335e = obtainStyledAttributes.getInt(k.f15159t6, 0);
        this.f11336f = obtainStyledAttributes.getInt(k.f15150s6, 1);
        int e10 = c.e(obtainStyledAttributes, k.C6, k.B6);
        this.f11345o = obtainStyledAttributes.getResourceId(e10, 0);
        this.f11334d = obtainStyledAttributes.getString(e10);
        this.f11337g = obtainStyledAttributes.getBoolean(k.D6, false);
        this.f11333c = c.a(context, obtainStyledAttributes, k.f15195x6);
        this.f11338h = obtainStyledAttributes.getFloat(k.f15204y6, 0.0f);
        this.f11339i = obtainStyledAttributes.getFloat(k.f15213z6, 0.0f);
        this.f11340j = obtainStyledAttributes.getFloat(k.A6, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, k.f14992c4);
        int i11 = k.f15002d4;
        this.f11341k = obtainStyledAttributes2.hasValue(i11);
        this.f11342l = obtainStyledAttributes2.getFloat(i11, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f11347q == null && (str = this.f11334d) != null) {
            this.f11347q = Typeface.create(str, this.f11335e);
        }
        if (this.f11347q == null) {
            int i10 = this.f11336f;
            this.f11347q = i10 != 1 ? i10 != 2 ? i10 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f11347q = Typeface.create(this.f11347q, this.f11335e);
        }
    }

    private boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i10 = this.f11345o;
        return (i10 != 0 ? h.c(context, i10) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f11347q;
    }

    public Typeface f(Context context) {
        if (this.f11346p) {
            return this.f11347q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface g10 = h.g(context, this.f11345o);
                this.f11347q = g10;
                if (g10 != null) {
                    this.f11347q = Typeface.create(g10, this.f11335e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f11334d, e10);
            }
        }
        d();
        this.f11346p = true;
        return this.f11347q;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f11345o;
        if (i10 == 0) {
            this.f11346p = true;
        }
        if (this.f11346p) {
            fVar.b(this.f11347q, true);
            return;
        }
        try {
            h.i(context, i10, new a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f11346p = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f11334d, e10);
            this.f11346p = true;
            fVar.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f11343m;
    }

    public float j() {
        return this.f11344n;
    }

    public void k(ColorStateList colorStateList) {
        this.f11343m = colorStateList;
    }

    public void l(float f10) {
        this.f11344n = f10;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f11343m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f11340j;
        float f11 = this.f11338h;
        float f12 = this.f11339i;
        ColorStateList colorStateList2 = this.f11333c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a10 = j.a(context, typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f11335e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f11344n);
        if (this.f11341k) {
            textPaint.setLetterSpacing(this.f11342l);
        }
    }
}
