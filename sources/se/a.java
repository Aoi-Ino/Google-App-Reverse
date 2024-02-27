package se;

import cm.l;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f31202a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31203b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31204c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f31205d;

    public a(String str, String str2, String str3, ArrayList arrayList) {
        l.f(str, "applNo");
        l.f(str2, "chasiNo");
        l.f(str3, "regnNo");
        l.f(arrayList, "purCdsForFee");
        this.f31202a = str;
        this.f31203b = str2;
        this.f31204c = str3;
        this.f31205d = arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f31202a, aVar.f31202a) && l.a(this.f31203b, aVar.f31203b) && l.a(this.f31204c, aVar.f31204c) && l.a(this.f31205d, aVar.f31205d);
    }

    public int hashCode() {
        return (((((this.f31202a.hashCode() * 31) + this.f31203b.hashCode()) * 31) + this.f31204c.hashCode()) * 31) + this.f31205d.hashCode();
    }

    public String toString() {
        return "FeeModle(applNo=" + this.f31202a + ", chasiNo=" + this.f31203b + ", regnNo=" + this.f31204c + ", purCdsForFee=" + this.f31205d + ')';
    }
}
