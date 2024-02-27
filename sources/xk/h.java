package xk;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import uk.b;
import wk.e;

public class h extends a {

    /* renamed from: d  reason: collision with root package name */
    private e f32773d = new e();

    /* renamed from: e  reason: collision with root package name */
    private int f32774e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f32775f = -1;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.this.j(valueAnimator);
        }
    }

    public h(b.a aVar) {
        super(aVar);
    }

    private PropertyValuesHolder h() {
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", new int[]{this.f32774e, this.f32775f});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private boolean i(int i10, int i11) {
        return (this.f32774e == i10 && this.f32775f == i11) ? false : true;
    }

    /* access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        this.f32773d.b(((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue());
        b.a aVar = this.f32735b;
        if (aVar != null) {
            aVar.a(this.f32773d);
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
    public h d(float f10) {
        Animator animator = this.f32736c;
        if (animator != null) {
            long j10 = (long) (f10 * ((float) this.f32734a));
            if (((ValueAnimator) animator).getValues() != null && ((ValueAnimator) this.f32736c).getValues().length > 0) {
                ((ValueAnimator) this.f32736c).setCurrentPlayTime(j10);
            }
        }
        return this;
    }

    public h l(int i10, int i11) {
        if (this.f32736c != null && i(i10, i11)) {
            this.f32774e = i10;
            this.f32775f = i11;
            ((ValueAnimator) this.f32736c).setValues(new PropertyValuesHolder[]{h()});
        }
        return this;
    }
}
