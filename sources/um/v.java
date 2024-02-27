package um;

import cm.g;
import cm.l;
import in.e;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import km.f;

public final class v {
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final char[] f32133k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: l  reason: collision with root package name */
    public static final b f32134l = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f32135a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32136b;

    /* renamed from: c  reason: collision with root package name */
    private final String f32137c;

    /* renamed from: d  reason: collision with root package name */
    private final String f32138d;

    /* renamed from: e  reason: collision with root package name */
    private final String f32139e;

    /* renamed from: f  reason: collision with root package name */
    private final int f32140f;

    /* renamed from: g  reason: collision with root package name */
    private final List f32141g;

    /* renamed from: h  reason: collision with root package name */
    private final List f32142h;

    /* renamed from: i  reason: collision with root package name */
    private final String f32143i;

    /* renamed from: j  reason: collision with root package name */
    private final String f32144j;

    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        public static final C0368a f32145i = new C0368a((g) null);

        /* renamed from: a  reason: collision with root package name */
        private String f32146a;

        /* renamed from: b  reason: collision with root package name */
        private String f32147b = "";

        /* renamed from: c  reason: collision with root package name */
        private String f32148c = "";

        /* renamed from: d  reason: collision with root package name */
        private String f32149d;

        /* renamed from: e  reason: collision with root package name */
        private int f32150e = -1;

        /* renamed from: f  reason: collision with root package name */
        private final List f32151f;

        /* renamed from: g  reason: collision with root package name */
        private List f32152g;

        /* renamed from: h  reason: collision with root package name */
        private String f32153h;

        /* renamed from: um.v$a$a  reason: collision with other inner class name */
        public static final class C0368a {
            private C0368a() {
            }

            public /* synthetic */ C0368a(g gVar) {
                this();
            }

            /* access modifiers changed from: private */
            public final int e(String str, int i10, int i11) {
                try {
                    int parseInt = Integer.parseInt(b.b(v.f32134l, str, i10, i11, "", false, false, false, false, (Charset) null, 248, (Object) null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* access modifiers changed from: private */
            public final int f(String str, int i10, int i11) {
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt == ':') {
                        return i10;
                    }
                    if (charAt == '[') {
                        do {
                            i10++;
                            if (i10 >= i11) {
                                break;
                            }
                        } while (str.charAt(i10) == ']');
                    }
                    i10++;
                }
                return i11;
            }

            /* access modifiers changed from: private */
            public final int g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i10);
                if ((l.h(charAt, 97) < 0 || l.h(charAt, 122) > 0) && (l.h(charAt, 65) < 0 || l.h(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i10);
                    if (('a' > charAt2 || 'z' < charAt2) && (('A' > charAt2 || 'Z' < charAt2) && (('0' > charAt2 || '9' < charAt2) && charAt2 != '+' && charAt2 != '-' && charAt2 != '.'))) {
                        if (charAt2 == ':') {
                            return i10;
                        }
                        return -1;
                    }
                }
            }

            /* access modifiers changed from: private */
            public final int h(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i12++;
                    i10++;
                }
                return i12;
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f32151f = arrayList;
            arrayList.add("");
        }

        private final int d() {
            int i10 = this.f32150e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = v.f32134l;
            String str = this.f32146a;
            l.c(str);
            return bVar.c(str);
        }

        private final boolean h(String str) {
            return l.a(str, ".") || p.o(str, "%2e", true);
        }

        private final boolean i(String str) {
            return l.a(str, "..") || p.o(str, "%2e.", true) || p.o(str, ".%2e", true) || p.o(str, "%2e%2e", true);
        }

        private final void l() {
            List list = this.f32151f;
            if (((String) list.remove(list.size() - 1)).length() != 0 || !(!this.f32151f.isEmpty())) {
                this.f32151f.add("");
                return;
            }
            List list2 = this.f32151f;
            list2.set(list2.size() - 1, "");
        }

