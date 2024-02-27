package yh;

import android.content.Context;
import android.content.SharedPreferences;
import c1.a;
import c1.b;
import cm.g;
import cm.l;
import yh.b;

public final class a {
    private static final String A = "currentDistrict";
    private static final String B = "permanenthouseStreetName";
    private static final String C = "permanentVillageTown";
    private static final String D = "permanentLandmark";
    private static final String E = "permanentPinCode";
    private static final String F = "permanentState";
    private static final String G = "permanentDistrict";
    private static final String H = "addNomineeYes";
    private static final String I = "addNomineeNo";
    private static final String J = "nomineeName";
    private static final String K = "relationWithNominee";
    private static final String L = "nomineeDateOfBirth";
    private static final String M = "insuranceType";
    private static final String N = "insuranceCompany";
    private static final String O = "policyNumber";
    private static final String P = "insuranceFrom";
    private static final String Q = "insuranceUpto";
    private static final String R = "declaredInsurance";
    private static final String S = "auth_mode";
    private static final String T = "ownerSerial";

    /* renamed from: d  reason: collision with root package name */
    public static final C0385a f32980d = new C0385a((g) null);

    /* renamed from: e  reason: collision with root package name */
    private static final String f32981e = "TransferOfOwnership";

    /* renamed from: f  reason: collision with root package name */
    private static final String f32982f = "stateCd";

    /* renamed from: g  reason: collision with root package name */
    private static final String f32983g = "rcChasiNo";

    /* renamed from: h  reason: collision with root package name */
    private static final String f32984h = "rcEngNo";

    /* renamed from: i  reason: collision with root package name */
    private static final String f32985i = "officeCode";

    /* renamed from: j  reason: collision with root package name */
    private static final String f32986j = "enterNewOwner";

    /* renamed from: k  reason: collision with root package name */
    private static final String f32987k = "purpose";

    /* renamed from: l  reason: collision with root package name */
    private static final String f32988l = "applNo";

    /* renamed from: m  reason: collision with root package name */
    private static final String f32989m = "ownershipType";

    /* renamed from: n  reason: collision with root package name */
    private static final String f32990n = "newOwnerCategory";

    /* renamed from: o  reason: collision with root package name */
    private static final String f32991o = "newOwnerName";

    /* renamed from: p  reason: collision with root package name */
    private static final String f32992p = "fatherHusbandName";

    /* renamed from: q  reason: collision with root package name */
    private static final String f32993q = "saleAmount";

    /* renamed from: r  reason: collision with root package name */
    private static final String f32994r = "saleDate";

    /* renamed from: s  reason: collision with root package name */
    private static final String f32995s = "mobileNumber";

    /* renamed from: t  reason: collision with root package name */
    private static final String f32996t = "panNumber";

    /* renamed from: u  reason: collision with root package name */
    private static final String f32997u = "emailId";

    /* renamed from: v  reason: collision with root package name */
    private static final String f32998v = "currenthouseStreetName";

    /* renamed from: w  reason: collision with root package name */
    private static final String f32999w = "currentVillageTown";

    /* renamed from: x  reason: collision with root package name */
    private static final String f33000x = "currentLandmark";

    /* renamed from: y  reason: collision with root package name */
    private static final String f33001y = "currentPinCode";

    /* renamed from: z  reason: collision with root package name */
    private static final String f33002z = "currentState";

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f33003a;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences.Editor f33004b;

    /* renamed from: c  reason: collision with root package name */
    public Context f33005c;

    /* renamed from: yh.a$a  reason: collision with other inner class name */
    public static final class C0385a {
        private C0385a() {
        }

        public /* synthetic */ C0385a(g gVar) {
            this();
        }
    }

    public a(Context context) {
        if (context != null) {
            h(context);
        }
        if (context != null) {
            String c10 = b.c(b.f4621a);
            l.e(c10, "getOrCreate(...)");
            SharedPreferences a10 = c1.a.a(f32981e, c10, context, a.d.AES256_SIV, a.e.AES256_GCM);
            l.e(a10, "create(...)");
            j(a10);
        }
        SharedPreferences.Editor edit = c().edit();
        l.e(edit, "edit(...)");
        i(edit);
    }

