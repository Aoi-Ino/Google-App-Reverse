package com.nic.mparivahan.VahanServices.HTPModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class HptDetailsModle {
    private final String fncr_add1;
    private final String fncr_add2;
    private final String fncr_add3;
    private final String fncr_district;
    private final String fncr_name;
    private final String fncr_pincode;
    private final String fncr_state;
    private final String from_dt;
    private final String hp_type;
    private final String op_dt;
    private final VTHypthEntityByid vTHypthEntityByid;

    public HptDetailsModle(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, VTHypthEntityByid vTHypthEntityByid2) {
        l.f(str6, "fncr_pincode");
        l.f(str7, "fncr_state");
        l.f(str9, "hp_type");
        l.f(str10, "op_dt");
        l.f(vTHypthEntityByid2, "vTHypthEntityByid");
        this.fncr_add1 = str;
        this.fncr_add2 = str2;
        this.fncr_add3 = str3;
        this.fncr_district = str4;
        this.fncr_name = str5;
        this.fncr_pincode = str6;
        this.fncr_state = str7;
        this.from_dt = str8;
        this.hp_type = str9;
        this.op_dt = str10;
        this.vTHypthEntityByid = vTHypthEntityByid2;
    }

    public static /* synthetic */ HptDetailsModle copy$default(HptDetailsModle hptDetailsModle, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, VTHypthEntityByid vTHypthEntityByid2, int i10, Object obj) {
        HptDetailsModle hptDetailsModle2 = hptDetailsModle;
        int i11 = i10;
        return hptDetailsModle.copy((i11 & 1) != 0 ? hptDetailsModle2.fncr_add1 : str, (i11 & 2) != 0 ? hptDetailsModle2.fncr_add2 : str2, (i11 & 4) != 0 ? hptDetailsModle2.fncr_add3 : str3, (i11 & 8) != 0 ? hptDetailsModle2.fncr_district : str4, (i11 & 16) != 0 ? hptDetailsModle2.fncr_name : str5, (i11 & 32) != 0 ? hptDetailsModle2.fncr_pincode : str6, (i11 & 64) != 0 ? hptDetailsModle2.fncr_state : str7, (i11 & 128) != 0 ? hptDetailsModle2.from_dt : str8, (i11 & 256) != 0 ? hptDetailsModle2.hp_type : str9, (i11 & 512) != 0 ? hptDetailsModle2.op_dt : str10, (i11 & 1024) != 0 ? hptDetailsModle2.vTHypthEntityByid : vTHypthEntityByid2);
    }

    public final String component1() {
        return this.fncr_add1;
    }

    public final String component10() {
        return this.op_dt;
    }

    public final VTHypthEntityByid component11() {
        return this.vTHypthEntityByid;
    }

    public final String component2() {
        return this.fncr_add2;
    }

    public final String component3() {
        return this.fncr_add3;
    }

    public final String component4() {
        return this.fncr_district;
    }

    public final String component5() {
        return this.fncr_name;
    }

    public final String component6() {
        return this.fncr_pincode;
    }

    public final String component7() {
        return this.fncr_state;
    }

    public final String component8() {
        return this.from_dt;
    }

    public final String component9() {
        return this.hp_type;
    }

    public final HptDetailsModle copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, VTHypthEntityByid vTHypthEntityByid2) {
        String str11 = str6;
        l.f(str11, "fncr_pincode");
        String str12 = str7;
        l.f(str12, "fncr_state");
        String str13 = str9;
        l.f(str13, "hp_type");
        String str14 = str10;
        l.f(str14, "op_dt");
        VTHypthEntityByid vTHypthEntityByid3 = vTHypthEntityByid2;
        l.f(vTHypthEntityByid3, "vTHypthEntityByid");
        return new HptDetailsModle(str, str2, str3, str4, str5, str11, str12, str8, str13, str14, vTHypthEntityByid3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HptDetailsModle)) {
            return false;
        }
        HptDetailsModle hptDetailsModle = (HptDetailsModle) obj;
        return l.a(this.fncr_add1, hptDetailsModle.fncr_add1) && l.a(this.fncr_add2, hptDetailsModle.fncr_add2) && l.a(this.fncr_add3, hptDetailsModle.fncr_add3) && l.a(this.fncr_district, hptDetailsModle.fncr_district) && l.a(this.fncr_name, hptDetailsModle.fncr_name) && l.a(this.fncr_pincode, hptDetailsModle.fncr_pincode) && l.a(this.fncr_state, hptDetailsModle.fncr_state) && l.a(this.from_dt, hptDetailsModle.from_dt) && l.a(this.hp_type, hptDetailsModle.hp_type) && l.a(this.op_dt, hptDetailsModle.op_dt) && l.a(this.vTHypthEntityByid, hptDetailsModle.vTHypthEntityByid);
    }

    public final String getFncr_add1() {
        return this.fncr_add1;
    }

    public final String getFncr_add2() {
        return this.fncr_add2;
    }

    public final String getFncr_add3() {
        return this.fncr_add3;
    }

    public final String getFncr_district() {
        return this.fncr_district;
    }

    public final String getFncr_name() {
        return this.fncr_name;
    }

    public final String getFncr_pincode() {
        return this.fncr_pincode;
    }

    public final String getFncr_state() {
        return this.fncr_state;
    }

    public final String getFrom_dt() {
        return this.from_dt;
    }

    public final String getHp_type() {
        return this.hp_type;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final VTHypthEntityByid getVTHypthEntityByid() {
        return this.vTHypthEntityByid;
    }

    public int hashCode() {
        String str = this.fncr_add1;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fncr_add2;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fncr_add3;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fncr_district;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fncr_name;
        int hashCode5 = (((((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.fncr_pincode.hashCode()) * 31) + this.fncr_state.hashCode()) * 31;
        String str6 = this.from_dt;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return ((((((hashCode5 + i10) * 31) + this.hp_type.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + this.vTHypthEntityByid.hashCode();
    }

    public String toString() {
        return "HptDetailsModle(fncr_add1=" + this.fncr_add1 + ", fncr_add2=" + this.fncr_add2 + ", fncr_add3=" + this.fncr_add3 + ", fncr_district=" + this.fncr_district + ", fncr_name=" + this.fncr_name + ", fncr_pincode=" + this.fncr_pincode + ", fncr_state=" + this.fncr_state + ", from_dt=" + this.from_dt + ", hp_type=" + this.hp_type + ", op_dt=" + this.op_dt + ", vTHypthEntityByid=" + this.vTHypthEntityByid + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HptDetailsModle(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, com.nic.mparivahan.VahanServices.HTPModel.VTHypthEntityByid r26, int r27, cm.g r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 1
            java.lang.String r2 = " "
            if (r1 == 0) goto L_0x000a
            r4 = r2
            goto L_0x000c
        L_0x000a:
            r4 = r16
        L_0x000c:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0012
            r5 = r2
            goto L_0x0014
        L_0x0012:
            r5 = r17
        L_0x0014:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001a
            r6 = r2
            goto L_0x001c
        L_0x001a:
            r6 = r18
        L_0x001c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0022
            r7 = r2
            goto L_0x0024
        L_0x0022:
            r7 = r19
        L_0x0024:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x002a
            r8 = r2
            goto L_0x002c
        L_0x002a:
            r8 = r20
        L_0x002c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0032
            r11 = r2
            goto L_0x0034
        L_0x0032:
            r11 = r23
        L_0x0034:
            r3 = r15
            r9 = r21
            r10 = r22
            r12 = r24
            r13 = r25
            r14 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.HTPModel.HptDetailsModle.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.nic.mparivahan.VahanServices.HTPModel.VTHypthEntityByid, int, cm.g):void");
    }
}
