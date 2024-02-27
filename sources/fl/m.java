package fl;

import android.view.View;
import com.smarteist.autoimageslider.c;

public class m implements c.l {

    /* renamed from: a  reason: collision with root package name */
    private String f23591a = "GateAnimationn";

    public void a(View view, float f10) {
        float f11;
        view.setTranslationX((-f10) * ((float) view.getWidth()));
        if (f10 >= -1.0f) {
            if (f10 <= 0.0f) {
                view.setAlpha(1.0f);
                view.setPivotX(0.0f);
                f11 = 90.0f;
            } else if (f10 <= 1.0f) {
                view.setAlpha(1.0f);
                view.setPivotX((float) view.getWidth());
                f11 = -90.0f;
            }
            view.setRotationY(Math.abs(f10) * f11);
            return;
        }
        view.setAlpha(0.0f);
    }
}
