package xk;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import uk.b;
import wk.d;

public class f extends b {

    /* renamed from: g  reason: collision with root package name */
    int f32769g;

    /* renamed from: h  reason: collision with root package name */
    float f32770h;

    /* renamed from: i  reason: collision with root package name */
    private d f32771i = new d();

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.j(valueAnimator);
        }
    }

    public f(b.a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE")).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE_REVERSE")).intValue();
        this.f32771i.c(intValue);
        this.f32771i.d(intValue2);
        this.f32771i.g(intValue3);
        this.f32771i.h(intValue4);
        b.a aVar = this.f32735b;
        if (aVar != null) {
            aVar.a(this.f32771i);
        }
    }

    private boolean o(int i10, int i11, int i12, float f10) {
        return (this.f32738e == i10 && this.f32739f == i11 && this.f32769g == i12 && this.f32770h == f10) ? false : true;
    }

    /* renamed from: g */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a());
        return valueAnimator;
    }

    /* access modifiers changed from: protected */
    public PropertyValuesHolder n(boolean z10) {
        int i10;
        String str;
        int i11;
        if (z10) {
            i10 = this.f32769g;
            i11 = (int) (((float) i10) * this.f32770h);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i11 = this.f32769g;
            i10 = (int) (((float) i11) * this.f32770h);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i10, i11});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    public f p(int i10, int i11, int i12, float f10) {
        if (this.f32736c != null && o(i10, i11, i12, f10)) {
            this.f32738e = i10;
            this.f32739f = i11;
            this.f32769g = i12;
            this.f32770h = f10;
            ((ValueAnimator) this.f32736c).setValues(new PropertyValuesHolder[]{h(false), h(true), n(false), n(true)});
        }
        return this;
    }
}
