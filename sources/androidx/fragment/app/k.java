package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.core.view.f0;

abstract class k {

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f3098a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f3099b;

        a(Animator animator) {
            this.f3098a = null;
            this.f3099b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        a(Animation animation) {
            this.f3098a = animation;
            this.f3099b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    static class b extends AnimationSet implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final ViewGroup f3100e;

        /* renamed from: f  reason: collision with root package name */
        private final View f3101f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f3102g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f3103h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f3104i = true;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3100e = viewGroup;
            this.f3101f = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j10, Transformation transformation) {
            this.f3104i = true;
            if (this.f3102g) {
                return !this.f3103h;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f3102g = true;
                f0.a(this.f3100e, this);
            }
            return true;
        }

        public void run() {
            if (this.f3102g || !this.f3104i) {
                this.f3100e.endViewTransition(this.f3101f);
                this.f3103h = true;
                return;
            }
            this.f3104i = false;
            this.f3100e.post(this);
        }

        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f3104i = true;
            if (this.f3102g) {
                return !this.f3103h;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f3102g = true;
                f0.a(this.f3100e, this);
            }
            return true;
        }
    }

    private static int a(i iVar, boolean z10, boolean z11) {
        return z11 ? z10 ? iVar.R() : iVar.S() : z10 ? iVar.x() : iVar.B();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0069 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069 A[SYNTHETIC, Splitter:B:31:0x0069] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.fragment.app.k.a b(android.content.Context r4, androidx.fragment.app.i r5, boolean r6, boolean r7) {
        /*
            int r0 = r5.L()
            int r7 = a(r5, r6, r7)
            r1 = 0
            r5.J1(r1, r1, r1, r1)
            android.view.ViewGroup r1 = r5.L
            r2 = 0
            if (r1 == 0) goto L_0x001e
            int r3 = m0.b.visible_removing_fragment_view_tag
            java.lang.Object r1 = r1.getTag(r3)
            if (r1 == 0) goto L_0x001e
            android.view.ViewGroup r1 = r5.L
            r1.setTag(r3, r2)
        L_0x001e:
            android.view.ViewGroup r1 = r5.L
            if (r1 == 0) goto L_0x0029
            android.animation.LayoutTransition r1 = r1.getLayoutTransition()
            if (r1 == 0) goto L_0x0029
            return r2
        L_0x0029:
            android.view.animation.Animation r1 = r5.D0(r0, r6, r7)
            if (r1 == 0) goto L_0x0035
            androidx.fragment.app.k$a r4 = new androidx.fragment.app.k$a
            r4.<init>((android.view.animation.Animation) r1)
            return r4
        L_0x0035:
            android.animation.Animator r5 = r5.E0(r0, r6, r7)
            if (r5 == 0) goto L_0x0041
            androidx.fragment.app.k$a r4 = new androidx.fragment.app.k$a
            r4.<init>((android.animation.Animator) r5)
            return r4
        L_0x0041:
            if (r7 != 0) goto L_0x0049
            if (r0 == 0) goto L_0x0049
            int r7 = d(r4, r0, r6)
        L_0x0049:
            if (r7 == 0) goto L_0x0085
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r7)
            java.lang.String r6 = "anim"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0069
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)     // Catch:{ NotFoundException -> 0x0067, RuntimeException -> 0x0069 }
            if (r6 == 0) goto L_0x0085
            androidx.fragment.app.k$a r0 = new androidx.fragment.app.k$a     // Catch:{ NotFoundException -> 0x0067, RuntimeException -> 0x0069 }
            r0.<init>((android.view.animation.Animation) r6)     // Catch:{ NotFoundException -> 0x0067, RuntimeException -> 0x0069 }
            return r0
        L_0x0067:
            r4 = move-exception
            throw r4
        L_0x0069:
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r4, r7)     // Catch:{ RuntimeException -> 0x0075 }
            if (r6 == 0) goto L_0x0085
            androidx.fragment.app.k$a r0 = new androidx.fragment.app.k$a     // Catch:{ RuntimeException -> 0x0075 }
            r0.<init>((android.animation.Animator) r6)     // Catch:{ RuntimeException -> 0x0075 }
            return r0
        L_0x0075:
            r6 = move-exception
            if (r5 != 0) goto L_0x0084
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)
            if (r4 == 0) goto L_0x0085
            androidx.fragment.app.k$a r5 = new androidx.fragment.app.k$a
            r5.<init>((android.view.animation.Animation) r4)
            return r5
        L_0x0084:
            throw r6
        L_0x0085:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k.b(android.content.Context, androidx.fragment.app.i, boolean, boolean):androidx.fragment.app.k$a");
    }

    private static int c(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i10});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i10, boolean z10) {
        int i11;
        if (i10 == 4097) {
            return z10 ? m0.a.fragment_open_enter : m0.a.fragment_open_exit;
        }
        if (i10 == 8194) {
            return z10 ? m0.a.fragment_close_enter : m0.a.fragment_close_exit;
        }
        if (i10 == 8197) {
            i11 = z10 ? 16842938 : 16842939;
        } else if (i10 == 4099) {
            return z10 ? m0.a.fragment_fade_enter : m0.a.fragment_fade_exit;
        } else {
            if (i10 != 4100) {
                return -1;
            }
            i11 = z10 ? 16842936 : 16842937;
        }
        return c(context, i11);
    }
}
