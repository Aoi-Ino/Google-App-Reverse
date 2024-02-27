package hn;

import cm.l;
import in.e;
import java.io.EOFException;

public abstract class b {
    public static final boolean a(e eVar) {
        l.f(eVar, "$this$isProbablyUtf8");
        try {
            e eVar2 = new e();
            eVar.h(eVar2, 0, f.e(eVar.H0(), 64));
            for (int i10 = 0; i10 < 16; i10++) {
                if (eVar2.P()) {
                    return true;
                }
                int F0 = eVar2.F0();
                if (Character.isISOControl(F0) && !Character.isWhitespace(F0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
