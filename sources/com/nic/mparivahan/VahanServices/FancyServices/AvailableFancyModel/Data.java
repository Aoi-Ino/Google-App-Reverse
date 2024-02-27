package com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Data {
    private final int booking_fee;
    private final String category;
    private final String number_type;
    private final String reg_no;

    public Data(int i10, String str, String str2, String str3) {
        l.f(str, "category");
        l.f(str2, "number_type");
        l.f(str3, "reg_no");
        this.booking_fee = i10;
        this.category = str;
        this.number_type = str2;
        this.reg_no = str3;
    }

    public static /* synthetic */ Data copy$default(Data data, int i10, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = data.booking_fee;
        }
        if ((i11 & 2) != 0) {
            str = data.category;
        }
        if ((i11 & 4) != 0) {
            str2 = data.number_type;
        }
        if ((i11 & 8) != 0) {
            str3 = data.reg_no;
        }
        return data.copy(i10, str, str2, str3);
    }

    public final int component1() {
        return this.booking_fee;
    }

    public final String component2() {
        return this.category;
    }

    public final String component3() {
        return this.number_type;
    }

    public final String component4() {
        return this.reg_no;
    }

    public final Data copy(int i10, String str, String str2, String str3) {
        l.f(str, "category");
        l.f(str2, "number_type");
        l.f(str3, "reg_no");
        return new Data(i10, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return this.booking_fee == data.booking_fee && l.a(this.category, data.category) && l.a(this.number_type, data.number_type) && l.a(this.reg_no, data.reg_no);
    }

    public final int getBooking_fee() {
        return this.booking_fee;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getNumber_type() {
        return this.number_type;
    }

    public final String getReg_no() {
        return this.reg_no;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.booking_fee) * 31) + this.category.hashCode()) * 31) + this.number_type.hashCode()) * 31) + this.reg_no.hashCode();
    }

    public String toString() {
        return "Data(booking_fee=" + this.booking_fee + ", category=" + this.category + ", number_type=" + this.number_type + ", reg_no=" + this.reg_no + ')';
    }
}
