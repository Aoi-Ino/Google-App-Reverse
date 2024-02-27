package xk;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import uk.b;
import wk.c;

public class d extends b {

    /* renamed from: g  reason: collision with root package name */
    private c f32754g = new c();

    /* renamed from: h  reason: collision with root package name */
    private int f32755h;

    /* renamed from: i  reason: collision with root package name */
    private int f32756i;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.j(valueAnimator);
        }
    }

    public d(b.a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS")).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS_REVERSE")).intValue();
        int intValue5 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE")).intValue();
        int intValue6 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE_REVERSE")).intValue();
        this.f32754g.c(intValue);
        this.f32754g.d(intValue2);
        this.f32754g.i(intValue3);
        this.f32754g.j(intValue4);
        this.f32754g.k(intValue5);
        this.f32754g.l(intValue6);
        b.a aVar = this.f32735b;
        if (aVar != null) {
            aVar.a(this.f32754g);
        }
    }

    private PropertyValuesHolder n(boolean z10) {
        int i10;
        String str;
        int i11;
        if (z10) {
            i10 = this.f32755h;
            i11 = i10 / 2;
            str = "ANIMATION_RADIUS_REVERSE";
        } else {
            i11 = this.f32755h;
            i10 = i11 / 2;
            str = "ANIMATION_RADIUS";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i11, i10});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private PropertyValuesHolder o(boolean z10) {
        int i10;
        String str;
        int i11 = 0;
        if (z10) {
            str = "ANIMATION_STROKE_REVERSE";
            i11 = this.f32755h;
            i10 = 0;
        } else {
            i10 = this.f32755h;
            str = "ANIMATION_STROKE";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i11, i10});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private boolean p(int i10, int i11, int i12, int i13) {
        return (this.f32738e == i10 && this.f32739f == i11 && this.f32755h == i12 && this.f32756i == i13) ? false : true;
    }

    /* renamed from: g */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a());
        return valueAnimator;
    }

    public d q(int i10, int i11, int i12, int i13) {
        if (this.f32736c != null && p(i10, i11, i12, i13)) {
            this.f32738e = i10;
            this.f32739f = i11;
            this.f32755h = i12;
            this.f32756i = i13;
            ((ValueAnimator) this.f32736c).setValues(new PropertyValuesHolder[]{h(false), h(true), n(false), n(true), o(false), o(true)});
        }
        return this;
    }
}
