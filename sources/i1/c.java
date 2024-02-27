package i1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.m0;
import java.util.Map;

public class c extends l {
    private static final String[] P = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property Q;
    private static final Property R;
    private static final Property S;
    private static final Property T;
    private static final Property U;
    private static final Property V;
    private static j W = new j();
    private int[] M = new int[2];
    private boolean N = false;
    private boolean O = false;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f12105a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f12106b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f12107c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f12108d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f12105a = viewGroup;
            this.f12106b = bitmapDrawable;
            this.f12107c = view;
            this.f12108d = f10;
        }

        public void onAnimationEnd(Animator animator) {
            a0.b(this.f12105a).d(this.f12106b);
            a0.g(this.f12107c, this.f12108d);
        }
    }

    class b extends Property {

        /* renamed from: a  reason: collision with root package name */
        private Rect f12110a = new Rect();

        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f12110a);
            Rect rect = this.f12110a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f12110a);
            this.f12110a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f12110a);
        }
    }

    /* renamed from: i1.c$c  reason: collision with other inner class name */
    class C0157c extends Property {
        C0157c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            a0.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    class f extends Property {
        f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            a0.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    class g extends Property {
        g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            a0.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f12111a;
        private k mViewBounds;

        h(k kVar) {
            this.f12111a = kVar;
            this.mViewBounds = kVar;
        }
    }

    class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f12113a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f12114b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f12115c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f12116d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f12117e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f12118f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f12119g;

        i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f12114b = view;
            this.f12115c = rect;
            this.f12116d = i10;
            this.f12117e = i11;
            this.f12118f = i12;
            this.f12119g = i13;
        }

        public void onAnimationCancel(Animator animator) {
            this.f12113a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f12113a) {
                m0.x0(this.f12114b, this.f12115c);
                a0.f(this.f12114b, this.f12116d, this.f12117e, this.f12118f, this.f12119g);
            }
        }
    }

    class j extends m {

        /* renamed from: a  reason: collision with root package name */
        boolean f12121a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f12122b;

        j(ViewGroup viewGroup) {
            this.f12122b = viewGroup;
        }

        public void a(l lVar) {
            x.c(this.f12122b, false);
            this.f12121a = true;
        }

        public void b(l lVar) {
            x.c(this.f12122b, false);
        }

        public void d(l lVar) {
            x.c(this.f12122b, true);
        }

        public void e(l lVar) {
            if (!this.f12121a) {
                x.c(this.f12122b, false);
            }
            lVar.W(this);
        }
    }

    private static class k {

        /* renamed from: a  reason: collision with root package name */
        private int f12124a;

        /* renamed from: b  reason: collision with root package name */
        private int f12125b;

        /* renamed from: c  reason: collision with root package name */
        private int f12126c;

        /* renamed from: d  reason: collision with root package name */
        private int f12127d;

        /* renamed from: e  reason: collision with root package name */
        private View f12128e;

        /* renamed from: f  reason: collision with root package name */
        private int f12129f;

        /* renamed from: g  reason: collision with root package name */
        private int f12130g;

        k(View view) {
            this.f12128e = view;
        }

        private void b() {
            a0.f(this.f12128e, this.f12124a, this.f12125b, this.f12126c, this.f12127d);
            this.f12129f = 0;
            this.f12130g = 0;
        }

        /* access modifiers changed from: package-private */
        public void a(PointF pointF) {
            this.f12126c = Math.round(pointF.x);
            this.f12127d = Math.round(pointF.y);
            int i10 = this.f12130g + 1;
            this.f12130g = i10;
            if (this.f12129f == i10) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(PointF pointF) {
            this.f12124a = Math.round(pointF.x);
            this.f12125b = Math.round(pointF.y);
            int i10 = this.f12129f + 1;
            this.f12129f = i10;
            if (i10 == this.f12130g) {
                b();
            }
        }
    }

    static {
        Class<PointF> cls = PointF.class;
        Q = new b(cls, "boundsOrigin");
        R = new C0157c(cls, "topLeft");
        S = new d(cls, "bottomRight");
        T = new e(cls, "bottomRight");
        U = new f(cls, "topLeft");
        V = new g(cls, "position");
    }

    private void l0(s sVar) {
        View view = sVar.f12222b;
        if (m0.U(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f12221a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f12221a.put("android:changeBounds:parent", sVar.f12222b.getParent());
            if (this.O) {
                sVar.f12222b.getLocationInWindow(this.M);
                sVar.f12221a.put("android:changeBounds:windowX", Integer.valueOf(this.M[0]));
                sVar.f12221a.put("android:changeBounds:windowY", Integer.valueOf(this.M[1]));
            }
            if (this.N) {
                sVar.f12221a.put("android:changeBounds:clip", m0.u(view));
            }
        }
    }

    private boolean m0(View view, View view2) {
        if (!this.O) {
            return true;
        }
        s w10 = w(view, true);
        if (w10 == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == w10.f12222b) {
            return true;
        }
        return false;
    }

    public String[] K() {
        return P;
    }

    public void f(s sVar) {
        l0(sVar);
    }

    public void i(s sVar) {
        l0(sVar);
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        int i10;
        View view;
        Animator animator;
        int i11;
        ObjectAnimator objectAnimator;
        Path a10;
        Property property;
        s sVar3 = sVar;
        s sVar4 = sVar2;
        if (sVar3 == null || sVar4 == null) {
            return null;
        }
        Map map = sVar3.f12221a;
        Map map2 = sVar4.f12221a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar4.f12222b;
        if (m0(viewGroup2, viewGroup3)) {
            Rect rect = (Rect) sVar3.f12221a.get("android:changeBounds:bounds");
            Rect rect2 = (Rect) sVar4.f12221a.get("android:changeBounds:bounds");
            int i12 = rect.left;
            int i13 = rect2.left;
            int i14 = rect.top;
            int i15 = rect2.top;
            int i16 = rect.right;
            int i17 = rect2.right;
            int i18 = rect.bottom;
            int i19 = rect2.bottom;
            int i20 = i16 - i12;
            int i21 = i18 - i14;
            int i22 = i17 - i13;
            int i23 = i19 - i15;
            View view3 = view2;
            Rect rect3 = (Rect) sVar3.f12221a.get("android:changeBounds:clip");
            Rect rect4 = (Rect) sVar4.f12221a.get("android:changeBounds:clip");
            if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
                i10 = 0;
            } else {
                i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
                if (!(i16 == i17 && i18 == i19)) {
                    i10++;
                }
            }
            if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                i10++;
            }
            if (i10 <= 0) {
                return null;
            }
            Rect rect5 = rect4;
            if (!this.N) {
                view = view3;
                a0.f(view, i12, i14, i16, i18);
                if (i10 == 2) {
                    if (i20 == i22 && i21 == i23) {
                        a10 = z().a((float) i12, (float) i14, (float) i13, (float) i15);
                        property = V;
                    } else {
                        k kVar = new k(view);
                        ObjectAnimator a11 = f.a(kVar, R, z().a((float) i12, (float) i14, (float) i13, (float) i15));
                        ObjectAnimator a12 = f.a(kVar, S, z().a((float) i16, (float) i18, (float) i17, (float) i19));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a11, a12});
                        animatorSet.addListener(new h(kVar));
                        animator = animatorSet;
                    }
                } else if (i12 == i13 && i14 == i15) {
                    a10 = z().a((float) i16, (float) i18, (float) i17, (float) i19);
                    property = T;
                } else {
                    a10 = z().a((float) i12, (float) i14, (float) i13, (float) i15);
                    property = U;
                }
                animator = f.a(view, property, a10);
            } else {
                view = view3;
                a0.f(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
                ObjectAnimator a13 = (i12 == i13 && i14 == i15) ? null : f.a(view, V, z().a((float) i12, (float) i14, (float) i13, (float) i15));
                if (rect3 == null) {
                    i11 = 0;
                    rect3 = new Rect(0, 0, i20, i21);
                } else {
                    i11 = 0;
                }
                Rect rect6 = rect5 == null ? new Rect(i11, i11, i22, i23) : rect5;
                if (!rect3.equals(rect6)) {
                    m0.x0(view, rect3);
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", W, new Object[]{rect3, rect6});
                    ofObject.addListener(new i(view, rect5, i13, i15, i17, i19));
                    objectAnimator = ofObject;
                } else {
                    objectAnimator = null;
                }
                animator = r.c(a13, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                x.c(viewGroup4, true);
                a(new j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) sVar3.f12221a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar3.f12221a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar4.f12221a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar4.f12221a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.M);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c10 = a0.c(view2);
        a0.g(view2, 0.0f);
        a0.b(viewGroup).b(bitmapDrawable);
        g z10 = z();
        int[] iArr = this.M;
        int i24 = iArr[0];
        int i25 = iArr[1];
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{h.a(Q, z10.a((float) (intValue - i24), (float) (intValue2 - i25), (float) (intValue3 - i24), (float) (intValue4 - i25)))});
        ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c10));
        return ofPropertyValuesHolder;
    }
}
