package xk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Iterator;
import uk.b;

public class c extends a {

    /* renamed from: d  reason: collision with root package name */
    private int f32741d;

    /* renamed from: e  reason: collision with root package name */
    private int f32742e;

    /* renamed from: f  reason: collision with root package name */
    private int f32743f;

    /* renamed from: g  reason: collision with root package name */
    private int f32744g;

    /* renamed from: h  reason: collision with root package name */
    private int f32745h;

    /* renamed from: i  reason: collision with root package name */
    private wk.b f32746i = new wk.b();

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0381c f32747a;

        a(C0381c cVar) {
            this.f32747a = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            c.this.k(valueAnimator, this.f32747a);
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f32749a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                xk.c$c[] r0 = xk.c.C0381c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32749a = r0
                xk.c$c r1 = xk.c.C0381c.Width     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32749a     // Catch:{ NoSuchFieldError -> 0x001d }
                xk.c$c r1 = xk.c.C0381c.Height     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32749a     // Catch:{ NoSuchFieldError -> 0x0028 }
                xk.c$c r1 = xk.c.C0381c.Radius     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xk.c.b.<clinit>():void");
        }
    }

    /* renamed from: xk.c$c  reason: collision with other inner class name */
    private enum C0381c {
        Width,
        Height,
        Radius
    }

    public c(b.a aVar) {
        super(aVar);
    }

    private ValueAnimator h(int i10, int i11, long j10, C0381c cVar) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i10, i11});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j10);
        ofInt.addUpdateListener(new a(cVar));
        return ofInt;
    }

    private boolean j(int i10, int i11, int i12, int i13, int i14) {
        return (this.f32741d == i10 && this.f32742e == i11 && this.f32743f == i12 && this.f32744g == i13 && this.f32745h == i14) ? false : true;
    }

    /* access modifiers changed from: private */
    public void k(ValueAnimator valueAnimator, C0381c cVar) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i10 = b.f32749a[cVar.ordinal()];
        if (i10 == 1) {
            this.f32746i.f(intValue);
        } else if (i10 == 2) {
            this.f32746i.d(intValue);
        } else if (i10 == 3) {
            this.f32746i.e(intValue);
        }
        b.a aVar = this.f32735b;
        if (aVar != null) {
            aVar.a(this.f32746i);
        }
    }

    /* renamed from: g */
    public AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public c i(long j10) {
        super.b(j10);
        return this;
    }

    /* renamed from: l */
    public c d(float f10) {
        Animator animator = this.f32736c;
        if (animator != null) {
            long j10 = (long) (f10 * ((float) this.f32734a));
            Iterator<Animator> it = ((AnimatorSet) animator).getChildAnimations().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) it.next();
                long duration = valueAnimator.getDuration();
                long j11 = z10 ? j10 - duration : j10;
                if (j11 >= 0) {
                    if (j11 >= duration) {
                        j11 = duration;
                    }
                    if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                        valueAnimator.setCurrentPlayTime(j11);
                    }
                    if (!z10 && duration >= this.f32734a) {
                        z10 = true;
                    }
                }
            }
        }
        return this;
    }

    public c m(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i14;
        if (j(i10, i11, i12, i13, i14)) {
            this.f32736c = a();
            int i16 = i10;
            this.f32741d = i16;
            int i17 = i11;
            this.f32742e = i17;
            this.f32743f = i12;
            this.f32744g = i13;
            this.f32745h = i15;
            int i18 = (int) (((double) i15) / 1.5d);
            long j10 = this.f32734a;
            ValueAnimator h10 = h(i16, i17, j10, C0381c.Width);
            C0381c cVar = C0381c.Height;
            long j11 = j10 / 2;
            ValueAnimator h11 = h(i12, i13, j11, cVar);
            C0381c cVar2 = C0381c.Radius;
            ValueAnimator h12 = h(i13, i12, j11, cVar);
            ValueAnimator h13 = h(i18, i14, j11, cVar2);
            ((AnimatorSet) this.f32736c).play(h11).with(h(i14, i18, j11, cVar2)).with(h10).before(h12).before(h13);
        }
        return this;
    }
}
