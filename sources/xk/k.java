package xk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Iterator;
import uk.b;
import wk.h;

public class k extends a {

    /* renamed from: d  reason: collision with root package name */
    int f32783d;

    /* renamed from: e  reason: collision with root package name */
    int f32784e;

    /* renamed from: f  reason: collision with root package name */
    int f32785f;

    /* renamed from: g  reason: collision with root package name */
    boolean f32786g;

    /* renamed from: h  reason: collision with root package name */
    int f32787h;

    /* renamed from: i  reason: collision with root package name */
    int f32788i;

    /* renamed from: j  reason: collision with root package name */
    private h f32789j = new h();

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f32790a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f32791b;

        a(h hVar, boolean z10) {
            this.f32790a = hVar;
            this.f32791b = z10;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            k.this.l(this.f32790a, valueAnimator, this.f32791b);
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        final int f32793a;

        /* renamed from: b  reason: collision with root package name */
        final int f32794b;

        /* renamed from: c  reason: collision with root package name */
        final int f32795c;

        /* renamed from: d  reason: collision with root package name */
        final int f32796d;

        b(int i10, int i11, int i12, int i13) {
            this.f32793a = i10;
            this.f32794b = i11;
            this.f32795c = i12;
            this.f32796d = i13;
        }
    }

    public k(b.a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: private */
    public void l(h hVar, ValueAnimator valueAnimator, boolean z10) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (!this.f32786g ? z10 : !z10) {
            hVar.c(intValue);
        } else {
            hVar.d(intValue);
        }
        b.a aVar = this.f32735b;
        if (aVar != null) {
            aVar.a(hVar);
        }
    }

    /* renamed from: g */
    public AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    public b h(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (z10) {
            int i14 = this.f32783d;
            int i15 = this.f32785f;
            i10 = i14 + i15;
            int i16 = this.f32784e;
            i11 = i16 + i15;
            i12 = i14 - i15;
            i13 = i16 - i15;
        } else {
            int i17 = this.f32783d;
            int i18 = this.f32785f;
            i10 = i17 - i18;
            int i19 = this.f32784e;
            i11 = i19 - i18;
            i12 = i17 + i18;
            i13 = i19 + i18;
        }
        return new b(i10, i11, i12, i13);
    }

    /* access modifiers changed from: package-private */
    public ValueAnimator i(int i10, int i11, long j10, boolean z10, h hVar) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i10, i11});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j10);
        ofInt.addUpdateListener(new a(hVar, z10));
        return ofInt;
    }

    public k j(long j10) {
        super.b(j10);
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean k(int i10, int i11, int i12, boolean z10) {
        return (this.f32783d == i10 && this.f32784e == i11 && this.f32785f == i12 && this.f32786g == z10) ? false : true;
    }

    /* renamed from: m */
    public k d(float f10) {
        Animator animator = this.f32736c;
        if (animator == null) {
            return this;
        }
        long j10 = (long) (f10 * ((float) this.f32734a));
        Iterator<Animator> it = ((AnimatorSet) animator).getChildAnimations().iterator();
        while (it.hasNext()) {
            ValueAnimator valueAnimator = (ValueAnimator) it.next();
            long duration = valueAnimator.getDuration();
            if (j10 <= duration) {
                duration = j10;
            }
            valueAnimator.setCurrentPlayTime(duration);
            j10 -= duration;
        }
        return this;
    }

    public k n(int i10, int i11, int i12, boolean z10) {
        if (k(i10, i11, i12, z10)) {
            this.f32736c = a();
            this.f32783d = i10;
            this.f32784e = i11;
            this.f32785f = i12;
            this.f32786g = z10;
            int i13 = i10 - i12;
            this.f32787h = i13;
            this.f32788i = i10 + i12;
            this.f32789j.d(i13);
            this.f32789j.c(this.f32788i);
            b h10 = h(z10);
            long j10 = this.f32734a / 2;
            ((AnimatorSet) this.f32736c).playSequentially(new Animator[]{i(h10.f32793a, h10.f32794b, j10, false, this.f32789j), i(h10.f32795c, h10.f32796d, j10, true, this.f32789j)});
        }
        return this;
    }
}
