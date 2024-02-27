package t0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import cm.g;
import cm.l;
import org.xmlpull.v1.XmlPullParserException;
import pl.x;
import t0.m;
import t0.v;

public final class u {

    /* renamed from: c  reason: collision with root package name */
    public static final a f16450c = new a((g) null);

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal f16451d = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    private final Context f16452a;

    /* renamed from: b  reason: collision with root package name */
    private final c0 f16453b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final y a(TypedValue typedValue, y yVar, y yVar2, String str, String str2) {
            l.f(typedValue, "value");
            l.f(yVar2, "expectedNavType");
            l.f(str2, "foundType");
            if (yVar == null || yVar == yVar2) {
                return yVar == null ? yVar2 : yVar;
            }
            throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
        }
    }

    public u(Context context, c0 c0Var) {
        l.f(context, "context");
        l.f(c0Var, "navigatorProvider");
        this.f16452a = context;
        this.f16453b = c0Var;
    }

    private final p a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i10) {
        int depth;
        c0 c0Var = this.f16453b;
        String name = xmlResourceParser.getName();
        l.e(name, "parser.name");
        p a10 = c0Var.d(name).a();
        a10.k0(this.f16452a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                return a10;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (l.a("argument", name2)) {
                    f(resources, a10, attributeSet, i10);
                } else if (l.a("deepLink", name2)) {
                    g(resources, a10, attributeSet);
                } else if (l.a("action", name2)) {
                    c(resources, a10, attributeSet, xmlResourceParser, i10);
                } else if (l.a("include", name2) && (a10 instanceof q)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, g0.f16283i);
                    l.e(obtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((q) a10).q0(b(obtainAttributes.getResourceId(g0.f16284j, 0)));
                    x xVar = x.f30437a;
                    obtainAttributes.recycle();
                } else if (a10 instanceof q) {
                    ((q) a10).q0(a(resources, xmlResourceParser, attributeSet, i10));
                }
            }
        }
        return a10;
    }

    private final void c(Resources resources, p pVar, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i10) {
        int depth;
        Context context = this.f16452a;
        int[] iArr = u0.a.f16852a;
        l.e(iArr, "NavAction");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(u0.a.f16853b, 0);
        e eVar = new e(obtainStyledAttributes.getResourceId(u0.a.f16854c, 0), (v) null, (Bundle) null, 6, (g) null);
        v.a aVar = new v.a();
        aVar.d(obtainStyledAttributes.getBoolean(u0.a.f16857f, false));
        aVar.j(obtainStyledAttributes.getBoolean(u0.a.f16863l, false));
        aVar.g(obtainStyledAttributes.getResourceId(u0.a.f16860i, -1), obtainStyledAttributes.getBoolean(u0.a.f16861j, false), obtainStyledAttributes.getBoolean(u0.a.f16862k, false));
        aVar.b(obtainStyledAttributes.getResourceId(u0.a.f16855d, -1));
        aVar.c(obtainStyledAttributes.getResourceId(u0.a.f16856e, -1));
        aVar.e(obtainStyledAttributes.getResourceId(u0.a.f16858g, -1));
        aVar.f(obtainStyledAttributes.getResourceId(u0.a.f16859h, -1));
        eVar.e(aVar.a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1 && ((depth = xmlResourceParser.getDepth()) >= depth2 || next != 3)) {
                if (next == 2 && depth <= depth2 && l.a("argument", xmlResourceParser.getName())) {
                    e(resources, bundle, attributeSet, i10);
                }
            }
        }
        if (!bundle.isEmpty()) {
            eVar.d(bundle);
        }
        pVar.l0(resourceId, eVar);
        obtainStyledAttributes.recycle();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final t0.f d(android.content.res.TypedArray r11, android.content.res.Resources r12, int r13) {
        /*
            r10 = this;
            t0.f$a r0 = new t0.f$a
            r0.<init>()
            int r1 = u0.a.f16868q
            r2 = 0
            boolean r1 = r11.getBoolean(r1, r2)
            r0.c(r1)
            java.lang.ThreadLocal r1 = f16451d
            java.lang.Object r3 = r1.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L_0x0021
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r1.set(r3)
        L_0x0021:
            int r1 = u0.a.f16867p
            java.lang.String r8 = r11.getString(r1)
            r1 = 0
            if (r8 == 0) goto L_0x0036
            t0.y$l r4 = t0.y.f16481c
            java.lang.String r13 = r12.getResourcePackageName(r13)
            t0.y r13 = t0.t.a(r4, r8, r13)
            r6 = r13
            goto L_0x0037
        L_0x0036:
            r6 = r1
        L_0x0037:
            int r13 = u0.a.f16866o
            boolean r4 = r11.getValue(r13, r3)
            if (r4 == 0) goto L_0x016d
            t0.y r1 = t0.y.f16483e
            java.lang.String r4 = "' for "
            java.lang.String r5 = "unsupported value '"
            r7 = 16
            if (r6 != r1) goto L_0x0083
            int r11 = r3.resourceId
            if (r11 == 0) goto L_0x004f
            r2 = r11
            goto L_0x0057
        L_0x004f:
            int r11 = r3.type
            if (r11 != r7) goto L_0x005d
            int r11 = r3.data
            if (r11 != 0) goto L_0x005d
        L_0x0057:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L_0x016d
        L_0x005d:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            java.lang.CharSequence r13 = r3.string
            r12.append(r13)
            r12.append(r4)
            java.lang.String r13 = r6.b()
            r12.append(r13)
            java.lang.String r13 = ". Must be a reference to a resource."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0083:
            int r9 = r3.resourceId
            if (r9 == 0) goto L_0x00c3
            if (r6 != 0) goto L_0x0091
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r6 = r1
            r1 = r11
            goto L_0x016d
        L_0x0091:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            java.lang.CharSequence r13 = r3.string
            r12.append(r13)
            r12.append(r4)
            java.lang.String r13 = r6.b()
            r12.append(r13)
            java.lang.String r13 = ". You must use a \""
            r12.append(r13)
            java.lang.String r13 = r1.b()
            r12.append(r13)
            java.lang.String r13 = "\" type to reference other resources."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x00c3:
            t0.y r1 = t0.y.f16491m
            if (r6 != r1) goto L_0x00cd
            java.lang.String r1 = r11.getString(r13)
            goto L_0x016d
        L_0x00cd:
            int r11 = r3.type
            r13 = 3
            if (r11 == r13) goto L_0x015b
            r13 = 4
            if (r11 == r13) goto L_0x014b
            r13 = 5
            if (r11 == r13) goto L_0x0136
            r12 = 18
            if (r11 == r12) goto L_0x0121
            if (r11 < r7) goto L_0x0108
            r12 = 31
            if (r11 > r12) goto L_0x0108
            t0.y r7 = t0.y.f16487i
            t0.u$a r4 = f16450c
            if (r6 != r7) goto L_0x00f8
            java.lang.String r9 = "float"
            r5 = r3
            t0.y r6 = r4.a(r5, r6, r7, r8, r9)
            int r11 = r3.data
            float r11 = (float) r11
        L_0x00f2:
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            goto L_0x016d
        L_0x00f8:
            t0.y r7 = t0.y.f16482d
            java.lang.String r9 = "integer"
            r5 = r3
            t0.y r6 = r4.a(r5, r6, r7, r8, r9)
            int r11 = r3.data
        L_0x0103:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            goto L_0x016d
        L_0x0108:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "unsupported argument type "
            r12.append(r13)
            int r13 = r3.type
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0121:
            t0.u$a r4 = f16450c
            t0.y r7 = t0.y.f16489k
            java.lang.String r9 = "boolean"
            r5 = r3
            t0.y r6 = r4.a(r5, r6, r7, r8, r9)
            int r11 = r3.data
            if (r11 == 0) goto L_0x0131
            r2 = 1
        L_0x0131:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            goto L_0x016d
        L_0x0136:
            t0.u$a r4 = f16450c
            t0.y r7 = t0.y.f16482d
            java.lang.String r9 = "dimension"
            r5 = r3
            t0.y r6 = r4.a(r5, r6, r7, r8, r9)
            android.util.DisplayMetrics r11 = r12.getDisplayMetrics()
            float r11 = r3.getDimension(r11)
            int r11 = (int) r11
            goto L_0x0103
        L_0x014b:
            t0.u$a r4 = f16450c
            t0.y r7 = t0.y.f16487i
            java.lang.String r9 = "float"
            r5 = r3
            t0.y r6 = r4.a(r5, r6, r7, r8, r9)
            float r11 = r3.getFloat()
            goto L_0x00f2
        L_0x015b:
            java.lang.CharSequence r11 = r3.string
            java.lang.String r11 = r11.toString()
            if (r6 != 0) goto L_0x0169
            t0.y$l r12 = t0.y.f16481c
            t0.y r6 = r12.b(r11)
        L_0x0169:
            java.lang.Object r1 = r6.f(r11)
        L_0x016d:
            if (r1 == 0) goto L_0x0172
            r0.b(r1)
        L_0x0172:
            if (r6 == 0) goto L_0x0177
            r0.d(r6)
        L_0x0177:
            t0.f r11 = r0.a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.u.d(android.content.res.TypedArray, android.content.res.Resources, int):t0.f");
    }

    private final void e(Resources resources, Bundle bundle, AttributeSet attributeSet, int i10) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, u0.a.f16864m);
        l.e(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(u0.a.f16865n);
        if (string != null) {
            l.e(string, "array.getString(R.stylea…uments must have a name\")");
            f d10 = d(obtainAttributes, resources, i10);
            if (d10.b()) {
                d10.d(string, bundle);
            }
            x xVar = x.f30437a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private final void f(Resources resources, p pVar, AttributeSet attributeSet, int i10) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, u0.a.f16864m);
        l.e(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(u0.a.f16865n);
        if (string != null) {
            l.e(string, "array.getString(R.stylea…uments must have a name\")");
            pVar.n(string, d(obtainAttributes, resources, i10));
            x xVar = x.f30437a;
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private final void g(Resources resources, p pVar, AttributeSet attributeSet) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, u0.a.f16869r);
        l.e(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = obtainAttributes.getString(u0.a.f16872u);
        String string2 = obtainAttributes.getString(u0.a.f16870s);
        String string3 = obtainAttributes.getString(u0.a.f16871t);
        if ((string == null || string.length() == 0) && ((string2 == null || string2.length() == 0) && (string3 == null || string3.length() == 0))) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        m.a aVar = new m.a();
        if (string != null) {
            String packageName = this.f16452a.getPackageName();
            l.e(packageName, "context.packageName");
            aVar.d(p.w(string, "${applicationId}", packageName, false, 4, (Object) null));
        }
        if (!(string2 == null || string2.length() == 0)) {
            String packageName2 = this.f16452a.getPackageName();
            l.e(packageName2, "context.packageName");
            aVar.b(p.w(string2, "${applicationId}", packageName2, false, 4, (Object) null));
        }
        if (string3 != null) {
            String packageName3 = this.f16452a.getPackageName();
            l.e(packageName3, "context.packageName");
            aVar.c(p.w(string3, "${applicationId}", packageName3, false, 4, (Object) null));
        }
        pVar.r(aVar.a());
        x xVar = x.f30437a;
        obtainAttributes.recycle();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f A[Catch:{ Exception -> 0x003d, all -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f A[Catch:{ Exception -> 0x003d, all -> 0x003b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final t0.q b(int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f16452a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r7)
            java.lang.String r2 = "res.getXml(graphResId)"
            cm.l.e(r1, r2)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)
        L_0x0013:
            int r3 = r1.next()     // Catch:{ Exception -> 0x003d }
            r4 = 2
            if (r3 == r4) goto L_0x001d
            r5 = 1
            if (r3 != r5) goto L_0x0013
        L_0x001d:
            if (r3 != r4) goto L_0x005f
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x003d }
            java.lang.String r4 = "res"
            cm.l.e(r0, r4)     // Catch:{ Exception -> 0x003d }
            java.lang.String r4 = "attrs"
            cm.l.e(r2, r4)     // Catch:{ Exception -> 0x003d }
            t0.p r2 = r6.a(r0, r1, r2, r7)     // Catch:{ Exception -> 0x003d }
            boolean r4 = r2 instanceof t0.q     // Catch:{ Exception -> 0x003d }
            if (r4 == 0) goto L_0x003f
            t0.q r2 = (t0.q) r2     // Catch:{ Exception -> 0x003d }
            r1.close()
            return r2
        L_0x003b:
            r7 = move-exception
            goto L_0x008e
        L_0x003d:
            r2 = move-exception
            goto L_0x0067
        L_0x003f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003d }
            r2.<init>()     // Catch:{ Exception -> 0x003d }
            java.lang.String r4 = "Root element <"
            r2.append(r4)     // Catch:{ Exception -> 0x003d }
            r2.append(r3)     // Catch:{ Exception -> 0x003d }
            java.lang.String r3 = "> did not inflate into a NavGraph"
            r2.append(r3)     // Catch:{ Exception -> 0x003d }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x003d }
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x003d }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x003d }
            r3.<init>(r2)     // Catch:{ Exception -> 0x003d }
            throw r3     // Catch:{ Exception -> 0x003d }
        L_0x005f:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x003d }
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch:{ Exception -> 0x003d }
            throw r2     // Catch:{ Exception -> 0x003d }
        L_0x0067:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x003b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x003b }
            r4.<init>()     // Catch:{ all -> 0x003b }
            java.lang.String r5 = "Exception inflating "
            r4.append(r5)     // Catch:{ all -> 0x003b }
            java.lang.String r7 = r0.getResourceName(r7)     // Catch:{ all -> 0x003b }
            r4.append(r7)     // Catch:{ all -> 0x003b }
            java.lang.String r7 = " line "
            r4.append(r7)     // Catch:{ all -> 0x003b }
            int r7 = r1.getLineNumber()     // Catch:{ all -> 0x003b }
            r4.append(r7)     // Catch:{ all -> 0x003b }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x003b }
            r3.<init>(r7, r2)     // Catch:{ all -> 0x003b }
            throw r3     // Catch:{ all -> 0x003b }
        L_0x008e:
            r1.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.u.b(int):t0.q");
    }
}
