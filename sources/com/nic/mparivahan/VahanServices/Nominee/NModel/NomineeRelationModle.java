package com.nic.mparivahan.VahanServices.Nominee.NModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class NomineeRelationModle {
    private final ApiMessage apiMessage;
    private final ArrayList<Data> data;

    public NomineeRelationModle(ApiMessage apiMessage2, ArrayList<Data> arrayList) {
        l.f(apiMessage2, "apiMessage");
        l.f(arrayList, "data");
        this.apiMessage = apiMessage2;
        this.data = arrayList;
    }

    public static /* synthetic */ NomineeRelationModle copy$default(NomineeRelationModle nomineeRelationModle, ApiMessage apiMessage2, ArrayList<Data> arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = nomineeRelationModle.apiMessage;
        }
        if ((i10 & 2) != 0) {
            arrayList = nomineeRelationModle.data;
        }
        return nomineeRelationModle.copy(apiMessage2, arrayList);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final ArrayList<Data> component2() {
        return this.data;
    }

    public final NomineeRelationModle copy(ApiMessage apiMessage2, ArrayList<Data> arrayList) {
        l.f(apiMessage2, "apiMessage");
        l.f(arrayList, "data");
        return new NomineeRelationModle(apiMessage2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NomineeRelationModle)) {
            return false;
        }
        NomineeRelationModle nomineeRelationModle = (NomineeRelationModle) obj;
        return l.a(this.apiMessage, nomineeRelationModle.apiMessage) && l.a(this.data, nomineeRelationModle.data);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final ArrayList<Data> getData() {
        return this.data;
    }

    public int hashCode() {
        return (this.apiMessage.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "NomineeRelationModle(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
