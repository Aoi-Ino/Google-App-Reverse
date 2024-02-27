package com.nic.mparivahan.Sarathithreeservices.model.app_status;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;
import java.util.List;

@Keep
public final class ApplStatusDetail {
    private final ArrayList<ApplFlowStatus> applFlowStatusList;
    private final String applName;
    private final String applno;
    private final String applpendStatus;
    private final String dob;
    private final String gender;
    private final String isApsubStgsInorder;
    private final ArrayList<PendingAt> pendingAt;
    private final List<List<String>> reqObjlst;
    private final String rtoCd;
    private final String rtoName;
    private final String swdName;

    public ApplStatusDetail(ArrayList<ApplFlowStatus> arrayList, String str, String str2, String str3, String str4, String str5, String str6, List<? extends List<String>> list, String str7, String str8, String str9, ArrayList<PendingAt> arrayList2) {
        l.f(arrayList, "applFlowStatusList");
        l.f(str, "applName");
        l.f(str2, "applno");
        l.f(str3, "applpendStatus");
        l.f(str4, "dob");
        l.f(str5, "gender");
        l.f(str6, "isApsubStgsInorder");
        l.f(list, "reqObjlst");
        l.f(str7, "rtoCd");
        l.f(str8, "rtoName");
        l.f(str9, "swdName");
        l.f(arrayList2, "pendingAt");
        this.applFlowStatusList = arrayList;
        this.applName = str;
        this.applno = str2;
        this.applpendStatus = str3;
        this.dob = str4;
        this.gender = str5;
        this.isApsubStgsInorder = str6;
        this.reqObjlst = list;
        this.rtoCd = str7;
        this.rtoName = str8;
        this.swdName = str9;
        this.pendingAt = arrayList2;
    }

    public static /* synthetic */ ApplStatusDetail copy$default(ApplStatusDetail applStatusDetail, ArrayList arrayList, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9, ArrayList arrayList2, int i10, Object obj) {
        ApplStatusDetail applStatusDetail2 = applStatusDetail;
        int i11 = i10;
        return applStatusDetail.copy((i11 & 1) != 0 ? applStatusDetail2.applFlowStatusList : arrayList, (i11 & 2) != 0 ? applStatusDetail2.applName : str, (i11 & 4) != 0 ? applStatusDetail2.applno : str2, (i11 & 8) != 0 ? applStatusDetail2.applpendStatus : str3, (i11 & 16) != 0 ? applStatusDetail2.dob : str4, (i11 & 32) != 0 ? applStatusDetail2.gender : str5, (i11 & 64) != 0 ? applStatusDetail2.isApsubStgsInorder : str6, (i11 & 128) != 0 ? applStatusDetail2.reqObjlst : list, (i11 & 256) != 0 ? applStatusDetail2.rtoCd : str7, (i11 & 512) != 0 ? applStatusDetail2.rtoName : str8, (i11 & 1024) != 0 ? applStatusDetail2.swdName : str9, (i11 & 2048) != 0 ? applStatusDetail2.pendingAt : arrayList2);
    }

    public final ArrayList<ApplFlowStatus> component1() {
        return this.applFlowStatusList;
    }

    public final String component10() {
        return this.rtoName;
    }

    public final String component11() {
        return this.swdName;
    }

    public final ArrayList<PendingAt> component12() {
        return this.pendingAt;
    }

    public final String component2() {
        return this.applName;
    }

    public final String component3() {
        return this.applno;
    }

    public final String component4() {
        return this.applpendStatus;
    }

    public final String component5() {
        return this.dob;
    }

    public final String component6() {
        return this.gender;
    }

    public final String component7() {
        return this.isApsubStgsInorder;
    }

    public final List<List<String>> component8() {
        return this.reqObjlst;
    }

    public final String component9() {
        return this.rtoCd;
    }

