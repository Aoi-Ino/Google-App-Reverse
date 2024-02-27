package h;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public abstract class a extends Drawable implements Drawable.Callback {

    /* renamed from: e  reason: collision with root package name */
    private Drawable f11916e;

    public a(Drawable drawable) {
        a(drawable);
    }

    public void a(Drawable drawable) {
        Drawable drawable2 = this.f11916e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f11916e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f11916e.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f11916e.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f11916e.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f11916e.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f11916e.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f11916e.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f11916e.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f11916e.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f11916e.getPadding(rect);
    }

    public int[] getState() {
        return this.f11916e.getState();
    }

    public Region getTransparentRegion() {
        return this.f11916e.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return androidx.core.graphics.drawable.a.h(this.f11916e);
    }

    public boolean isStateful() {
        return this.f11916e.isStateful();
    }

    public void jumpToCurrentState() {
        this.f11916e.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f11916e.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        return this.f11916e.setLevel(i10);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        this.f11916e.setAlpha(i10);
    }

    public void setAutoMirrored(boolean z10) {
        androidx.core.graphics.drawable.a.j(this.f11916e, z10);
    }

    public void setChangingConfigurations(int i10) {
        this.f11916e.setChangingConfigurations(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f11916e.setColorFilter(colorFilter);
    }

    public void setDither(boolean z10) {
        this.f11916e.setDither(z10);
    }

    public void setFilterBitmap(boolean z10) {
        this.f11916e.setFilterBitmap(z10);
    }

    public void setHotspot(float f10, float f11) {
        androidx.core.graphics.drawable.a.k(this.f11916e, f10, f11);
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        androidx.core.graphics.drawable.a.l(this.f11916e, i10, i11, i12, i13);
    }

    public boolean setState(int[] iArr) {
        return this.f11916e.setState(iArr);
    }

    public void setTint(int i10) {
        androidx.core.graphics.drawable.a.n(this.f11916e, i10);
    }

    public void setTintList(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.o(this.f11916e, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        androidx.core.graphics.drawable.a.p(this.f11916e, mode);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f11916e.setVisible(z10, z11);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
