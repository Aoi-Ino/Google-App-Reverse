package fp;

public class f implements b {

    /* renamed from: a  reason: collision with root package name */
    private b f23689a;

    public f() {
        this((b) null);
    }

    public String a(String str) {
        String property = System.getProperty(str);
        if (property != null) {
            return property;
        }
        b bVar = this.f23689a;
        if (bVar != null) {
            return bVar.a(str);
        }
        return null;
    }

    public f(b bVar) {
        this.f23689a = bVar;
    }
}
