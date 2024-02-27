package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

public abstract class a {

    /* renamed from: androidx.core.view.animation.a$a  reason: collision with other inner class name */
    static class C0039a {
        static Interpolator a(float f10, float f11) {
            return new PathInterpolator(f10, f11);
        }

        static Interpolator b(float f10, float f11, float f12, float f13) {
            return new PathInterpolator(f10, f11, f12, f13);
        }

        static Interpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f10, float f11, float f12, float f13) {
        return C0039a.b(f10, f11, f12, f13);
    }

    public static Interpolator b(Path path) {
        return C0039a.c(path);
    }
}
