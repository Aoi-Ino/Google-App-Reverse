package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

public class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2527a;

    static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        final b0 f2528a;

        a(b0 b0Var) {
            this.f2528a = b0Var;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            y b10 = this.f2528a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.O0();
        }

        public List findAccessibilityNodeInfosByText(String str, int i10) {
            List c10 = this.f2528a.c(str, i10);
            if (c10 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c10.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((y) c10.get(i11)).O0());
            }
            return arrayList;
        }

        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f2528a.f(i10, i11, bundle);
        }
    }

    static class b extends a {
        b(b0 b0Var) {
            super(b0Var);
        }

        public AccessibilityNodeInfo findFocus(int i10) {
            y d10 = this.f2528a.d(i10);
            if (d10 == null) {
                return null;
            }
            return d10.O0();
        }
    }

    static class c extends b {
        c(b0 b0Var) {
            super(b0Var);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f2528a.a(i10, y.P0(accessibilityNodeInfo), str, bundle);
        }
    }

    public b0() {
        this.f2527a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public void a(int i10, y yVar, String str, Bundle bundle) {
    }

    public y b(int i10) {
        return null;
    }

    public List c(String str, int i10) {
        return null;
    }

    public y d(int i10) {
        return null;
    }

    public Object e() {
        return this.f2527a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public b0(Object obj) {
        this.f2527a = obj;
    }
}
