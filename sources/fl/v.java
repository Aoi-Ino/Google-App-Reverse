package fl;

import android.view.View;
import com.smarteist.autoimageslider.c;

public class v implements c.l {
    public void a(View view, float f10) {
        if (f10 >= -1.0f && f10 <= 1.0f) {
            view.setScaleX(Math.max(0.65f, 1.0f - Math.abs(f10)));
            view.setScaleY(Math.max(0.65f, 1.0f - Math.abs(f10)));
            view.setAlpha(Math.max(0.3f, 1.0f - Math.abs(f10)));
            return;
        }
        view.setAlpha(0.0f);
    }
}
