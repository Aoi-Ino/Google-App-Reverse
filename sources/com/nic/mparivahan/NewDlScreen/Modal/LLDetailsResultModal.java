package com.nic.mparivahan.NewDlScreen.Modal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cm.g;
import cm.l;
import com.nic.mparivahan.LLServices.GetLlPojo.BloodGroup;
import com.nic.mparivahan.LLServices.GetLlPojo.CountryOfBirth;
import com.nic.mparivahan.LLServices.GetLlPojo.DrivingSchoolDet;
import com.nic.mparivahan.LLServices.GetLlPojo.EduQual;
import com.nic.mparivahan.LLServices.GetLlPojo.Gender;
import com.nic.mparivahan.LLServices.GetLlPojo.LlFromRTO1;
import com.nic.mparivahan.LLServices.GetLlPojo.LlFromState1;
import com.nic.mparivahan.LLServices.GetLlPojo.LlstoDisplayMap;
import com.nic.mparivahan.LLServices.GetLlPojo.PermCity;
import com.nic.mparivahan.LLServices.GetLlPojo.PermDistrict;
import com.nic.mparivahan.LLServices.GetLlPojo.PermState;
import com.nic.mparivahan.LLServices.GetLlPojo.PermSubDistrict;
import com.nic.mparivahan.LLServices.GetLlPojo.PresCity;
import com.nic.mparivahan.LLServices.GetLlPojo.PresDistrict;
import com.nic.mparivahan.LLServices.GetLlPojo.PresState;
import com.nic.mparivahan.LLServices.GetLlPojo.PresSubDistrict;
import com.nic.mparivahan.LLServices.GetLlPojo.RelationType;
import j7.c;
import java.util.ArrayList;
import java.util.Iterator;

@Keep
public final class LLDetailsResultModal implements Parcelable {
    public static final Parcelable.Creator<LLDetailsResultModal> CREATOR = new a();
    @c("DisableStForMp")
    private Boolean DisableStForMp;
    @c("PresVillageOrTown")
    private String PresVillageOrTown;
    @c("aadhaarNumber")
    private String aadhaarNumber;
    @c("age")
    private String age;
    @c("UC01-E255")
    private String alreadyApplied;
    @c("UC01-E253")
    private String alreadyHavingDL;
    @c("alternatemobileNumber")
    private String alternatemobileNumber;
    @c("bloodGroup")
    private ArrayList<BloodGroup> bloodGroup;
    @c("checkCovs")
    private ArrayList<CheckCovs> checkCovs;
    @c("countryOfBirth")
    private ArrayList<CountryOfBirth> countryOfBirth;
    @c("UC95-E10")
    private String dateNotMatchError;
    @c("dateOfBirth")
    private String dateOfBirth;
    @c("UC01-E256")
    private String dlAppliedAfterFewDays;
    @c("UC01-E257")
    private String dobError;
    @c("drivingSchoolDet")
    private ArrayList<DrivingSchoolDet> drivingSchoolDet;
    @c("editAddressLL")
    private Boolean editAddressLL;
    @c("eduQual")
    private ArrayList<EduQual> eduQual;
    @c("email")
    private String email;
    @c("UC01-E254")
    private String error;
    @c("fname")
    private String fname;
    @c("gender")
    private ArrayList<Gender> gender;
    @c("idMarks1")
    private String idMarks1;
    @c("idMarks2")
    private String idMarks2;
    @c("UC01-E258")
    private String invalidLLNo;
    @c("llFromRTO1")
    private ArrayList<LlFromRTO1> llFromRTO1;
    @c("llFromState1")
    private ArrayList<LlFromState1> llFromState1;
    @c("llstoDisplayMap")
    private ArrayList<LlstoDisplayMap> llstoDisplayMap;
    @c("lname")
    private String lname;
    @c("mname")
    private String mname;
    @c("mobileNumber")
    private String mobileNumber;
    @c("newFullName")
    private String newFullName;
    @c("onlyEditAddressLL")
    private Boolean onlyEditAddressLL;
    @c("permCity")
    private ArrayList<PermCity> permCity;
    @c("permDistrict")
    private ArrayList<PermDistrict> permDistrict;
    @c("permHouseNo")
    private String permHouseNo;
    @c("permLocation")
    private String permLocation;
    @c("permPinCode")
    private String permPinCode;
    @c("permState")
    private ArrayList<PermState> permState;
    @c("permStreet")
    private String permStreet;
    @c("permSubDistrict")
    private ArrayList<PermSubDistrict> permSubDistrict;
    @c("permVillageOrTown")
    private String permVillageOrTown;
    @c("placeOfBirth")
    private String placeOfBirth;
    @c("presCity")
    private ArrayList<PresCity> presCity;
    @c("presDistrict")
    private ArrayList<PresDistrict> presDistrict;
    @c("presHouseNo")
    private String presHouseNo;
    @c("presLocation")
    private String presLocation;
    @c("presPhoneNumber")
    private String presPhoneNumber;
    @c("presPinCode")
    private String presPinCode;
    @c("presSameAsPerm")
    private String presSameAsPerm;
    @c("presState")
    private ArrayList<PresState> presState;
    @c("presStayMonths")
    private String presStayMonths;
    @c("presStayYears")
    private String presStayYears;
    @c("presStreet")
    private String presStreet;
    @c("presSubDistrict")
    private ArrayList<PresSubDistrict> presSubDistrict;
    @c("refStateEqiCovsMessage")
    private String refStateEqiCovsMessage;
    @c("relationType")
    private ArrayList<RelationType> relationType;
    @c("selectAll")
    private String selectAll;
    @c("selectedCovs")
    private String selectedCovs;
    @c("swdfName")
    private String swdfName;
    @c("swdlName")
    private String swdlName;
    @c("swdmName")
    private String swdmName;

