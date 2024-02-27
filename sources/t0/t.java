package t0;

import t0.y;

public abstract /* synthetic */ class t {
    public static /* synthetic */ y a(y.l lVar, String str, String str2) {
        if (str == null || !str.startsWith("java")) {
            return lVar.a(str, str2);
        }
        try {
            return lVar.a("j$" + str.substring(4), str2);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof ClassNotFoundException) {
                return lVar.a(str, str2);
            }
            throw e10;
        }
    }
}
