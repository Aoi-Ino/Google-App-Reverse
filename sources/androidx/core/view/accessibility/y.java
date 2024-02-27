package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.d0;
import j$.time.Duration;
import j$.time.TimeConversions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class y {

    /* renamed from: d  reason: collision with root package name */
    private static int f2530d;

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityNodeInfo f2531a;

    /* renamed from: b  reason: collision with root package name */
    public int f2532b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f2533c = -1;

    public static class a {
        public static final a A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (CharSequence) null, (d0) null, (Class) null);
        public static final a B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (CharSequence) null, (d0) null, d0.e.class);
        public static final a C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence) null, (d0) null, (Class) null);
        public static final a D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (CharSequence) null, (d0) null, (Class) null);
        public static final a E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence) null, (d0) null, (Class) null);
        public static final a F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (CharSequence) null, (d0) null, (Class) null);
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (CharSequence) null, (d0) null, (Class) null);
        public static final a L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (CharSequence) null, (d0) null, d0.f.class);
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;

        /* renamed from: e  reason: collision with root package name */
        public static final a f2534e = new a(1, (CharSequence) null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f2535f = new a(2, (CharSequence) null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f2536g = new a(4, (CharSequence) null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f2537h = new a(8, (CharSequence) null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f2538i = new a(16, (CharSequence) null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f2539j = new a(32, (CharSequence) null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f2540k = new a(64, (CharSequence) null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f2541l = new a(128, (CharSequence) null);

        /* renamed from: m  reason: collision with root package name */
        public static final a f2542m;

        /* renamed from: n  reason: collision with root package name */
        public static final a f2543n;

        /* renamed from: o  reason: collision with root package name */
        public static final a f2544o;

        /* renamed from: p  reason: collision with root package name */
        public static final a f2545p;

        /* renamed from: q  reason: collision with root package name */
        public static final a f2546q = new a(4096, (CharSequence) null);

        /* renamed from: r  reason: collision with root package name */
        public static final a f2547r = new a(8192, (CharSequence) null);

        /* renamed from: s  reason: collision with root package name */
        public static final a f2548s = new a(16384, (CharSequence) null);

        /* renamed from: t  reason: collision with root package name */
        public static final a f2549t = new a(32768, (CharSequence) null);

        /* renamed from: u  reason: collision with root package name */
        public static final a f2550u = new a(65536, (CharSequence) null);

        /* renamed from: v  reason: collision with root package name */
        public static final a f2551v = new a(131072, (CharSequence) null, d0.g.class);

        /* renamed from: w  reason: collision with root package name */
        public static final a f2552w = new a(262144, (CharSequence) null);

        /* renamed from: x  reason: collision with root package name */
        public static final a f2553x = new a(524288, (CharSequence) null);

        /* renamed from: y  reason: collision with root package name */
        public static final a f2554y = new a(1048576, (CharSequence) null);

        /* renamed from: z  reason: collision with root package name */
        public static final a f2555z = new a(2097152, (CharSequence) null, d0.h.class);

        /* renamed from: a  reason: collision with root package name */
        final Object f2556a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2557b;

        /* renamed from: c  reason: collision with root package name */
        private final Class f2558c;

        /* renamed from: d  reason: collision with root package name */
        protected final d0 f2559d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            Class<d0.b> cls = d0.b.class;
            f2542m = new a(256, (CharSequence) null, (Class) cls);
            f2543n = new a(512, (CharSequence) null, (Class) cls);
            Class<d0.c> cls2 = d0.c.class;
            f2544o = new a(1024, (CharSequence) null, (Class) cls2);
            f2545p = new a(2048, (CharSequence) null, (Class) cls2);
            int i10 = Build.VERSION.SDK_INT;
            G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (d0) null, (Class) null);
            H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (d0) null, (Class) null);
            I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (d0) null, (Class) null);
            J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (d0) null, (Class) null);
            M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (d0) null, d0.d.class);
            N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (d0) null, (Class) null);
            O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (d0) null, (Class) null);
            P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (d0) null, (Class) null);
            Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, (CharSequence) null, (d0) null, (Class) null);
            R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, (CharSequence) null, (d0) null, (Class) null);
            S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, (CharSequence) null, (d0) null, (Class) null);
            T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, (CharSequence) null, (d0) null, (Class) null);
            U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 16908376, (CharSequence) null, (d0) null, (Class) null);
            if (i10 >= 34) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
            }
            V = new a(accessibilityAction, 16908382, (CharSequence) null, (d0) null, (Class) null);
        }

        public a(int i10, CharSequence charSequence) {
            this((Object) null, i10, charSequence, (d0) null, (Class) null);
        }

        public a a(CharSequence charSequence, d0 d0Var) {
            return new a((Object) null, this.f2557b, charSequence, d0Var, this.f2558c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2556a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2556a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f2559d == null) {
                return false;
            }
            Class cls = this.f2558c;
            if (cls != null) {
                try {
                    android.support.v4.media.session.b.a(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    throw null;
                } catch (Exception e10) {
                    Class cls2 = this.f2558c;
                    String name = cls2 == null ? "null" : cls2.getName();
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e10);
                }
            }
            return this.f2559d.a(view, (d0.a) null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f2556a;
            Object obj3 = ((a) obj).f2556a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f2556a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String j10 = y.j(this.f2557b);
            if (j10.equals("ACTION_UNKNOWN") && c() != null) {
                j10 = c().toString();
            }
            sb2.append(j10);
            return sb2.toString();
        }

        public a(int i10, CharSequence charSequence, d0 d0Var) {
            this((Object) null, i10, charSequence, d0Var, (Class) null);
        }

        private a(int i10, CharSequence charSequence, Class cls) {
            this((Object) null, i10, charSequence, (d0) null, cls);
        }

        a(Object obj) {
            this(obj, 0, (CharSequence) null, (d0) null, (Class) null);
        }

        a(Object obj, int i10, CharSequence charSequence, d0 d0Var, Class cls) {
            this.f2557b = i10;
            this.f2559d = d0Var;
            this.f2556a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence) : obj;
            this.f2558c = cls;
        }
    }

    private static class b {
        public static g a(int i10, int i11, int i12, int i13, boolean z10) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }

        public static Object b(int i10, float f10, float f11, float f12) {
            return AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12);
        }

        public static Bundle c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    private static class c {
        public static Object a(int i10, float f10, float f11, float f12) {
            return new AccessibilityNodeInfo.RangeInfo(i10, f10, f11, f12);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class d {
        public static g a(boolean z10, int i10, int i11, int i12, int i13, boolean z11, String str, String str2) {
            return new g(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z10).setColumnIndex(i10).setRowIndex(i11).setColumnSpan(i12).setRowSpan(i13).setSelected(z11).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static y b(AccessibilityNodeInfo accessibilityNodeInfo, int i10, int i11) {
            return y.Q0(accessibilityNodeInfo.getChild(i10, i11));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static y f(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
            return y.Q0(accessibilityNodeInfo.getParent(i10));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setTextSelectable(z10);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    private static class e {
        public static void a(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return TimeConversions.convert(accessibilityNodeInfo.getMinDurationBetweenContentChanges()).toMillis();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void f(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, long j10) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(TimeConversions.convert(Duration.ofMillis(j10)));
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z10) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z10);
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z10);
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        final Object f2560a;

        f(Object obj) {
            this.f2560a = obj;
        }

        public static f a(int i10, int i11, boolean z10) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }

        public static f b(int i10, int i11, boolean z10, int i12) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        final Object f2561a;

        g(Object obj) {
            this.f2561a = obj;
        }

        public static g a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    private y(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2531a = accessibilityNodeInfo;
    }

    private boolean F() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int G(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i10)).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f2530d;
        f2530d = i11 + 1;
        return i11;
    }

    public static y P0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new y(accessibilityNodeInfo);
    }

    static y Q0(Object obj) {
        if (obj != null) {
            return new y(obj);
        }
        return null;
    }

    public static y Z() {
        return P0(AccessibilityNodeInfo.obtain());
    }

    public static y a0(View view) {
        return P0(AccessibilityNodeInfo.obtain(view));
    }

    public static y b0(y yVar) {
        return P0(AccessibilityNodeInfo.obtain(yVar.f2531a));
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    private void f0(View view) {
        SparseArray z10 = z(view);
        if (z10 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < z10.size(); i10++) {
                if (((WeakReference) z10.valueAt(i10)).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                z10.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private void g() {
        b.c(this.f2531a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        b.c(this.f2531a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        b.c(this.f2531a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        b.c(this.f2531a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List h(String str) {
        ArrayList<Integer> integerArrayList = b.c(this.f2531a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        b.c(this.f2531a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private void h0(int i10, boolean z10) {
        Bundle v10 = v();
        if (v10 != null) {
            int i11 = v10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            v10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    static String j(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908382:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean l(int i10) {
        Bundle v10 = v();
        return v10 != null && (v10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public static ClickableSpan[] r(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray x(View view) {
        SparseArray z10 = z(view);
        if (z10 != null) {
            return z10;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(w.c.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    private SparseArray z(View view) {
        return (SparseArray) view.getTag(w.c.tag_accessibility_clickable_spans);
    }

    public CharSequence A() {
        return Build.VERSION.SDK_INT >= 30 ? c.b(this.f2531a) : b.c(this.f2531a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void A0(CharSequence charSequence) {
        this.f2531a.setPackageName(charSequence);
    }

    public CharSequence B() {
        if (!F()) {
            return this.f2531a.getText();
        }
        List h10 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List h11 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List h12 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List h13 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2531a.getText(), 0, this.f2531a.getText().length()));
        for (int i10 = 0; i10 < h10.size(); i10++) {
            spannableString.setSpan(new a(((Integer) h13.get(i10)).intValue(), this, v().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) h10.get(i10)).intValue(), ((Integer) h11.get(i10)).intValue(), ((Integer) h12.get(i10)).intValue());
        }
        return spannableString;
    }

    public void B0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2531a.setPaneTitle(charSequence);
        } else {
            b.c(this.f2531a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public CharSequence C() {
        return Build.VERSION.SDK_INT >= 28 ? this.f2531a.getTooltipText() : b.c(this.f2531a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void C0(View view) {
        this.f2532b = -1;
        this.f2531a.setParent(view);
    }

    public String D() {
        return Build.VERSION.SDK_INT >= 33 ? d.g(this.f2531a) : b.c(this.f2531a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void D0(View view, int i10) {
        this.f2532b = i10;
        this.f2531a.setParent(view, i10);
    }

    public String E() {
        return this.f2531a.getViewIdResourceName();
    }

    public void E0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2531a.setScreenReaderFocusable(z10);
        } else {
            h0(1, z10);
        }
    }

    public void F0(boolean z10) {
        this.f2531a.setScrollable(z10);
    }

    public void G0(boolean z10) {
        this.f2531a.setSelected(z10);
    }

    public boolean H() {
        return Build.VERSION.SDK_INT >= 34 ? e.e(this.f2531a) : l(64);
    }

    public void H0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2531a.setShowingHintText(z10);
        } else {
            h0(4, z10);
        }
    }

    public boolean I() {
        return this.f2531a.isAccessibilityFocused();
    }

    public void I0(View view) {
        this.f2533c = -1;
        this.f2531a.setSource(view);
    }

    public boolean J() {
        return this.f2531a.isCheckable();
    }

    public void J0(View view, int i10) {
        this.f2533c = i10;
        this.f2531a.setSource(view, i10);
    }

    public boolean K() {
        return this.f2531a.isChecked();
    }

    public void K0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.c(this.f2531a, charSequence);
        } else {
            b.c(this.f2531a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean L() {
        return this.f2531a.isClickable();
    }

    public void L0(CharSequence charSequence) {
        this.f2531a.setText(charSequence);
    }

    public boolean M() {
        return this.f2531a.isContextClickable();
    }

    public void M0(View view) {
        this.f2531a.setTraversalAfter(view);
    }

    public boolean N() {
        return this.f2531a.isEnabled();
    }

    public void N0(boolean z10) {
        this.f2531a.setVisibleToUser(z10);
    }

    public boolean O() {
        return this.f2531a.isFocusable();
    }

    public AccessibilityNodeInfo O0() {
        return this.f2531a;
    }

    public boolean P() {
        return this.f2531a.isFocused();
    }

    public boolean Q() {
        return l(67108864);
    }

    public boolean R() {
        return this.f2531a.isImportantForAccessibility();
    }

    public boolean S() {
        return this.f2531a.isLongClickable();
    }

    public boolean T() {
        return this.f2531a.isPassword();
    }

    public boolean U() {
        return this.f2531a.isScrollable();
    }

    public boolean V() {
        return this.f2531a.isSelected();
    }

    public boolean W() {
        return Build.VERSION.SDK_INT >= 26 ? this.f2531a.isShowingHintText() : l(4);
    }

    public boolean X() {
        return Build.VERSION.SDK_INT >= 33 ? d.h(this.f2531a) : l(8388608);
    }

    public boolean Y() {
        return this.f2531a.isVisibleToUser();
    }

    public void a(int i10) {
        this.f2531a.addAction(i10);
    }

    public void b(a aVar) {
        this.f2531a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2556a);
    }

    public void c(View view) {
        this.f2531a.addChild(view);
    }

    public boolean c0(int i10, Bundle bundle) {
        return this.f2531a.performAction(i10, bundle);
    }

    public void d(View view, int i10) {
        this.f2531a.addChild(view, i10);
    }

    public void d0() {
    }

    public boolean e0(a aVar) {
        return this.f2531a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2556a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2531a;
        if (accessibilityNodeInfo == null) {
            if (yVar.f2531a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(yVar.f2531a)) {
            return false;
        }
        return this.f2533c == yVar.f2533c && this.f2532b == yVar.f2532b;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            f0(view);
            ClickableSpan[] r10 = r(charSequence);
            if (r10 != null && r10.length > 0) {
                v().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", w.c.accessibility_action_clickable_span);
                SparseArray x10 = x(view);
                for (int i10 = 0; i10 < r10.length; i10++) {
                    int G = G(r10[i10], x10);
                    x10.put(G, new WeakReference(r10[i10]));
                    e(r10[i10], (Spanned) charSequence, G);
                }
            }
        }
    }

    public void g0(boolean z10) {
        this.f2531a.setAccessibilityFocused(z10);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2531a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f2531a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public void i0(Rect rect) {
        this.f2531a.setBoundsInParent(rect);
    }

    public void j0(Rect rect) {
        this.f2531a.setBoundsInScreen(rect);
    }

    public int k() {
        return this.f2531a.getActions();
    }

    public void k0(boolean z10) {
        this.f2531a.setCheckable(z10);
    }

    public void l0(boolean z10) {
        this.f2531a.setChecked(z10);
    }

    public void m(Rect rect) {
        this.f2531a.getBoundsInParent(rect);
    }

    public void m0(CharSequence charSequence) {
        this.f2531a.setClassName(charSequence);
    }

    public void n(Rect rect) {
        this.f2531a.getBoundsInScreen(rect);
    }

    public void n0(boolean z10) {
        this.f2531a.setClickable(z10);
    }

    public void o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.a(this.f2531a, rect);
            return;
        }
        Rect rect2 = (Rect) b.c(this.f2531a).getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void o0(Object obj) {
        this.f2531a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f2560a);
    }

    public int p() {
        return this.f2531a.getChildCount();
    }

    public void p0(Object obj) {
        this.f2531a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f2561a);
    }

    public CharSequence q() {
        return this.f2531a.getClassName();
    }

    public void q0(CharSequence charSequence) {
        this.f2531a.setContentDescription(charSequence);
    }

    public void r0(boolean z10) {
        this.f2531a.setDismissable(z10);
    }

    public CharSequence s() {
        return Build.VERSION.SDK_INT >= 34 ? e.b(this.f2531a) : b.c(this.f2531a).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void s0(boolean z10) {
        this.f2531a.setEnabled(z10);
    }

    public CharSequence t() {
        return this.f2531a.getContentDescription();
    }

    public void t0(CharSequence charSequence) {
        this.f2531a.setError(charSequence);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb2.append("; boundsInParent: " + rect);
        n(rect);
        sb2.append("; boundsInScreen: " + rect);
        o(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(y());
        sb2.append("; className: ");
        sb2.append(q());
        sb2.append("; text: ");
        sb2.append(B());
        sb2.append("; error: ");
        sb2.append(u());
        sb2.append("; maxTextLength: ");
        sb2.append(w());
        sb2.append("; stateDescription: ");
        sb2.append(A());
        sb2.append("; contentDescription: ");
        sb2.append(t());
        sb2.append("; tooltipText: ");
        sb2.append(C());
        sb2.append("; viewIdResName: ");
        sb2.append(E());
        sb2.append("; uniqueId: ");
        sb2.append(D());
        sb2.append("; checkable: ");
        sb2.append(J());
        sb2.append("; checked: ");
        sb2.append(K());
        sb2.append("; focusable: ");
        sb2.append(O());
        sb2.append("; focused: ");
        sb2.append(P());
        sb2.append("; selected: ");
        sb2.append(V());
        sb2.append("; clickable: ");
        sb2.append(L());
        sb2.append("; longClickable: ");
        sb2.append(S());
        sb2.append("; contextClickable: ");
        sb2.append(M());
        sb2.append("; enabled: ");
        sb2.append(N());
        sb2.append("; password: ");
        sb2.append(T());
        sb2.append("; scrollable: " + U());
        sb2.append("; containerTitle: ");
        sb2.append(s());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(Q());
        sb2.append("; importantForAccessibility: ");
        sb2.append(R());
        sb2.append("; visible: ");
        sb2.append(Y());
        sb2.append("; isTextSelectable: ");
        sb2.append(X());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(H());
        sb2.append("; [");
        List i10 = i();
        for (int i11 = 0; i11 < i10.size(); i11++) {
            a aVar = (a) i10.get(i11);
            String j10 = j(aVar.b());
            if (j10.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                j10 = aVar.c().toString();
            }
            sb2.append(j10);
            if (i11 != i10.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public CharSequence u() {
        return this.f2531a.getError();
    }

    public void u0(boolean z10) {
        this.f2531a.setFocusable(z10);
    }

    public Bundle v() {
        return b.c(this.f2531a);
    }

    public void v0(boolean z10) {
        this.f2531a.setFocused(z10);
    }

    public int w() {
        return this.f2531a.getMaxTextLength();
    }

    public void w0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2531a.setHeading(z10);
        } else {
            h0(2, z10);
        }
    }

    public void x0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2531a.setHintText(charSequence);
        } else {
            b.c(this.f2531a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public CharSequence y() {
        return this.f2531a.getPackageName();
    }

    public void y0(View view) {
        this.f2531a.setLabelFor(view);
    }

    public void z0(int i10) {
        this.f2531a.setMaxTextLength(i10);
    }

    public y(Object obj) {
        this.f2531a = (AccessibilityNodeInfo) obj;
    }
}
