package k6;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Class f12964a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f12965b;

    private @interface a {
    }

    public d0(Class cls, Class cls2) {
        this.f12964a = cls;
        this.f12965b = cls2;
    }

    public static d0 a(Class cls, Class cls2) {
        return new d0(cls, cls2);
    }

    public static d0 b(Class cls) {
        return new d0(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (!this.f12965b.equals(d0Var.f12965b)) {
            return false;
        }
        return this.f12964a.equals(d0Var.f12964a);
    }

    public int hashCode() {
        return (this.f12965b.hashCode() * 31) + this.f12964a.hashCode();
    }

    public String toString() {
        if (this.f12964a == a.class) {
            return this.f12965b.getName();
        }
        return "@" + this.f12964a.getName() + " " + this.f12965b.getName();
    }
}
