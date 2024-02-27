package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import r4.b;
import r4.g;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: g  reason: collision with root package name */
    private final g f6602g = new g(75, 150);

    /* renamed from: h  reason: collision with root package name */
    private final g f6603h = new g(0, 150);

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f6604a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f6605b;

        a(boolean z10, View view) {
            this.f6604a = z10;
            this.f6605b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f6604a) {
                this.f6605b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f6604a) {
                this.f6605b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    private void O(View view, boolean z10, boolean z11, List list, List list2) {
        ObjectAnimator objectAnimator;
        g gVar = z10 ? this.f6602g : this.f6603h;
        if (z10) {
            if (!z11) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        gVar.a(objectAnimator);
        list.add(objectAnimator);
    }

    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.H(coordinatorLayout, view, motionEvent);
    }

    /* access modifiers changed from: protected */
    public AnimatorSet N(View view, View view2, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        O(view2, z10, z11, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2));
        return animatorSet;
    }

    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
