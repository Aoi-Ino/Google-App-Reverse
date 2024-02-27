package t6;

import j$.util.DesugarTimeZone;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import r6.e;
import r6.f;
import r6.g;

public final class d implements s6.b {

    /* renamed from: e  reason: collision with root package name */
    private static final r6.d f16558e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static final f f16559f = new b();

    /* renamed from: g  reason: collision with root package name */
    private static final f f16560g = new c();

    /* renamed from: h  reason: collision with root package name */
    private static final b f16561h = new b((a) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map f16562a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map f16563b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public r6.d f16564c = f16558e;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f16565d = false;

    class a implements r6.a {
        a() {
        }

        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f16562a, d.this.f16563b, d.this.f16564c, d.this.f16565d);
            eVar.h(obj, false);
            eVar.p();
        }
    }

    private static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        private static final DateFormat f16567a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f16567a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: b */
        public void a(Date date, g gVar) {
            gVar.c(f16567a.format(date));
        }
    }

    public d() {
        p(String.class, f16559f);
        p(Boolean.class, f16560g);
        p(Date.class, f16561h);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, e eVar) {
        throw new r6.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public r6.a i() {
        return new a();
    }

    public d j(s6.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z10) {
        this.f16565d = z10;
        return this;
    }

    /* renamed from: o */
    public d a(Class cls, r6.d dVar) {
        this.f16562a.put(cls, dVar);
        this.f16563b.remove(cls);
        return this;
    }

    public d p(Class cls, f fVar) {
        this.f16563b.put(cls, fVar);
        this.f16562a.remove(cls);
        return this;
    }
}
