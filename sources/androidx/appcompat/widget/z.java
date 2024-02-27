package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.m0;
import f.j;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

class z {

    /* renamed from: l  reason: collision with root package name */
    private static final RectF f1589l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    private static ConcurrentHashMap f1590m = new ConcurrentHashMap();

    /* renamed from: n  reason: collision with root package name */
    private static ConcurrentHashMap f1591n = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private int f1592a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1593b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f1594c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f1595d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f1596e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f1597f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f1598g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f1599h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f1600i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f1601j;

    /* renamed from: k  reason: collision with root package name */
    private final f f1602k;

    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    private static final class b {
        static boolean a(View view) {
            return view.isInLayout();
        }
    }

    private static final class c {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    private static class d extends f {
        d() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) z.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class e extends d {
        e() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class f {
        f() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a(StaticLayout.Builder builder, TextView textView);

        /* access modifiers changed from: package-private */
        public boolean b(TextView textView) {
            return ((Boolean) z.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    z(TextView textView) {
        this.f1600i = textView;
        this.f1601j = textView.getContext();
        this.f1602k = Build.VERSION.SDK_INT >= 29 ? new e() : new d();
    }

    private int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f1592a = 0;
        this.f1595d = -1.0f;
        this.f1596e = -1.0f;
        this.f1594c = -1.0f;
        this.f1597f = new int[0];
        this.f1593b = false;
    }

    private int e(RectF rectF) {
        int length = this.f1597f.length;
        if (length != 0) {
            int i10 = 1;
            int i11 = length - 1;
            int i12 = 0;
            while (i10 <= i11) {
                int i13 = (i10 + i11) / 2;
                if (x(this.f1597f[i13], rectF)) {
                    int i14 = i13 + 1;
                    i12 = i10;
                    i10 = i14;
                } else {
                    i12 = i13 - 1;
                    i11 = i12;
                }
            }
            return this.f1597f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private static Method k(String str) {
        try {
            Method method = (Method) f1590m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1590m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + r4 + "() method", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Object m(java.lang.Object r3, java.lang.String r4, java.lang.Object r5) {
        /*
            java.lang.reflect.Method r0 = k(r4)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            java.lang.Object r5 = r0.invoke(r3, r1)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            goto L_0x002c
        L_0x000c:
            r3 = move-exception
            goto L_0x0010
        L_0x000e:
            r3 = move-exception
            goto L_0x0011
        L_0x0010:
            throw r3
        L_0x0011:
            java.lang.String r0 = "ACTVAutoSizeHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to invoke TextView#"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "() method"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.util.Log.w(r0, r4, r3)
        L_0x002c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z.m(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    private void s(float f10) {
        if (f10 != this.f1600i.getPaint().getTextSize()) {
            this.f1600i.getPaint().setTextSize(f10);
            boolean a10 = b.a(this.f1600i);
            if (this.f1600i.getLayout() != null) {
                this.f1593b = false;
                try {
                    Method k10 = k("nullLayouts");
                    if (k10 != null) {
                        k10.invoke(this.f1600i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!a10) {
                    this.f1600i.requestLayout();
                } else {
                    this.f1600i.forceLayout();
                }
                this.f1600i.invalidate();
            }
        }
    }

    private boolean u() {
        if (!y() || this.f1592a != 1) {
            this.f1593b = false;
        } else {
            if (!this.f1598g || this.f1597f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1596e - this.f1595d) / this.f1594c))) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f1595d + (((float) i10) * this.f1594c));
                }
                this.f1597f = b(iArr);
            }
            this.f1593b = true;
        }
        return this.f1593b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f1597f = b(iArr);
            w();
        }
    }

    private boolean w() {
        int[] iArr = this.f1597f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f1598g = z10;
        if (z10) {
            this.f1592a = 1;
            this.f1595d = (float) iArr[0];
            this.f1596e = (float) iArr[length - 1];
            this.f1594c = -1.0f;
        }
        return z10;
    }

    private boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1600i.getText();
        TransformationMethod transformationMethod = this.f1600i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1600i)) == null)) {
            text = transformation;
        }
        int b10 = a.b(this.f1600i);
        l(i10);
        StaticLayout d10 = d(text, (Layout.Alignment) m(this.f1600i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b10);
        return (b10 == -1 || (d10.getLineCount() <= b10 && d10.getLineEnd(d10.getLineCount() - 1) == text.length())) && ((float) d10.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f1600i instanceof AppCompatEditText);
    }

    private void z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 > 0.0f) {
            this.f1592a = 1;
            this.f1595d = f10;
            this.f1596e = f11;
            this.f1594c = f12;
            this.f1598g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (n()) {
            if (this.f1593b) {
                if (this.f1600i.getMeasuredHeight() > 0 && this.f1600i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f1602k.b(this.f1600i) ? 1048576 : (this.f1600i.getMeasuredWidth() - this.f1600i.getTotalPaddingLeft()) - this.f1600i.getTotalPaddingRight();
                    int height = (this.f1600i.getHeight() - this.f1600i.getCompoundPaddingBottom()) - this.f1600i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f1589l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = (float) measuredWidth;
                                rectF.bottom = (float) height;
                                float e10 = (float) e(rectF);
                                if (e10 != this.f1600i.getTextSize()) {
                                    t(0, e10);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1593b = true;
        }
    }

    /* access modifiers changed from: package-private */
    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return c.a(charSequence, alignment, i10, i11, this.f1600i, this.f1599h, this.f1602k);
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return Math.round(this.f1596e);
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return Math.round(this.f1595d);
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return Math.round(this.f1594c);
    }

    /* access modifiers changed from: package-private */
    public int[] i() {
        return this.f1597f;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f1592a;
    }

    /* access modifiers changed from: package-private */
    public void l(int i10) {
        TextPaint textPaint = this.f1599h;
        if (textPaint == null) {
            this.f1599h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1599h.set(this.f1600i.getPaint());
        this.f1599h.setTextSize((float) i10);
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return y() && this.f1592a != 0;
    }

    /* access modifiers changed from: package-private */
    public void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f1601j;
        int[] iArr = j.f11209g0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f1600i;
        m0.o0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int i11 = j.f11234l0;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f1592a = obtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = j.f11229k0;
        float dimension = obtainStyledAttributes.hasValue(i12) ? obtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = j.f11219i0;
        float dimension2 = obtainStyledAttributes.hasValue(i13) ? obtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = j.f11214h0;
        float dimension3 = obtainStyledAttributes.hasValue(i14) ? obtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = j.f11224j0;
        if (obtainStyledAttributes.hasValue(i15) && (resourceId = obtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!y()) {
            this.f1592a = 0;
        } else if (this.f1592a == 1) {
            if (!this.f1598g) {
                DisplayMetrics displayMetrics = this.f1601j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    /* access modifiers changed from: package-private */
    public void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f1601j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, (float) i10, displayMetrics), TypedValue.applyDimension(i13, (float) i11, displayMetrics), TypedValue.applyDimension(i13, (float) i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1601j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, (float) iArr[i11], displayMetrics));
                    }
                }
                this.f1597f = b(iArr2);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1598g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r(int i10) {
        if (!y()) {
            return;
        }
        if (i10 == 0) {
            c();
        } else if (i10 == 1) {
            DisplayMetrics displayMetrics = this.f1601j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int i10, float f10) {
        Context context = this.f1601j;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
