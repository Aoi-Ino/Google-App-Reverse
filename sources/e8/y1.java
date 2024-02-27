package e8;

import java.io.OutputStream;

public class y1 extends i1 {

    /* renamed from: g  reason: collision with root package name */
    protected String f11081g;

    /* renamed from: h  reason: collision with root package name */
    protected String f11082h;

    /* renamed from: i  reason: collision with root package name */
    protected String f11083i;

    /* renamed from: j  reason: collision with root package name */
    protected int f11084j;

    /* renamed from: k  reason: collision with root package name */
    protected int f11085k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f11086l;

    public y1() {
        super(3);
        this.f11081g = "";
        this.f11082h = null;
        this.f11083i = "PDF";
        this.f11084j = 0;
        this.f11085k = 0;
        this.f11086l = false;
    }

    public byte[] b() {
        if (this.f10819e == null) {
            String str = this.f11083i;
            if (str == null || !str.equals("UnicodeBig") || !o0.e(this.f11081g)) {
                this.f10819e = o0.c(this.f11081g, this.f11083i);
            } else {
                this.f10819e = o0.c(this.f11081g, "PDF");
            }
        }
        return this.f10819e;
    }

    public void k(c2 c2Var, OutputStream outputStream) {
        byte[] b10 = b();
        if (c2Var != null) {
            c2Var.A();
        }
        if (this.f11086l) {
            f fVar = new f();
            fVar.e('<');
            for (byte y10 : b10) {
                fVar.y(y10);
            }
            fVar.e('>');
            outputStream.write(fVar.Z());
            return;
        }
        outputStream.write(g0.l(b10));
    }

    public String toString() {
        return this.f11081g;
    }

    public y1(String str) {
        super(3);
        this.f11082h = null;
        this.f11083i = "PDF";
        this.f11084j = 0;
        this.f11085k = 0;
        this.f11086l = false;
        this.f11081g = str;
    }

    public y1(String str, String str2) {
        super(3);
        this.f11082h = null;
        this.f11084j = 0;
        this.f11085k = 0;
        this.f11086l = false;
        this.f11081g = str;
        this.f11083i = str2;
    }
}
