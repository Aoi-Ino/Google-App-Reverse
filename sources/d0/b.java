package d0;

import android.util.SparseArray;
import android.view.View;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray f9659a = new SparseArray();

    public static Object a(View view, Object obj, int i10) {
        Object tag = view.getTag(i10);
        view.setTag(i10, obj);
        return tag;
    }
}
