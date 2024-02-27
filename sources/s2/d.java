package s2;

import android.content.Context;
import android.util.TypedValue;

public abstract class d {
    public static int a(Context context, int i10) {
        return (int) TypedValue.applyDimension(1, (float) i10, context.getResources().getDisplayMetrics());
    }
}
