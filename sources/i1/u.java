package i1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

class u implements v {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f12228a;

    u(ViewGroup viewGroup) {
        this.f12228a = viewGroup.getOverlay();
    }

    public void a(View view) {
        this.f12228a.add(view);
    }

    public void b(Drawable drawable) {
        this.f12228a.add(drawable);
    }

    public void c(View view) {
        this.f12228a.remove(view);
    }

    public void d(Drawable drawable) {
        this.f12228a.remove(drawable);
    }
}
