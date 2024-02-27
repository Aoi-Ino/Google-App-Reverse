package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageView extends ImageView {

    /* renamed from: e  reason: collision with root package name */
    private final e f1154e;

    /* renamed from: f  reason: collision with root package name */
    private final o f1155f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1156g;

    public AppCompatImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1154e;
        if (eVar != null) {
            eVar.b();
        }
        o oVar = this.f1155f;
        if (oVar != null) {
            oVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1154e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1154e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        o oVar = this.f1155f;
        if (oVar != null) {
            return oVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        o oVar = this.f1155f;
        if (oVar != null) {
            return oVar.e();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1155f.f() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1154e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1154e;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        o oVar = this.f1155f;
        if (oVar != null) {
            oVar.c();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        o oVar = this.f1155f;
        if (!(oVar == null || drawable == null || this.f1156g)) {
            oVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        o oVar2 = this.f1155f;
        if (oVar2 != null) {
            oVar2.c();
            if (!this.f1156g) {
                this.f1155f.b();
            }
        }
    }

    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f1156g = true;
    }

    public void setImageResource(int i10) {
        o oVar = this.f1155f;
        if (oVar != null) {
            oVar.i(i10);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        o oVar = this.f1155f;
        if (oVar != null) {
            oVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1154e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1154e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        o oVar = this.f1155f;
        if (oVar != null) {
            oVar.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        o oVar = this.f1155f;
        if (oVar != null) {
            oVar.k(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i10) {
        super(s0.b(context), attributeSet, i10);
        this.f1156g = false;
        r0.a(this, getContext());
        e eVar = new e(this);
        this.f1154e = eVar;
        eVar.e(attributeSet, i10);
        o oVar = new o(this);
        this.f1155f = oVar;
        oVar.g(attributeSet, i10);
    }
}
