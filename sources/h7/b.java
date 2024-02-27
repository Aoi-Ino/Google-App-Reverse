package h7;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import k6.c;
import k6.d;
import k6.i;

public class b implements i {
    /* access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, c cVar, d dVar) {
        try {
            c.b(str);
            return cVar.h().a(dVar);
        } finally {
            c.a();
        }
    }

    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (c cVar : componentRegistrar.getComponents()) {
            String i10 = cVar.i();
            if (i10 != null) {
                cVar = cVar.t(new a(i10, cVar));
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
