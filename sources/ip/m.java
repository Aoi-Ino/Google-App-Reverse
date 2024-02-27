package ip;

import java.lang.reflect.Constructor;
import java.util.Date;

class m {

    /* renamed from: a  reason: collision with root package name */
    private final Constructor f24526a;

    public m(Class cls) {
        this(cls, Long.TYPE);
    }

    public Date a(Object... objArr) {
        return (Date) this.f24526a.newInstance(objArr);
    }

    public m(Class cls, Class... clsArr) {
        this.f24526a = cls.getDeclaredConstructor(clsArr);
    }
}
