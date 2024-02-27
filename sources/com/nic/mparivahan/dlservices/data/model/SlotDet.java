package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SlotDet {
    private int avalableSeats;
    private boolean hflag;
    private boolean qaflag;
    private boolean qcflag;
    private String quotadt = "";
    private String rtoCode = "";
    private int slotNo;
    private String timeForDisp = "";

    public final int getAvalableSeats() {
        return this.avalableSeats;
    }

    public final boolean getHflag() {
        return this.hflag;
    }

    public final boolean getQaflag() {
        return this.qaflag;
    }

    public final boolean getQcflag() {
        return this.qcflag;
    }

    public final String getQuotadt() {
        return this.quotadt;
    }

    public final String getRtoCode() {
        return this.rtoCode;
    }

    public final int getSlotNo() {
        return this.slotNo;
    }

    public final String getTimeForDisp() {
        return this.timeForDisp;
    }

    public final void setAvalableSeats(int i10) {
        this.avalableSeats = i10;
    }

    public final void setHflag(boolean z10) {
        this.hflag = z10;
    }

    public final void setQaflag(boolean z10) {
        this.qaflag = z10;
    }

    public final void setQcflag(boolean z10) {
        this.qcflag = z10;
    }

    public final void setQuotadt(String str) {
        l.f(str, "<set-?>");
        this.quotadt = str;
    }

    public final void setRtoCode(String str) {
        l.f(str, "<set-?>");
        this.rtoCode = str;
    }

    public final void setSlotNo(int i10) {
        this.slotNo = i10;
    }

    public final void setTimeForDisp(String str) {
        l.f(str, "<set-?>");
        this.timeForDisp = str;
    }
}
