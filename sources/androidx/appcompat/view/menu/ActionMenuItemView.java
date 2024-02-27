package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.a1;
import androidx.appcompat.widget.i0;
import f.j;

public class ActionMenuItemView extends AppCompatTextView implements n.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: l  reason: collision with root package name */
    i f860l;

    /* renamed from: m  reason: collision with root package name */
    private CharSequence f861m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f862n;

    /* renamed from: o  reason: collision with root package name */
    g.b f863o;

    /* renamed from: p  reason: collision with root package name */
    private i0 f864p;

    /* renamed from: q  reason: collision with root package name */
    b f865q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f866r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f867s;

    /* renamed from: t  reason: collision with root package name */
    private int f868t;

    /* renamed from: u  reason: collision with root package name */
    private int f869u;

    /* renamed from: v  reason: collision with root package name */
    private int f870v;

    private class a extends i0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public p b() {
            b bVar = ActionMenuItemView.this.f865q;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.g$b r1 = r0.f863o
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.i r0 = r0.f860l
                boolean r0 = r1.a(r0)
                if (r0 == 0) goto L_0x001c
                androidx.appcompat.view.menu.p r0 = r3.b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.d()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.a.c():boolean");
        }
    }

    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean s() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void t() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f861m);
        if (this.f862n != null && (!this.f860l.B() || (!this.f866r && !this.f867s))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence = null;
        setText(z12 ? this.f861m : null);
        CharSequence contentDescription = this.f860l.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z12 ? null : this.f860l.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f860l.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z12) {
                charSequence = this.f860l.getTitle();
            }
            a1.a(this, charSequence);
            return;
        }
        a1.a(this, tooltipText);
    }

    public boolean a() {
        return r();
    }

    public boolean b() {
        return r() && this.f860l.getIcon() == null;
    }

    public boolean d() {
        return true;
    }

    public void e(i iVar, int i10) {
        this.f860l = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f864p == null) {
            this.f864p = new a();
        }
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public i getItemData() {
        return this.f860l;
    }

    public void onClick(View view) {
        g.b bVar = this.f863o;
        if (bVar != null) {
            bVar.a(this.f860l);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f866r = s();
        t();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean r10 = r();
        if (r10 && (i12 = this.f869u) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f868t) : this.f868t;
        if (mode != 1073741824 && this.f868t > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i11);
        }
        if (!r10 && this.f862n != null) {
            super.setPadding((getMeasuredWidth() - this.f862n.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        i0 i0Var;
        if (!this.f860l.hasSubMenu() || (i0Var = this.f864p) == null || !i0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean r() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f867s != z10) {
            this.f867s = z10;
            i iVar = this.f860l;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f862n = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f870v;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i10) / ((float) intrinsicWidth)));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i10) / ((float) intrinsicHeight)));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        t();
    }

    public void setItemInvoker(g.b bVar) {
        this.f863o = bVar;
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f869u = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f865q = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f861m = charSequence;
        t();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f866r = s();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f11283v, i10, 0);
        this.f868t = obtainStyledAttributes.getDimensionPixelSize(j.f11288w, 0);
        obtainStyledAttributes.recycle();
        this.f870v = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f869u = -1;
        setSaveEnabled(false);
    }
}
