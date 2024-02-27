package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import f.a;

public class n extends ImageButton {

    /* renamed from: e  reason: collision with root package name */
    private final e f1487e;

    /* renamed from: f  reason: collision with root package name */
    private final o f1488f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1489g;

    public n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.imageButtonStyle);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1487e;
        if (eVar != null) {
            eVar.b();
        }
        o oVar = this.f1488f;
        if (oVar != null) {
            oVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1487e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1487e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        o oVar = this.f1488f;
        if (oVar != null) {
            return oVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        o oVar = this.f1488f;
        if (oVar != null) {
            return oVar.e();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1488f.f() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1487e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1487e;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        o oVar = this.f1488f;
        if (oVar != null) {
            oVar.c();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        o oVar = this.f1488f;
        if (!(oVar == null || drawable == null || this.f1489g)) {
            oVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        o oVar2 = this.f1488f;
        if (oVar2 != null) {
            oVar2.c();
            if (!this.f1489g) {
                this.f1488f.b();
            }
        }
    }

    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f1489g = true;
    }

    public void setImageResource(int i10) {
        this.f1488f.i(i10);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        o oVar = this.f1488f;
        if (oVar != null) {
            oVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1487e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1487e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        o oVar = this.f1488f;
        if (oVar != null) {
            oVar.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        o oVar = this.f1488f;
        if (oVar != null) {
            oVar.k(mode);
        }
    }

    public n(Context context, AttributeSet attributeSet, int i10) {
        super(s0.b(context), attributeSet, i10);
        this.f1489g = false;
        r0.a(this, getContext());
        e eVar = new e(this);
        this.f1487e = eVar;
        eVar.e(attributeSet, i10);
        o oVar = new o(this);
        this.f1488f = oVar;
        oVar.g(attributeSet, i10);
    }
}
