package g5;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f11634a = true;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f11635b = {16842919};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f11636c = {16843623, 16842908};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f11637d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f11638e = {16843623};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f11639f = {16842913, 16842919};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f11640g = {16842913, 16843623, 16842908};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f11641h = {16842913, 16842908};

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f11642i = {16842913, 16843623};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f11643j = {16842913};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f11644k = {16842910, 16842919};

    /* renamed from: l  reason: collision with root package name */
    static final String f11645l = b.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f11644k, 0)) != 0) {
            Log.w(f11645l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean b(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
