package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class ResultItem {
    @c("apdNaturalName")
    private final String apdNaturalName;
    @c("apdPermAdd1")
    private final String apdPermAdd1;
    @c("apdPermAdd2")
    private final String apdPermAdd2;
    @c("apdPermAdd3")
    private final String apdPermAdd3;
    @c("apdPermPin")
    private final Integer apdPermPin;
    @c("apdTempAdd1")
    private final String apdTempAdd1;
    @c("apdTempAdd2")
    private final String apdTempAdd2;
    @c("apdTempAdd3")
    private final String apdTempAdd3;
    @c("apdTempPin")
    private final Integer apdTempPin;
    @c("applEmpCatg")
    private final Integer applEmpCatg;
    @c("applFirstName")
    private final Object applFirstName;
    @c("applFullName")
    private final String applFullName;
    @c("applLastName")
    private final Object applLastName;
    @c("applQualName")
    private final String applQualName;
    @c("biPhoto")
    private final String biPhoto;
    @c("biPhotoBase64")
    private final Object biPhotoBase64;
    @c("biSignature")
    private final String biSignature;
    @c("biSignatureBase64")
    private final Object biSignatureBase64;
    @c("bioId")
    private final String bioId;
    @c("biocitizen")
    private final String biocitizen;
    @c("bioorgdonor")
    private final Object bioorgdonor;
    @c("bloodGroup")
    private final String bloodGroup;
    @c("DLCOVList")
    private final DLCOVList dLCOVList;
    @c("dlDispatchStatus")
    private final String dlDispatchStatus;
    @c("dlEndorseAuth")
    private final String dlEndorseAuth;
    @c("dlEndorsedt")
    private final String dlEndorsedt;
    @c("dlEndorsetime")
    private final Object dlEndorsetime;
    @c("dlIssueauth")
    private final String dlIssueauth;
    @c("dlIssuedt")
    private final String dlIssuedt;
    @c("dlLatestTrcode")
    private final Integer dlLatestTrcode;
    @c("dlNtValdfrDt")
    private final String dlNtValdfrDt;
    @c("dlNtValdtoDt")
    private final String dlNtValdtoDt;
    @c("dlPrintStatus")
    private final String dlPrintStatus;
    @c("dlRecGenesis")
    private final String dlRecGenesis;
    @c("dlRemarks")
    private final String dlRemarks;
    @c("dlSeqno")
    private final String dlSeqno;
    @c("dlStatus")
    private final String dlStatus;
    @c("dlno")
    private final String dlno;
    @c("eligibleDLSerList")
    private final EligibleDLSerList eligibleDLSerList;
    @c("haz_issueinstt_code")
    private final Integer hazIssueinsttCode;
    @c("relFirstName")
    private final Object relFirstName;
    @c("relLastName")
    private final Object relLastName;
    @c("relationType")
    private final String relationType;

    public ResultItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (Object) null, (String) null, (EligibleDLSerList) null, (String) null, (String) null, (String) null, (String) null, (DLCOVList) null, (String) null, (String) null, (Object) null, (String) null, (Integer) null, (Integer) null, (Object) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Object) null, (String) null, (Object) null, (Object) null, (String) null, (Object) null, (Object) null, (String) null, (String) null, (String) null, -1, 2047, (g) null);
    }

    public static /* synthetic */ ResultItem copy$default(ResultItem resultItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Object obj, String str9, EligibleDLSerList eligibleDLSerList2, String str10, String str11, String str12, String str13, DLCOVList dLCOVList2, String str14, String str15, Object obj2, String str16, Integer num3, Integer num4, Object obj3, Integer num5, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Object obj4, String str24, Object obj5, Object obj6, String str25, Object obj7, Object obj8, String str26, String str27, String str28, int i10, int i11, Object obj9) {
        ResultItem resultItem2 = resultItem;
        int i12 = i10;
        int i13 = i11;
        return resultItem.copy((i12 & 1) != 0 ? resultItem2.relationType : str, (i12 & 2) != 0 ? resultItem2.dlSeqno : str2, (i12 & 4) != 0 ? resultItem2.dlDispatchStatus : str3, (i12 & 8) != 0 ? resultItem2.dlRemarks : str4, (i12 & 16) != 0 ? resultItem2.dlRecGenesis : str5, (i12 & 32) != 0 ? resultItem2.biPhoto : str6, (i12 & 64) != 0 ? resultItem2.dlNtValdfrDt : str7, (i12 & 128) != 0 ? resultItem2.applFullName : str8, (i12 & 256) != 0 ? resultItem2.hazIssueinsttCode : num, (i12 & 512) != 0 ? resultItem2.apdPermPin : num2, (i12 & 1024) != 0 ? resultItem2.dlEndorsetime : obj, (i12 & 2048) != 0 ? resultItem2.bloodGroup : str9, (i12 & 4096) != 0 ? resultItem2.eligibleDLSerList : eligibleDLSerList2, (i12 & 8192) != 0 ? resultItem2.dlEndorseAuth : str10, (i12 & 16384) != 0 ? resultItem2.dlStatus : str11, (i12 & 32768) != 0 ? resultItem2.dlIssueauth : str12, (i12 & 65536) != 0 ? resultItem2.bioId : str13, (i12 & 131072) != 0 ? resultItem2.dLCOVList : dLCOVList2, (i12 & 262144) != 0 ? resultItem2.apdTempAdd2 : str14, (i12 & 524288) != 0 ? resultItem2.apdTempAdd3 : str15, (i12 & 1048576) != 0 ? resultItem2.biPhotoBase64 : obj2, (i12 & 2097152) != 0 ? resultItem2.apdTempAdd1 : str16, (i12 & 4194304) != 0 ? resultItem2.apdTempPin : num3, (i12 & 8388608) != 0 ? resultItem2.applEmpCatg : num4, (i12 & 16777216) != 0 ? resultItem2.biSignatureBase64 : obj3, (i12 & 33554432) != 0 ? resultItem2.dlLatestTrcode : num5, (i12 & 67108864) != 0 ? resultItem2.dlEndorsedt : str17, (i12 & 134217728) != 0 ? resultItem2.dlno : str18, (i12 & 268435456) != 0 ? resultItem2.apdPermAdd3 : str19, (i12 & 536870912) != 0 ? resultItem2.dlIssuedt : str20, (i12 & 1073741824) != 0 ? resultItem2.apdPermAdd2 : str21, (i12 & Integer.MIN_VALUE) != 0 ? resultItem2.apdPermAdd1 : str22, (i13 & 1) != 0 ? resultItem2.biSignature : str23, (i13 & 2) != 0 ? resultItem2.relFirstName : obj4, (i13 & 4) != 0 ? resultItem2.apdNaturalName : str24, (i13 & 8) != 0 ? resultItem2.relLastName : obj5, (i13 & 16) != 0 ? resultItem2.bioorgdonor : obj6, (i13 & 32) != 0 ? resultItem2.dlPrintStatus : str25, (i13 & 64) != 0 ? resultItem2.applFirstName : obj7, (i13 & 128) != 0 ? resultItem2.applLastName : obj8, (i13 & 256) != 0 ? resultItem2.applQualName : str26, (i13 & 512) != 0 ? resultItem2.biocitizen : str27, (i13 & 1024) != 0 ? resultItem2.dlNtValdtoDt : str28);
    }

    public final String component1() {
        return this.relationType;
    }

    public final Integer component10() {
        return this.apdPermPin;
    }

    public final Object component11() {
        return this.dlEndorsetime;
    }

    public final String component12() {
        return this.bloodGroup;
    }

    public final EligibleDLSerList component13() {
        return this.eligibleDLSerList;
    }

    public final String component14() {
        return this.dlEndorseAuth;
    }

    public final String component15() {
        return this.dlStatus;
    }

    public final String component16() {
        return this.dlIssueauth;
    }

    public final String component17() {
        return this.bioId;
    }

    public final DLCOVList component18() {
        return this.dLCOVList;
    }

    public final String component19() {
        return this.apdTempAdd2;
    }

    public final String component2() {
        return this.dlSeqno;
    }

    public final String component20() {
        return this.apdTempAdd3;
    }

    public final Object component21() {
        return this.biPhotoBase64;
    }

    public final String component22() {
        return this.apdTempAdd1;
    }

    public final Integer component23() {
        return this.apdTempPin;
    }

    public final Integer component24() {
        return this.applEmpCatg;
    }

    public final Object component25() {
        return this.biSignatureBase64;
    }

    public final Integer component26() {
        return this.dlLatestTrcode;
    }

    public final String component27() {
        return this.dlEndorsedt;
    }

    public final String component28() {
        return this.dlno;
    }

    public final String component29() {
        return this.apdPermAdd3;
    }

    public final String component3() {
        return this.dlDispatchStatus;
    }

    public final String component30() {
        return this.dlIssuedt;
    }

    public final String component31() {
        return this.apdPermAdd2;
    }

    public final String component32() {
        return this.apdPermAdd1;
    }

    public final String component33() {
        return this.biSignature;
    }

    public final Object component34() {
        return this.relFirstName;
    }

    public final String component35() {
        return this.apdNaturalName;
    }

    public final Object component36() {
        return this.relLastName;
    }

    public final Object component37() {
        return this.bioorgdonor;
    }

    public final String component38() {
        return this.dlPrintStatus;
    }

    public final Object component39() {
        return this.applFirstName;
    }

    public final String component4() {
        return this.dlRemarks;
    }

    public final Object component40() {
        return this.applLastName;
    }

    public final String component41() {
        return this.applQualName;
    }

    public final String component42() {
        return this.biocitizen;
    }

    public final String component43() {
        return this.dlNtValdtoDt;
    }

    public final String component5() {
        return this.dlRecGenesis;
    }

    public final String component6() {
        return this.biPhoto;
    }

    public final String component7() {
        return this.dlNtValdfrDt;
    }

    public final String component8() {
        return this.applFullName;
    }

    public final Integer component9() {
        return this.hazIssueinsttCode;
    }

    public final ResultItem copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Object obj, String str9, EligibleDLSerList eligibleDLSerList2, String str10, String str11, String str12, String str13, DLCOVList dLCOVList2, String str14, String str15, Object obj2, String str16, Integer num3, Integer num4, Object obj3, Integer num5, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Object obj4, String str24, Object obj5, Object obj6, String str25, Object obj7, Object obj8, String str26, String str27, String str28) {
        return new ResultItem(str, str2, str3, str4, str5, str6, str7, str8, num, num2, obj, str9, eligibleDLSerList2, str10, str11, str12, str13, dLCOVList2, str14, str15, obj2, str16, num3, num4, obj3, num5, str17, str18, str19, str20, str21, str22, str23, obj4, str24, obj5, obj6, str25, obj7, obj8, str26, str27, str28);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultItem)) {
            return false;
        }
        ResultItem resultItem = (ResultItem) obj;
        return l.a(this.relationType, resultItem.relationType) && l.a(this.dlSeqno, resultItem.dlSeqno) && l.a(this.dlDispatchStatus, resultItem.dlDispatchStatus) && l.a(this.dlRemarks, resultItem.dlRemarks) && l.a(this.dlRecGenesis, resultItem.dlRecGenesis) && l.a(this.biPhoto, resultItem.biPhoto) && l.a(this.dlNtValdfrDt, resultItem.dlNtValdfrDt) && l.a(this.applFullName, resultItem.applFullName) && l.a(this.hazIssueinsttCode, resultItem.hazIssueinsttCode) && l.a(this.apdPermPin, resultItem.apdPermPin) && l.a(this.dlEndorsetime, resultItem.dlEndorsetime) && l.a(this.bloodGroup, resultItem.bloodGroup) && l.a(this.eligibleDLSerList, resultItem.eligibleDLSerList) && l.a(this.dlEndorseAuth, resultItem.dlEndorseAuth) && l.a(this.dlStatus, resultItem.dlStatus) && l.a(this.dlIssueauth, resultItem.dlIssueauth) && l.a(this.bioId, resultItem.bioId) && l.a(this.dLCOVList, resultItem.dLCOVList) && l.a(this.apdTempAdd2, resultItem.apdTempAdd2) && l.a(this.apdTempAdd3, resultItem.apdTempAdd3) && l.a(this.biPhotoBase64, resultItem.biPhotoBase64) && l.a(this.apdTempAdd1, resultItem.apdTempAdd1) && l.a(this.apdTempPin, resultItem.apdTempPin) && l.a(this.applEmpCatg, resultItem.applEmpCatg) && l.a(this.biSignatureBase64, resultItem.biSignatureBase64) && l.a(this.dlLatestTrcode, resultItem.dlLatestTrcode) && l.a(this.dlEndorsedt, resultItem.dlEndorsedt) && l.a(this.dlno, resultItem.dlno) && l.a(this.apdPermAdd3, resultItem.apdPermAdd3) && l.a(this.dlIssuedt, resultItem.dlIssuedt) && l.a(this.apdPermAdd2, resultItem.apdPermAdd2) && l.a(this.apdPermAdd1, resultItem.apdPermAdd1) && l.a(this.biSignature, resultItem.biSignature) && l.a(this.relFirstName, resultItem.relFirstName) && l.a(this.apdNaturalName, resultItem.apdNaturalName) && l.a(this.relLastName, resultItem.relLastName) && l.a(this.bioorgdonor, resultItem.bioorgdonor) && l.a(this.dlPrintStatus, resultItem.dlPrintStatus) && l.a(this.applFirstName, resultItem.applFirstName) && l.a(this.applLastName, resultItem.applLastName) && l.a(this.applQualName, resultItem.applQualName) && l.a(this.biocitizen, resultItem.biocitizen) && l.a(this.dlNtValdtoDt, resultItem.dlNtValdtoDt);
    }

    public final String getApdNaturalName() {
        return this.apdNaturalName;
    }

    public final String getApdPermAdd1() {
        return this.apdPermAdd1;
    }

    public final String getApdPermAdd2() {
        return this.apdPermAdd2;
    }

    public final String getApdPermAdd3() {
        return this.apdPermAdd3;
    }

    public final Integer getApdPermPin() {
        return this.apdPermPin;
    }

    public final String getApdTempAdd1() {
        return this.apdTempAdd1;
    }

    public final String getApdTempAdd2() {
        return this.apdTempAdd2;
    }

    public final String getApdTempAdd3() {
        return this.apdTempAdd3;
    }

    public final Integer getApdTempPin() {
        return this.apdTempPin;
    }

    public final Integer getApplEmpCatg() {
        return this.applEmpCatg;
    }

    public final Object getApplFirstName() {
        return this.applFirstName;
    }

    public final String getApplFullName() {
        return this.applFullName;
    }

    public final Object getApplLastName() {
        return this.applLastName;
    }

    public final String getApplQualName() {
        return this.applQualName;
    }

    public final String getBiPhoto() {
        return this.biPhoto;
    }

    public final Object getBiPhotoBase64() {
        return this.biPhotoBase64;
    }

    public final String getBiSignature() {
        return this.biSignature;
    }

    public final Object getBiSignatureBase64() {
        return this.biSignatureBase64;
    }

    public final String getBioId() {
        return this.bioId;
    }

    public final String getBiocitizen() {
        return this.biocitizen;
    }

    public final Object getBioorgdonor() {
        return this.bioorgdonor;
    }

    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    public final DLCOVList getDLCOVList() {
        return this.dLCOVList;
    }

    public final String getDlDispatchStatus() {
        return this.dlDispatchStatus;
    }

    public final String getDlEndorseAuth() {
        return this.dlEndorseAuth;
    }

    public final String getDlEndorsedt() {
        return this.dlEndorsedt;
    }

    public final Object getDlEndorsetime() {
        return this.dlEndorsetime;
    }

    public final String getDlIssueauth() {
        return this.dlIssueauth;
    }

    public final String getDlIssuedt() {
        return this.dlIssuedt;
    }

    public final Integer getDlLatestTrcode() {
        return this.dlLatestTrcode;
    }

    public final String getDlNtValdfrDt() {
        return this.dlNtValdfrDt;
    }

    public final String getDlNtValdtoDt() {
        return this.dlNtValdtoDt;
    }

    public final String getDlPrintStatus() {
        return this.dlPrintStatus;
    }

    public final String getDlRecGenesis() {
        return this.dlRecGenesis;
    }

    public final String getDlRemarks() {
        return this.dlRemarks;
    }

    public final String getDlSeqno() {
        return this.dlSeqno;
    }

    public final String getDlStatus() {
        return this.dlStatus;
    }

    public final String getDlno() {
        return this.dlno;
    }

    public final EligibleDLSerList getEligibleDLSerList() {
        return this.eligibleDLSerList;
    }

    public final Integer getHazIssueinsttCode() {
        return this.hazIssueinsttCode;
    }

    public final Object getRelFirstName() {
        return this.relFirstName;
    }

    public final Object getRelLastName() {
        return this.relLastName;
    }

    public final String getRelationType() {
        return this.relationType;
    }

    public int hashCode() {
        String str = this.relationType;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dlSeqno;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dlDispatchStatus;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dlRemarks;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dlRecGenesis;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.biPhoto;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.dlNtValdfrDt;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.applFullName;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.hazIssueinsttCode;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.apdPermPin;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Object obj = this.dlEndorsetime;
        int hashCode11 = (hashCode10 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str9 = this.bloodGroup;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        EligibleDLSerList eligibleDLSerList2 = this.eligibleDLSerList;
        int hashCode13 = (hashCode12 + (eligibleDLSerList2 == null ? 0 : eligibleDLSerList2.hashCode())) * 31;
        String str10 = this.dlEndorseAuth;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.dlStatus;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.dlIssueauth;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.bioId;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        DLCOVList dLCOVList2 = this.dLCOVList;
        int hashCode18 = (hashCode17 + (dLCOVList2 == null ? 0 : dLCOVList2.hashCode())) * 31;
        String str14 = this.apdTempAdd2;
        int hashCode19 = (hashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.apdTempAdd3;
        int hashCode20 = (hashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Object obj2 = this.biPhotoBase64;
        int hashCode21 = (hashCode20 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str16 = this.apdTempAdd1;
        int hashCode22 = (hashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Integer num3 = this.apdTempPin;
        int hashCode23 = (hashCode22 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.applEmpCatg;
        int hashCode24 = (hashCode23 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Object obj3 = this.biSignatureBase64;
        int hashCode25 = (hashCode24 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Integer num5 = this.dlLatestTrcode;
        int hashCode26 = (hashCode25 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str17 = this.dlEndorsedt;
        int hashCode27 = (hashCode26 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.dlno;
        int hashCode28 = (hashCode27 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.apdPermAdd3;
        int hashCode29 = (hashCode28 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.dlIssuedt;
        int hashCode30 = (hashCode29 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.apdPermAdd2;
        int hashCode31 = (hashCode30 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.apdPermAdd1;
        int hashCode32 = (hashCode31 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.biSignature;
        int hashCode33 = (hashCode32 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Object obj4 = this.relFirstName;
        int hashCode34 = (hashCode33 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        String str24 = this.apdNaturalName;
        int hashCode35 = (hashCode34 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Object obj5 = this.relLastName;
        int hashCode36 = (hashCode35 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
        Object obj6 = this.bioorgdonor;
        int hashCode37 = (hashCode36 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
        String str25 = this.dlPrintStatus;
        int hashCode38 = (hashCode37 + (str25 == null ? 0 : str25.hashCode())) * 31;
        Object obj7 = this.applFirstName;
        int hashCode39 = (hashCode38 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
        Object obj8 = this.applLastName;
        int hashCode40 = (hashCode39 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
        String str26 = this.applQualName;
        int hashCode41 = (hashCode40 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.biocitizen;
        int hashCode42 = (hashCode41 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.dlNtValdtoDt;
        if (str28 != null) {
            i10 = str28.hashCode();
        }
        return hashCode42 + i10;
    }

    public String toString() {
        return "ResultItem(relationType=" + this.relationType + ", dlSeqno=" + this.dlSeqno + ", dlDispatchStatus=" + this.dlDispatchStatus + ", dlRemarks=" + this.dlRemarks + ", dlRecGenesis=" + this.dlRecGenesis + ", biPhoto=" + this.biPhoto + ", dlNtValdfrDt=" + this.dlNtValdfrDt + ", applFullName=" + this.applFullName + ", hazIssueinsttCode=" + this.hazIssueinsttCode + ", apdPermPin=" + this.apdPermPin + ", dlEndorsetime=" + this.dlEndorsetime + ", bloodGroup=" + this.bloodGroup + ", eligibleDLSerList=" + this.eligibleDLSerList + ", dlEndorseAuth=" + this.dlEndorseAuth + ", dlStatus=" + this.dlStatus + ", dlIssueauth=" + this.dlIssueauth + ", bioId=" + this.bioId + ", dLCOVList=" + this.dLCOVList + ", apdTempAdd2=" + this.apdTempAdd2 + ", apdTempAdd3=" + this.apdTempAdd3 + ", biPhotoBase64=" + this.biPhotoBase64 + ", apdTempAdd1=" + this.apdTempAdd1 + ", apdTempPin=" + this.apdTempPin + ", applEmpCatg=" + this.applEmpCatg + ", biSignatureBase64=" + this.biSignatureBase64 + ", dlLatestTrcode=" + this.dlLatestTrcode + ", dlEndorsedt=" + this.dlEndorsedt + ", dlno=" + this.dlno + ", apdPermAdd3=" + this.apdPermAdd3 + ", dlIssuedt=" + this.dlIssuedt + ", apdPermAdd2=" + this.apdPermAdd2 + ", apdPermAdd1=" + this.apdPermAdd1 + ", biSignature=" + this.biSignature + ", relFirstName=" + this.relFirstName + ", apdNaturalName=" + this.apdNaturalName + ", relLastName=" + this.relLastName + ", bioorgdonor=" + this.bioorgdonor + ", dlPrintStatus=" + this.dlPrintStatus + ", applFirstName=" + this.applFirstName + ", applLastName=" + this.applLastName + ", applQualName=" + this.applQualName + ", biocitizen=" + this.biocitizen + ", dlNtValdtoDt=" + this.dlNtValdtoDt + ')';
    }

    public ResultItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Object obj, String str9, EligibleDLSerList eligibleDLSerList2, String str10, String str11, String str12, String str13, DLCOVList dLCOVList2, String str14, String str15, Object obj2, String str16, Integer num3, Integer num4, Object obj3, Integer num5, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Object obj4, String str24, Object obj5, Object obj6, String str25, Object obj7, Object obj8, String str26, String str27, String str28) {
        this.relationType = str;
        this.dlSeqno = str2;
        this.dlDispatchStatus = str3;
        this.dlRemarks = str4;
        this.dlRecGenesis = str5;
        this.biPhoto = str6;
        this.dlNtValdfrDt = str7;
        this.applFullName = str8;
        this.hazIssueinsttCode = num;
        this.apdPermPin = num2;
        this.dlEndorsetime = obj;
        this.bloodGroup = str9;
        this.eligibleDLSerList = eligibleDLSerList2;
        this.dlEndorseAuth = str10;
        this.dlStatus = str11;
        this.dlIssueauth = str12;
        this.bioId = str13;
        this.dLCOVList = dLCOVList2;
        this.apdTempAdd2 = str14;
        this.apdTempAdd3 = str15;
        this.biPhotoBase64 = obj2;
        this.apdTempAdd1 = str16;
        this.apdTempPin = num3;
        this.applEmpCatg = num4;
        this.biSignatureBase64 = obj3;
        this.dlLatestTrcode = num5;
        this.dlEndorsedt = str17;
        this.dlno = str18;
        this.apdPermAdd3 = str19;
        this.dlIssuedt = str20;
        this.apdPermAdd2 = str21;
        this.apdPermAdd1 = str22;
        this.biSignature = str23;
        this.relFirstName = obj4;
        this.apdNaturalName = str24;
        this.relLastName = obj5;
        this.bioorgdonor = obj6;
        this.dlPrintStatus = str25;
        this.applFirstName = obj7;
        this.applLastName = obj8;
        this.applQualName = str26;
        this.biocitizen = str27;
        this.dlNtValdtoDt = str28;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ResultItem(java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.Integer r51, java.lang.Integer r52, java.lang.Object r53, java.lang.String r54, com.nic.mparivahan.dlservices.data.model.EligibleDLSerList r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, com.nic.mparivahan.dlservices.data.model.DLCOVList r60, java.lang.String r61, java.lang.String r62, java.lang.Object r63, java.lang.String r64, java.lang.Integer r65, java.lang.Integer r66, java.lang.Object r67, java.lang.Integer r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.Object r76, java.lang.String r77, java.lang.Object r78, java.lang.Object r79, java.lang.String r80, java.lang.Object r81, java.lang.Object r82, java.lang.String r83, java.lang.String r84, java.lang.String r85, int r86, int r87, cm.g r88) {
        /*
            r42 = this;
            r0 = r86
            r1 = r87
            r2 = r0 & 1
            if (r2 == 0) goto L_0x000a
            r2 = 0
            goto L_0x000c
        L_0x000a:
            r2 = r43
        L_0x000c:
            r4 = r0 & 2
            if (r4 == 0) goto L_0x0012
            r4 = 0
            goto L_0x0014
        L_0x0012:
            r4 = r44
        L_0x0014:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001a
            r5 = 0
            goto L_0x001c
        L_0x001a:
            r5 = r45
        L_0x001c:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0022
            r6 = 0
            goto L_0x0024
        L_0x0022:
            r6 = r46
        L_0x0024:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r47
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r48
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r49
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r50
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = 0
            goto L_0x004c
        L_0x004a:
            r11 = r51
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            r12 = 0
            goto L_0x0054
        L_0x0052:
            r12 = r52
        L_0x0054:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005a
            r13 = 0
            goto L_0x005c
        L_0x005a:
            r13 = r53
        L_0x005c:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0062
            r14 = 0
            goto L_0x0064
        L_0x0062:
            r14 = r54
        L_0x0064:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006a
            r15 = 0
            goto L_0x006c
        L_0x006a:
            r15 = r55
        L_0x006c:
            r3 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0072
            r3 = 0
            goto L_0x0074
        L_0x0072:
            r3 = r56
        L_0x0074:
            r16 = r3
            r3 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x007c
            r3 = 0
            goto L_0x007e
        L_0x007c:
            r3 = r57
        L_0x007e:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0088
            r17 = 0
            goto L_0x008a
        L_0x0088:
            r17 = r58
        L_0x008a:
            r18 = 65536(0x10000, float:9.18355E-41)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x0093
            r18 = 0
            goto L_0x0095
        L_0x0093:
            r18 = r59
        L_0x0095:
            r19 = 131072(0x20000, float:1.83671E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x009e
            r19 = 0
            goto L_0x00a0
        L_0x009e:
            r19 = r60
        L_0x00a0:
            r20 = 262144(0x40000, float:3.67342E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00a9
            r20 = 0
            goto L_0x00ab
        L_0x00a9:
            r20 = r61
        L_0x00ab:
            r21 = 524288(0x80000, float:7.34684E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00b4
            r21 = 0
            goto L_0x00b6
        L_0x00b4:
            r21 = r62
        L_0x00b6:
            r22 = 1048576(0x100000, float:1.469368E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00bf
            r22 = 0
            goto L_0x00c1
        L_0x00bf:
            r22 = r63
        L_0x00c1:
            r23 = 2097152(0x200000, float:2.938736E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00ca
            r23 = 0
            goto L_0x00cc
        L_0x00ca:
            r23 = r64
        L_0x00cc:
            r24 = 4194304(0x400000, float:5.877472E-39)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00d5
            r24 = 0
            goto L_0x00d7
        L_0x00d5:
            r24 = r65
        L_0x00d7:
            r25 = 8388608(0x800000, float:1.17549435E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00e0
            r25 = 0
            goto L_0x00e2
        L_0x00e0:
            r25 = r66
        L_0x00e2:
            r26 = 16777216(0x1000000, float:2.3509887E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00eb
            r26 = 0
            goto L_0x00ed
        L_0x00eb:
            r26 = r67
        L_0x00ed:
            r27 = 33554432(0x2000000, float:9.403955E-38)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00f6
            r27 = 0
            goto L_0x00f8
        L_0x00f6:
            r27 = r68
        L_0x00f8:
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x0101
            r28 = 0
            goto L_0x0103
        L_0x0101:
            r28 = r69
        L_0x0103:
            r29 = 134217728(0x8000000, float:3.85186E-34)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x010c
            r29 = 0
            goto L_0x010e
        L_0x010c:
            r29 = r70
        L_0x010e:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x0117
            r30 = 0
            goto L_0x0119
        L_0x0117:
            r30 = r71
        L_0x0119:
            r31 = 536870912(0x20000000, float:1.0842022E-19)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x0122
            r31 = 0
            goto L_0x0124
        L_0x0122:
            r31 = r72
        L_0x0124:
            r32 = 1073741824(0x40000000, float:2.0)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x012d
            r32 = 0
            goto L_0x012f
        L_0x012d:
            r32 = r73
        L_0x012f:
            r33 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r33
            if (r0 == 0) goto L_0x0137
            r0 = 0
            goto L_0x0139
        L_0x0137:
            r0 = r74
        L_0x0139:
            r33 = r1 & 1
            if (r33 == 0) goto L_0x0140
            r33 = 0
            goto L_0x0142
        L_0x0140:
            r33 = r75
        L_0x0142:
            r34 = r1 & 2
            if (r34 == 0) goto L_0x0149
            r34 = 0
            goto L_0x014b
        L_0x0149:
            r34 = r76
        L_0x014b:
            r35 = r1 & 4
            if (r35 == 0) goto L_0x0152
            r35 = 0
            goto L_0x0154
        L_0x0152:
            r35 = r77
        L_0x0154:
            r36 = r1 & 8
            if (r36 == 0) goto L_0x015b
            r36 = 0
            goto L_0x015d
        L_0x015b:
            r36 = r78
        L_0x015d:
            r37 = r1 & 16
            if (r37 == 0) goto L_0x0164
            r37 = 0
            goto L_0x0166
        L_0x0164:
            r37 = r79
        L_0x0166:
            r38 = r1 & 32
            if (r38 == 0) goto L_0x016d
            r38 = 0
            goto L_0x016f
        L_0x016d:
            r38 = r80
        L_0x016f:
            r39 = r1 & 64
            if (r39 == 0) goto L_0x0176
            r39 = 0
            goto L_0x0178
        L_0x0176:
            r39 = r81
        L_0x0178:
            r86 = r0
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0180
            r0 = 0
            goto L_0x0182
        L_0x0180:
            r0 = r82
        L_0x0182:
            r40 = r0
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x018a
            r0 = 0
            goto L_0x018c
        L_0x018a:
            r0 = r83
        L_0x018c:
            r41 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0194
            r0 = 0
            goto L_0x0196
        L_0x0194:
            r0 = r84
        L_0x0196:
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x019c
            r1 = 0
            goto L_0x019e
        L_0x019c:
            r1 = r85
        L_0x019e:
            r43 = r42
            r44 = r2
            r45 = r4
            r46 = r5
            r47 = r6
            r48 = r7
            r49 = r8
            r50 = r9
            r51 = r10
            r52 = r11
            r53 = r12
            r54 = r13
            r55 = r14
            r56 = r15
            r57 = r16
            r58 = r3
            r59 = r17
            r60 = r18
            r61 = r19
            r62 = r20
            r63 = r21
            r64 = r22
            r65 = r23
            r66 = r24
            r67 = r25
            r68 = r26
            r69 = r27
            r70 = r28
            r71 = r29
            r72 = r30
            r73 = r31
            r74 = r32
            r75 = r86
            r76 = r33
            r77 = r34
            r78 = r35
            r79 = r36
            r80 = r37
            r81 = r38
            r82 = r39
            r83 = r40
            r84 = r41
            r85 = r0
            r86 = r1
            r43.<init>(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.data.model.ResultItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Object, java.lang.String, com.nic.mparivahan.dlservices.data.model.EligibleDLSerList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.nic.mparivahan.dlservices.data.model.DLCOVList, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Object, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, int, int, cm.g):void");
    }
}
