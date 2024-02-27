package fl;

import android.util.Log;
import android.view.View;
import com.smarteist.autoimageslider.c;

public class o implements c.l {
    public void a(View view, float f10) {
        float f11;
        StringBuilder sb2;
        String str;
        view.setTranslationX((-f10) * ((float) view.getWidth()));
        view.setCameraDistance(20000.0f);
        double d10 = (double) f10;
        view.setVisibility((d10 >= 0.5d || d10 <= -0.5d) ? 4 : 0);
        if (f10 >= -1.0f) {
            if (f10 <= 0.0f) {
                view.setAlpha(1.0f);
                f11 = 180.0f;
                view.setRotationX(((1.0f - Math.abs(f10)) + 1.0f) * 180.0f);
                sb2 = new StringBuilder();
                str = "position <= 0     ";
            } else if (f10 <= 1.0f) {
                view.setAlpha(1.0f);
                f11 = -180.0f;
                view.setRotationX(((1.0f - Math.abs(f10)) + 1.0f) * -180.0f);
                sb2 = new StringBuilder();
                str = "position <= 1     ";
            }
            sb2.append(str);
            sb2.append(((1.0f - Math.abs(f10)) + 1.0f) * f11);
            Log.e("HORIZONTAL", sb2.toString());
            return;
        }
        view.setAlpha(0.0f);
    }
}
