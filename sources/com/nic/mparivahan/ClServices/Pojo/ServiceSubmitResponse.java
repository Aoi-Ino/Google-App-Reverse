package com.nic.mparivahan.ClServices.Pojo;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class ServiceSubmitResponse {
    private final List<ClServiceAckknowledgement> ClServiceAckknowledgement;
    private final String applied_Service;
    private final String status_code;
    private final String status_desc;

    public ServiceSubmitResponse(List<ClServiceAckknowledgement> list, String str, String str2, String str3) {
        l.f(list, "ClServiceAckknowledgement");
        l.f(str, "applied_Service");
        l.f(str2, "status_code");
        l.f(str3, "status_desc");
        this.ClServiceAckknowledgement = list;
        this.applied_Service = str;
        this.status_code = str2;
        this.status_desc = str3;
    }

    public static /* synthetic */ ServiceSubmitResponse copy$default(ServiceSubmitResponse serviceSubmitResponse, List<ClServiceAckknowledgement> list, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = serviceSubmitResponse.ClServiceAckknowledgement;
        }
        if ((i10 & 2) != 0) {
            str = serviceSubmitResponse.applied_Service;
        }
        if ((i10 & 4) != 0) {
            str2 = serviceSubmitResponse.status_code;
        }
        if ((i10 & 8) != 0) {
            str3 = serviceSubmitResponse.status_desc;
        }
        return serviceSubmitResponse.copy(list, str, str2, str3);
    }

    public final List<ClServiceAckknowledgement> component1() {
        return this.ClServiceAckknowledgement;
    }

    public final String component2() {
        return this.applied_Service;
    }

    public final String component3() {
        return this.status_code;
    }

    public final String component4() {
        return this.status_desc;
    }

    public final ServiceSubmitResponse copy(List<ClServiceAckknowledgement> list, String str, String str2, String str3) {
        l.f(list, "ClServiceAckknowledgement");
        l.f(str, "applied_Service");
        l.f(str2, "status_code");
        l.f(str3, "status_desc");
        return new ServiceSubmitResponse(list, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceSubmitResponse)) {
            return false;
        }
        ServiceSubmitResponse serviceSubmitResponse = (ServiceSubmitResponse) obj;
        return l.a(this.ClServiceAckknowledgement, serviceSubmitResponse.ClServiceAckknowledgement) && l.a(this.applied_Service, serviceSubmitResponse.applied_Service) && l.a(this.status_code, serviceSubmitResponse.status_code) && l.a(this.status_desc, serviceSubmitResponse.status_desc);
    }

    public final String getApplied_Service() {
        return this.applied_Service;
    }

    public final List<ClServiceAckknowledgement> getClServiceAckknowledgement() {
        return this.ClServiceAckknowledgement;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((((this.ClServiceAckknowledgement.hashCode() * 31) + this.applied_Service.hashCode()) * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "ServiceSubmitResponse(ClServiceAckknowledgement=" + this.ClServiceAckknowledgement + ", applied_Service=" + this.applied_Service + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