    public final vh.b a() {
        String string = c().getString(f32988l, "");
        String str = string;
        l.c(string);
        String string2 = c().getString(S, "");
        String str2 = string2;
        l.c(string2);
        String string3 = c().getString(f32983g, "");
        String str3 = string3;
        l.c(string3);
        String string4 = c().getString(f32998v, "");
        String str4 = string4;
        l.c(string4);
        String string5 = c().getString(f32999w, "");
        String str5 = string5;
        l.c(string5);
        String string6 = c().getString(f33000x, "");
        String str6 = string6;
        l.c(string6);
        String string7 = c().getString(A, "0");
        String str7 = string7;
        l.c(string7);
        String string8 = c().getString(f33001y, "0");
        l.c(string8);
        int parseInt = Integer.parseInt(string8);
        String string9 = c().getString(f33002z, "");
        String str8 = string9;
        l.c(string9);
        String string10 = c().getString(f32997u, "");
        String str9 = string10;
        l.c(string10);
        String string11 = c().getString(f32992p, "");
        l.c(string11);
        String str10 = "0";
        SharedPreferences c10 = c();
        String str11 = f32985i;
        String string12 = c10.getString(str11, str10);
        l.c(string12);
        int parseInt2 = Integer.parseInt(string12);
        String str12 = str;
        String str13 = "";
        String str14 = str2;
        int i10 = c().getInt(f32990n, 0);
        String string13 = c().getString(f32991o, str13);
        String str15 = string13;
        l.c(string13);
        String string14 = c().getString(T, str10);
        l.c(string14);
        int parseInt3 = Integer.parseInt(string14);
        String string15 = c().getString(f32996t, str13);
        String str16 = string15;
        l.c(string15);
        String string16 = c().getString(B, str13);
        String str17 = string16;
        l.c(string16);
        String string17 = c().getString(C, str13);
        String str18 = string17;
        l.c(string17);
        String string18 = c().getString(D, str13);
        String str19 = string18;
        l.c(string18);
        String string19 = c().getString(G, str10);
        String str20 = string19;
        l.c(string19);
        String string20 = c().getString(E, str10);
        l.c(string20);
        int parseInt4 = Integer.parseInt(string20);
        String string21 = c().getString(F, str13);
        String str21 = string21;
        l.c(string21);
        int i11 = c().getInt(str11, 5);
        String string22 = c().getString(f32987k, str13);
        String str22 = string22;
        l.c(string22);
        String string23 = c().getString(f32984h, str13);
        String str23 = string23;
        l.c(string23);
        String string24 = c().getString(f32993q, "0.0");
        l.c(string24);
        long parseLong = Long.parseLong(string24);
        String string25 = c().getString(f32994r, str13);
        String str24 = string25;
        l.c(string25);
        String string26 = c().getString(f32982f, str13);
        String str25 = string26;
        l.c(string26);
        return new vh.b(str12, str14, str3, str4, str5, str6, str7, parseInt, str8, str9, string11, "", true, "", parseInt2, "", i10, 0, "", str15, parseInt3, str16, str17, str18, str19, str20, parseInt4, str21, i11, str22, str23, parseLong, str24, "", str25, "", c().getString(f32995s, "000000000"));
    }

    public final SharedPreferences.Editor b() {
        SharedPreferences.Editor editor = this.f33004b;
        if (editor != null) {
            return editor;
        }
        l.v("editor");
        return null;
    }

