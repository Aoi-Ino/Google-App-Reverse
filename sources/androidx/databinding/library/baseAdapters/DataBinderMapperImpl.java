package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.d;
import androidx.databinding.e;
import androidx.databinding.h;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f2795a = new SparseIntArray(0);

    public List a() {
        return new ArrayList(0);
    }

    public h b(e eVar, View view, int i10) {
        if (f2795a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public h c(e eVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f2795a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
