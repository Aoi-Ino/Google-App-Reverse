package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    final ActionBarContainer f1316a;

    private static class a {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public b(ActionBarContainer actionBarContainer) {
        this.f1316a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1316a;
        if (actionBarContainer.f1087l) {
            Drawable drawable = actionBarContainer.f1086k;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1084i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1316a;
        Drawable drawable3 = actionBarContainer2.f1085j;
        if (drawable3 != null && actionBarContainer2.f1088m) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f1316a;
        if (!actionBarContainer.f1087l) {
            drawable = actionBarContainer.f1084i;
            if (drawable == null) {
                return;
            }
        } else if (actionBarContainer.f1086k != null) {
            drawable = actionBarContainer.f1084i;
        } else {
            return;
        }
        a.a(drawable, outline);
    }

    public void setAlpha(int i10) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
