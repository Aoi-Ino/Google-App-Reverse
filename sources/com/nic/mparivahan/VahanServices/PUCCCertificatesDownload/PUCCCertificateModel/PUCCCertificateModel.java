package com.nic.mparivahan.VahanServices.PUCCCertificatesDownload.PUCCCertificateModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class PUCCCertificateModel {
    private final String pdfData;
    private final String statusCode;
    private final String statusDescr;

    public PUCCCertificateModel(String str, String str2, String str3) {
        l.f(str, "pdfData");
        l.f(str2, "statusCode");
        l.f(str3, "statusDescr");
        this.pdfData = str;
        this.statusCode = str2;
        this.statusDescr = str3;
    }

    public static /* synthetic */ PUCCCertificateModel copy$default(PUCCCertificateModel pUCCCertificateModel, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pUCCCertificateModel.pdfData;
        }
        if ((i10 & 2) != 0) {
            str2 = pUCCCertificateModel.statusCode;
        }
        if ((i10 & 4) != 0) {
            str3 = pUCCCertificateModel.statusDescr;
        }
        return pUCCCertificateModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.pdfData;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDescr;
    }

    public final PUCCCertificateModel copy(String str, String str2, String str3) {
        l.f(str, "pdfData");
        l.f(str2, "statusCode");
        l.f(str3, "statusDescr");
        return new PUCCCertificateModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PUCCCertificateModel)) {
            return false;
        }
        PUCCCertificateModel pUCCCertificateModel = (PUCCCertificateModel) obj;
        return l.a(this.pdfData, pUCCCertificateModel.pdfData) && l.a(this.statusCode, pUCCCertificateModel.statusCode) && l.a(this.statusDescr, pUCCCertificateModel.statusDescr);
    }

    public final String getPdfData() {
        return this.pdfData;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDescr() {
        return this.statusDescr;
    }

    public int hashCode() {
        return (((this.pdfData.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDescr.hashCode();
    }

    public String toString() {
        return "PUCCCertificateModel(pdfData=" + this.pdfData + ", statusCode=" + this.statusCode + ", statusDescr=" + this.statusDescr + ')';
    }
}
