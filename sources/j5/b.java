package j5;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f12735a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup.MarginLayoutParams f12736b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f12737c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f12738d;

    public /* synthetic */ b(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, View view) {
        this.f12735a = sideSheetBehavior;
        this.f12736b = marginLayoutParams;
        this.f12737c = i10;
        this.f12738d = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f12735a.y0(this.f12736b, this.f12737c, this.f12738d, valueAnimator);
    }
}
