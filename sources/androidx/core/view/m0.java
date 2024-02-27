package androidx.core.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.core.view.a;
import androidx.core.view.accessibility.d0;
import androidx.core.view.accessibility.y;
import androidx.core.view.k1;
import androidx.core.view.x0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class m0 {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f2630a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private static WeakHashMap f2631b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Field f2632c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f2633d = false;

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f2634e = {w.c.accessibility_custom_action_0, w.c.accessibility_custom_action_1, w.c.accessibility_custom_action_2, w.c.accessibility_custom_action_3, w.c.accessibility_custom_action_4, w.c.accessibility_custom_action_5, w.c.accessibility_custom_action_6, w.c.accessibility_custom_action_7, w.c.accessibility_custom_action_8, w.c.accessibility_custom_action_9, w.c.accessibility_custom_action_10, w.c.accessibility_custom_action_11, w.c.accessibility_custom_action_12, w.c.accessibility_custom_action_13, w.c.accessibility_custom_action_14, w.c.accessibility_custom_action_15, w.c.accessibility_custom_action_16, w.c.accessibility_custom_action_17, w.c.accessibility_custom_action_18, w.c.accessibility_custom_action_19, w.c.accessibility_custom_action_20, w.c.accessibility_custom_action_21, w.c.accessibility_custom_action_22, w.c.accessibility_custom_action_23, w.c.accessibility_custom_action_24, w.c.accessibility_custom_action_25, w.c.accessibility_custom_action_26, w.c.accessibility_custom_action_27, w.c.accessibility_custom_action_28, w.c.accessibility_custom_action_29, w.c.accessibility_custom_action_30, w.c.accessibility_custom_action_31};

    /* renamed from: f  reason: collision with root package name */
    private static final e0 f2635f = new l0();

    /* renamed from: g  reason: collision with root package name */
    private static final e f2636g = new e();

    class a extends f {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(p.d(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            p.j(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence d(View view) {
            return p.b(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            p.h(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence d(View view) {
            return r.b(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            r.f(view, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(p.c(view));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            p.g(view, bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: e  reason: collision with root package name */
        private final WeakHashMap f2637e = new WeakHashMap();

        e() {
        }

        private void b(View view, boolean z10) {
            boolean z11 = view.isShown() && view.getWindowVisibility() == 0;
            if (z10 != z11) {
                m0.Z(view, z11 ? 16 : 32);
                this.f2637e.put(view, Boolean.valueOf(z11));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            this.f2637e.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
            this.f2637e.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry entry : this.f2637e.entrySet()) {
                    b((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        private final int f2638a;

        /* renamed from: b  reason: collision with root package name */
        private final Class f2639b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2640c;

        /* renamed from: d  reason: collision with root package name */
        private final int f2641d;

        f(int i10, Class cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean b() {
            return true;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.f2640c;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* access modifiers changed from: package-private */
        public abstract Object d(View view);

        /* access modifiers changed from: package-private */
        public abstract void e(View view, Object obj);

        /* access modifiers changed from: package-private */
        public Object f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            Object tag = view.getTag(this.f2638a);
            if (this.f2639b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void g(View view, Object obj) {
            if (c()) {
                e(view, obj);
            } else if (b() && h(f(view), obj)) {
                m0.j(view);
                view.setTag(this.f2638a, obj);
                m0.Z(view, this.f2641d);
            }
        }

        /* access modifiers changed from: package-private */
        public abstract boolean h(Object obj, Object obj2);

        f(int i10, Class cls, int i11, int i12) {
            this.f2638a = i10;
            this.f2639b = cls;
            this.f2641d = i11;
            this.f2640c = i12;
        }
    }

    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    static class j {
        static Rect a(View view) {
            return view.getClipBounds();
        }

        static boolean b(View view) {
            return view.isInLayout();
        }

        static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static class k {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    static class l {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class m {

        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            k1 f2642a = null;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f2643b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ c0 f2644c;

            a(View view, c0 c0Var) {
                this.f2643b = view;
                this.f2644c = c0Var;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                k1 x10 = k1.x(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    m.a(windowInsets, this.f2643b);
                    if (x10.equals(this.f2642a)) {
                        return this.f2644c.a(view, x10).v();
                    }
                }
                this.f2642a = x10;
                k1 a10 = this.f2644c.a(view, x10);
                if (i10 >= 30) {
                    return a10.v();
                }
                m0.n0(view);
                return a10.v();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(w.c.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static k1 b(View view, k1 k1Var, Rect rect) {
            WindowInsets v10 = k1Var.v();
            if (v10 != null) {
                return k1.x(view.computeSystemWindowInsets(v10, rect), view);
            }
            rect.setEmpty();
            return k1Var;
        }

        static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static k1 j(View view) {
            return k1.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f10) {
            view.setElevation(f10);
        }

        static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void u(View view, c0 c0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(w.c.tag_on_apply_window_listener, c0Var);
            }
            if (c0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(w.c.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, c0Var));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void x(View view, float f10) {
            view.setZ(f10);
        }

        static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    private static class n {
        public static k1 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            k1 w10 = k1.w(rootWindowInsets);
            w10.t(w10);
            w10.d(view.getRootView());
            return w10;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    static class o {
        static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        static int c(View view) {
            return view.getImportantForAutofill();
        }

        static int d(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View i(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void l(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        static void m(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        static void n(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        static void o(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    static class p {
        static void a(View view, u uVar) {
            int i10 = w.c.tag_unhandled_key_listeners;
            o.g gVar = (o.g) view.getTag(i10);
            if (gVar == null) {
                gVar = new o.g();
                view.setTag(i10, gVar);
            }
            Objects.requireNonNull(uVar);
            n0 n0Var = new n0(uVar);
            gVar.put(uVar, n0Var);
            view.addOnUnhandledKeyEventListener(n0Var);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, u uVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            o.g gVar = (o.g) view.getTag(w.c.tag_unhandled_key_listeners);
            if (gVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(uVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        static <T> T f(View view, int i10) {
            return view.requireViewById(i10);
        }

        static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, AutofillId autofillId) {
            view.setAutofillId(autofillId);
        }

        static void j(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    private static class q {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        static void e(View view, ContentCaptureSession contentCaptureSession) {
            view.setContentCaptureSession(contentCaptureSession);
        }

        static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    private static class r {
        static int a(View view) {
            return view.getImportantForContentCapture();
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static j2 c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return j2.d(windowInsetsController);
            }
            return null;
        }

        static boolean d(View view) {
            return view.isImportantForContentCapture();
        }

        static void e(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }

        static void f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class s {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static d b(View view, d dVar) {
            ContentInfo f10 = dVar.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f10);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f10 ? dVar : d.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, d0 d0Var) {
            if (d0Var == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new t(d0Var));
            }
        }
    }

    private static final class t implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        private final d0 f2645a;

        t(d0 d0Var) {
            this.f2645a = d0Var;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            d g10 = d.g(contentInfo);
            d a10 = this.f2645a.a(view, g10);
            if (a10 == null) {
                return null;
            }
            return a10 == g10 ? contentInfo : a10.f();
        }
    }

    public interface u {
    }

    static class v {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList f2646d = new ArrayList();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap f2647a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray f2648b = null;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference f2649c = null;

        v() {
        }

        static v a(View view) {
            int i10 = w.c.tag_unhandled_key_event_manager;
            v vVar = (v) view.getTag(i10);
            if (vVar != null) {
                return vVar;
            }
            v vVar2 = new v();
            view.setTag(i10, vVar2);
            return vVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f2647a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c10 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f2648b == null) {
                this.f2648b = new SparseArray();
            }
            return this.f2648b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(w.c.tag_unhandled_key_listeners);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            android.support.v4.media.session.b.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f2647a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f2646d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    try {
                        if (this.f2647a == null) {
                            this.f2647a = new WeakHashMap();
                        }
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ArrayList arrayList2 = f2646d;
                            View view = (View) ((WeakReference) arrayList2.get(size)).get();
                            if (view == null) {
                                arrayList2.remove(size);
                            } else {
                                this.f2647a.put(view, Boolean.TRUE);
                                for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    this.f2647a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c10 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c10));
                }
            }
            return c10 != null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.ref.WeakReference} */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean f(android.view.KeyEvent r6) {
            /*
                r5 = this;
                java.lang.ref.WeakReference r0 = r5.f2649c
                r1 = 0
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.get()
                if (r0 != r6) goto L_0x000c
                return r1
            L_0x000c:
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r6)
                r5.f2649c = r0
                android.util.SparseArray r0 = r5.d()
                int r2 = r6.getAction()
                r3 = 1
                if (r2 != r3) goto L_0x0032
                int r2 = r6.getKeyCode()
                int r2 = r0.indexOfKey(r2)
                if (r2 < 0) goto L_0x0032
                java.lang.Object r4 = r0.valueAt(r2)
                java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
                r0.removeAt(r2)
                goto L_0x0033
            L_0x0032:
                r4 = 0
            L_0x0033:
                if (r4 != 0) goto L_0x0040
                int r2 = r6.getKeyCode()
                java.lang.Object r0 = r0.get(r2)
                r4 = r0
                java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            L_0x0040:
                if (r4 == 0) goto L_0x0054
                java.lang.Object r0 = r4.get()
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L_0x0053
                boolean r1 = androidx.core.view.m0.T(r0)
                if (r1 == 0) goto L_0x0053
                r5.e(r0, r6)
            L_0x0053:
                return r3
            L_0x0054:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.m0.v.f(android.view.KeyEvent):boolean");
        }
    }

    public static int A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.c(view);
        }
        return 0;
    }

    public static void A0(View view, boolean z10) {
        h.r(view, z10);
    }

    public static int B(View view) {
        return i.d(view);
    }

    public static void B0(View view, int i10) {
        h.s(view, i10);
    }

    public static int C(View view) {
        return h.d(view);
    }

    private static void C0(View view) {
        if (z(view) == 0) {
            B0(view, 1);
        }
    }

    public static int D(View view) {
        return h.e(view);
    }

    public static void D0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.m(view, i10);
        }
    }

    public static String[] E(View view) {
        return Build.VERSION.SDK_INT >= 31 ? s.a(view) : (String[]) view.getTag(w.c.tag_on_receive_content_mime_types);
    }

    public static void E0(View view, int i10) {
        i.h(view, i10);
    }

    public static int F(View view) {
        return i.e(view);
    }

    public static void F0(View view, c0 c0Var) {
        m.u(view, c0Var);
    }

    public static int G(View view) {
        return i.f(view);
    }

    public static void G0(View view, int i10, int i11, int i12, int i13) {
        i.k(view, i10, i11, i12, i13);
    }

    public static ViewParent H(View view) {
        return h.f(view);
    }

    public static void H0(View view, boolean z10) {
        p0().g(view, Boolean.valueOf(z10));
    }

    public static k1 I(View view) {
        return n.a(view);
    }

    public static void I0(View view, int i10, int i11) {
        n.d(view, i10, i11);
    }

    public static CharSequence J(View view) {
        return (CharSequence) L0().f(view);
    }

    public static void J0(View view, String str) {
        m.v(view, str);
    }

    public static String K(View view) {
        return m.k(view);
    }

    public static void K0(View view, x0.b bVar) {
        x0.d(view, bVar);
    }

    public static j2 L(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return r.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return w0.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    private static f L0() {
        return new c(w.c.tag_state_description, CharSequence.class, 64, 30);
    }

    public static int M(View view) {
        return h.g(view);
    }

    public static void M0(View view) {
        m.z(view);
    }

    public static float N(View view) {
        return m.m(view);
    }

    public static boolean O(View view) {
        return m(view) != null;
    }

    public static boolean P(View view) {
        return g.a(view);
    }

    public static boolean Q(View view) {
        return h.h(view);
    }

    public static boolean R(View view) {
        return h.i(view);
    }

    public static boolean S(View view) {
        Boolean bool = (Boolean) b().f(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean T(View view) {
        return k.b(view);
    }

    public static boolean U(View view) {
        return k.c(view);
    }

    public static boolean V(View view) {
        return m.p(view);
    }

    public static boolean W(View view) {
        return i.g(view);
    }

    public static boolean X(View view) {
        Boolean bool = (Boolean) p0().f(view);
        return bool != null && bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ d Y(d dVar) {
        return dVar;
    }

    static void Z(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = p(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i11 = 32;
            if (o(view) != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z10) {
                    i11 = 2048;
                }
                obtain.setEventType(i11);
                k.g(obtain, i10);
                if (z10) {
                    obtain.getText().add(p(view));
                    C0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(p(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void a0(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    private static f b() {
        return new d(w.c.tag_accessibility_heading, Boolean.class, 28);
    }

    public static void b0(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static int c(View view, CharSequence charSequence, d0 d0Var) {
        int r10 = r(view, charSequence);
        if (r10 != -1) {
            d(view, new y.a(r10, charSequence, d0Var));
        }
        return r10;
    }

    public static k1 c0(View view, k1 k1Var) {
        WindowInsets v10 = k1Var.v();
        if (v10 != null) {
            WindowInsets b10 = l.b(view, v10);
            if (!b10.equals(v10)) {
                return k1.x(b10, view);
            }
        }
        return k1Var;
    }

    private static void d(View view, y.a aVar) {
        j(view);
        l0(aVar.b(), view);
        q(view).add(aVar);
        Z(view, 0);
    }

    public static void d0(View view, y yVar) {
        view.onInitializeAccessibilityNodeInfo(yVar.O0());
    }

    public static s0 e(View view) {
        if (f2631b == null) {
            f2631b = new WeakHashMap();
        }
        s0 s0Var = (s0) f2631b.get(view);
        if (s0Var != null) {
            return s0Var;
        }
        s0 s0Var2 = new s0(view);
        f2631b.put(view, s0Var2);
        return s0Var2;
    }

    private static f e0() {
        return new b(w.c.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static k1 f(View view, k1 k1Var, Rect rect) {
        return m.b(view, k1Var, rect);
    }

    public static boolean f0(View view, int i10, Bundle bundle) {
        return h.j(view, i10, bundle);
    }

    public static k1 g(View view, k1 k1Var) {
        WindowInsets v10 = k1Var.v();
        if (v10 != null) {
            WindowInsets a10 = l.a(view, v10);
            if (!a10.equals(v10)) {
                return k1.x(a10, view);
            }
        }
        return k1Var;
    }

    public static d g0(View view, d dVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + dVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return s.b(view, dVar);
        }
        d0 d0Var = (d0) view.getTag(w.c.tag_on_receive_content_listener);
        if (d0Var == null) {
            return x(view).a(dVar);
        }
        d a10 = d0Var.a(view, dVar);
        if (a10 == null) {
            return null;
        }
        return x(view).a(a10);
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).b(view, keyEvent);
    }

    public static void h0(View view) {
        h.k(view);
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).f(keyEvent);
    }

    public static void i0(View view, Runnable runnable) {
        h.m(view, runnable);
    }

    static void j(View view) {
        a l10 = l(view);
        if (l10 == null) {
            l10 = new a();
        }
        q0(view, l10);
    }

    public static void j0(View view, Runnable runnable, long j10) {
        h.n(view, runnable, j10);
    }

    public static int k() {
        return i.a();
    }

    public static void k0(View view, int i10) {
        l0(i10, view);
        Z(view, 0);
    }

    public static a l(View view) {
        View.AccessibilityDelegate m10 = m(view);
        if (m10 == null) {
            return null;
        }
        return m10 instanceof a.C0037a ? ((a.C0037a) m10).f2523a : new a(m10);
    }

    private static void l0(int i10, View view) {
        List q10 = q(view);
        for (int i11 = 0; i11 < q10.size(); i11++) {
            if (((y.a) q10.get(i11)).b() == i10) {
                q10.remove(i11);
                return;
            }
        }
    }

    private static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? q.a(view) : n(view);
    }

    public static void m0(View view, y.a aVar, CharSequence charSequence, d0 d0Var) {
        if (d0Var == null && charSequence == null) {
            k0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, d0Var));
        }
    }

    private static View.AccessibilityDelegate n(View view) {
        if (f2633d) {
            return null;
        }
        if (f2632c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2632c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2633d = true;
                return null;
            }
        }
        try {
            Object obj = f2632c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2633d = true;
            return null;
        }
    }

    public static void n0(View view) {
        l.c(view);
    }

    public static int o(View view) {
        return k.a(view);
    }

    public static void o0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            q.d(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static CharSequence p(View view) {
        return (CharSequence) e0().f(view);
    }

    private static f p0() {
        return new a(w.c.tag_screen_reader_focusable, Boolean.class, 28);
    }

    private static List q(View view) {
        int i10 = w.c.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i10, arrayList2);
        return arrayList2;
    }

    public static void q0(View view, a aVar) {
        if (aVar == null && (m(view) instanceof a.C0037a)) {
            aVar = new a();
        }
        C0(view);
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    private static int r(View view, CharSequence charSequence) {
        List q10 = q(view);
        for (int i10 = 0; i10 < q10.size(); i10++) {
            if (TextUtils.equals(charSequence, ((y.a) q10.get(i10)).c())) {
                return ((y.a) q10.get(i10)).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f2634e;
            if (i12 >= iArr.length || i11 != -1) {
                return i11;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < q10.size(); i14++) {
                z10 &= ((y.a) q10.get(i14)).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static void r0(View view, boolean z10) {
        b().g(view, Boolean.valueOf(z10));
    }

    public static ColorStateList s(View view) {
        return m.g(view);
    }

    public static void s0(View view, int i10) {
        k.f(view, i10);
    }

    public static PorterDuff.Mode t(View view) {
        return m.h(view);
    }

    public static void t0(View view, CharSequence charSequence) {
        e0().g(view, charSequence);
        if (charSequence != null) {
            f2636g.a(view);
        } else {
            f2636g.d(view);
        }
    }

    public static Rect u(View view) {
        return j.a(view);
    }

    public static void u0(View view, Drawable drawable) {
        h.q(view, drawable);
    }

    public static Display v(View view) {
        return i.b(view);
    }

    public static void v0(View view, ColorStateList colorStateList) {
        m.q(view, colorStateList);
    }

    public static float w(View view) {
        return m.i(view);
    }

    public static void w0(View view, PorterDuff.Mode mode) {
        m.r(view, mode);
    }

    private static e0 x(View view) {
        return view instanceof e0 ? (e0) view : f2635f;
    }

    public static void x0(View view, Rect rect) {
        j.c(view, rect);
    }

    public static boolean y(View view) {
        return h.b(view);
    }

    public static void y0(View view, float f10) {
        m.s(view, f10);
    }

    public static int z(View view) {
        return h.c(view);
    }

    public static void z0(View view, boolean z10) {
        view.setFitsSystemWindows(z10);
    }
}
