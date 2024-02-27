package ld;

import android.content.Context;
import android.content.SharedPreferences;
import c1.a;
import cm.g;
import cm.l;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f13481d = new a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private static final String f13482e = "NexGenFcm";

    /* renamed from: f  reason: collision with root package name */
    private static final String f13483f = "FireBaseToken";

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f13484a;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences.Editor f13485b;

    /* renamed from: c  reason: collision with root package name */
    public Context f13486c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public b(Context context) {
        if (context != null) {
            e(context);
        }
        if (context != null) {
            String c10 = c1.b.c(c1.b.f4621a);
            l.e(c10, "getOrCreate(...)");
            SharedPreferences a10 = c1.a.a(f13482e, c10, context, a.d.AES256_SIV, a.e.AES256_GCM);
            l.e(a10, "create(...)");
            g(a10);
        }
        SharedPreferences.Editor edit = c().edit();
        l.e(edit, "edit(...)");
        f(edit);
    }

    public final String a() {
        return String.valueOf(c().getString(f13483f, "0"));
    }

    public final SharedPreferences.Editor b() {
        SharedPreferences.Editor editor = this.f13485b;
        if (editor != null) {
            return editor;
        }
        l.v("editor");
        return null;
    }

    public final SharedPreferences c() {
        SharedPreferences sharedPreferences = this.f13484a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        l.v("pref");
        return null;
    }

    public final void d(String str) {
        l.f(str, "device");
        b().putString(f13483f, str);
        b().commit();
    }

    public final void e(Context context) {
        l.f(context, "<set-?>");
        this.f13486c = context;
    }

    public final void f(SharedPreferences.Editor editor) {
        l.f(editor, "<set-?>");
        this.f13485b = editor;
    }

    public final void g(SharedPreferences sharedPreferences) {
        l.f(sharedPreferences, "<set-?>");
        this.f13484a = sharedPreferences;
    }
}
