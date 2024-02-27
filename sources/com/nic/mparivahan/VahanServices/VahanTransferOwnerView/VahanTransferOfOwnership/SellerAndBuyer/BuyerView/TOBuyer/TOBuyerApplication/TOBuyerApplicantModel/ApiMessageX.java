package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class ApiMessageX implements Serializable {
    private final String developerMessage;
    private final String message;
    private final Object messageParam;
    private final int statusCode;
    private final String timeStamp;

    public ApiMessageX(String str, String str2, Object obj, int i10, String str3) {
        this.developerMessage = str;
        this.message = str2;
        this.messageParam = obj;
        this.statusCode = i10;
        this.timeStamp = str3;
    }

    public static /* synthetic */ ApiMessageX copy$default(ApiMessageX apiMessageX, String str, String str2, Object obj, int i10, String str3, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = apiMessageX.developerMessage;
        }
        if ((i11 & 2) != 0) {
            str2 = apiMessageX.message;
        }
        String str4 = str2;
        if ((i11 & 4) != 0) {
            obj = apiMessageX.messageParam;
        }
        Object obj3 = obj;
        if ((i11 & 8) != 0) {
            i10 = apiMessageX.statusCode;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            str3 = apiMessageX.timeStamp;
        }
        return apiMessageX.copy(str, str4, obj3, i12, str3);
    }

    public final String component1() {
        return this.developerMessage;
    }

    public final String component2() {
        return this.message;
    }

    public final Object component3() {
        return this.messageParam;
    }

    public final int component4() {
        return this.statusCode;
    }

    public final String component5() {
        return this.timeStamp;
    }

    public final ApiMessageX copy(String str, String str2, Object obj, int i10, String str3) {
        return new ApiMessageX(str, str2, obj, i10, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiMessageX)) {
            return false;
        }
        ApiMessageX apiMessageX = (ApiMessageX) obj;
        return l.a(this.developerMessage, apiMessageX.developerMessage) && l.a(this.message, apiMessageX.message) && l.a(this.messageParam, apiMessageX.messageParam) && this.statusCode == apiMessageX.statusCode && l.a(this.timeStamp, apiMessageX.timeStamp);
    }

    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Object getMessageParam() {
        return this.messageParam;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        String str = this.developerMessage;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.messageParam;
        int hashCode3 = (((hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31) + Integer.hashCode(this.statusCode)) * 31;
        String str3 = this.timeStamp;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "ApiMessageX(developerMessage=" + this.developerMessage + ", message=" + this.message + ", messageParam=" + this.messageParam + ", statusCode=" + this.statusCode + ", timeStamp=" + this.timeStamp + ')';
    }
}
