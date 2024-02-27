package fl;

import android.view.View;
import com.smarteist.autoimageslider.c;

public class s implements c.l {
    public void a(View view, float f10) {
        float abs;
        float f11;
        view.setTranslationX((-f10) * ((float) view.getWidth()));
        view.setCameraDistance(20000.0f);
        double d10 = (double) f10;
        view.setVisibility((d10 >= 0.5d || d10 <= -0.5d) ? 4 : 0);
        if (f10 >= -1.0f) {
            if (f10 <= 0.0f) {
                view.setAlpha(1.0f);
                view.setScaleX(Math.max(0.4f, 1.0f - Math.abs(f10)));
                view.setScaleY(Math.max(0.4f, 1.0f - Math.abs(f10)));
                abs = (1.0f - Math.abs(f10)) + 1.0f;
                f11 = 1080.0f;
            } else if (f10 <= 1.0f) {
                view.setAlpha(1.0f);
                view.setScaleX(Math.max(0.4f, 1.0f - Math.abs(f10)));
                view.setScaleY(Math.max(0.4f, 1.0f - Math.abs(f10)));
                abs = (1.0f - Math.abs(f10)) + 1.0f;
                f11 = -1080.0f;
            }
            view.setRotationX(abs * f11);
            view.setTranslationY(Math.abs(f10) * -1000.0f);
            return;
        }
        view.setAlpha(0.0f);
    }
}
