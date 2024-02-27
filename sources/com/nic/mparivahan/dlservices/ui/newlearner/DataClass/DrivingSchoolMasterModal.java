package com.nic.mparivahan.dlservices.ui.newlearner.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class DrivingSchoolMasterModal {
    @c("drivingSchool_code")
    private final String drivingSchoolCode;
    @c("drivingSchool_name")
    private final String drivingSchoolName;

    public DrivingSchoolMasterModal() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ DrivingSchoolMasterModal copy$default(DrivingSchoolMasterModal drivingSchoolMasterModal, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = drivingSchoolMasterModal.drivingSchoolName;
        }
        if ((i10 & 2) != 0) {
            str2 = drivingSchoolMasterModal.drivingSchoolCode;
        }
        return drivingSchoolMasterModal.copy(str, str2);
    }

    public final String component1() {
        return this.drivingSchoolName;
    }

    public final String component2() {
        return this.drivingSchoolCode;
    }

    public final DrivingSchoolMasterModal copy(String str, String str2) {
        l.f(str, "drivingSchoolName");
        l.f(str2, "drivingSchoolCode");
        return new DrivingSchoolMasterModal(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrivingSchoolMasterModal)) {
            return false;
        }
        DrivingSchoolMasterModal drivingSchoolMasterModal = (DrivingSchoolMasterModal) obj;
        return l.a(this.drivingSchoolName, drivingSchoolMasterModal.drivingSchoolName) && l.a(this.drivingSchoolCode, drivingSchoolMasterModal.drivingSchoolCode);
    }

    public final String getDrivingSchoolCode() {
        return this.drivingSchoolCode;
    }

    public final String getDrivingSchoolName() {
        return this.drivingSchoolName;
    }

    public int hashCode() {
        return (this.drivingSchoolName.hashCode() * 31) + this.drivingSchoolCode.hashCode();
    }

    public String toString() {
        return "DrivingSchoolMasterModal(drivingSchoolName=" + this.drivingSchoolName + ", drivingSchoolCode=" + this.drivingSchoolCode + ')';
    }

    public DrivingSchoolMasterModal(String str, String str2) {
        l.f(str, "drivingSchoolName");
        l.f(str2, "drivingSchoolCode");
        this.drivingSchoolName = str;
        this.drivingSchoolCode = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DrivingSchoolMasterModal(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
