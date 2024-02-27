package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel;

import androidx.annotation.Keep;
import cm.l;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import ii.a;
import java.io.Serializable;
import java.util.ArrayList;

@Keep
public final class MultiServiceDraftTO implements Serializable {
    private final AddNomineeDtoX addNomineeDto;
    private final String applNo;
    private final String authMode;
    private final a buyerDto;
    private final ChanngeOfAdressDto channgeOfAdressDto;
    private final Durcdto durcdto;
    private final HpaDto hpaDto;
    private final HptDto hptDto;
    private final String mobileNo;
    private final int officeCode;
    private final String openDate;
    private final ArrayList<Integer> purposeCode;
    private final String regnNo;
    private final String sellerOrBuyer;
    private final String stateCode;
    private final TransferOwnershipDto transferOwnershipDto;

    public MultiServiceDraftTO(String str, String str2, a aVar, String str3, ChanngeOfAdressDto channgeOfAdressDto2, Durcdto durcdto2, HpaDto hpaDto2, HptDto hptDto2, int i10, String str4, ArrayList<Integer> arrayList, String str5, String str6, String str7, TransferOwnershipDto transferOwnershipDto2, AddNomineeDtoX addNomineeDtoX) {
        l.f(str3, "mobileNo");
        l.f(arrayList, "purposeCode");
        this.applNo = str;
        this.authMode = str2;
        this.mobileNo = str3;
        this.channgeOfAdressDto = channgeOfAdressDto2;
        this.durcdto = durcdto2;
        this.hpaDto = hpaDto2;
        this.hptDto = hptDto2;
        this.officeCode = i10;
        this.openDate = str4;
        this.purposeCode = arrayList;
        this.regnNo = str5;
        this.stateCode = str6;
        this.sellerOrBuyer = str7;
        this.transferOwnershipDto = transferOwnershipDto2;
        this.addNomineeDto = addNomineeDtoX;
    }

