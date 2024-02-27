package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import java.util.ArrayList;

@Keep
public final class ImpoundDlSuccessModel {
    private final String message;
    private final ArrayList<ImpoundRcResultModel> result;
    private final int status;

    public ImpoundDlSuccessModel(int i10, String str, ArrayList<ImpoundRcResultModel> arrayList) {
        l.f(str, "message");
        l.f(arrayList, "result");
        this.status = i10;
        this.message = str;
        this.result = arrayList;
    }

    public static /* synthetic */ ImpoundDlSuccessModel copy$default(ImpoundDlSuccessModel impoundDlSuccessModel, int i10, String str, ArrayList<ImpoundRcResultModel> arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = impoundDlSuccessModel.status;
        }
        if ((i11 & 2) != 0) {
            str = impoundDlSuccessModel.message;
        }
        if ((i11 & 4) != 0) {
            arrayList = impoundDlSuccessModel.result;
        }
        return impoundDlSuccessModel.copy(i10, str, arrayList);
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

    public final ImpoundDlSuccessModel copy(int i10, String str, ArrayList<ImpoundRcResultModel> arrayList) {
        l.f(str, "message");
        l.f(arrayList, "result");
        return new ImpoundDlSuccessModel(i10, str, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImpoundDlSuccessModel)) {
            return false;
        }
        ImpoundDlSuccessModel impoundDlSuccessModel = (ImpoundDlSuccessModel) obj;
        return this.status == impoundDlSuccessModel.status && l.a(this.message, impoundDlSuccessModel.message) && l.a(this.result, impoundDlSuccessModel.result);
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
        return "ImpoundDlSuccessModel(status=" + this.status + ", message=" + this.message + ", result=" + this.result + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImpoundDlSuccessModel(int i10, String str, ArrayList arrayList, int i11, g gVar) {
        this(i10, str, (i11 & 4) != 0 ? new ArrayList() : arrayList);
    }
}
