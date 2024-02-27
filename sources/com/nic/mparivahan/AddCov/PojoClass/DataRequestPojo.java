package com.nic.mparivahan.AddCov.PojoClass;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DataRequestPojo {
    private final ApplStatusDetails ApplStatus_Details;
    private final String status_code;
    private final String status_desc;

    public DataRequestPojo(ApplStatusDetails applStatusDetails, String str, String str2) {
        l.f(applStatusDetails, "ApplStatus_Details");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        this.ApplStatus_Details = applStatusDetails;
        this.status_code = str;
        this.status_desc = str2;
    }

    public static /* synthetic */ DataRequestPojo copy$default(DataRequestPojo dataRequestPojo, ApplStatusDetails applStatusDetails, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            applStatusDetails = dataRequestPojo.ApplStatus_Details;
        }
        if ((i10 & 2) != 0) {
            str = dataRequestPojo.status_code;
        }
        if ((i10 & 4) != 0) {
            str2 = dataRequestPojo.status_desc;
        }
        return dataRequestPojo.copy(applStatusDetails, str, str2);
    }

    public final ApplStatusDetails component1() {
        return this.ApplStatus_Details;
    }

    public final String component2() {
        return this.status_code;
    }

    public final String component3() {
        return this.status_desc;
    }

    public final DataRequestPojo copy(ApplStatusDetails applStatusDetails, String str, String str2) {
        l.f(applStatusDetails, "ApplStatus_Details");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        return new DataRequestPojo(applStatusDetails, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataRequestPojo)) {
            return false;
        }
        DataRequestPojo dataRequestPojo = (DataRequestPojo) obj;
        return l.a(this.ApplStatus_Details, dataRequestPojo.ApplStatus_Details) && l.a(this.status_code, dataRequestPojo.status_code) && l.a(this.status_desc, dataRequestPojo.status_desc);
    }

    public final ApplStatusDetails getApplStatus_Details() {
        return this.ApplStatus_Details;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.ApplStatus_Details.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "DataRequestPojo(ApplStatus_Details=" + this.ApplStatus_Details + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