    public static final class a implements Parcelable.Creator {
        /* renamed from: a */
        public final LLDetailsResultModal createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Parcel parcel2 = parcel;
            l.f(parcel2, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(parcel.readSerializable());
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                arrayList2.add(parcel.readSerializable());
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            for (int i12 = 0; i12 != readInt3; i12++) {
                arrayList3.add(parcel.readSerializable());
            }
            String readString7 = parcel.readString();
            int readInt4 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt4);
            for (int i13 = 0; i13 != readInt4; i13++) {
                arrayList4.add(parcel.readSerializable());
            }
            int readInt5 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(readInt5);
            for (int i14 = 0; i14 != readInt5; i14++) {
                arrayList5.add(parcel.readSerializable());
            }
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            int readInt6 = parcel.readInt();
            Boolean bool4 = bool;
            ArrayList arrayList6 = new ArrayList(readInt6);
            int i15 = 0;
            while (i15 != readInt6) {
                arrayList6.add(parcel.readSerializable());
                i15++;
                readInt6 = readInt6;
            }
            int readInt7 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(readInt7);
            ArrayList arrayList8 = arrayList6;
            int i16 = 0;
            while (i16 != readInt7) {
                arrayList7.add(parcel.readSerializable());
                i16++;
                readInt7 = readInt7;
            }
            if (parcel.readInt() == 0) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            int readInt8 = parcel.readInt();
            Boolean bool5 = bool2;
            ArrayList arrayList9 = new ArrayList(readInt8);
            ArrayList arrayList10 = arrayList7;
            int i17 = 0;
            while (i17 != readInt8) {
                arrayList9.add(parcel.readSerializable());
                i17++;
                readInt8 = readInt8;
            }
            if (parcel.readInt() == 0) {
                bool3 = null;
            } else {
                bool3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            String readString19 = parcel.readString();
            int readInt9 = parcel.readInt();
            ArrayList arrayList11 = new ArrayList(readInt9);
            ArrayList arrayList12 = arrayList9;
            int i18 = 0;
            while (i18 != readInt9) {
                arrayList11.add(parcel.readSerializable());
                i18++;
                readInt9 = readInt9;
            }
            String readString20 = parcel.readString();
            String readString21 = parcel.readString();
            int readInt10 = parcel.readInt();
            String str = readString20;
            ArrayList arrayList13 = new ArrayList(readInt10);
            ArrayList arrayList14 = arrayList11;
            int i19 = 0;
            while (i19 != readInt10) {
                arrayList13.add(parcel.readSerializable());
                i19++;
                readInt10 = readInt10;
            }
            int readInt11 = parcel.readInt();
            ArrayList arrayList15 = new ArrayList(readInt11);
            ArrayList arrayList16 = arrayList13;
            int i20 = 0;
            while (i20 != readInt11) {
                arrayList15.add(parcel.readSerializable());
                i20++;
                readInt11 = readInt11;
            }
            String readString22 = parcel.readString();
            String readString23 = parcel.readString();
            int readInt12 = parcel.readInt();
            String str2 = readString22;
            ArrayList arrayList17 = new ArrayList(readInt12);
            ArrayList arrayList18 = arrayList15;
            int i21 = 0;
            while (i21 != readInt12) {
                arrayList17.add(parcel.readSerializable());
                i21++;
                readInt12 = readInt12;
            }
            int readInt13 = parcel.readInt();
            ArrayList arrayList19 = new ArrayList(readInt13);
            ArrayList arrayList20 = arrayList17;
            int i22 = 0;
            while (i22 != readInt13) {
                arrayList19.add(parcel.readSerializable());
                i22++;
                readInt13 = readInt13;
            }
            String readString24 = parcel.readString();
            String readString25 = parcel.readString();
            String readString26 = parcel.readString();
            String readString27 = parcel.readString();
            int readInt14 = parcel.readInt();
            String str3 = readString24;
            ArrayList arrayList21 = new ArrayList(readInt14);
            ArrayList arrayList22 = arrayList19;
            int i23 = 0;
            while (i23 != readInt14) {
                arrayList21.add(parcel.readSerializable());
                i23++;
                readInt14 = readInt14;
            }
            String readString28 = parcel.readString();
            String readString29 = parcel.readString();
            int readInt15 = parcel.readInt();
            ArrayList arrayList23 = new ArrayList(readInt15);
            ArrayList arrayList24 = arrayList21;
            int i24 = 0;
            while (i24 != readInt15) {
                arrayList23.add(CheckCovs.CREATOR.createFromParcel(parcel2));
                i24++;
                readInt15 = readInt15;
            }
            String readString30 = parcel.readString();
            String readString31 = parcel.readString();
            int readInt16 = parcel.readInt();
            ArrayList arrayList25 = new ArrayList(readInt16);
            ArrayList arrayList26 = arrayList23;
            int i25 = 0;
            while (i25 != readInt16) {
                arrayList25.add(parcel.readSerializable());
                i25++;
                readInt16 = readInt16;
            }
            int readInt17 = parcel.readInt();
            ArrayList arrayList27 = new ArrayList(readInt17);
            ArrayList arrayList28 = arrayList25;
            int i26 = 0;
            while (i26 != readInt17) {
                arrayList27.add(parcel.readSerializable());
                i26++;
                readInt17 = readInt17;
            }
            int readInt18 = parcel.readInt();
            ArrayList arrayList29 = new ArrayList(readInt18);
            ArrayList arrayList30 = arrayList27;
            int i27 = 0;
            while (i27 != readInt18) {
                arrayList29.add(parcel.readSerializable());
                i27++;
                readInt18 = readInt18;
            }
            return new LLDetailsResultModal(arrayList, readString, readString2, arrayList2, readString3, readString4, readString5, readString6, arrayList3, readString7, arrayList4, arrayList5, bool4, readString8, readString9, readString10, readString11, readString12, arrayList8, arrayList10, bool5, readString13, readString14, readString15, arrayList12, bool3, readString16, readString17, readString18, readString19, arrayList14, str, readString21, arrayList16, arrayList18, str2, readString23, arrayList20, arrayList22, str3, readString25, readString26, readString27, arrayList24, readString28, readString29, arrayList26, readString30, readString31, arrayList28, arrayList30, arrayList29, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final LLDetailsResultModal[] newArray(int i10) {
            return new LLDetailsResultModal[i10];
        }
    }

    public LLDetailsResultModal() {
        this((ArrayList) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (ArrayList) null, (ArrayList) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (ArrayList) null, (Boolean) null, (String) null, (String) null, (String) null, (ArrayList) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 536870911, (g) null);
    }

    public static /* synthetic */ LLDetailsResultModal copy$default(LLDetailsResultModal lLDetailsResultModal, ArrayList arrayList, String str, String str2, ArrayList arrayList2, String str3, String str4, String str5, String str6, ArrayList arrayList3, String str7, ArrayList arrayList4, ArrayList arrayList5, Boolean bool, String str8, String str9, String str10, String str11, String str12, ArrayList arrayList6, ArrayList arrayList7, Boolean bool2, String str13, String str14, String str15, ArrayList arrayList8, Boolean bool3, String str16, String str17, String str18, String str19, ArrayList arrayList9, String str20, String str21, ArrayList arrayList10, ArrayList arrayList11, String str22, String str23, ArrayList arrayList12, ArrayList arrayList13, String str24, String str25, String str26, String str27, ArrayList arrayList14, String str28, String str29, ArrayList arrayList15, String str30, String str31, ArrayList arrayList16, ArrayList arrayList17, ArrayList arrayList18, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, int i10, int i11, Object obj) {
        LLDetailsResultModal lLDetailsResultModal2 = lLDetailsResultModal;
        int i12 = i10;
        int i13 = i11;
        return lLDetailsResultModal.copy((i12 & 1) != 0 ? lLDetailsResultModal2.relationType : arrayList, (i12 & 2) != 0 ? lLDetailsResultModal2.selectedCovs : str, (i12 & 4) != 0 ? lLDetailsResultModal2.swdfName : str2, (i12 & 8) != 0 ? lLDetailsResultModal2.presDistrict : arrayList2, (i12 & 16) != 0 ? lLDetailsResultModal2.mobileNumber : str3, (i12 & 32) != 0 ? lLDetailsResultModal2.presStayYears : str4, (i12 & 64) != 0 ? lLDetailsResultModal2.presPhoneNumber : str5, (i12 & 128) != 0 ? lLDetailsResultModal2.presHouseNo : str6, (i12 & 256) != 0 ? lLDetailsResultModal2.bloodGroup : arrayList3, (i12 & 512) != 0 ? lLDetailsResultModal2.presSameAsPerm : str7, (i12 & 1024) != 0 ? lLDetailsResultModal2.permState : arrayList4, (i12 & 2048) != 0 ? lLDetailsResultModal2.countryOfBirth : arrayList5, (i12 & 4096) != 0 ? lLDetailsResultModal2.DisableStForMp : bool, (i12 & 8192) != 0 ? lLDetailsResultModal2.idMarks1 : str8, (i12 & 16384) != 0 ? lLDetailsResultModal2.idMarks2 : str9, (i12 & 32768) != 0 ? lLDetailsResultModal2.fname : str10, (i12 & 65536) != 0 ? lLDetailsResultModal2.presStayMonths : str11, (i12 & 131072) != 0 ? lLDetailsResultModal2.permVillageOrTown : str12, (i12 & 262144) != 0 ? lLDetailsResultModal2.presSubDistrict : arrayList6, (i12 & 524288) != 0 ? lLDetailsResultModal2.permSubDistrict : arrayList7, (i12 & 1048576) != 0 ? lLDetailsResultModal2.onlyEditAddressLL : bool2, (i12 & 2097152) != 0 ? lLDetailsResultModal2.permLocation : str13, (i12 & 4194304) != 0 ? lLDetailsResultModal2.aadhaarNumber : str14, (i12 & 8388608) != 0 ? lLDetailsResultModal2.selectAll : str15, (i12 & 16777216) != 0 ? lLDetailsResultModal2.eduQual : arrayList8, (i12 & 33554432) != 0 ? lLDetailsResultModal2.editAddressLL : bool3, (i12 & 67108864) != 0 ? lLDetailsResultModal2.alternatemobileNumber : str16, (i12 & 134217728) != 0 ? lLDetailsResultModal2.permStreet : str17, (i12 & 268435456) != 0 ? lLDetailsResultModal2.permPinCode : str18, (i12 & 536870912) != 0 ? lLDetailsResultModal2.refStateEqiCovsMessage : str19, (i12 & 1073741824) != 0 ? lLDetailsResultModal2.permDistrict : arrayList9, (i12 & Integer.MIN_VALUE) != 0 ? lLDetailsResultModal2.newFullName : str20, (i13 & 1) != 0 ? lLDetailsResultModal2.permHouseNo : str21, (i13 & 2) != 0 ? lLDetailsResultModal2.gender : arrayList10, (i13 & 4) != 0 ? lLDetailsResultModal2.drivingSchoolDet : arrayList11, (i13 & 8) != 0 ? lLDetailsResultModal2.mname : str22, (i13 & 16) != 0 ? lLDetailsResultModal2.presStreet : str23, (i13 & 32) != 0 ? lLDetailsResultModal2.llFromRTO1 : arrayList12, (i13 & 64) != 0 ? lLDetailsResultModal2.presState : arrayList13, (i13 & 128) != 0 ? lLDetailsResultModal2.lname : str24, (i13 & 256) != 0 ? lLDetailsResultModal2.email : str25, (i13 & 512) != 0 ? lLDetailsResultModal2.PresVillageOrTown : str26, (i13 & 1024) != 0 ? lLDetailsResultModal2.placeOfBirth : str27, (i13 & 2048) != 0 ? lLDetailsResultModal2.presCity : arrayList14, (i13 & 4096) != 0 ? lLDetailsResultModal2.presPinCode : str28, (i13 & 8192) != 0 ? lLDetailsResultModal2.dateOfBirth : str29, (i13 & 16384) != 0 ? lLDetailsResultModal2.checkCovs : arrayList15, (i13 & 32768) != 0 ? lLDetailsResultModal2.swdmName : str30, (i13 & 65536) != 0 ? lLDetailsResultModal2.presLocation : str31, (i13 & 131072) != 0 ? lLDetailsResultModal2.permCity : arrayList16, (i13 & 262144) != 0 ? lLDetailsResultModal2.llstoDisplayMap : arrayList17, (i13 & 524288) != 0 ? lLDetailsResultModal2.llFromState1 : arrayList18, (i13 & 1048576) != 0 ? lLDetailsResultModal2.age : str32, (i13 & 2097152) != 0 ? lLDetailsResultModal2.swdlName : str33, (i13 & 4194304) != 0 ? lLDetailsResultModal2.error : str34, (i13 & 8388608) != 0 ? lLDetailsResultModal2.dobError : str35, (i13 & 16777216) != 0 ? lLDetailsResultModal2.dateNotMatchError : str36, (i13 & 33554432) != 0 ? lLDetailsResultModal2.invalidLLNo : str37, (i13 & 67108864) != 0 ? lLDetailsResultModal2.alreadyApplied : str38, (i13 & 134217728) != 0 ? lLDetailsResultModal2.alreadyHavingDL : str39, (i13 & 268435456) != 0 ? lLDetailsResultModal2.dlAppliedAfterFewDays : str40);
    }

    public final ArrayList<RelationType> component1() {
        return this.relationType;
    }

    public final String component10() {
        return this.presSameAsPerm;
    }

    public final ArrayList<PermState> component11() {
        return this.permState;
    }

    public final ArrayList<CountryOfBirth> component12() {
        return this.countryOfBirth;
    }

    public final Boolean component13() {
        return this.DisableStForMp;
    }

    public final String component14() {
        return this.idMarks1;
    }

    public final String component15() {
        return this.idMarks2;
    }

    public final String component16() {
        return this.fname;
    }

    public final String component17() {
        return this.presStayMonths;
    }

    public final String component18() {
        return this.permVillageOrTown;
    }

    public final ArrayList<PresSubDistrict> component19() {
        return this.presSubDistrict;
    }

    public final String component2() {
        return this.selectedCovs;
    }

    public final ArrayList<PermSubDistrict> component20() {
        return this.permSubDistrict;
    }

    public final Boolean component21() {
        return this.onlyEditAddressLL;
    }

    public final String component22() {
        return this.permLocation;
    }

    public final String component23() {
        return this.aadhaarNumber;
    }

    public final String component24() {
        return this.selectAll;
    }

    public final ArrayList<EduQual> component25() {
        return this.eduQual;
    }

    public final Boolean component26() {
        return this.editAddressLL;
    }

    public final String component27() {
        return this.alternatemobileNumber;
    }

    public final String component28() {
        return this.permStreet;
    }

    public final String component29() {
        return this.permPinCode;
    }

    public final String component3() {
        return this.swdfName;
    }

    public final String component30() {
        return this.refStateEqiCovsMessage;
    }

    public final ArrayList<PermDistrict> component31() {
        return this.permDistrict;
    }

    public final String component32() {
        return this.newFullName;
    }

    public final String component33() {
        return this.permHouseNo;
    }

    public final ArrayList<Gender> component34() {
        return this.gender;
    }

    public final ArrayList<DrivingSchoolDet> component35() {
        return this.drivingSchoolDet;
    }

    public final String component36() {
        return this.mname;
    }

    public final String component37() {
        return this.presStreet;
    }

    public final ArrayList<LlFromRTO1> component38() {
        return this.llFromRTO1;
    }

    public final ArrayList<PresState> component39() {
        return this.presState;
    }

    public final ArrayList<PresDistrict> component4() {
        return this.presDistrict;
    }

    public final String component40() {
        return this.lname;
    }

    public final String component41() {
        return this.email;
    }

    public final String component42() {
        return this.PresVillageOrTown;
    }

    public final String component43() {
        return this.placeOfBirth;
    }

    public final ArrayList<PresCity> component44() {
        return this.presCity;
    }

    public final String component45() {
        return this.presPinCode;
    }

    public final String component46() {
        return this.dateOfBirth;
    }

    public final ArrayList<CheckCovs> component47() {
        return this.checkCovs;
    }

    public final String component48() {
        return this.swdmName;
    }

    public final String component49() {
        return this.presLocation;
    }

    public final String component5() {
        return this.mobileNumber;
    }

    public final ArrayList<PermCity> component50() {
        return this.permCity;
    }

    public final ArrayList<LlstoDisplayMap> component51() {
        return this.llstoDisplayMap;
    }

    public final ArrayList<LlFromState1> component52() {
        return this.llFromState1;
    }

    public final String component53() {
        return this.age;
    }

    public final String component54() {
        return this.swdlName;
    }

    public final String component55() {
        return this.error;
    }

    public final String component56() {
        return this.dobError;
    }

    public final String component57() {
        return this.dateNotMatchError;
    }

    public final String component58() {
        return this.invalidLLNo;
    }

    public final String component59() {
        return this.alreadyApplied;
    }

    public final String component6() {
        return this.presStayYears;
    }

    public final String component60() {
        return this.alreadyHavingDL;
    }

    public final String component61() {
        return this.dlAppliedAfterFewDays;
    }

    public final String component7() {
        return this.presPhoneNumber;
    }

    public final String component8() {
        return this.presHouseNo;
    }

    public final ArrayList<BloodGroup> component9() {
        return this.bloodGroup;
    }

    public final LLDetailsResultModal copy(ArrayList<RelationType> arrayList, String str, String str2, ArrayList<PresDistrict> arrayList2, String str3, String str4, String str5, String str6, ArrayList<BloodGroup> arrayList3, String str7, ArrayList<PermState> arrayList4, ArrayList<CountryOfBirth> arrayList5, Boolean bool, String str8, String str9, String str10, String str11, String str12, ArrayList<PresSubDistrict> arrayList6, ArrayList<PermSubDistrict> arrayList7, Boolean bool2, String str13, String str14, String str15, ArrayList<EduQual> arrayList8, Boolean bool3, String str16, String str17, String str18, String str19, ArrayList<PermDistrict> arrayList9, String str20, String str21, ArrayList<Gender> arrayList10, ArrayList<DrivingSchoolDet> arrayList11, String str22, String str23, ArrayList<LlFromRTO1> arrayList12, ArrayList<PresState> arrayList13, String str24, String str25, String str26, String str27, ArrayList<PresCity> arrayList14, String str28, String str29, ArrayList<CheckCovs> arrayList15, String str30, String str31, ArrayList<PermCity> arrayList16, ArrayList<LlstoDisplayMap> arrayList17, ArrayList<LlFromState1> arrayList18, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40) {
        ArrayList<RelationType> arrayList19 = arrayList;
        l.f(arrayList19, "relationType");
        l.f(str, "selectedCovs");
        l.f(str2, "swdfName");
        l.f(arrayList2, "presDistrict");
        l.f(str3, "mobileNumber");
        l.f(str4, "presStayYears");
        l.f(str5, "presPhoneNumber");
        l.f(str6, "presHouseNo");
        l.f(arrayList3, "bloodGroup");
        l.f(str7, "presSameAsPerm");
        l.f(arrayList4, "permState");
        l.f(arrayList5, "countryOfBirth");
        l.f(str8, "idMarks1");
        l.f(str9, "idMarks2");
        l.f(str10, "fname");
        l.f(str11, "presStayMonths");
        l.f(str12, "permVillageOrTown");
        l.f(arrayList6, "presSubDistrict");
        l.f(arrayList7, "permSubDistrict");
        l.f(str13, "permLocation");
        l.f(str14, "aadhaarNumber");
        l.f(arrayList8, "eduQual");
        l.f(str16, "alternatemobileNumber");
        l.f(str17, "permStreet");
        l.f(str18, "permPinCode");
        l.f(str19, "refStateEqiCovsMessage");
        l.f(arrayList9, "permDistrict");
        l.f(str20, "newFullName");
        l.f(str21, "permHouseNo");
        l.f(arrayList10, "gender");
        l.f(arrayList11, "drivingSchoolDet");
        l.f(str22, "mname");
        l.f(str23, "presStreet");
        l.f(arrayList12, "llFromRTO1");
        l.f(arrayList13, "presState");
        l.f(str24, "lname");
        l.f(str25, "email");
        l.f(str26, "PresVillageOrTown");
        l.f(str27, "placeOfBirth");
        l.f(arrayList14, "presCity");
        l.f(str28, "presPinCode");
        l.f(str29, "dateOfBirth");
        l.f(arrayList15, "checkCovs");
        l.f(str30, "swdmName");
        l.f(str31, "presLocation");
        l.f(arrayList16, "permCity");
        l.f(arrayList17, "llstoDisplayMap");
        l.f(arrayList18, "llFromState1");
        l.f(str32, "age");
        l.f(str33, "swdlName");
        l.f(str34, "error");
        l.f(str35, "dobError");
        l.f(str36, "dateNotMatchError");
        l.f(str37, "invalidLLNo");
        l.f(str38, "alreadyApplied");
        l.f(str39, "alreadyHavingDL");
        l.f(str40, "dlAppliedAfterFewDays");
        return new LLDetailsResultModal(arrayList19, str, str2, arrayList2, str3, str4, str5, str6, arrayList3, str7, arrayList4, arrayList5, bool, str8, str9, str10, str11, str12, arrayList6, arrayList7, bool2, str13, str14, str15, arrayList8, bool3, str16, str17, str18, str19, arrayList9, str20, str21, arrayList10, arrayList11, str22, str23, arrayList12, arrayList13, str24, str25, str26, str27, arrayList14, str28, str29, arrayList15, str30, str31, arrayList16, arrayList17, arrayList18, str32, str33, str34, str35, str36, str37, str38, str39, str40);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LLDetailsResultModal)) {
            return false;
        }
        LLDetailsResultModal lLDetailsResultModal = (LLDetailsResultModal) obj;
        return l.a(this.relationType, lLDetailsResultModal.relationType) && l.a(this.selectedCovs, lLDetailsResultModal.selectedCovs) && l.a(this.swdfName, lLDetailsResultModal.swdfName) && l.a(this.presDistrict, lLDetailsResultModal.presDistrict) && l.a(this.mobileNumber, lLDetailsResultModal.mobileNumber) && l.a(this.presStayYears, lLDetailsResultModal.presStayYears) && l.a(this.presPhoneNumber, lLDetailsResultModal.presPhoneNumber) && l.a(this.presHouseNo, lLDetailsResultModal.presHouseNo) && l.a(this.bloodGroup, lLDetailsResultModal.bloodGroup) && l.a(this.presSameAsPerm, lLDetailsResultModal.presSameAsPerm) && l.a(this.permState, lLDetailsResultModal.permState) && l.a(this.countryOfBirth, lLDetailsResultModal.countryOfBirth) && l.a(this.DisableStForMp, lLDetailsResultModal.DisableStForMp) && l.a(this.idMarks1, lLDetailsResultModal.idMarks1) && l.a(this.idMarks2, lLDetailsResultModal.idMarks2) && l.a(this.fname, lLDetailsResultModal.fname) && l.a(this.presStayMonths, lLDetailsResultModal.presStayMonths) && l.a(this.permVillageOrTown, lLDetailsResultModal.permVillageOrTown) && l.a(this.presSubDistrict, lLDetailsResultModal.presSubDistrict) && l.a(this.permSubDistrict, lLDetailsResultModal.permSubDistrict) && l.a(this.onlyEditAddressLL, lLDetailsResultModal.onlyEditAddressLL) && l.a(this.permLocation, lLDetailsResultModal.permLocation) && l.a(this.aadhaarNumber, lLDetailsResultModal.aadhaarNumber) && l.a(this.selectAll, lLDetailsResultModal.selectAll) && l.a(this.eduQual, lLDetailsResultModal.eduQual) && l.a(this.editAddressLL, lLDetailsResultModal.editAddressLL) && l.a(this.alternatemobileNumber, lLDetailsResultModal.alternatemobileNumber) && l.a(this.permStreet, lLDetailsResultModal.permStreet) && l.a(this.permPinCode, lLDetailsResultModal.permPinCode) && l.a(this.refStateEqiCovsMessage, lLDetailsResultModal.refStateEqiCovsMessage) && l.a(this.permDistrict, lLDetailsResultModal.permDistrict) && l.a(this.newFullName, lLDetailsResultModal.newFullName) && l.a(this.permHouseNo, lLDetailsResultModal.permHouseNo) && l.a(this.gender, lLDetailsResultModal.gender) && l.a(this.drivingSchoolDet, lLDetailsResultModal.drivingSchoolDet) && l.a(this.mname, lLDetailsResultModal.mname) && l.a(this.presStreet, lLDetailsResultModal.presStreet) && l.a(this.llFromRTO1, lLDetailsResultModal.llFromRTO1) && l.a(this.presState, lLDetailsResultModal.presState) && l.a(this.lname, lLDetailsResultModal.lname) && l.a(this.email, lLDetailsResultModal.email) && l.a(this.PresVillageOrTown, lLDetailsResultModal.PresVillageOrTown) && l.a(this.placeOfBirth, lLDetailsResultModal.placeOfBirth) && l.a(this.presCity, lLDetailsResultModal.presCity) && l.a(this.presPinCode, lLDetailsResultModal.presPinCode) && l.a(this.dateOfBirth, lLDetailsResultModal.dateOfBirth) && l.a(this.checkCovs, lLDetailsResultModal.checkCovs) && l.a(this.swdmName, lLDetailsResultModal.swdmName) && l.a(this.presLocation, lLDetailsResultModal.presLocation) && l.a(this.permCity, lLDetailsResultModal.permCity) && l.a(this.llstoDisplayMap, lLDetailsResultModal.llstoDisplayMap) && l.a(this.llFromState1, lLDetailsResultModal.llFromState1) && l.a(this.age, lLDetailsResultModal.age) && l.a(this.swdlName, lLDetailsResultModal.swdlName) && l.a(this.error, lLDetailsResultModal.error) && l.a(this.dobError, lLDetailsResultModal.dobError) && l.a(this.dateNotMatchError, lLDetailsResultModal.dateNotMatchError) && l.a(this.invalidLLNo, lLDetailsResultModal.invalidLLNo) && l.a(this.alreadyApplied, lLDetailsResultModal.alreadyApplied) && l.a(this.alreadyHavingDL, lLDetailsResultModal.alreadyHavingDL) && l.a(this.dlAppliedAfterFewDays, lLDetailsResultModal.dlAppliedAfterFewDays);
    }

