package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import java.io.Serializable;

@Keep
public final class DldetobjItem implements Serializable {
    private final BioImgObj bioImgObj;
    private final BioObj bioObj;
    private final Dlobj dlobj;
    private final Object erormsg;
    private final String errorcd;

    public DldetobjItem() {
        this((String) null, (BioObj) null, (Dlobj) null, (Object) null, (BioImgObj) null, 31, (g) null);
    }

    public static /* synthetic */ DldetobjItem copy$default(DldetobjItem dldetobjItem, String str, BioObj bioObj2, Dlobj dlobj2, Object obj, BioImgObj bioImgObj2, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = dldetobjItem.errorcd;
        }
        if ((i10 & 2) != 0) {
            bioObj2 = dldetobjItem.bioObj;
        }
        BioObj bioObj3 = bioObj2;
        if ((i10 & 4) != 0) {
            dlobj2 = dldetobjItem.dlobj;
        }
        Dlobj dlobj3 = dlobj2;
        if ((i10 & 8) != 0) {
            obj = dldetobjItem.erormsg;
        }
        Object obj3 = obj;
        if ((i10 & 16) != 0) {
            bioImgObj2 = dldetobjItem.bioImgObj;
        }
        return dldetobjItem.copy(str, bioObj3, dlobj3, obj3, bioImgObj2);
    }

    public final String component1() {
        return this.errorcd;
    }

    public final BioObj component2() {
        return this.bioObj;
    }

    public final Dlobj component3() {
        return this.dlobj;
    }

    public final Object component4() {
        return this.erormsg;
    }

    public final BioImgObj component5() {
        return this.bioImgObj;
    }

    public final DldetobjItem copy(String str, BioObj bioObj2, Dlobj dlobj2, Object obj, BioImgObj bioImgObj2) {
        return new DldetobjItem(str, bioObj2, dlobj2, obj, bioImgObj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DldetobjItem)) {
            return false;
        }
        DldetobjItem dldetobjItem = (DldetobjItem) obj;
        return l.a(this.errorcd, dldetobjItem.errorcd) && l.a(this.bioObj, dldetobjItem.bioObj) && l.a(this.dlobj, dldetobjItem.dlobj) && l.a(this.erormsg, dldetobjItem.erormsg) && l.a(this.bioImgObj, dldetobjItem.bioImgObj);
    }

    public final BioImgObj getBioImgObj() {
        return this.bioImgObj;
    }

    public final BioObj getBioObj() {
        return this.bioObj;
    }

    public final Dlobj getDlobj() {
        return this.dlobj;
    }

    public final Object getErormsg() {
        return this.erormsg;
    }

    public final String getErrorcd() {
        return this.errorcd;
    }

    public int hashCode() {
        String str = this.errorcd;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BioObj bioObj2 = this.bioObj;
        int hashCode2 = (hashCode + (bioObj2 == null ? 0 : bioObj2.hashCode())) * 31;
        Dlobj dlobj2 = this.dlobj;
        int hashCode3 = (hashCode2 + (dlobj2 == null ? 0 : dlobj2.hashCode())) * 31;
        Object obj = this.erormsg;
        int hashCode4 = (hashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        BioImgObj bioImgObj2 = this.bioImgObj;
        if (bioImgObj2 != null) {
            i10 = bioImgObj2.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "DldetobjItem(errorcd=" + this.errorcd + ", bioObj=" + this.bioObj + ", dlobj=" + this.dlobj + ", erormsg=" + this.erormsg + ", bioImgObj=" + this.bioImgObj + ')';
    }

    public DldetobjItem(String str, BioObj bioObj2, Dlobj dlobj2, Object obj, BioImgObj bioImgObj2) {
        this.errorcd = str;
        this.bioObj = bioObj2;
        this.dlobj = dlobj2;
        this.erormsg = obj;
        this.bioImgObj = bioImgObj2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DldetobjItem(java.lang.String r5, com.nic.mparivahan.dlservices.data.model.BioObj r6, com.nic.mparivahan.dlservices.data.model.Dlobj r7, java.lang.Object r8, com.nic.mparivahan.dlservices.data.model.BioImgObj r9, int r10, cm.g r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.data.model.DldetobjItem.<init>(java.lang.String, com.nic.mparivahan.dlservices.data.model.BioObj, com.nic.mparivahan.dlservices.data.model.Dlobj, java.lang.Object, com.nic.mparivahan.dlservices.data.model.BioImgObj, int, cm.g):void");
    }
}
