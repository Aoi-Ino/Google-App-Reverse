package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import f.j;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: e  reason: collision with root package name */
    private int f1301e;

    /* renamed from: f  reason: collision with root package name */
    private int f1302f;

    /* renamed from: g  reason: collision with root package name */
    private WeakReference f1303g;

    /* renamed from: h  reason: collision with root package name */
    private LayoutInflater f1304h;

    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1301e != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1304h;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1301e, viewGroup, false);
            int i10 = this.f1302f;
            if (i10 != -1) {
                inflate.setId(i10);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1303g = new WeakReference(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1302f;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1304h;
    }

    public int getLayoutResource() {
        return this.f1301e;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f1302f = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1304h = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f1301e = i10;
    }

    public void setOnInflateListener(a aVar) {
    }

    public void setVisibility(int i10) {
        WeakReference weakReference = this.f1303g;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i10);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1301e = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.H3, i10, 0);
        this.f1302f = obtainStyledAttributes.getResourceId(j.K3, -1);
        this.f1301e = obtainStyledAttributes.getResourceId(j.J3, 0);
        setId(obtainStyledAttributes.getResourceId(j.I3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
