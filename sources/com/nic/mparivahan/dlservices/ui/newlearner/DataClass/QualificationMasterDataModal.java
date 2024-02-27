package com.nic.mparivahan.dlservices.ui.newlearner.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class QualificationMasterDataModal {
    @c("qualification_code")
    private final String qualificationCode;
    @c("qualification_name")
    private final String qualificationName;

    public QualificationMasterDataModal() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ QualificationMasterDataModal copy$default(QualificationMasterDataModal qualificationMasterDataModal, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = qualificationMasterDataModal.qualificationName;
        }
        if ((i10 & 2) != 0) {
            str2 = qualificationMasterDataModal.qualificationCode;
        }
        return qualificationMasterDataModal.copy(str, str2);
    }

    public final String component1() {
        return this.qualificationName;
    }

    public final String component2() {
        return this.qualificationCode;
    }

    public final QualificationMasterDataModal copy(String str, String str2) {
        l.f(str, "qualificationName");
        l.f(str2, "qualificationCode");
        return new QualificationMasterDataModal(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QualificationMasterDataModal)) {
            return false;
        }
        QualificationMasterDataModal qualificationMasterDataModal = (QualificationMasterDataModal) obj;
        return l.a(this.qualificationName, qualificationMasterDataModal.qualificationName) && l.a(this.qualificationCode, qualificationMasterDataModal.qualificationCode);
    }

    public final String getQualificationCode() {
        return this.qualificationCode;
    }

    public final String getQualificationName() {
        return this.qualificationName;
    }

    public int hashCode() {
        return (this.qualificationName.hashCode() * 31) + this.qualificationCode.hashCode();
    }

    public String toString() {
        return "QualificationMasterDataModal(qualificationName=" + this.qualificationName + ", qualificationCode=" + this.qualificationCode + ')';
    }

    public QualificationMasterDataModal(String str, String str2) {
        l.f(str, "qualificationName");
        l.f(str2, "qualificationCode");
        this.qualificationName = str;
        this.qualificationCode = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QualificationMasterDataModal(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
