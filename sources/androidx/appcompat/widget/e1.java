package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import f.d;
import f.f;
import f.g;
import f.i;

class e1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1366a;

    /* renamed from: b  reason: collision with root package name */
    private final View f1367b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f1368c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f1369d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f1370e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f1371f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    private final int[] f1372g = new int[2];

    e1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1369d = layoutParams;
        this.f1366a = context;
        View inflate = LayoutInflater.from(context).inflate(g.abc_tooltip, (ViewGroup) null);
        this.f1367b = inflate;
        this.f1368c = (TextView) inflate.findViewById(f.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int i12;
        int i13;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1366a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1366a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_extra_offset);
            i13 = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            i13 = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1366a.getResources().getDimensionPixelOffset(z10 ? d.tooltip_y_offset_touch : d.tooltip_y_offset_non_touch);
        View b10 = b(view);
        if (b10 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b10.getWindowVisibleDisplayFrame(this.f1370e);
        Rect rect = this.f1370e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1366a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1370e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b10.getLocationOnScreen(this.f1372g);
        view.getLocationOnScreen(this.f1371f);
        int[] iArr = this.f1371f;
        int i14 = iArr[0];
        int[] iArr2 = this.f1372g;
        int i15 = i14 - iArr2[0];
        iArr[0] = i15;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i15 + i10) - (b10.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1367b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1367b.getMeasuredHeight();
        int i16 = this.f1371f[1];
        int i17 = ((i12 + i16) - dimensionPixelOffset3) - measuredHeight;
        int i18 = i16 + i13 + dimensionPixelOffset3;
        if (!z10 ? measuredHeight + i18 > this.f1370e.height() : i17 >= 0) {
            layoutParams.y = i17;
        } else {
            layoutParams.y = i18;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (d()) {
            ((WindowManager) this.f1366a.getSystemService("window")).removeView(this.f1367b);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f1367b.getParent() != null;
    }

    /* access modifiers changed from: package-private */
    public void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1368c.setText(charSequence);
        a(view, i10, i11, z10, this.f1369d);
        ((WindowManager) this.f1366a.getSystemService("window")).addView(this.f1367b, this.f1369d);
    }
}
