package xk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import uk.b;
import wk.g;
import xk.k;

public class j extends k {

    /* renamed from: k  reason: collision with root package name */
    private g f32781k = new g();

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            j.this.r(valueAnimator);
        }
    }

    public j(b.a aVar) {
        super(aVar);
    }

    private ValueAnimator p(int i10, int i11, long j10) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i10, i11});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j10);
        ofInt.addUpdateListener(new a());
        return ofInt;
    }

    /* access modifiers changed from: private */
    public void r(ValueAnimator valueAnimator) {
        this.f32781k.f(((Integer) valueAnimator.getAnimatedValue()).intValue());
        b.a aVar = this.f32735b;
        if (aVar != null) {
            aVar.a(this.f32781k);
        }
    }

    public k n(int i10, int i11, int i12, boolean z10) {
        int i13 = i10;
        int i14 = i12;
        boolean z11 = z10;
        if (k(i10, i11, i12, z10)) {
            this.f32736c = a();
            this.f32783d = i13;
            this.f32784e = i11;
            this.f32785f = i14;
            this.f32786g = z11;
            int i15 = i14 * 2;
            int i16 = i13 - i14;
            this.f32787h = i16;
            this.f32788i = i13 + i14;
            this.f32781k.d(i16);
            this.f32781k.c(this.f32788i);
            this.f32781k.f(i15);
            k.b h10 = h(z11);
            long j10 = this.f32734a;
            long j11 = (long) (((double) j10) * 0.8d);
            long j12 = (long) (((double) j10) * 0.2d);
            long j13 = (long) (((double) j10) * 0.5d);
            long j14 = (long) (((double) j10) * 0.5d);
            long j15 = j11;
            ValueAnimator i17 = i(h10.f32793a, h10.f32794b, j15, false, this.f32781k);
            ValueAnimator i18 = i(h10.f32795c, h10.f32796d, j15, true, this.f32781k);
            i18.setStartDelay(j12);
            long j16 = j14;
            ValueAnimator p10 = p(i15, i14, j16);
            ValueAnimator p11 = p(i14, i15, j16);
            p11.setStartDelay(j13);
            ((AnimatorSet) this.f32736c).playTogether(new Animator[]{i17, i18, p10, p11});
        }
        return this;
    }

    /* renamed from: q */
    public j j(long j10) {
        super.j(j10);
        return this;
    }

    /* renamed from: s */
    public j m(float f10) {
        Animator animator = this.f32736c;
        if (animator != null) {
            long j10 = (long) (f10 * ((float) this.f32734a));
            int size = ((AnimatorSet) animator).getChildAnimations().size();
            for (int i10 = 0; i10 < size; i10++) {
                ValueAnimator valueAnimator = (ValueAnimator) ((AnimatorSet) this.f32736c).getChildAnimations().get(i10);
                long startDelay = j10 - valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration();
                if (startDelay > duration) {
                    startDelay = duration;
                } else if (startDelay < 0) {
                    startDelay = 0;
                }
                if ((i10 != size - 1 || startDelay > 0) && valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                    valueAnimator.setCurrentPlayTime(startDelay);
                }
            }
        }
        return this;
    }
}
