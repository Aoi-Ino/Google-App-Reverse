package g5;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import i5.g;
import i5.k;
import i5.n;

public class a extends Drawable implements n {

    /* renamed from: e  reason: collision with root package name */
    private b f11631e;

    static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        g f11632a;

        /* renamed from: b  reason: collision with root package name */
        boolean f11633b;

        public b(b bVar) {
            this.f11632a = (g) bVar.f11632a.getConstantState().newDrawable();
            this.f11633b = bVar.f11633b;
        }

        /* renamed from: a */
        public a newDrawable() {
            return new a(new b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public b(g gVar) {
            this.f11632a = gVar;
            this.f11633b = false;
        }
    }

    private a(b bVar) {
        this.f11631e = bVar;
    }

    /* renamed from: a */
    public a mutate() {
        this.f11631e = new b(this.f11631e);
        return this;
    }

    public void draw(Canvas canvas) {
        b bVar = this.f11631e;
        if (bVar.f11633b) {
            bVar.f11632a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f11631e;
    }

    public int getOpacity() {
        return this.f11631e.f11632a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f11631e.f11632a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f11631e.f11632a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b10 = b.b(iArr);
        b bVar = this.f11631e;
        if (bVar.f11633b == b10) {
            return onStateChange;
        }
        bVar.f11633b = b10;
        return true;
    }

    public void setAlpha(int i10) {
        this.f11631e.f11632a.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f11631e.f11632a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f11631e.f11632a.setShapeAppearanceModel(kVar);
    }

    public void setTint(int i10) {
        this.f11631e.f11632a.setTint(i10);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f11631e.f11632a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f11631e.f11632a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }
}
