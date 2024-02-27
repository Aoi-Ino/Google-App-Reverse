package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeResponseData;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Data {
    private final int code;
    private final String description;
    private final String stateCode;

    public Data(int i10, String str, String str2) {
        this.code = i10;
        this.description = str;
        this.stateCode = str2;
    }

    public static /* synthetic */ Data copy$default(Data data, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = data.code;
        }
        if ((i11 & 2) != 0) {
            str = data.description;
        }
        if ((i11 & 4) != 0) {
            str2 = data.stateCode;
        }
        return data.copy(i10, str, str2);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.stateCode;
    }

    public final Data copy(int i10, String str, String str2) {
        return new Data(i10, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return this.code == data.code && l.a(this.description, data.description) && l.a(this.stateCode, data.stateCode);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.code) * 31;
        String str = this.description;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.stateCode;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "Data(code=" + this.code + ", description=" + this.description + ", stateCode=" + this.stateCode + ')';
    }
}
