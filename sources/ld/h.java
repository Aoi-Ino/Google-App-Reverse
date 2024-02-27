package ld;

import android.content.Context;
import android.content.SharedPreferences;
import cm.g;
import cm.l;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;

public final class h {

    /* renamed from: e  reason: collision with root package name */
    public static final a f13544e = new a((g) null);

    /* renamed from: f  reason: collision with root package name */
    private static final String f13545f = "Vahan_Pagging";

    /* renamed from: g  reason: collision with root package name */
    private static final String f13546g = VContant.SERVICE_NAME;

    /* renamed from: h  reason: collision with root package name */
    private static final String f13547h = "Service_Code";

    /* renamed from: i  reason: collision with root package name */
    private static final String f13548i = "txnNo";

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f13549a;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences.Editor f13550b;

    /* renamed from: c  reason: collision with root package name */
    public Context f13551c;

    /* renamed from: d  reason: collision with root package name */
    private int f13552d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public h(Context context) {
        if (context != null) {
            i(context);
        }
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f13545f, this.f13552d);
            l.e(sharedPreferences, "getSharedPreferences(...)");
            k(sharedPreferences);
        }
        SharedPreferences.Editor edit = e().edit();
        l.e(edit, "edit(...)");
        j(edit);
    }

    public final String a() {
        String string = e().getString(f13548i, " ");
        if (string == null) {
            string = null;
        }
        l.c(string);
        return string;
    }

    public final boolean b() {
        return e().getBoolean("isAppontment", false);
    }

    public final String c() {
        String string = e().getString(f13547h, "");
        if (string == null) {
            string = null;
        }
        l.c(string);
        return string;
    }

    public final SharedPreferences.Editor d() {
        SharedPreferences.Editor editor = this.f13550b;
        if (editor != null) {
            return editor;
        }
        l.v("editor");
        return null;
    }

    public final SharedPreferences e() {
        SharedPreferences sharedPreferences = this.f13549a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        l.v("pref");
        return null;
    }

    public final void f(String str) {
        d().putString(f13548i, str);
        d().commit();
    }

    public final void g(boolean z10) {
        d().putBoolean("isAppontment", z10);
        d().commit();
    }

    public final void h(String str, String str2) {
        l.f(str, "name_service");
        l.f(str2, "code_service");
        d().putString(f13546g, str);
        d().putString(f13547h, str2);
        d().commit();
    }

    public final void i(Context context) {
        l.f(context, "<set-?>");
        this.f13551c = context;
    }

    public final void j(SharedPreferences.Editor editor) {
        l.f(editor, "<set-?>");
        this.f13550b = editor;
    }

    public final void k(SharedPreferences sharedPreferences) {
        l.f(sharedPreferences, "<set-?>");
        this.f13549a = sharedPreferences;
    }
}
