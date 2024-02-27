package fl;

import android.view.View;
import com.smarteist.autoimageslider.c;

public class k implements c.l {
    public void a(View view, float f10) {
        float f11;
        view.setTranslationX((-f10) * ((float) view.getWidth()));
        view.setPivotX(0.0f);
        view.setPivotY((float) (view.getHeight() / 2));
        view.setCameraDistance(20000.0f);
        if (f10 >= -1.0f) {
            if (f10 <= 0.0f) {
                view.setAlpha(1.0f);
                f11 = -120.0f;
            } else if (f10 <= 1.0f) {
                view.setAlpha(1.0f);
                f11 = 120.0f;
            }
            view.setRotationY(Math.abs(f10) * f11);
            return;
        }
        view.setAlpha(0.0f);
    }
}
