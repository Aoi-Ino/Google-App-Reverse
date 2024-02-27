package ni;

import android.view.View;
import android.widget.LinearLayout;

public final class nb {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f27677a;

    private nb(LinearLayout linearLayout) {
        this.f27677a = linearLayout;
    }

    public static nb a(View view) {
        if (view != null) {
            return new nb((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }
}
