package e8;

import b8.a;
import java.net.URL;

public class z extends l0 {
    public z() {
    }

    public static z v(String str, r0 r0Var, String str2, x0 x0Var) {
        z zVar = new z();
        zVar.r(c1.F8, c1.f10283g8);
        zVar.r(c1.U7, new u1(str, r0Var, str2));
        zVar.r(new c1("OP"), new f1(0));
        zVar.r(new c1("AN"), x0Var);
        return zVar;
    }

    public z(int i10) {
        c1 c1Var;
        i1 i1Var;
        c1 c1Var2 = c1.F8;
        r(c1Var2, c1.Z5);
        if (i10 == 1) {
            c1Var = c1.S5;
            i1Var = c1.f10278g3;
        } else if (i10 == 2) {
            c1Var = c1.S5;
            i1Var = c1.D7;
        } else if (i10 == 3) {
            c1Var = c1.S5;
            i1Var = c1.f10294h6;
        } else if (i10 == 4) {
            c1Var = c1.S5;
            i1Var = c1.f10306i5;
        } else if (i10 == 5) {
            r(c1Var2, c1.U4);
            c1Var = c1.Y4;
            i1Var = new y1("this.print(true);\r");
        } else {
            throw new RuntimeException(a.b("invalid.named.action", new Object[0]));
        }
        r(c1Var, i1Var);
    }

    z(x0 x0Var) {
        r(c1.F8, c1.S3);
        r(c1.E1, x0Var);
    }

    public z(String str) {
        this(str, false);
    }

    public z(String str, int i10) {
        r(c1.F8, c1.U3);
        r(c1.R2, new y1(str));
        c1 c1Var = c1.E1;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        sb2.append(i10 - 1);
        sb2.append(" /FitH 10000]");
        r(c1Var, new a1(sb2.toString()));
    }

    public z(String str, String str2) {
        r(c1.F8, c1.U3);
        r(c1.R2, new y1(str));
        r(c1.E1, new y1(str2));
    }

    public z(String str, String str2, String str3, String str4) {
        r(c1.F8, c1.f10319j5);
        if (str2 == null && str3 == null && str4 == null) {
            r(c1.R2, new y1(str));
            return;
        }
        l0 l0Var = new l0();
        l0Var.r(c1.R2, new y1(str));
        if (str2 != null) {
            l0Var.r(c1.T6, new y1(str2));
        }
        if (str3 != null) {
            l0Var.r(c1.f10411q6, new y1(str3));
        }
        if (str4 != null) {
            l0Var.r(c1.E1, new y1(str4));
        }
        r(c1.f10351lb, l0Var);
    }

    public z(String str, boolean z10) {
        c1 c1Var = c1.F8;
        c1 c1Var2 = c1.Da;
        r(c1Var, c1Var2);
        r(c1Var2, new y1(str));
        if (z10) {
            r(c1.P4, c0.f10200h);
        }
    }

    public z(URL url) {
        this(url.toExternalForm());
    }
}
