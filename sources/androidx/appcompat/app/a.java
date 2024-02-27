package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import f.j;

public abstract class a {

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    public static class C0013a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f612a = 8388627;

        public C0013a(int i10, int i11) {
            super(i10, i11);
        }

        public C0013a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f11273t);
            this.f612a = obtainStyledAttributes.getInt(j.f11278u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0013a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0013a(C0013a aVar) {
            super(aVar);
            this.f612a = aVar.f612a;
        }
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z10);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public void m(Configuration configuration) {
    }

    /* access modifiers changed from: package-private */
    public void n() {
    }

    public abstract boolean o(int i10, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z10);

    public abstract void s(boolean z10);

    public abstract void t(boolean z10);

    public abstract void u(int i10);

    public abstract void v(Drawable drawable);

    public abstract void w(boolean z10);

    public abstract void x(CharSequence charSequence);

    public abstract void y(CharSequence charSequence);

    public b z(b.a aVar) {
        return null;
    }
}
