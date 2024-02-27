package i5;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.u;

public abstract class h {
    static d a(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? b() : new e();
        }
        return new j();
    }

    static d b() {
        return new j();
    }

    static f c() {
        return new f();
    }

    public static void d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).V(f10);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            f(view, (g) background);
        }
    }

    public static void f(View view, g gVar) {
        if (gVar.O()) {
            gVar.Z(u.f(view));
        }
    }
}