    public final ApplStatusDetail copy(ArrayList<ApplFlowStatus> arrayList, String str, String str2, String str3, String str4, String str5, String str6, List<? extends List<String>> list, String str7, String str8, String str9, ArrayList<PendingAt> arrayList2) {
        l.f(arrayList, "applFlowStatusList");
        String str10 = str;
        l.f(str10, "applName");
        String str11 = str2;
        l.f(str11, "applno");
        String str12 = str3;
        l.f(str12, "applpendStatus");
        String str13 = str4;
        l.f(str13, "dob");
        String str14 = str5;
        l.f(str14, "gender");
        String str15 = str6;
        l.f(str15, "isApsubStgsInorder");
        List<? extends List<String>> list2 = list;
        l.f(list2, "reqObjlst");
        String str16 = str7;
        l.f(str16, "rtoCd");
        String str17 = str8;
        l.f(str17, "rtoName");
        String str18 = str9;
        l.f(str18, "swdName");
        ArrayList<PendingAt> arrayList3 = arrayList2;
        l.f(arrayList3, "pendingAt");
        return new ApplStatusDetail(arrayList, str10, str11, str12, str13, str14, str15, list2, str16, str17, str18, arrayList3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplStatusDetail)) {
            return false;
        }
        ApplStatusDetail applStatusDetail = (ApplStatusDetail) obj;
        return l.a(this.applFlowStatusList, applStatusDetail.applFlowStatusList) && l.a(this.applName, applStatusDetail.applName) && l.a(this.applno, applStatusDetail.applno) && l.a(this.applpendStatus, applStatusDetail.applpendStatus) && l.a(this.dob, applStatusDetail.dob) && l.a(this.gender, applStatusDetail.gender) && l.a(this.isApsubStgsInorder, applStatusDetail.isApsubStgsInorder) && l.a(this.reqObjlst, applStatusDetail.reqObjlst) && l.a(this.rtoCd, applStatusDetail.rtoCd) && l.a(this.rtoName, applStatusDetail.rtoName) && l.a(this.swdName, applStatusDetail.swdName) && l.a(this.pendingAt, applStatusDetail.pendingAt);
    }

    public final ArrayList<ApplFlowStatus> getApplFlowStatusList() {
        return this.applFlowStatusList;
    }

    public final String getApplName() {
        return this.applName;
    }

    public final String getApplno() {
        return this.applno;
    }

    public final String getApplpendStatus() {
        return this.applpendStatus;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getGender() {
        return this.gender;
    }

    public final ArrayList<PendingAt> getPendingAt() {
        return this.pendingAt;
    }

    public final List<List<String>> getReqObjlst() {
        return this.reqObjlst;
    }

    public final String getRtoCd() {
        return this.rtoCd;
    }

    public final String getRtoName() {
        return this.rtoName;
    }

    public final String getSwdName() {
        return this.swdName;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.applFlowStatusList.hashCode() * 31) + this.applName.hashCode()) * 31) + this.applno.hashCode()) * 31) + this.applpendStatus.hashCode()) * 31) + this.dob.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.isApsubStgsInorder.hashCode()) * 31) + this.reqObjlst.hashCode()) * 31) + this.rtoCd.hashCode()) * 31) + this.rtoName.hashCode()) * 31) + this.swdName.hashCode()) * 31) + this.pendingAt.hashCode();
    }

    public final String isApsubStgsInorder() {
        return this.isApsubStgsInorder;
    }

    public String toString() {
        return "ApplStatusDetail(applFlowStatusList=" + this.applFlowStatusList + ", applName=" + this.applName + ", applno=" + this.applno + ", applpendStatus=" + this.applpendStatus + ", dob=" + this.dob + ", gender=" + this.gender + ", isApsubStgsInorder=" + this.isApsubStgsInorder + ", reqObjlst=" + this.reqObjlst + ", rtoCd=" + this.rtoCd + ", rtoName=" + this.rtoName + ", swdName=" + this.swdName + ", pendingAt=" + this.pendingAt + ')';
    }
}
