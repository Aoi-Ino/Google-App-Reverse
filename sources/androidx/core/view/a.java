package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.b0;
import androidx.core.view.accessibility.y;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import w.c;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final View.AccessibilityDelegate f2520c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    private final View.AccessibilityDelegate f2521a;

    /* renamed from: b  reason: collision with root package name */
    private final View.AccessibilityDelegate f2522b;

    /* renamed from: androidx.core.view.a$a  reason: collision with other inner class name */
    static final class C0037a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        final a f2523a;

        C0037a(a aVar) {
            this.f2523a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2523a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            b0 b10 = this.f2523a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.e();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2523a.f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            y P0 = y.P0(accessibilityNodeInfo);
            P0.E0(m0.X(view));
            P0.w0(m0.S(view));
            P0.B0(m0.p(view));
            P0.K0(m0.J(view));
            this.f2523a.g(view, P0);
            P0.f(accessibilityNodeInfo.getText(), view);
            List c10 = a.c(view);
            for (int i10 = 0; i10 < c10.size(); i10++) {
                P0.b((y.a) c10.get(i10));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2523a.h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2523a.i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f2523a.j(view, i10, bundle);
        }

        public void sendAccessibilityEvent(View view, int i10) {
            this.f2523a.l(view, i10);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2523a.m(view, accessibilityEvent);
        }
    }

    static class b {
        static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public a() {
        this(f2520c);
    }

    static List c(View view) {
        List list = (List) view.getTag(c.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] r10 = y.r(view.createAccessibilityNodeInfo().getText());
            int i10 = 0;
            while (r10 != null && i10 < r10.length) {
                if (clickableSpan.equals(r10[i10])) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    private boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(c.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2521a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public b0 b(View view) {
        AccessibilityNodeProvider a10 = b.a(this.f2521a, view);
        if (a10 != null) {
            return new b0(a10);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View.AccessibilityDelegate d() {
        return this.f2522b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f2521a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, y yVar) {
        this.f2521a.onInitializeAccessibilityNodeInfo(view, yVar.O0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f2521a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2521a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) {
        List c10 = c(view);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= c10.size()) {
                break;
            }
            y.a aVar = (y.a) c10.get(i11);
            if (aVar.b() == i10) {
                z10 = aVar.d(view, bundle);
                break;
            }
            i11++;
        }
        if (!z10) {
            z10 = b.b(this.f2521a, view, i10, bundle);
        }
        return (z10 || i10 != c.accessibility_action_clickable_span || bundle == null) ? z10 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i10) {
        this.f2521a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f2521a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2521a = accessibilityDelegate;
        this.f2522b = new C0037a(this);
    }
}
