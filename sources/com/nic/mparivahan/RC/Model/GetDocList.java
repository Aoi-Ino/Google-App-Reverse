package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class GetDocList {
    private final List<MparCitizenDocInfo> mparCitizenDocInfo;

    public GetDocList(List<MparCitizenDocInfo> list) {
        l.f(list, "mparCitizenDocInfo");
        this.mparCitizenDocInfo = list;
    }

    public static /* synthetic */ GetDocList copy$default(GetDocList getDocList, List<MparCitizenDocInfo> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getDocList.mparCitizenDocInfo;
        }
        return getDocList.copy(list);
    }

    public final List<MparCitizenDocInfo> component1() {
        return this.mparCitizenDocInfo;
    }

    public final GetDocList copy(List<MparCitizenDocInfo> list) {
        l.f(list, "mparCitizenDocInfo");
        return new GetDocList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetDocList) && l.a(this.mparCitizenDocInfo, ((GetDocList) obj).mparCitizenDocInfo);
    }

    public final List<MparCitizenDocInfo> getMparCitizenDocInfo() {
        return this.mparCitizenDocInfo;
    }

    public int hashCode() {
        return this.mparCitizenDocInfo.hashCode();
    }

    public String toString() {
        return "GetDocList(mparCitizenDocInfo=" + this.mparCitizenDocInfo + ')';
    }
}