        private final void n(String str, int i10, int i11, boolean z10, boolean z11) {
            String b10 = b.b(v.f32134l, str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, (Charset) null, 240, (Object) null);
            if (!h(b10)) {
                if (i(b10)) {
                    l();
                    return;
                }
                List list = this.f32151f;
                if (((CharSequence) list.get(list.size() - 1)).length() == 0) {
                    List list2 = this.f32151f;
                    list2.set(list2.size() - 1, b10);
                } else {
                    this.f32151f.add(b10);
                }
                if (z10) {
                    this.f32151f.add("");
                }
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        private final void p(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List r0 = r10.f32151f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List r0 = r10.f32151f
                r0.clear()
                java.util.List r0 = r10.f32151f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = vm.b.n(r11, r12, r6, r13)
                if (r12 >= r13) goto L_0x0036
                r0 = r3
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.n(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: um.v.a.p(java.lang.String, int, int):void");
        }

        public final a a(String str, String str2) {
            l.f(str, "encodedName");
            if (this.f32152g == null) {
                this.f32152g = new ArrayList();
            }
            List list = this.f32152g;
            l.c(list);
            b bVar = v.f32134l;
            list.add(b.b(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211, (Object) null));
            List list2 = this.f32152g;
            l.c(list2);
            list2.add(str2 != null ? b.b(bVar, str2, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211, (Object) null) : null);
            return this;
        }

        public final a b(String str, String str2) {
            l.f(str, "name");
            if (this.f32152g == null) {
                this.f32152g = new ArrayList();
            }
            List list = this.f32152g;
            l.c(list);
            b bVar = v.f32134l;
            list.add(b.b(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219, (Object) null));
            List list2 = this.f32152g;
            l.c(list2);
            list2.add(str2 != null ? b.b(bVar, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219, (Object) null) : null);
            return this;
        }

        public final v c() {
            ArrayList arrayList;
            String str = this.f32146a;
            if (str != null) {
                b bVar = v.f32134l;
                String g10 = b.g(bVar, this.f32147b, 0, 0, false, 7, (Object) null);
                String g11 = b.g(bVar, this.f32148c, 0, 0, false, 7, (Object) null);
                String str2 = this.f32149d;
                if (str2 != null) {
                    int d10 = d();
                    Iterable<String> iterable = this.f32151f;
                    ArrayList arrayList2 = new ArrayList(r.s(iterable, 10));
                    for (String g12 : iterable) {
                        arrayList2.add(b.g(v.f32134l, g12, 0, 0, false, 7, (Object) null));
                    }
                    List list = this.f32152g;
                    if (list != null) {
                        Iterable<String> iterable2 = list;
                        arrayList = new ArrayList(r.s(iterable2, 10));
                        for (String str3 : iterable2) {
                            arrayList.add(str3 != null ? b.g(v.f32134l, str3, 0, 0, true, 3, (Object) null) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str4 = this.f32153h;
                    return new v(str, g10, g11, str2, d10, arrayList2, arrayList, str4 != null ? b.g(v.f32134l, str4, 0, 0, false, 7, (Object) null) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final a e(String str) {
            List list;
            if (str != null) {
                b bVar = v.f32134l;
                String b10 = b.b(bVar, str, 0, 0, " \"'<>#", true, false, true, false, (Charset) null, 211, (Object) null);
                if (b10 != null) {
                    list = bVar.i(b10);
                    this.f32152g = list;
                    return this;
                }
            }
            list = null;
            this.f32152g = list;
            return this;
        }

        public final List f() {
            return this.f32151f;
        }

        public final a g(String str) {
            l.f(str, "host");
            String e10 = vm.a.e(b.g(v.f32134l, str, 0, 0, false, 7, (Object) null));
            if (e10 != null) {
                this.f32149d = e10;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public final a j(v vVar, String str) {
            int i10;
            int n10;
            int i11;
            String str2;
            int i12;
            boolean z10;
            String str3;
            int i13;
            boolean z11;
            boolean z12;
            String str4 = str;
            l.f(str4, "input");
            int x10 = vm.b.x(str4, 0, 0, 3, (Object) null);
            int z13 = vm.b.z(str4, x10, 0, 2, (Object) null);
            C0368a aVar = f32145i;
            int c10 = aVar.g(str4, x10, z13);
            String str5 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            boolean z14 = true;
            char c11 = 65535;
            if (c10 != -1) {
                if (p.x(str4, "https:", x10, true)) {
                    this.f32146a = "https";
                    x10 += 6;
                } else if (p.x(str4, "http:", x10, true)) {
                    this.f32146a = "http";
                    x10 += 5;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str4.substring(0, c10);
                    l.e(substring, str5);
                    sb2.append(substring);
                    sb2.append("'");
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else if (vVar != null) {
                this.f32146a = vVar.r();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int d10 = aVar.h(str4, x10, z13);
            char c12 = '?';
            char c13 = '#';
            if (d10 >= 2 || vVar == null || (!l.a(vVar.r(), this.f32146a))) {
                int i14 = x10 + d10;
                boolean z15 = false;
                boolean z16 = false;
                while (true) {
                    n10 = vm.b.n(str4, "@/\\?#", i14, z13);
                    char charAt = n10 != z13 ? str4.charAt(n10) : c11;
                    if (charAt == c11 || charAt == c13 || charAt == '/' || charAt == '\\' || charAt == c12) {
                        boolean z17 = z14;
                        String str6 = str5;
                        i10 = z13;
                        int i15 = n10;
                        C0368a aVar2 = f32145i;
                        int b10 = aVar2.f(str4, i14, i15);
                        int i16 = b10 + 1;
                    } else {
                        if (charAt != '@') {
                            z10 = z14;
                            str3 = str5;
                            i12 = z13;
                        } else {
                            if (!z15) {
                                int m10 = vm.b.m(str4, ':', i14, n10);
                                b bVar = v.f32134l;
                                String str7 = "%40";
                                int i17 = n10;
                                int i18 = m10;
                                z10 = z14;
                                i12 = z13;
                                String str8 = str5;
                                String b11 = b.b(bVar, str, i14, m10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                if (z16) {
                                    b11 = this.f32147b + str7 + b11;
                                }
                                this.f32147b = b11;
                                int i19 = i17;
                                int i20 = i18;
                                if (i20 != i19) {
                                    this.f32148c = b.b(bVar, str, i20 + 1, i19, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                    z12 = z10;
                                } else {
                                    z12 = z15;
                                }
                                z15 = z12;
                                str3 = str8;
                                z11 = z10;
                                i13 = i19;
                            } else {
                                z10 = z14;
                                i12 = z13;
                                String str9 = str5;
                                int i21 = n10;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(this.f32148c);
                                sb3.append("%40");
                                StringBuilder sb4 = sb3;
                                str3 = str9;
                                i13 = i21;
                                sb4.append(b.b(v.f32134l, str, i14, i21, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null));
                                this.f32148c = sb4.toString();
                                z11 = z16;
                            }
                            i14 = i13 + 1;
                            z16 = z11;
                        }
                        str5 = str3;
                        z14 = z10;
                        z13 = i12;
                        c13 = '#';
                        c12 = '?';
                        c11 = 65535;
                    }
                }
                boolean z172 = z14;
                String str62 = str5;
                i10 = z13;
                int i152 = n10;
                C0368a aVar22 = f32145i;
                int b102 = aVar22.f(str4, i14, i152);
                int i162 = b102 + 1;
                if (i162 < i152) {
                    i11 = i14;
                    this.f32149d = vm.a.e(b.g(v.f32134l, str, i14, b102, false, 4, (Object) null));
                    int a10 = aVar22.e(str4, i162, i152);
                    this.f32150e = a10;
                    if (a10 != -1 ? z172 : false) {
                        str2 = str62;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Invalid URL port: \"");
                        String substring2 = str4.substring(i162, i152);
                        l.e(substring2, str62);
                        sb5.append(substring2);
                        sb5.append('\"');
                        throw new IllegalArgumentException(sb5.toString().toString());
                    }
                } else {
                    i11 = i14;
                    str2 = str62;
                    b bVar2 = v.f32134l;
                    this.f32149d = vm.a.e(b.g(bVar2, str, i11, b102, false, 4, (Object) null));
                    String str10 = this.f32146a;
                    l.c(str10);
                    this.f32150e = bVar2.c(str10);
                }
                if (this.f32149d != null ? z172 : false) {
                    x10 = i152;
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Invalid URL host: \"");
                    String substring3 = str4.substring(i11, b102);
                    l.e(substring3, str2);
                    sb6.append(substring3);
                    sb6.append('\"');
                    throw new IllegalArgumentException(sb6.toString().toString());
                }
            } else {
                this.f32147b = vVar.g();
                this.f32148c = vVar.c();
                this.f32149d = vVar.i();
                this.f32150e = vVar.n();
                this.f32151f.clear();
                this.f32151f.addAll(vVar.e());
                if (x10 == z13 || str4.charAt(x10) == '#') {
                    e(vVar.f());
                }
                i10 = z13;
            }
            int i22 = i10;
            int n11 = vm.b.n(str4, "?#", x10, i22);
            p(str4, x10, n11);
            if (n11 < i22 && str4.charAt(n11) == '?') {
                int m11 = vm.b.m(str4, '#', n11, i22);
                b bVar3 = v.f32134l;
                this.f32152g = bVar3.i(b.b(bVar3, str, n11 + 1, m11, " \"'<>#", true, false, true, false, (Charset) null, 208, (Object) null));
                n11 = m11;
            }
            if (n11 < i22 && str4.charAt(n11) == '#') {
                this.f32153h = b.b(v.f32134l, str, n11 + 1, i22, "", true, false, false, true, (Charset) null, 176, (Object) null);
            }
            return this;
        }

        public final a k(String str) {
            l.f(str, "password");
            this.f32148c = b.b(v.f32134l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return this;
        }

        public final a m(int i10) {
            boolean z10 = true;
            if (1 > i10 || 65535 < i10) {
                z10 = false;
            }
            if (z10) {
                this.f32150e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        public final a o() {
            String str = this.f32149d;
            String str2 = null;
            this.f32149d = str != null ? new f("[\"<>^`{|}]").b(str, "") : null;
            int size = this.f32151f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list = this.f32151f;
                list.set(i10, b.b(v.f32134l, (String) list.get(i10), 0, 0, "[]", true, true, false, false, (Charset) null, 227, (Object) null));
            }
            List list2 = this.f32152g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str3 = (String) list2.get(i11);
                    list2.set(i11, str3 != null ? b.b(v.f32134l, str3, 0, 0, "\\^`{|}", true, true, true, false, (Charset) null, 195, (Object) null) : null);
                }
            }
            String str4 = this.f32153h;
            if (str4 != null) {
                str2 = b.b(v.f32134l, str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, (Charset) null, 163, (Object) null);
            }
            this.f32153h = str2;
            return this;
        }

        public final a q(String str) {
            l.f(str, "scheme");
            String str2 = "http";
            if (!p.o(str, str2, true)) {
                str2 = "https";
                if (!p.o(str, str2, true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
            }
            this.f32146a = str2;
            return this;
        }

        public final void r(String str) {
            this.f32153h = str;
        }

        public final void s(String str) {
            l.f(str, "<set-?>");
            this.f32148c = str;
        }

        public final void t(String str) {
            l.f(str, "<set-?>");
            this.f32147b = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
            if (r1 != r4.c(r3)) goto L_0x0083;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f32146a
                if (r1 == 0) goto L_0x0012
                r0.append(r1)
                java.lang.String r1 = "://"
            L_0x000e:
                r0.append(r1)
                goto L_0x0015
            L_0x0012:
                java.lang.String r1 = "//"
                goto L_0x000e
            L_0x0015:
                java.lang.String r1 = r6.f32147b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L_0x0020
                goto L_0x0028
            L_0x0020:
                java.lang.String r1 = r6.f32148c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0042
            L_0x0028:
                java.lang.String r1 = r6.f32147b
                r0.append(r1)
                java.lang.String r1 = r6.f32148c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x003d
                r0.append(r2)
                java.lang.String r1 = r6.f32148c
                r0.append(r1)
            L_0x003d:
                r1 = 64
                r0.append(r1)
            L_0x0042:
                java.lang.String r1 = r6.f32149d
                if (r1 == 0) goto L_0x0067
                cm.l.c(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = km.q.E(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L_0x0062
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f32149d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0067
            L_0x0062:
                java.lang.String r1 = r6.f32149d
                r0.append(r1)
            L_0x0067:
                int r1 = r6.f32150e
                r3 = -1
                if (r1 != r3) goto L_0x0070
                java.lang.String r1 = r6.f32146a
                if (r1 == 0) goto L_0x0089
            L_0x0070:
                int r1 = r6.d()
                java.lang.String r3 = r6.f32146a
                if (r3 == 0) goto L_0x0083
                um.v$b r4 = um.v.f32134l
                cm.l.c(r3)
                int r3 = r4.c(r3)
                if (r1 == r3) goto L_0x0089
            L_0x0083:
                r0.append(r2)
                r0.append(r1)
            L_0x0089:
                um.v$b r1 = um.v.f32134l
                java.util.List r2 = r6.f32151f
                r1.h(r2, r0)
                java.util.List r2 = r6.f32152g
                if (r2 == 0) goto L_0x00a1
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.f32152g
                cm.l.c(r2)
                r1.j(r2, r0)
            L_0x00a1:
                java.lang.String r1 = r6.f32153h
                if (r1 == 0) goto L_0x00af
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f32153h
                r0.append(r1)
            L_0x00af:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                cm.l.e(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: um.v.a.toString():java.lang.String");
        }

        public final void u(String str) {
            this.f32149d = str;
        }

        public final void v(int i10) {
            this.f32150e = i10;
        }

        public final void w(String str) {
            this.f32146a = str;
        }

        public final a x(String str) {
            l.f(str, "username");
            this.f32147b = b.b(v.f32134l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public static /* synthetic */ String b(b bVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            int i13 = i12;
            return bVar.a(str, (i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? str.length() : i11, str2, (i13 & 8) != 0 ? false : z10, (i13 & 16) != 0 ? false : z11, (i13 & 32) != 0 ? false : z12, (i13 & 64) != 0 ? false : z13, (i13 & 128) != 0 ? null : charset);
        }

        private final boolean e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && vm.b.E(str.charAt(i10 + 1)) != -1 && vm.b.E(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String g(b bVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return bVar.f(str, i10, i11, z10);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
            if (e(r1, r5, r2) == false) goto L_0x0072;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void k(in.e r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            L_0x000b:
                if (r5 >= r2) goto L_0x00c8
                if (r1 == 0) goto L_0x00bf
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L_0x002b
                r8 = 9
                if (r7 == r8) goto L_0x0026
                r8 = 10
                if (r7 == r8) goto L_0x0026
                r8 = 12
                if (r7 == r8) goto L_0x0026
                r8 = 13
                if (r7 == r8) goto L_0x0026
                goto L_0x002b
            L_0x0026:
                r8 = r14
                r12 = r19
                goto L_0x00b8
            L_0x002b:
                r8 = 43
                if (r7 != r8) goto L_0x003c
                if (r22 == 0) goto L_0x003c
                if (r20 == 0) goto L_0x0036
                java.lang.String r8 = "+"
                goto L_0x0038
            L_0x0036:
                java.lang.String r8 = "%2B"
            L_0x0038:
                r15.r0(r8)
                goto L_0x0026
            L_0x003c:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L_0x004d
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L_0x004d
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L_0x0051
                if (r23 == 0) goto L_0x004d
                goto L_0x0051
            L_0x004d:
                r8 = r14
                r12 = r19
                goto L_0x0072
            L_0x0051:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = km.q.E(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L_0x006c
                if (r7 != r9) goto L_0x006a
                if (r20 == 0) goto L_0x006c
                if (r21 == 0) goto L_0x006a
                r8 = r14
                boolean r10 = r14.e(r1, r5, r2)
                if (r10 != 0) goto L_0x006e
                goto L_0x0072
            L_0x006a:
                r8 = r14
                goto L_0x006e
            L_0x006c:
                r8 = r14
                goto L_0x0072
            L_0x006e:
                r15.X0(r7)
                goto L_0x00b8
            L_0x0072:
                if (r6 != 0) goto L_0x0079
                in.e r6 = new in.e
                r6.<init>()
            L_0x0079:
                if (r3 == 0) goto L_0x008d
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = cm.l.a(r3, r10)
                if (r10 == 0) goto L_0x0084
                goto L_0x008d
            L_0x0084:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.T0(r1, r5, r10, r3)
                goto L_0x0090
            L_0x008d:
                r6.X0(r7)
            L_0x0090:
                boolean r10 = r6.P()
                if (r10 != 0) goto L_0x00b8
                byte r10 = r6.readByte()
                r11 = r10 & 255(0xff, float:3.57E-43)
                r15.Q(r9)
                char[] r13 = um.v.f32133k
                int r11 = r11 >> 4
                r11 = r11 & 15
                char r11 = r13[r11]
                r15.Q(r11)
                char[] r11 = um.v.f32133k
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.Q(r10)
                goto L_0x0090
            L_0x00b8:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto L_0x000b
            L_0x00bf:
                r8 = r14
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            L_0x00c8:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: um.v.b.k(in.e, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void l(e eVar, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                if (str != null) {
                    int codePointAt = str.codePointAt(i10);
                    if (codePointAt == 37 && (i12 = i10 + 2) < i11) {
                        int E = vm.b.E(str.charAt(i10 + 1));
                        int E2 = vm.b.E(str.charAt(i12));
                        if (!(E == -1 || E2 == -1)) {
                            eVar.Q((E << 4) + E2);
                            i10 = Character.charCount(codePointAt) + i12;
                        }
                    } else if (codePointAt == 43 && z10) {
                        eVar.Q(32);
                        i10++;
                    }
                    eVar.X0(codePointAt);
                    i10 += Character.charCount(codePointAt);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }

        public final String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            String str3 = str;
            int i12 = i11;
            String str4 = str2;
            l.f(str, "$this$canonicalize");
            l.f(str4, "encodeSet");
            int i13 = i10;
            while (i13 < i12) {
                int codePointAt = str.codePointAt(i13);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z13) && !q.E(str4, (char) codePointAt, false, 2, (Object) null))) {
                    if (codePointAt == 37) {
                        if (z10) {
                            if (z11) {
                                if (!e(str, i13, i12)) {
                                    e eVar = new e();
                                    int i14 = i10;
                                    eVar.W0(str, i10, i13);
                                    k(eVar, str, i13, i11, str2, z10, z11, z12, z13, charset);
                                    return eVar.D0();
                                }
                                if (codePointAt == 43 || !z12) {
                                    i13 += Character.charCount(codePointAt);
                                } else {
                                    e eVar2 = new e();
                                    int i142 = i10;
                                    eVar2.W0(str, i10, i13);
                                    k(eVar2, str, i13, i11, str2, z10, z11, z12, z13, charset);
                                    return eVar2.D0();
                                }
                            }
                        }
                    }
                    if (codePointAt == 43) {
                    }
                    i13 += Character.charCount(codePointAt);
                }
                e eVar22 = new e();
                int i1422 = i10;
                eVar22.W0(str, i10, i13);
                k(eVar22, str, i13, i11, str2, z10, z11, z12, z13, charset);
                return eVar22.D0();
            }
            int i15 = i10;
            String substring = str.substring(i10, i11);
            l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final int c(String str) {
            l.f(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final v d(String str) {
            l.f(str, "$this$toHttpUrl");
            return new a().j((v) null, str).c();
        }

        public final String f(String str, int i10, int i11, boolean z10) {
            l.f(str, "$this$percentDecode");
            for (int i12 = i10; i12 < i11; i12++) {
                char charAt = str.charAt(i12);
                if (charAt == '%' || (charAt == '+' && z10)) {
                    e eVar = new e();
                    eVar.W0(str, i10, i12);
                    l(eVar, str, i12, i11, z10);
                    return eVar.D0();
                }
            }
            String substring = str.substring(i10, i11);
            l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final void h(List list, StringBuilder sb2) {
            l.f(list, "$this$toPathString");
            l.f(sb2, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append((String) list.get(i10));
            }
        }

        public final List i(String str) {
            String str2;
            l.f(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int P = q.P(str, '&', i10, false, 4, (Object) null);
                if (P == -1) {
                    P = str.length();
                }
                int i11 = P;
                int P2 = q.P(str, '=', i10, false, 4, (Object) null);
                if (P2 == -1 || P2 > i11) {
                    String substring = str.substring(i10, i11);
                    l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    str2 = null;
                } else {
                    String substring2 = str.substring(i10, P2);
                    l.e(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    str2 = str.substring(P2 + 1, i11);
                    l.e(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(str2);
                i10 = i11 + 1;
            }
            return arrayList;
        }

        public final void j(List list, StringBuilder sb2) {
            l.f(list, "$this$toQueryString");
            l.f(sb2, "out");
            hm.a h10 = f.h(f.i(0, list.size()), 2);
            int l10 = h10.l();
            int n10 = h10.n();
            int o10 = h10.o();
            if (o10 >= 0) {
                if (l10 > n10) {
                    return;
                }
            } else if (l10 < n10) {
                return;
            }
            while (true) {
                String str = (String) list.get(l10);
                String str2 = (String) list.get(l10 + 1);
                if (l10 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (l10 != n10) {
                    l10 += o10;
                } else {
                    return;
                }
            }
        }
    }

    public v(String str, String str2, String str3, String str4, int i10, List list, List list2, String str5, String str6) {
        l.f(str, "scheme");
        l.f(str2, "username");
        l.f(str3, "password");
        l.f(str4, "host");
        l.f(list, "pathSegments");
        l.f(str6, "url");
        this.f32136b = str;
        this.f32137c = str2;
        this.f32138d = str3;
        this.f32139e = str4;
        this.f32140f = i10;
        this.f32141g = list;
        this.f32142h = list2;
        this.f32143i = str5;
        this.f32144j = str6;
        this.f32135a = l.a(str, "https");
    }

    public static final v h(String str) {
        return f32134l.d(str);
    }

    public final String b() {
        if (this.f32143i == null) {
            return null;
        }
        int P = q.P(this.f32144j, '#', 0, false, 6, (Object) null) + 1;
        String str = this.f32144j;
        if (str != null) {
            String substring = str.substring(P);
            l.e(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final String c() {
        if (this.f32138d.length() == 0) {
            return "";
        }
        int P = q.P(this.f32144j, ':', this.f32136b.length() + 3, false, 4, (Object) null) + 1;
        int P2 = q.P(this.f32144j, '@', 0, false, 6, (Object) null);
        String str = this.f32144j;
        if (str != null) {
            String substring = str.substring(P, P2);
            l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final String d() {
        int P = q.P(this.f32144j, '/', this.f32136b.length() + 3, false, 4, (Object) null);
        String str = this.f32144j;
        int n10 = vm.b.n(str, "?#", P, str.length());
        String str2 = this.f32144j;
        if (str2 != null) {
            String substring = str2.substring(P, n10);
            l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final List e() {
        int P = q.P(this.f32144j, '/', this.f32136b.length() + 3, false, 4, (Object) null);
        String str = this.f32144j;
        int n10 = vm.b.n(str, "?#", P, str.length());
        ArrayList arrayList = new ArrayList();
        while (P < n10) {
            int i10 = P + 1;
            int m10 = vm.b.m(this.f32144j, '/', i10, n10);
            String str2 = this.f32144j;
            if (str2 != null) {
                String substring = str2.substring(i10, m10);
                l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring);
                P = m10;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof v) && l.a(((v) obj).f32144j, this.f32144j);
    }

    public final String f() {
        if (this.f32142h == null) {
            return null;
        }
        int P = q.P(this.f32144j, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f32144j;
        int m10 = vm.b.m(str, '#', P, str.length());
        String str2 = this.f32144j;
        if (str2 != null) {
            String substring = str2.substring(P, m10);
            l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final String g() {
        if (this.f32137c.length() == 0) {
            return "";
        }
        int length = this.f32136b.length() + 3;
        String str = this.f32144j;
        int n10 = vm.b.n(str, ":@", length, str.length());
        String str2 = this.f32144j;
        if (str2 != null) {
            String substring = str2.substring(length, n10);
            l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public int hashCode() {
        return this.f32144j.hashCode();
    }

    public final String i() {
        return this.f32139e;
    }

    public final boolean j() {
        return this.f32135a;
    }

    public final a k() {
        a aVar = new a();
        aVar.w(this.f32136b);
        aVar.t(g());
        aVar.s(c());
        aVar.u(this.f32139e);
        aVar.v(this.f32140f != f32134l.c(this.f32136b) ? this.f32140f : -1);
        aVar.f().clear();
        aVar.f().addAll(e());
        aVar.e(f());
        aVar.r(b());
        return aVar;
    }

    public final a l(String str) {
        l.f(str, "link");
        try {
            return new a().j(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final List m() {
        return this.f32141g;
    }

    public final int n() {
        return this.f32140f;
    }

    public final String o() {
        if (this.f32142h == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f32134l.j(this.f32142h, sb2);
        return sb2.toString();
    }

    public final String p() {
        a l10 = l("/...");
        l.c(l10);
        return l10.x("").k("").c().toString();
    }

    public final v q(String str) {
        l.f(str, "link");
        a l10 = l(str);
        if (l10 != null) {
            return l10.c();
        }
        return null;
    }

    public final String r() {
        return this.f32136b;
    }

    public final URI s() {
        String aVar = k().o().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e10) {
            try {
                URI create = URI.create(new f("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(aVar, ""));
                l.e(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL t() {
        try {
            return new URL(this.f32144j);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f32144j;
    }
}
