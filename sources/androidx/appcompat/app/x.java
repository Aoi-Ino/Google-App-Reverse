package androidx.appcompat.app;

import androidx.core.os.i;
import java.util.LinkedHashSet;
import java.util.Locale;

abstract class x {
    private static i a(i iVar, i iVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < iVar.f() + iVar2.f()) {
            Locale c10 = i10 < iVar.f() ? iVar.c(i10) : iVar2.c(i10 - iVar.f());
            if (c10 != null) {
                linkedHashSet.add(c10);
            }
            i10++;
        }
        return i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static i b(i iVar, i iVar2) {
        return (iVar == null || iVar.e()) ? i.d() : a(iVar, iVar2);
    }
}
