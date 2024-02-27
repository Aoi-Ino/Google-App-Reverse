package oo;

import java.util.HashMap;
import java.util.Map;
import qn.u;
import tn.a;
import yn.g;
import yn.j;
import yn.k;

abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private static Map f30239a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static Map f30240b = new HashMap();

    static {
        Map map = f30239a;
        u uVar = a.f31688c;
        map.put("SHA-256", uVar);
        Map map2 = f30239a;
        u uVar2 = a.f31692e;
        map2.put("SHA-512", uVar2);
        Map map3 = f30239a;
        u uVar3 = a.f31708m;
        map3.put("SHAKE128", uVar3);
        Map map4 = f30239a;
        u uVar4 = a.f31710n;
        map4.put("SHAKE256", uVar4);
        f30240b.put(uVar, "SHA-256");
        f30240b.put(uVar2, "SHA-512");
        f30240b.put(uVar3, "SHAKE128");
        f30240b.put(uVar4, "SHAKE256");
    }

    static xn.a a(u uVar) {
        if (uVar.Y(a.f31688c)) {
            return new g();
        }
        if (uVar.Y(a.f31692e)) {
            return new j();
        }
        if (uVar.Y(a.f31708m)) {
            return new k(128);
        }
        if (uVar.Y(a.f31710n)) {
            return new k(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + uVar);
    }

    static String b(u uVar) {
        String str = (String) f30240b.get(uVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("unrecognized digest oid: " + uVar);
    }

    static u c(String str) {
        u uVar = (u) f30239a.get(str);
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalArgumentException("unrecognized digest name: " + str);
    }
}
