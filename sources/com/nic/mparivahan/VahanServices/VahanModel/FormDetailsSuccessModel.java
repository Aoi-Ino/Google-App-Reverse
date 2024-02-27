package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class FormDetailsSuccessModel {
    private final String errorDesc;
    private final String errorcode;
    private int pur_cd;
    private String rcpt_no;
    private boolean renForm22;
    private boolean renForm25;
    private boolean renForm26;
    private boolean renForm28;
    private boolean renForm29;
    private boolean renForm30;
    private boolean renForm31;
    private boolean renForm32;
    private boolean renForm33;
    private boolean renForm34;
    private boolean renForm35;
    private boolean renForm36;
    private boolean renderForm14;

    public FormDetailsSuccessModel(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, int i10, String str, boolean z22, String str2, String str3) {
        String str4 = str;
        l.f(str4, "rcpt_no");
        this.renForm22 = z10;
        this.renForm25 = z11;
        this.renForm26 = z12;
        this.renForm28 = z13;
        this.renForm29 = z14;
        this.renForm30 = z15;
        this.renForm31 = z16;
        this.renForm32 = z17;
        this.renForm33 = z18;
        this.renForm34 = z19;
        this.renForm35 = z20;
        this.renForm36 = z21;
        this.pur_cd = i10;
        this.rcpt_no = str4;
        this.renderForm14 = z22;
        this.errorcode = str2;
        this.errorDesc = str3;
    }

    public static /* synthetic */ FormDetailsSuccessModel copy$default(FormDetailsSuccessModel formDetailsSuccessModel, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, int i10, String str, boolean z22, String str2, String str3, int i11, Object obj) {
        FormDetailsSuccessModel formDetailsSuccessModel2 = formDetailsSuccessModel;
        int i12 = i11;
        return formDetailsSuccessModel.copy((i12 & 1) != 0 ? formDetailsSuccessModel2.renForm22 : z10, (i12 & 2) != 0 ? formDetailsSuccessModel2.renForm25 : z11, (i12 & 4) != 0 ? formDetailsSuccessModel2.renForm26 : z12, (i12 & 8) != 0 ? formDetailsSuccessModel2.renForm28 : z13, (i12 & 16) != 0 ? formDetailsSuccessModel2.renForm29 : z14, (i12 & 32) != 0 ? formDetailsSuccessModel2.renForm30 : z15, (i12 & 64) != 0 ? formDetailsSuccessModel2.renForm31 : z16, (i12 & 128) != 0 ? formDetailsSuccessModel2.renForm32 : z17, (i12 & 256) != 0 ? formDetailsSuccessModel2.renForm33 : z18, (i12 & 512) != 0 ? formDetailsSuccessModel2.renForm34 : z19, (i12 & 1024) != 0 ? formDetailsSuccessModel2.renForm35 : z20, (i12 & 2048) != 0 ? formDetailsSuccessModel2.renForm36 : z21, (i12 & 4096) != 0 ? formDetailsSuccessModel2.pur_cd : i10, (i12 & 8192) != 0 ? formDetailsSuccessModel2.rcpt_no : str, (i12 & 16384) != 0 ? formDetailsSuccessModel2.renderForm14 : z22, (i12 & 32768) != 0 ? formDetailsSuccessModel2.errorcode : str2, (i12 & 65536) != 0 ? formDetailsSuccessModel2.errorDesc : str3);
    }

    public final boolean component1() {
        return this.renForm22;
    }

    public final boolean component10() {
        return this.renForm34;
    }

    public final boolean component11() {
        return this.renForm35;
    }

    public final boolean component12() {
        return this.renForm36;
    }

    public final int component13() {
        return this.pur_cd;
    }

    public final String component14() {
        return this.rcpt_no;
    }

    public final boolean component15() {
        return this.renderForm14;
    }

    public final String component16() {
        return this.errorcode;
    }

    public final String component17() {
        return this.errorDesc;
    }

    public final boolean component2() {
        return this.renForm25;
    }

    public final boolean component3() {
        return this.renForm26;
    }

    public final boolean component4() {
        return this.renForm28;
    }

    public final boolean component5() {
        return this.renForm29;
    }

    public final boolean component6() {
        return this.renForm30;
    }

    public final boolean component7() {
        return this.renForm31;
    }

    public final boolean component8() {
        return this.renForm32;
    }

    public final boolean component9() {
        return this.renForm33;
    }

    public final FormDetailsSuccessModel copy(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, int i10, String str, boolean z22, String str2, String str3) {
        boolean z23 = z10;
        l.f(str, "rcpt_no");
        return new FormDetailsSuccessModel(z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, i10, str, z22, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormDetailsSuccessModel)) {
            return false;
        }
        FormDetailsSuccessModel formDetailsSuccessModel = (FormDetailsSuccessModel) obj;
        return this.renForm22 == formDetailsSuccessModel.renForm22 && this.renForm25 == formDetailsSuccessModel.renForm25 && this.renForm26 == formDetailsSuccessModel.renForm26 && this.renForm28 == formDetailsSuccessModel.renForm28 && this.renForm29 == formDetailsSuccessModel.renForm29 && this.renForm30 == formDetailsSuccessModel.renForm30 && this.renForm31 == formDetailsSuccessModel.renForm31 && this.renForm32 == formDetailsSuccessModel.renForm32 && this.renForm33 == formDetailsSuccessModel.renForm33 && this.renForm34 == formDetailsSuccessModel.renForm34 && this.renForm35 == formDetailsSuccessModel.renForm35 && this.renForm36 == formDetailsSuccessModel.renForm36 && this.pur_cd == formDetailsSuccessModel.pur_cd && l.a(this.rcpt_no, formDetailsSuccessModel.rcpt_no) && this.renderForm14 == formDetailsSuccessModel.renderForm14 && l.a(this.errorcode, formDetailsSuccessModel.errorcode) && l.a(this.errorDesc, formDetailsSuccessModel.errorDesc);
    }

    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final String getErrorcode() {
        return this.errorcode;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getRcpt_no() {
        return this.rcpt_no;
    }

    public final boolean getRenForm22() {
        return this.renForm22;
    }

    public final boolean getRenForm25() {
        return this.renForm25;
    }

    public final boolean getRenForm26() {
        return this.renForm26;
    }

    public final boolean getRenForm28() {
        return this.renForm28;
    }

    public final boolean getRenForm29() {
        return this.renForm29;
    }

    public final boolean getRenForm30() {
        return this.renForm30;
    }

    public final boolean getRenForm31() {
        return this.renForm31;
    }

    public final boolean getRenForm32() {
        return this.renForm32;
    }

    public final boolean getRenForm33() {
        return this.renForm33;
    }

    public final boolean getRenForm34() {
        return this.renForm34;
    }

    public final boolean getRenForm35() {
        return this.renForm35;
    }

    public final boolean getRenForm36() {
        return this.renForm36;
    }

    public final boolean getRenderForm14() {
        return this.renderForm14;
    }

    public int hashCode() {
        boolean z10 = this.renForm22;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (z10 ? 1 : 0) * true;
        boolean z12 = this.renForm25;
        if (z12) {
            z12 = true;
        }
        int i11 = (i10 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.renForm26;
        if (z13) {
            z13 = true;
        }
        int i12 = (i11 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.renForm28;
        if (z14) {
            z14 = true;
        }
        int i13 = (i12 + (z14 ? 1 : 0)) * 31;
        boolean z15 = this.renForm29;
        if (z15) {
            z15 = true;
        }
        int i14 = (i13 + (z15 ? 1 : 0)) * 31;
        boolean z16 = this.renForm30;
        if (z16) {
            z16 = true;
        }
        int i15 = (i14 + (z16 ? 1 : 0)) * 31;
        boolean z17 = this.renForm31;
        if (z17) {
            z17 = true;
        }
        int i16 = (i15 + (z17 ? 1 : 0)) * 31;
        boolean z18 = this.renForm32;
        if (z18) {
            z18 = true;
        }
        int i17 = (i16 + (z18 ? 1 : 0)) * 31;
        boolean z19 = this.renForm33;
        if (z19) {
            z19 = true;
        }
        int i18 = (i17 + (z19 ? 1 : 0)) * 31;
        boolean z20 = this.renForm34;
        if (z20) {
            z20 = true;
        }
        int i19 = (i18 + (z20 ? 1 : 0)) * 31;
        boolean z21 = this.renForm35;
        if (z21) {
            z21 = true;
        }
        int i20 = (i19 + (z21 ? 1 : 0)) * 31;
        boolean z22 = this.renForm36;
        if (z22) {
            z22 = true;
        }
        int hashCode = (((((i20 + (z22 ? 1 : 0)) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.rcpt_no.hashCode()) * 31;
        boolean z23 = this.renderForm14;
        if (!z23) {
            z11 = z23;
        }
        int i21 = (hashCode + (z11 ? 1 : 0)) * 31;
        String str = this.errorcode;
        int i22 = 0;
        int hashCode2 = (i21 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorDesc;
        if (str2 != null) {
            i22 = str2.hashCode();
        }
        return hashCode2 + i22;
    }

    public final void setPur_cd(int i10) {
        this.pur_cd = i10;
    }

    public final void setRcpt_no(String str) {
        l.f(str, "<set-?>");
        this.rcpt_no = str;
    }

    public final void setRenForm22(boolean z10) {
        this.renForm22 = z10;
    }

    public final void setRenForm25(boolean z10) {
        this.renForm25 = z10;
    }

    public final void setRenForm26(boolean z10) {
        this.renForm26 = z10;
    }

    public final void setRenForm28(boolean z10) {
        this.renForm28 = z10;
    }

    public final void setRenForm29(boolean z10) {
        this.renForm29 = z10;
    }

    public final void setRenForm30(boolean z10) {
        this.renForm30 = z10;
    }

    public final void setRenForm31(boolean z10) {
        this.renForm31 = z10;
    }

    public final void setRenForm32(boolean z10) {
        this.renForm32 = z10;
    }

    public final void setRenForm33(boolean z10) {
        this.renForm33 = z10;
    }

    public final void setRenForm34(boolean z10) {
        this.renForm34 = z10;
    }

    public final void setRenForm35(boolean z10) {
        this.renForm35 = z10;
    }

    public final void setRenForm36(boolean z10) {
        this.renForm36 = z10;
    }

    public final void setRenderForm14(boolean z10) {
        this.renderForm14 = z10;
    }

    public String toString() {
        return "FormDetailsSuccessModel(renForm22=" + this.renForm22 + ", renForm25=" + this.renForm25 + ", renForm26=" + this.renForm26 + ", renForm28=" + this.renForm28 + ", renForm29=" + this.renForm29 + ", renForm30=" + this.renForm30 + ", renForm31=" + this.renForm31 + ", renForm32=" + this.renForm32 + ", renForm33=" + this.renForm33 + ", renForm34=" + this.renForm34 + ", renForm35=" + this.renForm35 + ", renForm36=" + this.renForm36 + ", pur_cd=" + this.pur_cd + ", rcpt_no=" + this.rcpt_no + ", renderForm14=" + this.renderForm14 + ", errorcode=" + this.errorcode + ", errorDesc=" + this.errorDesc + ')';
    }
}
