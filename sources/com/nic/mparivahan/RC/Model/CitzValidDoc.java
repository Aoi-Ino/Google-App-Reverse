package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class CitzValidDoc {
    private final CitizenDocInfoX citizenDocInfo;
    private final String param;
    private final String statusCode;
    private final String statusDesc;

    public CitzValidDoc(CitizenDocInfoX citizenDocInfoX, String str, String str2, String str3) {
        this.citizenDocInfo = citizenDocInfoX;
        this.statusCode = str;
        this.statusDesc = str2;
        this.param = str3;
    }

    public static /* synthetic */ CitzValidDoc copy$default(CitzValidDoc citzValidDoc, CitizenDocInfoX citizenDocInfoX, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            citizenDocInfoX = citzValidDoc.citizenDocInfo;
        }
        if ((i10 & 2) != 0) {
            str = citzValidDoc.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = citzValidDoc.statusDesc;
        }
        if ((i10 & 8) != 0) {
            str3 = citzValidDoc.param;
        }
        return citzValidDoc.copy(citizenDocInfoX, str, str2, str3);
    }

    public final CitizenDocInfoX component1() {
        return this.citizenDocInfo;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final String component4() {
        return this.param;
    }

    public final CitzValidDoc copy(CitizenDocInfoX citizenDocInfoX, String str, String str2, String str3) {
        return new CitzValidDoc(citizenDocInfoX, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CitzValidDoc)) {
            return false;
        }
        CitzValidDoc citzValidDoc = (CitzValidDoc) obj;
        return l.a(this.citizenDocInfo, citzValidDoc.citizenDocInfo) && l.a(this.statusCode, citzValidDoc.statusCode) && l.a(this.statusDesc, citzValidDoc.statusDesc) && l.a(this.param, citzValidDoc.param);
    }

    public final CitizenDocInfoX getCitizenDocInfo() {
        return this.citizenDocInfo;
    }

    public final String getParam() {
        return this.param;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        CitizenDocInfoX citizenDocInfoX = this.citizenDocInfo;
        int i10 = 0;
        int hashCode = (citizenDocInfoX == null ? 0 : citizenDocInfoX.hashCode()) * 31;
        String str = this.statusCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusDesc;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.param;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "CitzValidDoc(citizenDocInfo=" + this.citizenDocInfo + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", param=" + this.param + ')';
    }
}
