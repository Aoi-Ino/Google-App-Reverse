package com.nic.mparivahan.Echallan.Model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;

@Keep
public final class SearchChallanModel {
    @c("message")
    private final String message;
    @c("results")
    private final ArrayList<SearchChallanResultModel> result;
    @c("status")
    private final String status;
    @c("total_challan")
    private final int totalChallan;

    public SearchChallanModel(String str, ArrayList<SearchChallanResultModel> arrayList, int i10, String str2) {
        l.f(str, "status");
        l.f(arrayList, "result");
        l.f(str2, "message");
        this.status = str;
        this.result = arrayList;
        this.totalChallan = i10;
        this.message = str2;
    }

    public static /* synthetic */ SearchChallanModel copy$default(SearchChallanModel searchChallanModel, String str, ArrayList<SearchChallanResultModel> arrayList, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchChallanModel.status;
        }
        if ((i11 & 2) != 0) {
            arrayList = searchChallanModel.result;
        }
        if ((i11 & 4) != 0) {
            i10 = searchChallanModel.totalChallan;
        }
        if ((i11 & 8) != 0) {
            str2 = searchChallanModel.message;
        }
        return searchChallanModel.copy(str, arrayList, i10, str2);
    }

    public final String component1() {
        return this.status;
    }

    public final ArrayList<SearchChallanResultModel> component2() {
        return this.result;
    }

    public final int component3() {
        return this.totalChallan;
    }

    public final String component4() {
        return this.message;
    }

    public final SearchChallanModel copy(String str, ArrayList<SearchChallanResultModel> arrayList, int i10, String str2) {
        l.f(str, "status");
        l.f(arrayList, "result");
        l.f(str2, "message");
        return new SearchChallanModel(str, arrayList, i10, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchChallanModel)) {
            return false;
        }
        SearchChallanModel searchChallanModel = (SearchChallanModel) obj;
        return l.a(this.status, searchChallanModel.status) && l.a(this.result, searchChallanModel.result) && this.totalChallan == searchChallanModel.totalChallan && l.a(this.message, searchChallanModel.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final ArrayList<SearchChallanResultModel> getResult() {
        return this.result;
    }

    public final String getStatus() {
        return this.status;
    }

    public final int getTotalChallan() {
        return this.totalChallan;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + this.result.hashCode()) * 31) + Integer.hashCode(this.totalChallan)) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "SearchChallanModel(status=" + this.status + ", result=" + this.result + ", totalChallan=" + this.totalChallan + ", message=" + this.message + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchChallanModel(String str, ArrayList arrayList, int i10, String str2, int i11, g gVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? new ArrayList() : arrayList, i10, (i11 & 8) != 0 ? "" : str2);
    }
}
