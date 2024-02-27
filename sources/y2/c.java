package y2;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f18481a;

    private c(String str) {
        if (str != null) {
            this.f18481a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public static c b(String str) {
        return new c(str);
    }

    public String a() {
        return this.f18481a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f18481a.equals(((c) obj).f18481a);
    }

    public int hashCode() {
        return this.f18481a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f18481a + "\"}";
    }
}
