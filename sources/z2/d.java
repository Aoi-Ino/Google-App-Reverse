package z2;

import java.util.List;

final class d extends j {

    /* renamed from: a  reason: collision with root package name */
    private final List f18777a;

    d(List list) {
        if (list != null) {
            this.f18777a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    public List c() {
        return this.f18777a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f18777a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f18777a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f18777a + "}";
    }
}
