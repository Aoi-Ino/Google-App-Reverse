package sk;

import uk.b;

public class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private yk.a f31260a;

    /* renamed from: b  reason: collision with root package name */
    private tk.a f31261b;

    /* renamed from: c  reason: collision with root package name */
    private C0350a f31262c;

    /* renamed from: sk.a$a  reason: collision with other inner class name */
    interface C0350a {
        void e();
    }

    a(C0350a aVar) {
        this.f31262c = aVar;
        yk.a aVar2 = new yk.a();
        this.f31260a = aVar2;
        this.f31261b = new tk.a(aVar2.b(), this);
    }

    public void a(vk.a aVar) {
        this.f31260a.g(aVar);
        C0350a aVar2 = this.f31262c;
        if (aVar2 != null) {
            aVar2.e();
        }
    }

    public tk.a b() {
        return this.f31261b;
    }

    public yk.a c() {
        return this.f31260a;
    }

    public al.a d() {
        return this.f31260a.b();
    }
}
