package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f6177a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private b f6178b = null;

    /* renamed from: c  reason: collision with root package name */
    ValueAnimator f6179c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Animator.AnimatorListener f6180d = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            m mVar = m.this;
            if (mVar.f6179c == animator) {
                mVar.f6179c = null;
            }
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int[] f6182a;

        /* renamed from: b  reason: collision with root package name */
        final ValueAnimator f6183b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f6182a = iArr;
            this.f6183b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f6180d);
        this.f6177a.add(bVar);
    }
}
