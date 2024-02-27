package ld;

import android.content.Context;
import android.content.SharedPreferences;
import cm.g;
import cm.l;

public final class e {

    /* renamed from: e  reason: collision with root package name */
    public static final a f13492e = new a((g) null);

    /* renamed from: f  reason: collision with root package name */
    private static final String f13493f = "NexGenPagging";

    /* renamed from: g  reason: collision with root package name */
    private static final String f13494g = "PageId";

    /* renamed from: h  reason: collision with root package name */
    private static final String f13495h = "StateMaster";

    /* renamed from: i  reason: collision with root package name */
    private static final String f13496i = "BloodMaster";

    /* renamed from: j  reason: collision with root package name */
    private static final String f13497j = "Banner";

    /* renamed from: k  reason: collision with root package name */
    private static final String f13498k = "isngmp";

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f13499a;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences.Editor f13500b;

    /* renamed from: c  reason: collision with root package name */
    public Context f13501c;

    /* renamed from: d  reason: collision with root package name */
    private int f13502d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public e(Context context) {
        if (context != null) {
            j(context);
        }
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f13493f, this.f13502d);
            l.e(sharedPreferences, "getSharedPreferences(...)");
            l(sharedPreferences);
        }
        SharedPreferences.Editor edit = e().edit();
        l.e(edit, "edit(...)");
        k(edit);
    }

    public final String a() {
        return String.valueOf(e().getString(f13497j, "0"));
    }

    public final SharedPreferences.Editor b() {
        SharedPreferences.Editor editor = this.f13500b;
        if (editor != null) {
            return editor;
        }
        l.v("editor");
        return null;
    }

    public final int c() {
        return e().getInt(f13498k, 1);
    }

    public final int d() {
        return e().getInt(f13494g, 0);
    }

    public final SharedPreferences e() {
        SharedPreferences sharedPreferences = this.f13499a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        l.v("pref");
        return null;
    }

    public final String f() {
        return String.valueOf(e().getString(f13495h, "0"));
    }

    public final void g(int i10) {
        b().putInt(f13498k, i10);
        b().commit();
    }

    public final void h(int i10) {
        b().putInt(f13494g, i10);
        b().commit();
    }

    public final void i(String str) {
        l.f(str, "stateMaster");
        b().putString(f13497j, str);
        b().commit();
    }

    public final void j(Context context) {
        l.f(context, "<set-?>");
        this.f13501c = context;
    }

    public final void k(SharedPreferences.Editor editor) {
        l.f(editor, "<set-?>");
        this.f13500b = editor;
    }

    public final void l(SharedPreferences sharedPreferences) {
        l.f(sharedPreferences, "<set-?>");
        this.f13499a = sharedPreferences;
    }

    public final void m(String str) {
        l.f(str, "stateMaster");
        b().putString(f13495h, str);
        b().commit();
    }
}
