package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.h;
import f.j;

class q extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f1508b = false;

    /* renamed from: a  reason: collision with root package name */
    private boolean f1509a;

    public q(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        v0 v10 = v0.v(context, attributeSet, j.f11211g2, i10, i11);
        int i12 = j.f11221i2;
        if (v10.s(i12)) {
            b(v10.a(i12, false));
        }
        setBackgroundDrawable(v10.g(j.f11216h2));
        v10.w();
    }

    private void b(boolean z10) {
        if (f1508b) {
            this.f1509a = z10;
        } else {
            h.a(this, z10);
        }
    }

    public void showAsDropDown(View view, int i10, int i11) {
        if (f1508b && this.f1509a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f1508b && this.f1509a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f1508b && this.f1509a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
