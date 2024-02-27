package hp;

import java.io.BufferedWriter;
import java.io.Writer;

class j {

    /* renamed from: f  reason: collision with root package name */
    private static final char[] f24255f = {'x', 'm', 'l', 'n', 's'};

    /* renamed from: g  reason: collision with root package name */
    private static final char[] f24256g = {'&', 'l', 't', ';'};

    /* renamed from: h  reason: collision with root package name */
    private static final char[] f24257h = {'&', 'g', 't', ';'};

    /* renamed from: i  reason: collision with root package name */
    private static final char[] f24258i = {'&', 'q', 'u', 'o', 't', ';'};

    /* renamed from: j  reason: collision with root package name */
    private static final char[] f24259j = {'&', 'a', 'p', 'o', 's', ';'};

    /* renamed from: k  reason: collision with root package name */
    private static final char[] f24260k = {'&', 'a', 'm', 'p', ';'};

    /* renamed from: l  reason: collision with root package name */
    private static final char[] f24261l = {'<', '!', '-', '-', ' '};

    /* renamed from: m  reason: collision with root package name */
    private static final char[] f24262m = {' ', '-', '-', '>'};

    /* renamed from: a  reason: collision with root package name */
    private d0 f24263a = new d0();

    /* renamed from: b  reason: collision with root package name */
    private l f24264b;

    /* renamed from: c  reason: collision with root package name */
    private Writer f24265c;

    /* renamed from: d  reason: collision with root package name */
    private String f24266d;

    /* renamed from: e  reason: collision with root package name */
    private a f24267e;

    private enum a {
        COMMENT,
        START,
        TEXT,
        END
    }

    public j(Writer writer, i iVar) {
        this.f24265c = new BufferedWriter(writer, 1024);
        this.f24264b = new l(iVar);
        this.f24266d = iVar.b();
    }

    private void a(char c10) {
        this.f24263a.a(c10);
    }

    private void b(String str) {
        this.f24263a.b(str);
    }

    private void c(char[] cArr) {
        this.f24263a.c(cArr);
    }

    private void d(String str) {
        k("<![CDATA[");
        k(str);
        k("]]>");
    }

    private void e(char c10) {
        char[] i10 = i(c10);
        if (i10 != null) {
            m(i10);
        } else {
            j(c10);
        }
    }

    private void f(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            e(str.charAt(i10));
        }
    }

    private boolean h(String str) {
        return str == null || str.length() == 0;
    }

    private char[] i(char c10) {
        if (c10 == '\"') {
            return f24258i;
        }
        if (c10 == '<') {
            return f24256g;
        }
        if (c10 == '>') {
            return f24257h;
        }
        if (c10 == '&') {
            return f24260k;
        }
        if (c10 != '\'') {
            return null;
        }
        return f24259j;
    }

    private void j(char c10) {
        this.f24263a.e(this.f24265c);
        this.f24263a.d();
        this.f24265c.write(c10);
    }

    private void k(String str) {
        this.f24263a.e(this.f24265c);
        this.f24263a.d();
        this.f24265c.write(str);
    }

    private void l(String str, String str2) {
        this.f24263a.e(this.f24265c);
        this.f24263a.d();
        if (!h(str2)) {
            this.f24265c.write(str2);
            this.f24265c.write(58);
        }
        this.f24265c.write(str);
    }

    private void m(char[] cArr) {
        this.f24263a.e(this.f24265c);
        this.f24263a.d();
        this.f24265c.write(cArr);
    }

    public void g() {
        this.f24263a.e(this.f24265c);
        this.f24263a.d();
        this.f24265c.flush();
    }

    public void n(String str, String str2, String str3) {
        if (this.f24267e == a.START) {
            j(' ');
            l(str, str3);
            j('=');
            j('\"');
            f(str2);
            j('\"');
            return;
        }
        throw new w("Start element required");
    }

    public void o(String str) {
        String e10 = this.f24264b.e();
        if (this.f24267e == a.START) {
            a('>');
        }
        if (e10 != null) {
            b(e10);
            c(f24261l);
            b(str);
            c(f24262m);
        }
        this.f24267e = a.COMMENT;
    }

    public void p(String str, String str2) {
        String c10 = this.f24264b.c();
        a aVar = this.f24267e;
        a aVar2 = a.START;
        if (aVar == aVar2) {
            j('/');
        } else {
            if (aVar != a.TEXT) {
                k(c10);
            }
            if (this.f24267e != aVar2) {
                j('<');
                j('/');
                l(str, str2);
            }
            this.f24267e = a.END;
        }
        j('>');
        this.f24267e = a.END;
    }

    public void q(String str, String str2) {
        if (this.f24267e == a.START) {
            j(' ');
            m(f24255f);
            if (!h(str2)) {
                j(':');
                k(str2);
            }
            j('=');
            j('\"');
            f(str);
            j('\"');
            return;
        }
        throw new w("Start element required");
    }

    public void r() {
        String str = this.f24266d;
        if (str != null) {
            k(str);
            k("\n");
        }
    }

    public void s(String str, String str2) {
        String d10 = this.f24264b.d();
        a aVar = this.f24267e;
        a aVar2 = a.START;
        if (aVar == aVar2) {
            a('>');
        }
        g();
        b(d10);
        a('<');
        if (!h(str2)) {
            b(str2);
            a(':');
        }
        b(str);
        this.f24267e = aVar2;
    }

    public void t(String str, s sVar) {
        if (this.f24267e == a.START) {
            j('>');
        }
        if (sVar == s.DATA) {
            d(str);
        } else {
            f(str);
        }
        this.f24267e = a.TEXT;
    }
}
