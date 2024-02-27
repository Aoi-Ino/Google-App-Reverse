package com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Data {
    private final String ack_no;
    private final String address;
    private final String allotted_to;
    private final Integer auction_amt;
    private final String fancy_no;
    private final String father_name;
    private final String mobile_no;
    private final String op_dt;
    private final String owner_name;
    private final String pincode;
    private final String recp_no;
    private final String regn_no;
    private final Integer reserve_amt;
    private final String rto;
    private final String state;
    private final String status;

    public Data(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num2, String str12, String str13, String str14) {
        this.ack_no = str;
        this.address = str2;
        this.allotted_to = str3;
        this.auction_amt = num;
        this.fancy_no = str4;
        this.father_name = str5;
        this.mobile_no = str6;
        this.op_dt = str7;
        this.owner_name = str8;
        this.pincode = str9;
        this.recp_no = str10;
        this.regn_no = str11;
        this.reserve_amt = num2;
        this.rto = str12;
        this.state = str13;
        this.status = str14;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num2, String str12, String str13, String str14, int i10, Object obj) {
        Data data2 = data;
        int i11 = i10;
        return data.copy((i11 & 1) != 0 ? data2.ack_no : str, (i11 & 2) != 0 ? data2.address : str2, (i11 & 4) != 0 ? data2.allotted_to : str3, (i11 & 8) != 0 ? data2.auction_amt : num, (i11 & 16) != 0 ? data2.fancy_no : str4, (i11 & 32) != 0 ? data2.father_name : str5, (i11 & 64) != 0 ? data2.mobile_no : str6, (i11 & 128) != 0 ? data2.op_dt : str7, (i11 & 256) != 0 ? data2.owner_name : str8, (i11 & 512) != 0 ? data2.pincode : str9, (i11 & 1024) != 0 ? data2.recp_no : str10, (i11 & 2048) != 0 ? data2.regn_no : str11, (i11 & 4096) != 0 ? data2.reserve_amt : num2, (i11 & 8192) != 0 ? data2.rto : str12, (i11 & 16384) != 0 ? data2.state : str13, (i11 & 32768) != 0 ? data2.status : str14);
    }

    public final String component1() {
        return this.ack_no;
    }

    public final String component10() {
        return this.pincode;
    }

    public final String component11() {
        return this.recp_no;
    }

    public final String component12() {
        return this.regn_no;
    }

    public final Integer component13() {
        return this.reserve_amt;
    }

    public final String component14() {
        return this.rto;
    }

    public final String component15() {
        return this.state;
    }

    public final String component16() {
        return this.status;
    }

    public final String component2() {
        return this.address;
    }

    public final String component3() {
        return this.allotted_to;
    }

    public final Integer component4() {
        return this.auction_amt;
    }

    public final String component5() {
        return this.fancy_no;
    }

    public final String component6() {
        return this.father_name;
    }

    public final String component7() {
        return this.mobile_no;
    }

    public final String component8() {
        return this.op_dt;
    }

    public final String component9() {
        return this.owner_name;
    }

    public final Data copy(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num2, String str12, String str13, String str14) {
        return new Data(str, str2, str3, num, str4, str5, str6, str7, str8, str9, str10, str11, num2, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.ack_no, data.ack_no) && l.a(this.address, data.address) && l.a(this.allotted_to, data.allotted_to) && l.a(this.auction_amt, data.auction_amt) && l.a(this.fancy_no, data.fancy_no) && l.a(this.father_name, data.father_name) && l.a(this.mobile_no, data.mobile_no) && l.a(this.op_dt, data.op_dt) && l.a(this.owner_name, data.owner_name) && l.a(this.pincode, data.pincode) && l.a(this.recp_no, data.recp_no) && l.a(this.regn_no, data.regn_no) && l.a(this.reserve_amt, data.reserve_amt) && l.a(this.rto, data.rto) && l.a(this.state, data.state) && l.a(this.status, data.status);
    }

    public final String getAck_no() {
        return this.ack_no;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getAllotted_to() {
        return this.allotted_to;
    }

    public final Integer getAuction_amt() {
        return this.auction_amt;
    }

    public final String getFancy_no() {
        return this.fancy_no;
    }

    public final String getFather_name() {
        return this.father_name;
    }

    public final String getMobile_no() {
        return this.mobile_no;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final String getPincode() {
        return this.pincode;
    }

    public final String getRecp_no() {
        return this.recp_no;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final Integer getReserve_amt() {
        return this.reserve_amt;
    }

    public final String getRto() {
        return this.rto;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.ack_no;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.address;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.allotted_to;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.auction_amt;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.fancy_no;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.father_name;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mobile_no;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.op_dt;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.owner_name;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.pincode;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.recp_no;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.regn_no;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num2 = this.reserve_amt;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str12 = this.rto;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.state;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.status;
        if (str14 != null) {
            i10 = str14.hashCode();
        }
        return hashCode15 + i10;
    }

    public String toString() {
        return "Data(ack_no=" + this.ack_no + ", address=" + this.address + ", allotted_to=" + this.allotted_to + ", auction_amt=" + this.auction_amt + ", fancy_no=" + this.fancy_no + ", father_name=" + this.father_name + ", mobile_no=" + this.mobile_no + ", op_dt=" + this.op_dt + ", owner_name=" + this.owner_name + ", pincode=" + this.pincode + ", recp_no=" + this.recp_no + ", regn_no=" + this.regn_no + ", reserve_amt=" + this.reserve_amt + ", rto=" + this.rto + ", state=" + this.state + ", status=" + this.status + ')';
    }
}
