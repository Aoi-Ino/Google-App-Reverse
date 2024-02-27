package com.nic.mparivahan.dlservices.newlearner.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class DownloadLLResponseModal {
    @c("LLPrintStatus")
    private final String LLPrintStatus;
    @c("status_code")
    private final String status_code;
    @c("status_desc")
    private final String status_desc;

    public DownloadLLResponseModal() {
        this((String) null, (String) null, (String) null, 7, (g) null);
    }

    public static /* synthetic */ DownloadLLResponseModal copy$default(DownloadLLResponseModal downloadLLResponseModal, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = downloadLLResponseModal.status_code;
        }
        if ((i10 & 2) != 0) {
            str2 = downloadLLResponseModal.status_desc;
        }
        if ((i10 & 4) != 0) {
            str3 = downloadLLResponseModal.LLPrintStatus;
        }
        return downloadLLResponseModal.copy(str, str2, str3);
    }

    public final String component1() {
        return this.status_code;
    }

    public final String component2() {
        return this.status_desc;
    }

    public final String component3() {
        return this.LLPrintStatus;
    }

    public final DownloadLLResponseModal copy(String str, String str2, String str3) {
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        l.f(str3, "LLPrintStatus");
        return new DownloadLLResponseModal(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadLLResponseModal)) {
            return false;
        }
        DownloadLLResponseModal downloadLLResponseModal = (DownloadLLResponseModal) obj;
        return l.a(this.status_code, downloadLLResponseModal.status_code) && l.a(this.status_desc, downloadLLResponseModal.status_desc) && l.a(this.LLPrintStatus, downloadLLResponseModal.LLPrintStatus);
    }

    public final String getLLPrintStatus() {
        return this.LLPrintStatus;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.status_code.hashCode() * 31) + this.status_desc.hashCode()) * 31) + this.LLPrintStatus.hashCode();
    }

    public String toString() {
        return "DownloadLLResponseModal(status_code=" + this.status_code + ", status_desc=" + this.status_desc + ", LLPrintStatus=" + this.LLPrintStatus + ')';
    }

    public DownloadLLResponseModal(String str, String str2, String str3) {
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        l.f(str3, "LLPrintStatus");
        this.status_code = str;
        this.status_desc = str2;
        this.LLPrintStatus = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DownloadLLResponseModal(String str, String str2, String str3, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3);
    }
}
