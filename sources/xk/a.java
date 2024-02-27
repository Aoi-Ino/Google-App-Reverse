package xk;

import android.animation.Animator;
import android.animation.ValueAnimator;
import uk.b;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected long f32734a = 350;

    /* renamed from: b  reason: collision with root package name */
    protected b.a f32735b;

    /* renamed from: c  reason: collision with root package name */
    protected Animator f32736c;

    public a(b.a aVar) {
        this.f32735b = aVar;
        this.f32736c = a();
    }

    public abstract Animator a();

    public a b(long j10) {
        this.f32734a = j10;
        Animator animator = this.f32736c;
        if (animator instanceof ValueAnimator) {
            animator.setDuration(j10);
        }
        return this;
    }

    public void c() {
        Animator animator = this.f32736c;
        if (animator != null && animator.isStarted()) {
            this.f32736c.end();
        }
    }

    public abstract a d(float f10);

    public void e() {
        Animator animator = this.f32736c;
        if (animator != null && !animator.isRunning()) {
            this.f32736c.start();
        }
    }
}
