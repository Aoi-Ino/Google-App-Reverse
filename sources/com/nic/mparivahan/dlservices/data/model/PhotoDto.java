package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.io.Serializable;

@Keep
public final class PhotoDto implements Serializable {
    @c("photo")
    private final String photo;
    @c("signature")
    private final String signature;

    public PhotoDto() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ PhotoDto copy$default(PhotoDto photoDto, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = photoDto.signature;
        }
        if ((i10 & 2) != 0) {
            str2 = photoDto.photo;
        }
        return photoDto.copy(str, str2);
    }

    public final String component1() {
        return this.signature;
    }

    public final String component2() {
        return this.photo;
    }

    public final PhotoDto copy(String str, String str2) {
        return new PhotoDto(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoDto)) {
            return false;
        }
        PhotoDto photoDto = (PhotoDto) obj;
        return l.a(this.signature, photoDto.signature) && l.a(this.photo, photoDto.photo);
    }

    public final String getPhoto() {
        return this.photo;
    }

    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        String str = this.signature;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.photo;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "PhotoDto(signature=" + this.signature + ", photo=" + this.photo + ')';
    }

    public PhotoDto(String str, String str2) {
        this.signature = str;
        this.photo = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhotoDto(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
