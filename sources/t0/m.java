package t0;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pl.o;
import pl.t;
import pl.x;

public final class m {

    /* renamed from: q  reason: collision with root package name */
    private static final b f16370q = new b((cm.g) null);

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f16371r = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: s  reason: collision with root package name */
    private static final Pattern f16372s = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a  reason: collision with root package name */
    private final String f16373a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16374b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16375c;

    /* renamed from: d  reason: collision with root package name */
    private final List f16376d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public String f16377e;

    /* renamed from: f  reason: collision with root package name */
    private final pl.h f16378f = j.a(new l(this));

    /* renamed from: g  reason: collision with root package name */
    private final pl.h f16379g = j.a(new j(this));

    /* renamed from: h  reason: collision with root package name */
    private final pl.h f16380h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f16381i;

    /* renamed from: j  reason: collision with root package name */
    private final pl.h f16382j;

    /* renamed from: k  reason: collision with root package name */
    private final pl.h f16383k;

    /* renamed from: l  reason: collision with root package name */
    private final pl.h f16384l;

    /* renamed from: m  reason: collision with root package name */
    private final pl.h f16385m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public String f16386n;

    /* renamed from: o  reason: collision with root package name */
    private final pl.h f16387o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f16388p;

    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static final C0218a f16389d = new C0218a((cm.g) null);

        /* renamed from: a  reason: collision with root package name */
        private String f16390a;

        /* renamed from: b  reason: collision with root package name */
        private String f16391b;

        /* renamed from: c  reason: collision with root package name */
        private String f16392c;

        /* renamed from: t0.m$a$a  reason: collision with other inner class name */
        public static final class C0218a {
            private C0218a() {
            }

            public /* synthetic */ C0218a(cm.g gVar) {
                this();
            }
        }

        public final m a() {
            return new m(this.f16390a, this.f16391b, this.f16392c);
        }

        public final a b(String str) {
            cm.l.f(str, "action");
            if (str.length() > 0) {
                this.f16391b = str;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
        }

        public final a c(String str) {
            cm.l.f(str, "mimeType");
            this.f16392c = str;
            return this;
        }

        public final a d(String str) {
            cm.l.f(str, "uriPattern");
            this.f16390a = str;
            return this;
        }
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(cm.g gVar) {
            this();
        }
    }

    private static final class c implements Comparable {

        /* renamed from: e  reason: collision with root package name */
        private String f16393e;

        /* renamed from: f  reason: collision with root package name */
        private String f16394f;

        public c(String str) {
            List list;
            cm.l.f(str, "mimeType");
            List d10 = new km.f("/").d(str, 0);
            if (!d10.isEmpty()) {
                ListIterator listIterator = d10.listIterator(d10.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            list = y.p0(d10, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            list = q.i();
            this.f16393e = (String) list.get(0);
            this.f16394f = (String) list.get(1);
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            cm.l.f(cVar, "other");
            int i10 = cm.l.a(this.f16393e, cVar.f16393e) ? 2 : 0;
            return cm.l.a(this.f16394f, cVar.f16394f) ? i10 + 1 : i10;
        }

        public final String b() {
            return this.f16394f;
        }

        public final String c() {
            return this.f16393e;
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        private String f16395a;

        /* renamed from: b  reason: collision with root package name */
        private final List f16396b = new ArrayList();

        public final void a(String str) {
            cm.l.f(str, "name");
            this.f16396b.add(str);
        }

        public final List b() {
            return this.f16396b;
        }

        public final String c() {
            return this.f16395a;
        }

        public final void d(String str) {
            this.f16395a = str;
        }
    }

    static final class e extends cm.m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f16397e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(m mVar) {
            super(0);
            this.f16397e = mVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = (java.util.List) r0.c();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List a() {
            /*
                r1 = this;
                t0.m r0 = r1.f16397e
                pl.o r0 = r0.l()
                if (r0 == 0) goto L_0x0010
                java.lang.Object r0 = r0.c()
                java.util.List r0 = (java.util.List) r0
                if (r0 != 0) goto L_0x0015
            L_0x0010:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            L_0x0015:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.m.e.a():java.util.List");
        }
    }

    static final class f extends cm.m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f16398e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(m mVar) {
            super(0);
            this.f16398e = mVar;
        }

        /* renamed from: b */
        public final o a() {
            return this.f16398e.D();
        }
    }

    static final class g extends cm.m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f16399e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(m mVar) {
            super(0);
            this.f16399e = mVar;
        }

        /* renamed from: b */
        public final Pattern a() {
            String b10 = this.f16399e.n();
            if (b10 != null) {
                return Pattern.compile(b10, 2);
            }
            return null;
        }
    }

    static final class h extends cm.m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f16400e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(m mVar) {
            super(0);
            this.f16400e = mVar;
        }

        /* renamed from: b */
        public final String a() {
            o a10 = this.f16400e.l();
            if (a10 != null) {
                return (String) a10.d();
            }
            return null;
        }
    }

    static final class i extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Bundle f16401e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(Bundle bundle) {
            super(1);
            this.f16401e = bundle;
        }

        /* renamed from: b */
        public final Boolean invoke(String str) {
            cm.l.f(str, "argName");
            return Boolean.valueOf(!this.f16401e.containsKey(str));
        }
    }

    static final class j extends cm.m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f16402e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(m mVar) {
            super(0);
            this.f16402e = mVar;
        }

        /* renamed from: b */
        public final Boolean a() {
            return Boolean.valueOf((this.f16402e.y() == null || Uri.parse(this.f16402e.y()).getQuery() == null) ? false : true);
        }
    }

