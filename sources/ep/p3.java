package ep;

import fp.b;

class p3 {

    /* renamed from: a  reason: collision with root package name */
    private o3 f23367a = new o3();

    /* renamed from: b  reason: collision with root package name */
    private o3 f23368b = new o3();

    /* renamed from: c  reason: collision with root package name */
    private o3 f23369c = new o3();

    /* renamed from: d  reason: collision with root package name */
    private b f23370d;

    /* renamed from: e  reason: collision with root package name */
    private int f23371e;

    public p3(b bVar) {
        this.f23370d = bVar;
    }

    private void b() {
        while (true) {
            int i10 = this.f23371e;
            o3 o3Var = this.f23367a;
            if (i10 >= o3Var.f23363c) {
                break;
            }
            char[] cArr = o3Var.f23362b;
            this.f23371e = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '}') {
                e();
                break;
            }
            this.f23368b.a(c10);
        }
        if (this.f23368b.g() > 0) {
            this.f23369c.c("${");
            this.f23369c.b(this.f23368b);
        }
    }

    private void c() {
        while (true) {
            int i10 = this.f23371e;
            o3 o3Var = this.f23367a;
            int i11 = o3Var.f23363c;
            if (i10 < i11) {
                char[] cArr = o3Var.f23362b;
                int i12 = i10 + 1;
                this.f23371e = i12;
                char c10 = cArr[i10];
                if (c10 == '$' && i12 < i11) {
                    this.f23371e = i10 + 2;
                    if (cArr[i12] == '{') {
                        b();
                    } else {
                        this.f23371e = i10 + 1;
                    }
                }
                this.f23369c.a(c10);
            } else {
                return;
            }
        }
    }

    private void e() {
        if (this.f23368b.g() > 0) {
            f(this.f23368b);
        }
        this.f23368b.e();
    }

    private void f(o3 o3Var) {
        g(o3Var.toString());
    }

    private void g(String str) {
        o3 o3Var;
        String a10 = this.f23370d.a(str);
        if (a10 == null) {
            this.f23369c.c("${");
            this.f23369c.c(str);
            o3Var = this.f23369c;
            a10 = "}";
        } else {
            o3Var = this.f23369c;
        }
        o3Var.c(a10);
    }

    public void a() {
        this.f23368b.e();
        this.f23369c.e();
        this.f23367a.e();
        this.f23371e = 0;
    }

    public String d(String str) {
        if (str.indexOf(36) < 0) {
            return str;
        }
        try {
            this.f23367a.c(str);
            c();
            return this.f23369c.toString();
        } finally {
            a();
        }
    }
}
