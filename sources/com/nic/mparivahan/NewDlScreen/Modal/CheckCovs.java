package com.nic.mparivahan.NewDlScreen.Modal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class CheckCovs implements Parcelable {
    public static final Parcelable.Creator<CheckCovs> CREATOR = new a();
    @c("covAbbrDesc")
    private String covAbbrDesc;
    @c("covCode")
    private String covCode;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final CheckCovs createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new CheckCovs(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final CheckCovs[] newArray(int i10) {
            return new CheckCovs[i10];
        }
    }

    public CheckCovs() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ CheckCovs copy$default(CheckCovs checkCovs, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = checkCovs.covCode;
        }
        if ((i10 & 2) != 0) {
            str2 = checkCovs.covAbbrDesc;
        }
        return checkCovs.copy(str, str2);
    }

    public final String component1() {
        return this.covCode;
    }

    public final String component2() {
        return this.covAbbrDesc;
    }

    public final CheckCovs copy(String str, String str2) {
        return new CheckCovs(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckCovs)) {
            return false;
        }
        CheckCovs checkCovs = (CheckCovs) obj;
        return l.a(this.covCode, checkCovs.covCode) && l.a(this.covAbbrDesc, checkCovs.covAbbrDesc);
    }

    public final String getCovAbbrDesc() {
        return this.covAbbrDesc;
    }

    public final String getCovCode() {
        return this.covCode;
    }

    public int hashCode() {
        String str = this.covCode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.covAbbrDesc;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public final void setCovAbbrDesc(String str) {
        this.covAbbrDesc = str;
    }

    public final void setCovCode(String str) {
        this.covCode = str;
    }

    public String toString() {
        return "CheckCovs(covCode=" + this.covCode + ", covAbbrDesc=" + this.covAbbrDesc + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        parcel.writeString(this.covCode);
        parcel.writeString(this.covAbbrDesc);
    }

    public CheckCovs(String str, String str2) {
        this.covCode = str;
        this.covAbbrDesc = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckCovs(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
