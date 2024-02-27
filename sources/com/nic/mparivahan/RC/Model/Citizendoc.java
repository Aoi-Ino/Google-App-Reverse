package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Citizendoc {
    private final CitizenDocInfo citizenDocInfo;
    private final String statusCode;
    private final String statusDesc;

    public Citizendoc(CitizenDocInfo citizenDocInfo2, String str, String str2) {
        l.f(citizenDocInfo2, "citizenDocInfo");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.citizenDocInfo = citizenDocInfo2;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ Citizendoc copy$default(Citizendoc citizendoc, CitizenDocInfo citizenDocInfo2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            citizenDocInfo2 = citizendoc.citizenDocInfo;
        }
        if ((i10 & 2) != 0) {
            str = citizendoc.statusCode;
        }
        if ((i10 & 4) != 0) {
            str2 = citizendoc.statusDesc;
        }
        return citizendoc.copy(citizenDocInfo2, str, str2);
    }

    public final CitizenDocInfo component1() {
        return this.citizenDocInfo;
    }

    public final String component2() {
        return this.statusCode;
    }

    public final String component3() {
        return this.statusDesc;
    }

    public final Citizendoc copy(CitizenDocInfo citizenDocInfo2, String str, String str2) {
        l.f(citizenDocInfo2, "citizenDocInfo");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new Citizendoc(citizenDocInfo2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Citizendoc)) {
            return false;
        }
        Citizendoc citizendoc = (Citizendoc) obj;
        return l.a(this.citizenDocInfo, citizendoc.citizenDocInfo) && l.a(this.statusCode, citizendoc.statusCode) && l.a(this.statusDesc, citizendoc.statusDesc);
    }

    public final CitizenDocInfo getCitizenDocInfo() {
        return this.citizenDocInfo;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.citizenDocInfo.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "Citizendoc(citizenDocInfo=" + this.citizenDocInfo + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
