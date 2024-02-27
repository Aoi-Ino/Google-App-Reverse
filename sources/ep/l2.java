package ep;

import gp.f;
import hp.i;
import hp.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp.b;

class l2 implements w0 {

    /* renamed from: e  reason: collision with root package name */
    protected jp.a f23292e = new b();

    /* renamed from: f  reason: collision with root package name */
    protected jp.a f23293f = new b();

    /* renamed from: g  reason: collision with root package name */
    protected List f23294g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    protected List f23295h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    protected List f23296i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    protected StringBuilder f23297j = new StringBuilder();

    /* renamed from: k  reason: collision with root package name */
    protected String f23298k;

    /* renamed from: l  reason: collision with root package name */
    protected String f23299l;

    /* renamed from: m  reason: collision with root package name */
    protected String f23300m;

    /* renamed from: n  reason: collision with root package name */
    protected r0 f23301n;

    /* renamed from: o  reason: collision with root package name */
    protected f f23302o;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f23303p;

    /* renamed from: q  reason: collision with root package name */
    protected char[] f23304q;

    /* renamed from: r  reason: collision with root package name */
    protected int f23305r;

    /* renamed from: s  reason: collision with root package name */
    protected int f23306s;

    /* renamed from: t  reason: collision with root package name */
    protected int f23307t;

    private class a implements w0 {

        /* renamed from: e  reason: collision with root package name */
        private List f23308e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        private String f23309f;

        /* renamed from: g  reason: collision with root package name */
        private String f23310g;

        /* renamed from: h  reason: collision with root package name */
        private int f23311h;

        /* renamed from: i  reason: collision with root package name */
        private int f23312i;

        public a(int i10, int i11) {
            this.f23311h = i10;
            this.f23312i = i11;
        }

        private String l() {
            int i10 = 0;
            int i11 = 0;
            while (i10 < this.f23311h) {
                i11 = l2.this.f23298k.indexOf(47, i11 + 1);
                i10++;
            }
            int i12 = i11;
            while (i10 <= this.f23312i) {
                i12 = l2.this.f23298k.indexOf(47, i12 + 1);
                if (i12 == -1) {
                    i12 = l2.this.f23298k.length();
                }
                i10++;
            }
            return l2.this.f23298k.substring(i11 + 1, i12);
        }

