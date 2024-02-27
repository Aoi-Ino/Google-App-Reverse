package com.nic.mparivahan.AddCov.PojoClass;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class CovDataSubmit {
    private final ArrayList<ApplStatusACKDetail> ApplStatus_ACK_Details;
    private final String status_code;
    private final String status_desc;

    public CovDataSubmit(ArrayList<ApplStatusACKDetail> arrayList, String str, String str2) {
        l.f(arrayList, "ApplStatus_ACK_Details");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        this.ApplStatus_ACK_Details = arrayList;
        this.status_code = str;
        this.status_desc = str2;
    }

    public static /* synthetic */ CovDataSubmit copy$default(CovDataSubmit covDataSubmit, ArrayList<ApplStatusACKDetail> arrayList, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = covDataSubmit.ApplStatus_ACK_Details;
        }
        if ((i10 & 2) != 0) {
            str = covDataSubmit.status_code;
        }
        if ((i10 & 4) != 0) {
            str2 = covDataSubmit.status_desc;
        }
        return covDataSubmit.copy(arrayList, str, str2);
    }

    public final ArrayList<ApplStatusACKDetail> component1() {
        return this.ApplStatus_ACK_Details;
    }

    public final String component2() {
        return this.status_code;
    }

    public final String component3() {
        return this.status_desc;
    }

    public final CovDataSubmit copy(ArrayList<ApplStatusACKDetail> arrayList, String str, String str2) {
        l.f(arrayList, "ApplStatus_ACK_Details");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        return new CovDataSubmit(arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CovDataSubmit)) {
            return false;
        }
        CovDataSubmit covDataSubmit = (CovDataSubmit) obj;
        return l.a(this.ApplStatus_ACK_Details, covDataSubmit.ApplStatus_ACK_Details) && l.a(this.status_code, covDataSubmit.status_code) && l.a(this.status_desc, covDataSubmit.status_desc);
    }

    public final ArrayList<ApplStatusACKDetail> getApplStatus_ACK_Details() {
        return this.ApplStatus_ACK_Details;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.ApplStatus_ACK_Details.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "CovDataSubmit(ApplStatus_ACK_Details=" + this.ApplStatus_ACK_Details + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
