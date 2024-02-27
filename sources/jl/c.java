package jl;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private int f24622a;

    /* renamed from: b  reason: collision with root package name */
    private int f24623b;

    /* renamed from: c  reason: collision with root package name */
    private int f24624c;

    public c(int i10, int i11, int i12) {
        this.f24622a = i10;
        this.f24623b = i11;
        this.f24624c = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f24622a == cVar.f24622a && this.f24623b == cVar.f24623b) {
            return this.f24624c == cVar.f24624c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f24622a * 31) + this.f24623b) * 31) + this.f24624c;
    }
}
