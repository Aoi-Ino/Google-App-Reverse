package ld;

import android.content.Context;
import android.content.SharedPreferences;
import cm.g;
import cm.l;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;

public final class f {

    /* renamed from: e  reason: collision with root package name */
    public static final a f13503e = new a((g) null);

    /* renamed from: f  reason: collision with root package name */
    private static final String f13504f = "Sarthi_Pagging";

    /* renamed from: g  reason: collision with root package name */
    private static final String f13505g = VContant.SERVICE_NAME;

    /* renamed from: h  reason: collision with root package name */
    private static final String f13506h = "Service_Code";

    /* renamed from: i  reason: collision with root package name */
    private static final String f13507i = "State_Code";

    /* renamed from: j  reason: collision with root package name */
    private static final String f13508j = "idpValue";

    /* renamed from: k  reason: collision with root package name */
    private static final String f13509k = "saveCatValue";

    /* renamed from: l  reason: collision with root package name */
    private static final String f13510l = "rtoValue";

    /* renamed from: m  reason: collision with root package name */
    private static final String f13511m = "eKYCId";

    /* renamed from: n  reason: collision with root package name */
    private static final String f13512n = "eKYCOpted";

    /* renamed from: o  reason: collision with root package name */
    private static final String f13513o = "eKYCGender";

    /* renamed from: p  reason: collision with root package name */
    private static final String f13514p = "eKYCapplicantPhoto";

    /* renamed from: q  reason: collision with root package name */
    private static final String f13515q = "mobileNumber";

    /* renamed from: r  reason: collision with root package name */
    private static final String f13516r = "mobileNumberFlow";

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f13517a;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences.Editor f13518b;

    /* renamed from: c  reason: collision with root package name */
    public Context f13519c;

    /* renamed from: d  reason: collision with root package name */
    private int f13520d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public f(Context context) {
        if (context != null) {
            u(context);
        }
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f13504f, this.f13520d);
            l.e(sharedPreferences, "getSharedPreferences(...)");
            w(sharedPreferences);
        }
        SharedPreferences.Editor edit = j().edit();
        l.e(edit, "edit(...)");
        v(edit);
    }

    public final String a() {
        String string = j().getString(f13509k, "0");
        if (string == null) {
            string = null;
        }
        l.c(string);
        return string;
    }

    public final String b() {
        String string = j().getString(f13506h, "0");
        if (string == null) {
            string = null;
        }
        l.c(string);
        return string;
    }

    public final SharedPreferences.Editor c() {
        SharedPreferences.Editor editor = this.f13518b;
        if (editor != null) {
            return editor;
        }
        l.v("editor");
        return null;
    }

    public final String d() {
        String string = j().getString(f13508j, "0");
        if (string == null) {
            string = null;
        }
        l.c(string);
        return string;
    }

    public final String e() {
        String string = j().getString(f13513o, "NA");
        if (string == null) {
            string = null;
        }
        l.c(string);
        return string;
    }

    public final String f() {
        String string = j().getString(f13511m, "NA");
        if (string == null) {
            string = null;
        }
        l.c(string);
        return string;
    }

    public final String g() {
        String string = j().getString(f13512n, "N");
        if (string == null) {
            string = null;
        }
        l.c(string);
        return string;
    }

    public final String h() {
        String string = j().getString(f13514p, "0");
        if (string == null) {
            string = null;
        }
        l.c(string);
        return string;
    }

    public final String i() {
        String string = j().getString(f13505g, "");
        if (string == null) {
            string = null;
        }
        l.c(string);
        return string;
    }

    public final SharedPreferences j() {
        SharedPreferences sharedPreferences = this.f13517a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        l.v("pref");
        return null;
    }

    public final String k() {
        return String.valueOf(j().getString(f13510l, "NA"));
    }

    public final String l() {
        String string = j().getString(f13507i, "");
        if (string == null) {
            string = null;
        }
        l.c(string);
        return string;
    }

    public final void m(String str) {
        l.f(str, "save_cat_value");
        c().putString(f13509k, str);
        c().commit();
    }

    public final void n(String str) {
        l.f(str, "idp_Value");
        c().putString(f13508j, str);
        c().commit();
    }

    public final void o(String str, String str2, String str3, String str4) {
        l.f(str, "id");
        l.f(str2, "opted");
        l.f(str3, "gender");
        l.f(str4, "photo");
        c().putString(f13511m, str);
        c().putString(f13512n, str2);
        c().putString(f13513o, str3);
        c().putString(f13514p, str4);
        c().commit();
    }

    public final void p(String str) {
        l.f(str, "mob_flow");
        c().putString(f13516r, str);
        c().commit();
    }

    public final void q(String str) {
        l.f(str, "mobile_number");
        c().putString(f13515q, str);
        c().commit();
    }

    public final void r(String str, String str2) {
        l.f(str, "name_service");
        l.f(str2, "code_service");
        c().putString(f13505g, str);
        c().putString(f13506h, str2);
        c().commit();
    }

    public final void s(String str) {
        l.f(str, "rto_value");
        c().putString(f13510l, str);
        c().commit();
    }

    public final void t(String str) {
        l.f(str, "state_code");
        c().putString(f13507i, str);
        c().commit();
    }

    public final void u(Context context) {
        l.f(context, "<set-?>");
        this.f13519c = context;
    }

    public final void v(SharedPreferences.Editor editor) {
        l.f(editor, "<set-?>");
        this.f13518b = editor;
    }

    public final void w(SharedPreferences sharedPreferences) {
        l.f(sharedPreferences, "<set-?>");
        this.f13517a = sharedPreferences;
    }
}
