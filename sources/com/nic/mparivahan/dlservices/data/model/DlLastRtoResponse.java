package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class DlLastRtoResponse {
    @c("dlLastRtoDetailsDto")
    private final DlLastRtoDetailsDto dlLastRtoDetailsDto;

    public DlLastRtoResponse() {
        this((DlLastRtoDetailsDto) null, 1, (g) null);
    }

    public static /* synthetic */ DlLastRtoResponse copy$default(DlLastRtoResponse dlLastRtoResponse, DlLastRtoDetailsDto dlLastRtoDetailsDto2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dlLastRtoDetailsDto2 = dlLastRtoResponse.dlLastRtoDetailsDto;
        }
        return dlLastRtoResponse.copy(dlLastRtoDetailsDto2);
    }

    public final DlLastRtoDetailsDto component1() {
        return this.dlLastRtoDetailsDto;
    }

    public final DlLastRtoResponse copy(DlLastRtoDetailsDto dlLastRtoDetailsDto2) {
        return new DlLastRtoResponse(dlLastRtoDetailsDto2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DlLastRtoResponse) && l.a(this.dlLastRtoDetailsDto, ((DlLastRtoResponse) obj).dlLastRtoDetailsDto);
    }

    public final DlLastRtoDetailsDto getDlLastRtoDetailsDto() {
        return this.dlLastRtoDetailsDto;
    }

    public int hashCode() {
        DlLastRtoDetailsDto dlLastRtoDetailsDto2 = this.dlLastRtoDetailsDto;
        if (dlLastRtoDetailsDto2 == null) {
            return 0;
        }
        return dlLastRtoDetailsDto2.hashCode();
    }

    public String toString() {
        return "DlLastRtoResponse(dlLastRtoDetailsDto=" + this.dlLastRtoDetailsDto + ')';
    }

    public DlLastRtoResponse(DlLastRtoDetailsDto dlLastRtoDetailsDto2) {
        this.dlLastRtoDetailsDto = dlLastRtoDetailsDto2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DlLastRtoResponse(DlLastRtoDetailsDto dlLastRtoDetailsDto2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : dlLastRtoDetailsDto2);
    }
}
