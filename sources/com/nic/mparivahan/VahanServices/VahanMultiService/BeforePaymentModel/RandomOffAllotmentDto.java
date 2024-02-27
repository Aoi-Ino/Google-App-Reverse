package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class RandomOffAllotmentDto implements Serializable {
    private final int allotedOffcd;
    private final String appl_no;
    private final int noofassigneduser;
    private final int owner_offcd;
    private final int pendingforVerify;
    private final String regn_no;
    private final String state_cd;
    private final boolean valid;
    private final int workpercentage;

    public RandomOffAllotmentDto(int i10, String str, int i11, int i12, int i13, String str2, String str3, boolean z10, int i14) {
        l.f(str, "appl_no");
        l.f(str2, "regn_no");
        l.f(str3, "state_cd");
        this.allotedOffcd = i10;
        this.appl_no = str;
        this.noofassigneduser = i11;
        this.owner_offcd = i12;
        this.pendingforVerify = i13;
        this.regn_no = str2;
        this.state_cd = str3;
        this.valid = z10;
        this.workpercentage = i14;
    }

    public static /* synthetic */ RandomOffAllotmentDto copy$default(RandomOffAllotmentDto randomOffAllotmentDto, int i10, String str, int i11, int i12, int i13, String str2, String str3, boolean z10, int i14, int i15, Object obj) {
        RandomOffAllotmentDto randomOffAllotmentDto2 = randomOffAllotmentDto;
        int i16 = i15;
        return randomOffAllotmentDto.copy((i16 & 1) != 0 ? randomOffAllotmentDto2.allotedOffcd : i10, (i16 & 2) != 0 ? randomOffAllotmentDto2.appl_no : str, (i16 & 4) != 0 ? randomOffAllotmentDto2.noofassigneduser : i11, (i16 & 8) != 0 ? randomOffAllotmentDto2.owner_offcd : i12, (i16 & 16) != 0 ? randomOffAllotmentDto2.pendingforVerify : i13, (i16 & 32) != 0 ? randomOffAllotmentDto2.regn_no : str2, (i16 & 64) != 0 ? randomOffAllotmentDto2.state_cd : str3, (i16 & 128) != 0 ? randomOffAllotmentDto2.valid : z10, (i16 & 256) != 0 ? randomOffAllotmentDto2.workpercentage : i14);
    }

    public final int component1() {
        return this.allotedOffcd;
    }

    public final String component2() {
        return this.appl_no;
    }

    public final int component3() {
        return this.noofassigneduser;
    }

    public final int component4() {
        return this.owner_offcd;
    }

    public final int component5() {
        return this.pendingforVerify;
    }

    public final String component6() {
        return this.regn_no;
    }

    public final String component7() {
        return this.state_cd;
    }

    public final boolean component8() {
        return this.valid;
    }

    public final int component9() {
        return this.workpercentage;
    }

    public final RandomOffAllotmentDto copy(int i10, String str, int i11, int i12, int i13, String str2, String str3, boolean z10, int i14) {
        l.f(str, "appl_no");
        String str4 = str2;
        l.f(str4, "regn_no");
        String str5 = str3;
        l.f(str5, "state_cd");
        return new RandomOffAllotmentDto(i10, str, i11, i12, i13, str4, str5, z10, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RandomOffAllotmentDto)) {
            return false;
        }
        RandomOffAllotmentDto randomOffAllotmentDto = (RandomOffAllotmentDto) obj;
        return this.allotedOffcd == randomOffAllotmentDto.allotedOffcd && l.a(this.appl_no, randomOffAllotmentDto.appl_no) && this.noofassigneduser == randomOffAllotmentDto.noofassigneduser && this.owner_offcd == randomOffAllotmentDto.owner_offcd && this.pendingforVerify == randomOffAllotmentDto.pendingforVerify && l.a(this.regn_no, randomOffAllotmentDto.regn_no) && l.a(this.state_cd, randomOffAllotmentDto.state_cd) && this.valid == randomOffAllotmentDto.valid && this.workpercentage == randomOffAllotmentDto.workpercentage;
    }

    public final int getAllotedOffcd() {
        return this.allotedOffcd;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final int getNoofassigneduser() {
        return this.noofassigneduser;
    }

    public final int getOwner_offcd() {
        return this.owner_offcd;
    }

    public final int getPendingforVerify() {
        return this.pendingforVerify;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final boolean getValid() {
        return this.valid;
    }

    public final int getWorkpercentage() {
        return this.workpercentage;
    }

    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.allotedOffcd) * 31) + this.appl_no.hashCode()) * 31) + Integer.hashCode(this.noofassigneduser)) * 31) + Integer.hashCode(this.owner_offcd)) * 31) + Integer.hashCode(this.pendingforVerify)) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31;
        boolean z10 = this.valid;
        if (z10) {
            z10 = true;
        }
        return ((hashCode + (z10 ? 1 : 0)) * 31) + Integer.hashCode(this.workpercentage);
    }

    public String toString() {
        return "RandomOffAllotmentDto(allotedOffcd=" + this.allotedOffcd + ", appl_no=" + this.appl_no + ", noofassigneduser=" + this.noofassigneduser + ", owner_offcd=" + this.owner_offcd + ", pendingforVerify=" + this.pendingforVerify + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", valid=" + this.valid + ", workpercentage=" + this.workpercentage + ')';
    }
}
