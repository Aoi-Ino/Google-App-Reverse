package com.nic.mparivahan.dlservices.ui.newlearner.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;

@Keep
public final class CountryResponseModal {
    @c("CountryMaster")
    private final ArrayList<CountryMasterResponseModal> drivingSchoolMasterList;
    @c("status_code")
    private final String statusCode;
    @c("status_desc")
    private final String statusDesc;

    public CountryResponseModal() {
        this((String) null, (String) null, (ArrayList) null, 7, (g) null);
    }

    public static /* synthetic */ CountryResponseModal copy$default(CountryResponseModal countryResponseModal, String str, String str2, ArrayList<CountryMasterResponseModal> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = countryResponseModal.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = countryResponseModal.statusDesc;
        }
        if ((i10 & 4) != 0) {
            arrayList = countryResponseModal.drivingSchoolMasterList;
        }
        return countryResponseModal.copy(str, str2, arrayList);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final ArrayList<CountryMasterResponseModal> component3() {
        return this.drivingSchoolMasterList;
    }

    public final CountryResponseModal copy(String str, String str2, ArrayList<CountryMasterResponseModal> arrayList) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new CountryResponseModal(str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountryResponseModal)) {
            return false;
        }
        CountryResponseModal countryResponseModal = (CountryResponseModal) obj;
        return l.a(this.statusCode, countryResponseModal.statusCode) && l.a(this.statusDesc, countryResponseModal.statusDesc) && l.a(this.drivingSchoolMasterList, countryResponseModal.drivingSchoolMasterList);
    }

    public final ArrayList<CountryMasterResponseModal> getDrivingSchoolMasterList() {
        return this.drivingSchoolMasterList;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        int hashCode = ((this.statusCode.hashCode() * 31) + this.statusDesc.hashCode()) * 31;
        ArrayList<CountryMasterResponseModal> arrayList = this.drivingSchoolMasterList;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "CountryResponseModal(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", drivingSchoolMasterList=" + this.drivingSchoolMasterList + ')';
    }

    public CountryResponseModal(String str, String str2, ArrayList<CountryMasterResponseModal> arrayList) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
        this.drivingSchoolMasterList = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CountryResponseModal(String str, String str2, ArrayList arrayList, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? null : arrayList);
    }
}
