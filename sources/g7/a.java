package g7;

final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f11713a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11714b;

    a(String str, String str2) {
        if (str != null) {
            this.f11713a = str;
            if (str2 != null) {
                this.f11714b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public String b() {
        return this.f11713a;
    }

    public String c() {
        return this.f11714b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f11713a.equals(fVar.b()) && this.f11714b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f11713a.hashCode() ^ 1000003) * 1000003) ^ this.f11714b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f11713a + ", version=" + this.f11714b + "}";
    }
}
