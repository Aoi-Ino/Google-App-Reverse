package ep;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

class a1 {

    /* renamed from: a  reason: collision with root package name */
    private final Annotation[] f23107a;

    /* renamed from: b  reason: collision with root package name */
    private final Field f23108b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23109c;

    public a1(Field field) {
        this.f23107a = field.getDeclaredAnnotations();
        this.f23109c = field.getName();
        this.f23108b = field;
    }

    public Annotation[] a() {
        return this.f23107a;
    }

    public Field b() {
        return this.f23108b;
    }
}
