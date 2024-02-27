package com.nic.mparivahan.dlservices.data.model.temp;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class DLRenewalPhotoNSignatureResponse {
    @c("photoDto")
    private final PhotoDto photoDto;
    @c("responseMsg")
    private final ResponseMsg responseMsg;

    public DLRenewalPhotoNSignatureResponse() {
        this((PhotoDto) null, (ResponseMsg) null, 3, (g) null);
    }

    public static /* synthetic */ DLRenewalPhotoNSignatureResponse copy$default(DLRenewalPhotoNSignatureResponse dLRenewalPhotoNSignatureResponse, PhotoDto photoDto2, ResponseMsg responseMsg2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            photoDto2 = dLRenewalPhotoNSignatureResponse.photoDto;
        }
        if ((i10 & 2) != 0) {
            responseMsg2 = dLRenewalPhotoNSignatureResponse.responseMsg;
        }
        return dLRenewalPhotoNSignatureResponse.copy(photoDto2, responseMsg2);
    }

    public final PhotoDto component1() {
        return this.photoDto;
    }

    public final ResponseMsg component2() {
        return this.responseMsg;
    }

    public final DLRenewalPhotoNSignatureResponse copy(PhotoDto photoDto2, ResponseMsg responseMsg2) {
        return new DLRenewalPhotoNSignatureResponse(photoDto2, responseMsg2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DLRenewalPhotoNSignatureResponse)) {
            return false;
        }
        DLRenewalPhotoNSignatureResponse dLRenewalPhotoNSignatureResponse = (DLRenewalPhotoNSignatureResponse) obj;
        return l.a(this.photoDto, dLRenewalPhotoNSignatureResponse.photoDto) && l.a(this.responseMsg, dLRenewalPhotoNSignatureResponse.responseMsg);
    }

    public final PhotoDto getPhotoDto() {
        return this.photoDto;
    }

    public final ResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    public int hashCode() {
        PhotoDto photoDto2 = this.photoDto;
        int i10 = 0;
        int hashCode = (photoDto2 == null ? 0 : photoDto2.hashCode()) * 31;
        ResponseMsg responseMsg2 = this.responseMsg;
        if (responseMsg2 != null) {
            i10 = responseMsg2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "DLRenewalPhotoNSignatureResponse(photoDto=" + this.photoDto + ", responseMsg=" + this.responseMsg + ')';
    }

    public DLRenewalPhotoNSignatureResponse(PhotoDto photoDto2, ResponseMsg responseMsg2) {
        this.photoDto = photoDto2;
        this.responseMsg = responseMsg2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DLRenewalPhotoNSignatureResponse(PhotoDto photoDto2, ResponseMsg responseMsg2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : photoDto2, (i10 & 2) != 0 ? null : responseMsg2);
    }
}
