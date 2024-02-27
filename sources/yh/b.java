package yh;

import android.content.Context;
import android.content.SharedPreferences;
import c1.a;
import cm.g;
import cm.l;
import ni.ae;
import ni.g0;

public final class b {
    /* access modifiers changed from: private */
    public static final String A = "permanenthouseStreetName";
    /* access modifiers changed from: private */
    public static final String B = "permanentVillageTown";
    /* access modifiers changed from: private */
    public static final String C = "permanentLandmark";
    /* access modifiers changed from: private */
    public static final String D = "permanentPinCode";
    /* access modifiers changed from: private */
    public static final String E = "permanentState";
    /* access modifiers changed from: private */
    public static final String F = "permanentDistrict";
    private static final String G = "addNomineeYes";
    private static final String H = "addNomineeNo";
    private static final String I = "nomineeName";
    private static final String J = "relationWithNominee";
    private static final String K = "nomineeDateOfBirth";
    private static final String L = "insuranceType";
    private static final String M = "insuranceCompany";
    private static final String N = "policyNumber";
    private static final String O = "insuranceFrom";
    private static final String P = "insuranceUpto";
    private static final String Q = "declaredInsurance";
    private static final String R = "auth_mode";

    /* renamed from: d  reason: collision with root package name */
    public static final a f33006d = new a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private static final String f33007e = "TransferOfOwnership";

    /* renamed from: f  reason: collision with root package name */
    private static final String f33008f = "stateCd";

    /* renamed from: g  reason: collision with root package name */
    private static final String f33009g = "rcChasiNo";

    /* renamed from: h  reason: collision with root package name */
    private static final String f33010h = "rcEngNo";

    /* renamed from: i  reason: collision with root package name */
    private static final String f33011i = "officeCode";

    /* renamed from: j  reason: collision with root package name */
    private static final String f33012j = "enterNewOwner";

    /* renamed from: k  reason: collision with root package name */
    private static final String f33013k = "purpose";

    /* renamed from: l  reason: collision with root package name */
    private static final String f33014l = "ownershipType";

    /* renamed from: m  reason: collision with root package name */
    private static final String f33015m = "newOwnerCategory";

    /* renamed from: n  reason: collision with root package name */
    private static final String f33016n = "newOwnerName";

    /* renamed from: o  reason: collision with root package name */
    private static final String f33017o = "fatherHusbandName";

    /* renamed from: p  reason: collision with root package name */
    private static final String f33018p = "saleAmount";

    /* renamed from: q  reason: collision with root package name */
    private static final String f33019q = "saleDate";

    /* renamed from: r  reason: collision with root package name */
    private static final String f33020r = "mobileNumber";

    /* renamed from: s  reason: collision with root package name */
    private static final String f33021s = "panNumber";

    /* renamed from: t  reason: collision with root package name */
    private static final String f33022t = "emailId";
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public static final String f33023u = "currenthouseStreetName";
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public static final String f33024v = "currentVillageTown";
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public static final String f33025w = "currentLandmark";
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public static final String f33026x = "currentPinCode";
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public static final String f33027y = "currentState";
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public static final String f33028z = "currentDistrict";

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f33029a;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences.Editor f33030b;

    /* renamed from: c  reason: collision with root package name */
    public Context f33031c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a() {
            return b.f33028z;
        }

        public final String b() {
            return b.f33025w;
        }

        public final String c() {
            return b.f33026x;
        }

        public final String d() {
            return b.f33027y;
        }

        public final String e() {
            return b.f33024v;
        }

        public final String f() {
            return b.f33023u;
        }

        public final String g() {
            return b.F;
        }

        public final String h() {
            return b.C;
        }

        public final String i() {
            return b.D;
        }

        public final String j() {
            return b.E;
        }

        public final String k() {
            return b.B;
        }

