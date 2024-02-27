package i1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.m0;

public class d extends n0 {

    class a extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f12131a;

        a(View view) {
            this.f12131a = view;
        }

        public void e(l lVar) {
            a0.g(this.f12131a, 1.0f);
            a0.a(this.f12131a);
            lVar.W(this);
        }
    }

    private static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f12133a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f12134b = false;

        b(View view) {
            this.f12133a = view;
        }

        public void onAnimationEnd(Animator animator) {
            a0.g(this.f12133a, 1.0f);
            if (this.f12134b) {
                this.f12133a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (m0.Q(this.f12133a) && this.f12133a.getLayerType() == 0) {
                this.f12134b = true;
                this.f12133a.setLayerType(2, (Paint) null);
            }
        }
    }

    public d() {
    }

    private Animator s0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        a0.g(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, a0.f12103b, new float[]{f11});
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f12221a.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float t0(i1.s r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map r1 = r1.f12221a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.d.t0(i1.s, float):float");
    }

    public void i(s sVar) {
        super.i(sVar);
        sVar.f12221a.put("android:fade:transitionAlpha", Float.valueOf(a0.c(sVar.f12222b)));
    }

    public Animator n0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float f10 = 0.0f;
        float t02 = t0(sVar, 0.0f);
        if (t02 != 1.0f) {
            f10 = t02;
        }
        return s0(view, f10, 1.0f);
    }

    public Animator p0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        a0.e(view);
        return s0(view, t0(sVar, 1.0f), 0.0f);
    }

    public d(int i10) {
        r0(i10);
    }
}
