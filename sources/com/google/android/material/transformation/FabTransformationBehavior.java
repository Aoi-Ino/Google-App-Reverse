package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.m0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import r4.c;
import r4.f;
import r4.g;
import r4.h;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: g  reason: collision with root package name */
    private final Rect f6590g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    private final RectF f6591h = new RectF();

    /* renamed from: i  reason: collision with root package name */
    private final RectF f6592i = new RectF();

    /* renamed from: j  reason: collision with root package name */
    private final int[] f6593j = new int[2];

    /* renamed from: k  reason: collision with root package name */
    private float f6594k;

    /* renamed from: l  reason: collision with root package name */
    private float f6595l;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f6596a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f6597b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f6598c;

        a(boolean z10, View view, View view2) {
            this.f6596a = z10;
            this.f6597b = view;
            this.f6598c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f6596a) {
                this.f6597b.setVisibility(4);
                this.f6598c.setAlpha(1.0f);
                this.f6598c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f6596a) {
                this.f6597b.setVisibility(0);
                this.f6598c.setAlpha(0.0f);
                this.f6598c.setVisibility(4);
            }
        }
    }

    protected static class b {

        /* renamed from: a  reason: collision with root package name */
        public f f6600a;

        /* renamed from: b  reason: collision with root package name */
        public h f6601b;

        protected b() {
        }
    }

    public FabTransformationBehavior() {
    }

    private ViewGroup O(View view) {
        View findViewById = view.findViewById(q4.f.mtrl_child_content_container);
        return findViewById != null ? e0(findViewById) : e0(view);
    }

    private void P(View view, b bVar, g gVar, g gVar2, float f10, float f11, float f12, float f13, RectF rectF) {
        float U = U(bVar, gVar, f10, f12);
        float U2 = U(bVar, gVar2, f11, f13);
        Rect rect = this.f6590g;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f6591h;
        rectF2.set(rect);
        RectF rectF3 = this.f6592i;
        V(view, rectF3);
        rectF3.offset(U, U2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void Q(View view, RectF rectF) {
        V(view, rectF);
        rectF.offset(this.f6594k, this.f6595l);
    }

    private Pair R(float f10, float f11, boolean z10, b bVar) {
        g e10;
        f fVar;
        String str;
        int i10;
        if (f10 == 0.0f || f11 == 0.0f) {
            e10 = bVar.f6600a.e("translationXLinear");
            fVar = bVar.f6600a;
            str = "translationYLinear";
        } else if ((!z10 || f11 >= 0.0f) && (z10 || i10 <= 0)) {
            e10 = bVar.f6600a.e("translationXCurveDownwards");
            fVar = bVar.f6600a;
            str = "translationYCurveDownwards";
        } else {
            e10 = bVar.f6600a.e("translationXCurveUpwards");
            fVar = bVar.f6600a;
            str = "translationYCurveUpwards";
        }
        return new Pair(e10, fVar.e(str));
    }

    private float S(View view, View view2, h hVar) {
        float f10;
        float centerX;
        float centerX2;
        RectF rectF = this.f6591h;
        RectF rectF2 = this.f6592i;
        Q(view, rectF);
        V(view2, rectF2);
        int i10 = hVar.f15599a & 7;
        if (i10 == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i10 == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else if (i10 != 5) {
            f10 = 0.0f;
            return f10 + hVar.f15600b;
        } else {
            centerX = rectF2.right;
            centerX2 = rectF.right;
        }
        f10 = centerX - centerX2;
        return f10 + hVar.f15600b;
    }

    private float T(View view, View view2, h hVar) {
        float f10;
        float centerY;
        float centerY2;
        RectF rectF = this.f6591h;
        RectF rectF2 = this.f6592i;
        Q(view, rectF);
        V(view2, rectF2);
        int i10 = hVar.f15599a & 112;
        if (i10 == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i10 == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else if (i10 != 80) {
            f10 = 0.0f;
            return f10 + hVar.f15601c;
        } else {
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        }
        f10 = centerY - centerY2;
        return f10 + hVar.f15601c;
    }

    private float U(b bVar, g gVar, float f10, float f11) {
        long c10 = gVar.c();
        long d10 = gVar.d();
        g e10 = bVar.f6600a.e("expansion");
        return r4.a.a(f10, f11, gVar.e().getInterpolation(((float) (((e10.c() + e10.d()) + 17) - c10)) / ((float) d10)));
    }

    private void V(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f6593j;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private void W(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
        ViewGroup O;
        ObjectAnimator objectAnimator;
        if ((view2 instanceof ViewGroup) && (O = O(view2)) != null) {
            if (z10) {
                if (!z11) {
                    c.f15587a.set(O, Float.valueOf(0.0f));
                }
                objectAnimator = ObjectAnimator.ofFloat(O, c.f15587a, new float[]{1.0f});
            } else {
                objectAnimator = ObjectAnimator.ofFloat(O, c.f15587a, new float[]{0.0f});
            }
            bVar.f6600a.e("contentFade").a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    private void X(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
    }

    private void Y(View view, View view2, boolean z10, b bVar, List list) {
        float S = S(view, view2, bVar.f6601b);
        float T = T(view, view2, bVar.f6601b);
        Pair R = R(S, T, z10, bVar);
        g gVar = (g) R.first;
        g gVar2 = (g) R.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z10) {
            S = this.f6594k;
        }
        fArr[0] = S;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z10) {
            T = this.f6595l;
        }
        fArr2[0] = T;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        gVar.a(ofFloat);
        gVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private void Z(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
        ObjectAnimator objectAnimator;
        float w10 = m0.w(view2) - m0.w(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-w10);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-w10});
        }
        bVar.f6600a.e("elevation").a(objectAnimator);
        list.add(objectAnimator);
    }

    private void a0(View view, View view2, boolean z10, boolean z11, b bVar, float f10, float f11, List list, List list2) {
    }

    private void b0(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
    }

    private void c0(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z12 = z10;
        b bVar2 = bVar;
        List list3 = list;
        float S = S(view3, view4, bVar2.f6601b);
        float T = T(view3, view4, bVar2.f6601b);
        Pair R = R(S, T, z12, bVar2);
        g gVar = (g) R.first;
        g gVar2 = (g) R.second;
        if (z12) {
            if (!z11) {
                view4.setTranslationX(-S);
                view4.setTranslationY(-T);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            P(view2, bVar, gVar, gVar2, -S, -T, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-S});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-T});
        }
        gVar.a(objectAnimator2);
        gVar2.a(objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    private ViewGroup e0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public AnimatorSet N(View view, View view2, boolean z10, boolean z11) {
        boolean z12 = z10;
        b d02 = d0(view2.getContext(), z12);
        if (z12) {
            this.f6594k = view.getTranslationX();
            this.f6595l = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Z(view, view2, z10, z11, d02, arrayList, arrayList2);
        RectF rectF = this.f6591h;
        View view3 = view;
        View view4 = view2;
        boolean z13 = z10;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        c0(view3, view4, z13, z11, d02, arrayList3, arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        Y(view3, view4, z13, d02, arrayList);
        boolean z14 = z11;
        b bVar = d02;
        b0(view3, view4, z13, z14, bVar, arrayList3, arrayList4);
        a0(view3, view4, z13, z14, bVar, width, height, arrayList, arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        X(view3, view4, z13, z14, bVar, arrayList5, arrayList6);
        W(view3, view4, z13, z14, bVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        r4.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z12, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i10));
        }
        return animatorSet;
    }

    /* access modifiers changed from: protected */
    public abstract b d0(Context context, boolean z10);

    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    public void k(CoordinatorLayout.f fVar) {
        if (fVar.f2177h == 0) {
            fVar.f2177h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
