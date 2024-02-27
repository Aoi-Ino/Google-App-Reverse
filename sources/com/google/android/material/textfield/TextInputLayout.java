package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.f0;
import androidx.core.view.m0;
import androidx.core.view.r;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.u;
import d5.h;
import i1.n;
import i5.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q4.i;
import q4.j;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final int F0 = j.Widget_Design_TextInputLayout;
    private static final int[][] G0 = {new int[]{16842919}, new int[0]};
    private i1.d A;
    private boolean A0;
    private i1.d B;
    private ValueAnimator B0;
    private ColorStateList C;
    private boolean C0;
    private ColorStateList D;
    /* access modifiers changed from: private */
    public boolean D0;
    private ColorStateList E;
    private boolean E0;
    private ColorStateList F;
    private boolean G;
    private CharSequence H;
    private boolean I;
    private i5.g J;
    private i5.g K;
    private StateListDrawable L;
    private boolean M;
    private i5.g N;
    private i5.g O;
    private k P;
    private boolean Q;
    private final int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;

    /* renamed from: a0  reason: collision with root package name */
    private int f6353a0;

    /* renamed from: b0  reason: collision with root package name */
    private int f6354b0;

    /* renamed from: c0  reason: collision with root package name */
    private final Rect f6355c0;

    /* renamed from: d0  reason: collision with root package name */
    private final Rect f6356d0;

    /* renamed from: e  reason: collision with root package name */
    private final FrameLayout f6357e;

    /* renamed from: e0  reason: collision with root package name */
    private final RectF f6358e0;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final a0 f6359f;

    /* renamed from: f0  reason: collision with root package name */
    private Typeface f6360f0;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final s f6361g;

    /* renamed from: g0  reason: collision with root package name */
    private Drawable f6362g0;

    /* renamed from: h  reason: collision with root package name */
    EditText f6363h;

    /* renamed from: h0  reason: collision with root package name */
    private int f6364h0;

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f6365i;

    /* renamed from: i0  reason: collision with root package name */
    private final LinkedHashSet f6366i0;

    /* renamed from: j  reason: collision with root package name */
    private int f6367j;

    /* renamed from: j0  reason: collision with root package name */
    private Drawable f6368j0;

    /* renamed from: k  reason: collision with root package name */
    private int f6369k;

    /* renamed from: k0  reason: collision with root package name */
    private int f6370k0;

    /* renamed from: l  reason: collision with root package name */
    private int f6371l;

    /* renamed from: l0  reason: collision with root package name */
    private Drawable f6372l0;

    /* renamed from: m  reason: collision with root package name */
    private int f6373m;

    /* renamed from: m0  reason: collision with root package name */
    private ColorStateList f6374m0;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final v f6375n;

    /* renamed from: n0  reason: collision with root package name */
    private ColorStateList f6376n0;

    /* renamed from: o  reason: collision with root package name */
    boolean f6377o;

    /* renamed from: o0  reason: collision with root package name */
    private int f6378o0;

    /* renamed from: p  reason: collision with root package name */
    private int f6379p;

    /* renamed from: p0  reason: collision with root package name */
    private int f6380p0;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6381q;

    /* renamed from: q0  reason: collision with root package name */
    private int f6382q0;

    /* renamed from: r  reason: collision with root package name */
    private e f6383r;

    /* renamed from: r0  reason: collision with root package name */
    private ColorStateList f6384r0;

    /* renamed from: s  reason: collision with root package name */
    private TextView f6385s;

    /* renamed from: s0  reason: collision with root package name */
    private int f6386s0;

    /* renamed from: t  reason: collision with root package name */
    private int f6387t;

    /* renamed from: t0  reason: collision with root package name */
    private int f6388t0;

    /* renamed from: u  reason: collision with root package name */
    private int f6389u;

    /* renamed from: u0  reason: collision with root package name */
    private int f6390u0;

    /* renamed from: v  reason: collision with root package name */
    private CharSequence f6391v;

    /* renamed from: v0  reason: collision with root package name */
    private int f6392v0;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public boolean f6393w;

    /* renamed from: w0  reason: collision with root package name */
    private int f6394w0;

    /* renamed from: x  reason: collision with root package name */
    private TextView f6395x;

    /* renamed from: x0  reason: collision with root package name */
    private boolean f6396x0;

    /* renamed from: y  reason: collision with root package name */
    private ColorStateList f6397y;

    /* renamed from: y0  reason: collision with root package name */
    final com.google.android.material.internal.a f6398y0;

    /* renamed from: z  reason: collision with root package name */
    private int f6399z;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f6400z0;

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.u0(!textInputLayout.D0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f6377o) {
                textInputLayout2.k0(editable);
            }
            if (TextInputLayout.this.f6393w) {
                TextInputLayout.this.y0(editable);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            TextInputLayout.this.f6361g.h();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f6398y0.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        private final TextInputLayout f6404d;

        public d(TextInputLayout textInputLayout) {
            this.f6404d = textInputLayout;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
            if (r3 != null) goto L_0x008a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(android.view.View r14, androidx.core.view.accessibility.y r15) {
            /*
                r13 = this;
                super.g(r14, r15)
                com.google.android.material.textfield.TextInputLayout r0 = r13.f6404d
                android.widget.EditText r0 = r0.getEditText()
                if (r0 == 0) goto L_0x0010
                android.text.Editable r0 = r0.getText()
                goto L_0x0011
            L_0x0010:
                r0 = 0
            L_0x0011:
                com.google.android.material.textfield.TextInputLayout r1 = r13.f6404d
                java.lang.CharSequence r1 = r1.getHint()
                com.google.android.material.textfield.TextInputLayout r2 = r13.f6404d
                java.lang.CharSequence r2 = r2.getError()
                com.google.android.material.textfield.TextInputLayout r3 = r13.f6404d
                java.lang.CharSequence r3 = r3.getPlaceholderText()
                com.google.android.material.textfield.TextInputLayout r4 = r13.f6404d
                int r4 = r4.getCounterMaxLength()
                com.google.android.material.textfield.TextInputLayout r5 = r13.f6404d
                java.lang.CharSequence r5 = r5.getCounterOverflowDescription()
                boolean r6 = android.text.TextUtils.isEmpty(r0)
                r7 = r6 ^ 1
                boolean r8 = android.text.TextUtils.isEmpty(r1)
                r9 = 1
                r8 = r8 ^ r9
                com.google.android.material.textfield.TextInputLayout r10 = r13.f6404d
                boolean r10 = r10.P()
                r10 = r10 ^ r9
                boolean r11 = android.text.TextUtils.isEmpty(r2)
                r11 = r11 ^ r9
                if (r11 != 0) goto L_0x0051
                boolean r12 = android.text.TextUtils.isEmpty(r5)
                if (r12 != 0) goto L_0x0050
                goto L_0x0051
            L_0x0050:
                r9 = 0
            L_0x0051:
                if (r8 == 0) goto L_0x0058
                java.lang.String r1 = r1.toString()
                goto L_0x005a
            L_0x0058:
                java.lang.String r1 = ""
            L_0x005a:
                com.google.android.material.textfield.TextInputLayout r8 = r13.f6404d
                com.google.android.material.textfield.a0 r8 = r8.f6359f
                r8.A(r15)
                java.lang.String r8 = ", "
                if (r7 == 0) goto L_0x006b
                r15.L0(r0)
                goto L_0x0091
            L_0x006b:
                boolean r12 = android.text.TextUtils.isEmpty(r1)
                if (r12 != 0) goto L_0x008e
                r15.L0(r1)
                if (r10 == 0) goto L_0x0091
                if (r3 == 0) goto L_0x0091
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r1)
                r10.append(r8)
                r10.append(r3)
                java.lang.String r3 = r10.toString()
            L_0x008a:
                r15.L0(r3)
                goto L_0x0091
            L_0x008e:
                if (r3 == 0) goto L_0x0091
                goto L_0x008a
            L_0x0091:
                boolean r3 = android.text.TextUtils.isEmpty(r1)
                if (r3 != 0) goto L_0x00bb
                int r3 = android.os.Build.VERSION.SDK_INT
                r10 = 26
                if (r3 < r10) goto L_0x00a1
                r15.x0(r1)
                goto L_0x00b8
            L_0x00a1:
                if (r7 == 0) goto L_0x00b5
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                r3.append(r8)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
            L_0x00b5:
                r15.L0(r1)
            L_0x00b8:
                r15.H0(r6)
            L_0x00bb:
                if (r0 == 0) goto L_0x00c4
                int r0 = r0.length()
                if (r0 != r4) goto L_0x00c4
                goto L_0x00c5
            L_0x00c4:
                r4 = -1
            L_0x00c5:
                r15.z0(r4)
                if (r9 == 0) goto L_0x00d1
                if (r11 == 0) goto L_0x00cd
                goto L_0x00ce
            L_0x00cd:
                r2 = r5
            L_0x00ce:
                r15.t0(r2)
            L_0x00d1:
                com.google.android.material.textfield.TextInputLayout r0 = r13.f6404d
                com.google.android.material.textfield.v r0 = r0.f6375n
                android.view.View r0 = r0.t()
                if (r0 == 0) goto L_0x00e0
                r15.y0(r0)
            L_0x00e0:
                com.google.android.material.textfield.TextInputLayout r0 = r13.f6404d
                com.google.android.material.textfield.s r0 = r0.f6361g
                com.google.android.material.textfield.t r0 = r0.m()
                r0.o(r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.d.g(android.view.View, androidx.core.view.accessibility.y):void");
        }

        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f6404d.f6361g.m().p(view, accessibilityEvent);
        }
    }

    public interface e {
        int a(Editable editable);
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    static class g extends b0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        CharSequence f6405g;

        /* renamed from: h  reason: collision with root package name */
        boolean f6406h;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6405g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f6406h = parcel.readInt() != 1 ? false : true;
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f6405g + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f6405g, parcel, i10);
            parcel.writeInt(this.f6406h ? 1 : 0);
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q4.b.textInputStyle);
    }

    private i1.d A() {
        i1.d dVar = new i1.d();
        dVar.b0((long) h.f(getContext(), q4.b.motionDurationShort2, 87));
        dVar.d0(h.g(getContext(), q4.b.motionEasingLinearInterpolator, r4.a.f15582a));
        return dVar;
    }

    private boolean B() {
        return this.G && !TextUtils.isEmpty(this.H) && (this.J instanceof h);
    }

    private void C() {
        Iterator it = this.f6366i0.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    private void D(Canvas canvas) {
        i5.g gVar;
        if (this.O != null && (gVar = this.N) != null) {
            gVar.draw(canvas);
            if (this.f6363h.isFocused()) {
                Rect bounds = this.O.getBounds();
                Rect bounds2 = this.N.getBounds();
                float x10 = this.f6398y0.x();
                int centerX = bounds2.centerX();
                bounds.left = r4.a.c(centerX, bounds2.left, x10);
                bounds.right = r4.a.c(centerX, bounds2.right, x10);
                this.O.draw(canvas);
            }
        }
    }

    private void E(Canvas canvas) {
        if (this.G) {
            this.f6398y0.l(canvas);
        }
    }

    private void F(boolean z10) {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.B0.cancel();
        }
        if (!z10 || !this.A0) {
            this.f6398y0.c0(0.0f);
        } else {
            l(0.0f);
        }
        if (B() && ((h) this.J).m0()) {
            y();
        }
        this.f6396x0 = true;
        L();
        this.f6359f.l(true);
        this.f6361g.H(true);
    }

    private i5.g G(boolean z10) {
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(q4.d.mtrl_shape_corner_size_small_component);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f6363h;
        float popupElevation = editText instanceof w ? ((w) editText).getPopupElevation() : (float) getResources().getDimensionPixelOffset(q4.d.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(q4.d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        k m10 = k.a().A(f10).E(f10).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        EditText editText2 = this.f6363h;
        i5.g m11 = i5.g.m(getContext(), popupElevation, editText2 instanceof w ? ((w) editText2).getDropDownBackgroundTintList() : null);
        m11.setShapeAppearanceModel(m10);
        m11.Y(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return m11;
    }

    private static Drawable H(i5.g gVar, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{x4.a.j(i11, i10, 0.1f), i10}), gVar, gVar);
    }

    private int I(int i10, boolean z10) {
        return i10 + ((z10 || getPrefixText() == null) ? (!z10 || getSuffixText() == null) ? this.f6363h.getCompoundPaddingLeft() : this.f6361g.y() : this.f6359f.c());
    }

    private int J(int i10, boolean z10) {
        return i10 - ((z10 || getSuffixText() == null) ? (!z10 || getPrefixText() == null) ? this.f6363h.getCompoundPaddingRight() : this.f6359f.c() : this.f6361g.y());
    }

    private static Drawable K(Context context, i5.g gVar, int i10, int[][] iArr) {
        int c10 = x4.a.c(context, q4.b.colorSurface, "TextInputLayout");
        i5.g gVar2 = new i5.g(gVar.D());
        int j10 = x4.a.j(i10, c10, 0.1f);
        gVar2.W(new ColorStateList(iArr, new int[]{j10, 0}));
        gVar2.setTint(c10);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{j10, c10});
        i5.g gVar3 = new i5.g(gVar.D());
        gVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
    }

    private void L() {
        TextView textView = this.f6395x;
        if (textView != null && this.f6393w) {
            textView.setText((CharSequence) null);
            n.a(this.f6357e, this.B);
            this.f6395x.setVisibility(4);
        }
    }

    private boolean Q() {
        return d0() || (this.f6385s != null && this.f6381q);
    }

    private boolean S() {
        return this.S == 1 && this.f6363h.getMinLines() <= 1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int T(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.f6363h.requestLayout();
    }

    private void V() {
        p();
        r0();
        A0();
        h0();
        k();
        if (this.S != 0) {
            t0();
        }
        b0();
    }

    private void W() {
        if (B()) {
            RectF rectF = this.f6358e0;
            this.f6398y0.o(rectF, this.f6363h.getWidth(), this.f6363h.getGravity());
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                o(rectF);
                rectF.offset((float) (-getPaddingLeft()), (((float) (-getPaddingTop())) - (rectF.height() / 2.0f)) + ((float) this.U));
                ((h) this.J).p0(rectF);
            }
        }
    }

    private void X() {
        if (B() && !this.f6396x0) {
            y();
            W();
        }
    }

    private static void Y(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                Y((ViewGroup) childAt, z10);
            }
        }
    }

    private void a0() {
        TextView textView = this.f6395x;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void b0() {
        Drawable orCreateFilledDropDownMenuBackground;
        EditText editText = this.f6363h;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.S;
                if (i10 == 2) {
                    orCreateFilledDropDownMenuBackground = getOrCreateOutlinedDropDownMenuBackground();
                } else if (i10 == 1) {
                    orCreateFilledDropDownMenuBackground = getOrCreateFilledDropDownMenuBackground();
                } else {
                    return;
                }
                autoCompleteTextView.setDropDownBackgroundDrawable(orCreateFilledDropDownMenuBackground);
            }
        }
    }

    private boolean e0() {
        return (this.f6361g.G() || ((this.f6361g.A() && M()) || this.f6361g.w() != null)) && this.f6361g.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f6359f.getMeasuredWidth() > 0;
    }

    private void g0() {
        if (this.f6395x != null && this.f6393w && !TextUtils.isEmpty(this.f6391v)) {
            this.f6395x.setText(this.f6391v);
            n.a(this.f6357e, this.A);
            this.f6395x.setVisibility(0);
            this.f6395x.bringToFront();
            announceForAccessibility(this.f6391v);
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f6363h;
        if (!(editText instanceof AutoCompleteTextView) || r.a(editText)) {
            return this.J;
        }
        int d10 = x4.a.d(this.f6363h, q4.b.f14962g);
        int i10 = this.S;
        if (i10 == 2) {
            return K(getContext(), this.J, d10, G0);
        }
        if (i10 == 1) {
            return H(this.J, this.f6354b0, d10, G0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.L == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.L = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.L.addState(new int[0], G(false));
        }
        return this.L;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.K == null) {
            this.K = G(true);
        }
        return this.K;
    }

    private void h0() {
        Resources resources;
        int i10;
        if (this.S == 1) {
            if (f5.c.h(getContext())) {
                resources = getResources();
                i10 = q4.d.material_font_2_0_box_collapsed_padding_top;
            } else if (f5.c.g(getContext())) {
                resources = getResources();
                i10 = q4.d.material_font_1_3_box_collapsed_padding_top;
            } else {
                return;
            }
            this.T = resources.getDimensionPixelSize(i10);
        }
    }

    private void i0(Rect rect) {
        i5.g gVar = this.N;
        if (gVar != null) {
            int i10 = rect.bottom;
            gVar.setBounds(rect.left, i10 - this.V, rect.right, i10);
        }
        i5.g gVar2 = this.O;
        if (gVar2 != null) {
            int i11 = rect.bottom;
            gVar2.setBounds(rect.left, i11 - this.W, rect.right, i11);
        }
    }

    private void j() {
        TextView textView = this.f6395x;
        if (textView != null) {
            this.f6357e.addView(textView);
            this.f6395x.setVisibility(0);
        }
    }

    private void j0() {
        if (this.f6385s != null) {
            EditText editText = this.f6363h;
            k0(editText == null ? null : editText.getText());
        }
    }

    private void k() {
        EditText editText;
        int G2;
        int dimensionPixelSize;
        int F2;
        Resources resources;
        int i10;
        if (this.f6363h != null && this.S == 1) {
            if (f5.c.h(getContext())) {
                editText = this.f6363h;
                G2 = m0.G(editText);
                dimensionPixelSize = getResources().getDimensionPixelSize(q4.d.material_filled_edittext_font_2_0_padding_top);
                F2 = m0.F(this.f6363h);
                resources = getResources();
                i10 = q4.d.material_filled_edittext_font_2_0_padding_bottom;
            } else if (f5.c.g(getContext())) {
                editText = this.f6363h;
                G2 = m0.G(editText);
                dimensionPixelSize = getResources().getDimensionPixelSize(q4.d.material_filled_edittext_font_1_3_padding_top);
                F2 = m0.F(this.f6363h);
                resources = getResources();
                i10 = q4.d.material_filled_edittext_font_1_3_padding_bottom;
            } else {
                return;
            }
            m0.G0(editText, G2, dimensionPixelSize, F2, resources.getDimensionPixelSize(i10));
        }
    }

    private static void l0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? i.character_counter_overflowed_content_description : i.character_counter_content_description, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}));
    }

    private void m() {
        i5.g gVar = this.J;
        if (gVar != null) {
            k D2 = gVar.D();
            k kVar = this.P;
            if (D2 != kVar) {
                this.J.setShapeAppearanceModel(kVar);
            }
            if (w()) {
                this.J.c0((float) this.U, this.f6353a0);
            }
            int q10 = q();
            this.f6354b0 = q10;
            this.J.W(ColorStateList.valueOf(q10));
            n();
            r0();
        }
    }

    private void m0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f6385s;
        if (textView != null) {
            c0(textView, this.f6381q ? this.f6387t : this.f6389u);
            if (!this.f6381q && (colorStateList2 = this.C) != null) {
                this.f6385s.setTextColor(colorStateList2);
            }
            if (this.f6381q && (colorStateList = this.D) != null) {
                this.f6385s.setTextColor(colorStateList);
            }
        }
    }

    private void n() {
        if (this.N != null && this.O != null) {
            if (x()) {
                this.N.W(ColorStateList.valueOf(this.f6363h.isFocused() ? this.f6378o0 : this.f6353a0));
                this.O.W(ColorStateList.valueOf(this.f6353a0));
            }
            invalidate();
        }
    }

    private void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.E;
        if (colorStateList2 == null) {
            colorStateList2 = x4.a.g(getContext(), q4.b.f14961f);
        }
        EditText editText = this.f6363h;
        if (editText != null && editText.getTextCursorDrawable() != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(this.f6363h.getTextCursorDrawable()).mutate();
            if (Q() && (colorStateList = this.F) != null) {
                colorStateList2 = colorStateList;
            }
            androidx.core.graphics.drawable.a.o(mutate, colorStateList2);
        }
    }

    private void o(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.R;
        rectF.left = f10 - ((float) i10);
        rectF.right += (float) i10;
    }

    private void p() {
        int i10 = this.S;
        if (i10 == 0) {
            this.J = null;
        } else if (i10 == 1) {
            this.J = new i5.g(this.P);
            this.N = new i5.g();
            this.O = new i5.g();
            return;
        } else if (i10 == 2) {
            this.J = (!this.G || (this.J instanceof h)) ? new i5.g(this.P) : h.l0(this.P);
        } else {
            throw new IllegalArgumentException(this.S + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
        this.N = null;
        this.O = null;
    }

    private int q() {
        return this.S == 1 ? x4.a.i(x4.a.e(this, q4.b.colorSurface, 0), this.f6354b0) : this.f6354b0;
    }

    private void q0() {
        m0.u0(this.f6363h, getEditTextBoxBackground());
    }

    private Rect r(Rect rect) {
        int i10;
        int i11;
        if (this.f6363h != null) {
            Rect rect2 = this.f6356d0;
            boolean g10 = u.g(this);
            rect2.bottom = rect.bottom;
            int i12 = this.S;
            if (i12 == 1) {
                rect2.left = I(rect.left, g10);
                i10 = rect.top + this.T;
            } else if (i12 != 2) {
                rect2.left = I(rect.left, g10);
                i10 = getPaddingTop();
            } else {
                rect2.left = rect.left + this.f6363h.getPaddingLeft();
                rect2.top = rect.top - v();
                i11 = rect.right - this.f6363h.getPaddingRight();
                rect2.right = i11;
                return rect2;
            }
            rect2.top = i10;
            i11 = J(rect.right, g10);
            rect2.right = i11;
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int s(Rect rect, Rect rect2, float f10) {
        return S() ? (int) (((float) rect2.top) + f10) : rect.bottom - this.f6363h.getCompoundPaddingBottom();
    }

    private boolean s0() {
        int max;
        if (this.f6363h == null || this.f6363h.getMeasuredHeight() >= (max = Math.max(this.f6361g.getMeasuredHeight(), this.f6359f.getMeasuredHeight()))) {
            return false;
        }
        this.f6363h.setMinimumHeight(max);
        return true;
    }

    private void setEditText(EditText editText) {
        if (this.f6363h == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f6363h = editText;
            int i10 = this.f6367j;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.f6371l);
            }
            int i11 = this.f6369k;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.f6373m);
            }
            this.M = false;
            V();
            setTextInputAccessibilityDelegate(new d(this));
            this.f6398y0.i0(this.f6363h.getTypeface());
            this.f6398y0.a0(this.f6363h.getTextSize());
            int i12 = Build.VERSION.SDK_INT;
            this.f6398y0.X(this.f6363h.getLetterSpacing());
            int gravity = this.f6363h.getGravity();
            this.f6398y0.S((gravity & -113) | 48);
            this.f6398y0.Z(gravity);
            this.f6363h.addTextChangedListener(new a());
            if (this.f6374m0 == null) {
                this.f6374m0 = this.f6363h.getHintTextColors();
            }
            if (this.G) {
                if (TextUtils.isEmpty(this.H)) {
                    CharSequence hint = this.f6363h.getHint();
                    this.f6365i = hint;
                    setHint(hint);
                    this.f6363h.setHint((CharSequence) null);
                }
                this.I = true;
            }
            if (i12 >= 29) {
                n0();
            }
            if (this.f6385s != null) {
                k0(this.f6363h.getText());
            }
            p0();
            this.f6375n.f();
            this.f6359f.bringToFront();
            this.f6361g.bringToFront();
            C();
            this.f6361g.x0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            v0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.H)) {
            this.H = charSequence;
            this.f6398y0.g0(charSequence);
            if (!this.f6396x0) {
                W();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f6393w != z10) {
            if (z10) {
                j();
            } else {
                a0();
                this.f6395x = null;
            }
            this.f6393w = z10;
        }
    }

    private int t(Rect rect, float f10) {
        return S() ? (int) (((float) rect.centerY()) - (f10 / 2.0f)) : rect.top + this.f6363h.getCompoundPaddingTop();
    }

    private void t0() {
        if (this.S != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6357e.getLayoutParams();
            int v10 = v();
            if (v10 != layoutParams.topMargin) {
                layoutParams.topMargin = v10;
                this.f6357e.requestLayout();
            }
        }
    }

    private Rect u(Rect rect) {
        if (this.f6363h != null) {
            Rect rect2 = this.f6356d0;
            float w10 = this.f6398y0.w();
            rect2.left = rect.left + this.f6363h.getCompoundPaddingLeft();
            rect2.top = t(rect, w10);
            rect2.right = rect.right - this.f6363h.getCompoundPaddingRight();
            rect2.bottom = s(rect, rect2, w10);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int v() {
        float q10;
        if (!this.G) {
            return 0;
        }
        int i10 = this.S;
        if (i10 == 0) {
            q10 = this.f6398y0.q();
        } else if (i10 != 2) {
            return 0;
        } else {
            q10 = this.f6398y0.q() / 2.0f;
        }
        return (int) q10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void v0(boolean r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = r5.isEnabled()
            android.widget.EditText r1 = r5.f6363h
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0016
            android.text.Editable r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0016
            r1 = r3
            goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            android.widget.EditText r4 = r5.f6363h
            if (r4 == 0) goto L_0x0022
            boolean r4 = r4.hasFocus()
            if (r4 == 0) goto L_0x0022
            r2 = r3
        L_0x0022:
            android.content.res.ColorStateList r3 = r5.f6374m0
            if (r3 == 0) goto L_0x002b
            com.google.android.material.internal.a r4 = r5.f6398y0
            r4.M(r3)
        L_0x002b:
            if (r0 != 0) goto L_0x004b
            android.content.res.ColorStateList r0 = r5.f6374m0
            if (r0 == 0) goto L_0x003f
            r3 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r3 = new int[]{r3}
            int r4 = r5.f6394w0
            int r0 = r0.getColorForState(r3, r4)
            goto L_0x0041
        L_0x003f:
            int r0 = r5.f6394w0
        L_0x0041:
            com.google.android.material.internal.a r3 = r5.f6398y0
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L_0x0047:
            r3.M(r0)
            goto L_0x0077
        L_0x004b:
            boolean r0 = r5.d0()
            if (r0 == 0) goto L_0x005d
            com.google.android.material.internal.a r0 = r5.f6398y0
            com.google.android.material.textfield.v r3 = r5.f6375n
            android.content.res.ColorStateList r3 = r3.r()
            r0.M(r3)
            goto L_0x0077
        L_0x005d:
            boolean r0 = r5.f6381q
            if (r0 == 0) goto L_0x006c
            android.widget.TextView r0 = r5.f6385s
            if (r0 == 0) goto L_0x006c
            com.google.android.material.internal.a r3 = r5.f6398y0
            android.content.res.ColorStateList r0 = r0.getTextColors()
            goto L_0x0047
        L_0x006c:
            if (r2 == 0) goto L_0x0077
            android.content.res.ColorStateList r0 = r5.f6376n0
            if (r0 == 0) goto L_0x0077
            com.google.android.material.internal.a r3 = r5.f6398y0
            r3.R(r0)
        L_0x0077:
            if (r1 != 0) goto L_0x0090
            boolean r0 = r5.f6400z0
            if (r0 == 0) goto L_0x0090
            boolean r0 = r5.isEnabled()
            if (r0 == 0) goto L_0x0086
            if (r2 == 0) goto L_0x0086
            goto L_0x0090
        L_0x0086:
            if (r7 != 0) goto L_0x008c
            boolean r7 = r5.f6396x0
            if (r7 != 0) goto L_0x0099
        L_0x008c:
            r5.F(r6)
            goto L_0x0099
        L_0x0090:
            if (r7 != 0) goto L_0x0096
            boolean r7 = r5.f6396x0
            if (r7 == 0) goto L_0x0099
        L_0x0096:
            r5.z(r6)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.v0(boolean, boolean):void");
    }

    private boolean w() {
        return this.S == 2 && x();
    }

    private void w0() {
        EditText editText;
        if (this.f6395x != null && (editText = this.f6363h) != null) {
            this.f6395x.setGravity(editText.getGravity());
            this.f6395x.setPadding(this.f6363h.getCompoundPaddingLeft(), this.f6363h.getCompoundPaddingTop(), this.f6363h.getCompoundPaddingRight(), this.f6363h.getCompoundPaddingBottom());
        }
    }

    private boolean x() {
        return this.U > -1 && this.f6353a0 != 0;
    }

    private void x0() {
        EditText editText = this.f6363h;
        y0(editText == null ? null : editText.getText());
    }

    private void y() {
        if (B()) {
            ((h) this.J).n0();
        }
    }

    /* access modifiers changed from: private */
    public void y0(Editable editable) {
        if (this.f6383r.a(editable) != 0 || this.f6396x0) {
            L();
        } else {
            g0();
        }
    }

    private void z(boolean z10) {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.B0.cancel();
        }
        if (!z10 || !this.A0) {
            this.f6398y0.c0(1.0f);
        } else {
            l(1.0f);
        }
        this.f6396x0 = false;
        if (B()) {
            W();
        }
        x0();
        this.f6359f.l(false);
        this.f6361g.H(false);
    }

    private void z0(boolean z10, boolean z11) {
        int defaultColor = this.f6384r0.getDefaultColor();
        int colorForState = this.f6384r0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f6384r0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.f6353a0 = colorForState2;
        } else if (z11) {
            this.f6353a0 = colorForState;
        } else {
            this.f6353a0 = defaultColor;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r5.f6363h;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0() {
        /*
            r5 = this;
            i5.g r0 = r5.J
            if (r0 == 0) goto L_0x00be
            int r0 = r5.S
            if (r0 != 0) goto L_0x000a
            goto L_0x00be
        L_0x000a:
            boolean r0 = r5.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r5.f6363h
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            boolean r3 = r5.isHovered()
            if (r3 != 0) goto L_0x0030
            android.widget.EditText r3 = r5.f6363h
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            r1 = r2
        L_0x0031:
            boolean r3 = r5.isEnabled()
            if (r3 != 0) goto L_0x003c
            int r3 = r5.f6394w0
        L_0x0039:
            r5.f6353a0 = r3
            goto L_0x006e
        L_0x003c:
            boolean r3 = r5.d0()
            if (r3 == 0) goto L_0x004f
            android.content.res.ColorStateList r3 = r5.f6384r0
            if (r3 == 0) goto L_0x004a
        L_0x0046:
            r5.z0(r0, r1)
            goto L_0x006e
        L_0x004a:
            int r3 = r5.getErrorCurrentTextColors()
            goto L_0x0039
        L_0x004f:
            boolean r3 = r5.f6381q
            if (r3 == 0) goto L_0x0061
            android.widget.TextView r3 = r5.f6385s
            if (r3 == 0) goto L_0x0061
            android.content.res.ColorStateList r4 = r5.f6384r0
            if (r4 == 0) goto L_0x005c
            goto L_0x0046
        L_0x005c:
            int r3 = r3.getCurrentTextColor()
            goto L_0x0039
        L_0x0061:
            if (r0 == 0) goto L_0x0066
            int r3 = r5.f6382q0
            goto L_0x0039
        L_0x0066:
            if (r1 == 0) goto L_0x006b
            int r3 = r5.f6380p0
            goto L_0x0039
        L_0x006b:
            int r3 = r5.f6378o0
            goto L_0x0039
        L_0x006e:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L_0x0077
            r5.n0()
        L_0x0077:
            com.google.android.material.textfield.s r3 = r5.f6361g
            r3.I()
            r5.Z()
            int r3 = r5.S
            r4 = 2
            if (r3 != r4) goto L_0x009d
            int r3 = r5.U
            if (r0 == 0) goto L_0x0093
            boolean r4 = r5.isEnabled()
            if (r4 == 0) goto L_0x0093
            int r4 = r5.W
        L_0x0090:
            r5.U = r4
            goto L_0x0096
        L_0x0093:
            int r4 = r5.V
            goto L_0x0090
        L_0x0096:
            int r4 = r5.U
            if (r4 == r3) goto L_0x009d
            r5.X()
        L_0x009d:
            int r3 = r5.S
            if (r3 != r2) goto L_0x00bb
            boolean r2 = r5.isEnabled()
            if (r2 != 0) goto L_0x00ac
            int r0 = r5.f6388t0
        L_0x00a9:
            r5.f6354b0 = r0
            goto L_0x00bb
        L_0x00ac:
            if (r1 == 0) goto L_0x00b3
            if (r0 != 0) goto L_0x00b3
            int r0 = r5.f6392v0
            goto L_0x00a9
        L_0x00b3:
            if (r0 == 0) goto L_0x00b8
            int r0 = r5.f6390u0
            goto L_0x00a9
        L_0x00b8:
            int r0 = r5.f6386s0
            goto L_0x00a9
        L_0x00bb:
            r5.m()
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0():void");
    }

    public boolean M() {
        return this.f6361g.F();
    }

    public boolean N() {
        return this.f6375n.A();
    }

    public boolean O() {
        return this.f6375n.B();
    }

    /* access modifiers changed from: package-private */
    public final boolean P() {
        return this.f6396x0;
    }

    public boolean R() {
        return this.I;
    }

    public void Z() {
        this.f6359f.m();
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f6357e.addView(view, layoutParams2);
            this.f6357e.setLayoutParams(layoutParams);
            t0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void c0(TextView textView, int i10) {
        try {
            androidx.core.widget.i.n(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.i.n(textView, j.TextAppearance_AppCompat_Caption);
        textView.setTextColor(androidx.core.content.a.c(getContext(), q4.c.design_error));
    }

    /* access modifiers changed from: package-private */
    public boolean d0() {
        return this.f6375n.l();
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f6363h;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f6365i != null) {
            boolean z10 = this.I;
            this.I = false;
            CharSequence hint = editText.getHint();
            this.f6363h.setHint(this.f6365i);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
            } finally {
                this.f6363h.setHint(hint);
                this.I = z10;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i10);
            onProvideAutofillVirtualStructure(viewStructure, i10);
            viewStructure.setChildCount(this.f6357e.getChildCount());
            for (int i11 = 0; i11 < this.f6357e.getChildCount(); i11++) {
                View childAt = this.f6357e.getChildAt(i11);
                ViewStructure newChild = viewStructure.newChild(i11);
                childAt.dispatchProvideAutofillStructure(newChild, i10);
                if (childAt == this.f6363h) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.D0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.D0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.C0) {
            boolean z10 = true;
            this.C0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            com.google.android.material.internal.a aVar = this.f6398y0;
            boolean f02 = aVar != null ? aVar.f0(drawableState) : false;
            if (this.f6363h != null) {
                if (!m0.U(this) || !isEnabled()) {
                    z10 = false;
                }
                u0(z10);
            }
            p0();
            A0();
            if (f02) {
                invalidate();
            }
            this.C0 = false;
        }
    }

    public int getBaseline() {
        EditText editText = this.f6363h;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public i5.g getBoxBackground() {
        int i10 = this.S;
        if (i10 == 1 || i10 == 2) {
            return this.J;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f6354b0;
    }

    public int getBoxBackgroundMode() {
        return this.S;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.T;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return (u.g(this) ? this.P.j() : this.P.l()).a(this.f6358e0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return (u.g(this) ? this.P.l() : this.P.j()).a(this.f6358e0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return (u.g(this) ? this.P.r() : this.P.t()).a(this.f6358e0);
    }

    public float getBoxCornerRadiusTopStart() {
        return (u.g(this) ? this.P.t() : this.P.r()).a(this.f6358e0);
    }

    public int getBoxStrokeColor() {
        return this.f6382q0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f6384r0;
    }

    public int getBoxStrokeWidth() {
        return this.V;
    }

    public int getBoxStrokeWidthFocused() {
        return this.W;
    }

    public int getCounterMaxLength() {
        return this.f6379p;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f6377o || !this.f6381q || (textView = this.f6385s) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.D;
    }

    public ColorStateList getCounterTextColor() {
        return this.C;
    }

    public ColorStateList getCursorColor() {
        return this.E;
    }

    public ColorStateList getCursorErrorColor() {
        return this.F;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f6374m0;
    }

    public EditText getEditText() {
        return this.f6363h;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f6361g.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f6361g.n();
    }

    public int getEndIconMinSize() {
        return this.f6361g.o();
    }

    public int getEndIconMode() {
        return this.f6361g.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f6361g.q();
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f6361g.r();
    }

    public CharSequence getError() {
        if (this.f6375n.A()) {
            return this.f6375n.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f6375n.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f6375n.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f6375n.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f6361g.s();
    }

    public CharSequence getHelperText() {
        if (this.f6375n.B()) {
            return this.f6375n.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f6375n.u();
    }

    public CharSequence getHint() {
        if (this.G) {
            return this.H;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.f6398y0.q();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f6398y0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f6376n0;
    }

    public e getLengthCounter() {
        return this.f6383r;
    }

    public int getMaxEms() {
        return this.f6369k;
    }

    public int getMaxWidth() {
        return this.f6373m;
    }

    public int getMinEms() {
        return this.f6367j;
    }

    public int getMinWidth() {
        return this.f6371l;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f6361g.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f6361g.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f6393w) {
            return this.f6391v;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f6399z;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f6397y;
    }

    public CharSequence getPrefixText() {
        return this.f6359f.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f6359f.b();
    }

    public TextView getPrefixTextView() {
        return this.f6359f.d();
    }

    public k getShapeAppearanceModel() {
        return this.P;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f6359f.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f6359f.f();
    }

    public int getStartIconMinSize() {
        return this.f6359f.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f6359f.h();
    }

    public CharSequence getSuffixText() {
        return this.f6361g.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f6361g.x();
    }

    public TextView getSuffixTextView() {
        return this.f6361g.z();
    }

    public Typeface getTypeface() {
        return this.f6360f0;
    }

    public void i(f fVar) {
        this.f6366i0.add(fVar);
        if (this.f6363h != null) {
            fVar.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void k0(Editable editable) {
        int a10 = this.f6383r.a(editable);
        boolean z10 = this.f6381q;
        int i10 = this.f6379p;
        if (i10 == -1) {
            this.f6385s.setText(String.valueOf(a10));
            this.f6385s.setContentDescription((CharSequence) null);
            this.f6381q = false;
        } else {
            this.f6381q = a10 > i10;
            l0(getContext(), this.f6385s, a10, this.f6379p, this.f6381q);
            if (z10 != this.f6381q) {
                m0();
            }
            this.f6385s.setText(androidx.core.text.a.c().j(getContext().getString(i.character_counter_pattern, new Object[]{Integer.valueOf(a10), Integer.valueOf(this.f6379p)})));
        }
        if (this.f6363h != null && z10 != this.f6381q) {
            u0(false);
            A0();
            p0();
        }
    }

    /* access modifiers changed from: package-private */
    public void l(float f10) {
        if (this.f6398y0.x() != f10) {
            if (this.B0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.B0 = valueAnimator;
                valueAnimator.setInterpolator(h.g(getContext(), q4.b.motionEasingEmphasizedInterpolator, r4.a.f15583b));
                this.B0.setDuration((long) h.f(getContext(), q4.b.motionDurationMedium4, 167));
                this.B0.addUpdateListener(new c());
            }
            this.B0.setFloatValues(new float[]{this.f6398y0.x(), f10});
            this.B0.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean o0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f6363h
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.f0()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 == 0) goto L_0x0049
            com.google.android.material.textfield.a0 r0 = r10.f6359f
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f6363h
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f6362g0
            if (r6 == 0) goto L_0x0025
            int r6 = r10.f6364h0
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f6362g0 = r6
            r10.f6364h0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.f6363h
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.i.a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f6362g0
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.f6363h
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.i.i(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.f6362g0
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.f6363h
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.i.a(r0)
            android.widget.EditText r6 = r10.f6363h
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.i.i(r6, r2, r7, r8, r0)
            r10.f6362g0 = r2
        L_0x0060:
            r0 = r5
            goto L_0x0063
        L_0x0062:
            r0 = r1
        L_0x0063:
            boolean r6 = r10.e0()
            if (r6 == 0) goto L_0x00d5
            com.google.android.material.textfield.s r2 = r10.f6361g
            android.widget.TextView r2 = r2.z()
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.f6363h
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.textfield.s r6 = r10.f6361g
            com.google.android.material.internal.CheckableImageButton r6 = r6.k()
            if (r6 == 0) goto L_0x0092
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = androidx.core.view.r.b(r6)
            int r2 = r2 + r6
        L_0x0092:
            android.widget.EditText r6 = r10.f6363h
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.i.a(r6)
            android.graphics.drawable.Drawable r7 = r10.f6368j0
            if (r7 == 0) goto L_0x00b3
            int r8 = r10.f6370k0
            if (r8 == r2) goto L_0x00b3
            r10.f6370k0 = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.f6363h
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r3 = r10.f6368j0
            r4 = r6[r4]
        L_0x00af:
            androidx.core.widget.i.i(r0, r1, r2, r3, r4)
            goto L_0x00d3
        L_0x00b3:
            if (r7 != 0) goto L_0x00c1
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f6368j0 = r7
            r10.f6370k0 = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00c1:
            r2 = r6[r3]
            android.graphics.drawable.Drawable r3 = r10.f6368j0
            if (r2 == r3) goto L_0x00d2
            r10.f6372l0 = r2
            android.widget.EditText r0 = r10.f6363h
            r1 = r6[r1]
            r2 = r6[r5]
            r4 = r6[r4]
            goto L_0x00af
        L_0x00d2:
            r5 = r0
        L_0x00d3:
            r0 = r5
            goto L_0x00f7
        L_0x00d5:
            android.graphics.drawable.Drawable r6 = r10.f6368j0
            if (r6 == 0) goto L_0x00f7
            android.widget.EditText r6 = r10.f6363h
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.i.a(r6)
            r3 = r6[r3]
            android.graphics.drawable.Drawable r7 = r10.f6368j0
            if (r3 != r7) goto L_0x00f3
            android.widget.EditText r0 = r10.f6363h
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f6372l0
            r4 = r6[r4]
            androidx.core.widget.i.i(r0, r1, r3, r7, r4)
            goto L_0x00f4
        L_0x00f3:
            r5 = r0
        L_0x00f4:
            r10.f6368j0 = r2
            goto L_0x00d3
        L_0x00f7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.o0():boolean");
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f6398y0.H(configuration);
    }

    public void onGlobalLayout() {
        this.f6361g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.E0 = false;
        boolean s02 = s0();
        boolean o02 = o0();
        if (s02 || o02) {
            this.f6363h.post(new h0(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f6363h;
        if (editText != null) {
            Rect rect = this.f6355c0;
            com.google.android.material.internal.c.a(this, editText, rect);
            i0(rect);
            if (this.G) {
                this.f6398y0.a0(this.f6363h.getTextSize());
                int gravity = this.f6363h.getGravity();
                this.f6398y0.S((gravity & -113) | 48);
                this.f6398y0.Z(gravity);
                this.f6398y0.O(r(rect));
                this.f6398y0.W(u(rect));
                this.f6398y0.J();
                if (B() && !this.f6396x0) {
                    W();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.E0) {
            this.f6361g.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.E0 = true;
        }
        w0();
        this.f6361g.x0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.c());
        setError(gVar.f6405g);
        if (gVar.f6406h) {
            post(new b());
        }
        requestLayout();
    }

    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != this.Q) {
            float a10 = this.P.r().a(this.f6358e0);
            float a11 = this.P.t().a(this.f6358e0);
            float a12 = this.P.j().a(this.f6358e0);
            float a13 = this.P.l().a(this.f6358e0);
            i5.d q10 = this.P.q();
            i5.d s10 = this.P.s();
            k m10 = k.a().z(s10).D(q10).r(this.P.k()).v(this.P.i()).A(a11).E(a10).s(a13).w(a12).m();
            this.Q = z10;
            setShapeAppearanceModel(m10);
        }
    }

    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        if (d0()) {
            gVar.f6405g = getError();
        }
        gVar.f6406h = this.f6361g.E();
        return gVar;
    }

    /* access modifiers changed from: package-private */
    public void p0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f6363h;
        if (editText != null && this.S == 0 && (background = editText.getBackground()) != null) {
            if (f0.a(background)) {
                background = background.mutate();
            }
            if (d0()) {
                currentTextColor = getErrorCurrentTextColors();
            } else if (!this.f6381q || (textView = this.f6385s) == null) {
                androidx.core.graphics.drawable.a.c(background);
                this.f6363h.refreshDrawableState();
                return;
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(androidx.appcompat.widget.j.e(currentTextColor, PorterDuff.Mode.SRC_IN));
        }
    }

    /* access modifiers changed from: package-private */
    public void r0() {
        EditText editText = this.f6363h;
        if (editText != null && this.J != null) {
            if ((this.M || editText.getBackground() == null) && this.S != 0) {
                q0();
                this.M = true;
            }
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f6354b0 != i10) {
            this.f6354b0 = i10;
            this.f6386s0 = i10;
            this.f6390u0 = i10;
            this.f6392v0 = i10;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(androidx.core.content.a.c(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f6386s0 = defaultColor;
        this.f6354b0 = defaultColor;
        this.f6388t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f6390u0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f6392v0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 != this.S) {
            this.S = i10;
            if (this.f6363h != null) {
                V();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.T = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.P = this.P.v().y(i10, this.P.r()).C(i10, this.P.t()).q(i10, this.P.j()).u(i10, this.P.l()).m();
        m();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f6382q0 != i10) {
            this.f6382q0 = i10;
            A0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.f6378o0 = colorStateList.getDefaultColor();
            this.f6394w0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f6380p0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.f6382q0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            A0();
        }
        this.f6382q0 = defaultColor;
        A0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f6384r0 != colorStateList) {
            this.f6384r0 = colorStateList;
            A0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.V = i10;
        A0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.W = i10;
        A0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f6377o != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f6385s = appCompatTextView;
                appCompatTextView.setId(q4.f.textinput_counter);
                Typeface typeface = this.f6360f0;
                if (typeface != null) {
                    this.f6385s.setTypeface(typeface);
                }
                this.f6385s.setMaxLines(1);
                this.f6375n.e(this.f6385s, 2);
                r.d((ViewGroup.MarginLayoutParams) this.f6385s.getLayoutParams(), getResources().getDimensionPixelOffset(q4.d.mtrl_textinput_counter_margin_start));
                m0();
                j0();
            } else {
                this.f6375n.C(this.f6385s, 2);
                this.f6385s = null;
            }
            this.f6377o = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f6379p != i10) {
            if (i10 <= 0) {
                i10 = -1;
            }
            this.f6379p = i10;
            if (this.f6377o) {
                j0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f6387t != i10) {
            this.f6387t = i10;
            m0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            m0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f6389u != i10) {
            this.f6389u = i10;
            m0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            m0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            n0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            if (Q()) {
                n0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f6374m0 = colorStateList;
        this.f6376n0 = colorStateList;
        if (this.f6363h != null) {
            u0(false);
        }
    }

    public void setEnabled(boolean z10) {
        Y(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f6361g.N(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f6361g.O(z10);
    }

    public void setEndIconContentDescription(int i10) {
        this.f6361g.P(i10);
    }

    public void setEndIconDrawable(int i10) {
        this.f6361g.R(i10);
    }

    public void setEndIconMinSize(int i10) {
        this.f6361g.T(i10);
    }

    public void setEndIconMode(int i10) {
        this.f6361g.U(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f6361g.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f6361g.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f6361g.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f6361g.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f6361g.Z(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f6361g.a0(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f6375n.A()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f6375n.Q(charSequence);
        } else {
            this.f6375n.w();
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f6375n.E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f6375n.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f6375n.G(z10);
    }

    public void setErrorIconDrawable(int i10) {
        this.f6361g.b0(i10);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f6361g.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f6361g.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f6361g.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f6361g.g0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f6375n.H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f6375n.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f6400z0 != z10) {
            this.f6400z0 = z10;
            u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!O()) {
                setHelperTextEnabled(true);
            }
            this.f6375n.R(charSequence);
        } else if (O()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f6375n.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f6375n.K(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f6375n.J(i10);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.A0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.G) {
            this.G = z10;
            if (!z10) {
                this.I = false;
                if (!TextUtils.isEmpty(this.H) && TextUtils.isEmpty(this.f6363h.getHint())) {
                    this.f6363h.setHint(this.H);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f6363h.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.H)) {
                        setHint(hint);
                    }
                    this.f6363h.setHint((CharSequence) null);
                }
                this.I = true;
            }
            if (this.f6363h != null) {
                t0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f6398y0.P(i10);
        this.f6376n0 = this.f6398y0.p();
        if (this.f6363h != null) {
            u0(false);
            t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f6376n0 != colorStateList) {
            if (this.f6374m0 == null) {
                this.f6398y0.R(colorStateList);
            }
            this.f6376n0 = colorStateList;
            if (this.f6363h != null) {
                u0(false);
            }
        }
    }

    public void setLengthCounter(e eVar) {
        this.f6383r = eVar;
    }

    public void setMaxEms(int i10) {
        this.f6369k = i10;
        EditText editText = this.f6363h;
        if (editText != null && i10 != -1) {
            editText.setMaxEms(i10);
        }
    }

    public void setMaxWidth(int i10) {
        this.f6373m = i10;
        EditText editText = this.f6363h;
        if (editText != null && i10 != -1) {
            editText.setMaxWidth(i10);
        }
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f6367j = i10;
        EditText editText = this.f6363h;
        if (editText != null && i10 != -1) {
            editText.setMinEms(i10);
        }
    }

    public void setMinWidth(int i10) {
        this.f6371l = i10;
        EditText editText = this.f6363h;
        if (editText != null && i10 != -1) {
            editText.setMinWidth(i10);
        }
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        this.f6361g.i0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f6361g.k0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f6361g.m0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f6361g.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f6361g.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f6395x == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f6395x = appCompatTextView;
            appCompatTextView.setId(q4.f.textinput_placeholder);
            m0.B0(this.f6395x, 2);
            i1.d A2 = A();
            this.A = A2;
            A2.g0(67);
            this.B = A();
            setPlaceholderTextAppearance(this.f6399z);
            setPlaceholderTextColor(this.f6397y);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f6393w) {
                setPlaceholderTextEnabled(true);
            }
            this.f6391v = charSequence;
        }
        x0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f6399z = i10;
        TextView textView = this.f6395x;
        if (textView != null) {
            androidx.core.widget.i.n(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f6397y != colorStateList) {
            this.f6397y = colorStateList;
            TextView textView = this.f6395x;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f6359f.n(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f6359f.o(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f6359f.p(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        i5.g gVar = this.J;
        if (gVar != null && gVar.D() != kVar) {
            this.P = kVar;
            m();
        }
    }

    public void setStartIconCheckable(boolean z10) {
        this.f6359f.q(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        this.f6359f.t(i10);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f6359f.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f6359f.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f6359f.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f6359f.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f6359f.y(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f6359f.z(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f6361g.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f6361g.q0(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f6361g.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f6363h;
        if (editText != null) {
            m0.q0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f6360f0) {
            this.f6360f0 = typeface;
            this.f6398y0.i0(typeface);
            this.f6375n.N(typeface);
            TextView textView = this.f6385s;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void u0(boolean z10) {
        v0(z10, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r22, android.util.AttributeSet r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            r7 = r23
            r8 = r24
            int r9 = F0
            r1 = r22
            android.content.Context r1 = m5.a.c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f6367j = r10
            r0.f6369k = r10
            r0.f6371l = r10
            r0.f6373m = r10
            com.google.android.material.textfield.v r1 = new com.google.android.material.textfield.v
            r1.<init>(r0)
            r0.f6375n = r1
            com.google.android.material.textfield.i0 r1 = new com.google.android.material.textfield.i0
            r1.<init>()
            r0.f6383r = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f6355c0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f6356d0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f6358e0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f6366i0 = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.f6398y0 = r1
            r11 = 0
            r0.E0 = r11
            android.content.Context r12 = r21.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r12)
            r0.f6357e = r14
            r14.setAddStatesFromChildren(r13)
            android.animation.TimeInterpolator r2 = r4.a.f15582a
            r1.h0(r2)
            r1.e0(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.S(r2)
            int[] r3 = q4.k.G6
            int r15 = q4.k.f15005d7
            int r6 = q4.k.f14985b7
            int r5 = q4.k.f15178v7
            int r4 = q4.k.A7
            int r2 = q4.k.E7
            int[] r16 = new int[]{r15, r6, r5, r4, r2}
            r1 = r12
            r17 = r2
            r2 = r23
            r18 = r4
            r4 = r24
            r19 = r5
            r5 = r9
            r20 = r6
            r6 = r16
            androidx.appcompat.widget.v0 r1 = com.google.android.material.internal.r.j(r1, r2, r3, r4, r5, r6)
            com.google.android.material.textfield.a0 r2 = new com.google.android.material.textfield.a0
            r2.<init>(r0, r1)
            r0.f6359f = r2
            int r3 = q4.k.D7
            boolean r3 = r1.a(r3, r13)
            r0.G = r3
            int r3 = q4.k.L6
            java.lang.CharSequence r3 = r1.p(r3)
            r0.setHint((java.lang.CharSequence) r3)
            int r3 = q4.k.C7
            boolean r3 = r1.a(r3, r13)
            r0.A0 = r3
            int r3 = q4.k.f15196x7
            boolean r3 = r1.a(r3, r13)
            r0.f6400z0 = r3
            int r3 = q4.k.N6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x00d0
            int r3 = r1.k(r3, r10)
            r0.setMinEms(r3)
            goto L_0x00df
        L_0x00d0:
            int r3 = q4.k.K6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x00df
            int r3 = r1.f(r3, r10)
            r0.setMinWidth(r3)
        L_0x00df:
            int r3 = q4.k.M6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x00ef
            int r3 = r1.k(r3, r10)
            r0.setMaxEms(r3)
            goto L_0x00fe
        L_0x00ef:
            int r3 = q4.k.J6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x00fe
            int r3 = r1.f(r3, r10)
            r0.setMaxWidth(r3)
        L_0x00fe:
            i5.k$b r3 = i5.k.e(r12, r7, r8, r9)
            i5.k r3 = r3.m()
            r0.P = r3
            android.content.res.Resources r3 = r12.getResources()
            int r4 = q4.d.mtrl_textinput_box_label_cutout_padding
            int r3 = r3.getDimensionPixelOffset(r4)
            r0.R = r3
            int r3 = q4.k.Q6
            int r3 = r1.e(r3, r11)
            r0.T = r3
            int r3 = q4.k.X6
            android.content.res.Resources r4 = r12.getResources()
            int r5 = q4.d.mtrl_textinput_box_stroke_width_default
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.f(r3, r4)
            r0.V = r3
            int r3 = q4.k.Y6
            android.content.res.Resources r4 = r12.getResources()
            int r5 = q4.d.mtrl_textinput_box_stroke_width_focused
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.f(r3, r4)
            r0.W = r3
            int r3 = r0.V
            r0.U = r3
            int r3 = q4.k.U6
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r1.d(r3, r4)
            int r5 = q4.k.T6
            float r5 = r1.d(r5, r4)
            int r6 = q4.k.R6
            float r6 = r1.d(r6, r4)
            int r7 = q4.k.S6
            float r4 = r1.d(r7, r4)
            i5.k r7 = r0.P
            i5.k$b r7 = r7.v()
            r8 = 0
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x016c
            r7.A(r3)
        L_0x016c:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0173
            r7.E(r5)
        L_0x0173:
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x017a
            r7.w(r6)
        L_0x017a:
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0181
            r7.s(r4)
        L_0x0181:
            i5.k r3 = r7.m()
            r0.P = r3
            int r3 = q4.k.O6
            android.content.res.ColorStateList r3 = f5.c.b(r12, r1, r3)
            if (r3 == 0) goto L_0x01e5
            int r4 = r3.getDefaultColor()
            r0.f6386s0 = r4
            r0.f6354b0 = r4
            boolean r4 = r3.isStateful()
            r5 = 16843623(0x1010367, float:2.3696E-38)
            r6 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L_0x01c8
            int[] r4 = new int[]{r6}
            int r4 = r3.getColorForState(r4, r10)
            r0.f6388t0 = r4
            r4 = 16842908(0x101009c, float:2.3693995E-38)
            r6 = 16842910(0x101009e, float:2.3694E-38)
            int[] r4 = new int[]{r4, r6}
            int r4 = r3.getColorForState(r4, r10)
            r0.f6390u0 = r4
            int[] r4 = new int[]{r5, r6}
            int r3 = r3.getColorForState(r4, r10)
        L_0x01c5:
            r0.f6392v0 = r3
            goto L_0x01ef
        L_0x01c8:
            int r3 = r0.f6386s0
            r0.f6390u0 = r3
            int r3 = q4.c.mtrl_filled_background_color
            android.content.res.ColorStateList r3 = g.a.a(r12, r3)
            int[] r4 = new int[]{r6}
            int r4 = r3.getColorForState(r4, r10)
            r0.f6388t0 = r4
            int[] r4 = new int[]{r5}
            int r3 = r3.getColorForState(r4, r10)
            goto L_0x01c5
        L_0x01e5:
            r0.f6354b0 = r11
            r0.f6386s0 = r11
            r0.f6388t0 = r11
            r0.f6390u0 = r11
            r0.f6392v0 = r11
        L_0x01ef:
            int r3 = q4.k.I6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x01ff
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.f6376n0 = r3
            r0.f6374m0 = r3
        L_0x01ff:
            int r3 = q4.k.V6
            android.content.res.ColorStateList r4 = f5.c.b(r12, r1, r3)
            int r3 = r1.b(r3, r11)
            r0.f6382q0 = r3
            int r3 = q4.c.mtrl_textinput_default_box_stroke_color
            int r3 = androidx.core.content.a.c(r12, r3)
            r0.f6378o0 = r3
            int r3 = q4.c.mtrl_textinput_disabled_color
            int r3 = androidx.core.content.a.c(r12, r3)
            r0.f6394w0 = r3
            int r3 = q4.c.mtrl_textinput_hovered_box_stroke_color
            int r3 = androidx.core.content.a.c(r12, r3)
            r0.f6380p0 = r3
            if (r4 == 0) goto L_0x0228
            r0.setBoxStrokeColorStateList(r4)
        L_0x0228:
            int r3 = q4.k.W6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x0237
            android.content.res.ColorStateList r3 = f5.c.b(r12, r1, r3)
            r0.setBoxStrokeErrorColor(r3)
        L_0x0237:
            r3 = r17
            int r4 = r1.n(r3, r10)
            if (r4 == r10) goto L_0x0246
            int r3 = r1.n(r3, r11)
            r0.setHintTextAppearance(r3)
        L_0x0246:
            int r3 = q4.k.f15025f7
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.E = r3
            int r3 = q4.k.f15035g7
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.F = r3
            r3 = r19
            int r3 = r1.n(r3, r11)
            int r4 = q4.k.f15133q7
            java.lang.CharSequence r4 = r1.p(r4)
            int r5 = q4.k.f15124p7
            int r5 = r1.k(r5, r13)
            int r6 = q4.k.f15142r7
            boolean r6 = r1.a(r6, r11)
            r7 = r18
            int r7 = r1.n(r7, r11)
            int r8 = q4.k.f15214z7
            boolean r8 = r1.a(r8, r11)
            int r9 = q4.k.f15205y7
            java.lang.CharSequence r9 = r1.p(r9)
            int r12 = q4.k.M7
            int r12 = r1.n(r12, r11)
            int r13 = q4.k.L7
            java.lang.CharSequence r13 = r1.p(r13)
            int r10 = q4.k.Z6
            boolean r10 = r1.a(r10, r11)
            int r11 = q4.k.f14975a7
            r23 = r9
            r9 = -1
            int r9 = r1.k(r11, r9)
            r0.setCounterMaxLength(r9)
            r9 = 0
            int r11 = r1.n(r15, r9)
            r0.f6389u = r11
            r11 = r20
            int r11 = r1.n(r11, r9)
            r0.f6387t = r11
            int r11 = q4.k.P6
            int r9 = r1.k(r11, r9)
            r0.setBoxBackgroundMode(r9)
            r0.setErrorContentDescription(r4)
            r0.setErrorAccessibilityLiveRegion(r5)
            int r4 = r0.f6387t
            r0.setCounterOverflowTextAppearance(r4)
            r0.setHelperTextTextAppearance(r7)
            r0.setErrorTextAppearance(r3)
            int r3 = r0.f6389u
            r0.setCounterTextAppearance(r3)
            r0.setPlaceholderText(r13)
            r0.setPlaceholderTextAppearance(r12)
            int r3 = q4.k.f15187w7
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x02e1
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setErrorTextColor(r3)
        L_0x02e1:
            int r3 = q4.k.B7
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x02f0
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setHelperTextColor(r3)
        L_0x02f0:
            int r3 = q4.k.F7
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x02ff
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setHintTextColor(r3)
        L_0x02ff:
            int r3 = q4.k.f15015e7
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x030e
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setCounterTextColor(r3)
        L_0x030e:
            int r3 = q4.k.f14995c7
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x031d
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setCounterOverflowTextColor(r3)
        L_0x031d:
            int r3 = q4.k.N7
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x032c
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setPlaceholderTextColor(r3)
        L_0x032c:
            com.google.android.material.textfield.s r3 = new com.google.android.material.textfield.s
            r3.<init>(r0, r1)
            r0.f6361g = r3
            int r4 = q4.k.H6
            r5 = 1
            boolean r4 = r1.a(r4, r5)
            r1.w()
            r1 = 2
            androidx.core.view.m0.B0(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r1 < r7) goto L_0x034a
            androidx.core.view.m0.D0(r0, r5)
        L_0x034a:
            r14.addView(r2)
            r14.addView(r3)
            r0.addView(r14)
            r0.setEnabled(r4)
            r0.setHelperTextEnabled(r8)
            r0.setErrorEnabled(r6)
            r0.setCounterEnabled(r10)
            r1 = r23
            r0.setHelperText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f6361g.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f6361g.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f6361g.c0(drawable);
    }

    public void setHint(CharSequence charSequence) {
        if (this.G) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f6361g.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f6361g.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f6359f.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f6359f.s(drawable);
    }
}
