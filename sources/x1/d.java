package x1;

import cm.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private c f18183a;

    /* renamed from: b  reason: collision with root package name */
    private String f18184b;

    public d(c cVar, String str) {
        this.f18183a = cVar;
        this.f18184b = str;
    }

    public final c a() {
        return this.f18183a;
    }

    public final String b() {
        return this.f18184b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f18183a == dVar.f18183a && l.a(this.f18184b, dVar.f18184b);
    }

    public int hashCode() {
        c cVar = this.f18183a;
        int i10 = 0;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        String str = this.f18184b;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "SharedStorageConfiguration(saveAt=" + this.f18183a + ", subFolderName=" + this.f18184b + ')';
    }
}
