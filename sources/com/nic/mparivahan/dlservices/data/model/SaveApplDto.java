package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.io.Serializable;

@Keep
public final class SaveApplDto implements Serializable {
    @c("dlRenewalSaveDto")
    private final DlRenewalSaveDto dlRenewalSaveDto;
    @c("dldetobj")
    private final Object dldetobj;

    public SaveApplDto() {
        this((DlRenewalSaveDto) null, (Object) null, 3, (g) null);
    }

    public static /* synthetic */ SaveApplDto copy$default(SaveApplDto saveApplDto, DlRenewalSaveDto dlRenewalSaveDto2, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            dlRenewalSaveDto2 = saveApplDto.dlRenewalSaveDto;
        }
        if ((i10 & 2) != 0) {
            obj = saveApplDto.dldetobj;
        }
        return saveApplDto.copy(dlRenewalSaveDto2, obj);
    }

    public final DlRenewalSaveDto component1() {
        return this.dlRenewalSaveDto;
    }

    public final Object component2() {
        return this.dldetobj;
    }

    public final SaveApplDto copy(DlRenewalSaveDto dlRenewalSaveDto2, Object obj) {
        return new SaveApplDto(dlRenewalSaveDto2, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveApplDto)) {
            return false;
        }
        SaveApplDto saveApplDto = (SaveApplDto) obj;
        return l.a(this.dlRenewalSaveDto, saveApplDto.dlRenewalSaveDto) && l.a(this.dldetobj, saveApplDto.dldetobj);
    }

    public final DlRenewalSaveDto getDlRenewalSaveDto() {
        return this.dlRenewalSaveDto;
    }

    public final Object getDldetobj() {
        return this.dldetobj;
    }

    public int hashCode() {
        DlRenewalSaveDto dlRenewalSaveDto2 = this.dlRenewalSaveDto;
        int i10 = 0;
        int hashCode = (dlRenewalSaveDto2 == null ? 0 : dlRenewalSaveDto2.hashCode()) * 31;
        Object obj = this.dldetobj;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "SaveApplDto(dlRenewalSaveDto=" + this.dlRenewalSaveDto + ", dldetobj=" + this.dldetobj + ')';
    }

    public SaveApplDto(DlRenewalSaveDto dlRenewalSaveDto2, Object obj) {
        this.dlRenewalSaveDto = dlRenewalSaveDto2;
        this.dldetobj = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SaveApplDto(DlRenewalSaveDto dlRenewalSaveDto2, Object obj, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : dlRenewalSaveDto2, (i10 & 2) != 0 ? null : obj);
    }
}
