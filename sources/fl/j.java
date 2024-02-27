package fl;

import android.view.View;
import com.smarteist.autoimageslider.c;

public class j implements c.l {
    public void a(View view, float f10) {
        view.setTranslationX((-f10) * ((float) view.getWidth()));
        if (f10 < -1.0f || f10 > 1.0f) {
            view.setAlpha(0.0f);
            return;
        }
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 <= 0 || f10 <= 1.0f) {
            view.setAlpha(i10 <= 0 ? f10 + 1.0f : 1.0f - f10);
        } else if (f10 == 0.0f) {
            view.setAlpha(1.0f);
        }
    }
}
