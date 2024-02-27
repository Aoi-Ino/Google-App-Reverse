package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class UploadPhotoSignReqeust {
    private String aiApplno;
    private String aiSignatures;
    private String aiphotos;
    private String dateOfBirth;
    private String statecode;

    public UploadPhotoSignReqeust(String str, String str2, String str3, String str4, String str5) {
        l.f(str, "aiApplno");
        l.f(str2, "dateOfBirth");
        l.f(str3, "statecode");
        l.f(str4, "aiphotos");
        l.f(str5, "aiSignatures");
        this.aiApplno = str;
        this.dateOfBirth = str2;
        this.statecode = str3;
        this.aiphotos = str4;
        this.aiSignatures = str5;
    }

    public static /* synthetic */ UploadPhotoSignReqeust copy$default(UploadPhotoSignReqeust uploadPhotoSignReqeust, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = uploadPhotoSignReqeust.aiApplno;
        }
        if ((i10 & 2) != 0) {
            str2 = uploadPhotoSignReqeust.dateOfBirth;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = uploadPhotoSignReqeust.statecode;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = uploadPhotoSignReqeust.aiphotos;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = uploadPhotoSignReqeust.aiSignatures;
        }
        return uploadPhotoSignReqeust.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.aiApplno;
    }

    public final String component2() {
        return this.dateOfBirth;
    }

    public final String component3() {
        return this.statecode;
    }

    public final String component4() {
        return this.aiphotos;
    }

    public final String component5() {
        return this.aiSignatures;
    }

    public final UploadPhotoSignReqeust copy(String str, String str2, String str3, String str4, String str5) {
        l.f(str, "aiApplno");
        l.f(str2, "dateOfBirth");
        l.f(str3, "statecode");
        l.f(str4, "aiphotos");
        l.f(str5, "aiSignatures");
        return new UploadPhotoSignReqeust(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadPhotoSignReqeust)) {
            return false;
        }
        UploadPhotoSignReqeust uploadPhotoSignReqeust = (UploadPhotoSignReqeust) obj;
        return l.a(this.aiApplno, uploadPhotoSignReqeust.aiApplno) && l.a(this.dateOfBirth, uploadPhotoSignReqeust.dateOfBirth) && l.a(this.statecode, uploadPhotoSignReqeust.statecode) && l.a(this.aiphotos, uploadPhotoSignReqeust.aiphotos) && l.a(this.aiSignatures, uploadPhotoSignReqeust.aiSignatures);
    }

    public final String getAiApplno() {
        return this.aiApplno;
    }

    public final String getAiSignatures() {
        return this.aiSignatures;
    }

    public final String getAiphotos() {
        return this.aiphotos;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getStatecode() {
        return this.statecode;
    }

    public int hashCode() {
        return (((((((this.aiApplno.hashCode() * 31) + this.dateOfBirth.hashCode()) * 31) + this.statecode.hashCode()) * 31) + this.aiphotos.hashCode()) * 31) + this.aiSignatures.hashCode();
    }

    public final void setAiApplno(String str) {
        l.f(str, "<set-?>");
        this.aiApplno = str;
    }

    public final void setAiSignatures(String str) {
        l.f(str, "<set-?>");
        this.aiSignatures = str;
    }

    public final void setAiphotos(String str) {
        l.f(str, "<set-?>");
        this.aiphotos = str;
    }

    public final void setDateOfBirth(String str) {
        l.f(str, "<set-?>");
        this.dateOfBirth = str;
    }

    public final void setStatecode(String str) {
        l.f(str, "<set-?>");
        this.statecode = str;
    }

    public String toString() {
        return "UploadPhotoSignReqeust(aiApplno=" + this.aiApplno + ", dateOfBirth=" + this.dateOfBirth + ", statecode=" + this.statecode + ", aiphotos=" + this.aiphotos + ", aiSignatures=" + this.aiSignatures + ')';
    }
}
