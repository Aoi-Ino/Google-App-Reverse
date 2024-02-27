package t0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import bm.l;
import cm.g;
import cm.m;
import cm.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.h;
import o.i;
import pl.x;
import t0.m;
import t0.o;

public abstract class p {

    /* renamed from: n  reason: collision with root package name */
    public static final a f16420n = new a((g) null);

    /* renamed from: o  reason: collision with root package name */
    private static final Map f16421o = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final String f16422e;

    /* renamed from: f  reason: collision with root package name */
    private q f16423f;

    /* renamed from: g  reason: collision with root package name */
    private String f16424g;

    /* renamed from: h  reason: collision with root package name */
    private CharSequence f16425h;

    /* renamed from: i  reason: collision with root package name */
    private final List f16426i;

    /* renamed from: j  reason: collision with root package name */
    private final h f16427j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public Map f16428k;

    /* renamed from: l  reason: collision with root package name */
    private int f16429l;

    /* renamed from: m  reason: collision with root package name */
    private String f16430m;

    public static final class a {

        /* renamed from: t0.p$a$a  reason: collision with other inner class name */
        static final class C0221a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final C0221a f16431e = new C0221a();

            C0221a() {
                super(1);
            }

            /* renamed from: b */
            public final p invoke(p pVar) {
                cm.l.f(pVar, "it");
                return pVar.Y();
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a(String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        public final String b(Context context, int i10) {
            String str;
            cm.l.f(context, "context");
            if (i10 <= 16777215) {
                return String.valueOf(i10);
            }
            try {
                str = context.getResources().getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                str = String.valueOf(i10);
            }
            cm.l.e(str, "try {\n                co….toString()\n            }");
            return str;
        }

        public final jm.g c(p pVar) {
            cm.l.f(pVar, "<this>");
            return m.d(pVar, C0221a.f16431e);
        }
    }

    public static final class b implements Comparable {

        /* renamed from: e  reason: collision with root package name */
        private final p f16432e;

        /* renamed from: f  reason: collision with root package name */
        private final Bundle f16433f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f16434g;

        /* renamed from: h  reason: collision with root package name */
        private final int f16435h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f16436i;

        /* renamed from: j  reason: collision with root package name */
        private final int f16437j;

        public b(p pVar, Bundle bundle, boolean z10, int i10, boolean z11, int i11) {
            cm.l.f(pVar, "destination");
            this.f16432e = pVar;
            this.f16433f = bundle;
            this.f16434g = z10;
            this.f16435h = i10;
            this.f16436i = z11;
            this.f16437j = i11;
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            cm.l.f(bVar, "other");
            boolean z10 = this.f16434g;
            if (z10 && !bVar.f16434g) {
                return 1;
            }
            if (!z10 && bVar.f16434g) {
                return -1;
            }
            int i10 = this.f16435h - bVar.f16435h;
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            Bundle bundle = this.f16433f;
            if (bundle != null && bVar.f16433f == null) {
                return 1;
            }
            if (bundle == null && bVar.f16433f != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = bVar.f16433f;
                cm.l.c(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z11 = this.f16436i;
            if (z11 && !bVar.f16436i) {
                return 1;
            }
            if (z11 || !bVar.f16436i) {
                return this.f16437j - bVar.f16437j;
            }
            return -1;
        }

        public final p b() {
            return this.f16432e;
        }

        public final Bundle c() {
            return this.f16433f;
        }

        public final boolean d(Bundle bundle) {
            Bundle bundle2;
            Object obj;
            if (bundle == null || (bundle2 = this.f16433f) == null) {
                return false;
            }
            Set<String> keySet = bundle2.keySet();
            cm.l.e(keySet, "matchingArgs.keySet()");
            for (String str : keySet) {
                if (!bundle.containsKey(str)) {
                    return false;
                }
                f fVar = (f) this.f16432e.f16428k.get(str);
                Object obj2 = null;
                y a10 = fVar != null ? fVar.a() : null;
                if (a10 != null) {
                    Bundle bundle3 = this.f16433f;
                    cm.l.e(str, "key");
                    obj = a10.a(bundle3, str);
                } else {
                    obj = null;
                }
                if (a10 != null) {
                    cm.l.e(str, "key");
                    obj2 = a10.a(bundle, str);
                }
                if (!cm.l.a(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f16438e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(m mVar) {
            super(1);
            this.f16438e = mVar;
        }

        /* renamed from: b */
        public final Boolean invoke(String str) {
            cm.l.f(str, "key");
            return Boolean.valueOf(!this.f16438e.j().contains(str));
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Bundle f16439e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Bundle bundle) {
            super(1);
            this.f16439e = bundle;
        }

        /* renamed from: b */
        public final Boolean invoke(String str) {
            cm.l.f(str, "key");
            return Boolean.valueOf(!this.f16439e.containsKey(str));
        }
    }

    public p(String str) {
        cm.l.f(str, "navigatorName");
        this.f16422e = str;
        this.f16426i = new ArrayList();
        this.f16427j = new h();
        this.f16428k = new LinkedHashMap();
    }

    private final boolean g0(m mVar, Uri uri, Map map) {
        return g.a(map, new d(mVar.p(uri, map))).isEmpty();
    }

    public static /* synthetic */ int[] y(p pVar, p pVar2, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                pVar2 = null;
            }
            return pVar.v(pVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r5 = (t0.f) r7.f16428k.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String B(android.content.Context r8, android.os.Bundle r9) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            cm.l.f(r8, r0)
            java.lang.CharSequence r0 = r7.f16425h
            r1 = 0
            if (r0 != 0) goto L_0x000b
            return r1
        L_0x000b:
            java.lang.String r2 = "\\{(.+?)\\}"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r2 = r2.matcher(r0)
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
        L_0x001a:
            boolean r4 = r2.find()
            if (r4 == 0) goto L_0x008e
            r4 = 1
            java.lang.String r4 = r2.group(r4)
            if (r9 == 0) goto L_0x0062
            boolean r5 = r9.containsKey(r4)
            if (r5 == 0) goto L_0x0062
            java.lang.String r5 = ""
            r2.appendReplacement(r3, r5)
            if (r4 == 0) goto L_0x0043
            java.util.Map r5 = r7.f16428k
            java.lang.Object r5 = r5.get(r4)
            t0.f r5 = (t0.f) r5
            if (r5 == 0) goto L_0x0043
            t0.y r5 = r5.a()
            goto L_0x0044
        L_0x0043:
            r5 = r1
        L_0x0044:
            t0.y r6 = t0.y.f16483e
            boolean r5 = cm.l.a(r5, r6)
            if (r5 == 0) goto L_0x005d
            int r4 = r9.getInt(r4)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "context.getString(bundle.getInt(argName))"
            cm.l.e(r4, r5)
        L_0x0059:
            r3.append(r4)
            goto L_0x001a
        L_0x005d:
            java.lang.String r4 = r9.getString(r4)
            goto L_0x0059
        L_0x0062:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not find \""
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = "\" in "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = " to fill label \""
            r1.append(r9)
            r1.append(r0)
            r9 = 34
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            throw r8
        L_0x008e:
            r2.appendTail(r3)
            java.lang.String r8 = r3.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.p.B(android.content.Context, android.os.Bundle):java.lang.String");
    }

    public final e E(int i10) {
        e eVar = this.f16427j.i() ? null : (e) this.f16427j.e(i10);
        if (eVar != null) {
            return eVar;
        }
        q qVar = this.f16423f;
        if (qVar != null) {
            return qVar.E(i10);
        }
        return null;
    }

    public String F() {
        String str = this.f16424g;
        return str == null ? String.valueOf(this.f16429l) : str;
    }

    public final int H() {
        return this.f16429l;
    }

    public final String T() {
        return this.f16422e;
    }

    public final q Y() {
        return this.f16423f;
    }

    public final String e0() {
        return this.f16430m;
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        boolean a10 = cm.l.a(this.f16426i, pVar.f16426i);
        if (this.f16427j.q() == pVar.f16427j.q()) {
            Iterator it = m.b(i.a(this.f16427j)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                int intValue = ((Number) it.next()).intValue();
                if (!cm.l.a(this.f16427j.e(intValue), pVar.f16427j.e(intValue))) {
                    break;
                }
            }
        } else {
            z10 = false;
        }
        if (this.f16428k.size() == pVar.f16428k.size()) {
            Iterator it2 = k0.s(this.f16428k).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z11 = true;
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (pVar.f16428k.containsKey(entry.getKey())) {
                    if (!cm.l.a(pVar.f16428k.get(entry.getKey()), entry.getValue())) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z11 = false;
        return this.f16429l == pVar.f16429l && cm.l.a(this.f16430m, pVar.f16430m) && a10 && z10 && z11;
    }

    public final boolean h0(String str, Bundle bundle) {
        cm.l.f(str, "route");
        if (cm.l.a(this.f16430m, str)) {
            return true;
        }
        b i02 = i0(str);
        if (!cm.l.a(this, i02 != null ? i02.b() : null)) {
            return false;
        }
        return i02.d(bundle);
    }

    public int hashCode() {
        int i10;
        Set<String> keySet;
        int i11 = this.f16429l * 31;
        String str = this.f16430m;
        int hashCode = i11 + (str != null ? str.hashCode() : 0);
        for (m mVar : this.f16426i) {
            int i12 = i10 * 31;
            String y10 = mVar.y();
            int hashCode2 = (i12 + (y10 != null ? y10.hashCode() : 0)) * 31;
            String i13 = mVar.i();
            int hashCode3 = (hashCode2 + (i13 != null ? i13.hashCode() : 0)) * 31;
            String t10 = mVar.t();
            hashCode = hashCode3 + (t10 != null ? t10.hashCode() : 0);
        }
        Iterator b10 = i.b(this.f16427j);
        while (b10.hasNext()) {
            e eVar = (e) b10.next();
            int b11 = ((i10 * 31) + eVar.b()) * 31;
            v c10 = eVar.c();
            i10 = b11 + (c10 != null ? c10.hashCode() : 0);
            Bundle a10 = eVar.a();
            if (!(a10 == null || (keySet = a10.keySet()) == null)) {
                cm.l.e(keySet, "keySet()");
                for (String str2 : keySet) {
                    int i14 = i10 * 31;
                    Bundle a11 = eVar.a();
                    cm.l.c(a11);
                    Object obj = a11.get(str2);
                    i10 = i14 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str3 : this.f16428k.keySet()) {
            int hashCode4 = ((i10 * 31) + str3.hashCode()) * 31;
            Object obj2 = this.f16428k.get(str3);
            i10 = hashCode4 + (obj2 != null ? obj2.hashCode() : 0);
        }
        return i10;
    }

    public final b i0(String str) {
        cm.l.f(str, "route");
        o.a.C0220a aVar = o.a.f16416d;
        Uri parse = Uri.parse(f16420n.a(str));
        cm.l.b(parse, "Uri.parse(this)");
        o a10 = aVar.a(parse).a();
        return this instanceof q ? ((q) this).z0(a10) : j0(a10);
    }

    public b j0(o oVar) {
        cm.l.f(oVar, "navDeepLinkRequest");
        if (this.f16426i.isEmpty()) {
            return null;
        }
        b bVar = null;
        for (m mVar : this.f16426i) {
            Uri c10 = oVar.c();
            Bundle o10 = c10 != null ? mVar.o(c10, this.f16428k) : null;
            int h10 = mVar.h(c10);
            String a10 = oVar.a();
            boolean z10 = a10 != null && cm.l.a(a10, mVar.i());
            String b10 = oVar.b();
            int u10 = b10 != null ? mVar.u(b10) : -1;
            if (o10 != null || ((z10 || u10 > -1) && g0(mVar, c10, this.f16428k))) {
                b bVar2 = new b(this, o10, mVar.z(), h10, z10, u10);
                if (bVar == null || bVar2.compareTo(bVar) > 0) {
                    bVar = bVar2;
                }
            }
        }
        return bVar;
    }

    public void k0(Context context, AttributeSet attributeSet) {
        cm.l.f(context, "context");
        cm.l.f(attributeSet, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, u0.a.f16875x);
        cm.l.e(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        o0(obtainAttributes.getString(u0.a.A));
        int i10 = u0.a.f16877z;
        if (obtainAttributes.hasValue(i10)) {
            m0(obtainAttributes.getResourceId(i10, 0));
            this.f16424g = f16420n.b(context, this.f16429l);
        }
        this.f16425h = obtainAttributes.getText(u0.a.f16876y);
        x xVar = x.f30437a;
        obtainAttributes.recycle();
    }

    public final void l0(int i10, e eVar) {
        cm.l.f(eVar, "action");
        if (!p0()) {
            throw new UnsupportedOperationException("Cannot add action " + i10 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        } else if (i10 != 0) {
            this.f16427j.k(i10, eVar);
        } else {
            throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
        }
    }

    public final void m0(int i10) {
        this.f16429l = i10;
        this.f16424g = null;
    }

    public final void n(String str, f fVar) {
        cm.l.f(str, "argumentName");
        cm.l.f(fVar, "argument");
        this.f16428k.put(str, fVar);
    }

    public final void n0(q qVar) {
        this.f16423f = qVar;
    }

    public final void o(String str) {
        cm.l.f(str, "uriPattern");
        r(new m.a().d(str).a());
    }

    public final void o0(String str) {
        Object obj;
        if (str == null) {
            m0(0);
        } else if (!p.q(str)) {
            String a10 = f16420n.a(str);
            m0(a10.hashCode());
            o(a10);
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        List list = this.f16426i;
        Collection collection = list;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cm.l.a(((m) obj).y(), f16420n.a(this.f16430m))) {
                break;
            }
        }
        y.a(collection).remove(obj);
        this.f16430m = str;
    }

    public boolean p0() {
        return true;
    }

    public final void r(m mVar) {
        cm.l.f(mVar, "navDeepLink");
        List a10 = g.a(this.f16428k, new c(mVar));
        if (a10.isEmpty()) {
            this.f16426i.add(mVar);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + mVar.y() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + a10).toString());
    }

    public final Bundle s(Bundle bundle) {
        Map map;
        if (bundle == null && ((map = this.f16428k) == null || map.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.f16428k.entrySet()) {
            ((f) entry.getValue()).d((String) entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : this.f16428k.entrySet()) {
                String str = (String) entry2.getKey();
                f fVar = (f) entry2.getValue();
                if (!fVar.e(str, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + str + "' in argument bundle. " + fVar.a().b() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f16424g;
        if (str == null) {
            sb2.append("0x");
            str = Integer.toHexString(this.f16429l);
        }
        sb2.append(str);
        sb2.append(")");
        String str2 = this.f16430m;
        if (str2 != null && !p.q(str2)) {
            sb2.append(" route=");
            sb2.append(this.f16430m);
        }
        if (this.f16425h != null) {
            sb2.append(" label=");
            sb2.append(this.f16425h);
        }
        String sb3 = sb2.toString();
        cm.l.e(sb3, "sb.toString()");
        return sb3;
    }

    public final int[] v(p pVar) {
        ql.h hVar = new ql.h();
        q qVar = this;
        while (true) {
            cm.l.c(qVar);
            q qVar2 = qVar.f16423f;
            if ((pVar != null ? pVar.f16423f : null) != null) {
                q qVar3 = pVar.f16423f;
                cm.l.c(qVar3);
                if (qVar3.r0(qVar.f16429l) == qVar) {
                    hVar.addFirst(qVar);
                    break;
                }
            }
            if (qVar2 == null || qVar2.x0() != qVar.f16429l) {
                hVar.addFirst(qVar);
            }
            if (cm.l.a(qVar2, pVar) || qVar2 == null) {
                break;
            }
            qVar = qVar2;
        }
        Iterable<p> t02 = y.t0(hVar);
        ArrayList arrayList = new ArrayList(r.s(t02, 10));
        for (p pVar2 : t02) {
            arrayList.add(Integer.valueOf(pVar2.f16429l));
        }
        return y.s0(arrayList);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public p(b0 b0Var) {
        this(c0.f16253b.a(b0Var.getClass()));
        cm.l.f(b0Var, "navigator");
    }
}
