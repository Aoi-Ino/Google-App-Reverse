package q3;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.q;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import p4.i;
import q3.a;
import r3.a0;
import r3.b;
import r3.j;
import s3.e;
import s3.o;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f14941a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14942b;

    /* renamed from: c  reason: collision with root package name */
    private final a f14943c;

    /* renamed from: d  reason: collision with root package name */
    private final a.d f14944d;

    /* renamed from: e  reason: collision with root package name */
    private final b f14945e;

    /* renamed from: f  reason: collision with root package name */
    private final Looper f14946f;

    /* renamed from: g  reason: collision with root package name */
    private final int f14947g;

    /* renamed from: h  reason: collision with root package name */
    private final e f14948h;

    /* renamed from: i  reason: collision with root package name */
    private final j f14949i;

    /* renamed from: j  reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.b f14950j;

    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f14951c = new C0204a().a();

        /* renamed from: a  reason: collision with root package name */
        public final j f14952a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f14953b;

        /* renamed from: q3.d$a$a  reason: collision with other inner class name */
        public static class C0204a {

            /* renamed from: a  reason: collision with root package name */
            private j f14954a;

            /* renamed from: b  reason: collision with root package name */
            private Looper f14955b;

            public a a() {
                if (this.f14954a == null) {
                    this.f14954a = new r3.a();
                }
                if (this.f14955b == null) {
                    this.f14955b = Looper.getMainLooper();
                }
                return new a(this.f14954a, this.f14955b);
            }
        }

        private a(j jVar, Account account, Looper looper) {
            this.f14952a = jVar;
            this.f14953b = looper;
        }
    }

    public d(Activity activity, a aVar, a.d dVar, a aVar2) {
        this(activity, activity, aVar, dVar, aVar2);
    }

    private final i l(int i10, g gVar) {
        p4.j jVar = new p4.j();
        this.f14950j.F(this, i10, gVar, jVar, this.f14949i);
        return jVar.a();
    }

    /* access modifiers changed from: protected */
    public e.a c() {
        e.a aVar = new e.a();
        aVar.d((Account) null);
        aVar.c(Collections.emptySet());
        aVar.e(this.f14941a.getClass().getName());
        aVar.b(this.f14941a.getPackageName());
        return aVar;
    }

    public i d(g gVar) {
        return l(2, gVar);
    }

    public i e(f fVar) {
        o.i(fVar);
        o.j(fVar.f5288a.b(), "Listener has already been released.");
        o.j(fVar.f5289b.a(), "Listener has already been released.");
        return this.f14950j.z(this, fVar.f5288a, fVar.f5289b, fVar.f5290c);
    }

    public i f(c.a aVar, int i10) {
        o.j(aVar, "Listener key cannot be null.");
        return this.f14950j.A(this, aVar, i10);
    }

    public final b g() {
        return this.f14945e;
    }

    /* access modifiers changed from: protected */
    public String h() {
        return this.f14942b;
    }

    public final int i() {
        return this.f14947g;
    }

    public final a.f j(Looper looper, q qVar) {
        Looper looper2 = looper;
        a.f a10 = ((a.C0202a) o.i(this.f14943c.a())).a(this.f14941a, looper2, c().a(), this.f14944d, qVar, qVar);
        String h10 = h();
        if (h10 != null && (a10 instanceof s3.c)) {
            ((s3.c) a10).O(h10);
        }
        if (h10 == null || !(a10 instanceof r3.g)) {
            return a10;
        }
        r3.g gVar = (r3.g) a10;
        throw null;
    }

    public final a0 k(Context context, Handler handler) {
        return new a0(context, handler, c().a());
    }

    private d(Context context, Activity activity, a aVar, a.d dVar, a aVar2) {
        o.j(context, "Null context is not permitted.");
        o.j(aVar, "Api must not be null.");
        o.j(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f14941a = context.getApplicationContext();
        String str = null;
        if (w3.j.j()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f14942b = str;
        this.f14943c = aVar;
        this.f14944d = dVar;
        this.f14946f = aVar2.f14953b;
        b a10 = b.a(aVar, dVar, str);
        this.f14945e = a10;
        this.f14948h = new r3.o(this);
        com.google.android.gms.common.api.internal.b x10 = com.google.android.gms.common.api.internal.b.x(this.f14941a);
        this.f14950j = x10;
        this.f14947g = x10.m();
        this.f14949i = aVar2.f14952a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            k.u(activity, x10, a10);
        }
        x10.b(this);
    }

    public d(Context context, a aVar, a.d dVar, a aVar2) {
        this(context, (Activity) null, aVar, dVar, aVar2);
    }
}
