package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class RtoResponse {
    @c("rtosMasterDto")
    private final RtosMasterDto rtosMasterDto;

    public RtoResponse() {
        this((RtosMasterDto) null, 1, (g) null);
    }

    public static /* synthetic */ RtoResponse copy$default(RtoResponse rtoResponse, RtosMasterDto rtosMasterDto2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rtosMasterDto2 = rtoResponse.rtosMasterDto;
        }
        return rtoResponse.copy(rtosMasterDto2);
    }

    public final RtosMasterDto component1() {
        return this.rtosMasterDto;
    }

    public final RtoResponse copy(RtosMasterDto rtosMasterDto2) {
        return new RtoResponse(rtosMasterDto2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RtoResponse) && l.a(this.rtosMasterDto, ((RtoResponse) obj).rtosMasterDto);
    }

    public final RtosMasterDto getRtosMasterDto() {
        return this.rtosMasterDto;
    }

    public int hashCode() {
        RtosMasterDto rtosMasterDto2 = this.rtosMasterDto;
        if (rtosMasterDto2 == null) {
            return 0;
        }
        return rtosMasterDto2.hashCode();
    }

    public String toString() {
        return "RtoResponse(rtosMasterDto=" + this.rtosMasterDto + ')';
    }

    public RtoResponse(RtosMasterDto rtosMasterDto2) {
        this.rtosMasterDto = rtosMasterDto2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RtoResponse(RtosMasterDto rtosMasterDto2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : rtosMasterDto2);
    }
}
