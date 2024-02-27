package com.nic.mparivahan.Echallan.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class VirtualChallanResultModel {
    private final String amount;
    private final String challan_no;
    private final ContestedDataModel contested_data;
    private final String court_address;
    private final String court_name;
    private final String forword_date;
    private final VirtualChallanProceedingModel proceeding_data;
    private final TransferredCourtDataModel transferred_to_court_data;

    public VirtualChallanResultModel(String str, String str2, String str3, String str4, String str5, VirtualChallanProceedingModel virtualChallanProceedingModel, ContestedDataModel contestedDataModel, TransferredCourtDataModel transferredCourtDataModel) {
        l.f(str, "challan_no");
        l.f(str2, "amount");
        l.f(str3, "court_name");
        l.f(str4, "court_address");
        l.f(str5, "forword_date");
        l.f(virtualChallanProceedingModel, "proceeding_data");
        l.f(contestedDataModel, "contested_data");
        l.f(transferredCourtDataModel, "transferred_to_court_data");
        this.challan_no = str;
        this.amount = str2;
        this.court_name = str3;
        this.court_address = str4;
        this.forword_date = str5;
        this.proceeding_data = virtualChallanProceedingModel;
        this.contested_data = contestedDataModel;
        this.transferred_to_court_data = transferredCourtDataModel;
    }

    public static /* synthetic */ VirtualChallanResultModel copy$default(VirtualChallanResultModel virtualChallanResultModel, String str, String str2, String str3, String str4, String str5, VirtualChallanProceedingModel virtualChallanProceedingModel, ContestedDataModel contestedDataModel, TransferredCourtDataModel transferredCourtDataModel, int i10, Object obj) {
        VirtualChallanResultModel virtualChallanResultModel2 = virtualChallanResultModel;
        int i11 = i10;
        return virtualChallanResultModel.copy((i11 & 1) != 0 ? virtualChallanResultModel2.challan_no : str, (i11 & 2) != 0 ? virtualChallanResultModel2.amount : str2, (i11 & 4) != 0 ? virtualChallanResultModel2.court_name : str3, (i11 & 8) != 0 ? virtualChallanResultModel2.court_address : str4, (i11 & 16) != 0 ? virtualChallanResultModel2.forword_date : str5, (i11 & 32) != 0 ? virtualChallanResultModel2.proceeding_data : virtualChallanProceedingModel, (i11 & 64) != 0 ? virtualChallanResultModel2.contested_data : contestedDataModel, (i11 & 128) != 0 ? virtualChallanResultModel2.transferred_to_court_data : transferredCourtDataModel);
    }

    public final String component1() {
        return this.challan_no;
    }

    public final String component2() {
        return this.amount;
    }

    public final String component3() {
        return this.court_name;
    }

    public final String component4() {
        return this.court_address;
    }

    public final String component5() {
        return this.forword_date;
    }

    public final VirtualChallanProceedingModel component6() {
        return this.proceeding_data;
    }

    public final ContestedDataModel component7() {
        return this.contested_data;
    }

    public final TransferredCourtDataModel component8() {
        return this.transferred_to_court_data;
    }

    public final VirtualChallanResultModel copy(String str, String str2, String str3, String str4, String str5, VirtualChallanProceedingModel virtualChallanProceedingModel, ContestedDataModel contestedDataModel, TransferredCourtDataModel transferredCourtDataModel) {
        l.f(str, "challan_no");
        l.f(str2, "amount");
        l.f(str3, "court_name");
        l.f(str4, "court_address");
        l.f(str5, "forword_date");
        VirtualChallanProceedingModel virtualChallanProceedingModel2 = virtualChallanProceedingModel;
        l.f(virtualChallanProceedingModel2, "proceeding_data");
        ContestedDataModel contestedDataModel2 = contestedDataModel;
        l.f(contestedDataModel2, "contested_data");
        TransferredCourtDataModel transferredCourtDataModel2 = transferredCourtDataModel;
        l.f(transferredCourtDataModel2, "transferred_to_court_data");
        return new VirtualChallanResultModel(str, str2, str3, str4, str5, virtualChallanProceedingModel2, contestedDataModel2, transferredCourtDataModel2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualChallanResultModel)) {
            return false;
        }
        VirtualChallanResultModel virtualChallanResultModel = (VirtualChallanResultModel) obj;
        return l.a(this.challan_no, virtualChallanResultModel.challan_no) && l.a(this.amount, virtualChallanResultModel.amount) && l.a(this.court_name, virtualChallanResultModel.court_name) && l.a(this.court_address, virtualChallanResultModel.court_address) && l.a(this.forword_date, virtualChallanResultModel.forword_date) && l.a(this.proceeding_data, virtualChallanResultModel.proceeding_data) && l.a(this.contested_data, virtualChallanResultModel.contested_data) && l.a(this.transferred_to_court_data, virtualChallanResultModel.transferred_to_court_data);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getChallan_no() {
        return this.challan_no;
    }

    public final ContestedDataModel getContested_data() {
        return this.contested_data;
    }

    public final String getCourt_address() {
        return this.court_address;
    }

    public final String getCourt_name() {
        return this.court_name;
    }

    public final String getForword_date() {
        return this.forword_date;
    }

    public final VirtualChallanProceedingModel getProceeding_data() {
        return this.proceeding_data;
    }

    public final TransferredCourtDataModel getTransferred_to_court_data() {
        return this.transferred_to_court_data;
    }

    public int hashCode() {
        return (((((((((((((this.challan_no.hashCode() * 31) + this.amount.hashCode()) * 31) + this.court_name.hashCode()) * 31) + this.court_address.hashCode()) * 31) + this.forword_date.hashCode()) * 31) + this.proceeding_data.hashCode()) * 31) + this.contested_data.hashCode()) * 31) + this.transferred_to_court_data.hashCode();
    }

    public String toString() {
        return "VirtualChallanResultModel(challan_no=" + this.challan_no + ", amount=" + this.amount + ", court_name=" + this.court_name + ", court_address=" + this.court_address + ", forword_date=" + this.forword_date + ", proceeding_data=" + this.proceeding_data + ", contested_data=" + this.contested_data + ", transferred_to_court_data=" + this.transferred_to_court_data + ')';
    }
}
