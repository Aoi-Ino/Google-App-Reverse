package com.nic.mparivahan;

public class APIController {

    /* renamed from: a  reason: collision with root package name */
    private static APIController f7637a;

    static {
        System.loadLibrary("system-arch");
    }

    public static APIController a() {
        if (f7637a == null) {
            f7637a = new APIController();
        }
        return f7637a;
    }

    public native String echallanPaymentPro();

    public native String getAuth();

    public native String getConst();

    public native String getDPTNoticeStg();

    public native String getEchallanLogStg();

    public native String getEchallanPro();

    public native String getH();

    public native String getImageViewProd();

    public native String getNapixBase1();

    public native String getNapixBase2();

    public native String getNapixKeyUser();

    public native String getNexGenAlertPro();

    public native String getNexGenAuditPro();

    public native String getNexGenBannerPro();

    public native String getNexGenCitizenPro();

    public native String getNexGenLanguagePro();

    public native String getNexGenMasterPro();

    public native String getNexGenNrapiPro();

    public native String getNexGenReportPro();

    public native String getNexGenSosPro();

    public native String getNexGenTrafficPro();

    public native String getNexGenVirtualDocPro();

    public native String getPagesPro();

    public native String getPasswordProd();

    public native String getPaymentUrlProd();

    public native String getSarthiPro();

    public native String getUsernameProd();

    public native String getVahanApplStatuPro();

    public native String getVahanFormPro();

    public native String getVahanPro();

    public native String sarthiDMSKey();

    public native String sarthiKey();
}
