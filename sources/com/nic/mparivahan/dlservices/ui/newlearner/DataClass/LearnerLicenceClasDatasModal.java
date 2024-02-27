package com.nic.mparivahan.dlservices.ui.newlearner.DataClass;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class LearnerLicenceClasDatasModal implements Parcelable {
    public static final Parcelable.Creator<LearnerLicenceClasDatasModal> CREATOR = new a();
    @c("cov_code")
    private final String covCode;
    @c("cov_name")
    private final String covName;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final LearnerLicenceClasDatasModal createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new LearnerLicenceClasDatasModal(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final LearnerLicenceClasDatasModal[] newArray(int i10) {
            return new LearnerLicenceClasDatasModal[i10];
        }
    }

    public LearnerLicenceClasDatasModal() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ LearnerLicenceClasDatasModal copy$default(LearnerLicenceClasDatasModal learnerLicenceClasDatasModal, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = learnerLicenceClasDatasModal.covName;
        }
        if ((i10 & 2) != 0) {
            str2 = learnerLicenceClasDatasModal.covCode;
        }
        return learnerLicenceClasDatasModal.copy(str, str2);
    }

    public final String component1() {
        return this.covName;
    }

    public final String component2() {
        return this.covCode;
    }

    public final LearnerLicenceClasDatasModal copy(String str, String str2) {
        l.f(str, "covName");
        l.f(str2, "covCode");
        return new LearnerLicenceClasDatasModal(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LearnerLicenceClasDatasModal)) {
            return false;
        }
        LearnerLicenceClasDatasModal learnerLicenceClasDatasModal = (LearnerLicenceClasDatasModal) obj;
        return l.a(this.covName, learnerLicenceClasDatasModal.covName) && l.a(this.covCode, learnerLicenceClasDatasModal.covCode);
    }

    public final String getCovCode() {
        return this.covCode;
    }

    public final String getCovName() {
        return this.covName;
    }

    public int hashCode() {
        return (this.covName.hashCode() * 31) + this.covCode.hashCode();
    }

    public String toString() {
        return "LearnerLicenceClasDatasModal(covName=" + this.covName + ", covCode=" + this.covCode + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeString(this.covName);
        parcel.writeString(this.covCode);
    }

    public LearnerLicenceClasDatasModal(String str, String str2) {
        l.f(str, "covName");
        l.f(str2, "covCode");
        this.covName = str;
        this.covCode = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LearnerLicenceClasDatasModal(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
