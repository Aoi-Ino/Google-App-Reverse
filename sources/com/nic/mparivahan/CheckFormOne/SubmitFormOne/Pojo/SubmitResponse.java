package com.nic.mparivahan.CheckFormOne.SubmitFormOne.Pojo;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class SubmitResponse {
    private final List<FoneObject> foneObject;
    private final String status_code;
    private final String status_desc;

    public SubmitResponse(List<FoneObject> list, String str, String str2) {
        l.f(list, "foneObject");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        this.foneObject = list;
        this.status_code = str;
        this.status_desc = str2;
    }

    public static /* synthetic */ SubmitResponse copy$default(SubmitResponse submitResponse, List<FoneObject> list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = submitResponse.foneObject;
        }
        if ((i10 & 2) != 0) {
            str = submitResponse.status_code;
        }
        if ((i10 & 4) != 0) {
            str2 = submitResponse.status_desc;
        }
        return submitResponse.copy(list, str, str2);
    }

    public final List<FoneObject> component1() {
        return this.foneObject;
    }

    public final String component2() {
        return this.status_code;
    }

    public final String component3() {
        return this.status_desc;
    }

    public final SubmitResponse copy(List<FoneObject> list, String str, String str2) {
        l.f(list, "foneObject");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        return new SubmitResponse(list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitResponse)) {
            return false;
        }
        SubmitResponse submitResponse = (SubmitResponse) obj;
        return l.a(this.foneObject, submitResponse.foneObject) && l.a(this.status_code, submitResponse.status_code) && l.a(this.status_desc, submitResponse.status_desc);
    }

    public final List<FoneObject> getFoneObject() {
        return this.foneObject;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.foneObject.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "SubmitResponse(foneObject=" + this.foneObject + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
