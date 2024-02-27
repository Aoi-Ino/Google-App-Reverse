package dl;

import android.content.res.Resources;
import android.util.TypedValue;

public abstract class b {
    public static int a(int i10) {
        return (int) TypedValue.applyDimension(1, (float) i10, Resources.getSystem().getDisplayMetrics());
    }
}
