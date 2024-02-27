package l5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import f5.b;
import f5.c;
import q4.k;

public class a extends AppCompatTextView {
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private void r(Resources.Theme theme, int i10) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, k.f14992c4);
        int v10 = v(getContext(), obtainStyledAttributes, k.f15012e4, k.f15022f4);
        obtainStyledAttributes.recycle();
        if (v10 >= 0) {
            setLineHeight(v10);
        }
    }

    private static boolean s(Context context) {
        return b.b(context, q4.b.textAppearanceLineHeightEnabled, true);
    }

    private static int t(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f15032g4, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(k.f15042h4, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private void u(AttributeSet attributeSet, int i10, int i11) {
        int t10;
        Context context = getContext();
        if (s(context)) {
            Resources.Theme theme = context.getTheme();
            if (!w(context, theme, attributeSet, i10, i11) && (t10 = t(theme, attributeSet, i10, i11)) != -1) {
                r(theme, t10);
            }
        }
    }

    private static int v(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            i10 = c.c(context, typedArray, iArr[i11], -1);
        }
        return i10;
    }

    private static boolean w(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f15032g4, i10, i11);
        int v10 = v(context, obtainStyledAttributes, k.f15052i4, k.f15062j4);
        obtainStyledAttributes.recycle();
        return v10 != -1;
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (s(context)) {
            r(context.getTheme(), i10);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(m5.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        u(attributeSet, i10, 0);
    }
}
