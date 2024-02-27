package com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;
import java.util.ArrayList;

@Keep
public final class VmRegionDetailsDto implements Serializable {
    private final Integer offCd;
    private final ArrayList<String> region;
    private final ArrayList<Integer> regionCd;
    private final ArrayList<Integer> regionsCovered;
    private final String stateCd;

    public VmRegionDetailsDto(Integer num, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, ArrayList<Integer> arrayList3, String str) {
        this.offCd = num;
        this.region = arrayList;
        this.regionCd = arrayList2;
        this.regionsCovered = arrayList3;
        this.stateCd = str;
    }

    public static /* synthetic */ VmRegionDetailsDto copy$default(VmRegionDetailsDto vmRegionDetailsDto, Integer num, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, ArrayList<Integer> arrayList3, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = vmRegionDetailsDto.offCd;
        }
        if ((i10 & 2) != 0) {
            arrayList = vmRegionDetailsDto.region;
        }
        ArrayList<String> arrayList4 = arrayList;
        if ((i10 & 4) != 0) {
            arrayList2 = vmRegionDetailsDto.regionCd;
        }
        ArrayList<Integer> arrayList5 = arrayList2;
        if ((i10 & 8) != 0) {
            arrayList3 = vmRegionDetailsDto.regionsCovered;
        }
        ArrayList<Integer> arrayList6 = arrayList3;
        if ((i10 & 16) != 0) {
            str = vmRegionDetailsDto.stateCd;
        }
        return vmRegionDetailsDto.copy(num, arrayList4, arrayList5, arrayList6, str);
    }

    public final Integer component1() {
        return this.offCd;
    }

    public final ArrayList<String> component2() {
        return this.region;
    }

    public final ArrayList<Integer> component3() {
        return this.regionCd;
    }

    public final ArrayList<Integer> component4() {
        return this.regionsCovered;
    }

    public final String component5() {
        return this.stateCd;
    }

    public final VmRegionDetailsDto copy(Integer num, ArrayList<String> arrayList, ArrayList<Integer> arrayList2, ArrayList<Integer> arrayList3, String str) {
        return new VmRegionDetailsDto(num, arrayList, arrayList2, arrayList3, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmRegionDetailsDto)) {
            return false;
        }
        VmRegionDetailsDto vmRegionDetailsDto = (VmRegionDetailsDto) obj;
        return l.a(this.offCd, vmRegionDetailsDto.offCd) && l.a(this.region, vmRegionDetailsDto.region) && l.a(this.regionCd, vmRegionDetailsDto.regionCd) && l.a(this.regionsCovered, vmRegionDetailsDto.regionsCovered) && l.a(this.stateCd, vmRegionDetailsDto.stateCd);
    }

    public final Integer getOffCd() {
        return this.offCd;
    }

    public final ArrayList<String> getRegion() {
        return this.region;
    }

    public final ArrayList<Integer> getRegionCd() {
        return this.regionCd;
    }

    public final ArrayList<Integer> getRegionsCovered() {
        return this.regionsCovered;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public int hashCode() {
        Integer num = this.offCd;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        ArrayList<String> arrayList = this.region;
        int hashCode2 = (hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<Integer> arrayList2 = this.regionCd;
        int hashCode3 = (hashCode2 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList<Integer> arrayList3 = this.regionsCovered;
        int hashCode4 = (hashCode3 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        String str = this.stateCd;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "VmRegionDetailsDto(offCd=" + this.offCd + ", region=" + this.region + ", regionCd=" + this.regionCd + ", regionsCovered=" + this.regionsCovered + ", stateCd=" + this.stateCd + ')';
    }
}
