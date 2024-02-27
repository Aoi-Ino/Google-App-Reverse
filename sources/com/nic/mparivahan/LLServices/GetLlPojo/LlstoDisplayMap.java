package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class LlstoDisplayMap implements Serializable {
    private final String covs;
    private final String equivalentCovs;
    private final String expiresOn;
    private final String issueDate;
    private final String llNumber;
    private final String oldLLNumber;

    public LlstoDisplayMap(String str, String str2, String str3, String str4, String str5, String str6) {
        l.f(str, "covs");
        l.f(str2, "equivalentCovs");
        l.f(str3, "expiresOn");
        l.f(str4, "issueDate");
        l.f(str5, "llNumber");
        l.f(str6, "oldLLNumber");
        this.covs = str;
        this.equivalentCovs = str2;
        this.expiresOn = str3;
        this.issueDate = str4;
        this.llNumber = str5;
        this.oldLLNumber = str6;
    }

    public static /* synthetic */ LlstoDisplayMap copy$default(LlstoDisplayMap llstoDisplayMap, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = llstoDisplayMap.covs;
        }
        if ((i10 & 2) != 0) {
            str2 = llstoDisplayMap.equivalentCovs;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = llstoDisplayMap.expiresOn;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = llstoDisplayMap.issueDate;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = llstoDisplayMap.llNumber;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = llstoDisplayMap.oldLLNumber;
        }
        return llstoDisplayMap.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.covs;
    }

    public final String component2() {
        return this.equivalentCovs;
    }

    public final String component3() {
        return this.expiresOn;
    }

    public final String component4() {
        return this.issueDate;
    }

    public final String component5() {
        return this.llNumber;
    }

    public final String component6() {
        return this.oldLLNumber;
    }

    public final LlstoDisplayMap copy(String str, String str2, String str3, String str4, String str5, String str6) {
        l.f(str, "covs");
        l.f(str2, "equivalentCovs");
        l.f(str3, "expiresOn");
        l.f(str4, "issueDate");
        l.f(str5, "llNumber");
        l.f(str6, "oldLLNumber");
        return new LlstoDisplayMap(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LlstoDisplayMap)) {
            return false;
        }
        LlstoDisplayMap llstoDisplayMap = (LlstoDisplayMap) obj;
        return l.a(this.covs, llstoDisplayMap.covs) && l.a(this.equivalentCovs, llstoDisplayMap.equivalentCovs) && l.a(this.expiresOn, llstoDisplayMap.expiresOn) && l.a(this.issueDate, llstoDisplayMap.issueDate) && l.a(this.llNumber, llstoDisplayMap.llNumber) && l.a(this.oldLLNumber, llstoDisplayMap.oldLLNumber);
    }

    public final String getCovs() {
        return this.covs;
    }

    public final String getEquivalentCovs() {
        return this.equivalentCovs;
    }

    public final String getExpiresOn() {
        return this.expiresOn;
    }

    public final String getIssueDate() {
        return this.issueDate;
    }

    public final String getLlNumber() {
        return this.llNumber;
    }

    public final String getOldLLNumber() {
        return this.oldLLNumber;
    }

    public int hashCode() {
        return (((((((((this.covs.hashCode() * 31) + this.equivalentCovs.hashCode()) * 31) + this.expiresOn.hashCode()) * 31) + this.issueDate.hashCode()) * 31) + this.llNumber.hashCode()) * 31) + this.oldLLNumber.hashCode();
    }

    public String toString() {
        return "LlstoDisplayMap(covs=" + this.covs + ", equivalentCovs=" + this.equivalentCovs + ", expiresOn=" + this.expiresOn + ", issueDate=" + this.issueDate + ", llNumber=" + this.llNumber + ", oldLLNumber=" + this.oldLLNumber + ')';
    }
}