        private String n() {
            int i10 = l2.this.f23306s;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 > this.f23312i) {
                    break;
                }
                l2 l2Var = l2.this;
                if (i10 >= l2Var.f23305r) {
                    i10++;
                    break;
                }
                int i13 = i10 + 1;
                if (l2Var.f23304q[i10] == '/' && (i11 = i11 + 1) == this.f23311h) {
                    i10 = i13;
                    i12 = i10;
                } else {
                    i10 = i13;
                }
            }
            return new String(l2.this.f23304q, i12, (i10 - 1) - i12);
        }

        public boolean C() {
            return this.f23312i - this.f23311h >= 1;
        }

        public w0 R(int i10) {
            return a0(i10, 0);
        }

        public String a(String str) {
            String b10 = b();
            return b10 != null ? l2.this.E(b10, str) : str;
        }

        public w0 a0(int i10, int i11) {
            return new a(this.f23311h + i10, this.f23312i - i11);
        }

        public String b() {
            if (this.f23309f == null) {
                this.f23309f = l();
            }
            return this.f23309f;
        }

        public String e(String str) {
            String b10 = b();
            return b10 != null ? l2.this.F(b10, str) : str;
        }

        public int f() {
            return ((Integer) l2.this.f23294g.get(this.f23311h)).intValue();
        }

        public boolean g() {
            l2 l2Var = l2.this;
            return l2Var.f23303p && this.f23312i >= l2Var.f23296i.size() - 1;
        }

        public String getFirst() {
            return (String) l2.this.f23296i.get(this.f23311h);
        }

        public String getLast() {
            return (String) l2.this.f23296i.get(this.f23312i);
        }

        public String getPrefix() {
            return (String) l2.this.f23295h.get(this.f23311h);
        }

        public boolean isEmpty() {
            return this.f23311h == this.f23312i;
        }

        public Iterator iterator() {
            if (this.f23308e.isEmpty()) {
                for (int i10 = this.f23311h; i10 <= this.f23312i; i10++) {
                    String str = (String) l2.this.f23296i.get(i10);
                    if (str != null) {
                        this.f23308e.add(str);
                    }
                }
            }
            return this.f23308e.iterator();
        }

        public String toString() {
            if (this.f23310g == null) {
                this.f23310g = n();
            }
            return this.f23310g;
        }
    }

    public l2(String str, f fVar, i iVar) {
        this.f23301n = iVar.c();
        this.f23302o = fVar;
        this.f23300m = str;
        i0(str);
    }

    private void B(String str) {
        String str2;
        int indexOf = str.indexOf(58);
        if (indexOf > 0) {
            str2 = str.substring(0, indexOf);
            str = str.substring(indexOf + 1);
        } else {
            str2 = null;
        }
        String e10 = this.f23301n.e(str);
        this.f23295h.add(str2);
        this.f23296i.add(e10);
    }

    private void H() {
        int i10 = 0;
        if (this.f23304q[this.f23307t - 1] == '[') {
            while (true) {
                int i11 = this.f23307t;
                if (i11 >= this.f23305r) {
                    break;
                }
                char[] cArr = this.f23304q;
                this.f23307t = i11 + 1;
                char c10 = cArr[i11];
                if (!T(c10)) {
                    break;
                }
                i10 = ((i10 * 10) + c10) - 48;
            }
        }
        char[] cArr2 = this.f23304q;
        int i12 = this.f23307t;
        this.f23307t = i12 + 1;
        if (cArr2[i12 - 1] == ']') {
            this.f23294g.add(Integer.valueOf(i10));
            return;
        }
        throw new k2("Invalid index for path '%s' in %s", this.f23300m, this.f23302o);
    }

    private boolean T(char c10) {
        return Character.isDigit(c10);
    }

    private boolean Y(String str) {
        return str == null || str.length() == 0;
    }

    private boolean e0(char c10) {
        return Character.isLetterOrDigit(c10);
    }

    private boolean g0(char c10) {
        return c10 == '_' || c10 == '-' || c10 == ':';
    }

    private boolean h0(char c10) {
        return e0(c10) || g0(c10);
    }

    private void i0(String str) {
        if (str != null) {
            int length = str.length();
            this.f23305r = length;
            char[] cArr = new char[length];
            this.f23304q = cArr;
            str.getChars(0, length, cArr, 0);
        }
        j0();
    }

    private void j0() {
        char c10 = this.f23304q[this.f23307t];
        if (c10 != '/') {
            if (c10 == '.') {
                l0();
            }
            while (this.f23307t < this.f23305r) {
                if (!this.f23303p) {
                    k0();
                } else {
                    throw new k2("Path '%s' in %s references an invalid attribute", this.f23300m, this.f23302o);
                }
            }
            m0();
            s();
            return;
        }
        throw new k2("Path '%s' in %s references document root", this.f23300m, this.f23302o);
    }

    private void k0() {
        char c10 = this.f23304q[this.f23307t];
        if (c10 != '/') {
            if (c10 == '@') {
                n();
            } else {
                v();
            }
            l();
            return;
        }
        throw new k2("Invalid path expression '%s' in %s", this.f23300m, this.f23302o);
    }

    private void l() {
        if (this.f23296i.size() > this.f23294g.size()) {
            this.f23294g.add(1);
        }
    }

    private void l0() {
        char[] cArr = this.f23304q;
        if (cArr.length > 1) {
            int i10 = this.f23307t;
            if (cArr[i10 + 1] == '/') {
                this.f23307t = i10 + 1;
            } else {
                throw new k2("Path '%s' in %s has an illegal syntax", this.f23300m, this.f23302o);
            }
        }
        int i11 = this.f23307t + 1;
        this.f23307t = i11;
        this.f23306s = i11;
    }

    private void m0() {
        int i10 = this.f23307t;
        int i11 = i10 - 1;
        char[] cArr = this.f23304q;
        if (i11 >= cArr.length || cArr[i10 - 1] == '/') {
            this.f23307t = i10 - 1;
        }
    }

    private void n() {
        char c10;
        int i10 = this.f23307t + 1;
        this.f23307t = i10;
        do {
            int i11 = this.f23307t;
            if (i11 < this.f23305r) {
                char[] cArr = this.f23304q;
                this.f23307t = i11 + 1;
                c10 = cArr[i11];
            } else if (i11 > i10) {
                this.f23303p = true;
                o(i10, i11 - i10);
                return;
            } else {
                throw new k2("Attribute reference in '%s' for %s is empty", this.f23300m, this.f23302o);
            }
        } while (h0(c10));
        throw new k2("Illegal character '%s' in attribute for '%s' in %s", Character.valueOf(c10), this.f23300m, this.f23302o);
    }

    private void o(int i10, int i11) {
        String str = new String(this.f23304q, i10, i11);
        if (i11 > 0) {
            r(str);
        }
    }

    private void r(String str) {
        String a10 = this.f23301n.a(str);
        this.f23295h.add((Object) null);
        this.f23296i.add(a10);
    }

    private void s() {
        int size = this.f23296i.size();
        int i10 = size - 1;
        for (int i11 = 0; i11 < size; i11++) {
            String str = (String) this.f23295h.get(i11);
            String str2 = (String) this.f23296i.get(i11);
            int intValue = ((Integer) this.f23294g.get(i11)).intValue();
            if (i11 > 0) {
                this.f23297j.append('/');
            }
            if (!this.f23303p || i11 != i10) {
                if (str != null) {
                    this.f23297j.append(str);
                    this.f23297j.append(':');
                }
                this.f23297j.append(str2);
                this.f23297j.append('[');
                this.f23297j.append(intValue);
                this.f23297j.append(']');
            } else {
                this.f23297j.append('@');
                this.f23297j.append(str2);
            }
        }
        this.f23298k = this.f23297j.toString();
    }

    private void v() {
        int i10 = this.f23307t;
        int i11 = 0;
        while (true) {
            int i12 = this.f23307t;
            if (i12 >= this.f23305r) {
                break;
            }
            char[] cArr = this.f23304q;
            this.f23307t = i12 + 1;
            char c10 = cArr[i12];
            if (h0(c10)) {
                i11++;
            } else if (c10 == '@') {
                this.f23307t--;
            } else if (c10 == '[') {
                H();
            } else if (c10 != '/') {
                throw new k2("Illegal character '%s' in element for '%s' in %s", Character.valueOf(c10), this.f23300m, this.f23302o);
            }
        }
        y(i10, i11);
    }

    private void y(int i10, int i11) {
        String str = new String(this.f23304q, i10, i11);
        if (i11 > 0) {
            B(str);
        }
    }

    public boolean C() {
        return this.f23296i.size() > 1;
    }

    /* access modifiers changed from: protected */
    public String E(String str, String str2) {
        String a10 = this.f23301n.a(str2);
        if (Y(str)) {
            return a10;
        }
        return str + "/@" + a10;
    }

    /* access modifiers changed from: protected */
    public String F(String str, String str2) {
        String e10 = this.f23301n.e(str2);
        if (Y(e10)) {
            return str;
        }
        if (Y(str)) {
            return e10;
        }
        return str + "/" + e10 + "[1]";
    }

    public w0 R(int i10) {
        return a0(i10, 0);
    }

    public String a(String str) {
        if (Y(this.f23298k)) {
            return this.f23301n.a(str);
        }
        String str2 = (String) this.f23292e.b(str);
        if (str2 == null && (str2 = E(this.f23298k, str)) != null) {
            this.f23292e.a(str, str2);
        }
        return str2;
    }

    public w0 a0(int i10, int i11) {
        a aVar;
        int size = (this.f23296i.size() - 1) - i11;
        if (size >= i10) {
            return aVar;
        }
        aVar = new a(i10, i10);
        return aVar;
    }

    public String b() {
        return this.f23298k;
    }

    public String e(String str) {
        if (Y(this.f23298k)) {
            return this.f23301n.e(str);
        }
        String str2 = (String) this.f23293f.b(str);
        if (str2 == null && (str2 = F(this.f23298k, str)) != null) {
            this.f23293f.a(str, str2);
        }
        return str2;
    }

    public int f() {
        return ((Integer) this.f23294g.get(0)).intValue();
    }

    public boolean g() {
        return this.f23303p;
    }

    public String getFirst() {
        return (String) this.f23296i.get(0);
    }

    public String getLast() {
        return (String) this.f23296i.get(this.f23296i.size() - 1);
    }

    public String getPrefix() {
        return (String) this.f23295h.get(0);
    }

    public boolean isEmpty() {
        return Y(this.f23298k);
    }

    public Iterator iterator() {
        return this.f23296i.iterator();
    }

    public String toString() {
        int i10 = this.f23307t;
        int i11 = this.f23306s;
        int i12 = i10 - i11;
        if (this.f23299l == null) {
            this.f23299l = new String(this.f23304q, i11, i12);
        }
        return this.f23299l;
    }
}
