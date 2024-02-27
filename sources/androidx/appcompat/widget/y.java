package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.h;
import androidx.core.view.m0;
import f.j;
import java.lang.ref.WeakReference;
import java.util.Locale;

class y {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f1567a;

    /* renamed from: b  reason: collision with root package name */
    private t0 f1568b;

    /* renamed from: c  reason: collision with root package name */
    private t0 f1569c;

    /* renamed from: d  reason: collision with root package name */
    private t0 f1570d;

    /* renamed from: e  reason: collision with root package name */
    private t0 f1571e;

    /* renamed from: f  reason: collision with root package name */
    private t0 f1572f;

    /* renamed from: g  reason: collision with root package name */
    private t0 f1573g;

    /* renamed from: h  reason: collision with root package name */
    private t0 f1574h;

    /* renamed from: i  reason: collision with root package name */
    private final z f1575i;

    /* renamed from: j  reason: collision with root package name */
    private int f1576j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f1577k = -1;

    /* renamed from: l  reason: collision with root package name */
    private Typeface f1578l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1579m;

    class a extends h.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f1580a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1581b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WeakReference f1582c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f1580a = i10;
            this.f1581b = i11;
            this.f1582c = weakReference;
        }

        public void h(int i10) {
        }

        public void i(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1580a) != -1) {
                typeface = f.a(typeface, i10, (this.f1581b & 2) != 0);
            }
            y.this.n(this.f1582c, typeface);
        }
    }

    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TextView f1584e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Typeface f1585f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f1586g;

        b(TextView textView, Typeface typeface, int i10) {
            this.f1584e = textView;
            this.f1585f = typeface;
            this.f1586g = i10;
        }

        public void run() {
            this.f1584e.setTypeface(this.f1585f, this.f1586g);
        }
    }

    static class c {
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    static class d {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class e {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class f {
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    y(TextView textView) {
        this.f1567a = textView;
        this.f1575i = new z(textView);
    }

    private void B(int i10, float f10) {
        this.f1575i.t(i10, f10);
    }

    private void C(Context context, v0 v0Var) {
        String o10;
        Typeface create;
        Typeface typeface;
        this.f1576j = v0Var.k(j.P2, this.f1576j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int k10 = v0Var.k(j.R2, -1);
            this.f1577k = k10;
            if (k10 != -1) {
                this.f1576j &= 2;
            }
        }
        int i11 = j.Q2;
        boolean z10 = true;
        if (v0Var.s(i11) || v0Var.s(j.S2)) {
            this.f1578l = null;
            int i12 = j.S2;
            if (v0Var.s(i12)) {
                i11 = i12;
            }
            int i13 = this.f1577k;
            int i14 = this.f1576j;
            if (!context.isRestricted()) {
                try {
                    Typeface j10 = v0Var.j(i11, this.f1576j, new a(i13, i14, new WeakReference(this.f1567a)));
                    if (j10 != null) {
                        if (i10 >= 28 && this.f1577k != -1) {
                            j10 = f.a(Typeface.create(j10, 0), this.f1577k, (this.f1576j & 2) != 0);
                        }
                        this.f1578l = j10;
                    }
                    this.f1579m = this.f1578l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1578l == null && (o10 = v0Var.o(i11)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1577k == -1) {
                    create = Typeface.create(o10, this.f1576j);
                } else {
                    Typeface create2 = Typeface.create(o10, 0);
                    int i15 = this.f1577k;
                    if ((this.f1576j & 2) == 0) {
                        z10 = false;
                    }
                    create = f.a(create2, i15, z10);
                }
                this.f1578l = create;
                return;
            }
            return;
        }
        int i16 = j.O2;
        if (v0Var.s(i16)) {
            this.f1579m = false;
            int k11 = v0Var.k(i16, 1);
            if (k11 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (k11 == 2) {
                typeface = Typeface.SERIF;
            } else if (k11 == 3) {
                typeface = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f1578l = typeface;
        }
    }

    private void a(Drawable drawable, t0 t0Var) {
        if (drawable != null && t0Var != null) {
            j.i(drawable, t0Var, this.f1567a.getDrawableState());
        }
    }

    private static t0 d(Context context, j jVar, int i10) {
        ColorStateList f10 = jVar.f(context, i10);
        if (f10 == null) {
            return null;
        }
        t0 t0Var = new t0();
        t0Var.f1551d = true;
        t0Var.f1548a = f10;
        return t0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] a10 = c.a(this.f1567a);
            TextView textView = this.f1567a;
            if (drawable5 == null) {
                drawable5 = a10[0];
            }
            if (drawable2 == null) {
                drawable2 = a10[1];
            }
            if (drawable6 == null) {
                drawable6 = a10[2];
            }
            if (drawable4 == null) {
                drawable4 = a10[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] a11 = c.a(this.f1567a);
            Drawable drawable7 = a11[0];
            if (drawable7 == null && a11[2] == null) {
                Drawable[] compoundDrawables = this.f1567a.getCompoundDrawables();
                TextView textView2 = this.f1567a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            TextView textView3 = this.f1567a;
            if (drawable2 == null) {
                drawable2 = a11[1];
            }
            Drawable drawable8 = a11[2];
            if (drawable4 == null) {
                drawable4 = a11[3];
            }
            c.b(textView3, drawable7, drawable2, drawable8, drawable4);
        }
    }

    private void z() {
        t0 t0Var = this.f1574h;
        this.f1568b = t0Var;
        this.f1569c = t0Var;
        this.f1570d = t0Var;
        this.f1571e = t0Var;
        this.f1572f = t0Var;
        this.f1573g = t0Var;
    }

    /* access modifiers changed from: package-private */
    public void A(int i10, float f10) {
        if (!g1.f1407b && !l()) {
            B(i10, f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!(this.f1568b == null && this.f1569c == null && this.f1570d == null && this.f1571e == null)) {
            Drawable[] compoundDrawables = this.f1567a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1568b);
            a(compoundDrawables[1], this.f1569c);
            a(compoundDrawables[2], this.f1570d);
            a(compoundDrawables[3], this.f1571e);
        }
        if (this.f1572f != null || this.f1573g != null) {
            Drawable[] a10 = c.a(this.f1567a);
            a(a10[0], this.f1572f);
            a(a10[2], this.f1573g);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f1575i.a();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f1575i.f();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f1575i.g();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f1575i.h();
    }

    /* access modifiers changed from: package-private */
    public int[] h() {
        return this.f1575i.i();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f1575i.j();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        t0 t0Var = this.f1574h;
        if (t0Var != null) {
            return t0Var.f1548a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        t0 t0Var = this.f1574h;
        if (t0Var != null) {
            return t0Var.f1549b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f1575i.n();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(android.util.AttributeSet r20, int r21) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            android.widget.TextView r0 = r7.f1567a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.j r11 = androidx.appcompat.widget.j.b()
            int[] r2 = f.j.Y
            r12 = 0
            androidx.appcompat.widget.v0 r13 = androidx.appcompat.widget.v0.v(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.f1567a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.r()
            r6 = 0
            r3 = r20
            r5 = r21
            androidx.core.view.m0.o0(r0, r1, r2, r3, r4, r5, r6)
            int r0 = f.j.Z
            r14 = -1
            int r0 = r13.n(r0, r14)
            int r1 = f.j.f11189c0
            boolean r2 = r13.s(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.t0 r1 = d(r10, r11, r1)
            r7.f1568b = r1
        L_0x0042:
            int r1 = f.j.f11179a0
            boolean r2 = r13.s(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.t0 r1 = d(r10, r11, r1)
            r7.f1569c = r1
        L_0x0054:
            int r1 = f.j.f11194d0
            boolean r2 = r13.s(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.t0 r1 = d(r10, r11, r1)
            r7.f1570d = r1
        L_0x0066:
            int r1 = f.j.f11184b0
            boolean r2 = r13.s(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.n(r1, r12)
            androidx.appcompat.widget.t0 r1 = d(r10, r11, r1)
            r7.f1571e = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            int r2 = f.j.f11199e0
            boolean r3 = r13.s(r2)
            if (r3 == 0) goto L_0x008c
            int r2 = r13.n(r2, r12)
            androidx.appcompat.widget.t0 r2 = d(r10, r11, r2)
            r7.f1572f = r2
        L_0x008c:
            int r2 = f.j.f11204f0
            boolean r3 = r13.s(r2)
            if (r3 == 0) goto L_0x009e
            int r2 = r13.n(r2, r12)
            androidx.appcompat.widget.t0 r2 = d(r10, r11, r2)
            r7.f1573g = r2
        L_0x009e:
            r13.w()
            android.widget.TextView r2 = r7.f1567a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            if (r0 == r14) goto L_0x00ea
            int[] r5 = f.j.M2
            androidx.appcompat.widget.v0 r0 = androidx.appcompat.widget.v0.t(r10, r0, r5)
            if (r2 != 0) goto L_0x00c3
            int r5 = f.j.U2
            boolean r6 = r0.s(r5)
            if (r6 == 0) goto L_0x00c3
            boolean r5 = r0.a(r5, r12)
            r6 = 1
            goto L_0x00c5
        L_0x00c3:
            r5 = r12
            r6 = r5
        L_0x00c5:
            r7.C(r10, r0)
            int r15 = f.j.V2
            boolean r16 = r0.s(r15)
            if (r16 == 0) goto L_0x00d5
            java.lang.String r15 = r0.o(r15)
            goto L_0x00d6
        L_0x00d5:
            r15 = 0
        L_0x00d6:
            if (r1 < r3) goto L_0x00e5
            int r4 = f.j.T2
            boolean r17 = r0.s(r4)
            if (r17 == 0) goto L_0x00e5
            java.lang.String r4 = r0.o(r4)
            goto L_0x00e6
        L_0x00e5:
            r4 = 0
        L_0x00e6:
            r0.w()
            goto L_0x00ee
        L_0x00ea:
            r5 = r12
            r6 = r5
            r4 = 0
            r15 = 0
        L_0x00ee:
            int[] r0 = f.j.M2
            androidx.appcompat.widget.v0 r0 = androidx.appcompat.widget.v0.v(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x0105
            int r13 = f.j.U2
            boolean r18 = r0.s(r13)
            if (r18 == 0) goto L_0x0105
            boolean r5 = r0.a(r13, r12)
            r16 = 1
            goto L_0x0107
        L_0x0105:
            r16 = r6
        L_0x0107:
            int r6 = f.j.V2
            boolean r13 = r0.s(r6)
            if (r13 == 0) goto L_0x0113
            java.lang.String r15 = r0.o(r6)
        L_0x0113:
            if (r1 < r3) goto L_0x0121
            int r3 = f.j.T2
            boolean r6 = r0.s(r3)
            if (r6 == 0) goto L_0x0121
            java.lang.String r4 = r0.o(r3)
        L_0x0121:
            r3 = 28
            if (r1 < r3) goto L_0x0139
            int r1 = f.j.N2
            boolean r3 = r0.s(r1)
            if (r3 == 0) goto L_0x0139
            int r1 = r0.f(r1, r14)
            if (r1 != 0) goto L_0x0139
            android.widget.TextView r1 = r7.f1567a
            r3 = 0
            r1.setTextSize(r12, r3)
        L_0x0139:
            r7.C(r10, r0)
            r0.w()
            if (r2 != 0) goto L_0x0146
            if (r16 == 0) goto L_0x0146
            r7.s(r5)
        L_0x0146:
            android.graphics.Typeface r0 = r7.f1578l
            if (r0 == 0) goto L_0x015b
            int r1 = r7.f1577k
            if (r1 != r14) goto L_0x0156
            android.widget.TextView r1 = r7.f1567a
            int r2 = r7.f1576j
            r1.setTypeface(r0, r2)
            goto L_0x015b
        L_0x0156:
            android.widget.TextView r1 = r7.f1567a
            r1.setTypeface(r0)
        L_0x015b:
            if (r4 == 0) goto L_0x0162
            android.widget.TextView r0 = r7.f1567a
            androidx.appcompat.widget.y.e.d(r0, r4)
        L_0x0162:
            if (r15 == 0) goto L_0x016d
            android.widget.TextView r0 = r7.f1567a
            android.os.LocaleList r1 = androidx.appcompat.widget.y.d.a(r15)
            androidx.appcompat.widget.y.d.b(r0, r1)
        L_0x016d:
            androidx.appcompat.widget.z r0 = r7.f1575i
            r0.o(r8, r9)
            boolean r0 = androidx.appcompat.widget.g1.f1407b
            if (r0 == 0) goto L_0x01b1
            androidx.appcompat.widget.z r0 = r7.f1575i
            int r0 = r0.j()
            if (r0 == 0) goto L_0x01b1
            androidx.appcompat.widget.z r0 = r7.f1575i
            int[] r0 = r0.i()
            int r1 = r0.length
            if (r1 <= 0) goto L_0x01b1
            android.widget.TextView r1 = r7.f1567a
            int r1 = androidx.appcompat.widget.y.e.a(r1)
            float r1 = (float) r1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x01ac
            android.widget.TextView r0 = r7.f1567a
            androidx.appcompat.widget.z r1 = r7.f1575i
            int r1 = r1.g()
            androidx.appcompat.widget.z r2 = r7.f1575i
            int r2 = r2.f()
            androidx.appcompat.widget.z r3 = r7.f1575i
            int r3 = r3.h()
            androidx.appcompat.widget.y.e.b(r0, r1, r2, r3, r12)
            goto L_0x01b1
        L_0x01ac:
            android.widget.TextView r1 = r7.f1567a
            androidx.appcompat.widget.y.e.c(r1, r0, r12)
        L_0x01b1:
            int[] r0 = f.j.f11209g0
            androidx.appcompat.widget.v0 r8 = androidx.appcompat.widget.v0.u(r10, r8, r0)
            int r0 = f.j.f11249o0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x01c5
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r1 = r0
            goto L_0x01c6
        L_0x01c5:
            r1 = 0
        L_0x01c6:
            int r0 = f.j.f11274t0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x01d4
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r2 = r0
            goto L_0x01d5
        L_0x01d4:
            r2 = 0
        L_0x01d5:
            int r0 = f.j.f11254p0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x01e3
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r3 = r0
            goto L_0x01e4
        L_0x01e3:
            r3 = 0
        L_0x01e4:
            int r0 = f.j.f11239m0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x01f2
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r4 = r0
            goto L_0x01f3
        L_0x01f2:
            r4 = 0
        L_0x01f3:
            int r0 = f.j.f11259q0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x0201
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r5 = r0
            goto L_0x0202
        L_0x0201:
            r5 = 0
        L_0x0202:
            int r0 = f.j.f11244n0
            int r0 = r8.n(r0, r14)
            if (r0 == r14) goto L_0x0210
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r6 = r0
            goto L_0x0211
        L_0x0210:
            r6 = 0
        L_0x0211:
            r0 = r19
            r0.y(r1, r2, r3, r4, r5, r6)
            int r0 = f.j.f11264r0
            boolean r1 = r8.s(r0)
            if (r1 == 0) goto L_0x0227
            android.content.res.ColorStateList r0 = r8.c(r0)
            android.widget.TextView r1 = r7.f1567a
            androidx.core.widget.i.g(r1, r0)
        L_0x0227:
            int r0 = f.j.f11269s0
            boolean r1 = r8.s(r0)
            if (r1 == 0) goto L_0x023d
            int r0 = r8.k(r0, r14)
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.f0.d(r0, r1)
            android.widget.TextView r1 = r7.f1567a
            androidx.core.widget.i.h(r1, r0)
        L_0x023d:
            int r0 = f.j.f11284v0
            int r0 = r8.f(r0, r14)
            int r1 = f.j.f11289w0
            int r1 = r8.f(r1, r14)
            int r2 = f.j.f11294x0
            int r2 = r8.f(r2, r14)
            r8.w()
            if (r0 == r14) goto L_0x0259
            android.widget.TextView r3 = r7.f1567a
            androidx.core.widget.i.j(r3, r0)
        L_0x0259:
            if (r1 == r14) goto L_0x0260
            android.widget.TextView r0 = r7.f1567a
            androidx.core.widget.i.k(r0, r1)
        L_0x0260:
            if (r2 == r14) goto L_0x0267
            android.widget.TextView r0 = r7.f1567a
            androidx.core.widget.i.l(r0, r2)
        L_0x0267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void n(WeakReference weakReference, Typeface typeface) {
        if (this.f1579m) {
            this.f1578l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            if (m0.T(textView)) {
                textView.post(new b(textView, typeface, this.f1576j));
            } else {
                textView.setTypeface(typeface, this.f1576j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (!g1.f1407b) {
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* access modifiers changed from: package-private */
    public void q(Context context, int i10) {
        String o10;
        v0 t10 = v0.t(context, i10, j.M2);
        int i11 = j.U2;
        if (t10.s(i11)) {
            s(t10.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        int i13 = j.N2;
        if (t10.s(i13) && t10.f(i13, -1) == 0) {
            this.f1567a.setTextSize(0, 0.0f);
        }
        C(context, t10);
        if (i12 >= 26) {
            int i14 = j.T2;
            if (t10.s(i14) && (o10 = t10.o(i14)) != null) {
                e.d(this.f1567a, o10);
            }
        }
        t10.w();
        Typeface typeface = this.f1578l;
        if (typeface != null) {
            this.f1567a.setTypeface(typeface, this.f1576j);
        }
    }

    /* access modifiers changed from: package-private */
    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            z.c.f(editorInfo, textView.getText());
        }
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z10) {
        this.f1567a.setAllCaps(z10);
    }

    /* access modifiers changed from: package-private */
    public void t(int i10, int i11, int i12, int i13) {
        this.f1575i.p(i10, i11, i12, i13);
    }

    /* access modifiers changed from: package-private */
    public void u(int[] iArr, int i10) {
        this.f1575i.q(iArr, i10);
    }

    /* access modifiers changed from: package-private */
    public void v(int i10) {
        this.f1575i.r(i10);
    }

    /* access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        if (this.f1574h == null) {
            this.f1574h = new t0();
        }
        t0 t0Var = this.f1574h;
        t0Var.f1548a = colorStateList;
        t0Var.f1551d = colorStateList != null;
        z();
    }

    /* access modifiers changed from: package-private */
    public void x(PorterDuff.Mode mode) {
        if (this.f1574h == null) {
            this.f1574h = new t0();
        }
        t0 t0Var = this.f1574h;
        t0Var.f1549b = mode;
        t0Var.f1550c = mode != null;
        z();
    }
}
