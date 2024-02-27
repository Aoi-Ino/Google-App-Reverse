package fl;

import android.view.View;
import com.smarteist.autoimageslider.c;

public class a implements c.l {
    public void a(View view, float f10) {
        float abs;
        float f11;
        view.setTranslationX((-f10) * ((float) view.getWidth()));
        if (((double) Math.abs(f10)) < 0.5d) {
            view.setVisibility(0);
            view.setScaleX(1.0f - Math.abs(f10));
            view.setScaleY(1.0f - Math.abs(f10));
        } else if (((double) Math.abs(f10)) > 0.5d) {
            view.setVisibility(8);
        }
        if (f10 >= -1.0f) {
            if (f10 <= 0.0f) {
                view.setAlpha(1.0f);
                abs = 1.0f - Math.abs(f10);
                f11 = 360.0f;
            } else if (f10 <= 1.0f) {
                view.setAlpha(1.0f);
                abs = 1.0f - Math.abs(f10);
                f11 = -360.0f;
            }
            view.setRotation(abs * f11);
            return;
        }
        view.setAlpha(0.0f);
    }
}
