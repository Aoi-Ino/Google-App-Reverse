package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.session.b;
import com.google.crypto.tink.shaded.protobuf.h0;
import java.util.Iterator;
import java.util.Map;

class k0 implements j0 {
    k0() {
    }

    private static int i(int i10, Object obj, Object obj2) {
        i0 i0Var = (i0) obj;
        b.a(obj2);
        if (i0Var.isEmpty()) {
            return 0;
        }
        Iterator it = i0Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    private static i0 j(Object obj, Object obj2) {
        i0 i0Var = (i0) obj;
        i0 i0Var2 = (i0) obj2;
        if (!i0Var2.isEmpty()) {
            if (!i0Var.h()) {
                i0Var = i0Var.k();
            }
            i0Var.j(i0Var2);
        }
        return i0Var;
    }

    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    public Object b(Object obj) {
        return i0.d().k();
    }

    public int c(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    public boolean d(Object obj) {
        return !((i0) obj).h();
    }

    public Object e(Object obj) {
        ((i0) obj).i();
        return obj;
    }

    public h0.a f(Object obj) {
        b.a(obj);
        throw null;
    }

    public Map g(Object obj) {
        return (i0) obj;
    }

    public Map h(Object obj) {
        return (i0) obj;
    }
}
