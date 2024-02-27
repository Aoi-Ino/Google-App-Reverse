package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;

public abstract class c {

    static class a {
        static boolean a(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new C0038c(bVar));
        }

        static boolean b(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new C0038c(bVar));
        }
    }

    public interface b {
        void onTouchExplorationStateChanged(boolean z10);
    }

    /* renamed from: androidx.core.view.accessibility.c$c  reason: collision with other inner class name */
    private static final class C0038c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final b f2529a;

        C0038c(b bVar) {
            this.f2529a = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0038c)) {
                return false;
            }
            return this.f2529a.equals(((C0038c) obj).f2529a);
        }

        public int hashCode() {
            return this.f2529a.hashCode();
        }

        public void onTouchExplorationStateChanged(boolean z10) {
            this.f2529a.onTouchExplorationStateChanged(z10);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, b bVar) {
        return a.a(accessibilityManager, bVar);
    }

    public static boolean b(AccessibilityManager accessibilityManager, b bVar) {
        return a.b(accessibilityManager, bVar);
    }
}
