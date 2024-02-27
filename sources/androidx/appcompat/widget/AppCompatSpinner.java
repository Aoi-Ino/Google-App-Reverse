package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.p;
import androidx.core.view.m0;

public class AppCompatSpinner extends Spinner {

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f1157m = {16843505};

    /* renamed from: e  reason: collision with root package name */
    private final e f1158e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f1159f;

    /* renamed from: g  reason: collision with root package name */
    private i0 f1160g;

    /* renamed from: h  reason: collision with root package name */
    private SpinnerAdapter f1161h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f1162i;

    /* renamed from: j  reason: collision with root package name */
    private j f1163j;

    /* renamed from: k  reason: collision with root package name */
    int f1164k;

    /* renamed from: l  reason: collision with root package name */
    final Rect f1165l;

    class a extends i0 {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ h f1166n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, h hVar) {
            super(view);
            this.f1166n = hVar;
        }

        public p b() {
            return this.f1166n;
        }

        public boolean c() {
            if (AppCompatSpinner.this.getInternalPopup().d()) {
                return true;
            }
            AppCompatSpinner.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().d()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.a(viewTreeObserver, this);
            }
        }
    }

    private static final class c {
        static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    private static final class d {
        static int a(View view) {
            return view.getTextAlignment();
        }

        static int b(View view) {
            return view.getTextDirection();
        }

        static void c(View view, int i10) {
            view.setTextAlignment(i10);
        }

        static void d(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    private static final class e {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!androidx.core.util.c.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    class f implements j, DialogInterface.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        androidx.appcompat.app.c f1169e;

        /* renamed from: f  reason: collision with root package name */
        private ListAdapter f1170f;

        /* renamed from: g  reason: collision with root package name */
        private CharSequence f1171g;

        f() {
        }

        public void b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public int c() {
            return 0;
        }

        public boolean d() {
            androidx.appcompat.app.c cVar = this.f1169e;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f1169e;
            if (cVar != null) {
                cVar.dismiss();
                this.f1169e = null;
            }
        }

        public Drawable g() {
            return null;
        }

        public void i(CharSequence charSequence) {
            this.f1171g = charSequence;
        }

        public void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public void k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public void l(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public void m(int i10, int i11) {
            if (this.f1170f != null) {
                c.a aVar = new c.a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f1171g;
                if (charSequence != null) {
                    aVar.o(charSequence);
                }
                androidx.appcompat.app.c a10 = aVar.m(this.f1170f, AppCompatSpinner.this.getSelectedItemPosition(), this).a();
                this.f1169e = a10;
                ListView j10 = a10.j();
                d.d(j10, i10);
                d.c(j10, i11);
                this.f1169e.show();
            }
        }

        public int n() {
            return 0;
        }

        public CharSequence o() {
            return this.f1171g;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner.this.setSelection(i10);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick((View) null, i10, this.f1170f.getItemId(i10));
            }
            dismiss();
        }

        public void p(ListAdapter listAdapter) {
            this.f1170f = listAdapter;
        }
    }

    private static class g implements ListAdapter, SpinnerAdapter {

        /* renamed from: e  reason: collision with root package name */
        private SpinnerAdapter f1173e;

        /* renamed from: f  reason: collision with root package name */
        private ListAdapter f1174f;

        public g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1173e = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1174f = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                e.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1174f;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1173e;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1173e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1173e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1173e;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i10);
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1173e;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1174f;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1173e;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1173e;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class h extends j0 implements j {
        private CharSequence M;
        ListAdapter N;
        private final Rect O = new Rect();
        private int P;

        class a implements AdapterView.OnItemClickListener {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ AppCompatSpinner f1175e;

            a(AppCompatSpinner appCompatSpinner) {
                this.f1175e = appCompatSpinner;
            }

            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    AppCompatSpinner.this.performItemClick(view, i10, hVar.N.getItemId(i10));
                }
                h.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.V(AppCompatSpinner.this)) {
                    h.this.dismiss();
                    return;
                }
                h.this.T();
                h.super.a();
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1178e;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1178e = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1178e);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            D(AppCompatSpinner.this);
            J(true);
            P(0);
            L(new a(AppCompatSpinner.this));
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x009a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void T() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.g()
                if (r0 == 0) goto L_0x0024
                androidx.appcompat.widget.AppCompatSpinner r1 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r1 = r1.f1165l
                r0.getPadding(r1)
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r0 = androidx.appcompat.widget.g1.b(r0)
                if (r0 == 0) goto L_0x001c
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.f1165l
                int r0 = r0.right
                goto L_0x002e
            L_0x001c:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.f1165l
                int r0 = r0.left
                int r0 = -r0
                goto L_0x002e
            L_0x0024:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.f1165l
                r1 = 0
                r0.right = r1
                r0.left = r1
                r0 = r1
            L_0x002e:
                androidx.appcompat.widget.AppCompatSpinner r1 = androidx.appcompat.widget.AppCompatSpinner.this
                int r1 = r1.getPaddingLeft()
                androidx.appcompat.widget.AppCompatSpinner r2 = androidx.appcompat.widget.AppCompatSpinner.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.AppCompatSpinner r3 = androidx.appcompat.widget.AppCompatSpinner.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                int r5 = r4.f1164k
                r6 = -2
                if (r5 != r6) goto L_0x007b
                android.widget.ListAdapter r5 = r8.N
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.g()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.AppCompatSpinner r5 = androidx.appcompat.widget.AppCompatSpinner.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.AppCompatSpinner r6 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r6 = r6.f1165l
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r1
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
            L_0x0077:
                r8.F(r4)
                goto L_0x0085
            L_0x007b:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r1
                int r4 = r4 - r2
                goto L_0x0077
            L_0x0082:
                r8.F(r5)
            L_0x0085:
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r4 = androidx.appcompat.widget.g1.b(r4)
                if (r4 == 0) goto L_0x009a
                int r3 = r3 - r2
                int r1 = r8.z()
                int r3 = r3 - r1
                int r1 = r8.U()
                int r3 = r3 - r1
                int r0 = r0 + r3
                goto L_0x00a0
            L_0x009a:
                int r2 = r8.U()
                int r1 = r1 + r2
                int r0 = r0 + r1
            L_0x00a0:
                r8.l(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.h.T():void");
        }

        public int U() {
            return this.P;
        }

        /* access modifiers changed from: package-private */
        public boolean V(View view) {
            return m0.T(view) && view.getGlobalVisibleRect(this.O);
        }

        public void i(CharSequence charSequence) {
            this.M = charSequence;
        }

        public void k(int i10) {
            this.P = i10;
        }

        public void m(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean d10 = d();
            T();
            I(2);
            super.a();
            ListView h10 = h();
            h10.setChoiceMode(1);
            d.d(h10, i10);
            d.c(h10, i11);
            Q(AppCompatSpinner.this.getSelectedItemPosition());
            if (!d10 && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                K(new c(bVar));
            }
        }

        public CharSequence o() {
            return this.M;
        }

        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.N = listAdapter;
        }
    }

    static class i extends View.BaseSavedState {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        boolean f1180e;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            /* renamed from: b */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        i(Parcel parcel) {
            super(parcel);
            this.f1180e = parcel.readByte() != 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1180e ? (byte) 1 : 0);
        }

        i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    interface j {
        void b(Drawable drawable);

        int c();

        boolean d();

        void dismiss();

        Drawable g();

        void i(CharSequence charSequence);

        void j(int i10);

        void k(int i10);

        void l(int i10);

        void m(int i10, int i11);

        int n();

        CharSequence o();

        void p(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.spinnerStyle);
    }

    /* access modifiers changed from: package-private */
    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.f1165l);
        Rect rect = this.f1165l;
        return i11 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f1163j.m(d.b(this), d.a(this));
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1158e;
        if (eVar != null) {
            eVar.b();
        }
    }

    public int getDropDownHorizontalOffset() {
        j jVar = this.f1163j;
        return jVar != null ? jVar.c() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        j jVar = this.f1163j;
        return jVar != null ? jVar.n() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.f1163j != null ? this.f1164k : super.getDropDownWidth();
    }

    /* access modifiers changed from: package-private */
    public final j getInternalPopup() {
        return this.f1163j;
    }

    public Drawable getPopupBackground() {
        j jVar = this.f1163j;
        return jVar != null ? jVar.g() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f1159f;
    }

    public CharSequence getPrompt() {
        j jVar = this.f1163j;
        return jVar != null ? jVar.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1158e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1158e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f1163j;
        if (jVar != null && jVar.d()) {
            this.f1163j.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1163j != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (iVar.f1180e && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        j jVar = this.f1163j;
        iVar.f1180e = jVar != null && jVar.d();
        return iVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        i0 i0Var = this.f1160g;
        if (i0Var == null || !i0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        j jVar = this.f1163j;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.d()) {
            return true;
        }
        b();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1158e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1158e;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setDropDownHorizontalOffset(int i10) {
        j jVar = this.f1163j;
        if (jVar != null) {
            jVar.k(i10);
            this.f1163j.l(i10);
            return;
        }
        super.setDropDownHorizontalOffset(i10);
    }

    public void setDropDownVerticalOffset(int i10) {
        j jVar = this.f1163j;
        if (jVar != null) {
            jVar.j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    public void setDropDownWidth(int i10) {
        if (this.f1163j != null) {
            this.f1164k = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        j jVar = this.f1163j;
        if (jVar != null) {
            jVar.b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(g.a.b(getPopupContext(), i10));
    }

    public void setPrompt(CharSequence charSequence) {
        j jVar = this.f1163j;
        if (jVar != null) {
            jVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1158e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1158e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1162i) {
            this.f1161h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1163j != null) {
            Context context = this.f1159f;
            if (context == null) {
                context = getContext();
            }
            this.f1163j.p(new g(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r11 != null) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[SYNTHETIC, Splitter:B:10:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1165l = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.r0.a(r6, r0)
            int[] r0 = f.j.F2
            r1 = 0
            androidx.appcompat.widget.v0 r0 = androidx.appcompat.widget.v0.v(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1158e = r2
            if (r11 == 0) goto L_0x0029
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
        L_0x0026:
            r6.f1159f = r2
            goto L_0x0039
        L_0x0029:
            int r11 = f.j.K2
            int r11 = r0.n(r11, r1)
            if (r11 == 0) goto L_0x0037
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r7, (int) r11)
            goto L_0x0026
        L_0x0037:
            r6.f1159f = r7
        L_0x0039:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x006b
            int[] r11 = f1157m     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0051 }
            if (r3 == 0) goto L_0x0053
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0051 }
            goto L_0x0053
        L_0x004e:
            r7 = move-exception
            r2 = r11
            goto L_0x0065
        L_0x0051:
            r3 = move-exception
            goto L_0x005b
        L_0x0053:
            r11.recycle()
            goto L_0x006b
        L_0x0057:
            r7 = move-exception
            goto L_0x0065
        L_0x0059:
            r3 = move-exception
            r11 = r2
        L_0x005b:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x004e }
            if (r11 == 0) goto L_0x006b
            goto L_0x0053
        L_0x0065:
            if (r2 == 0) goto L_0x006a
            r2.recycle()
        L_0x006a:
            throw r7
        L_0x006b:
            r11 = 1
            if (r10 == 0) goto L_0x00a8
            if (r10 == r11) goto L_0x0071
            goto L_0x00b8
        L_0x0071:
            androidx.appcompat.widget.AppCompatSpinner$h r10 = new androidx.appcompat.widget.AppCompatSpinner$h
            android.content.Context r3 = r6.f1159f
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1159f
            int[] r4 = f.j.F2
            androidx.appcompat.widget.v0 r1 = androidx.appcompat.widget.v0.v(r3, r8, r4, r9, r1)
            int r3 = f.j.J2
            r4 = -2
            int r3 = r1.m(r3, r4)
            r6.f1164k = r3
            int r3 = f.j.H2
            android.graphics.drawable.Drawable r3 = r1.g(r3)
            r10.b(r3)
            int r3 = f.j.I2
            java.lang.String r3 = r0.o(r3)
            r10.i(r3)
            r1.w()
            r6.f1163j = r10
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r6, r10)
            r6.f1160g = r1
            goto L_0x00b8
        L_0x00a8:
            androidx.appcompat.widget.AppCompatSpinner$f r10 = new androidx.appcompat.widget.AppCompatSpinner$f
            r10.<init>()
            r6.f1163j = r10
            int r1 = f.j.I2
            java.lang.String r1 = r0.o(r1)
            r10.i(r1)
        L_0x00b8:
            int r10 = f.j.G2
            java.lang.CharSequence[] r10 = r0.q(r10)
            if (r10 == 0) goto L_0x00d0
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = f.g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00d0:
            r0.w()
            r6.f1162i = r11
            android.widget.SpinnerAdapter r7 = r6.f1161h
            if (r7 == 0) goto L_0x00de
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f1161h = r2
        L_0x00de:
            androidx.appcompat.widget.e r7 = r6.f1158e
            r7.e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
