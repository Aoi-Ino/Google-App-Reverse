package cm;

import im.b;
import im.c;
import im.d;
import im.e;

public class w {
    public d a(j jVar) {
        return jVar;
    }

    public b b(Class cls) {
        return new e(cls);
    }

    public c c(Class cls, String str) {
        return new n(cls, str);
    }

    public e d(o oVar) {
        return oVar;
    }

    public String e(i iVar) {
        String obj = iVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String f(m mVar) {
        return e(mVar);
    }
}
