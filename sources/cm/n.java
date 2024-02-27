package cm;

public final class n implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Class f20228a;

    /* renamed from: b  reason: collision with root package name */
    private final String f20229b;

    public n(Class cls, String str) {
        l.f(cls, "jClass");
        l.f(str, "moduleName");
        this.f20228a = cls;
        this.f20229b = str;
    }

    public Class b() {
        return this.f20228a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof n) && l.a(b(), ((n) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
