package com.nic.mparivahan.dlservices.ui.acknow;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class GenderIndicators {
    @c("giCheckUsertoken")
    private final Object giCheckUsertoken;
    @c("giGenderDescription")
    private final String giGenderDescription;
    @c("giGenderIndicator")
    private final Integer giGenderIndicator;
    @c("giOwner")
    private final String giOwner;
    @c("giTokenId")
    private final Object giTokenId;
    @c("giUserId")
    private final Integer giUserId;

    public GenderIndicators() {
        this((Integer) null, (String) null, (Object) null, (String) null, (Object) null, (Integer) null, 63, (g) null);
    }

    public static /* synthetic */ GenderIndicators copy$default(GenderIndicators genderIndicators, Integer num, String str, Object obj, String str2, Object obj2, Integer num2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            num = genderIndicators.giGenderIndicator;
        }
        if ((i10 & 2) != 0) {
            str = genderIndicators.giGenderDescription;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            obj = genderIndicators.giCheckUsertoken;
        }
        Object obj4 = obj;
        if ((i10 & 8) != 0) {
            str2 = genderIndicators.giOwner;
        }
        String str4 = str2;
        if ((i10 & 16) != 0) {
            obj2 = genderIndicators.giTokenId;
        }
        Object obj5 = obj2;
        if ((i10 & 32) != 0) {
            num2 = genderIndicators.giUserId;
        }
        return genderIndicators.copy(num, str3, obj4, str4, obj5, num2);
    }

    public final Integer component1() {
        return this.giGenderIndicator;
    }

    public final String component2() {
        return this.giGenderDescription;
    }

    public final Object component3() {
        return this.giCheckUsertoken;
    }

    public final String component4() {
        return this.giOwner;
    }

    public final Object component5() {
        return this.giTokenId;
    }

    public final Integer component6() {
        return this.giUserId;
    }

    public final GenderIndicators copy(Integer num, String str, Object obj, String str2, Object obj2, Integer num2) {
        return new GenderIndicators(num, str, obj, str2, obj2, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenderIndicators)) {
            return false;
        }
        GenderIndicators genderIndicators = (GenderIndicators) obj;
        return l.a(this.giGenderIndicator, genderIndicators.giGenderIndicator) && l.a(this.giGenderDescription, genderIndicators.giGenderDescription) && l.a(this.giCheckUsertoken, genderIndicators.giCheckUsertoken) && l.a(this.giOwner, genderIndicators.giOwner) && l.a(this.giTokenId, genderIndicators.giTokenId) && l.a(this.giUserId, genderIndicators.giUserId);
    }

    public final Object getGiCheckUsertoken() {
        return this.giCheckUsertoken;
    }

    public final String getGiGenderDescription() {
        return this.giGenderDescription;
    }

    public final Integer getGiGenderIndicator() {
        return this.giGenderIndicator;
    }

    public final String getGiOwner() {
        return this.giOwner;
    }

    public final Object getGiTokenId() {
        return this.giTokenId;
    }

    public final Integer getGiUserId() {
        return this.giUserId;
    }

    public int hashCode() {
        Integer num = this.giGenderIndicator;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.giGenderDescription;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.giCheckUsertoken;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.giOwner;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj2 = this.giTokenId;
        int hashCode5 = (hashCode4 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Integer num2 = this.giUserId;
        if (num2 != null) {
            i10 = num2.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        return "GenderIndicators(giGenderIndicator=" + this.giGenderIndicator + ", giGenderDescription=" + this.giGenderDescription + ", giCheckUsertoken=" + this.giCheckUsertoken + ", giOwner=" + this.giOwner + ", giTokenId=" + this.giTokenId + ", giUserId=" + this.giUserId + ')';
    }

    public GenderIndicators(Integer num, String str, Object obj, String str2, Object obj2, Integer num2) {
        this.giGenderIndicator = num;
        this.giGenderDescription = str;
        this.giCheckUsertoken = obj;
        this.giOwner = str2;
        this.giTokenId = obj2;
        this.giUserId = num2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GenderIndicators(java.lang.Integer r6, java.lang.String r7, java.lang.Object r8, java.lang.String r9, java.lang.Object r10, java.lang.Integer r11, int r12, cm.g r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.acknow.GenderIndicators.<init>(java.lang.Integer, java.lang.String, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Integer, int, cm.g):void");
    }
}
