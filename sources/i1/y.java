package i1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

class y implements z {

    /* renamed from: a  reason: collision with root package name */
    private final ViewOverlay f12230a;

    y(View view) {
        this.f12230a = view.getOverlay();
    }

    public void b(Drawable drawable) {
        this.f12230a.add(drawable);
    }

    public void d(Drawable drawable) {
        this.f12230a.remove(drawable);
    }
}
