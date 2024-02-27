package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import s.e;
import s.i;

public abstract class c extends View {

    /* renamed from: e  reason: collision with root package name */
    protected int[] f1776e = new int[32];

    /* renamed from: f  reason: collision with root package name */
    protected int f1777f;

    /* renamed from: g  reason: collision with root package name */
    protected Context f1778g;

    /* renamed from: h  reason: collision with root package name */
    protected i f1779h;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f1780i = false;

    /* renamed from: j  reason: collision with root package name */
    protected String f1781j;

    /* renamed from: k  reason: collision with root package name */
    protected String f1782k;

    /* renamed from: l  reason: collision with root package name */
    private View[] f1783l = null;

    /* renamed from: m  reason: collision with root package name */
    protected HashMap f1784m = new HashMap();

    public c(Context context) {
        super(context);
        this.f1778g = context;
        i((AttributeSet) null);
    }

    private void a(String str) {
        if (str != null && str.length() != 0 && this.f1778g != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int h10 = h(trim);
            if (h10 != 0) {
                this.f1784m.put(Integer.valueOf(h10), trim);
                b(h10);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    private void b(int i10) {
        if (i10 != getId()) {
            int i11 = this.f1777f + 1;
            int[] iArr = this.f1776e;
            if (i11 > iArr.length) {
                this.f1776e = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f1776e;
            int i12 = this.f1777f;
            iArr2[i12] = i10;
            this.f1777f = i12 + 1;
        }
    }

    private void c(String str) {
        if (str != null && str.length() != 0 && this.f1778g != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = constraintLayout.getChildAt(i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).f1702c0)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        b(childAt.getId());
                    }
                }
            }
        }
    }

    private int g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f1778g.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int h(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object g10 = constraintLayout.g(0, str);
            if (g10 instanceof Integer) {
                i10 = ((Integer) g10).intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = g(constraintLayout, str);
        }
        if (i10 == 0) {
            try {
                i10 = h.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        return i10 == 0 ? this.f1778g.getResources().getIdentifier(str, "id", this.f1778g.getPackageName()) : i10;
    }

    /* access modifiers changed from: protected */
    public void d() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            e((ConstraintLayout) parent);
        }
    }

    /* access modifiers changed from: protected */
    public void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f1777f; i10++) {
            View l10 = constraintLayout.l(this.f1776e[i10]);
            if (l10 != null) {
                l10.setVisibility(visibility);
                if (elevation > 0.0f) {
                    l10.setTranslationZ(l10.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void f(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1776e, this.f1777f);
    }

    /* access modifiers changed from: protected */
    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f2027n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.G1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1781j = string;
                    setIds(string);
                } else if (index == i.H1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1782k = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void j(e eVar, boolean z10);

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
    }

    public void m(ConstraintLayout constraintLayout) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = (java.lang.String) r5.f1784m.get(java.lang.Integer.valueOf(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.f1781j
            r5.setIds(r0)
        L_0x000b:
            s.i r0 = r5.f1779h
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.c()
            r0 = 0
        L_0x0014:
            int r1 = r5.f1777f
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.f1776e
            r1 = r1[r0]
            android.view.View r2 = r6.l(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap r3 = r5.f1784m
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.g(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.f1776e
            r2[r0] = r3
            java.util.HashMap r2 = r5.f1784m
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.l(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            s.i r1 = r5.f1779h
            s.e r2 = r6.p(r2)
            r1.a(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            s.i r0 = r5.f1779h
            s.f r6 = r6.f1676g
            r0.b(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.n(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public void o() {
        if (this.f1779h != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.b) {
                ((ConstraintLayout.b) layoutParams).f1740v0 = (e) this.f1779h;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1781j;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1782k;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (this.f1780i) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f1781j = str;
        if (str != null) {
            int i10 = 0;
            this.f1777f = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    a(str.substring(i10));
                    return;
                } else {
                    a(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setReferenceTags(String str) {
        this.f1782k = str;
        if (str != null) {
            int i10 = 0;
            this.f1777f = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    c(str.substring(i10));
                    return;
                } else {
                    c(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1781j = null;
        this.f1777f = 0;
        for (int b10 : iArr) {
            b(b10);
        }
    }

    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f1781j == null) {
            b(i10);
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1778g = context;
        i(attributeSet);
    }
}
