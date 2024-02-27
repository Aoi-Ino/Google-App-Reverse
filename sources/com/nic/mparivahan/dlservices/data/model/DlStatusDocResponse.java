package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.io.Serializable;

@Keep
public final class DlStatusDocResponse implements Serializable {
    @c("isekyc")
    private final Boolean isekyc;
    @c("isvalid")
    private final Boolean isvalid;
    @c("message")
    private final ResponseMsg message;
    @c("uploadAcStatus")
    private final Object uploadAcStatus;

    public DlStatusDocResponse(Boolean bool, Boolean bool2, Object obj, ResponseMsg responseMsg) {
        this.isvalid = bool;
        this.isekyc = bool2;
        this.uploadAcStatus = obj;
        this.message = responseMsg;
    }

    public static /* synthetic */ DlStatusDocResponse copy$default(DlStatusDocResponse dlStatusDocResponse, Boolean bool, Boolean bool2, Object obj, ResponseMsg responseMsg, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            bool = dlStatusDocResponse.isvalid;
        }
        if ((i10 & 2) != 0) {
            bool2 = dlStatusDocResponse.isekyc;
        }
        if ((i10 & 4) != 0) {
            obj = dlStatusDocResponse.uploadAcStatus;
        }
        if ((i10 & 8) != 0) {
            responseMsg = dlStatusDocResponse.message;
        }
        return dlStatusDocResponse.copy(bool, bool2, obj, responseMsg);
    }

    public final Boolean component1() {
        return this.isvalid;
    }

    public final Boolean component2() {
        return this.isekyc;
    }

    public final Object component3() {
        return this.uploadAcStatus;
    }

    public final ResponseMsg component4() {
        return this.message;
    }

    public final DlStatusDocResponse copy(Boolean bool, Boolean bool2, Object obj, ResponseMsg responseMsg) {
        return new DlStatusDocResponse(bool, bool2, obj, responseMsg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlStatusDocResponse)) {
            return false;
        }
        DlStatusDocResponse dlStatusDocResponse = (DlStatusDocResponse) obj;
        return l.a(this.isvalid, dlStatusDocResponse.isvalid) && l.a(this.isekyc, dlStatusDocResponse.isekyc) && l.a(this.uploadAcStatus, dlStatusDocResponse.uploadAcStatus) && l.a(this.message, dlStatusDocResponse.message);
    }

    public final Boolean getIsekyc() {
        return this.isekyc;
    }

    public final Boolean getIsvalid() {
        return this.isvalid;
    }

    public final ResponseMsg getMessage() {
        return this.message;
    }

    public final Object getUploadAcStatus() {
        return this.uploadAcStatus;
    }

    public int hashCode() {
        Boolean bool = this.isvalid;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isekyc;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Object obj = this.uploadAcStatus;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        ResponseMsg responseMsg = this.message;
        if (responseMsg != null) {
            i10 = responseMsg.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "DlStatusDocResponse(isvalid=" + this.isvalid + ", isekyc=" + this.isekyc + ", uploadAcStatus=" + this.uploadAcStatus + ", message=" + this.message + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DlStatusDocResponse(Boolean bool, Boolean bool2, Object obj, ResponseMsg responseMsg, int i10, g gVar) {
        this(bool, bool2, obj, (i10 & 8) != 0 ? null : responseMsg);
    }
}
