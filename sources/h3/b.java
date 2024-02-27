package h3;

import java.util.Map;
import k3.a;

final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final a f11940a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f11941b;

    b(a aVar, Map map) {
        if (aVar != null) {
            this.f11940a = aVar;
            if (map != null) {
                this.f11941b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* access modifiers changed from: package-private */
    public a e() {
        return this.f11940a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f11940a.equals(fVar.e()) && this.f11941b.equals(fVar.h());
    }

    /* access modifiers changed from: package-private */
    public Map h() {
        return this.f11941b;
    }

    public int hashCode() {
        return ((this.f11940a.hashCode() ^ 1000003) * 1000003) ^ this.f11941b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f11940a + ", values=" + this.f11941b + "}";
    }
}