        public final String l() {
            return b.A;
        }
    }

    public b(Context context) {
        if (context != null) {
            s(context);
        }
        if (context != null) {
            String c10 = c1.b.c(c1.b.f4621a);
            l.e(c10, "getOrCreate(...)");
            SharedPreferences a10 = c1.a.a(f33007e, c10, context, a.d.AES256_SIV, a.e.AES256_GCM);
            l.e(a10, "create(...)");
            u(a10);
        }
        SharedPreferences.Editor edit = o().edit();
        l.e(edit, "edit(...)");
        t(edit);
    }

    public final vh.b m() {
        String string = o().getString(f33009g, "");
        String str = string;
        l.c(string);
        String string2 = o().getString(f33023u, "");
        String str2 = string2;
        l.c(string2);
        String string3 = o().getString(f33024v, "");
        String str3 = string3;
        l.c(string3);
        String string4 = o().getString(f33025w, "");
        String str4 = string4;
        l.c(string4);
        String string5 = o().getString(f33028z, "0");
        String str5 = string5;
        l.c(string5);
        int i10 = o().getInt(f33026x, 0);
        String string6 = o().getString(f33027y, "");
        String str6 = string6;
        l.c(string6);
        String string7 = o().getString(f33022t, "");
        String str7 = string7;
        l.c(string7);
        String string8 = o().getString(f33017o, "");
        l.c(string8);
        String str8 = "0";
        SharedPreferences o10 = o();
        String str9 = f33011i;
        int i11 = o10.getInt(str9, 0);
        int i12 = o().getInt(f33015m, 0);
        String str10 = "";
        String string9 = o().getString(f33016n, str10);
        String str11 = string9;
        l.c(string9);
        String string10 = o().getString(f33012j, str8);
        l.c(string10);
        int parseInt = Integer.parseInt(string10);
        String string11 = o().getString(f33021s, str10);
        String str12 = string11;
        l.c(string11);
        String string12 = o().getString(A, str10);
        String str13 = string12;
        l.c(string12);
        String string13 = o().getString(B, str10);
        String str14 = string13;
        l.c(string13);
        String string14 = o().getString(C, str10);
        String str15 = string14;
        l.c(string14);
        String string15 = o().getString(F, str8);
        String str16 = string15;
        l.c(string15);
        int i13 = o().getInt(D, 0);
        String string16 = o().getString(E, str10);
        String str17 = string16;
        l.c(string16);
        int i14 = o().getInt(str9, 5);
        String string17 = o().getString(f33013k, str10);
        String str18 = string17;
        l.c(string17);
        String string18 = o().getString(f33010h, str10);
        String str19 = string18;
        l.c(string18);
        String string19 = o().getString(f33018p, "0.0");
        l.c(string19);
        long parseLong = Long.parseLong(string19);
        String string20 = o().getString(f33019q, str10);
        String str20 = string20;
        l.c(string20);
        String string21 = o().getString(f33008f, str10);
        String str21 = string21;
        l.c(string21);
        String string22 = o().getString(f33020r, "0000000000");
        l.c(string22);
        return new vh.b("", "AU", str, str2, str3, str4, str5, i10, str6, str7, string8, "", true, "", i11, "", i12, 0, "", str11, parseInt, str12, str13, str14, str15, str16, i13, str17, i14, str18, str19, parseLong, str20, "", str21, "", string22);
    }

    public final SharedPreferences.Editor n() {
        SharedPreferences.Editor editor = this.f33030b;
        if (editor != null) {
            return editor;
        }
        l.v("editor");
        return null;
    }

    public final SharedPreferences o() {
        SharedPreferences sharedPreferences = this.f33029a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        l.v("pref");
        return null;
    }

    public final String p() {
        return o().getString(f33011i, "");
    }

    public final void q(g0 g0Var, String str, String str2, String str3, String str4) {
        l.f(g0Var, "binding");
        l.f(str, "currentstateCd");
        l.f(str2, "permentstateCd");
        l.f(str3, "currentDistrictGet");
        l.f(str4, "permanentDistrictGet");
        n().putString(f33023u, g0Var.f26422h.getText().toString());
        n().putString(f33024v, g0Var.f26420f.getText().toString());
        n().putString(f33025w, g0Var.f26417c.getText().toString());
        n().putString(f33026x, g0Var.f26418d.getText().toString());
        n().putString(f33027y, str);
        n().putString(f33028z, str3);
        n().putString(A, g0Var.f26429o.getText().toString());
        n().putString(B, g0Var.f26437w.getText().toString());
        n().putString(C, g0Var.f26431q.getText().toString());
        n().putString(D, g0Var.f26428n.getText().toString());
        n().putString(E, str2);
        n().putString(F, str4);
        n().commit();
    }

    public final void r(ae aeVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        l.f(aeVar, "binding");
        l.f(str4, "officeCode");
        l.f(str5, "purposeGet");
        l.f(str6, "ownershipTypeGet");
        l.f(str7, "newOwnerCatagoryGet");
        n().putString(f33012j, aeVar.f25363d.getText().toString());
        n().putString(f33013k, str5);
        n().putString(f33014l, str6);
        n().putString(f33015m, str7);
        n().putString(f33016n, aeVar.f25372m.getText().toString());
        n().putString(f33017o, aeVar.f25365f.getText().toString());
        n().putString(f33018p, aeVar.f25385z.getText().toString());
        n().putString(f33019q, aeVar.B.getText().toString());
        n().putString(f33020r, aeVar.f25367h.getText().toString());
        n().putString(f33021s, aeVar.f25377r.getText().toString());
        n().putString(f33022t, aeVar.f25361b.getText().toString());
        n().putString(f33008f, str);
        n().putString(f33009g, str2);
        n().putString(f33010h, str3);
        n().putString(f33011i, str4);
        n().commit();
    }

    public final void s(Context context) {
        l.f(context, "<set-?>");
        this.f33031c = context;
    }

    public final void t(SharedPreferences.Editor editor) {
        l.f(editor, "<set-?>");
        this.f33030b = editor;
    }

    public final void u(SharedPreferences sharedPreferences) {
        l.f(sharedPreferences, "<set-?>");
        this.f33029a = sharedPreferences;
    }
}
