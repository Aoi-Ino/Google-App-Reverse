package i5;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

class q extends o {

    class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            if (!q.this.f12481e.isEmpty()) {
                outline.setPath(q.this.f12481e);
            }
        }
    }

    q(View view) {
        k(view);
    }

    private void k(View view) {
        view.setOutlineProvider(new a());
    }

    /* access modifiers changed from: package-private */
    public void b(View view) {
        view.setClipToOutline(!i());
        if (i()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.f12477a;
    }
}
