package com.nic.mparivahan.DPTNotice.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class NoticeCourtProceedingDataModel {
    @c("date_of_proceeding")
    private final String date_of_proceeding;
    @c("fine_imposed")
    private final String fine_imposed;
    @c("party_name")
    private final String party_name;

    public NoticeCourtProceedingDataModel() {
        this((String) null, (String) null, (String) null, 7, (g) null);
    }

    public static /* synthetic */ NoticeCourtProceedingDataModel copy$default(NoticeCourtProceedingDataModel noticeCourtProceedingDataModel, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = noticeCourtProceedingDataModel.date_of_proceeding;
        }
        if ((i10 & 2) != 0) {
            str2 = noticeCourtProceedingDataModel.fine_imposed;
        }
        if ((i10 & 4) != 0) {
            str3 = noticeCourtProceedingDataModel.party_name;
        }
        return noticeCourtProceedingDataModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.date_of_proceeding;
    }

    public final String component2() {
        return this.fine_imposed;
    }

    public final String component3() {
        return this.party_name;
    }

    public final NoticeCourtProceedingDataModel copy(String str, String str2, String str3) {
        l.f(str, "date_of_proceeding");
        l.f(str2, "fine_imposed");
        l.f(str3, "party_name");
        return new NoticeCourtProceedingDataModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeCourtProceedingDataModel)) {
            return false;
        }
        NoticeCourtProceedingDataModel noticeCourtProceedingDataModel = (NoticeCourtProceedingDataModel) obj;
        return l.a(this.date_of_proceeding, noticeCourtProceedingDataModel.date_of_proceeding) && l.a(this.fine_imposed, noticeCourtProceedingDataModel.fine_imposed) && l.a(this.party_name, noticeCourtProceedingDataModel.party_name);
    }

    public final String getDate_of_proceeding() {
        return this.date_of_proceeding;
    }

    public final String getFine_imposed() {
        return this.fine_imposed;
    }

    public final String getParty_name() {
        return this.party_name;
    }

    public int hashCode() {
        return (((this.date_of_proceeding.hashCode() * 31) + this.fine_imposed.hashCode()) * 31) + this.party_name.hashCode();
    }

    public String toString() {
        return "NoticeCourtProceedingDataModel(date_of_proceeding=" + this.date_of_proceeding + ", fine_imposed=" + this.fine_imposed + ", party_name=" + this.party_name + ')';
    }

    public NoticeCourtProceedingDataModel(String str, String str2, String str3) {
        l.f(str, "date_of_proceeding");
        l.f(str2, "fine_imposed");
        l.f(str3, "party_name");
        this.date_of_proceeding = str;
        this.fine_imposed = str2;
        this.party_name = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NoticeCourtProceedingDataModel(String str, String str2, String str3, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3);
    }
}
