package com.nic.mparivahan.Echallan.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VirtualChallanProceedingModel {
    private final String challan_no;
    private final String date_of_proceeding;
    private final String fine_imposed;
    private final String party_name;

    public VirtualChallanProceedingModel(String str, String str2, String str3, String str4) {
        l.f(str, "challan_no");
        l.f(str2, "party_name");
        l.f(str3, "date_of_proceeding");
        l.f(str4, "fine_imposed");
        this.challan_no = str;
        this.party_name = str2;
        this.date_of_proceeding = str3;
        this.fine_imposed = str4;
    }

    public static /* synthetic */ VirtualChallanProceedingModel copy$default(VirtualChallanProceedingModel virtualChallanProceedingModel, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = virtualChallanProceedingModel.challan_no;
        }
        if ((i10 & 2) != 0) {
            str2 = virtualChallanProceedingModel.party_name;
        }
        if ((i10 & 4) != 0) {
            str3 = virtualChallanProceedingModel.date_of_proceeding;
        }
        if ((i10 & 8) != 0) {
            str4 = virtualChallanProceedingModel.fine_imposed;
        }
        return virtualChallanProceedingModel.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.challan_no;
    }

    public final String component2() {
        return this.party_name;
    }

    public final String component3() {
        return this.date_of_proceeding;
    }

    public final String component4() {
        return this.fine_imposed;
    }

    public final VirtualChallanProceedingModel copy(String str, String str2, String str3, String str4) {
        l.f(str, "challan_no");
        l.f(str2, "party_name");
        l.f(str3, "date_of_proceeding");
        l.f(str4, "fine_imposed");
        return new VirtualChallanProceedingModel(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualChallanProceedingModel)) {
            return false;
        }
        VirtualChallanProceedingModel virtualChallanProceedingModel = (VirtualChallanProceedingModel) obj;
        return l.a(this.challan_no, virtualChallanProceedingModel.challan_no) && l.a(this.party_name, virtualChallanProceedingModel.party_name) && l.a(this.date_of_proceeding, virtualChallanProceedingModel.date_of_proceeding) && l.a(this.fine_imposed, virtualChallanProceedingModel.fine_imposed);
    }

    public final String getChallan_no() {
        return this.challan_no;
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
        return (((((this.challan_no.hashCode() * 31) + this.party_name.hashCode()) * 31) + this.date_of_proceeding.hashCode()) * 31) + this.fine_imposed.hashCode();
    }

    public String toString() {
        return "VirtualChallanProceedingModel(challan_no=" + this.challan_no + ", party_name=" + this.party_name + ", date_of_proceeding=" + this.date_of_proceeding + ", fine_imposed=" + this.fine_imposed + ')';
    }
}
