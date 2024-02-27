package r4;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private long f15594a;

    /* renamed from: b  reason: collision with root package name */
    private long f15595b;

    /* renamed from: c  reason: collision with root package name */
    private TimeInterpolator f15596c;

    /* renamed from: d  reason: collision with root package name */
    private int f15597d;

    /* renamed from: e  reason: collision with root package name */
    private int f15598e;

    public g(long j10, long j11) {
        this.f15596c = null;
        this.f15597d = 0;
        this.f15598e = 1;
        this.f15594a = j10;
        this.f15595b = j11;
    }

    static g b(ValueAnimator valueAnimator) {
        g gVar = new g(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        gVar.f15597d = valueAnimator.getRepeatCount();
        gVar.f15598e = valueAnimator.getRepeatMode();
        return gVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return a.f15583b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return a.f15584c;
        }
        return interpolator instanceof DecelerateInterpolator ? a.f15585d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f15594a;
    }

    public long d() {
        return this.f15595b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f15596c;
        return timeInterpolator != null ? timeInterpolator : a.f15583b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (c() == gVar.c() && d() == gVar.d() && g() == gVar.g() && h() == gVar.h()) {
            return e().getClass().equals(gVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f15597d;
    }

    public int h() {
        return this.f15598e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public g(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f15597d = 0;
        this.f15598e = 1;
        this.f15594a = j10;
        this.f15595b = j11;
        this.f15596c = timeInterpolator;
    }
}
