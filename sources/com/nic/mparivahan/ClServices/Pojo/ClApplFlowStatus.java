package com.nic.mparivahan.ClServices.Pojo;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class ClApplFlowStatus {
    private int acCd;
    private String acDesc = "";
    private int flowSlno;
    private String status = "";
    private int trCd;
    private String trName = "";

    public final int getAcCd() {
        return this.acCd;
    }

    public final String getAcDesc() {
        return this.acDesc;
    }

    public final int getFlowSlno() {
        return this.flowSlno;
    }

    public final String getStatus() {
        return this.status;
    }

    public final int getTrCd() {
        return this.trCd;
    }

    public final String getTrName() {
        return this.trName;
    }

    public final void setAcCd(int i10) {
        this.acCd = i10;
    }

    public final void setAcDesc(String str) {
        l.f(str, "<set-?>");
        this.acDesc = str;
    }

    public final void setFlowSlno(int i10) {
        this.flowSlno = i10;
    }

    public final void setStatus(String str) {
        l.f(str, "<set-?>");
        this.status = str;
    }

    public final void setTrCd(int i10) {
        this.trCd = i10;
    }

    public final void setTrName(String str) {
        l.f(str, "<set-?>");
        this.trName = str;
    }
}
