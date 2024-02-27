package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class PrintReceiptValidateModel {
    private final String errorDesc;
    private final int errorcode;

    public PrintReceiptValidateModel(String str, int i10) {
        l.f(str, "errorDesc");
        this.errorDesc = str;
        this.errorcode = i10;
    }

    public static /* synthetic */ PrintReceiptValidateModel copy$default(PrintReceiptValidateModel printReceiptValidateModel, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = printReceiptValidateModel.errorDesc;
        }
        if ((i11 & 2) != 0) {
            i10 = printReceiptValidateModel.errorcode;
        }
        return printReceiptValidateModel.copy(str, i10);
    }

    public final String component1() {
        return this.errorDesc;
    }

    public final int component2() {
        return this.errorcode;
    }

    public final PrintReceiptValidateModel copy(String str, int i10) {
        l.f(str, "errorDesc");
        return new PrintReceiptValidateModel(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrintReceiptValidateModel)) {
            return false;
        }
        PrintReceiptValidateModel printReceiptValidateModel = (PrintReceiptValidateModel) obj;
        return l.a(this.errorDesc, printReceiptValidateModel.errorDesc) && this.errorcode == printReceiptValidateModel.errorcode;
    }

    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final int getErrorcode() {
        return this.errorcode;
    }

    public int hashCode() {
        return (this.errorDesc.hashCode() * 31) + Integer.hashCode(this.errorcode);
    }

    public String toString() {
        return "PrintReceiptValidateModel(errorDesc=" + this.errorDesc + ", errorcode=" + this.errorcode + ')';
    }
}
