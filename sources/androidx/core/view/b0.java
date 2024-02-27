package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

public class b0 {

    /* renamed from: a  reason: collision with root package name */
    private int f2565a;

    /* renamed from: b  reason: collision with root package name */
    private int f2566b;

    public b0(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f2565a | this.f2566b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f2566b = i10;
        } else {
            this.f2565a = i10;
        }
    }

    public void d(View view, int i10) {
        if (i10 == 1) {
            this.f2566b = 0;
        } else {
            this.f2565a = 0;
        }
    }
}
