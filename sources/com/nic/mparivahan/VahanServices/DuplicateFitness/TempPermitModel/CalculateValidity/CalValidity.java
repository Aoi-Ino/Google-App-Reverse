package com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.CalculateValidity;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class CalValidity {
    private final ApiMessage apiMessage;
    private final Data data;

    public CalValidity(ApiMessage apiMessage2, Data data2) {
        l.f(apiMessage2, "apiMessage");
        l.f(data2, "data");
        this.apiMessage = apiMessage2;
        this.data = data2;
    }

    public static /* synthetic */ CalValidity copy$default(CalValidity calValidity, ApiMessage apiMessage2, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = calValidity.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = calValidity.data;
        }
        return calValidity.copy(apiMessage2, data2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final CalValidity copy(ApiMessage apiMessage2, Data data2) {
        l.f(apiMessage2, "apiMessage");
        l.f(data2, "data");
        return new CalValidity(apiMessage2, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalValidity)) {
            return false;
        }
        CalValidity calValidity = (CalValidity) obj;
        return l.a(this.apiMessage, calValidity.apiMessage) && l.a(this.data, calValidity.data);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        return (this.apiMessage.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "CalValidity(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
