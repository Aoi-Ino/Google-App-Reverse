package com.nic.mparivahan.dlservices.ui.dlextract.NonSarathi;

import android.app.Application;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.lifecycle.a0;
import bm.p;
import kotlin.coroutines.jvm.internal.l;
import lm.d0;
import lm.e0;
import lm.f0;
import lm.k1;
import lm.q0;
import pl.q;
import pl.x;
import tl.d;
import tl.g;

@Keep
public final class GetAckNumberGen {
    private final Application app;
    private String dlHolderAltMobMum;
    private final a0 dlResponseData = new a0();
    private String dlno;
    private String dob;
    private String dupDlReasonCode;
    private String dupDlReasonName;
    private String eKYCGender;
    private String eKYCId;
    private String eKYCOpted;
    private String eKYCPhoto;
    private String mobileNumber;
    private String perDistrict;
    private String perHouseNo;
    private String perLocation;
    private String perPinCode;
    private String perState;
    private String perStreet;
    private String perSubDistrict;
    private String permVillageOrTown;
    private String presDistrict;
    private String presHouseNo;
    private String presLocation;
    private String presPincode;
    private String presState;
    private String presStreet;
    private String presSubDistrict;
    private String presVillageOrTown;
    private String rtoCodeDLTr;
    private String willtoDonateOrgans;

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f22021f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ GetAckNumberGen f22022g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(GetAckNumberGen getAckNumberGen, d dVar) {
            super(2, dVar);
            this.f22022g = getAckNumberGen;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f22022g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f22021f;
            if (i10 == 0) {
                q.b(obj);
                GetAckNumberGen getAckNumberGen = this.f22022g;
                this.f22021f = 1;
                if (getAckNumberGen.callWebService(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                q.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.f30437a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: e  reason: collision with root package name */
        Object f22023e;

        /* renamed from: f  reason: collision with root package name */
        Object f22024f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f22025g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ GetAckNumberGen f22026h;

        /* renamed from: i  reason: collision with root package name */
        int f22027i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(GetAckNumberGen getAckNumberGen, d dVar) {
            super(dVar);
            this.f22026h = getAckNumberGen;
        }

        public final Object invokeSuspend(Object obj) {
            this.f22025g = obj;
            this.f22027i |= Integer.MIN_VALUE;
            return this.f22026h.callWebService(this);
        }
    }

    public GetAckNumberGen(Application application, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
        Application application2 = application;
        String str29 = str8;
        String str30 = str9;
        String str31 = str10;
        String str32 = str11;
        String str33 = str12;
        String str34 = str13;
        String str35 = str14;
        String str36 = str15;
        String str37 = str16;
        String str38 = str17;
        String str39 = str18;
        String str40 = str19;
        String str41 = str20;
        String str42 = str22;
        cm.l.f(application2, "app");
        cm.l.f(str29, "presHouseNo");
        cm.l.f(str30, "presStreet");
        cm.l.f(str31, "presLocation");
        cm.l.f(str32, "presVillageOrTown");
        cm.l.f(str33, "presSubDistrict");
        cm.l.f(str34, "presDistrict");
        cm.l.f(str35, "presState");
        cm.l.f(str36, "presPincode");
        cm.l.f(str37, "perHouseNo");
        cm.l.f(str38, "perStreet");
        cm.l.f(str39, "perLocation");
        cm.l.f(str40, "permVillageOrTown");
        cm.l.f(str41, "perSubDistrict");
        cm.l.f(str21, "perDistrict");
        cm.l.f(str22, "perState");
        cm.l.f(str23, "perPinCode");
        cm.l.f(str24, "mobileNumber");
        cm.l.f(str25, "eKYCId");
        cm.l.f(str26, "eKYCOpted");
        cm.l.f(str27, "eKYCGender");
        cm.l.f(str28, "eKYCPhoto");
        this.app = application2;
        this.dlno = str;
        this.dob = str2;
        this.rtoCodeDLTr = str3;
        this.dupDlReasonCode = str4;
        this.dupDlReasonName = str5;
        this.willtoDonateOrgans = str6;
        this.dlHolderAltMobMum = str7;
        this.presHouseNo = str29;
        this.presStreet = str30;
        this.presLocation = str31;
        this.presVillageOrTown = str32;
        this.presSubDistrict = str33;
        this.presDistrict = str34;
        this.presState = str35;
        this.presPincode = str36;
        this.perHouseNo = str37;
        this.perStreet = str38;
        this.perLocation = str39;
        this.permVillageOrTown = str40;
        this.perSubDistrict = str41;
        this.perDistrict = str21;
        this.perState = str22;
        this.perPinCode = str23;
        this.mobileNumber = str24;
        this.eKYCId = str25;
        this.eKYCOpted = str26;
        this.eKYCGender = str27;
        this.eKYCPhoto = str28;
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088 A[SYNTHETIC, Splitter:B:29:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab A[Catch:{ Exception -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object callWebService(tl.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.nic.mparivahan.dlservices.ui.dlextract.NonSarathi.GetAckNumberGen.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.nic.mparivahan.dlservices.ui.dlextract.NonSarathi.GetAckNumberGen$b r0 = (com.nic.mparivahan.dlservices.ui.dlextract.NonSarathi.GetAckNumberGen.b) r0
            int r1 = r0.f22027i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f22027i = r1
            goto L_0x0018
        L_0x0013:
            com.nic.mparivahan.dlservices.ui.dlextract.NonSarathi.GetAckNumberGen$b r0 = new com.nic.mparivahan.dlservices.ui.dlextract.NonSarathi.GetAckNumberGen$b
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f22025g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f22027i
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r1 = r0.f22024f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f22023e
            com.nic.mparivahan.dlservices.ui.dlextract.NonSarathi.GetAckNumberGen r0 = (com.nic.mparivahan.dlservices.ui.dlextract.NonSarathi.GetAckNumberGen) r0
            pl.q.b(r9)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0075
        L_0x0031:
            r9 = move-exception
            goto L_0x0103
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003c:
            pl.q.b(r9)
            si.b$a r9 = si.b.f31257a
            android.app.Application r2 = r8.app
            boolean r9 = r9.a(r2)
            if (r9 == 0) goto L_0x0129
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r8.app
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlExtraService> r4 = com.nic.mparivahan.dlservices.data.network.DlExtraService.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlExtraService r2 = (com.nic.mparivahan.dlservices.data.network.DlExtraService) r2
            com.nic.mparivahan.dlservices.ui.dlextract.NonSarathi.DlExRequestGen r4 = r8.getParam()     // Catch:{ Exception -> 0x0101 }
            r0.f22023e = r8     // Catch:{ Exception -> 0x0101 }
            r0.f22024f = r9     // Catch:{ Exception -> 0x0101 }
            r0.f22027i = r3     // Catch:{ Exception -> 0x0101 }
            java.lang.Object r0 = r2.getAckDlExtractGen(r4, r9, r0)     // Catch:{ Exception -> 0x0101 }
            if (r0 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r1 = r9
            r9 = r0
            r0 = r8
        L_0x0075:
            com.nic.mparivahan.Security.SecModle.SecurityModle r9 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r9     // Catch:{ Exception -> 0x0031 }
            java.lang.String r2 = "_update"
            java.lang.String r3 = r9.toString()     // Catch:{ Exception -> 0x0031 }
            android.util.Log.d(r2, r3)     // Catch:{ Exception -> 0x0031 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a9 }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x00ab
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a9 }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00a9 }
            byte[] r9 = r3.decode((java.lang.String) r9)     // Catch:{ Exception -> 0x00a9 }
            cm.l.e(r9, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a9 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a9 }
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r9 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a9 }
        L_0x00a4:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00c5
        L_0x00a9:
            r9 = move-exception
            goto L_0x00dd
        L_0x00ab:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00a9 }
            r3 = 0
            byte[] r9 = android.util.Base64.decode(r9, r3)     // Catch:{ Exception -> 0x00a9 }
            cm.l.e(r9, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00a9 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00a9 }
            r3.<init>(r9, r4)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r9 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00a4
        L_0x00c5:
            java.lang.String r1 = "DlExtractResp"
            android.util.Log.d(r1, r9)     // Catch:{ Exception -> 0x00a9 }
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x00a9 }
            r1.<init>()     // Catch:{ Exception -> 0x00a9 }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetEx> r2 = com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetEx.class
            java.lang.Object r9 = r1.j(r9, r2)     // Catch:{ Exception -> 0x00a9 }
            com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetEx r9 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetEx) r9     // Catch:{ Exception -> 0x00a9 }
            androidx.lifecycle.a0 r1 = r0.dlResponseData     // Catch:{ Exception -> 0x00a9 }
            r1.k(r9)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x0129
        L_0x00dd:
            r9.printStackTrace()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = "DlExtractErr"
            java.lang.String r9 = r9.getLocalizedMessage()     // Catch:{ Exception -> 0x0031 }
            android.util.Log.d(r1, r9)     // Catch:{ Exception -> 0x0031 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r2 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x0031 }
            android.app.Application r3 = r0.app     // Catch:{ Exception -> 0x0031 }
            v9.d$a r9 = v9.d.f17494a     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = r9.t()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r5 = "getAckDetForGivenDLNumber"
            java.lang.String r6 = r9.v()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r7 = r9.w()     // Catch:{ Exception -> 0x0031 }
            r2.a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0129
        L_0x0101:
            r9 = move-exception
            r0 = r8
        L_0x0103:
            java.lang.String r9 = r9.getMessage()
            if (r9 == 0) goto L_0x0112
            java.lang.String r1 = "dl_renewal_logginga"
            int r9 = android.util.Log.e(r1, r9)
            kotlin.coroutines.jvm.internal.b.b(r9)
        L_0x0112:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.app
            v9.d$a r9 = v9.d.f17494a
            java.lang.String r3 = r9.t()
            java.lang.String r4 = "getAckDetForGivenDLNumber"
            java.lang.String r5 = r9.v()
            java.lang.String r6 = r9.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x0129:
            pl.x r9 = pl.x.f30437a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dlextract.NonSarathi.GetAckNumberGen.callWebService(tl.d):java.lang.Object");
    }

    public final Application getApp() {
        return this.app;
    }

    public final String getDlHolderAltMobMum() {
        return this.dlHolderAltMobMum;
    }

    public final a0 getDlResponseData() {
        return this.dlResponseData;
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getDupDlReasonCode() {
        return this.dupDlReasonCode;
    }

    public final String getDupDlReasonName() {
        return this.dupDlReasonName;
    }

    public final String getEKYCGender() {
        return this.eKYCGender;
    }

    public final String getEKYCId() {
        return this.eKYCId;
    }

    public final String getEKYCOpted() {
        return this.eKYCOpted;
    }

    public final String getEKYCPhoto() {
        return this.eKYCPhoto;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final DlExRequestGen getParam() {
        Integer num = null;
        mj.a aVar = new mj.a((String) null, 1, (cm.g) null);
        aVar.a("DL Extract");
        DlExRequestGen dlExRequestGen = new DlExRequestGen((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (mj.a) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 1, (cm.g) null);
        dlExRequestGen.setDlno(this.dlno);
        dlExRequestGen.setDob(this.dob);
        dlExRequestGen.setRtoCodeDLTr(this.rtoCodeDLTr);
        dlExRequestGen.setWilltoDonateOrgans(this.willtoDonateOrgans);
        dlExRequestGen.setSelectedDLSerList(aVar);
        String str = this.dupDlReasonCode;
        if (str != null) {
            num = Integer.valueOf(Integer.parseInt(str));
        }
        dlExRequestGen.setDupDlReasonCode(num);
        dlExRequestGen.setDupDlReasonName(this.dupDlReasonName);
        dlExRequestGen.setDlHolderAltMobMum(this.dlHolderAltMobMum);
        dlExRequestGen.setPresHouseNo(this.presHouseNo);
        dlExRequestGen.setPresStreet(this.presStreet);
        dlExRequestGen.setPresLocation(this.presLocation);
        dlExRequestGen.setPresVillageOrTown(this.presVillageOrTown);
        dlExRequestGen.setPresSubDistrict(this.presSubDistrict);
        dlExRequestGen.setPresDistrict(this.presDistrict);
        dlExRequestGen.setPresState(this.presState);
        dlExRequestGen.setPresPincode(this.presPincode);
        dlExRequestGen.setPerHouseNo(this.perHouseNo);
        dlExRequestGen.setPerStreet(this.perStreet);
        dlExRequestGen.setPerLocation(this.perLocation);
        dlExRequestGen.setPermVillageOrTown(this.permVillageOrTown);
        dlExRequestGen.setPerSubDistrict(this.perSubDistrict);
        dlExRequestGen.setPerDistrict(this.perDistrict);
        dlExRequestGen.setPerState(this.perState);
        dlExRequestGen.setPerPinCode(this.perPinCode);
        dlExRequestGen.setMobileNumber(this.mobileNumber);
        Log.d("extract_req", dlExRequestGen.toString());
        return dlExRequestGen;
    }

    public final String getPerDistrict() {
        return this.perDistrict;
    }

    public final String getPerHouseNo() {
        return this.perHouseNo;
    }

    public final String getPerLocation() {
        return this.perLocation;
    }

    public final String getPerPinCode() {
        return this.perPinCode;
    }

    public final String getPerState() {
        return this.perState;
    }

    public final String getPerStreet() {
        return this.perStreet;
    }

    public final String getPerSubDistrict() {
        return this.perSubDistrict;
    }

    public final String getPermVillageOrTown() {
        return this.permVillageOrTown;
    }

    public final String getPresDistrict() {
        return this.presDistrict;
    }

    public final String getPresHouseNo() {
        return this.presHouseNo;
    }

    public final String getPresLocation() {
        return this.presLocation;
    }

    public final String getPresPincode() {
        return this.presPincode;
    }

    public final String getPresState() {
        return this.presState;
    }

    public final String getPresStreet() {
        return this.presStreet;
    }

    public final String getPresSubDistrict() {
        return this.presSubDistrict;
    }

    public final String getPresVillageOrTown() {
        return this.presVillageOrTown;
    }

    public final String getRtoCodeDLTr() {
        return this.rtoCodeDLTr;
    }

    public final String getWilltoDonateOrgans() {
        return this.willtoDonateOrgans;
    }

    public final void setDlHolderAltMobMum(String str) {
        this.dlHolderAltMobMum = str;
    }

    public final void setDlno(String str) {
        this.dlno = str;
    }

    public final void setDob(String str) {
        this.dob = str;
    }

    public final void setDupDlReasonCode(String str) {
        this.dupDlReasonCode = str;
    }

    public final void setDupDlReasonName(String str) {
        this.dupDlReasonName = str;
    }

    public final void setEKYCGender(String str) {
        cm.l.f(str, "<set-?>");
        this.eKYCGender = str;
    }

    public final void setEKYCId(String str) {
        cm.l.f(str, "<set-?>");
        this.eKYCId = str;
    }

    public final void setEKYCOpted(String str) {
        cm.l.f(str, "<set-?>");
        this.eKYCOpted = str;
    }

    public final void setEKYCPhoto(String str) {
        cm.l.f(str, "<set-?>");
        this.eKYCPhoto = str;
    }

    public final void setMobileNumber(String str) {
        cm.l.f(str, "<set-?>");
        this.mobileNumber = str;
    }

    public final void setPerDistrict(String str) {
        cm.l.f(str, "<set-?>");
        this.perDistrict = str;
    }

    public final void setPerHouseNo(String str) {
        cm.l.f(str, "<set-?>");
        this.perHouseNo = str;
    }

    public final void setPerLocation(String str) {
        cm.l.f(str, "<set-?>");
        this.perLocation = str;
    }

    public final void setPerPinCode(String str) {
        cm.l.f(str, "<set-?>");
        this.perPinCode = str;
    }

    public final void setPerState(String str) {
        cm.l.f(str, "<set-?>");
        this.perState = str;
    }

    public final void setPerStreet(String str) {
        cm.l.f(str, "<set-?>");
        this.perStreet = str;
    }

    public final void setPerSubDistrict(String str) {
        cm.l.f(str, "<set-?>");
        this.perSubDistrict = str;
    }

    public final void setPermVillageOrTown(String str) {
        cm.l.f(str, "<set-?>");
        this.permVillageOrTown = str;
    }

    public final void setPresDistrict(String str) {
        cm.l.f(str, "<set-?>");
        this.presDistrict = str;
    }

    public final void setPresHouseNo(String str) {
        cm.l.f(str, "<set-?>");
        this.presHouseNo = str;
    }

    public final void setPresLocation(String str) {
        cm.l.f(str, "<set-?>");
        this.presLocation = str;
    }

    public final void setPresPincode(String str) {
        cm.l.f(str, "<set-?>");
        this.presPincode = str;
    }

    public final void setPresState(String str) {
        cm.l.f(str, "<set-?>");
        this.presState = str;
    }

    public final void setPresStreet(String str) {
        cm.l.f(str, "<set-?>");
        this.presStreet = str;
    }

    public final void setPresSubDistrict(String str) {
        cm.l.f(str, "<set-?>");
        this.presSubDistrict = str;
    }

    public final void setPresVillageOrTown(String str) {
        cm.l.f(str, "<set-?>");
        this.presVillageOrTown = str;
    }

    public final void setRtoCodeDLTr(String str) {
        this.rtoCodeDLTr = str;
    }

    public final void setWilltoDonateOrgans(String str) {
        this.willtoDonateOrgans = str;
    }
}
