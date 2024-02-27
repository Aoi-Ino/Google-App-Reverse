package w6;

import java.util.List;

final class a extends l {

    /* renamed from: a  reason: collision with root package name */
    private final String f17909a;

    /* renamed from: b  reason: collision with root package name */
    private final List f17910b;

    a(String str, List list) {
        if (str != null) {
            this.f17909a = str;
            if (list != null) {
                this.f17910b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    public List b() {
        return this.f17910b;
    }

    public String c() {
        return this.f17909a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f17909a.equals(lVar.c()) && this.f17910b.equals(lVar.b());
    }

    public int hashCode() {
        return ((this.f17909a.hashCode() ^ 1000003) * 1000003) ^ this.f17910b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f17909a + ", usedDates=" + this.f17910b + "}";
    }
}
