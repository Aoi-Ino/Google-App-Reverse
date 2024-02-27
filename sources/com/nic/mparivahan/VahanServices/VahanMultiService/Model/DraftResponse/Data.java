package com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse;

import androidx.annotation.Keep;
import cm.l;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.TransferOwnershipDto;
import java.util.ArrayList;

@Keep
public final class Data {
    private final String applNo;
    private final ChanngeOfAdressDto channgeOfAdressDto;
    private final Durcdto durcdto;
    private final HpaDto hpaDto;
    private final HptDto hptDto;
    private final int officeCode;
    private final Object openDate;
    private final ArrayList<Integer> purposeCode;
    private final String regnNo;
    private final String stateCode;
    private final TransferOwnershipDto transferOwnershipDto;

    public Data(String str, ChanngeOfAdressDto channgeOfAdressDto2, Durcdto durcdto2, HpaDto hpaDto2, HptDto hptDto2, int i10, Object obj, ArrayList<Integer> arrayList, String str2, String str3, TransferOwnershipDto transferOwnershipDto2) {
        l.f(arrayList, "purposeCode");
        this.applNo = str;
        this.channgeOfAdressDto = channgeOfAdressDto2;
        this.durcdto = durcdto2;
        this.hpaDto = hpaDto2;
        this.hptDto = hptDto2;
        this.officeCode = i10;
        this.openDate = obj;
        this.purposeCode = arrayList;
        this.regnNo = str2;
        this.stateCode = str3;
        this.transferOwnershipDto = transferOwnershipDto2;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, ChanngeOfAdressDto channgeOfAdressDto2, Durcdto durcdto2, HpaDto hpaDto2, HptDto hptDto2, int i10, Object obj, ArrayList arrayList, String str2, String str3, TransferOwnershipDto transferOwnershipDto2, int i11, Object obj2) {
        Data data2 = data;
        int i12 = i11;
        return data.copy((i12 & 1) != 0 ? data2.applNo : str, (i12 & 2) != 0 ? data2.channgeOfAdressDto : channgeOfAdressDto2, (i12 & 4) != 0 ? data2.durcdto : durcdto2, (i12 & 8) != 0 ? data2.hpaDto : hpaDto2, (i12 & 16) != 0 ? data2.hptDto : hptDto2, (i12 & 32) != 0 ? data2.officeCode : i10, (i12 & 64) != 0 ? data2.openDate : obj, (i12 & 128) != 0 ? data2.purposeCode : arrayList, (i12 & 256) != 0 ? data2.regnNo : str2, (i12 & 512) != 0 ? data2.stateCode : str3, (i12 & 1024) != 0 ? data2.transferOwnershipDto : transferOwnershipDto2);
    }

    public final String component1() {
        return this.applNo;
    }

    public final String component10() {
        return this.stateCode;
    }

    public final TransferOwnershipDto component11() {
        return this.transferOwnershipDto;
    }

    public final ChanngeOfAdressDto component2() {
        return this.channgeOfAdressDto;
    }

    public final Durcdto component3() {
        return this.durcdto;
    }

    public final HpaDto component4() {
        return this.hpaDto;
    }

    public final HptDto component5() {
        return this.hptDto;
    }

    public final int component6() {
        return this.officeCode;
    }

    public final Object component7() {
        return this.openDate;
    }

    public final ArrayList<Integer> component8() {
        return this.purposeCode;
    }

    public final String component9() {
        return this.regnNo;
    }

    public final Data copy(String str, ChanngeOfAdressDto channgeOfAdressDto2, Durcdto durcdto2, HpaDto hpaDto2, HptDto hptDto2, int i10, Object obj, ArrayList<Integer> arrayList, String str2, String str3, TransferOwnershipDto transferOwnershipDto2) {
        ArrayList<Integer> arrayList2 = arrayList;
        l.f(arrayList2, "purposeCode");
        return new Data(str, channgeOfAdressDto2, durcdto2, hpaDto2, hptDto2, i10, obj, arrayList2, str2, str3, transferOwnershipDto2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return l.a(this.applNo, data.applNo) && l.a(this.channgeOfAdressDto, data.channgeOfAdressDto) && l.a(this.durcdto, data.durcdto) && l.a(this.hpaDto, data.hpaDto) && l.a(this.hptDto, data.hptDto) && this.officeCode == data.officeCode && l.a(this.openDate, data.openDate) && l.a(this.purposeCode, data.purposeCode) && l.a(this.regnNo, data.regnNo) && l.a(this.stateCode, data.stateCode) && l.a(this.transferOwnershipDto, data.transferOwnershipDto);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final ChanngeOfAdressDto getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final Durcdto getDurcdto() {
        return this.durcdto;
    }

    public final HpaDto getHpaDto() {
        return this.hpaDto;
    }

    public final HptDto getHptDto() {
        return this.hptDto;
    }

    public final int getOfficeCode() {
        return this.officeCode;
    }

    public final Object getOpenDate() {
        return this.openDate;
    }

    public final ArrayList<Integer> getPurposeCode() {
        return this.purposeCode;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final TransferOwnershipDto getTransferOwnershipDto() {
        return this.transferOwnershipDto;
    }

    public int hashCode() {
        String str = this.applNo;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ChanngeOfAdressDto channgeOfAdressDto2 = this.channgeOfAdressDto;
        int hashCode2 = (hashCode + (channgeOfAdressDto2 == null ? 0 : channgeOfAdressDto2.hashCode())) * 31;
        Durcdto durcdto2 = this.durcdto;
        int hashCode3 = (hashCode2 + (durcdto2 == null ? 0 : durcdto2.hashCode())) * 31;
        HpaDto hpaDto2 = this.hpaDto;
        int hashCode4 = (hashCode3 + (hpaDto2 == null ? 0 : hpaDto2.hashCode())) * 31;
        HptDto hptDto2 = this.hptDto;
        int hashCode5 = (((hashCode4 + (hptDto2 == null ? 0 : hptDto2.hashCode())) * 31) + Integer.hashCode(this.officeCode)) * 31;
        Object obj = this.openDate;
        int hashCode6 = (((hashCode5 + (obj == null ? 0 : obj.hashCode())) * 31) + this.purposeCode.hashCode()) * 31;
        String str2 = this.regnNo;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stateCode;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TransferOwnershipDto transferOwnershipDto2 = this.transferOwnershipDto;
        if (transferOwnershipDto2 != null) {
            i10 = transferOwnershipDto2.hashCode();
        }
        return hashCode8 + i10;
    }

    public String toString() {
        return "Data(applNo=" + this.applNo + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", durcdto=" + this.durcdto + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ", transferOwnershipDto=" + this.transferOwnershipDto + ')';
    }
}
