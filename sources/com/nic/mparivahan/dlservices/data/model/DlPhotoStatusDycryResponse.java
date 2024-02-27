package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.io.Serializable;

@Keep
public final class DlPhotoStatusDycryResponse implements Serializable {
    @c("photoDto")
    private final PhotoDto photoDto;
    @c("responseMsg")
    private final ResponseMsg responseMsg;

    public DlPhotoStatusDycryResponse() {
        this((ResponseMsg) null, (PhotoDto) null, 3, (g) null);
    }

    public static /* synthetic */ DlPhotoStatusDycryResponse copy$default(DlPhotoStatusDycryResponse dlPhotoStatusDycryResponse, ResponseMsg responseMsg2, PhotoDto photoDto2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            responseMsg2 = dlPhotoStatusDycryResponse.responseMsg;
        }
        if ((i10 & 2) != 0) {
            photoDto2 = dlPhotoStatusDycryResponse.photoDto;
        }
        return dlPhotoStatusDycryResponse.copy(responseMsg2, photoDto2);
    }

    public final ResponseMsg component1() {
        return this.responseMsg;
    }

    public final PhotoDto component2() {
        return this.photoDto;
    }

    public final DlPhotoStatusDycryResponse copy(ResponseMsg responseMsg2, PhotoDto photoDto2) {
        return new DlPhotoStatusDycryResponse(responseMsg2, photoDto2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlPhotoStatusDycryResponse)) {
            return false;
        }
        DlPhotoStatusDycryResponse dlPhotoStatusDycryResponse = (DlPhotoStatusDycryResponse) obj;
        return l.a(this.responseMsg, dlPhotoStatusDycryResponse.responseMsg) && l.a(this.photoDto, dlPhotoStatusDycryResponse.photoDto);
    }

    public final PhotoDto getPhotoDto() {
        return this.photoDto;
    }

    public final ResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    public int hashCode() {
        ResponseMsg responseMsg2 = this.responseMsg;
        int i10 = 0;
        int hashCode = (responseMsg2 == null ? 0 : responseMsg2.hashCode()) * 31;
        PhotoDto photoDto2 = this.photoDto;
        if (photoDto2 != null) {
            i10 = photoDto2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "DlPhotoStatusDycryResponse(responseMsg=" + this.responseMsg + ", photoDto=" + this.photoDto + ')';
    }

    public DlPhotoStatusDycryResponse(ResponseMsg responseMsg2, PhotoDto photoDto2) {
        this.responseMsg = responseMsg2;
        this.photoDto = photoDto2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DlPhotoStatusDycryResponse(ResponseMsg responseMsg2, PhotoDto photoDto2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : responseMsg2, (i10 & 2) != 0 ? null : photoDto2);
    }
}
