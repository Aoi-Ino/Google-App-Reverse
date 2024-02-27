package v4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.v0;
import androidx.vectordrawable.graphics.drawable.c;
import com.google.android.material.internal.u;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q4.i;
import q4.j;
import q4.k;
import z4.e;

public class d extends f {
    private static final int C = j.Widget_MaterialComponents_CompoundButton_CheckBox;
    private static final int[] D = {q4.b.state_indeterminate};
    private static final int[] E;
    private static final int[][] F;
    private static final int G = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    private final c A;
    private final androidx.vectordrawable.graphics.drawable.b B;

    /* renamed from: i  reason: collision with root package name */
    private final LinkedHashSet f17333i;

    /* renamed from: j  reason: collision with root package name */
    private final LinkedHashSet f17334j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f17335k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f17336l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f17337m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f17338n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f17339o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f17340p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f17341q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f17342r;

    /* renamed from: s  reason: collision with root package name */
    ColorStateList f17343s;

    /* renamed from: t  reason: collision with root package name */
    ColorStateList f17344t;

    /* renamed from: u  reason: collision with root package name */
    private PorterDuff.Mode f17345u;

    /* renamed from: v  reason: collision with root package name */
    private int f17346v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public int[] f17347w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f17348x;

    /* renamed from: y  reason: collision with root package name */
    private CharSequence f17349y;

