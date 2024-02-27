package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class UploadDataDto {
    private final String applno;
    private final List<Mandatory> mandatoryList;
    private final List<NonUploaded> nonUploadedList;
    private final String purposeCode;
    private final String purposeName;
    private final String state;
    private final List<Uploaded> uploadedList;

    public UploadDataDto(String str, List<Mandatory> list, List<NonUploaded> list2, String str2, String str3, String str4, List<Uploaded> list3) {
        l.f(str, "applno");
        l.f(list, "mandatoryList");
        l.f(list2, "nonUploadedList");
        l.f(str2, "purposeCode");
        l.f(str3, "purposeName");
        l.f(str4, "state");
        l.f(list3, "uploadedList");
        this.applno = str;
        this.mandatoryList = list;
        this.nonUploadedList = list2;
        this.purposeCode = str2;
        this.purposeName = str3;
        this.state = str4;
        this.uploadedList = list3;
    }

    public static /* synthetic */ UploadDataDto copy$default(UploadDataDto uploadDataDto, String str, List<Mandatory> list, List<NonUploaded> list2, String str2, String str3, String str4, List<Uploaded> list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = uploadDataDto.applno;
        }
        if ((i10 & 2) != 0) {
            list = uploadDataDto.mandatoryList;
        }
        List<Mandatory> list4 = list;
        if ((i10 & 4) != 0) {
            list2 = uploadDataDto.nonUploadedList;
        }
        List<NonUploaded> list5 = list2;
        if ((i10 & 8) != 0) {
            str2 = uploadDataDto.purposeCode;
        }
        String str5 = str2;
        if ((i10 & 16) != 0) {
            str3 = uploadDataDto.purposeName;
        }
        String str6 = str3;
        if ((i10 & 32) != 0) {
            str4 = uploadDataDto.state;
        }
        String str7 = str4;
        if ((i10 & 64) != 0) {
            list3 = uploadDataDto.uploadedList;
        }
        return uploadDataDto.copy(str, list4, list5, str5, str6, str7, list3);
    }

    public final String component1() {
        return this.applno;
    }

    public final List<Mandatory> component2() {
        return this.mandatoryList;
    }

    public final List<NonUploaded> component3() {
        return this.nonUploadedList;
    }

    public final String component4() {
        return this.purposeCode;
    }

    public final String component5() {
        return this.purposeName;
    }

    public final String component6() {
        return this.state;
    }

    public final List<Uploaded> component7() {
        return this.uploadedList;
    }

    public final UploadDataDto copy(String str, List<Mandatory> list, List<NonUploaded> list2, String str2, String str3, String str4, List<Uploaded> list3) {
        l.f(str, "applno");
        l.f(list, "mandatoryList");
        l.f(list2, "nonUploadedList");
        l.f(str2, "purposeCode");
        l.f(str3, "purposeName");
        l.f(str4, "state");
        List<Uploaded> list4 = list3;
        l.f(list4, "uploadedList");
        return new UploadDataDto(str, list, list2, str2, str3, str4, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadDataDto)) {
            return false;
        }
        UploadDataDto uploadDataDto = (UploadDataDto) obj;
        return l.a(this.applno, uploadDataDto.applno) && l.a(this.mandatoryList, uploadDataDto.mandatoryList) && l.a(this.nonUploadedList, uploadDataDto.nonUploadedList) && l.a(this.purposeCode, uploadDataDto.purposeCode) && l.a(this.purposeName, uploadDataDto.purposeName) && l.a(this.state, uploadDataDto.state) && l.a(this.uploadedList, uploadDataDto.uploadedList);
    }

    public final String getApplno() {
        return this.applno;
    }

    public final List<Mandatory> getMandatoryList() {
        return this.mandatoryList;
    }

    public final List<NonUploaded> getNonUploadedList() {
        return this.nonUploadedList;
    }

    public final String getPurposeCode() {
        return this.purposeCode;
    }

    public final String getPurposeName() {
        return this.purposeName;
    }

    public final String getState() {
        return this.state;
    }

    public final List<Uploaded> getUploadedList() {
        return this.uploadedList;
    }

    public int hashCode() {
        return (((((((((((this.applno.hashCode() * 31) + this.mandatoryList.hashCode()) * 31) + this.nonUploadedList.hashCode()) * 31) + this.purposeCode.hashCode()) * 31) + this.purposeName.hashCode()) * 31) + this.state.hashCode()) * 31) + this.uploadedList.hashCode();
    }

    public String toString() {
        return "UploadDataDto(applno=" + this.applno + ", mandatoryList=" + this.mandatoryList + ", nonUploadedList=" + this.nonUploadedList + ", purposeCode=" + this.purposeCode + ", purposeName=" + this.purposeName + ", state=" + this.state + ", uploadedList=" + this.uploadedList + ')';
    }
}
