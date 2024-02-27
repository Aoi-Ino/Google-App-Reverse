package hp;

import org.xmlpull.v1.XmlPullParser;

class o0 implements g {

    /* renamed from: a  reason: collision with root package name */
    private XmlPullParser f24291a;

    /* renamed from: b  reason: collision with root package name */
    private f f24292b;

    private static class b extends h {
        private b() {
        }

        public boolean b0() {
            return true;
        }
    }

    private static class c extends d {

        /* renamed from: a  reason: collision with root package name */
        private final XmlPullParser f24293a;

        /* renamed from: b  reason: collision with root package name */
        private final String f24294b;

        /* renamed from: c  reason: collision with root package name */
        private final String f24295c;

        /* renamed from: d  reason: collision with root package name */
        private final String f24296d;

        /* renamed from: e  reason: collision with root package name */
        private final String f24297e;

        public c(XmlPullParser xmlPullParser, int i10) {
            this.f24294b = xmlPullParser.getAttributeNamespace(i10);
            this.f24295c = xmlPullParser.getAttributePrefix(i10);
            this.f24297e = xmlPullParser.getAttributeValue(i10);
            this.f24296d = xmlPullParser.getAttributeName(i10);
            this.f24293a = xmlPullParser;
        }

        public Object a() {
            return this.f24293a;
        }

        public String b() {
            return this.f24294b;
        }

        public boolean c() {
            return false;
        }

        public String getName() {
            return this.f24296d;
        }

        public String getPrefix() {
            return this.f24295c;
        }

        public String getValue() {
            return this.f24297e;
        }
    }

    private static class d extends e {

        /* renamed from: e  reason: collision with root package name */
        private final XmlPullParser f24298e;

        /* renamed from: f  reason: collision with root package name */
        private final String f24299f;

        /* renamed from: g  reason: collision with root package name */
        private final String f24300g;

        /* renamed from: h  reason: collision with root package name */
        private final String f24301h;

        /* renamed from: i  reason: collision with root package name */
        private final int f24302i;

        public d(XmlPullParser xmlPullParser) {
            this.f24299f = xmlPullParser.getNamespace();
            this.f24302i = xmlPullParser.getLineNumber();
            this.f24300g = xmlPullParser.getPrefix();
            this.f24301h = xmlPullParser.getName();
            this.f24298e = xmlPullParser;
        }

        public int Q() {
            return this.f24302i;
        }

        public String getName() {
            return this.f24301h;
        }
    }

    private static class e extends h {

        /* renamed from: e  reason: collision with root package name */
        private final XmlPullParser f24303e;

        /* renamed from: f  reason: collision with root package name */
        private final String f24304f;

        public e(XmlPullParser xmlPullParser) {
            this.f24304f = xmlPullParser.getText();
            this.f24303e = xmlPullParser;
        }

        public String getValue() {
            return this.f24304f;
        }

        public boolean h() {
            return true;
        }
    }

    public o0(XmlPullParser xmlPullParser) {
        this.f24291a = xmlPullParser;
    }

    private c a(int i10) {
        return new c(this.f24291a, i10);
    }

    private d b(d dVar) {
        int attributeCount = this.f24291a.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c a10 = a(i10);
            if (!a10.c()) {
                dVar.add(a10);
            }
        }
        return dVar;
    }

    private b c() {
        return new b();
    }

    private f d() {
        int next = this.f24291a.next();
        if (next == 1) {
            return null;
        }
        if (next == 2) {
            return e();
        }
        if (next == 4) {
            return f();
        }
        return next == 3 ? c() : d();
    }

    private d e() {
        d dVar = new d(this.f24291a);
        return dVar.isEmpty() ? b(dVar) : dVar;
    }

    private e f() {
        return new e(this.f24291a);
    }

    public f next() {
        f fVar = this.f24292b;
        if (fVar == null) {
            return d();
        }
        this.f24292b = null;
        return fVar;
    }

    public f peek() {
        if (this.f24292b == null) {
            this.f24292b = next();
        }
        return this.f24292b;
    }
}
