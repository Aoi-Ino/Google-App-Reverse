package com.nic.mparivahan.VahanServices.RenewalOfPermit.RPDataModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class vmRegion {
    private final VmRegionDetailsDto vmRegionDetailsDto;

    public vmRegion(VmRegionDetailsDto vmRegionDetailsDto2) {
        l.f(vmRegionDetailsDto2, "vmRegionDetailsDto");
        this.vmRegionDetailsDto = vmRegionDetailsDto2;
    }

    public static /* synthetic */ vmRegion copy$default(vmRegion vmregion, VmRegionDetailsDto vmRegionDetailsDto2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            vmRegionDetailsDto2 = vmregion.vmRegionDetailsDto;
        }
        return vmregion.copy(vmRegionDetailsDto2);
    }

    public final VmRegionDetailsDto component1() {
        return this.vmRegionDetailsDto;
    }

    public final vmRegion copy(VmRegionDetailsDto vmRegionDetailsDto2) {
        l.f(vmRegionDetailsDto2, "vmRegionDetailsDto");
        return new vmRegion(vmRegionDetailsDto2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vmRegion) && l.a(this.vmRegionDetailsDto, ((vmRegion) obj).vmRegionDetailsDto);
    }

    public final VmRegionDetailsDto getVmRegionDetailsDto() {
        return this.vmRegionDetailsDto;
    }

    public int hashCode() {
        return this.vmRegionDetailsDto.hashCode();
    }

    public String toString() {
        return "vmRegion(vmRegionDetailsDto=" + this.vmRegionDetailsDto + ')';
    }
}
