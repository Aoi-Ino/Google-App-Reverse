package gp;

import hp.u;
import hp.y;
import java.lang.reflect.Array;
import java.util.Map;

public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final b f24066a;

    /* renamed from: b  reason: collision with root package name */
    private final String f24067b;

    /* renamed from: c  reason: collision with root package name */
    private final String f24068c;

    public e() {
        this("class", "length");
    }

    private g c(Class cls, y yVar) {
        u remove = yVar.remove(this.f24067b);
        return new a(cls, remove != null ? Integer.parseInt(remove.getValue()) : 0);
    }

    private Class d(f fVar, y yVar) {
        u remove = yVar.remove(this.f24068c);
        Class<?> type = fVar.getType();
        if (type.isArray()) {
            type = type.getComponentType();
        }
        if (remove == null) {
            return type;
        }
        return this.f24066a.c(remove.getValue());
    }

    private Class e(Class cls, Object obj, y yVar) {
        int length = Array.getLength(obj);
        String str = this.f24067b;
        if (str != null) {
            yVar.P(str, String.valueOf(length));
        }
        return cls.getComponentType();
    }

    public g a(f fVar, y yVar, Map map) {
        Class d10 = d(fVar, yVar);
        Class type = fVar.getType();
        if (type.isArray()) {
            return c(d10, yVar);
        }
        if (type != d10) {
            return new c(d10);
        }
        return null;
    }

    public boolean b(f fVar, Object obj, y yVar, Map map) {
        Class<?> cls = obj.getClass();
        Class<?> type = fVar.getType();
        Class<?> e10 = cls.isArray() ? e(type, obj, yVar) : cls;
        if (cls == type) {
            return false;
        }
        yVar.P(this.f24068c, e10.getName());
        return false;
    }

    public e(String str, String str2) {
        this.f24066a = new b();
        this.f24067b = str2;
        this.f24068c = str;
    }
}
