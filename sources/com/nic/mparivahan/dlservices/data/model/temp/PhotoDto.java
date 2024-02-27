package com.nic.mparivahan.dlservices.data.model.temp;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.List;

@Keep
public final class PhotoDto {
    @c("jsonArray")
    private final List<String> jsonArray;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public PhotoDto() {
        this((String) null, (String) null, (List) null, 7, (g) null);
    }

    public static /* synthetic */ PhotoDto copy$default(PhotoDto photoDto, String str, String str2, List<String> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = photoDto.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = photoDto.statusDesc;
        }
        if ((i10 & 4) != 0) {
            list = photoDto.jsonArray;
        }
        return photoDto.copy(str, str2, list);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final List<String> component3() {
        return this.jsonArray;
    }

    public final PhotoDto copy(String str, String str2, List<String> list) {
        return new PhotoDto(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoDto)) {
            return false;
        }
        PhotoDto photoDto = (PhotoDto) obj;
        return l.a(this.statusCode, photoDto.statusCode) && l.a(this.statusDesc, photoDto.statusDesc) && l.a(this.jsonArray, photoDto.jsonArray);
    }

    public final List<String> getJsonArray() {
        return this.jsonArray;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        String str = this.statusCode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.statusDesc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.jsonArray;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "PhotoDto(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", jsonArray=" + this.jsonArray + ')';
    }

    public PhotoDto(String str, String str2, List<String> list) {
        this.statusCode = str;
        this.statusDesc = str2;
        this.jsonArray = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhotoDto(String str, String str2, List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : list);
    }
}