    /* renamed from: z  reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f17350z;

    class a extends androidx.vectordrawable.graphics.drawable.b {
        a() {
        }

        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = d.this.f17343s;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            }
        }

        public void c(Drawable drawable) {
            super.c(drawable);
            d dVar = d.this;
            ColorStateList colorStateList = dVar.f17343s;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.n(drawable, colorStateList.getColorForState(dVar.f17347w, d.this.f17343s.getDefaultColor()));
            }
        }
    }

    static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        int f17352e;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (a) null);
            }

            /* renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f17352e = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }

        private String c() {
            int i10 = this.f17352e;
            if (i10 != 1) {
                return i10 != 2 ? "unchecked" : "indeterminate";
            }
            return "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + c() + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f17352e));
        }

        /* synthetic */ b(Parcel parcel, a aVar) {
            this(parcel);
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    static {
        int i10 = q4.b.state_error;
        E = new int[]{i10};
        F = new int[][]{new int[]{16842910, i10}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q4.b.f14959d);
    }

    private boolean c(v0 v0Var) {
        return v0Var.n(k.J3, 0) == G && v0Var.n(k.K3, 0) == 0;
    }

    private void e() {
        this.f17340p = e.c(this.f17340p, this.f17343s, androidx.core.widget.c.c(this));
        this.f17341q = e.c(this.f17341q, this.f17344t, this.f17345u);
        g();
        h();
        super.setButtonDrawable(e.a(this.f17340p, this.f17341q));
        refreshDrawableState();
    }

    private void f() {
        if (Build.VERSION.SDK_INT >= 30 && this.f17349y == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    private void g() {
        c cVar;
        if (this.f17342r) {
            c cVar2 = this.A;
            if (cVar2 != null) {
                cVar2.f(this.B);
                this.A.b(this.B);
            }
            Drawable drawable = this.f17340p;
            if ((drawable instanceof AnimatedStateListDrawable) && (cVar = this.A) != null) {
                int i10 = q4.f.checked;
                int i11 = q4.f.unchecked;
                ((AnimatedStateListDrawable) drawable).addTransition(i10, i11, cVar, false);
                ((AnimatedStateListDrawable) this.f17340p).addTransition(q4.f.indeterminate, i11, this.A, false);
            }
        }
    }

    private String getButtonStateDescription() {
        Resources resources;
        int i10;
        int i11 = this.f17346v;
        if (i11 == 1) {
            resources = getResources();
            i10 = i.mtrl_checkbox_state_description_checked;
        } else if (i11 == 0) {
            resources = getResources();
            i10 = i.mtrl_checkbox_state_description_unchecked;
        } else {
            resources = getResources();
            i10 = i.mtrl_checkbox_state_description_indeterminate;
        }
        return resources.getString(i10);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f17335k == null) {
            int[][] iArr = F;
            int[] iArr2 = new int[iArr.length];
            int d10 = x4.a.d(this, q4.b.f14961f);
            int d11 = x4.a.d(this, q4.b.f14963h);
            int d12 = x4.a.d(this, q4.b.colorSurface);
            int d13 = x4.a.d(this, q4.b.colorOnSurface);
            iArr2[0] = x4.a.j(d12, d11, 1.0f);
            iArr2[1] = x4.a.j(d12, d10, 1.0f);
            iArr2[2] = x4.a.j(d12, d13, 0.54f);
            iArr2[3] = x4.a.j(d12, d13, 0.38f);
            iArr2[4] = x4.a.j(d12, d13, 0.38f);
            this.f17335k = new ColorStateList(iArr, iArr2);
        }
        return this.f17335k;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f17343s;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f17340p;
        if (!(drawable == null || (colorStateList2 = this.f17343s) == null)) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f17341q;
        if (drawable2 != null && (colorStateList = this.f17344t) != null) {
            androidx.core.graphics.drawable.a.o(drawable2, colorStateList);
        }
    }

    private void i() {
    }

    public boolean d() {
        return this.f17338n;
    }

    public Drawable getButtonDrawable() {
        return this.f17340p;
    }

    public Drawable getButtonIconDrawable() {
        return this.f17341q;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f17344t;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f17345u;
    }

    public ColorStateList getButtonTintList() {
        return this.f17343s;
    }

    public int getCheckedState() {
        return this.f17346v;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f17339o;
    }

    public boolean isChecked() {
        return this.f17346v == 1;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17336l && this.f17343s == null && this.f17344t == null) {
            setUseMaterialThemeColors(true);
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        this.f17347w = e.e(onCreateDrawableState);
        i();
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable a10;
        if (!this.f17337m || !TextUtils.isEmpty(getText()) || (a10 = androidx.core.widget.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * (u.g(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a10.getBounds();
            androidx.core.graphics.drawable.a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(accessibilityNodeInfo.getText() + ", " + this.f17339o);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f17352e);
    }

    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f17352e = getCheckedState();
        return bVar;
    }

    public void setButtonDrawable(int i10) {
        setButtonDrawable(g.a.b(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f17341q = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(g.a.b(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f17344t != colorStateList) {
            this.f17344t = colorStateList;
            e();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f17345u != mode) {
            this.f17345u = mode;
            e();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f17343s != colorStateList) {
            this.f17343s = colorStateList;
            e();
        }
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f17337m = z10;
    }

    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        AutofillManager a10;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f17346v != i10) {
            this.f17346v = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            f();
            if (!this.f17348x) {
                this.f17348x = true;
                LinkedHashSet linkedHashSet = this.f17334j;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        android.support.v4.media.session.b.a(it.next());
                        throw null;
                    }
                }
                if (!(this.f17346v == 2 || (onCheckedChangeListener = this.f17350z) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (Build.VERSION.SDK_INT >= 26 && (a10 = b.a(getContext().getSystemService(a.a()))) != null) {
                    a10.notifyValueChanged(this);
                }
                this.f17348x = false;
            }
        }
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        i();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f17339o = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f17338n != z10) {
            this.f17338n = z10;
            refreshDrawableState();
            Iterator it = this.f17333i.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f17350z = onCheckedChangeListener;
    }

    public void setStateDescription(CharSequence charSequence) {
        this.f17349y = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f17336l = z10;
        androidx.core.widget.c.d(this, z10 ? getMaterialThemeColorsTintList() : null);
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = C
            android.content.Context r9 = m5.a.c(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f17333i = r9
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f17334j = r9
            android.content.Context r9 = r8.getContext()
            int r0 = q4.e.mtrl_checkbox_button_checked_unchecked
            androidx.vectordrawable.graphics.drawable.c r9 = androidx.vectordrawable.graphics.drawable.c.a(r9, r0)
            r8.A = r9
            v4.d$a r9 = new v4.d$a
            r9.<init>()
            r8.B = r9
            android.content.Context r9 = r8.getContext()
            android.graphics.drawable.Drawable r0 = androidx.core.widget.c.a(r8)
            r8.f17340p = r0
            android.content.res.ColorStateList r0 = r8.getSuperButtonTintList()
            r8.f17343s = r0
            r6 = 0
            r8.setSupportButtonTintList(r6)
            int[] r2 = q4.k.I3
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r9
            r1 = r10
            r3 = r11
            androidx.appcompat.widget.v0 r10 = com.google.android.material.internal.r.j(r0, r1, r2, r3, r4, r5)
            int r11 = q4.k.L3
            android.graphics.drawable.Drawable r11 = r10.g(r11)
            r8.f17341q = r11
            android.graphics.drawable.Drawable r11 = r8.f17340p
            r0 = 1
            if (r11 == 0) goto L_0x007c
            boolean r11 = com.google.android.material.internal.r.g(r9)
            if (r11 == 0) goto L_0x007c
            boolean r11 = r8.c(r10)
            if (r11 == 0) goto L_0x007c
            super.setButtonDrawable((android.graphics.drawable.Drawable) r6)
            int r11 = q4.e.mtrl_checkbox_button
            android.graphics.drawable.Drawable r11 = g.a.b(r9, r11)
            r8.f17340p = r11
            r8.f17342r = r0
            android.graphics.drawable.Drawable r11 = r8.f17341q
            if (r11 != 0) goto L_0x007c
            int r11 = q4.e.mtrl_checkbox_button_icon
            android.graphics.drawable.Drawable r11 = g.a.b(r9, r11)
            r8.f17341q = r11
        L_0x007c:
            int r11 = q4.k.M3
            android.content.res.ColorStateList r9 = f5.c.b(r9, r10, r11)
            r8.f17344t = r9
            int r9 = q4.k.N3
            r11 = -1
            int r9 = r10.k(r9, r11)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.u.i(r9, r11)
            r8.f17345u = r9
            int r9 = q4.k.S3
            boolean r9 = r10.a(r9, r7)
            r8.f17336l = r9
            int r9 = q4.k.O3
            boolean r9 = r10.a(r9, r0)
            r8.f17337m = r9
            int r9 = q4.k.R3
            boolean r9 = r10.a(r9, r7)
            r8.f17338n = r9
            int r9 = q4.k.Q3
            java.lang.CharSequence r9 = r10.p(r9)
            r8.f17339o = r9
            int r9 = q4.k.P3
            boolean r11 = r10.s(r9)
            if (r11 == 0) goto L_0x00c2
            int r9 = r10.k(r9, r7)
            r8.setCheckedState(r9)
        L_0x00c2:
            r10.w()
            r8.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.d.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setButtonDrawable(Drawable drawable) {
        this.f17340p = drawable;
        this.f17342r = false;
        e();
    }
}
