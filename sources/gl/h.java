package gl;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

class h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: e  reason: collision with root package name */
    final x f23833e;

    /* renamed from: f  reason: collision with root package name */
    final WeakReference f23834f;

    h(x xVar, ImageView imageView, e eVar) {
        this.f23833e = xVar;
        this.f23834f = new WeakReference(imageView);
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        ImageView imageView = (ImageView) this.f23834f.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public boolean onPreDraw() {
        ImageView imageView = (ImageView) this.f23834f.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f23833e.h().f(width, height).d(imageView, (e) null);
        }
        return true;
    }
}
