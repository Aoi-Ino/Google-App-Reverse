package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.j0;
import androidx.core.view.m0;
import com.google.android.material.internal.f;
import com.google.android.material.internal.r;
import f5.c;
import i5.g;
import q4.h;
import q4.j;
import q4.k;

public class w extends d {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final j0 f6523i;

    /* renamed from: j  reason: collision with root package name */
    private final AccessibilityManager f6524j;

    /* renamed from: k  reason: collision with root package name */
    private final Rect f6525k;

    /* renamed from: l  reason: collision with root package name */
    private final int f6526l;

    /* renamed from: m  reason: collision with root package name */
    private final float f6527m;

    /* renamed from: n  reason: collision with root package name */
    private ColorStateList f6528n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public int f6529o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f6530p;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            w wVar = w.this;
            w.this.j(i10 < 0 ? wVar.f6523i.v() : wVar.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = w.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = w.this.f6523i.y();
                    i10 = w.this.f6523i.x();
                    j10 = w.this.f6523i.w();
                }
                onItemClickListener.onItemClick(w.this.f6523i.h(), view, i10, j10);
            }
            w.this.f6523i.dismiss();
        }
    }

    private class b extends ArrayAdapter {

        /* renamed from: e  reason: collision with root package name */
        private ColorStateList f6532e;

        /* renamed from: f  reason: collision with root package name */
        private ColorStateList f6533f;

        b(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            f();
        }

        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {16843623, -16842919};
            int[] iArr2 = {16842913, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{x4.a.i(w.this.f6529o, w.this.f6530p.getColorForState(iArr2, 0)), x4.a.i(w.this.f6529o, w.this.f6530p.getColorForState(iArr, 0)), w.this.f6529o});
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(w.this.f6529o);
            if (this.f6533f == null) {
                return colorDrawable;
            }
            androidx.core.graphics.drawable.a.o(colorDrawable, this.f6532e);
            return new RippleDrawable(this.f6533f, colorDrawable, (Drawable) null);
        }

        private boolean c() {
            return w.this.f6529o != 0;
        }

        private boolean d() {
            return w.this.f6530p != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {16842919};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{w.this.f6530p.getColorForState(iArr, 0), 0});
        }

        /* access modifiers changed from: package-private */
        public void f() {
            this.f6533f = e();
            this.f6532e = a();
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                m0.u0(textView, w.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q4.b.f14958b);
    }

    private TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        AccessibilityManager accessibilityManager = this.f6524j;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int h() {
        ListAdapter adapter = getAdapter();
        TextInputLayout f10 = f();
        int i10 = 0;
        if (adapter == null || f10 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f6523i.x()) + 15);
        View view = null;
        int i11 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(max, view, f10);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        Drawable g10 = this.f6523i.g();
        if (g10 != null) {
            g10.getPadding(this.f6525k);
            Rect rect = this.f6525k;
            i11 += rect.left + rect.right;
        }
        return i11 + f10.getEndIconView().getMeasuredWidth();
    }

    private void i() {
        TextInputLayout f10 = f();
        if (f10 != null) {
            f10.r0();
        }
    }

    /* access modifiers changed from: private */
    public void j(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    public void dismissDropDown() {
        if (g()) {
            this.f6523i.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f6528n;
    }

    public CharSequence getHint() {
        TextInputLayout f10 = f();
        return (f10 == null || !f10.R()) ? super.getHint() : f10.getHint();
    }

    public float getPopupElevation() {
        return this.f6527m;
    }

    public int getSimpleItemSelectedColor() {
        return this.f6529o;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f6530p;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout f10 = f();
        if (f10 != null && f10.R() && super.getHint() == null && f.b()) {
            setHint("");
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6523i.dismiss();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), h()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public void onWindowFocusChanged(boolean z10) {
        if (!g()) {
            super.onWindowFocusChanged(z10);
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f6523i.p(getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        j0 j0Var = this.f6523i;
        if (j0Var != null) {
            j0Var.b(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f6528n = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof g) {
            ((g) dropDownBackground).W(this.f6528n);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f6523i.M(getOnItemSelectedListener());
    }

    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        i();
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f6529o = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f6530p = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    public void showDropDown() {
        if (g()) {
            this.f6523i.a();
        } else {
            super.showDropDown();
        }
    }

    public w(Context context, AttributeSet attributeSet, int i10) {
        super(m5.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f6525k = new Rect();
        Context context2 = getContext();
        TypedArray i11 = r.i(context2, attributeSet, k.f15164u2, i10, j.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i12 = k.f15173v2;
        if (i11.hasValue(i12) && i11.getInt(i12, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f6526l = i11.getResourceId(k.f15200y2, h.mtrl_auto_complete_simple_item);
        this.f6527m = (float) i11.getDimensionPixelOffset(k.f15182w2, q4.d.mtrl_exposed_dropdown_menu_popup_elevation);
        int i13 = k.f15191x2;
        if (i11.hasValue(i13)) {
            this.f6528n = ColorStateList.valueOf(i11.getColor(i13, 0));
        }
        this.f6529o = i11.getColor(k.f15209z2, 0);
        this.f6530p = c.a(context2, i11, k.A2);
        this.f6524j = (AccessibilityManager) context2.getSystemService("accessibility");
        j0 j0Var = new j0(context2);
        this.f6523i = j0Var;
        j0Var.J(true);
        j0Var.D(this);
        j0Var.I(2);
        j0Var.p(getAdapter());
        j0Var.L(new a());
        int i14 = k.B2;
        if (i11.hasValue(i14)) {
            setSimpleItems(i11.getResourceId(i14, 0));
        }
        i11.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f6526l, strArr));
    }
}
