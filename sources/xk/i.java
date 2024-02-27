package xk;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import uk.b;
import wk.f;

public class i extends a {

    /* renamed from: d  reason: collision with root package name */
    private int f32777d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f32778e = -1;

    /* renamed from: f  reason: collision with root package name */
    private f f32779f = new f();

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            i.this.j(valueAnimator);
        }
    }

    public i(b.a aVar) {
        super(aVar);
    }

    private PropertyValuesHolder h(String str, int i10, int i11) {
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i10, i11});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private boolean i(int i10, int i11) {
        return (this.f32777d == i10 && this.f32778e == i11) ? false : true;
    }

    /* access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE_REVERSE")).intValue();
        this.f32779f.c(intValue);
        this.f32779f.d(intValue2);
        b.a aVar = this.f32735b;
        if (aVar != null) {
            aVar.a(this.f32779f);
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

    /* renamed from: k */
    public i d(float f10) {
        Animator animator = this.f32736c;
        if (animator != null) {
            long j10 = (long) (f10 * ((float) this.f32734a));
            if (((ValueAnimator) animator).getValues() != null && ((ValueAnimator) this.f32736c).getValues().length > 0) {
                ((ValueAnimator) this.f32736c).setCurrentPlayTime(j10);
            }
        }
        return this;
    }

    public i l(int i10, int i11) {
        if (this.f32736c != null && i(i10, i11)) {
            this.f32777d = i10;
            this.f32778e = i11;
            ((ValueAnimator) this.f32736c).setValues(new PropertyValuesHolder[]{h("ANIMATION_COORDINATE", i10, i11), h("ANIMATION_COORDINATE_REVERSE", i11, i10)});
        }
        return this;
    }
}
