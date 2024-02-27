package com.nic.mparivahan.dlservices.data.model.mobupdate;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class DlUpdateMobResponse {
    @c("errcnt")
    private final Integer errcnt;
    @c("errmsg")
    private final String errmsg;
    @c("errno")
    private final Integer errno;
    @c("iserrflag")
    private final Boolean iserrflag;

    public DlUpdateMobResponse() {
        this((Integer) null, (Integer) null, (String) null, (Boolean) null, 15, (g) null);
    }

    public static /* synthetic */ DlUpdateMobResponse copy$default(DlUpdateMobResponse dlUpdateMobResponse, Integer num, Integer num2, String str, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = dlUpdateMobResponse.errcnt;
        }
        if ((i10 & 2) != 0) {
            num2 = dlUpdateMobResponse.errno;
        }
        if ((i10 & 4) != 0) {
            str = dlUpdateMobResponse.errmsg;
        }
        if ((i10 & 8) != 0) {
            bool = dlUpdateMobResponse.iserrflag;
        }
        return dlUpdateMobResponse.copy(num, num2, str, bool);
    }

    public final Integer component1() {
        return this.errcnt;
    }

    public final Integer component2() {
        return this.errno;
    }

    public final String component3() {
        return this.errmsg;
    }

    public final Boolean component4() {
        return this.iserrflag;
    }

    public final DlUpdateMobResponse copy(Integer num, Integer num2, String str, Boolean bool) {
        return new DlUpdateMobResponse(num, num2, str, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DlUpdateMobResponse)) {
            return false;
        }
        DlUpdateMobResponse dlUpdateMobResponse = (DlUpdateMobResponse) obj;
        return l.a(this.errcnt, dlUpdateMobResponse.errcnt) && l.a(this.errno, dlUpdateMobResponse.errno) && l.a(this.errmsg, dlUpdateMobResponse.errmsg) && l.a(this.iserrflag, dlUpdateMobResponse.iserrflag);
    }

    public final Integer getErrcnt() {
        return this.errcnt;
    }

    public final String getErrmsg() {
        return this.errmsg;
    }

    public final Integer getErrno() {
        return this.errno;
    }

    public final Boolean getIserrflag() {
        return this.iserrflag;
    }

    public int hashCode() {
        Integer num = this.errcnt;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.errno;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.errmsg;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.iserrflag;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "DlUpdateMobResponse(errcnt=" + this.errcnt + ", errno=" + this.errno + ", errmsg=" + this.errmsg + ", iserrflag=" + this.iserrflag + ')';
    }

    public DlUpdateMobResponse(Integer num, Integer num2, String str, Boolean bool) {
        this.errcnt = num;
        this.errno = num2;
        this.errmsg = str;
        this.iserrflag = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DlUpdateMobResponse(Integer num, Integer num2, String str, Boolean bool, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : bool);
    }
}
