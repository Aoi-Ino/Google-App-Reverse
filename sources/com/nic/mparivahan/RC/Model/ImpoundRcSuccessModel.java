package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import java.util.ArrayList;

@Keep
public final class ImpoundRcSuccessModel {
    private final String message;
    private final ArrayList<ImpoundRcResultModel> result;
    private final int status;

    public ImpoundRcSuccessModel(int i10, String str, ArrayList<ImpoundRcResultModel> arrayList) {
        l.f(str, "message");
        l.f(arrayList, "result");
        this.status = i10;
        this.message = str;
        this.result = arrayList;
    }

    public static /* synthetic */ ImpoundRcSuccessModel copy$default(ImpoundRcSuccessModel impoundRcSuccessModel, int i10, String str, ArrayList<ImpoundRcResultModel> arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = impoundRcSuccessModel.status;
        }
        if ((i11 & 2) != 0) {
            str = impoundRcSuccessModel.message;
        }
        if ((i11 & 4) != 0) {
            arrayList = impoundRcSuccessModel.result;
        }
        return impoundRcSuccessModel.copy(i10, str, arrayList);
    }

    public final int component1() {
        return this.status;
    }

    public final String component2() {
        return this.message;
    }

    public final ArrayList<ImpoundRcResultModel> component3() {
        return this.result;
    }

    public final ImpoundRcSuccessModel copy(int i10, String str, ArrayList<ImpoundRcResultModel> arrayList) {
        l.f(str, "message");
        l.f(arrayList, "result");
        return new ImpoundRcSuccessModel(i10, str, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImpoundRcSuccessModel)) {
            return false;
        }
        ImpoundRcSuccessModel impoundRcSuccessModel = (ImpoundRcSuccessModel) obj;
        return this.status == impoundRcSuccessModel.status && l.a(this.message, impoundRcSuccessModel.message) && l.a(this.result, impoundRcSuccessModel.result);
    }

    public final String getMessage() {
        return this.message;
    }

    public final ArrayList<ImpoundRcResultModel> getResult() {
        return this.result;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.status) * 31) + this.message.hashCode()) * 31) + this.result.hashCode();
    }

    public String toString() {
        return "ImpoundRcSuccessModel(status=" + this.status + ", message=" + this.message + ", result=" + this.result + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImpoundRcSuccessModel(int i10, String str, ArrayList arrayList, int i11, g gVar) {
        this(i10, str, (i11 & 4) != 0 ? new ArrayList() : arrayList);
    }
}
