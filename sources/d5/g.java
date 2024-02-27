package d5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.b;
import androidx.core.view.m0;
import androidx.core.view.o;
import q4.d;

public class g extends a {

    /* renamed from: g  reason: collision with root package name */
    private final float f9763g;

    /* renamed from: h  reason: collision with root package name */
    private final float f9764h;

    /* renamed from: i  reason: collision with root package name */
    private final float f9765i;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f9766a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f9767b;

        a(boolean z10, int i10) {
            this.f9766a = z10;
            this.f9767b = i10;
        }

        public void onAnimationEnd(Animator animator) {
            g.this.f9748b.setTranslationX(0.0f);
            g.this.k(0.0f, this.f9766a, this.f9767b);
        }
    }

    public g(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f9763g = resources.getDimension(d.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f9764h = resources.getDimension(d.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f9765i = resources.getDimension(d.m3_back_progress_side_container_max_scale_y_distance);
    }

    private boolean g(int i10, int i11) {
        return (o.b(i10, m0.B(this.f9748b)) & i11) == i11;
    }

    private int i(boolean z10) {
        ViewGroup.LayoutParams layoutParams = this.f9748b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void f() {
        if (super.b() != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f9748b, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(this.f9748b, View.SCALE_Y, new float[]{1.0f})});
            View view = this.f9748b;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), View.SCALE_Y, new float[]{1.0f})});
                }
            }
            animatorSet.setDuration((long) this.f9751e);
            animatorSet.start();
        }
    }

    public void h(b bVar, int i10, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z10 = bVar.b() == 0;
        boolean g10 = g(i10, 3);
        float width = (((float) this.f9748b.getWidth()) * this.f9748b.getScaleX()) + ((float) i(g10));
        View view = this.f9748b;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (g10) {
            width = -width;
        }
        fArr[0] = width;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new p0.b());
        ofFloat.setDuration((long) r4.a.c(this.f9749c, this.f9750d, bVar.a()));
        ofFloat.addListener(new a(z10, i10));
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void j(b bVar) {
        super.d(bVar);
    }

    public void k(float f10, boolean z10, int i10) {
        float a10 = a(f10);
        boolean g10 = g(i10, 3);
        boolean z11 = z10 == g10;
        int width = this.f9748b.getWidth();
        int height = this.f9748b.getHeight();
        float f11 = (float) width;
        if (f11 > 0.0f) {
            float f12 = (float) height;
            if (f12 > 0.0f) {
                float f13 = this.f9763g / f11;
                float f14 = this.f9764h / f11;
                float f15 = this.f9765i / f12;
                View view = this.f9748b;
                if (g10) {
                    f11 = 0.0f;
                }
                view.setPivotX(f11);
                if (!z11) {
                    f14 = -f13;
                }
                float a11 = r4.a.a(0.0f, f14, a10);
                float f16 = a11 + 1.0f;
                this.f9748b.setScaleX(f16);
                float a12 = 1.0f - r4.a.a(0.0f, f15, a10);
                this.f9748b.setScaleY(a12);
                View view2 = this.f9748b;
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        childAt.setPivotX((float) (g10 ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft()));
                        childAt.setPivotY((float) (-childAt.getTop()));
                        float f17 = z11 ? 1.0f - a11 : 1.0f;
                        float f18 = a12 != 0.0f ? (f16 / a12) * f17 : 1.0f;
                        childAt.setScaleX(f17);
                        childAt.setScaleY(f18);
                    }
                }
            }
        }
    }

    public void l(b bVar, int i10) {
        if (super.e(bVar) != null) {
            k(bVar.a(), bVar.b() == 0, i10);
        }
    }
}
