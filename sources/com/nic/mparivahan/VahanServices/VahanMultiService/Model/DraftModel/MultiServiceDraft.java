package com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel;

import androidx.annotation.Keep;
import cm.l;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import java.io.Serializable;
import java.util.ArrayList;

@Keep
public final class MultiServiceDraft implements Serializable {
    private final String applNo;
    private final ChanngeOfAdressDto channgeOfAdressDto;
    private final Durcdto durcdto;
    private final HpaDto hpaDto;
    private final HptDto hptDto;
    private final int officeCode;
    private final String openDate;
    private final ArrayList<Integer> purposeCode;
    private final String regnNo;
    private final String stateCode;
    private final TransferOwnershipDto transferOwnershipDto;

    public MultiServiceDraft(String str, ChanngeOfAdressDto channgeOfAdressDto2, Durcdto durcdto2, HpaDto hpaDto2, HptDto hptDto2, int i10, String str2, ArrayList<Integer> arrayList, String str3, String str4, TransferOwnershipDto transferOwnershipDto2) {
        l.f(arrayList, "purposeCode");
        this.applNo = str;
        this.channgeOfAdressDto = channgeOfAdressDto2;
        this.durcdto = durcdto2;
        this.hpaDto = hpaDto2;
        this.hptDto = hptDto2;
        this.officeCode = i10;
        this.openDate = str2;
        this.purposeCode = arrayList;
        this.regnNo = str3;
        this.stateCode = str4;
        this.transferOwnershipDto = transferOwnershipDto2;
    }

    public static /* synthetic */ MultiServiceDraft copy$default(MultiServiceDraft multiServiceDraft, String str, ChanngeOfAdressDto channgeOfAdressDto2, Durcdto durcdto2, HpaDto hpaDto2, HptDto hptDto2, int i10, String str2, ArrayList arrayList, String str3, String str4, TransferOwnershipDto transferOwnershipDto2, int i11, Object obj) {
        MultiServiceDraft multiServiceDraft2 = multiServiceDraft;
        int i12 = i11;
        return multiServiceDraft.copy((i12 & 1) != 0 ? multiServiceDraft2.applNo : str, (i12 & 2) != 0 ? multiServiceDraft2.channgeOfAdressDto : channgeOfAdressDto2, (i12 & 4) != 0 ? multiServiceDraft2.durcdto : durcdto2, (i12 & 8) != 0 ? multiServiceDraft2.hpaDto : hpaDto2, (i12 & 16) != 0 ? multiServiceDraft2.hptDto : hptDto2, (i12 & 32) != 0 ? multiServiceDraft2.officeCode : i10, (i12 & 64) != 0 ? multiServiceDraft2.openDate : str2, (i12 & 128) != 0 ? multiServiceDraft2.purposeCode : arrayList, (i12 & 256) != 0 ? multiServiceDraft2.regnNo : str3, (i12 & 512) != 0 ? multiServiceDraft2.stateCode : str4, (i12 & 1024) != 0 ? multiServiceDraft2.transferOwnershipDto : transferOwnershipDto2);
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

    public final String component7() {
        return this.openDate;
    }

    public final ArrayList<Integer> component8() {
        return this.purposeCode;
    }

    public final String component9() {
        return this.regnNo;
    }

    public final MultiServiceDraft copy(String str, ChanngeOfAdressDto channgeOfAdressDto2, Durcdto durcdto2, HpaDto hpaDto2, HptDto hptDto2, int i10, String str2, ArrayList<Integer> arrayList, String str3, String str4, TransferOwnershipDto transferOwnershipDto2) {
        ArrayList<Integer> arrayList2 = arrayList;
        l.f(arrayList2, "purposeCode");
        return new MultiServiceDraft(str, channgeOfAdressDto2, durcdto2, hpaDto2, hptDto2, i10, str2, arrayList2, str3, str4, transferOwnershipDto2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiServiceDraft)) {
            return false;
        }
        MultiServiceDraft multiServiceDraft = (MultiServiceDraft) obj;
        return l.a(this.applNo, multiServiceDraft.applNo) && l.a(this.channgeOfAdressDto, multiServiceDraft.channgeOfAdressDto) && l.a(this.durcdto, multiServiceDraft.durcdto) && l.a(this.hpaDto, multiServiceDraft.hpaDto) && l.a(this.hptDto, multiServiceDraft.hptDto) && this.officeCode == multiServiceDraft.officeCode && l.a(this.openDate, multiServiceDraft.openDate) && l.a(this.purposeCode, multiServiceDraft.purposeCode) && l.a(this.regnNo, multiServiceDraft.regnNo) && l.a(this.stateCode, multiServiceDraft.stateCode) && l.a(this.transferOwnershipDto, multiServiceDraft.transferOwnershipDto);
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

    public final String getOpenDate() {
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
        String str2 = this.openDate;
        int hashCode6 = (((hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.purposeCode.hashCode()) * 31;
        String str3 = this.regnNo;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.stateCode;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TransferOwnershipDto transferOwnershipDto2 = this.transferOwnershipDto;
        if (transferOwnershipDto2 != null) {
            i10 = transferOwnershipDto2.hashCode();
        }
        return hashCode8 + i10;
    }

    public String toString() {
        return "MultiServiceDraft(applNo=" + this.applNo + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", durcdto=" + this.durcdto + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ", transferOwnershipDto=" + this.transferOwnershipDto + ')';
    }
}
