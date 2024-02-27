package b3;

import android.content.Context;
import k3.a;

final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4415a;

    /* renamed from: b  reason: collision with root package name */
    private final a f4416b;

    /* renamed from: c  reason: collision with root package name */
    private final a f4417c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4418d;

    c(Context context, a aVar, a aVar2, String str) {
        if (context != null) {
            this.f4415a = context;
            if (aVar != null) {
                this.f4416b = aVar;
                if (aVar2 != null) {
                    this.f4417c = aVar2;
                    if (str != null) {
                        this.f4418d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public Context b() {
        return this.f4415a;
    }

    public String c() {
        return this.f4418d;
    }

    public a d() {
        return this.f4417c;
    }

    public a e() {
        return this.f4416b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f4415a.equals(hVar.b()) && this.f4416b.equals(hVar.e()) && this.f4417c.equals(hVar.d()) && this.f4418d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.f4415a.hashCode() ^ 1000003) * 1000003) ^ this.f4416b.hashCode()) * 1000003) ^ this.f4417c.hashCode()) * 1000003) ^ this.f4418d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f4415a + ", wallClock=" + this.f4416b + ", monotonicClock=" + this.f4417c + ", backendName=" + this.f4418d + "}";
    }
}
