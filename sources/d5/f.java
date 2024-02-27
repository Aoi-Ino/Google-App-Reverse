package d5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import p0.b;
import q4.d;

public class f extends a {

    /* renamed from: g  reason: collision with root package name */
    private final float f9760g;

    /* renamed from: h  reason: collision with root package name */
    private final float f9761h;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            f.this.f9748b.setTranslationY(0.0f);
            f.this.k(0.0f);
        }
    }

    public f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f9760g = resources.getDimension(d.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f9761h = resources.getDimension(d.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    private Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f9748b, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(this.f9748b, View.SCALE_Y, new float[]{1.0f})});
        View view = this.f9748b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), View.SCALE_Y, new float[]{1.0f})});
            }
        }
        animatorSet.setInterpolator(new b());
        return animatorSet;
    }

    public void f() {
        if (super.b() != null) {
            Animator g10 = g();
            g10.setDuration((long) this.f9751e);
            g10.start();
        }
    }

    public void h(androidx.activity.b bVar, Animator.AnimatorListener animatorListener) {
        float height = ((float) this.f9748b.getHeight()) * this.f9748b.getScaleY();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f9748b, View.TRANSLATION_Y, new float[]{height});
        ofFloat.setInterpolator(new b());
        ofFloat.setDuration((long) r4.a.c(this.f9749c, this.f9750d, bVar.a()));
        ofFloat.addListener(new a());
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void i(androidx.activity.b bVar, Animator.AnimatorListener animatorListener) {
        Animator g10 = g();
        g10.setDuration((long) r4.a.c(this.f9749c, this.f9750d, bVar.a()));
        if (animatorListener != null) {
            g10.addListener(animatorListener);
        }
        g10.start();
    }

    public void j(androidx.activity.b bVar) {
        super.d(bVar);
    }

    public void k(float f10) {
        float a10 = a(f10);
        float width = (float) this.f9748b.getWidth();
        float height = (float) this.f9748b.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float a11 = 1.0f - r4.a.a(0.0f, this.f9760g / width, a10);
            float a12 = 1.0f - r4.a.a(0.0f, this.f9761h / height, a10);
            this.f9748b.setScaleX(a11);
            this.f9748b.setPivotY(height);
            this.f9748b.setScaleY(a12);
            View view = this.f9748b;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    childAt.setPivotY((float) (-childAt.getTop()));
                    childAt.setScaleY(a12 != 0.0f ? a11 / a12 : 1.0f);
                }
            }
        }
    }

    public void l(androidx.activity.b bVar) {
        if (super.e(bVar) != null) {
            k(bVar.a());
        }
    }
}
