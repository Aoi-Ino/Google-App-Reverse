package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.m0;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import q4.b;
import q4.j;

public abstract class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: b0  reason: collision with root package name */
    private static final int f5590b0 = j.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: c0  reason: collision with root package name */
    private static final int f5591c0 = b.motionDurationLong2;

    /* renamed from: d0  reason: collision with root package name */
    private static final int f5592d0 = b.motionEasingEmphasizedInterpolator;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: q  reason: collision with root package name */
        private final Rect f5593q = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public WeakReference f5594r;

        /* renamed from: s  reason: collision with root package name */
        private int f5595s;

        /* renamed from: t  reason: collision with root package name */
        private final View.OnLayoutChangeListener f5596t = new a();

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                android.support.v4.media.session.b.a(Behavior.this.f5594r.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
        }

        public /* bridge */ /* synthetic */ boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            android.support.v4.media.session.b.a(view);
            return T(coordinatorLayout, (BottomAppBar) null, view2, view3, i10, i11);
        }

        public boolean S(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f5594r = new WeakReference(bottomAppBar);
            View V = BottomAppBar.V(bottomAppBar);
            if (V != null && !m0.U(V)) {
                BottomAppBar.a0(bottomAppBar, V);
                this.f5595s = ((CoordinatorLayout.f) V.getLayoutParams()).bottomMargin;
                if (V instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) V;
                    if (BottomAppBar.Z(bottomAppBar) == 0 && BottomAppBar.X(bottomAppBar)) {
                        m0.y0(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(q4.a.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(q4.a.mtrl_fab_hide_motion_spec);
                    }
                    BottomAppBar.Y(bottomAppBar, floatingActionButton);
                }
                V.addOnLayoutChangeListener(this.f5596t);
                BottomAppBar.U(bottomAppBar);
            }
            coordinatorLayout.I(bottomAppBar, i10);
            return super.p(coordinatorLayout, bottomAppBar, i10);
        }

        public boolean T(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            throw null;
        }

        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
            android.support.v4.media.session.b.a(view);
            return S(coordinatorLayout, (BottomAppBar) null, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static /* synthetic */ void U(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ View V(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ boolean X(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ void Y(BottomAppBar bottomAppBar, FloatingActionButton floatingActionButton) {
        throw null;
    }

    static /* synthetic */ int Z(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* access modifiers changed from: private */
    public static void a0(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.f) view.getLayoutParams()).f2173d = 17;
        throw null;
    }
}
