package fl;

import android.view.View;
import com.smarteist.autoimageslider.c;

public class i implements c.l {
    public void a(View view, float f10) {
        if (f10 >= -1.0f) {
            float f11 = 1.0f;
            if (f10 <= 0.0f) {
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setScaleX(1.0f);
            } else if (f10 <= 1.0f) {
                view.setTranslationX((-f10) * ((float) view.getWidth()));
                view.setAlpha(1.0f - Math.abs(f10));
                view.setScaleX(1.0f - Math.abs(f10));
                f11 = 1.0f - Math.abs(f10);
            }
            view.setScaleY(f11);
            return;
        }
        view.setAlpha(0.0f);
    }
}
