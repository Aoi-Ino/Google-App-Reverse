package ni;

import android.view.View;
import android.widget.RelativeLayout;

public final class sc {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f28568a;

    private sc(RelativeLayout relativeLayout) {
        this.f28568a = relativeLayout;
    }

    public static sc a(View view) {
        if (view != null) {
            return new sc((RelativeLayout) view);
        }
        throw new NullPointerException("rootView");
    }
}
