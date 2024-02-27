package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class ImageVerificationResponse {
    @c("responseMsg")
    private final ImgResponseMsg responseMsg;

    public ImageVerificationResponse() {
        this((ImgResponseMsg) null, 1, (g) null);
    }

    public static /* synthetic */ ImageVerificationResponse copy$default(ImageVerificationResponse imageVerificationResponse, ImgResponseMsg imgResponseMsg, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            imgResponseMsg = imageVerificationResponse.responseMsg;
        }
        return imageVerificationResponse.copy(imgResponseMsg);
    }

    public final ImgResponseMsg component1() {
        return this.responseMsg;
    }

    public final ImageVerificationResponse copy(ImgResponseMsg imgResponseMsg) {
        return new ImageVerificationResponse(imgResponseMsg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageVerificationResponse) && l.a(this.responseMsg, ((ImageVerificationResponse) obj).responseMsg);
    }

    public final ImgResponseMsg getResponseMsg() {
        return this.responseMsg;
    }

    public int hashCode() {
        ImgResponseMsg imgResponseMsg = this.responseMsg;
        if (imgResponseMsg == null) {
            return 0;
        }
        return imgResponseMsg.hashCode();
    }

    public String toString() {
        return "ImageVerificationResponse(responseMsg=" + this.responseMsg + ')';
    }

    public ImageVerificationResponse(ImgResponseMsg imgResponseMsg) {
        this.responseMsg = imgResponseMsg;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageVerificationResponse(ImgResponseMsg imgResponseMsg, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : imgResponseMsg);
    }
}