    public static /* synthetic */ MultiServiceDraftTO copy$default(MultiServiceDraftTO multiServiceDraftTO, String str, String str2, a aVar, String str3, ChanngeOfAdressDto channgeOfAdressDto2, Durcdto durcdto2, HpaDto hpaDto2, HptDto hptDto2, int i10, String str4, ArrayList arrayList, String str5, String str6, String str7, TransferOwnershipDto transferOwnershipDto2, AddNomineeDtoX addNomineeDtoX, int i11, Object obj) {
        a aVar2;
        MultiServiceDraftTO multiServiceDraftTO2 = multiServiceDraftTO;
        int i12 = i11;
        String str8 = (i12 & 1) != 0 ? multiServiceDraftTO2.applNo : str;
        String str9 = (i12 & 2) != 0 ? multiServiceDraftTO2.authMode : str2;
        if ((i12 & 4) != 0) {
            multiServiceDraftTO.getClass();
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        return multiServiceDraftTO.copy(str8, str9, aVar2, (i12 & 8) != 0 ? multiServiceDraftTO2.mobileNo : str3, (i12 & 16) != 0 ? multiServiceDraftTO2.channgeOfAdressDto : channgeOfAdressDto2, (i12 & 32) != 0 ? multiServiceDraftTO2.durcdto : durcdto2, (i12 & 64) != 0 ? multiServiceDraftTO2.hpaDto : hpaDto2, (i12 & 128) != 0 ? multiServiceDraftTO2.hptDto : hptDto2, (i12 & 256) != 0 ? multiServiceDraftTO2.officeCode : i10, (i12 & 512) != 0 ? multiServiceDraftTO2.openDate : str4, (i12 & 1024) != 0 ? multiServiceDraftTO2.purposeCode : arrayList, (i12 & 2048) != 0 ? multiServiceDraftTO2.regnNo : str5, (i12 & 4096) != 0 ? multiServiceDraftTO2.stateCode : str6, (i12 & 8192) != 0 ? multiServiceDraftTO2.sellerOrBuyer : str7, (i12 & 16384) != 0 ? multiServiceDraftTO2.transferOwnershipDto : transferOwnershipDto2, (i12 & 32768) != 0 ? multiServiceDraftTO2.addNomineeDto : addNomineeDtoX);
    }

    public final String component1() {
        return this.applNo;
    }

    public final String component10() {
        return this.openDate;
    }

    public final ArrayList<Integer> component11() {
        return this.purposeCode;
    }

    public final String component12() {
        return this.regnNo;
    }

    public final String component13() {
        return this.stateCode;
    }

    public final String component14() {
        return this.sellerOrBuyer;
    }

    public final TransferOwnershipDto component15() {
        return this.transferOwnershipDto;
    }

    public final AddNomineeDtoX component16() {
        return this.addNomineeDto;
    }

    public final String component2() {
        return this.authMode;
    }

    public final a component3() {
        return null;
    }

    public final String component4() {
        return this.mobileNo;
    }

    public final ChanngeOfAdressDto component5() {
        return this.channgeOfAdressDto;
    }

    public final Durcdto component6() {
        return this.durcdto;
    }

    public final HpaDto component7() {
        return this.hpaDto;
    }

    public final HptDto component8() {
        return this.hptDto;
    }

    public final int component9() {
        return this.officeCode;
    }

    public final MultiServiceDraftTO copy(String str, String str2, a aVar, String str3, ChanngeOfAdressDto channgeOfAdressDto2, Durcdto durcdto2, HpaDto hpaDto2, HptDto hptDto2, int i10, String str4, ArrayList<Integer> arrayList, String str5, String str6, String str7, TransferOwnershipDto transferOwnershipDto2, AddNomineeDtoX addNomineeDtoX) {
        String str8 = str;
        l.f(str3, "mobileNo");
        l.f(arrayList, "purposeCode");
        return new MultiServiceDraftTO(str, str2, aVar, str3, channgeOfAdressDto2, durcdto2, hpaDto2, hptDto2, i10, str4, arrayList, str5, str6, str7, transferOwnershipDto2, addNomineeDtoX);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiServiceDraftTO)) {
            return false;
        }
        MultiServiceDraftTO multiServiceDraftTO = (MultiServiceDraftTO) obj;
        return l.a(this.applNo, multiServiceDraftTO.applNo) && l.a(this.authMode, multiServiceDraftTO.authMode) && l.a((Object) null, (Object) null) && l.a(this.mobileNo, multiServiceDraftTO.mobileNo) && l.a(this.channgeOfAdressDto, multiServiceDraftTO.channgeOfAdressDto) && l.a(this.durcdto, multiServiceDraftTO.durcdto) && l.a(this.hpaDto, multiServiceDraftTO.hpaDto) && l.a(this.hptDto, multiServiceDraftTO.hptDto) && this.officeCode == multiServiceDraftTO.officeCode && l.a(this.openDate, multiServiceDraftTO.openDate) && l.a(this.purposeCode, multiServiceDraftTO.purposeCode) && l.a(this.regnNo, multiServiceDraftTO.regnNo) && l.a(this.stateCode, multiServiceDraftTO.stateCode) && l.a(this.sellerOrBuyer, multiServiceDraftTO.sellerOrBuyer) && l.a(this.transferOwnershipDto, multiServiceDraftTO.transferOwnershipDto) && l.a(this.addNomineeDto, multiServiceDraftTO.addNomineeDto);
    }

    public final AddNomineeDtoX getAddNomineeDto() {
        return this.addNomineeDto;
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAuthMode() {
        return this.authMode;
    }

    public final a getBuyerDto() {
        return null;
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

    public final String getMobileNo() {
        return this.mobileNo;
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

    public final String getSellerOrBuyer() {
        return this.sellerOrBuyer;
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
        String str2 = this.authMode;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 961) + this.mobileNo.hashCode()) * 31;
        ChanngeOfAdressDto channgeOfAdressDto2 = this.channgeOfAdressDto;
        int hashCode3 = (hashCode2 + (channgeOfAdressDto2 == null ? 0 : channgeOfAdressDto2.hashCode())) * 31;
        Durcdto durcdto2 = this.durcdto;
        int hashCode4 = (hashCode3 + (durcdto2 == null ? 0 : durcdto2.hashCode())) * 31;
        HpaDto hpaDto2 = this.hpaDto;
        int hashCode5 = (hashCode4 + (hpaDto2 == null ? 0 : hpaDto2.hashCode())) * 31;
        HptDto hptDto2 = this.hptDto;
        int hashCode6 = (((hashCode5 + (hptDto2 == null ? 0 : hptDto2.hashCode())) * 31) + Integer.hashCode(this.officeCode)) * 31;
        String str3 = this.openDate;
        int hashCode7 = (((hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.purposeCode.hashCode()) * 31;
        String str4 = this.regnNo;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.stateCode;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sellerOrBuyer;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        TransferOwnershipDto transferOwnershipDto2 = this.transferOwnershipDto;
        int hashCode11 = (hashCode10 + (transferOwnershipDto2 == null ? 0 : transferOwnershipDto2.hashCode())) * 31;
        AddNomineeDtoX addNomineeDtoX = this.addNomineeDto;
        if (addNomineeDtoX != null) {
            i10 = addNomineeDtoX.hashCode();
        }
        return hashCode11 + i10;
    }

    public String toString() {
        return "MultiServiceDraftTO(applNo=" + this.applNo + ", authMode=" + this.authMode + ", buyerDto=" + null + ", mobileNo=" + this.mobileNo + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", durcdto=" + this.durcdto + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ", sellerOrBuyer=" + this.sellerOrBuyer + ", transferOwnershipDto=" + this.transferOwnershipDto + ", addNomineeDto=" + this.addNomineeDto + ')';
    }
}
