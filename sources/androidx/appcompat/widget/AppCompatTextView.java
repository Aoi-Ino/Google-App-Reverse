package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.text.m;
import androidx.core.widget.i;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView {

    /* renamed from: e  reason: collision with root package name */
    private final e f1181e;

    /* renamed from: f  reason: collision with root package name */
    private final y f1182f;

    /* renamed from: g  reason: collision with root package name */
    private final x f1183g;

    /* renamed from: h  reason: collision with root package name */
    private l f1184h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1185i;

    /* renamed from: j  reason: collision with root package name */
    private a f1186j;

    /* renamed from: k  reason: collision with root package name */
    private Future f1187k;

    private interface a {
        void a(int[] iArr, int i10);

        void b(TextClassifier textClassifier);

        int[] c();

        void d(int i10);

        TextClassifier e();

        int f();

        void g(int i10, int i11, int i12, int i13);

        int h();

        int i();

        void j(int i10);

        int k();

        void l(int i10);
    }

    class b implements a {
        b() {
        }

        public void a(int[] iArr, int i10) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public void b(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        public int[] c() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        public void d(int i10) {
        }

        public TextClassifier e() {
            return AppCompatTextView.super.getTextClassifier();
        }

        public int f() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        public void g(int i10, int i11, int i12, int i13) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public int h() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        public int i() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        public void j(int i10) {
        }

        public int k() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        public void l(int i10) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    class c extends b {
        c() {
            super();
        }

        public void d(int i10) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i10);
        }

        public void j(int i10) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i10);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private l getEmojiTextViewHelper() {
        if (this.f1184h == null) {
            this.f1184h = new l(this);
        }
        return this.f1184h;
    }

    private void q() {
        Future future = this.f1187k;
        if (future != null) {
            try {
                this.f1187k = null;
                android.support.v4.media.session.b.a(future.get());
                i.m(this, (m) null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1181e;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f1182f;
        if (yVar != null) {
            yVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (g1.f1407b) {
            return getSuperCaller().f();
        }
        y yVar = this.f1182f;
        if (yVar != null) {
            return yVar.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (g1.f1407b) {
            return getSuperCaller().i();
        }
        y yVar = this.f1182f;
        if (yVar != null) {
            return yVar.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (g1.f1407b) {
            return getSuperCaller().k();
        }
        y yVar = this.f1182f;
        if (yVar != null) {
            return yVar.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (g1.f1407b) {
            return getSuperCaller().c();
        }
        y yVar = this.f1182f;
        return yVar != null ? yVar.h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (g1.f1407b) {
            return getSuperCaller().h() == 1 ? 1 : 0;
        }
        y yVar = this.f1182f;
        if (yVar != null) {
            return yVar.i();
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.p(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return i.b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return i.c(this);
    }

    /* access modifiers changed from: package-private */
    public a getSuperCaller() {
        a bVar;
        if (this.f1186j == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                bVar = new c();
            } else if (i10 >= 26) {
                bVar = new b();
            }
            this.f1186j = bVar;
        }
        return this.f1186j;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1181e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1181e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1182f.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1182f.k();
    }

    public CharSequence getText() {
        q();
        return super.getText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f1183g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.x r0 = r2.f1183g
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.a()
            return r0
        L_0x0010:
            androidx.appcompat.widget.AppCompatTextView$a r0 = r2.getSuperCaller()
            android.view.textclassifier.TextClassifier r0 = r0.e()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextView.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public m.a getTextMetricsParamsCompat() {
        return i.f(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1182f.r(this, onCreateInputConnection, editorInfo);
        return m.a(onCreateInputConnection, editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        y yVar = this.f1182f;
        if (yVar != null) {
            yVar.o(z10, i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        q();
        super.onMeasure(i10, i11);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        y yVar = this.f1182f;
        if (yVar != null && !g1.f1407b && yVar.l()) {
            this.f1182f.c();
        }
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (g1.f1407b) {
            getSuperCaller().g(i10, i11, i12, i13);
            return;
        }
        y yVar = this.f1182f;
        if (yVar != null) {
            yVar.t(i10, i11, i12, i13);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (g1.f1407b) {
            getSuperCaller().a(iArr, i10);
            return;
        }
        y yVar = this.f1182f;
        if (yVar != null) {
            yVar.u(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (g1.f1407b) {
            getSuperCaller().l(i10);
            return;
        }
        y yVar = this.f1182f;
        if (yVar != null) {
            yVar.v(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1181e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1181e;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f1182f;
        if (yVar != null) {
            yVar.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f1182f;
        if (yVar != null) {
            yVar.p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b10 = i10 != 0 ? g.a.b(context, i10) : null;
        Drawable b11 = i11 != 0 ? g.a.b(context, i11) : null;
        Drawable b12 = i12 != 0 ? g.a.b(context, i12) : null;
        if (i13 != 0) {
            drawable = g.a.b(context, i13);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b10, b11, b12, drawable);
        y yVar = this.f1182f;
        if (yVar != null) {
            yVar.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b10 = i10 != 0 ? g.a.b(context, i10) : null;
        Drawable b11 = i11 != 0 ? g.a.b(context, i11) : null;
        Drawable b12 = i12 != 0 ? g.a.b(context, i12) : null;
        if (i13 != 0) {
            drawable = g.a.b(context, i13);
        }
        setCompoundDrawablesWithIntrinsicBounds(b10, b11, b12, drawable);
        y yVar = this.f1182f;
        if (yVar != null) {
            yVar.p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i10);
        } else {
            i.j(this, i10);
        }
    }

    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i10);
        } else {
            i.k(this, i10);
        }
    }

    public void setLineHeight(int i10) {
        i.l(this, i10);
    }

    public void setPrecomputedText(m mVar) {
        i.m(this, mVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1181e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1181e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1182f.w(colorStateList);
        this.f1182f.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1182f.x(mode);
        this.f1182f.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        y yVar = this.f1182f;
        if (yVar != null) {
            yVar.q(context, i10);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f1183g) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            xVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<m> future) {
        this.f1187k = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(m.a aVar) {
        i.o(this, aVar);
    }

    public void setTextSize(int i10, float f10) {
        if (g1.f1407b) {
            super.setTextSize(i10, f10);
            return;
        }
        y yVar = this.f1182f;
        if (yVar != null) {
            yVar.A(i10, f10);
        }
    }

    public void setTypeface(Typeface typeface, int i10) {
        if (!this.f1185i) {
            Typeface a10 = (typeface == null || i10 <= 0) ? null : androidx.core.graphics.i.a(getContext(), typeface, i10);
            this.f1185i = true;
            if (a10 != null) {
                typeface = a10;
            }
            try {
                super.setTypeface(typeface, i10);
            } finally {
                this.f1185i = false;
            }
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f1182f;
        if (yVar != null) {
            yVar.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f1182f;
        if (yVar != null) {
            yVar.p();
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(s0.b(context), attributeSet, i10);
        this.f1185i = false;
        this.f1186j = null;
        r0.a(this, getContext());
        e eVar = new e(this);
        this.f1181e = eVar;
        eVar.e(attributeSet, i10);
        y yVar = new y(this);
        this.f1182f = yVar;
        yVar.m(attributeSet, i10);
        yVar.b();
        this.f1183g = new x(this);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }
}
