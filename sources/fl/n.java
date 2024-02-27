package fl;

import android.view.View;
import com.smarteist.autoimageslider.c;

public class n implements c.l {
    public void a(View view, float f10) {
        view.setTranslationX((-f10) * ((float) view.getWidth()));
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        if (f10 >= -1.0f) {
            float f11 = 1.0f;
            if (f10 <= 0.0f) {
                view.setRotation(Math.abs(f10) * 90.0f);
                f11 = 1.0f - Math.abs(f10);
            } else if (f10 <= 1.0f) {
                view.setRotation(0.0f);
            }
            view.setAlpha(f11);
            return;
        }
        view.setAlpha(0.0f);
    }
}
