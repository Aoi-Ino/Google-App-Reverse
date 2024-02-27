package ep;

import java.lang.annotation.Annotation;

class m1 {

    /* renamed from: a  reason: collision with root package name */
    private final Class f23321a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f23322b;

    /* renamed from: c  reason: collision with root package name */
    private final Class f23323c;

    /* renamed from: d  reason: collision with root package name */
    private final String f23324d;

    public m1(t tVar, Annotation annotation) {
        this.f23322b = tVar.c();
        this.f23321a = annotation.annotationType();
        this.f23324d = tVar.getName();
        this.f23323c = tVar.getType();
    }

    private boolean a(m1 m1Var) {
        if (m1Var == this) {
            return true;
        }
        if (m1Var.f23321a == this.f23321a && m1Var.f23322b == this.f23322b && m1Var.f23323c == this.f23323c) {
            return m1Var.f23324d.equals(this.f23324d);
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m1) {
            return a((m1) obj);
        }
        return false;
    }

    public int hashCode() {
        return this.f23324d.hashCode() ^ this.f23322b.hashCode();
    }

    public String toString() {
        return String.format("key '%s' for %s", new Object[]{this.f23324d, this.f23322b});
    }
}
