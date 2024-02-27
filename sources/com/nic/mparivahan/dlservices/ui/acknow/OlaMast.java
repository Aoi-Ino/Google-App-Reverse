package com.nic.mparivahan.dlservices.ui.acknow;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class OlaMast {
    @c("olaCat")
    private final String olaCat;
    @c("olaScope")
    private final String olaScope;
    @c("omCheckUsertoken")
    private final Object omCheckUsertoken;
    @c("omDistCode")
    private final Integer omDistCode;
    @c("omEmailid")
    private final String omEmailid;
    @c("omFax")
    private final String omFax;
    @c("omInstalloffice")
    private final Object omInstalloffice;
    @c("omMaplink")
    private final Object omMaplink;
    @c("omOffCdNum")
    private final Object omOffCdNum;
    @c("omOffType")
    private final String omOffType;
    @c("omOffdesig")
    private final String omOffdesig;
    @c("omOfficeTownname")
    private final String omOfficeTownname;
    @c("omOfficecd")
    private final String omOfficecd;
    @c("omOfficename")
    private final String omOfficename;
    @c("omPhone")
    private final String omPhone;
    @c("omPincodeCov")
    private final String omPincodeCov;
    @c("omPostaladd1")
    private final String omPostaladd1;
    @c("omPostaladd2")
    private final String omPostaladd2;
    @c("omPostaladd3")
    private final String omPostaladd3;
    @c("omPostaladd4")
    private final String omPostaladd4;
    @c("omRepOffice")
    private final Object omRepOffice;
    @c("omRtoFullname")
    private final String omRtoFullname;
    @c("omRtoShortname")
    private final String omRtoShortname;
    @c("omStCode")
    private final String omStCode;
    @c("omTokenId")
    private final Object omTokenId;
    @c("omUserId")
    private final Integer omUserId;

    public OlaMast() {
        this((Integer) null, (String) null, (String) null, (Object) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Object) null, (String) null, (String) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Object) null, (Object) null, (Integer) null, 67108863, (g) null);
    }

    public static /* synthetic */ OlaMast copy$default(OlaMast olaMast, Integer num, String str, String str2, Object obj, Object obj2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Object obj3, String str12, String str13, Object obj4, String str14, String str15, String str16, String str17, String str18, Object obj5, Object obj6, Integer num2, int i10, Object obj7) {
        OlaMast olaMast2 = olaMast;
        int i11 = i10;
        return olaMast.copy((i11 & 1) != 0 ? olaMast2.omDistCode : num, (i11 & 2) != 0 ? olaMast2.omRtoFullname : str, (i11 & 4) != 0 ? olaMast2.omFax : str2, (i11 & 8) != 0 ? olaMast2.omOffCdNum : obj, (i11 & 16) != 0 ? olaMast2.omInstalloffice : obj2, (i11 & 32) != 0 ? olaMast2.omPostaladd4 : str3, (i11 & 64) != 0 ? olaMast2.olaScope : str4, (i11 & 128) != 0 ? olaMast2.olaCat : str5, (i11 & 256) != 0 ? olaMast2.omEmailid : str6, (i11 & 512) != 0 ? olaMast2.omPostaladd1 : str7, (i11 & 1024) != 0 ? olaMast2.omPhone : str8, (i11 & 2048) != 0 ? olaMast2.omPostaladd3 : str9, (i11 & 4096) != 0 ? olaMast2.omPostaladd2 : str10, (i11 & 8192) != 0 ? olaMast2.omStCode : str11, (i11 & 16384) != 0 ? olaMast2.omTokenId : obj3, (i11 & 32768) != 0 ? olaMast2.omOfficeTownname : str12, (i11 & 65536) != 0 ? olaMast2.omOfficecd : str13, (i11 & 131072) != 0 ? olaMast2.omCheckUsertoken : obj4, (i11 & 262144) != 0 ? olaMast2.omOffType : str14, (i11 & 524288) != 0 ? olaMast2.omOfficename : str15, (i11 & 1048576) != 0 ? olaMast2.omRtoShortname : str16, (i11 & 2097152) != 0 ? olaMast2.omPincodeCov : str17, (i11 & 4194304) != 0 ? olaMast2.omOffdesig : str18, (i11 & 8388608) != 0 ? olaMast2.omMaplink : obj5, (i11 & 16777216) != 0 ? olaMast2.omRepOffice : obj6, (i11 & 33554432) != 0 ? olaMast2.omUserId : num2);
    }

    public final Integer component1() {
        return this.omDistCode;
    }

    public final String component10() {
        return this.omPostaladd1;
    }

    public final String component11() {
        return this.omPhone;
    }

    public final String component12() {
        return this.omPostaladd3;
    }

    public final String component13() {
        return this.omPostaladd2;
    }

    public final String component14() {
        return this.omStCode;
    }

    public final Object component15() {
        return this.omTokenId;
    }

    public final String component16() {
        return this.omOfficeTownname;
    }

    public final String component17() {
        return this.omOfficecd;
    }

    public final Object component18() {
        return this.omCheckUsertoken;
    }

    public final String component19() {
        return this.omOffType;
    }

    public final String component2() {
        return this.omRtoFullname;
    }

    public final String component20() {
        return this.omOfficename;
    }

    public final String component21() {
        return this.omRtoShortname;
    }

    public final String component22() {
        return this.omPincodeCov;
    }

    public final String component23() {
        return this.omOffdesig;
    }

    public final Object component24() {
        return this.omMaplink;
    }

    public final Object component25() {
        return this.omRepOffice;
    }

    public final Integer component26() {
        return this.omUserId;
    }

    public final String component3() {
        return this.omFax;
    }

    public final Object component4() {
        return this.omOffCdNum;
    }

    public final Object component5() {
        return this.omInstalloffice;
    }

    public final String component6() {
        return this.omPostaladd4;
    }

    public final String component7() {
        return this.olaScope;
    }

    public final String component8() {
        return this.olaCat;
    }

    public final String component9() {
        return this.omEmailid;
    }

    public final OlaMast copy(Integer num, String str, String str2, Object obj, Object obj2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Object obj3, String str12, String str13, Object obj4, String str14, String str15, String str16, String str17, String str18, Object obj5, Object obj6, Integer num2) {
        return new OlaMast(num, str, str2, obj, obj2, str3, str4, str5, str6, str7, str8, str9, str10, str11, obj3, str12, str13, obj4, str14, str15, str16, str17, str18, obj5, obj6, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OlaMast)) {
            return false;
        }
        OlaMast olaMast = (OlaMast) obj;
        return l.a(this.omDistCode, olaMast.omDistCode) && l.a(this.omRtoFullname, olaMast.omRtoFullname) && l.a(this.omFax, olaMast.omFax) && l.a(this.omOffCdNum, olaMast.omOffCdNum) && l.a(this.omInstalloffice, olaMast.omInstalloffice) && l.a(this.omPostaladd4, olaMast.omPostaladd4) && l.a(this.olaScope, olaMast.olaScope) && l.a(this.olaCat, olaMast.olaCat) && l.a(this.omEmailid, olaMast.omEmailid) && l.a(this.omPostaladd1, olaMast.omPostaladd1) && l.a(this.omPhone, olaMast.omPhone) && l.a(this.omPostaladd3, olaMast.omPostaladd3) && l.a(this.omPostaladd2, olaMast.omPostaladd2) && l.a(this.omStCode, olaMast.omStCode) && l.a(this.omTokenId, olaMast.omTokenId) && l.a(this.omOfficeTownname, olaMast.omOfficeTownname) && l.a(this.omOfficecd, olaMast.omOfficecd) && l.a(this.omCheckUsertoken, olaMast.omCheckUsertoken) && l.a(this.omOffType, olaMast.omOffType) && l.a(this.omOfficename, olaMast.omOfficename) && l.a(this.omRtoShortname, olaMast.omRtoShortname) && l.a(this.omPincodeCov, olaMast.omPincodeCov) && l.a(this.omOffdesig, olaMast.omOffdesig) && l.a(this.omMaplink, olaMast.omMaplink) && l.a(this.omRepOffice, olaMast.omRepOffice) && l.a(this.omUserId, olaMast.omUserId);
    }

    public final String getOlaCat() {
        return this.olaCat;
    }

    public final String getOlaScope() {
        return this.olaScope;
    }

    public final Object getOmCheckUsertoken() {
        return this.omCheckUsertoken;
    }

    public final Integer getOmDistCode() {
        return this.omDistCode;
    }

    public final String getOmEmailid() {
        return this.omEmailid;
    }

    public final String getOmFax() {
        return this.omFax;
    }

    public final Object getOmInstalloffice() {
        return this.omInstalloffice;
    }

    public final Object getOmMaplink() {
        return this.omMaplink;
    }

    public final Object getOmOffCdNum() {
        return this.omOffCdNum;
    }

    public final String getOmOffType() {
        return this.omOffType;
    }

    public final String getOmOffdesig() {
        return this.omOffdesig;
    }

    public final String getOmOfficeTownname() {
        return this.omOfficeTownname;
    }

    public final String getOmOfficecd() {
        return this.omOfficecd;
    }

    public final String getOmOfficename() {
        return this.omOfficename;
    }

    public final String getOmPhone() {
        return this.omPhone;
    }

    public final String getOmPincodeCov() {
        return this.omPincodeCov;
    }

    public final String getOmPostaladd1() {
        return this.omPostaladd1;
    }

    public final String getOmPostaladd2() {
        return this.omPostaladd2;
    }

    public final String getOmPostaladd3() {
        return this.omPostaladd3;
    }

    public final String getOmPostaladd4() {
        return this.omPostaladd4;
    }

    public final Object getOmRepOffice() {
        return this.omRepOffice;
    }

    public final String getOmRtoFullname() {
        return this.omRtoFullname;
    }

    public final String getOmRtoShortname() {
        return this.omRtoShortname;
    }

    public final String getOmStCode() {
        return this.omStCode;
    }

    public final Object getOmTokenId() {
        return this.omTokenId;
    }

    public final Integer getOmUserId() {
        return this.omUserId;
    }

    public int hashCode() {
        Integer num = this.omDistCode;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.omRtoFullname;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.omFax;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.omOffCdNum;
        int hashCode4 = (hashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.omInstalloffice;
        int hashCode5 = (hashCode4 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str3 = this.omPostaladd4;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.olaScope;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.olaCat;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.omEmailid;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.omPostaladd1;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.omPhone;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.omPostaladd3;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.omPostaladd2;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.omStCode;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Object obj3 = this.omTokenId;
        int hashCode15 = (hashCode14 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        String str12 = this.omOfficeTownname;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.omOfficecd;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Object obj4 = this.omCheckUsertoken;
        int hashCode18 = (hashCode17 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        String str14 = this.omOffType;
        int hashCode19 = (hashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.omOfficename;
        int hashCode20 = (hashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.omRtoShortname;
        int hashCode21 = (hashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.omPincodeCov;
        int hashCode22 = (hashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.omOffdesig;
        int hashCode23 = (hashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Object obj5 = this.omMaplink;
        int hashCode24 = (hashCode23 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.omRepOffice;
        int hashCode25 = (hashCode24 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        Integer num2 = this.omUserId;
        if (num2 != null) {
            i10 = num2.hashCode();
        }
        return hashCode25 + i10;
    }

    public String toString() {
        return "OlaMast(omDistCode=" + this.omDistCode + ", omRtoFullname=" + this.omRtoFullname + ", omFax=" + this.omFax + ", omOffCdNum=" + this.omOffCdNum + ", omInstalloffice=" + this.omInstalloffice + ", omPostaladd4=" + this.omPostaladd4 + ", olaScope=" + this.olaScope + ", olaCat=" + this.olaCat + ", omEmailid=" + this.omEmailid + ", omPostaladd1=" + this.omPostaladd1 + ", omPhone=" + this.omPhone + ", omPostaladd3=" + this.omPostaladd3 + ", omPostaladd2=" + this.omPostaladd2 + ", omStCode=" + this.omStCode + ", omTokenId=" + this.omTokenId + ", omOfficeTownname=" + this.omOfficeTownname + ", omOfficecd=" + this.omOfficecd + ", omCheckUsertoken=" + this.omCheckUsertoken + ", omOffType=" + this.omOffType + ", omOfficename=" + this.omOfficename + ", omRtoShortname=" + this.omRtoShortname + ", omPincodeCov=" + this.omPincodeCov + ", omOffdesig=" + this.omOffdesig + ", omMaplink=" + this.omMaplink + ", omRepOffice=" + this.omRepOffice + ", omUserId=" + this.omUserId + ')';
    }

    public OlaMast(Integer num, String str, String str2, Object obj, Object obj2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Object obj3, String str12, String str13, Object obj4, String str14, String str15, String str16, String str17, String str18, Object obj5, Object obj6, Integer num2) {
        this.omDistCode = num;
        this.omRtoFullname = str;
        this.omFax = str2;
        this.omOffCdNum = obj;
        this.omInstalloffice = obj2;
        this.omPostaladd4 = str3;
        this.olaScope = str4;
        this.olaCat = str5;
        this.omEmailid = str6;
        this.omPostaladd1 = str7;
        this.omPhone = str8;
        this.omPostaladd3 = str9;
        this.omPostaladd2 = str10;
        this.omStCode = str11;
        this.omTokenId = obj3;
        this.omOfficeTownname = str12;
        this.omOfficecd = str13;
        this.omCheckUsertoken = obj4;
        this.omOffType = str14;
        this.omOfficename = str15;
        this.omRtoShortname = str16;
        this.omPincodeCov = str17;
        this.omOffdesig = str18;
        this.omMaplink = obj5;
        this.omRepOffice = obj6;
        this.omUserId = num2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OlaMast(java.lang.Integer r28, java.lang.String r29, java.lang.String r30, java.lang.Object r31, java.lang.Object r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.Object r42, java.lang.String r43, java.lang.String r44, java.lang.Object r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.Object r51, java.lang.Object r52, java.lang.Integer r53, int r54, cm.g r55) {
        /*
            r27 = this;
            r0 = r54
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r28
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r29
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r30
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r31
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r32
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r33
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r34
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r35
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r36
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r37
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r38
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r39
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r40
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r41
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r42
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r43
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r44
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r45
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r46
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r47
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r48
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r49
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d1
            r23 = 0
            goto L_0x00d3
        L_0x00d1:
            r23 = r50
        L_0x00d3:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00dc
            r24 = 0
            goto L_0x00de
        L_0x00dc:
            r24 = r51
        L_0x00de:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00e7
            r25 = 0
            goto L_0x00e9
        L_0x00e7:
            r25 = r52
        L_0x00e9:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 & r26
            if (r0 == 0) goto L_0x00f1
            r0 = 0
            goto L_0x00f3
        L_0x00f1:
            r0 = r53
        L_0x00f3:
            r28 = r27
            r29 = r1
            r30 = r3
            r31 = r4
            r32 = r5
            r33 = r6
            r34 = r7
            r35 = r8
            r36 = r9
            r37 = r10
            r38 = r11
            r39 = r12
            r40 = r13
            r41 = r14
            r42 = r15
            r43 = r2
            r44 = r16
            r45 = r17
            r46 = r18
            r47 = r19
            r48 = r20
            r49 = r21
            r50 = r22
            r51 = r23
            r52 = r24
            r53 = r25
            r54 = r0
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.acknow.OlaMast.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Integer, int, cm.g):void");
    }
}