    public final SharedPreferences c() {
        SharedPreferences sharedPreferences = this.f33003a;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        l.v("pref");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        r3 = (r3 = r8.getData()).getTransferOwnershipDto();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(ni.n8 r5, java.lang.String r6, java.lang.String r7, com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.TOFetchApplicationDetails r8) {
        /*
            r4 = this;
            java.lang.String r0 = "binding"
            cm.l.f(r5, r0)
            java.lang.String r0 = "applNo"
            cm.l.f(r6, r0)
            java.lang.String r0 = "authMode"
            cm.l.f(r7, r0)
            android.content.SharedPreferences$Editor r0 = r4.b()
            java.lang.String r1 = T
            r2 = 0
            if (r8 == 0) goto L_0x002d
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r3 = r8.getData()
            if (r3 == 0) goto L_0x002d
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto r3 = r3.getTransferOwnershipDto()
            if (r3 == 0) goto L_0x002d
            int r3 = r3.getOwnerSerial()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x002e
        L_0x002d:
            r3 = r2
        L_0x002e:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.putString(r1, r3)
            android.content.SharedPreferences$Editor r0 = r4.b()
            java.lang.String r1 = f32988l
            r0.putString(r1, r6)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r0 = S
            r6.putString(r0, r7)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32987k
            android.widget.TextView r0 = r5.f27642l
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.putString(r7, r0)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32989m
            android.widget.TextView r0 = r5.f27644n
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.putString(r7, r0)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32990n
            android.widget.TextView r0 = r5.f27638h
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.putString(r7, r0)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32991o
            android.widget.TextView r0 = r5.f27640j
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.putString(r7, r0)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32992p
            android.widget.TextView r0 = r5.f27634d
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.putString(r7, r0)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32993q
            android.widget.TextView r0 = r5.f27651u
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.putString(r7, r0)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32994r
            android.widget.TextView r0 = r5.f27653w
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.putString(r7, r0)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32995s
            android.widget.TextView r0 = r5.f27636f
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.putString(r7, r0)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32996t
            android.widget.EditText r0 = r5.f27646p
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.putString(r7, r0)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32997u
            android.widget.EditText r5 = r5.f27632b
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            r6.putString(r7, r5)
            android.content.SharedPreferences$Editor r5 = r4.b()
            java.lang.String r6 = f32983g
            if (r8 == 0) goto L_0x011e
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r7 = r8.getData()
            if (r7 == 0) goto L_0x011e
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto r7 = r7.getTransferOwnershipDto()
            if (r7 == 0) goto L_0x011e
            java.lang.String r7 = r7.getChassisNo()
            goto L_0x011f
        L_0x011e:
            r7 = r2
        L_0x011f:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r5.putString(r6, r7)
            android.content.SharedPreferences$Editor r5 = r4.b()
            java.lang.String r6 = f32985i
            if (r8 == 0) goto L_0x013d
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r7 = r8.getData()
            if (r7 == 0) goto L_0x013d
            int r7 = r7.getOfficeCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x013e
        L_0x013d:
            r7 = r2
        L_0x013e:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r5.putString(r6, r7)
            android.content.SharedPreferences$Editor r5 = r4.b()
            java.lang.String r6 = f32982f
            if (r8 == 0) goto L_0x0157
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r7 = r8.getData()
            if (r7 == 0) goto L_0x0157
            java.lang.String r2 = r7.getStateCode()
        L_0x0157:
            r5.putString(r6, r2)
            android.content.SharedPreferences$Editor r5 = r4.b()
            r5.commit()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yh.a.d(ni.n8, java.lang.String, java.lang.String, com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.TOFetchApplicationDetails):void");
    }

    public final void e(ni.b bVar, String str, String str2, String str3, String str4) {
        l.f(bVar, "binding");
        l.f(str, "currentstateCd");
        l.f(str2, "permentstateCd");
        l.f(str3, "currentDistrictGet");
        l.f(str4, "permanentDistrictGet");
        b().putString(f32998v, bVar.f25393h.getText().toString());
        b().putString(f32999w, bVar.f25391f.getText().toString());
        b().putString(f33000x, bVar.f25388c.getText().toString());
        b().putString(f33001y, bVar.f25389d.getText().toString());
        b().putString(f33002z, str);
        b().putString(A, str3);
        b().putString(B, bVar.f25400o.getText().toString());
        b().putString(C, bVar.f25408w.getText().toString());
        b().putString(D, bVar.f25402q.getText().toString());
        b().putString(E, bVar.f25399n.getText().toString());
        b().putString(F, str2);
        b().putString(G, str4);
        b().commit();
    }

    public final void f(ni.a aVar, String str, String str2, String str3, String str4) {
        l.f(aVar, "binding");
        l.f(str, "currentstateCd");
        l.f(str2, "permentstateCd");
        l.f(str3, "currentDistrictGet");
        l.f(str4, "permanentDistrictGet");
        SharedPreferences.Editor b10 = b();
        b.a aVar2 = b.f33006d;
        b10.putString(aVar2.f(), aVar.f25149h.getText().toString());
        b().putString(aVar2.e(), aVar.f25147f.getText().toString());
        b().putString(aVar2.b(), aVar.f25144c.getText().toString());
        b().putString(aVar2.c(), aVar.f25145d.getText().toString());
        b().putString(aVar2.d(), str);
        b().putString(aVar2.a(), str3);
        b().putString(aVar2.l(), aVar.f25156o.getText().toString());
        b().putString(aVar2.k(), aVar.f25164w.getText().toString());
        b().putString(aVar2.h(), aVar.f25158q.getText().toString());
        b().putString(aVar2.i(), aVar.f25155n.getText().toString());
        b().putString(aVar2.j(), str2);
        b().putString(aVar2.g(), str4);
        b().commit();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        r3 = (r3 = r8.getData()).getTransferOwnershipDto();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(ni.n8 r5, java.lang.String r6, java.lang.String r7, com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.TOFetchApplicationDetails r8) {
        /*
            r4 = this;
            java.lang.String r0 = "binding"
            cm.l.f(r5, r0)
            java.lang.String r0 = "applNo"
            cm.l.f(r6, r0)
            java.lang.String r0 = "authMode"
            cm.l.f(r7, r0)
            android.content.SharedPreferences$Editor r0 = r4.b()
            java.lang.String r1 = T
            r2 = 0
            if (r8 == 0) goto L_0x002d
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r3 = r8.getData()
            if (r3 == 0) goto L_0x002d
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto r3 = r3.getTransferOwnershipDto()
            if (r3 == 0) goto L_0x002d
            int r3 = r3.getOwnerSerial()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x002e
        L_0x002d:
            r3 = r2
        L_0x002e:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.putString(r1, r3)
            android.content.SharedPreferences$Editor r0 = r4.b()
            java.lang.String r1 = f32988l
            r0.putString(r1, r6)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r0 = S
            r6.putString(r0, r7)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32987k
            android.widget.TextView r0 = r5.f27642l
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.putString(r7, r0)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32989m
            android.widget.TextView r0 = r5.f27644n
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.putString(r7, r0)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32990n
            android.widget.TextView r0 = r5.f27638h
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.putString(r7, r0)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32991o
            android.widget.TextView r0 = r5.f27640j
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.putString(r7, r0)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32992p
            android.widget.TextView r0 = r5.f27634d
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.putString(r7, r0)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32993q
            android.widget.TextView r0 = r5.f27651u
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.putString(r7, r0)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32994r
            android.widget.TextView r0 = r5.f27653w
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.putString(r7, r0)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32995s
            android.widget.TextView r0 = r5.f27636f
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.putString(r7, r0)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32996t
            android.widget.EditText r0 = r5.f27646p
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.putString(r7, r0)
            android.content.SharedPreferences$Editor r6 = r4.b()
            java.lang.String r7 = f32997u
            android.widget.EditText r5 = r5.f27632b
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            r6.putString(r7, r5)
            android.content.SharedPreferences$Editor r5 = r4.b()
            java.lang.String r6 = f32983g
            if (r8 == 0) goto L_0x011e
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r7 = r8.getData()
            if (r7 == 0) goto L_0x011e
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto r7 = r7.getTransferOwnershipDto()
            if (r7 == 0) goto L_0x011e
            java.lang.String r7 = r7.getChassisNo()
            goto L_0x011f
        L_0x011e:
            r7 = r2
        L_0x011f:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r5.putString(r6, r7)
            android.content.SharedPreferences$Editor r5 = r4.b()
            java.lang.String r6 = f32985i
            if (r8 == 0) goto L_0x013d
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r7 = r8.getData()
            if (r7 == 0) goto L_0x013d
            int r7 = r7.getOfficeCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x013e
        L_0x013d:
            r7 = r2
        L_0x013e:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r5.putString(r6, r7)
            android.content.SharedPreferences$Editor r5 = r4.b()
            java.lang.String r6 = f32982f
            if (r8 == 0) goto L_0x0157
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.DataX r7 = r8.getData()
            if (r7 == 0) goto L_0x0157
            java.lang.String r2 = r7.getStateCode()
        L_0x0157:
            r5.putString(r6, r2)
            android.content.SharedPreferences$Editor r5 = r4.b()
            r5.commit()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yh.a.g(ni.n8, java.lang.String, java.lang.String, com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel.TOFetchApplicationDetails):void");
    }

    public final void h(Context context) {
        l.f(context, "<set-?>");
        this.f33005c = context;
    }

    public final void i(SharedPreferences.Editor editor) {
        l.f(editor, "<set-?>");
        this.f33004b = editor;
    }

    public final void j(SharedPreferences sharedPreferences) {
        l.f(sharedPreferences, "<set-?>");
        this.f33003a = sharedPreferences;
    }
}
