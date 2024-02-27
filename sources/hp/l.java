package hp;

class l {

    /* renamed from: a  reason: collision with root package name */
    private a f24274a;

    /* renamed from: b  reason: collision with root package name */
    private int f24275b;

    /* renamed from: c  reason: collision with root package name */
    private int f24276c;

    /* renamed from: d  reason: collision with root package name */
    private int f24277d;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private String[] f24278a;

        /* renamed from: b  reason: collision with root package name */
        private int f24279b;

        public a(int i10) {
            this.f24278a = new String[i10];
        }

        private void b(int i10) {
            String[] strArr = new String[i10];
            int i11 = 0;
            while (true) {
                String[] strArr2 = this.f24278a;
                if (i11 < strArr2.length) {
                    strArr[i11] = strArr2[i11];
                    i11++;
                } else {
                    this.f24278a = strArr;
                    return;
                }
            }
        }

        public String a(int i10) {
            String[] strArr = this.f24278a;
            if (i10 < strArr.length) {
                return strArr[i10];
            }
            return null;
        }

        public void c(int i10, String str) {
            if (i10 >= this.f24278a.length) {
                b(i10 * 2);
            }
            if (i10 > this.f24279b) {
                this.f24279b = i10;
            }
            this.f24278a[i10] = str;
        }

        public int d() {
            return this.f24279b;
        }
    }

    public l(i iVar) {
        this(iVar, 16);
    }

    private String a() {
        int i10 = this.f24276c;
        char[] cArr = new char[(i10 + 1)];
        if (i10 <= 0) {
            return "\n";
        }
        cArr[0] = 10;
        for (int i11 = 1; i11 <= this.f24276c; i11++) {
            cArr[i11] = ' ';
        }
        return new String(cArr);
    }

    private String b(int i10) {
        if (this.f24275b <= 0) {
            return "";
        }
        String a10 = this.f24274a.a(i10);
        if (a10 == null) {
            a10 = a();
            this.f24274a.c(i10, a10);
        }
        return this.f24274a.d() > 0 ? a10 : "";
    }

    public String c() {
        int i10 = this.f24277d - 1;
        this.f24277d = i10;
        String b10 = b(i10);
        int i11 = this.f24275b;
        if (i11 > 0) {
            this.f24276c -= i11;
        }
        return b10;
    }

    public String d() {
        int i10 = this.f24277d;
        this.f24277d = i10 + 1;
        String b10 = b(i10);
        int i11 = this.f24275b;
        if (i11 > 0) {
            this.f24276c += i11;
        }
        return b10;
    }

    public String e() {
        return b(this.f24277d);
    }

    private l(i iVar, int i10) {
        this.f24275b = iVar.a();
        this.f24274a = new a(i10);
    }
}