    public final String getAadhaarNumber() {
        return this.aadhaarNumber;
    }

    public final String getAge() {
        return this.age;
    }

    public final String getAlreadyApplied() {
        return this.alreadyApplied;
    }

    public final String getAlreadyHavingDL() {
        return this.alreadyHavingDL;
    }

    public final String getAlternatemobileNumber() {
        return this.alternatemobileNumber;
    }

    public final ArrayList<BloodGroup> getBloodGroup() {
        return this.bloodGroup;
    }

    public final ArrayList<CheckCovs> getCheckCovs() {
        return this.checkCovs;
    }

    public final ArrayList<CountryOfBirth> getCountryOfBirth() {
        return this.countryOfBirth;
    }

    public final String getDateNotMatchError() {
        return this.dateNotMatchError;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final Boolean getDisableStForMp() {
        return this.DisableStForMp;
    }

    public final String getDlAppliedAfterFewDays() {
        return this.dlAppliedAfterFewDays;
    }

    public final String getDobError() {
        return this.dobError;
    }

    public final ArrayList<DrivingSchoolDet> getDrivingSchoolDet() {
        return this.drivingSchoolDet;
    }

    public final Boolean getEditAddressLL() {
        return this.editAddressLL;
    }

    public final ArrayList<EduQual> getEduQual() {
        return this.eduQual;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getError() {
        return this.error;
    }

    public final String getFname() {
        return this.fname;
    }

    public final ArrayList<Gender> getGender() {
        return this.gender;
    }

    public final String getIdMarks1() {
        return this.idMarks1;
    }

    public final String getIdMarks2() {
        return this.idMarks2;
    }

    public final String getInvalidLLNo() {
        return this.invalidLLNo;
    }

    public final ArrayList<LlFromRTO1> getLlFromRTO1() {
        return this.llFromRTO1;
    }

    public final ArrayList<LlFromState1> getLlFromState1() {
        return this.llFromState1;
    }

    public final ArrayList<LlstoDisplayMap> getLlstoDisplayMap() {
        return this.llstoDisplayMap;
    }

    public final String getLname() {
        return this.lname;
    }

    public final String getMname() {
        return this.mname;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getNewFullName() {
        return this.newFullName;
    }

    public final Boolean getOnlyEditAddressLL() {
        return this.onlyEditAddressLL;
    }

    public final ArrayList<PermCity> getPermCity() {
        return this.permCity;
    }

    public final ArrayList<PermDistrict> getPermDistrict() {
        return this.permDistrict;
    }

    public final String getPermHouseNo() {
        return this.permHouseNo;
    }

    public final String getPermLocation() {
        return this.permLocation;
    }

    public final String getPermPinCode() {
        return this.permPinCode;
    }

    public final ArrayList<PermState> getPermState() {
        return this.permState;
    }

    public final String getPermStreet() {
        return this.permStreet;
    }

    public final ArrayList<PermSubDistrict> getPermSubDistrict() {
        return this.permSubDistrict;
    }

    public final String getPermVillageOrTown() {
        return this.permVillageOrTown;
    }

    public final String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public final ArrayList<PresCity> getPresCity() {
        return this.presCity;
    }

    public final ArrayList<PresDistrict> getPresDistrict() {
        return this.presDistrict;
    }

    public final String getPresHouseNo() {
        return this.presHouseNo;
    }

    public final String getPresLocation() {
        return this.presLocation;
    }

    public final String getPresPhoneNumber() {
        return this.presPhoneNumber;
    }

    public final String getPresPinCode() {
        return this.presPinCode;
    }

    public final String getPresSameAsPerm() {
        return this.presSameAsPerm;
    }

    public final ArrayList<PresState> getPresState() {
        return this.presState;
    }

    public final String getPresStayMonths() {
        return this.presStayMonths;
    }

    public final String getPresStayYears() {
        return this.presStayYears;
    }

    public final String getPresStreet() {
        return this.presStreet;
    }

    public final ArrayList<PresSubDistrict> getPresSubDistrict() {
        return this.presSubDistrict;
    }

    public final String getPresVillageOrTown() {
        return this.PresVillageOrTown;
    }

    public final String getRefStateEqiCovsMessage() {
        return this.refStateEqiCovsMessage;
    }

    public final ArrayList<RelationType> getRelationType() {
        return this.relationType;
    }

    public final String getSelectAll() {
        return this.selectAll;
    }

    public final String getSelectedCovs() {
        return this.selectedCovs;
    }

    public final String getSwdfName() {
        return this.swdfName;
    }

    public final String getSwdlName() {
        return this.swdlName;
    }

    public final String getSwdmName() {
        return this.swdmName;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((this.relationType.hashCode() * 31) + this.selectedCovs.hashCode()) * 31) + this.swdfName.hashCode()) * 31) + this.presDistrict.hashCode()) * 31) + this.mobileNumber.hashCode()) * 31) + this.presStayYears.hashCode()) * 31) + this.presPhoneNumber.hashCode()) * 31) + this.presHouseNo.hashCode()) * 31) + this.bloodGroup.hashCode()) * 31) + this.presSameAsPerm.hashCode()) * 31) + this.permState.hashCode()) * 31) + this.countryOfBirth.hashCode()) * 31;
        Boolean bool = this.DisableStForMp;
        int i10 = 0;
        int hashCode2 = (((((((((((((((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.idMarks1.hashCode()) * 31) + this.idMarks2.hashCode()) * 31) + this.fname.hashCode()) * 31) + this.presStayMonths.hashCode()) * 31) + this.permVillageOrTown.hashCode()) * 31) + this.presSubDistrict.hashCode()) * 31) + this.permSubDistrict.hashCode()) * 31;
        Boolean bool2 = this.onlyEditAddressLL;
        int hashCode3 = (((((hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.permLocation.hashCode()) * 31) + this.aadhaarNumber.hashCode()) * 31;
        String str = this.selectAll;
        int hashCode4 = (((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.eduQual.hashCode()) * 31;
        Boolean bool3 = this.editAddressLL;
        if (bool3 != null) {
            i10 = bool3.hashCode();
        }
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode4 + i10) * 31) + this.alternatemobileNumber.hashCode()) * 31) + this.permStreet.hashCode()) * 31) + this.permPinCode.hashCode()) * 31) + this.refStateEqiCovsMessage.hashCode()) * 31) + this.permDistrict.hashCode()) * 31) + this.newFullName.hashCode()) * 31) + this.permHouseNo.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.drivingSchoolDet.hashCode()) * 31) + this.mname.hashCode()) * 31) + this.presStreet.hashCode()) * 31) + this.llFromRTO1.hashCode()) * 31) + this.presState.hashCode()) * 31) + this.lname.hashCode()) * 31) + this.email.hashCode()) * 31) + this.PresVillageOrTown.hashCode()) * 31) + this.placeOfBirth.hashCode()) * 31) + this.presCity.hashCode()) * 31) + this.presPinCode.hashCode()) * 31) + this.dateOfBirth.hashCode()) * 31) + this.checkCovs.hashCode()) * 31) + this.swdmName.hashCode()) * 31) + this.presLocation.hashCode()) * 31) + this.permCity.hashCode()) * 31) + this.llstoDisplayMap.hashCode()) * 31) + this.llFromState1.hashCode()) * 31) + this.age.hashCode()) * 31) + this.swdlName.hashCode()) * 31) + this.error.hashCode()) * 31) + this.dobError.hashCode()) * 31) + this.dateNotMatchError.hashCode()) * 31) + this.invalidLLNo.hashCode()) * 31) + this.alreadyApplied.hashCode()) * 31) + this.alreadyHavingDL.hashCode()) * 31) + this.dlAppliedAfterFewDays.hashCode();
    }

    public final void setAadhaarNumber(String str) {
        l.f(str, "<set-?>");
        this.aadhaarNumber = str;
    }

    public final void setAge(String str) {
        l.f(str, "<set-?>");
        this.age = str;
    }

    public final void setAlreadyApplied(String str) {
        l.f(str, "<set-?>");
        this.alreadyApplied = str;
    }

    public final void setAlreadyHavingDL(String str) {
        l.f(str, "<set-?>");
        this.alreadyHavingDL = str;
    }

    public final void setAlternatemobileNumber(String str) {
        l.f(str, "<set-?>");
        this.alternatemobileNumber = str;
    }

    public final void setBloodGroup(ArrayList<BloodGroup> arrayList) {
        l.f(arrayList, "<set-?>");
        this.bloodGroup = arrayList;
    }

    public final void setCheckCovs(ArrayList<CheckCovs> arrayList) {
        l.f(arrayList, "<set-?>");
        this.checkCovs = arrayList;
    }

    public final void setCountryOfBirth(ArrayList<CountryOfBirth> arrayList) {
        l.f(arrayList, "<set-?>");
        this.countryOfBirth = arrayList;
    }

    public final void setDateNotMatchError(String str) {
        l.f(str, "<set-?>");
        this.dateNotMatchError = str;
    }

    public final void setDateOfBirth(String str) {
        l.f(str, "<set-?>");
        this.dateOfBirth = str;
    }

    public final void setDisableStForMp(Boolean bool) {
        this.DisableStForMp = bool;
    }

    public final void setDlAppliedAfterFewDays(String str) {
        l.f(str, "<set-?>");
        this.dlAppliedAfterFewDays = str;
    }

    public final void setDobError(String str) {
        l.f(str, "<set-?>");
        this.dobError = str;
    }

    public final void setDrivingSchoolDet(ArrayList<DrivingSchoolDet> arrayList) {
        l.f(arrayList, "<set-?>");
        this.drivingSchoolDet = arrayList;
    }

    public final void setEditAddressLL(Boolean bool) {
        this.editAddressLL = bool;
    }

    public final void setEduQual(ArrayList<EduQual> arrayList) {
        l.f(arrayList, "<set-?>");
        this.eduQual = arrayList;
    }

    public final void setEmail(String str) {
        l.f(str, "<set-?>");
        this.email = str;
    }

    public final void setError(String str) {
        l.f(str, "<set-?>");
        this.error = str;
    }

    public final void setFname(String str) {
        l.f(str, "<set-?>");
        this.fname = str;
    }

    public final void setGender(ArrayList<Gender> arrayList) {
        l.f(arrayList, "<set-?>");
        this.gender = arrayList;
    }

    public final void setIdMarks1(String str) {
        l.f(str, "<set-?>");
        this.idMarks1 = str;
    }

    public final void setIdMarks2(String str) {
        l.f(str, "<set-?>");
        this.idMarks2 = str;
    }

    public final void setInvalidLLNo(String str) {
        l.f(str, "<set-?>");
        this.invalidLLNo = str;
    }

    public final void setLlFromRTO1(ArrayList<LlFromRTO1> arrayList) {
        l.f(arrayList, "<set-?>");
        this.llFromRTO1 = arrayList;
    }

    public final void setLlFromState1(ArrayList<LlFromState1> arrayList) {
        l.f(arrayList, "<set-?>");
        this.llFromState1 = arrayList;
    }

    public final void setLlstoDisplayMap(ArrayList<LlstoDisplayMap> arrayList) {
        l.f(arrayList, "<set-?>");
        this.llstoDisplayMap = arrayList;
    }

    public final void setLname(String str) {
        l.f(str, "<set-?>");
        this.lname = str;
    }

    public final void setMname(String str) {
        l.f(str, "<set-?>");
        this.mname = str;
    }

    public final void setMobileNumber(String str) {
        l.f(str, "<set-?>");
        this.mobileNumber = str;
    }

    public final void setNewFullName(String str) {
        l.f(str, "<set-?>");
        this.newFullName = str;
    }

    public final void setOnlyEditAddressLL(Boolean bool) {
        this.onlyEditAddressLL = bool;
    }

    public final void setPermCity(ArrayList<PermCity> arrayList) {
        l.f(arrayList, "<set-?>");
        this.permCity = arrayList;
    }

    public final void setPermDistrict(ArrayList<PermDistrict> arrayList) {
        l.f(arrayList, "<set-?>");
        this.permDistrict = arrayList;
    }

    public final void setPermHouseNo(String str) {
        l.f(str, "<set-?>");
        this.permHouseNo = str;
    }

    public final void setPermLocation(String str) {
        l.f(str, "<set-?>");
        this.permLocation = str;
    }

    public final void setPermPinCode(String str) {
        l.f(str, "<set-?>");
        this.permPinCode = str;
    }

    public final void setPermState(ArrayList<PermState> arrayList) {
        l.f(arrayList, "<set-?>");
        this.permState = arrayList;
    }

    public final void setPermStreet(String str) {
        l.f(str, "<set-?>");
        this.permStreet = str;
    }

    public final void setPermSubDistrict(ArrayList<PermSubDistrict> arrayList) {
        l.f(arrayList, "<set-?>");
        this.permSubDistrict = arrayList;
    }

    public final void setPermVillageOrTown(String str) {
        l.f(str, "<set-?>");
        this.permVillageOrTown = str;
    }

    public final void setPlaceOfBirth(String str) {
        l.f(str, "<set-?>");
        this.placeOfBirth = str;
    }

    public final void setPresCity(ArrayList<PresCity> arrayList) {
        l.f(arrayList, "<set-?>");
        this.presCity = arrayList;
    }

    public final void setPresDistrict(ArrayList<PresDistrict> arrayList) {
        l.f(arrayList, "<set-?>");
        this.presDistrict = arrayList;
    }

    public final void setPresHouseNo(String str) {
        l.f(str, "<set-?>");
        this.presHouseNo = str;
    }

    public final void setPresLocation(String str) {
        l.f(str, "<set-?>");
        this.presLocation = str;
    }

    public final void setPresPhoneNumber(String str) {
        l.f(str, "<set-?>");
        this.presPhoneNumber = str;
    }

    public final void setPresPinCode(String str) {
        l.f(str, "<set-?>");
        this.presPinCode = str;
    }

    public final void setPresSameAsPerm(String str) {
        l.f(str, "<set-?>");
        this.presSameAsPerm = str;
    }

    public final void setPresState(ArrayList<PresState> arrayList) {
        l.f(arrayList, "<set-?>");
        this.presState = arrayList;
    }

    public final void setPresStayMonths(String str) {
        l.f(str, "<set-?>");
        this.presStayMonths = str;
    }

    public final void setPresStayYears(String str) {
        l.f(str, "<set-?>");
        this.presStayYears = str;
    }

    public final void setPresStreet(String str) {
        l.f(str, "<set-?>");
        this.presStreet = str;
    }

    public final void setPresSubDistrict(ArrayList<PresSubDistrict> arrayList) {
        l.f(arrayList, "<set-?>");
        this.presSubDistrict = arrayList;
    }

    public final void setPresVillageOrTown(String str) {
        l.f(str, "<set-?>");
        this.PresVillageOrTown = str;
    }

    public final void setRefStateEqiCovsMessage(String str) {
        l.f(str, "<set-?>");
        this.refStateEqiCovsMessage = str;
    }

    public final void setRelationType(ArrayList<RelationType> arrayList) {
        l.f(arrayList, "<set-?>");
        this.relationType = arrayList;
    }

    public final void setSelectAll(String str) {
        this.selectAll = str;
    }

    public final void setSelectedCovs(String str) {
        l.f(str, "<set-?>");
        this.selectedCovs = str;
    }

    public final void setSwdfName(String str) {
        l.f(str, "<set-?>");
        this.swdfName = str;
    }

    public final void setSwdlName(String str) {
        l.f(str, "<set-?>");
        this.swdlName = str;
    }

    public final void setSwdmName(String str) {
        l.f(str, "<set-?>");
        this.swdmName = str;
    }

    public String toString() {
        return "LLDetailsResultModal(relationType=" + this.relationType + ", selectedCovs=" + this.selectedCovs + ", swdfName=" + this.swdfName + ", presDistrict=" + this.presDistrict + ", mobileNumber=" + this.mobileNumber + ", presStayYears=" + this.presStayYears + ", presPhoneNumber=" + this.presPhoneNumber + ", presHouseNo=" + this.presHouseNo + ", bloodGroup=" + this.bloodGroup + ", presSameAsPerm=" + this.presSameAsPerm + ", permState=" + this.permState + ", countryOfBirth=" + this.countryOfBirth + ", DisableStForMp=" + this.DisableStForMp + ", idMarks1=" + this.idMarks1 + ", idMarks2=" + this.idMarks2 + ", fname=" + this.fname + ", presStayMonths=" + this.presStayMonths + ", permVillageOrTown=" + this.permVillageOrTown + ", presSubDistrict=" + this.presSubDistrict + ", permSubDistrict=" + this.permSubDistrict + ", onlyEditAddressLL=" + this.onlyEditAddressLL + ", permLocation=" + this.permLocation + ", aadhaarNumber=" + this.aadhaarNumber + ", selectAll=" + this.selectAll + ", eduQual=" + this.eduQual + ", editAddressLL=" + this.editAddressLL + ", alternatemobileNumber=" + this.alternatemobileNumber + ", permStreet=" + this.permStreet + ", permPinCode=" + this.permPinCode + ", refStateEqiCovsMessage=" + this.refStateEqiCovsMessage + ", permDistrict=" + this.permDistrict + ", newFullName=" + this.newFullName + ", permHouseNo=" + this.permHouseNo + ", gender=" + this.gender + ", drivingSchoolDet=" + this.drivingSchoolDet + ", mname=" + this.mname + ", presStreet=" + this.presStreet + ", llFromRTO1=" + this.llFromRTO1 + ", presState=" + this.presState + ", lname=" + this.lname + ", email=" + this.email + ", PresVillageOrTown=" + this.PresVillageOrTown + ", placeOfBirth=" + this.placeOfBirth + ", presCity=" + this.presCity + ", presPinCode=" + this.presPinCode + ", dateOfBirth=" + this.dateOfBirth + ", checkCovs=" + this.checkCovs + ", swdmName=" + this.swdmName + ", presLocation=" + this.presLocation + ", permCity=" + this.permCity + ", llstoDisplayMap=" + this.llstoDisplayMap + ", llFromState1=" + this.llFromState1 + ", age=" + this.age + ", swdlName=" + this.swdlName + ", error=" + this.error + ", dobError=" + this.dobError + ", dateNotMatchError=" + this.dateNotMatchError + ", invalidLLNo=" + this.invalidLLNo + ", alreadyApplied=" + this.alreadyApplied + ", alreadyHavingDL=" + this.alreadyHavingDL + ", dlAppliedAfterFewDays=" + this.dlAppliedAfterFewDays + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        ArrayList<RelationType> arrayList = this.relationType;
        parcel.writeInt(arrayList.size());
        Iterator<RelationType> it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeSerializable(it.next());
        }
        parcel.writeString(this.selectedCovs);
        parcel.writeString(this.swdfName);
        ArrayList<PresDistrict> arrayList2 = this.presDistrict;
        parcel.writeInt(arrayList2.size());
        Iterator<PresDistrict> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            parcel.writeSerializable(it2.next());
        }
        parcel.writeString(this.mobileNumber);
        parcel.writeString(this.presStayYears);
        parcel.writeString(this.presPhoneNumber);
        parcel.writeString(this.presHouseNo);
        ArrayList<BloodGroup> arrayList3 = this.bloodGroup;
        parcel.writeInt(arrayList3.size());
        Iterator<BloodGroup> it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            parcel.writeSerializable(it3.next());
        }
        parcel.writeString(this.presSameAsPerm);
        ArrayList<PermState> arrayList4 = this.permState;
        parcel.writeInt(arrayList4.size());
        Iterator<PermState> it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            parcel.writeSerializable(it4.next());
        }
        ArrayList<CountryOfBirth> arrayList5 = this.countryOfBirth;
        parcel.writeInt(arrayList5.size());
        Iterator<CountryOfBirth> it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            parcel.writeSerializable(it5.next());
        }
        Boolean bool = this.DisableStForMp;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.idMarks1);
        parcel.writeString(this.idMarks2);
        parcel.writeString(this.fname);
        parcel.writeString(this.presStayMonths);
        parcel.writeString(this.permVillageOrTown);
        ArrayList<PresSubDistrict> arrayList6 = this.presSubDistrict;
        parcel.writeInt(arrayList6.size());
        Iterator<PresSubDistrict> it6 = arrayList6.iterator();
        while (it6.hasNext()) {
            parcel.writeSerializable(it6.next());
        }
        ArrayList<PermSubDistrict> arrayList7 = this.permSubDistrict;
        parcel.writeInt(arrayList7.size());
        Iterator<PermSubDistrict> it7 = arrayList7.iterator();
        while (it7.hasNext()) {
            parcel.writeSerializable(it7.next());
        }
        Boolean bool2 = this.onlyEditAddressLL;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.permLocation);
        parcel.writeString(this.aadhaarNumber);
        parcel.writeString(this.selectAll);
        ArrayList<EduQual> arrayList8 = this.eduQual;
        parcel.writeInt(arrayList8.size());
        Iterator<EduQual> it8 = arrayList8.iterator();
        while (it8.hasNext()) {
            parcel.writeSerializable(it8.next());
        }
        Boolean bool3 = this.editAddressLL;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.alternatemobileNumber);
        parcel.writeString(this.permStreet);
        parcel.writeString(this.permPinCode);
        parcel.writeString(this.refStateEqiCovsMessage);
        ArrayList<PermDistrict> arrayList9 = this.permDistrict;
        parcel.writeInt(arrayList9.size());
        Iterator<PermDistrict> it9 = arrayList9.iterator();
        while (it9.hasNext()) {
            parcel.writeSerializable(it9.next());
        }
        parcel.writeString(this.newFullName);
        parcel.writeString(this.permHouseNo);
        ArrayList<Gender> arrayList10 = this.gender;
        parcel.writeInt(arrayList10.size());
        Iterator<Gender> it10 = arrayList10.iterator();
        while (it10.hasNext()) {
            parcel.writeSerializable(it10.next());
        }
        ArrayList<DrivingSchoolDet> arrayList11 = this.drivingSchoolDet;
        parcel.writeInt(arrayList11.size());
        Iterator<DrivingSchoolDet> it11 = arrayList11.iterator();
        while (it11.hasNext()) {
            parcel.writeSerializable(it11.next());
        }
        parcel.writeString(this.mname);
        parcel.writeString(this.presStreet);
        ArrayList<LlFromRTO1> arrayList12 = this.llFromRTO1;
        parcel.writeInt(arrayList12.size());
        Iterator<LlFromRTO1> it12 = arrayList12.iterator();
        while (it12.hasNext()) {
            parcel.writeSerializable(it12.next());
        }
        ArrayList<PresState> arrayList13 = this.presState;
        parcel.writeInt(arrayList13.size());
        Iterator<PresState> it13 = arrayList13.iterator();
        while (it13.hasNext()) {
            parcel.writeSerializable(it13.next());
        }
        parcel.writeString(this.lname);
        parcel.writeString(this.email);
        parcel.writeString(this.PresVillageOrTown);
        parcel.writeString(this.placeOfBirth);
        ArrayList<PresCity> arrayList14 = this.presCity;
        parcel.writeInt(arrayList14.size());
        Iterator<PresCity> it14 = arrayList14.iterator();
        while (it14.hasNext()) {
            parcel.writeSerializable(it14.next());
        }
        parcel.writeString(this.presPinCode);
        parcel.writeString(this.dateOfBirth);
        ArrayList<CheckCovs> arrayList15 = this.checkCovs;
        parcel.writeInt(arrayList15.size());
        Iterator<CheckCovs> it15 = arrayList15.iterator();
        while (it15.hasNext()) {
            it15.next().writeToParcel(parcel, i10);
        }
        parcel.writeString(this.swdmName);
        parcel.writeString(this.presLocation);
        ArrayList<PermCity> arrayList16 = this.permCity;
        parcel.writeInt(arrayList16.size());
        Iterator<PermCity> it16 = arrayList16.iterator();
        while (it16.hasNext()) {
            parcel.writeSerializable(it16.next());
        }
        ArrayList<LlstoDisplayMap> arrayList17 = this.llstoDisplayMap;
        parcel.writeInt(arrayList17.size());
        Iterator<LlstoDisplayMap> it17 = arrayList17.iterator();
        while (it17.hasNext()) {
            parcel.writeSerializable(it17.next());
        }
        ArrayList<LlFromState1> arrayList18 = this.llFromState1;
        parcel.writeInt(arrayList18.size());
        Iterator<LlFromState1> it18 = arrayList18.iterator();
        while (it18.hasNext()) {
            parcel.writeSerializable(it18.next());
        }
        parcel.writeString(this.age);
        parcel.writeString(this.swdlName);
        parcel.writeString(this.error);
        parcel.writeString(this.dobError);
        parcel.writeString(this.dateNotMatchError);
        parcel.writeString(this.invalidLLNo);
        parcel.writeString(this.alreadyApplied);
        parcel.writeString(this.alreadyHavingDL);
        parcel.writeString(this.dlAppliedAfterFewDays);
    }

    public LLDetailsResultModal(ArrayList<RelationType> arrayList, String str, String str2, ArrayList<PresDistrict> arrayList2, String str3, String str4, String str5, String str6, ArrayList<BloodGroup> arrayList3, String str7, ArrayList<PermState> arrayList4, ArrayList<CountryOfBirth> arrayList5, Boolean bool, String str8, String str9, String str10, String str11, String str12, ArrayList<PresSubDistrict> arrayList6, ArrayList<PermSubDistrict> arrayList7, Boolean bool2, String str13, String str14, String str15, ArrayList<EduQual> arrayList8, Boolean bool3, String str16, String str17, String str18, String str19, ArrayList<PermDistrict> arrayList9, String str20, String str21, ArrayList<Gender> arrayList10, ArrayList<DrivingSchoolDet> arrayList11, String str22, String str23, ArrayList<LlFromRTO1> arrayList12, ArrayList<PresState> arrayList13, String str24, String str25, String str26, String str27, ArrayList<PresCity> arrayList14, String str28, String str29, ArrayList<CheckCovs> arrayList15, String str30, String str31, ArrayList<PermCity> arrayList16, ArrayList<LlstoDisplayMap> arrayList17, ArrayList<LlFromState1> arrayList18, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40) {
        ArrayList<RelationType> arrayList19 = arrayList;
        String str41 = str;
        String str42 = str2;
        ArrayList<PresDistrict> arrayList20 = arrayList2;
        String str43 = str3;
        String str44 = str4;
        String str45 = str5;
        String str46 = str6;
        ArrayList<BloodGroup> arrayList21 = arrayList3;
        String str47 = str7;
        ArrayList<PermState> arrayList22 = arrayList4;
        ArrayList<CountryOfBirth> arrayList23 = arrayList5;
        String str48 = str8;
        String str49 = str9;
        String str50 = str11;
        l.f(arrayList19, "relationType");
        l.f(str41, "selectedCovs");
        l.f(str42, "swdfName");
        l.f(arrayList20, "presDistrict");
        l.f(str43, "mobileNumber");
        l.f(str44, "presStayYears");
        l.f(str45, "presPhoneNumber");
        l.f(str46, "presHouseNo");
        l.f(arrayList21, "bloodGroup");
        l.f(str47, "presSameAsPerm");
        l.f(arrayList22, "permState");
        l.f(arrayList23, "countryOfBirth");
        l.f(str48, "idMarks1");
        l.f(str49, "idMarks2");
        l.f(str10, "fname");
        l.f(str11, "presStayMonths");
        l.f(str12, "permVillageOrTown");
        l.f(arrayList6, "presSubDistrict");
        l.f(arrayList7, "permSubDistrict");
        l.f(str13, "permLocation");
        l.f(str14, "aadhaarNumber");
        l.f(arrayList8, "eduQual");
        l.f(str16, "alternatemobileNumber");
        l.f(str17, "permStreet");
        l.f(str18, "permPinCode");
        l.f(str19, "refStateEqiCovsMessage");
        l.f(arrayList9, "permDistrict");
        l.f(str20, "newFullName");
        l.f(str21, "permHouseNo");
        l.f(arrayList10, "gender");
        l.f(arrayList11, "drivingSchoolDet");
        l.f(str22, "mname");
        l.f(str23, "presStreet");
        l.f(arrayList12, "llFromRTO1");
        l.f(arrayList13, "presState");
        l.f(str24, "lname");
        l.f(str25, "email");
        l.f(str26, "PresVillageOrTown");
        l.f(str27, "placeOfBirth");
        l.f(arrayList14, "presCity");
        l.f(str28, "presPinCode");
        l.f(str29, "dateOfBirth");
        l.f(arrayList15, "checkCovs");
        l.f(str30, "swdmName");
        l.f(str31, "presLocation");
        l.f(arrayList16, "permCity");
        l.f(arrayList17, "llstoDisplayMap");
        l.f(arrayList18, "llFromState1");
        l.f(str32, "age");
        l.f(str33, "swdlName");
        l.f(str34, "error");
        l.f(str35, "dobError");
        l.f(str36, "dateNotMatchError");
        l.f(str37, "invalidLLNo");
        l.f(str38, "alreadyApplied");
        l.f(str39, "alreadyHavingDL");
        l.f(str40, "dlAppliedAfterFewDays");
        this.relationType = arrayList19;
        this.selectedCovs = str41;
        this.swdfName = str42;
        this.presDistrict = arrayList20;
        this.mobileNumber = str43;
        this.presStayYears = str44;
        this.presPhoneNumber = str45;
        this.presHouseNo = str46;
        this.bloodGroup = arrayList21;
        this.presSameAsPerm = str47;
        this.permState = arrayList22;
        this.countryOfBirth = arrayList23;
        this.DisableStForMp = bool;
        this.idMarks1 = str48;
        this.idMarks2 = str49;
        this.fname = str10;
        this.presStayMonths = str11;
        this.permVillageOrTown = str12;
        this.presSubDistrict = arrayList6;
        this.permSubDistrict = arrayList7;
        this.onlyEditAddressLL = bool2;
        this.permLocation = str13;
        this.aadhaarNumber = str14;
        this.selectAll = str15;
        this.eduQual = arrayList8;
        this.editAddressLL = bool3;
        this.alternatemobileNumber = str16;
        this.permStreet = str17;
        this.permPinCode = str18;
        this.refStateEqiCovsMessage = str19;
        this.permDistrict = arrayList9;
        this.newFullName = str20;
        this.permHouseNo = str21;
        this.gender = arrayList10;
        this.drivingSchoolDet = arrayList11;
        this.mname = str22;
        this.presStreet = str23;
        this.llFromRTO1 = arrayList12;
        this.presState = arrayList13;
        this.lname = str24;
        this.email = str25;
        this.PresVillageOrTown = str26;
        this.placeOfBirth = str27;
        this.presCity = arrayList14;
        this.presPinCode = str28;
        this.dateOfBirth = str29;
        this.checkCovs = arrayList15;
        this.swdmName = str30;
        this.presLocation = str31;
        this.permCity = arrayList16;
        this.llstoDisplayMap = arrayList17;
        this.llFromState1 = arrayList18;
        this.age = str32;
        this.swdlName = str33;
        this.error = str34;
        this.dobError = str35;
        this.dateNotMatchError = str36;
        this.invalidLLNo = str37;
        this.alreadyApplied = str38;
        this.alreadyHavingDL = str39;
        this.dlAppliedAfterFewDays = str40;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LLDetailsResultModal(java.util.ArrayList r61, java.lang.String r62, java.lang.String r63, java.util.ArrayList r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, java.util.ArrayList r69, java.lang.String r70, java.util.ArrayList r71, java.util.ArrayList r72, java.lang.Boolean r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.String r77, java.lang.String r78, java.util.ArrayList r79, java.util.ArrayList r80, java.lang.Boolean r81, java.lang.String r82, java.lang.String r83, java.lang.String r84, java.util.ArrayList r85, java.lang.Boolean r86, java.lang.String r87, java.lang.String r88, java.lang.String r89, java.lang.String r90, java.util.ArrayList r91, java.lang.String r92, java.lang.String r93, java.util.ArrayList r94, java.util.ArrayList r95, java.lang.String r96, java.lang.String r97, java.util.ArrayList r98, java.util.ArrayList r99, java.lang.String r100, java.lang.String r101, java.lang.String r102, java.lang.String r103, java.util.ArrayList r104, java.lang.String r105, java.lang.String r106, java.util.ArrayList r107, java.lang.String r108, java.lang.String r109, java.util.ArrayList r110, java.util.ArrayList r111, java.util.ArrayList r112, java.lang.String r113, java.lang.String r114, java.lang.String r115, java.lang.String r116, java.lang.String r117, java.lang.String r118, java.lang.String r119, java.lang.String r120, java.lang.String r121, int r122, int r123, cm.g r124) {
        /*
            r60 = this;
            r0 = r122
            r1 = r123
            r2 = r0 & 1
            if (r2 == 0) goto L_0x000e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L_0x0010
        L_0x000e:
            r2 = r61
        L_0x0010:
            r3 = r0 & 2
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0018
            r3 = r4
            goto L_0x001a
        L_0x0018:
            r3 = r62
        L_0x001a:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0020
            r5 = r4
            goto L_0x0022
        L_0x0020:
            r5 = r63
        L_0x0022:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x002c
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            goto L_0x002e
        L_0x002c:
            r6 = r64
        L_0x002e:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0034
            r7 = r4
            goto L_0x0036
        L_0x0034:
            r7 = r65
        L_0x0036:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x003c
            r8 = r4
            goto L_0x003e
        L_0x003c:
            r8 = r66
        L_0x003e:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0044
            r9 = r4
            goto L_0x0046
        L_0x0044:
            r9 = r67
        L_0x0046:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x004c
            r10 = r4
            goto L_0x004e
        L_0x004c:
            r10 = r68
        L_0x004e:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0058
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            goto L_0x005a
        L_0x0058:
            r11 = r69
        L_0x005a:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0060
            r12 = r4
            goto L_0x0062
        L_0x0060:
            r12 = r70
        L_0x0062:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x006c
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            goto L_0x006e
        L_0x006c:
            r13 = r71
        L_0x006e:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0078
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            goto L_0x007a
        L_0x0078:
            r14 = r72
        L_0x007a:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            r16 = 0
            if (r15 == 0) goto L_0x0083
            r15 = r16
            goto L_0x0085
        L_0x0083:
            r15 = r73
        L_0x0085:
            r61 = r4
            r4 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x008e
            r4 = r61
            goto L_0x0090
        L_0x008e:
            r4 = r74
        L_0x0090:
            r124 = r4
            r4 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x0099
            r4 = r61
            goto L_0x009b
        L_0x0099:
            r4 = r75
        L_0x009b:
            r17 = 32768(0x8000, float:4.5918E-41)
            r18 = r0 & r17
            if (r18 == 0) goto L_0x00a5
            r18 = r61
            goto L_0x00a7
        L_0x00a5:
            r18 = r76
        L_0x00a7:
            r19 = 65536(0x10000, float:9.18355E-41)
            r20 = r0 & r19
            if (r20 == 0) goto L_0x00b0
            r20 = r61
            goto L_0x00b2
        L_0x00b0:
            r20 = r77
        L_0x00b2:
            r21 = 131072(0x20000, float:1.83671E-40)
            r22 = r0 & r21
            if (r22 == 0) goto L_0x00bb
            r22 = r61
            goto L_0x00bd
        L_0x00bb:
            r22 = r78
        L_0x00bd:
            r23 = 262144(0x40000, float:3.67342E-40)
            r24 = r0 & r23
            if (r24 == 0) goto L_0x00c9
            java.util.ArrayList r24 = new java.util.ArrayList
            r24.<init>()
            goto L_0x00cb
        L_0x00c9:
            r24 = r79
        L_0x00cb:
            r25 = 524288(0x80000, float:7.34684E-40)
            r26 = r0 & r25
            if (r26 == 0) goto L_0x00d7
            java.util.ArrayList r26 = new java.util.ArrayList
            r26.<init>()
            goto L_0x00d9
        L_0x00d7:
            r26 = r80
        L_0x00d9:
            r27 = 1048576(0x100000, float:1.469368E-39)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00e2
            r27 = r16
            goto L_0x00e4
        L_0x00e2:
            r27 = r81
        L_0x00e4:
            r28 = 2097152(0x200000, float:2.938736E-39)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x00ed
            r28 = r61
            goto L_0x00ef
        L_0x00ed:
            r28 = r82
        L_0x00ef:
            r29 = 4194304(0x400000, float:5.877472E-39)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x00f8
            r29 = r61
            goto L_0x00fa
        L_0x00f8:
            r29 = r83
        L_0x00fa:
            r30 = 8388608(0x800000, float:1.17549435E-38)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x0103
            r30 = r16
            goto L_0x0105
        L_0x0103:
            r30 = r84
        L_0x0105:
            r31 = 16777216(0x1000000, float:2.3509887E-38)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x0111
            java.util.ArrayList r31 = new java.util.ArrayList
            r31.<init>()
            goto L_0x0113
        L_0x0111:
            r31 = r85
        L_0x0113:
            r32 = 33554432(0x2000000, float:9.403955E-38)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r16 = r86
        L_0x011c:
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x0125
            r32 = r61
            goto L_0x0127
        L_0x0125:
            r32 = r87
        L_0x0127:
            r33 = 134217728(0x8000000, float:3.85186E-34)
            r33 = r0 & r33
            if (r33 == 0) goto L_0x0130
            r33 = r61
            goto L_0x0132
        L_0x0130:
            r33 = r88
        L_0x0132:
            r34 = 268435456(0x10000000, float:2.5243549E-29)
            r34 = r0 & r34
            if (r34 == 0) goto L_0x013b
            r34 = r61
            goto L_0x013d
        L_0x013b:
            r34 = r89
        L_0x013d:
            r35 = 536870912(0x20000000, float:1.0842022E-19)
            r35 = r0 & r35
            if (r35 == 0) goto L_0x0146
            r35 = r61
            goto L_0x0148
        L_0x0146:
            r35 = r90
        L_0x0148:
            r36 = 1073741824(0x40000000, float:2.0)
            r36 = r0 & r36
            if (r36 == 0) goto L_0x0154
            java.util.ArrayList r36 = new java.util.ArrayList
            r36.<init>()
            goto L_0x0156
        L_0x0154:
            r36 = r91
        L_0x0156:
            r37 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r37
            if (r0 == 0) goto L_0x015f
            r0 = r61
            goto L_0x0161
        L_0x015f:
            r0 = r92
        L_0x0161:
            r37 = r1 & 1
            if (r37 == 0) goto L_0x0168
            r37 = r61
            goto L_0x016a
        L_0x0168:
            r37 = r93
        L_0x016a:
            r38 = r1 & 2
            if (r38 == 0) goto L_0x0174
            java.util.ArrayList r38 = new java.util.ArrayList
            r38.<init>()
            goto L_0x0176
        L_0x0174:
            r38 = r94
        L_0x0176:
            r39 = r1 & 4
            if (r39 == 0) goto L_0x0180
            java.util.ArrayList r39 = new java.util.ArrayList
            r39.<init>()
            goto L_0x0182
        L_0x0180:
            r39 = r95
        L_0x0182:
            r40 = r1 & 8
            if (r40 == 0) goto L_0x0189
            r40 = r61
            goto L_0x018b
        L_0x0189:
            r40 = r96
        L_0x018b:
            r41 = r1 & 16
            if (r41 == 0) goto L_0x0192
            r41 = r61
            goto L_0x0194
        L_0x0192:
            r41 = r97
        L_0x0194:
            r42 = r1 & 32
            if (r42 == 0) goto L_0x019e
            java.util.ArrayList r42 = new java.util.ArrayList
            r42.<init>()
            goto L_0x01a0
        L_0x019e:
            r42 = r98
        L_0x01a0:
            r43 = r1 & 64
            if (r43 == 0) goto L_0x01aa
            java.util.ArrayList r43 = new java.util.ArrayList
            r43.<init>()
            goto L_0x01ac
        L_0x01aa:
            r43 = r99
        L_0x01ac:
            r122 = r0
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01b5
            r0 = r61
            goto L_0x01b7
        L_0x01b5:
            r0 = r100
        L_0x01b7:
            r44 = r0
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01c0
            r0 = r61
            goto L_0x01c2
        L_0x01c0:
            r0 = r101
        L_0x01c2:
            r45 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01cb
            r0 = r61
            goto L_0x01cd
        L_0x01cb:
            r0 = r102
        L_0x01cd:
            r46 = r0
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x01d6
            r0 = r61
            goto L_0x01d8
        L_0x01d6:
            r0 = r103
        L_0x01d8:
            r47 = r0
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01e4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x01e6
        L_0x01e4:
            r0 = r104
        L_0x01e6:
            r48 = r0
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x01ef
            r0 = r61
            goto L_0x01f1
        L_0x01ef:
            r0 = r105
        L_0x01f1:
            r49 = r0
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x01fa
            r0 = r61
            goto L_0x01fc
        L_0x01fa:
            r0 = r106
        L_0x01fc:
            r50 = r0
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0208
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x020a
        L_0x0208:
            r0 = r107
        L_0x020a:
            r17 = r1 & r17
            if (r17 == 0) goto L_0x0211
            r17 = r61
            goto L_0x0213
        L_0x0211:
            r17 = r108
        L_0x0213:
            r19 = r1 & r19
            if (r19 == 0) goto L_0x021a
            r19 = r61
            goto L_0x021c
        L_0x021a:
            r19 = r109
        L_0x021c:
            r21 = r1 & r21
            if (r21 == 0) goto L_0x0226
            java.util.ArrayList r21 = new java.util.ArrayList
            r21.<init>()
            goto L_0x0228
        L_0x0226:
            r21 = r110
        L_0x0228:
            r23 = r1 & r23
            if (r23 == 0) goto L_0x0232
            java.util.ArrayList r23 = new java.util.ArrayList
            r23.<init>()
            goto L_0x0234
        L_0x0232:
            r23 = r111
        L_0x0234:
            r25 = r1 & r25
            if (r25 == 0) goto L_0x023e
            java.util.ArrayList r25 = new java.util.ArrayList
            r25.<init>()
            goto L_0x0240
        L_0x023e:
            r25 = r112
        L_0x0240:
            r51 = 1048576(0x100000, float:1.469368E-39)
            r51 = r1 & r51
            if (r51 == 0) goto L_0x0249
            r51 = r61
            goto L_0x024b
        L_0x0249:
            r51 = r113
        L_0x024b:
            r52 = 2097152(0x200000, float:2.938736E-39)
            r52 = r1 & r52
            if (r52 == 0) goto L_0x0254
            r52 = r61
            goto L_0x0256
        L_0x0254:
            r52 = r114
        L_0x0256:
            r53 = 4194304(0x400000, float:5.877472E-39)
            r53 = r1 & r53
            if (r53 == 0) goto L_0x025f
            r53 = r61
            goto L_0x0261
        L_0x025f:
            r53 = r115
        L_0x0261:
            r54 = 8388608(0x800000, float:1.17549435E-38)
            r54 = r1 & r54
            if (r54 == 0) goto L_0x026a
            r54 = r61
            goto L_0x026c
        L_0x026a:
            r54 = r116
        L_0x026c:
            r55 = 16777216(0x1000000, float:2.3509887E-38)
            r55 = r1 & r55
            if (r55 == 0) goto L_0x0275
            r55 = r61
            goto L_0x0277
        L_0x0275:
            r55 = r117
        L_0x0277:
            r56 = 33554432(0x2000000, float:9.403955E-38)
            r56 = r1 & r56
            if (r56 == 0) goto L_0x0280
            r56 = r61
            goto L_0x0282
        L_0x0280:
            r56 = r118
        L_0x0282:
            r57 = 67108864(0x4000000, float:1.5046328E-36)
            r57 = r1 & r57
            if (r57 == 0) goto L_0x028b
            r57 = r61
            goto L_0x028d
        L_0x028b:
            r57 = r119
        L_0x028d:
            r58 = 134217728(0x8000000, float:3.85186E-34)
            r58 = r1 & r58
            if (r58 == 0) goto L_0x0296
            r58 = r61
            goto L_0x0298
        L_0x0296:
            r58 = r120
        L_0x0298:
            r59 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r59
            if (r1 == 0) goto L_0x02a1
            r1 = r61
            goto L_0x02a3
        L_0x02a1:
            r1 = r121
        L_0x02a3:
            r61 = r60
            r62 = r2
            r63 = r3
            r64 = r5
            r65 = r6
            r66 = r7
            r67 = r8
            r68 = r9
            r69 = r10
            r70 = r11
            r71 = r12
            r72 = r13
            r73 = r14
            r74 = r15
            r75 = r124
            r76 = r4
            r77 = r18
            r78 = r20
            r79 = r22
            r80 = r24
            r81 = r26
            r82 = r27
            r83 = r28
            r84 = r29
            r85 = r30
            r86 = r31
            r87 = r16
            r88 = r32
            r89 = r33
            r90 = r34
            r91 = r35
            r92 = r36
            r93 = r122
            r94 = r37
            r95 = r38
            r96 = r39
            r97 = r40
            r98 = r41
            r99 = r42
            r100 = r43
            r101 = r44
            r102 = r45
            r103 = r46
            r104 = r47
            r105 = r48
            r106 = r49
            r107 = r50
            r108 = r0
            r109 = r17
            r110 = r19
            r111 = r21
            r112 = r23
            r113 = r25
            r114 = r51
            r115 = r52
            r116 = r53
            r117 = r54
            r118 = r55
            r119 = r56
            r120 = r57
            r121 = r58
            r122 = r1
            r61.<init>(r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.NewDlScreen.Modal.LLDetailsResultModal.<init>(java.util.ArrayList, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, cm.g):void");
    }
}
