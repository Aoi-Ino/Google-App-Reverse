package xk;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import uk.b;

public class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private wk.a f32737d = new wk.a();

    /* renamed from: e  reason: collision with root package name */
    int f32738e;

    /* renamed from: f  reason: collision with root package name */
    int f32739f;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.j(valueAnimator);
        }
    }

    public b(b.a aVar) {
        super(aVar);
    }

    private boolean i(int i10, int i11) {
        return (this.f32738e == i10 && this.f32739f == i11) ? false : true;
    }

    /* access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        this.f32737d.c(intValue);
        this.f32737d.d(intValue2);
        b.a aVar = this.f32735b;
        if (aVar != null) {
            aVar.a(this.f32737d);
        }
    }

    /* renamed from: g */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a());
        return valueAnimator;
    }

    /* access modifiers changed from: package-private */
    public PropertyValuesHolder h(boolean z10) {
        int i10;
        String str;
        int i11;
        if (z10) {
            i10 = this.f32739f;
            i11 = this.f32738e;
            str = "ANIMATION_COLOR_REVERSE";
        } else {
            i10 = this.f32738e;
            i11 = this.f32739f;
            str = "ANIMATION_COLOR";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i10, i11});
        ofInt.setEvaluator(new ArgbEvaluator());
        return ofInt;
    }

    /* renamed from: k */
    public b d(float f10) {
        Animator animator = this.f32736c;
        if (animator != null) {
            long j10 = (long) (f10 * ((float) this.f32734a));
            if (((ValueAnimator) animator).getValues() != null && ((ValueAnimator) this.f32736c).getValues().length > 0) {
                ((ValueAnimator) this.f32736c).setCurrentPlayTime(j10);
            }
        }
        return this;
    }

    public b l(int i10, int i11) {
        if (this.f32736c != null && i(i10, i11)) {
            this.f32738e = i10;
            this.f32739f = i11;
            ((ValueAnimator) this.f32736c).setValues(new PropertyValuesHolder[]{h(false), h(true)});
        }
        return this;
    }
}
