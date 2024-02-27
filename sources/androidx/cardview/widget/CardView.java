package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import n.b;
import n.c;
import n.d;

public class CardView extends FrameLayout {

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f1625l = {16842801};

    /* renamed from: m  reason: collision with root package name */
    private static final c f1626m;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1627e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1628f;

    /* renamed from: g  reason: collision with root package name */
    int f1629g;

    /* renamed from: h  reason: collision with root package name */
    int f1630h;

    /* renamed from: i  reason: collision with root package name */
    final Rect f1631i;

    /* renamed from: j  reason: collision with root package name */
    final Rect f1632j;

    /* renamed from: k  reason: collision with root package name */
    private final b f1633k;

    class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f1634a;

        a() {
        }

        public void a(int i10, int i11, int i12, int i13) {
            CardView.this.f1632j.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1631i;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        public View b() {
            return CardView.this;
        }

        public void c(Drawable drawable) {
            this.f1634a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        public boolean d() {
            return CardView.this.getPreventCornerOverlap();
        }

        public boolean e() {
            return CardView.this.getUseCompatPadding();
        }

        public Drawable f() {
            return this.f1634a;
        }
    }

    static {
        a aVar = new a();
        f1626m = aVar;
        aVar.g();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n.a.cardViewStyle);
    }

    public void b(int i10, int i11, int i12, int i13) {
        this.f1631i.set(i10, i11, i12, i13);
        f1626m.f(this.f1633k);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1626m.b(this.f1633k);
    }

    public float getCardElevation() {
        return f1626m.e(this.f1633k);
    }

    public int getContentPaddingBottom() {
        return this.f1631i.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1631i.left;
    }

    public int getContentPaddingRight() {
        return this.f1631i.right;
    }

    public int getContentPaddingTop() {
        return this.f1631i.top;
    }

    public float getMaxCardElevation() {
        return f1626m.a(this.f1633k);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1628f;
    }

    public float getRadius() {
        return f1626m.h(this.f1633k);
    }

    public boolean getUseCompatPadding() {
        return this.f1627e;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        c cVar = f1626m;
        if (!(cVar instanceof a)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) cVar.j(this.f1633k)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) cVar.i(this.f1633k)), View.MeasureSpec.getSize(i11)), mode2);
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f1626m.n(this.f1633k, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f1626m.l(this.f1633k, f10);
    }

    public void setMaxCardElevation(float f10) {
        f1626m.o(this.f1633k, f10);
    }

    public void setMinimumHeight(int i10) {
        this.f1630h = i10;
        super.setMinimumHeight(i10);
    }

    public void setMinimumWidth(int i10) {
        this.f1629g = i10;
        super.setMinimumWidth(i10);
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1628f) {
            this.f1628f = z10;
            f1626m.m(this.f1633k);
        }
    }

    public void setRadius(float f10) {
        f1626m.d(this.f1633k, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1627e != z10) {
            this.f1627e = z10;
            f1626m.k(this.f1633k);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources;
        int i11;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1631i = rect;
        this.f1632j = new Rect();
        a aVar = new a();
        this.f1633k = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f14048a, i10, c.f14047a);
        int i12 = d.f14051d;
        if (obtainStyledAttributes.hasValue(i12)) {
            valueOf = obtainStyledAttributes.getColorStateList(i12);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1625l);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i11 = b.cardview_light_background;
            } else {
                resources = getResources();
                i11 = b.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i11));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(d.f14052e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(d.f14053f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(d.f14054g, 0.0f);
        this.f1627e = obtainStyledAttributes.getBoolean(d.f14056i, false);
        this.f1628f = obtainStyledAttributes.getBoolean(d.f14055h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(d.f14057j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(d.f14059l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(d.f14061n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(d.f14060m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(d.f14058k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1629g = obtainStyledAttributes.getDimensionPixelSize(d.f14049b, 0);
        this.f1630h = obtainStyledAttributes.getDimensionPixelSize(d.f14050c, 0);
        obtainStyledAttributes.recycle();
        f1626m.c(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1626m.n(this.f1633k, colorStateList);
    }
}
