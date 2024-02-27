package um;

import cm.g;
import cm.l;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class x {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f32154e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f32155f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: g  reason: collision with root package name */
    public static final a f32156g = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f32157a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32158b;

    /* renamed from: c  reason: collision with root package name */
    private final String f32159c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f32160d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final x a(String str) {
            l.f(str, "$this$toMediaType");
            Matcher matcher = x.f32154e.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                l.e(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                l.e(locale, "Locale.US");
                if (group != null) {
                    String lowerCase = group.toLowerCase(locale);
                    l.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String group2 = matcher.group(2);
                    l.e(group2, "typeSubtype.group(2)");
                    l.e(locale, "Locale.US");
                    if (group2 != null) {
                        String lowerCase2 = group2.toLowerCase(locale);
                        l.e(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                        ArrayList arrayList = new ArrayList();
                        Matcher matcher2 = x.f32155f.matcher(str);
                        int end = matcher.end();
                        while (end < str.length()) {
                            matcher2.region(end, str.length());
                            if (matcher2.lookingAt()) {
                                String group3 = matcher2.group(1);
                                if (group3 != null) {
                                    String group4 = matcher2.group(2);
                                    if (group4 == null) {
                                        group4 = matcher2.group(3);
                                    } else if (p.A(group4, "'", false, 2, (Object) null) && p.n(group4, "'", false, 2, (Object) null) && group4.length() > 2) {
                                        group4 = group4.substring(1, group4.length() - 1);
                                        l.e(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    }
                                    arrayList.add(group3);
                                    arrayList.add(group4);
                                }
                                end = matcher2.end();
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Parameter is not formatted correctly: \"");
                                String substring = str.substring(end);
                                l.e(substring, "(this as java.lang.String).substring(startIndex)");
                                sb2.append(substring);
                                sb2.append("\" for: \"");
                                sb2.append(str);
                                sb2.append('\"');
                                throw new IllegalArgumentException(sb2.toString().toString());
                            }
                        }
                        Object[] array = arrayList.toArray(new String[0]);
                        if (array != null) {
                            return new x(str, lowerCase, lowerCase2, (String[]) array, (g) null);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        public final x b(String str) {
            l.f(str, "$this$toMediaTypeOrNull");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private x(String str, String str2, String str3, String[] strArr) {
        this.f32157a = str;
        this.f32158b = str2;
        this.f32159c = str3;
        this.f32160d = strArr;
    }

    public static /* synthetic */ Charset d(x xVar, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return xVar.c(charset);
    }

    public static final x e(String str) {
        return f32156g.a(str);
    }

    public static final x g(String str) {
        return f32156g.b(str);
    }

    public final Charset c(Charset charset) {
        String f10 = f("charset");
        if (f10 == null) {
            return charset;
        }
        try {
            return Charset.forName(f10);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && l.a(((x) obj).f32157a, this.f32157a);
    }

    public final String f(String str) {
        l.f(str, "name");
        hm.a h10 = f.h(m.w(this.f32160d), 2);
        int l10 = h10.l();
        int n10 = h10.n();
        int o10 = h10.o();
        if (o10 >= 0) {
            if (l10 > n10) {
                return null;
            }
        } else if (l10 < n10) {
            return null;
        }
        while (!p.o(this.f32160d[l10], str, true)) {
            if (l10 == n10) {
                return null;
            }
            l10 += o10;
        }
        return this.f32160d[l10 + 1];
    }

    public final String h() {
        return this.f32158b;
    }

    public int hashCode() {
        return this.f32157a.hashCode();
    }

    public String toString() {
        return this.f32157a;
    }

    public /* synthetic */ x(String str, String str2, String str3, String[] strArr, g gVar) {
        this(str, str2, str3, strArr);
    }
}
