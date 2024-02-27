package m1;

import cm.l;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f13690a;

    static {
        String i10 = m.i("InputMerger");
        l.e(i10, "tagWithPrefix(\"InputMerger\")");
        f13690a = i10;
    }

    public static final i a(String str) {
        l.f(str, "className");
        try {
            Object newInstance = Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            l.d(newInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (i) newInstance;
        } catch (Exception e10) {
            m e11 = m.e();
            String str2 = f13690a;
            e11.d(str2, "Trouble instantiating " + str, e10);
            return null;
        }
    }
}
