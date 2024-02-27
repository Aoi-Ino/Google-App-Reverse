package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import j7.c;

@Keep
public final class DateSlotModel {
    @c("avalableSeats")
    private Integer availabelSeet;
    @c("quotadt")
    private String date;
    @c("hflag")
    private Boolean holidayFlag;
    @c("qaflag")
    private Boolean quotaAvailableFlag;
    @c("qcflag")
    private Boolean quotaCompleteFlag;
    @c("rtoCode")
    private String rtoCode;
    @c("slotNo")
    private Integer slotNo;
    @c("timeForDisp")
    private String time;

    public final Integer getAvailabelSeet() {
        return this.availabelSeet;
    }

    public final String getDate() {
        return this.date;
    }

    public final Boolean getHolidayFlag() {
        return this.holidayFlag;
    }

    public final Boolean getQuotaAvailableFlag() {
        return this.quotaAvailableFlag;
    }

    public final Boolean getQuotaCompleteFlag() {
        return this.quotaCompleteFlag;
    }

    public final String getRtoCode() {
        return this.rtoCode;
    }

    public final Integer getSlotNo() {
        return this.slotNo;
    }

    public final String getTime() {
        return this.time;
    }

    public final void setAvailabelSeet(Integer num) {
        this.availabelSeet = num;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setHolidayFlag(Boolean bool) {
        this.holidayFlag = bool;
    }

    public final void setQuotaAvailableFlag(Boolean bool) {
        this.quotaAvailableFlag = bool;
    }

    public final void setQuotaCompleteFlag(Boolean bool) {
        this.quotaCompleteFlag = bool;
    }

    public final void setRtoCode(String str) {
        this.rtoCode = str;
    }

    public final void setSlotNo(Integer num) {
        this.slotNo = num;
    }

    public final void setTime(String str) {
        this.time = str;
    }
}
