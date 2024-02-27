package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

public abstract class a1 {

    static class a {
        static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
        } else {
            d1.h(view, charSequence);
        }
    }
}
