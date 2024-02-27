package com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class AuctionStatusModel {
    private final Data data;
    private final String message;
    private final String status;

    public AuctionStatusModel(Data data2, String str, String str2) {
        this.data = data2;
        this.message = str;
        this.status = str2;
    }

    public static /* synthetic */ AuctionStatusModel copy$default(AuctionStatusModel auctionStatusModel, Data data2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            data2 = auctionStatusModel.data;
        }
        if ((i10 & 2) != 0) {
            str = auctionStatusModel.message;
        }
        if ((i10 & 4) != 0) {
            str2 = auctionStatusModel.status;
        }
        return auctionStatusModel.copy(data2, str, str2);
    }

    public final Data component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.status;
    }

    public final AuctionStatusModel copy(Data data2, String str, String str2) {
        return new AuctionStatusModel(data2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionStatusModel)) {
            return false;
        }
        AuctionStatusModel auctionStatusModel = (AuctionStatusModel) obj;
        return l.a(this.data, auctionStatusModel.data) && l.a(this.message, auctionStatusModel.message) && l.a(this.status, auctionStatusModel.status);
    }

    public final Data getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        Data data2 = this.data;
        int i10 = 0;
        int hashCode = (data2 == null ? 0 : data2.hashCode()) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.status;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "AuctionStatusModel(data=" + this.data + ", message=" + this.message + ", status=" + this.status + ')';
    }
}
