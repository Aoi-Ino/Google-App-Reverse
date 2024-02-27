package ep;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import jp.a;
import jp.b;

class z0 implements t {

    /* renamed from: a  reason: collision with root package name */
    private final a f23438a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final Annotation[] f23439b;

    /* renamed from: c  reason: collision with root package name */
    private final Annotation f23440c;

    /* renamed from: d  reason: collision with root package name */
    private final Field f23441d;

    /* renamed from: e  reason: collision with root package name */
    private final String f23442e;

    /* renamed from: f  reason: collision with root package name */
    private final int f23443f;

    public z0(Field field, Annotation annotation, Annotation[] annotationArr) {
        this.f23443f = field.getModifiers();
        this.f23442e = field.getName();
        this.f23440c = annotation;
        this.f23441d = field;
        this.f23439b = annotationArr;
    }

    private Annotation f(Class cls) {
        if (this.f23438a.isEmpty()) {
            for (Annotation annotation : this.f23439b) {
                this.f23438a.a(annotation.annotationType(), annotation);
            }
        }
        return (Annotation) this.f23438a.b(cls);
    }

    public Annotation a() {
        return this.f23440c;
    }

    public Annotation b(Class cls) {
        return cls == this.f23440c.annotationType() ? this.f23440c : f(cls);
    }

    public Class c() {
        return this.f23441d.getDeclaringClass();
    }

    public void d(Object obj, Object obj2) {
        if (!g()) {
            this.f23441d.set(obj, obj2);
        }
    }

    public boolean e() {
        return !h() && g();
    }

    public boolean g() {
        return Modifier.isFinal(this.f23443f);
    }

    public Object get(Object obj) {
        return this.f23441d.get(obj);
    }

    public String getName() {
        return this.f23442e;
    }

    public Class getType() {
        return this.f23441d.getType();
    }

    public boolean h() {
        return Modifier.isStatic(this.f23443f);
    }

    public String toString() {
        return String.format("field '%s' %s", new Object[]{getName(), this.f23441d.toString()});
    }
}
