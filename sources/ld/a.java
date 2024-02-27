package ld;

import android.content.Context;
import android.content.SharedPreferences;
import cm.g;
import cm.l;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0180a f13471e = new C0180a((g) null);

    /* renamed from: f  reason: collision with root package name */
    private static final String f13472f = "NexGenTimer";

    /* renamed from: g  reason: collision with root package name */
    private static final String f13473g = "TimerDate";

    /* renamed from: h  reason: collision with root package name */
    private static final String f13474h = "DeviceDate";

    /* renamed from: i  reason: collision with root package name */
    private static final String f13475i = "ImagerTimer";

    /* renamed from: j  reason: collision with root package name */
    private static final String f13476j = "LanguageTimer";

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f13477a;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences.Editor f13478b;

    /* renamed from: c  reason: collision with root package name */
    public Context f13479c;

    /* renamed from: d  reason: collision with root package name */
    private int f13480d;

    /* renamed from: ld.a$a  reason: collision with other inner class name */
    public static final class C0180a {
        private C0180a() {
        }

        public /* synthetic */ C0180a(g gVar) {
            this();
        }
    }

    public a(Context context) {
        if (context != null) {
            i(context);
        }
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f13472f, this.f13480d);
            l.e(sharedPreferences, "getSharedPreferences(...)");
            k(sharedPreferences);
        }
        SharedPreferences.Editor edit = d().edit();
        l.e(edit, "edit(...)");
        j(edit);
    }

    public final String a() {
        return String.valueOf(d().getString(f13474h, "0"));
    }

    public final SharedPreferences.Editor b() {
        SharedPreferences.Editor editor = this.f13478b;
        if (editor != null) {
            return editor;
        }
        l.v("editor");
        return null;
    }

    public final String c() {
        return String.valueOf(d().getString(f13476j, "0"));
    }

    public final SharedPreferences d() {
        SharedPreferences sharedPreferences = this.f13477a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        l.v("pref");
        return null;
    }

    public final void e() {
        b().clear();
        b().commit();
    }

    public final void f(String str) {
        l.f(str, "time");
        b().putString(f13475i, str);
        b().commit();
    }

    public final void g(String str) {
        l.f(str, "time");
        b().putString(f13476j, str);
        b().commit();
    }

    public final void h(String str) {
        l.f(str, "time");
        b().putString(f13473g, str);
        b().commit();
    }

    public final void i(Context context) {
        l.f(context, "<set-?>");
        this.f13479c = context;
    }

    public final void j(SharedPreferences.Editor editor) {
        l.f(editor, "<set-?>");
        this.f13478b = editor;
    }

    public final void k(SharedPreferences sharedPreferences) {
        l.f(sharedPreferences, "<set-?>");
        this.f13477a = sharedPreferences;
    }
}