    static final class k extends cm.m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f16403e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(m mVar) {
            super(0);
            this.f16403e = mVar;
        }

        /* renamed from: b */
        public final Pattern a() {
            String c10 = this.f16403e.f16386n;
            if (c10 != null) {
                return Pattern.compile(c10);
            }
            return null;
        }
    }

    static final class l extends cm.m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f16404e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(m mVar) {
            super(0);
            this.f16404e = mVar;
        }

        /* renamed from: b */
        public final Pattern a() {
            String d10 = this.f16404e.f16377e;
            if (d10 != null) {
                return Pattern.compile(d10, 2);
            }
            return null;
        }
    }

    /* renamed from: t0.m$m  reason: collision with other inner class name */
    static final class C0219m extends cm.m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f16405e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0219m(m mVar) {
            super(0);
            this.f16405e = mVar;
        }

        /* renamed from: b */
        public final Map a() {
            return this.f16405e.H();
        }
    }

    public m(String str, String str2, String str3) {
        this.f16373a = str;
        this.f16374b = str2;
        this.f16375c = str3;
        pl.l lVar = pl.l.NONE;
        this.f16380h = j.b(lVar, new C0219m(this));
        this.f16382j = j.b(lVar, new f(this));
        this.f16383k = j.b(lVar, new e(this));
        this.f16384l = j.b(lVar, new h(this));
        this.f16385m = j.a(new g(this));
        this.f16387o = j.a(new k(this));
        G();
        F();
    }

    private final boolean A() {
        return ((Boolean) this.f16379g.getValue()).booleanValue();
    }

    private final boolean B(Bundle bundle, String str, String str2, f fVar) {
        if (fVar != null) {
            fVar.a().d(bundle, str, str2);
            return false;
        }
        bundle.putString(str, str2);
        return false;
    }

    private final boolean C(Bundle bundle, String str, String str2, f fVar) {
        if (!bundle.containsKey(str)) {
            return true;
        }
        if (fVar == null) {
            return false;
        }
        y a10 = fVar.a();
        a10.e(bundle, str, str2, a10.a(bundle, str));
        return false;
    }

    /* access modifiers changed from: private */
    public final o D() {
        String str = this.f16373a;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.f16373a).getFragment();
        StringBuilder sb2 = new StringBuilder();
        cm.l.c(fragment);
        g(fragment, arrayList, sb2);
        String sb3 = sb2.toString();
        cm.l.e(sb3, "fragRegex.toString()");
        return t.a(arrayList, sb3);
    }

    private final boolean E(List list, d dVar, Bundle bundle, Map map) {
        if (list == null) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String c10 = dVar.c();
            Matcher matcher = c10 != null ? Pattern.compile(c10, 32).matcher(str) : null;
            if (matcher == null || !matcher.matches()) {
                return false;
            }
            Bundle bundle2 = new Bundle();
            try {
                Iterable b10 = dVar.b();
                ArrayList arrayList = new ArrayList(r.s(b10, 10));
                int i10 = 0;
                for (Object next : b10) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        q.r();
                    }
                    String str2 = (String) next;
                    String group = matcher.group(i11);
                    if (group == null) {
                        group = "";
                    } else {
                        cm.l.e(group, "argMatcher.group(index + 1) ?: \"\"");
                    }
                    f fVar = (f) map.get(str2);
                    if (C(bundle, str2, group, fVar)) {
                        if (!cm.l.a(group, '{' + str2 + '}') && B(bundle2, str2, group, fVar)) {
                            return false;
                        }
                    }
                    arrayList.add(x.f30437a);
                    i10 = i11;
                }
                bundle.putAll(bundle2);
            } catch (IllegalArgumentException unused) {
            }
        }
        return true;
    }

    private final void F() {
        if (this.f16375c != null) {
            if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f16375c).matches()) {
                c cVar = new c(this.f16375c);
                this.f16386n = p.w("^(" + cVar.c() + "|[*]+)/(" + cVar.b() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, (Object) null);
                return;
            }
            throw new IllegalArgumentException(("The given mimeType " + this.f16375c + " does not match to required \"type/subtype\" format").toString());
        }
    }

    private final void G() {
        if (this.f16373a != null) {
            StringBuilder sb2 = new StringBuilder("^");
            if (!f16371r.matcher(this.f16373a).find()) {
                sb2.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.f16373a);
            matcher.find();
            boolean z10 = false;
            String substring = this.f16373a.substring(0, matcher.start());
            cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            g(substring, this.f16376d, sb2);
            if (!q.F(sb2, ".*", false, 2, (Object) null) && !q.F(sb2, "([^/]+?)", false, 2, (Object) null)) {
                z10 = true;
            }
            this.f16388p = z10;
            sb2.append("($|(\\?(.)*)|(\\#(.)*))");
            String sb3 = sb2.toString();
            cm.l.e(sb3, "uriRegex.toString()");
            this.f16377e = p.w(sb3, ".*", "\\E.*\\Q", false, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final Map H() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!A()) {
            return linkedHashMap;
        }
        Uri parse = Uri.parse(this.f16373a);
        for (String next : parse.getQueryParameterNames()) {
            StringBuilder sb2 = new StringBuilder();
            List<String> queryParameters = parse.getQueryParameters(next);
            if (queryParameters.size() <= 1) {
                cm.l.e(queryParameters, "queryParams");
                String str = (String) y.V(queryParameters);
                if (str == null) {
                    this.f16381i = true;
                    str = next;
                }
                Matcher matcher = f16372s.matcher(str);
                d dVar = new d();
                int i10 = 0;
                while (matcher.find()) {
                    String group = matcher.group(1);
                    cm.l.d(group, "null cannot be cast to non-null type kotlin.String");
                    dVar.a(group);
                    cm.l.e(str, "queryParam");
                    String substring = str.substring(i10, matcher.start());
                    cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(Pattern.quote(substring));
                    sb2.append("(.+?)?");
                    i10 = matcher.end();
                }
                if (i10 < str.length()) {
                    cm.l.e(str, "queryParam");
                    String substring2 = str.substring(i10);
                    cm.l.e(substring2, "this as java.lang.String).substring(startIndex)");
                    sb2.append(Pattern.quote(substring2));
                }
                String sb3 = sb2.toString();
                cm.l.e(sb3, "argRegex.toString()");
                dVar.d(p.w(sb3, ".*", "\\E.*\\Q", false, 4, (Object) null));
                cm.l.e(next, "paramName");
                linkedHashMap.put(next, dVar);
            } else {
                throw new IllegalArgumentException(("Query parameter " + next + " must only be present once in " + this.f16373a + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
            }
        }
        return linkedHashMap;
    }

    private final void g(String str, List list, StringBuilder sb2) {
        Matcher matcher = f16372s.matcher(str);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            cm.l.d(group, "null cannot be cast to non-null type kotlin.String");
            list.add(group);
            if (matcher.start() > i10) {
                String substring = str.substring(i10, matcher.start());
                cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(Pattern.quote(substring));
            }
            sb2.append("([^/]+?)");
            i10 = matcher.end();
        }
        if (i10 < str.length()) {
            String substring2 = str.substring(i10);
            cm.l.e(substring2, "this as java.lang.String).substring(startIndex)");
            sb2.append(Pattern.quote(substring2));
        }
    }

    private final List k() {
        return (List) this.f16383k.getValue();
    }

    /* access modifiers changed from: private */
    public final o l() {
        return (o) this.f16382j.getValue();
    }

    private final Pattern m() {
        return (Pattern) this.f16385m.getValue();
    }

    /* access modifiers changed from: private */
    public final String n() {
        return (String) this.f16384l.getValue();
    }

    private final boolean q(Matcher matcher, Bundle bundle, Map map) {
        Iterable iterable = this.f16376d;
        ArrayList arrayList = new ArrayList(r.s(iterable, 10));
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                q.r();
            }
            String str = (String) next;
            String decode = Uri.decode(matcher.group(i11));
            f fVar = (f) map.get(str);
            try {
                cm.l.e(decode, "value");
                if (B(bundle, str, decode, fVar)) {
                    return false;
                }
                arrayList.add(x.f30437a);
                i10 = i11;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(Uri uri, Bundle bundle, Map map) {
        String query;
        for (Map.Entry entry : x().entrySet()) {
            d dVar = (d) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters((String) entry.getKey());
            if (this.f16381i && (query = uri.getQuery()) != null && !cm.l.a(query, uri.toString())) {
                queryParameters = p.d(query);
            }
            if (!E(queryParameters, dVar, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    private final void s(String str, Bundle bundle, Map map) {
        Pattern m10 = m();
        Matcher matcher = m10 != null ? m10.matcher(String.valueOf(str)) : null;
        if (matcher != null && matcher.matches()) {
            Iterable k10 = k();
            ArrayList arrayList = new ArrayList(r.s(k10, 10));
            int i10 = 0;
            for (Object next : k10) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    q.r();
                }
                String str2 = (String) next;
                String decode = Uri.decode(matcher.group(i11));
                f fVar = (f) map.get(str2);
                try {
                    cm.l.e(decode, "value");
                    if (!B(bundle, str2, decode, fVar)) {
                        arrayList.add(x.f30437a);
                        i10 = i11;
                    } else {
                        return;
                    }
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    private final Pattern v() {
        return (Pattern) this.f16387o.getValue();
    }

    private final Pattern w() {
        return (Pattern) this.f16378f.getValue();
    }

    private final Map x() {
        return (Map) this.f16380h.getValue();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return cm.l.a(this.f16373a, mVar.f16373a) && cm.l.a(this.f16374b, mVar.f16374b) && cm.l.a(this.f16375c, mVar.f16375c);
    }

    public final int h(Uri uri) {
        if (uri == null || this.f16373a == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = Uri.parse(this.f16373a).getPathSegments();
        cm.l.e(pathSegments, "requestedPathSegments");
        cm.l.e(pathSegments2, "uriPathSegments");
        return y.Z(pathSegments, pathSegments2).size();
    }

    public int hashCode() {
        String str = this.f16373a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f16374b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f16375c;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public final String i() {
        return this.f16374b;
    }

    public final List j() {
        Collection collection = this.f16376d;
        ArrayList arrayList = new ArrayList();
        for (d b10 : x().values()) {
            boolean unused = v.v(arrayList, b10.b());
        }
        return y.i0(y.i0(collection, arrayList), k());
    }

    public final Bundle o(Uri uri, Map map) {
        cm.l.f(uri, "deepLink");
        cm.l.f(map, "arguments");
        Pattern w10 = w();
        Matcher matcher = w10 != null ? w10.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!q(matcher, bundle, map)) {
            return null;
        }
        if (A() && !r(uri, bundle, map)) {
            return null;
        }
        s(uri.getFragment(), bundle, map);
        if (!g.a(map, new i(bundle)).isEmpty()) {
            return null;
        }
        return bundle;
    }

    public final Bundle p(Uri uri, Map map) {
        cm.l.f(map, "arguments");
        Bundle bundle = new Bundle();
        if (uri == null) {
            return bundle;
        }
        Pattern w10 = w();
        Matcher matcher = w10 != null ? w10.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return bundle;
        }
        q(matcher, bundle, map);
        if (A()) {
            r(uri, bundle, map);
        }
        return bundle;
    }

    public final String t() {
        return this.f16375c;
    }

    public final int u(String str) {
        cm.l.f(str, "mimeType");
        if (this.f16375c != null) {
            Pattern v10 = v();
            cm.l.c(v10);
            if (v10.matcher(str).matches()) {
                return new c(this.f16375c).compareTo(new c(str));
            }
        }
        return -1;
    }

    public final String y() {
        return this.f16373a;
    }

    public final boolean z() {
        return this.f16388p;
    }
}
