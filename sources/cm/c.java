package cm;

import java.io.Serializable;

public abstract class c implements im.a, Serializable {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f20210k = a.f20217e;

    /* renamed from: e  reason: collision with root package name */
    private transient im.a f20211e;

    /* renamed from: f  reason: collision with root package name */
    protected final Object f20212f;

    /* renamed from: g  reason: collision with root package name */
    private final Class f20213g;

    /* renamed from: h  reason: collision with root package name */
    private final String f20214h;

    /* renamed from: i  reason: collision with root package name */
    private final String f20215i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f20216j;

    private static class a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final a f20217e = new a();

        private a() {
        }
    }

    protected c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f20212f = obj;
        this.f20213g = cls;
        this.f20214h = str;
        this.f20215i = str2;
        this.f20216j = z10;
    }

    public im.a b() {
        im.a aVar = this.f20211e;
        if (aVar != null) {
            return aVar;
        }
        im.a c10 = c();
        this.f20211e = c10;
        return c10;
    }

    /* access modifiers changed from: protected */
    public abstract im.a c();

    public Object e() {
        return this.f20212f;
    }

    public String f() {
        return this.f20214h;
    }

    public im.c i() {
        Class cls = this.f20213g;
        if (cls == null) {
            return null;
        }
        return this.f20216j ? v.c(cls) : v.b(cls);
    }

    public String j() {
        return this.f20215i;
    }
}
