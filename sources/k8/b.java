package k8;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f13095a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13096b;

    public b(int i10, int i11) {
        this.f13095a = i10;
        this.f13096b = i11;
    }

    public final b a(int i10, int i11) {
        return new b(i10, i11);
    }

    public final int b() {
        return this.f13096b;
    }

    public final int c() {
        return this.f13095a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13095a == bVar.f13095a && this.f13096b == bVar.f13096b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f13095a) * 31) + Integer.hashCode(this.f13096b);
    }

    public String toString() {
        return "Size(width=" + this.f13095a + ", height=" + this.f13096b + ")";
    }
}
