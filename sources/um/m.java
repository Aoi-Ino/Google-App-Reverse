package um;

import an.c;
import cm.g;
import cm.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import km.f;
import vm.b;

public final class m {
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f32088j = Pattern.compile("(\\d{2,4})[^\\d]*");
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f32089k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f32090l = Pattern.compile("(\\d{1,2})[^\\d]*");
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f32091m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: n  reason: collision with root package name */
    public static final a f32092n = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f32093a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32094b;

    /* renamed from: c  reason: collision with root package name */
    private final long f32095c;

    /* renamed from: d  reason: collision with root package name */
    private final String f32096d;

    /* renamed from: e  reason: collision with root package name */
    private final String f32097e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f32098f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f32099g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f32100h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f32101i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final int a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (((charAt < ' ' && charAt != 9) || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        private final boolean b(String str, String str2) {
            if (l.a(str, str2)) {
                return true;
            }
            return p.n(str, str2, false, 2, (Object) null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !b.f(str);
        }

        private final String f(String str) {
            if (!p.n(str, ".", false, 2, (Object) null)) {
                String e10 = vm.a.e(q.e0(str, "."));
                if (e10 != null) {
                    return e10;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long g(String str, int i10, int i11) {
            String str2 = str;
            int i12 = i11;
            int a10 = a(str2, i10, i12, false);
            Matcher matcher = m.f32091m.matcher(str2);
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            while (a10 < i12) {
                int a11 = a(str2, a10 + 1, i12, true);
                matcher.region(a10, a11);
                if (i14 == -1 && matcher.usePattern(m.f32091m).matches()) {
                    String group = matcher.group(1);
                    l.e(group, "matcher.group(1)");
                    i14 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    l.e(group2, "matcher.group(2)");
                    i17 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    l.e(group3, "matcher.group(3)");
                    i18 = Integer.parseInt(group3);
                } else if (i15 == -1 && matcher.usePattern(m.f32090l).matches()) {
                    String group4 = matcher.group(1);
                    l.e(group4, "matcher.group(1)");
                    i15 = Integer.parseInt(group4);
                } else if (i16 == -1 && matcher.usePattern(m.f32089k).matches()) {
                    String group5 = matcher.group(1);
                    l.e(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    l.e(locale, "Locale.US");
                    if (group5 != null) {
                        String lowerCase = group5.toLowerCase(locale);
                        l.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        String pattern = m.f32089k.pattern();
                        l.e(pattern, "MONTH_PATTERN.pattern()");
                        i16 = q.Q(pattern, lowerCase, 0, false, 6, (Object) null) / 4;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                } else if (i13 == -1 && matcher.usePattern(m.f32088j).matches()) {
                    String group6 = matcher.group(1);
                    l.e(group6, "matcher.group(1)");
                    i13 = Integer.parseInt(group6);
                }
                a10 = a(str2, a11 + 1, i12, false);
            }
            if (70 <= i13 && 99 >= i13) {
                i13 += 1900;
            }
            if (i13 >= 0 && 69 >= i13) {
                i13 += 2000;
            }
            if (i13 >= 1601) {
                if (i16 != -1) {
                    if (1 <= i15 && 31 >= i15) {
                        if (i14 >= 0 && 23 >= i14) {
                            if (i17 >= 0 && 59 >= i17) {
                                if (i18 >= 0 && 59 >= i18) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(b.f32402f);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i13);
                                    gregorianCalendar.set(2, i16 - 1);
                                    gregorianCalendar.set(5, i15);
                                    gregorianCalendar.set(11, i14);
                                    gregorianCalendar.set(12, i17);
                                    gregorianCalendar.set(13, i18);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long h(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e10) {
                if (new f("-?\\d+").a(str)) {
                    return p.A(str, "-", false, 2, (Object) null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public final m c(v vVar, String str) {
            l.f(vVar, "url");
            l.f(str, "setCookie");
            return d(System.currentTimeMillis(), vVar, str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fd, code lost:
            if (r1 > 253402300799999L) goto L_0x0105;
         */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x010f  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0112  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0132 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0133  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final um.m d(long r26, um.v r28, java.lang.String r29) {
            /*
                r25 = this;
                r0 = r25
                r7 = r29
                java.lang.String r1 = "url"
                r8 = r28
                cm.l.f(r8, r1)
                java.lang.String r1 = "setCookie"
                cm.l.f(r7, r1)
                r2 = 59
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                r1 = r29
                int r9 = vm.b.o(r1, r2, r3, r4, r5, r6)
                r2 = 61
                r5 = 2
                r4 = r9
                int r1 = vm.b.o(r1, r2, r3, r4, r5, r6)
                r2 = 0
                if (r1 != r9) goto L_0x0028
                return r2
            L_0x0028:
                r3 = 0
                r4 = 1
                java.lang.String r11 = vm.b.T(r7, r3, r1, r4, r2)
                int r5 = r11.length()
                if (r5 != 0) goto L_0x0035
                goto L_0x003c
            L_0x0035:
                int r5 = vm.b.v(r11)
                r6 = -1
                if (r5 == r6) goto L_0x003d
            L_0x003c:
                return r2
            L_0x003d:
                int r1 = r1 + r4
                java.lang.String r12 = vm.b.S(r7, r1, r9)
                int r1 = vm.b.v(r12)
                if (r1 == r6) goto L_0x0049
                return r2
            L_0x0049:
                int r9 = r9 + r4
                int r1 = r29.length()
                r5 = -1
                r10 = r2
                r22 = r10
                r17 = r3
                r18 = r17
                r19 = r18
                r20 = r4
                r15 = r5
                r23 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x0061:
                if (r9 >= r1) goto L_0x00d1
                r2 = 59
                int r2 = vm.b.m(r7, r2, r9, r1)
                r13 = 61
                int r13 = vm.b.m(r7, r13, r9, r2)
                java.lang.String r9 = vm.b.S(r7, r9, r13)
                if (r13 >= r2) goto L_0x007c
                int r13 = r13 + 1
                java.lang.String r13 = vm.b.S(r7, r13, r2)
                goto L_0x007e
            L_0x007c:
                java.lang.String r13 = ""
            L_0x007e:
                java.lang.String r14 = "expires"
                boolean r14 = km.p.o(r9, r14, r4)
                if (r14 == 0) goto L_0x0091
                int r9 = r13.length()     // Catch:{ IllegalArgumentException -> 0x00cd }
                long r23 = r0.g(r13, r3, r9)     // Catch:{ IllegalArgumentException -> 0x00cd }
            L_0x008e:
                r19 = r4
                goto L_0x00cd
            L_0x0091:
                java.lang.String r14 = "max-age"
                boolean r14 = km.p.o(r9, r14, r4)
                if (r14 == 0) goto L_0x009e
                long r15 = r0.h(r13)     // Catch:{  }
                goto L_0x008e
            L_0x009e:
                java.lang.String r14 = "domain"
                boolean r14 = km.p.o(r9, r14, r4)
                if (r14 == 0) goto L_0x00ad
                java.lang.String r10 = r0.f(r13)     // Catch:{ IllegalArgumentException -> 0x00cd }
                r20 = r3
                goto L_0x00cd
            L_0x00ad:
                java.lang.String r14 = "path"
                boolean r14 = km.p.o(r9, r14, r4)
                if (r14 == 0) goto L_0x00b8
                r22 = r13
                goto L_0x00cd
            L_0x00b8:
                java.lang.String r13 = "secure"
                boolean r13 = km.p.o(r9, r13, r4)
                if (r13 == 0) goto L_0x00c3
                r17 = r4
                goto L_0x00cd
            L_0x00c3:
                java.lang.String r13 = "httponly"
                boolean r9 = km.p.o(r9, r13, r4)
                if (r9 == 0) goto L_0x00cd
                r18 = r4
            L_0x00cd:
                int r9 = r2 + 1
                r2 = 0
                goto L_0x0061
            L_0x00d1:
                r1 = -9223372036854775808
                int r4 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r4 != 0) goto L_0x00d9
            L_0x00d7:
                r13 = r1
                goto L_0x0109
            L_0x00d9:
                int r1 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x0107
                r1 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
                int r1 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r1 > 0) goto L_0x00eb
                r1 = 1000(0x3e8, float:1.401E-42)
                long r1 = (long) r1
                long r15 = r15 * r1
                goto L_0x00f0
            L_0x00eb:
                r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x00f0:
                long r1 = r26 + r15
                int r4 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
                if (r4 < 0) goto L_0x0100
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x00d7
                goto L_0x0105
            L_0x0100:
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x0105:
                r13 = r4
                goto L_0x0109
            L_0x0107:
                r13 = r23
            L_0x0109:
                java.lang.String r1 = r28.i()
                if (r10 != 0) goto L_0x0112
                r15 = r1
                r2 = 0
                goto L_0x011c
            L_0x0112:
                boolean r2 = r0.b(r1, r10)
                if (r2 != 0) goto L_0x011a
                r2 = 0
                return r2
            L_0x011a:
                r2 = 0
                r15 = r10
            L_0x011c:
                int r1 = r1.length()
                int r4 = r15.length()
                if (r1 == r4) goto L_0x0133
                okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f30137h
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r1 = r1.c()
                java.lang.String r1 = r1.c(r15)
                if (r1 != 0) goto L_0x0133
                return r2
            L_0x0133:
                java.lang.String r1 = "/"
                r4 = r22
                if (r4 == 0) goto L_0x0144
                r5 = 2
                boolean r2 = km.p.A(r4, r1, r3, r5, r2)
                if (r2 != 0) goto L_0x0141
                goto L_0x0144
            L_0x0141:
                r16 = r4
                goto L_0x016b
            L_0x0144:
                java.lang.String r2 = r28.d()
                r6 = 47
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                r5 = r2
                int r4 = km.q.U(r5, r6, r7, r8, r9, r10)
                if (r4 == 0) goto L_0x0169
                if (r2 == 0) goto L_0x0161
                java.lang.String r1 = r2.substring(r3, r4)
                java.lang.String r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                cm.l.e(r1, r2)
                goto L_0x0169
            L_0x0161:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
                r1.<init>(r2)
                throw r1
            L_0x0169:
                r16 = r1
            L_0x016b:
                um.m r1 = new um.m
                r21 = 0
                r10 = r1
                r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20, r21)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: um.m.a.d(long, um.v, java.lang.String):um.m");
        }

        public final List e(v vVar, u uVar) {
            l.f(vVar, "url");
            l.f(uVar, "headers");
            List v10 = uVar.v("Set-Cookie");
            int size = v10.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                m c10 = c(vVar, (String) v10.get(i10));
                if (c10 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c10);
                }
            }
            if (arrayList == null) {
                return q.i();
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            l.e(unmodifiableList, "Collections.unmodifiableList(cookies)");
            return unmodifiableList;
        }
    }

    private m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f32093a = str;
        this.f32094b = str2;
        this.f32095c = j10;
        this.f32096d = str3;
        this.f32097e = str4;
        this.f32098f = z10;
        this.f32099g = z11;
        this.f32100h = z12;
        this.f32101i = z13;
    }

    public final String e() {
        return this.f32093a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            return l.a(mVar.f32093a, this.f32093a) && l.a(mVar.f32094b, this.f32094b) && mVar.f32095c == this.f32095c && l.a(mVar.f32096d, this.f32096d) && l.a(mVar.f32097e, this.f32097e) && mVar.f32098f == this.f32098f && mVar.f32099g == this.f32099g && mVar.f32100h == this.f32100h && mVar.f32101i == this.f32101i;
        }
    }

    public final String f(boolean z10) {
        String b10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f32093a);
        sb2.append('=');
        sb2.append(this.f32094b);
        if (this.f32100h) {
            if (this.f32095c == Long.MIN_VALUE) {
                b10 = "; max-age=0";
            } else {
                sb2.append("; expires=");
                b10 = c.b(new Date(this.f32095c));
            }
            sb2.append(b10);
        }
        if (!this.f32101i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f32096d);
        }
        sb2.append("; path=");
        sb2.append(this.f32097e);
        if (this.f32098f) {
            sb2.append("; secure");
        }
        if (this.f32099g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        l.e(sb3, "toString()");
        return sb3;
    }

    public final String g() {
        return this.f32094b;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f32093a.hashCode()) * 31) + this.f32094b.hashCode()) * 31) + Long.hashCode(this.f32095c)) * 31) + this.f32096d.hashCode()) * 31) + this.f32097e.hashCode()) * 31) + Boolean.hashCode(this.f32098f)) * 31) + Boolean.hashCode(this.f32099g)) * 31) + Boolean.hashCode(this.f32100h)) * 31) + Boolean.hashCode(this.f32101i);
    }

    public String toString() {
        return f(false);
    }

    public /* synthetic */ m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, g gVar) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }
}
