package com.nic.mparivahan.dlservices.data.model.duplicatedl;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class ReasonsMasterItem {
    @c("ReasonCode")
    private final Integer reasonCode;
    @c("ReasonName")
    private final String reasonName;

    public ReasonsMasterItem() {
        this((Integer) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ ReasonsMasterItem copy$default(ReasonsMasterItem reasonsMasterItem, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = reasonsMasterItem.reasonCode;
        }
        if ((i10 & 2) != 0) {
            str = reasonsMasterItem.reasonName;
        }
        return reasonsMasterItem.copy(num, str);
    }

    public final Integer component1() {
        return this.reasonCode;
    }

    public final String component2() {
        return this.reasonName;
    }

    public final ReasonsMasterItem copy(Integer num, String str) {
        return new ReasonsMasterItem(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReasonsMasterItem)) {
            return false;
        }
        ReasonsMasterItem reasonsMasterItem = (ReasonsMasterItem) obj;
        return l.a(this.reasonCode, reasonsMasterItem.reasonCode) && l.a(this.reasonName, reasonsMasterItem.reasonName);
    }

    public final Integer getReasonCode() {
        return this.reasonCode;
    }

    public final String getReasonName() {
        return this.reasonName;
    }

    public int hashCode() {
        Integer num = this.reasonCode;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.reasonName;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "ReasonsMasterItem(reasonCode=" + this.reasonCode + ", reasonName=" + this.reasonName + ')';
    }

    public ReasonsMasterItem(Integer num, String str) {
        this.reasonCode = num;
        this.reasonName = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReasonsMasterItem(Integer num, String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str);
    }
}
