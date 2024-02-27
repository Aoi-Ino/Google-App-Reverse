package ld;

import android.content.Context;
import android.content.SharedPreferences;
import c1.a;
import c1.b;
import cm.l;

public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static final a f13521d = new a((cm.g) null);

    /* renamed from: e  reason: collision with root package name */
    private static final String f13522e = "NexGen";

    /* renamed from: f  reason: collision with root package name */
    private static final String f13523f = "citizenId";

    /* renamed from: g  reason: collision with root package name */
    private static final String f13524g = "ctzMobile";

    /* renamed from: h  reason: collision with root package name */
    private static final String f13525h = "ctzDispName";

    /* renamed from: i  reason: collision with root package name */
    private static final String f13526i = "ctzEmail";

    /* renamed from: j  reason: collision with root package name */
    private static final String f13527j = "MPIN";

    /* renamed from: k  reason: collision with root package name */
    private static final String f13528k = "LoginStaus";

    /* renamed from: l  reason: collision with root package name */
    private static final String f13529l = "blood_group";

    /* renamed from: m  reason: collision with root package name */
    private static final String f13530m = "state_code";

    /* renamed from: n  reason: collision with root package name */
    private static final String f13531n = "Token";

    /* renamed from: o  reason: collision with root package name */
    private static final String f13532o = "FireBaseToken";

    /* renamed from: p  reason: collision with root package name */
    private static final String f13533p = "CitizenToken";

    /* renamed from: q  reason: collision with root package name */
    private static final String f13534q = "ctzMpinStatus";

    /* renamed from: r  reason: collision with root package name */
    private static final String f13535r = "profile_img";

    /* renamed from: s  reason: collision with root package name */
    private static final String f13536s = "userHeight";

    /* renamed from: t  reason: collision with root package name */
    private static final String f13537t = "userWeight";

    /* renamed from: u  reason: collision with root package name */
    private static final String f13538u = "userGender";

    /* renamed from: v  reason: collision with root package name */
    private static final String f13539v = "userdob";

    /* renamed from: w  reason: collision with root package name */
    private static final String f13540w = "appversion";

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f13541a;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences.Editor f13542b;

    /* renamed from: c  reason: collision with root package name */
    public Context f13543c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    public g(Context context) {
        if (context != null) {
            F(context);
        }
        if (context != null) {
            String c10 = b.c(b.f4621a);
            l.e(c10, "getOrCreate(...)");
            SharedPreferences a10 = c1.a.a(f13522e, c10, context, a.d.AES256_SIV, a.e.AES256_GCM);
            l.e(a10, "create(...)");
            H(a10);
        }
        SharedPreferences.Editor edit = o().edit();
        l.e(edit, "edit(...)");
        G(edit);
    }

    public final void A(String str) {
        l.f(str, "name");
        g().putString(f13525h, str);
        g().commit();
    }

    public final void B(String str) {
        l.f(str, "imagePath");
        g().putString(f13535r, str);
        g().commit();
    }

    public final void C(String str) {
        l.f(str, "state_code");
        g().putString(f13530m, str);
        g().commit();
    }

    public final void D(String str) {
        l.f(str, "napToken");
        g().putString(f13531n, str);
        g().commit();
    }

    public final void E(String str) {
        l.f(str, "imagePath");
        g().putString(f13537t, str);
        g().commit();
    }

    public final void F(Context context) {
        l.f(context, "<set-?>");
        this.f13543c = context;
    }

    public final void G(SharedPreferences.Editor editor) {
        l.f(editor, "<set-?>");
        this.f13542b = editor;
    }

    public final void H(SharedPreferences sharedPreferences) {
        l.f(sharedPreferences, "<set-?>");
        this.f13541a = sharedPreferences;
    }

    public final void a(String str) {
        l.f(str, "mPin");
        g().putString(f13527j, str);
        g().commit();
    }

    public final void b(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2) {
        l.f(str, "id");
        l.f(str2, "mobile_no");
        l.f(str5, "mpin");
        g().putString(f13524g, str2);
        g().putString(f13525h, str3);
        g().putString(f13526i, str4);
        g().putString(f13527j, str5);
        g().putString(f13523f, str);
        g().putString(f13530m, str6);
        if (bool2 != null) {
            g().putBoolean(f13534q, bool2.booleanValue());
        }
        if (bool != null) {
            g().putBoolean(f13528k, bool.booleanValue());
        }
        g().commit();
    }

    public final String c() {
        return String.valueOf(o().getString(f13540w, "0"));
    }

    public final boolean d() {
        return o().getBoolean(f13534q, false);
    }

    public final String e() {
        return String.valueOf(o().getString(f13533p, ""));
    }

    public final String f() {
        return String.valueOf(o().getString(f13539v, ""));
    }

    public final SharedPreferences.Editor g() {
        SharedPreferences.Editor editor = this.f13542b;
        if (editor != null) {
            return editor;
        }
        l.v("editor");
        return null;
    }

    public final String h() {
        return String.valueOf(o().getString(f13526i, "NA"));
    }

    public final String i() {
        return String.valueOf(o().getString(f13538u, "M"));
    }

    public final String j() {
        return String.valueOf(o().getString(f13536s, "0"));
    }

    public final String k() {
        return String.valueOf(o().getString(f13523f, (String) null));
    }

    public final String l() {
        return String.valueOf(o().getString(f13524g, (String) null));
    }

    public final String m() {
        return String.valueOf(o().getString(f13527j, (String) null));
    }

    public final String n() {
        return String.valueOf(o().getString(f13525h, "Guest User"));
    }

    public final SharedPreferences o() {
        SharedPreferences sharedPreferences = this.f13541a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        l.v("pref");
        return null;
    }

    public final String p() {
        return String.valueOf(o().getString(f13535r, "0"));
    }

    public final String q() {
        return String.valueOf(o().getString(f13530m, "DL"));
    }

    public final String r() {
        return String.valueOf(o().getString(f13531n, "0"));
    }

    public final String s() {
        return String.valueOf(o().getString(f13537t, "0"));
    }

    public final boolean t() {
        return o().getBoolean(f13528k, false);
    }

    public final void u() {
        g().clear().apply();
        g().commit();
    }

    public final void v(String str) {
        l.f(str, "version");
        g().putString(f13540w, str);
        g().commit();
    }

    public final void w(String str) {
        l.f(str, "blood_group");
        g().putString(f13529l, str);
        g().commit();
    }

    public final void x(String str) {
        l.f(str, "citizen");
        g().putString(f13533p, str);
        g().commit();
    }

    public final void y(String str) {
        l.f(str, "imagePath");
        g().putString(f13526i, str);
        g().commit();
    }

    public final void z(String str) {
        l.f(str, "imagePath");
        g().putString(f13536s, str);
        g().commit();
    }
}
