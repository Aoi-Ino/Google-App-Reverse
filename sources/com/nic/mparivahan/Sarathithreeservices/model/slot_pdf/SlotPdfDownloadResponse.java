package com.nic.mparivahan.Sarathithreeservices.model.slot_pdf;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SlotPdfDownloadResponse {
    private final String Reportdets;
    private final String status_code;
    private final String status_desc;

    public SlotPdfDownloadResponse(String str, String str2, String str3) {
        l.f(str, "Reportdets");
        l.f(str2, "status_code");
        l.f(str3, "status_desc");
        this.Reportdets = str;
        this.status_code = str2;
        this.status_desc = str3;
    }

    public static /* synthetic */ SlotPdfDownloadResponse copy$default(SlotPdfDownloadResponse slotPdfDownloadResponse, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = slotPdfDownloadResponse.Reportdets;
        }
        if ((i10 & 2) != 0) {
            str2 = slotPdfDownloadResponse.status_code;
        }
        if ((i10 & 4) != 0) {
            str3 = slotPdfDownloadResponse.status_desc;
        }
        return slotPdfDownloadResponse.copy(str, str2, str3);
    }

    public final String component1() {
        return this.Reportdets;
    }

    public final String component2() {
        return this.status_code;
    }

    public final String component3() {
        return this.status_desc;
    }

    public final SlotPdfDownloadResponse copy(String str, String str2, String str3) {
        l.f(str, "Reportdets");
        l.f(str2, "status_code");
        l.f(str3, "status_desc");
        return new SlotPdfDownloadResponse(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotPdfDownloadResponse)) {
            return false;
        }
        SlotPdfDownloadResponse slotPdfDownloadResponse = (SlotPdfDownloadResponse) obj;
        return l.a(this.Reportdets, slotPdfDownloadResponse.Reportdets) && l.a(this.status_code, slotPdfDownloadResponse.status_code) && l.a(this.status_desc, slotPdfDownloadResponse.status_desc);
    }

    public final String getReportdets() {
        return this.Reportdets;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.Reportdets.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "SlotPdfDownloadResponse(Reportdets=" + this.Reportdets + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
