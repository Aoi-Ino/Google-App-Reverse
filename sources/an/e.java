package an;

import cm.l;
import dn.j;
import in.h;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import um.d0;
import um.m;
import um.n;
import um.u;
import um.v;
import vm.b;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static final h f19393a;

    /* renamed from: b  reason: collision with root package name */
    private static final h f19394b;

    static {
        h.a aVar = h.f24468i;
        f19393a = aVar.c("\"\\");
        f19394b = aVar.c("\t ,=");
    }

    public static final List a(u uVar, String str) {
        l.f(uVar, "$this$parseChallenges");
        l.f(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (p.o(str, uVar.n(i10), true)) {
                try {
                    c(new in.e().r0(uVar.s(i10)), arrayList);
                } catch (EOFException e10) {
                    j.f22941c.g().j("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(d0 d0Var) {
        l.f(d0Var, "$this$promisesBody");
        if (l.a(d0Var.c0().g(), "HEAD")) {
            return false;
        }
        int h10 = d0Var.h();
        return (((h10 >= 100 && h10 < 200) || h10 == 204 || h10 == 304) && b.s(d0Var) == -1 && !p.o("chunked", d0.s(d0Var, "Transfer-Encoding", (String) null, 2, (Object) null), true)) ? false : true;
    }

    private static final void c(in.e eVar, List list) {
        String e10;
        int H;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    g(eVar);
                    str = e(eVar);
                    if (str == null) {
                        return;
                    }
                }
                boolean g10 = g(eVar);
                e10 = e(eVar);
                if (e10 != null) {
                    byte b10 = (byte) 61;
                    H = b.H(eVar, b10);
                    boolean g11 = g(eVar);
                    if (g10 || (!g11 && !eVar.P())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int H2 = H + b.H(eVar, b10);
                        while (true) {
                            if (e10 == null) {
                                e10 = e(eVar);
                                if (g(eVar)) {
                                    continue;
                                    break;
                                }
                                H2 = b.H(eVar, b10);
                            }
                            if (H2 == 0) {
                                continue;
                                break;
                            } else if (H2 <= 1 && !g(eVar)) {
                                String d10 = h(eVar, (byte) 34) ? d(eVar) : e(eVar);
                                if (d10 != null && ((String) linkedHashMap.put(e10, d10)) == null) {
                                    if (g(eVar) || eVar.P()) {
                                        e10 = null;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new um.h(str, linkedHashMap));
                        str = e10;
                    }
                } else if (eVar.P()) {
                    list.add(new um.h(str, i0.g()));
                    return;
                } else {
                    return;
                }
            }
            Map singletonMap = Collections.singletonMap((Object) null, e10 + p.s("=", H));
            l.e(singletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
            list.add(new um.h(str, singletonMap));
        }
    }

    private static final String d(in.e eVar) {
        byte b10 = (byte) 34;
        if (eVar.readByte() == b10) {
            in.e eVar2 = new in.e();
            while (true) {
                long Y = eVar.Y(f19393a);
                if (Y == -1) {
                    return null;
                }
                if (eVar.R(Y) == b10) {
                    eVar2.b0(eVar, Y);
                    eVar.readByte();
                    return eVar2.D0();
                } else if (eVar.H0() == Y + 1) {
                    return null;
                } else {
                    eVar2.b0(eVar, Y);
                    eVar.readByte();
                    eVar2.b0(eVar, 1);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final String e(in.e eVar) {
        long Y = eVar.Y(f19394b);
        if (Y == -1) {
            Y = eVar.H0();
        }
        if (Y != 0) {
            return eVar.E0(Y);
        }
        return null;
    }

    public static final void f(n nVar, v vVar, u uVar) {
        l.f(nVar, "$this$receiveHeaders");
        l.f(vVar, "url");
        l.f(uVar, "headers");
        if (nVar != n.f32102a) {
            List e10 = m.f32092n.e(vVar, uVar);
            if (!e10.isEmpty()) {
                nVar.a(vVar, e10);
            }
        }
    }

    private static final boolean g(in.e eVar) {
        boolean z10 = false;
        while (!eVar.P()) {
            byte R = eVar.R(0);
            if (R == 9 || R == 32) {
                eVar.readByte();
            } else if (R != 44) {
                break;
            } else {
                eVar.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    private static final boolean h(in.e eVar, byte b10) {
        return !eVar.P() && eVar.R(0) == b10;
    }
}
