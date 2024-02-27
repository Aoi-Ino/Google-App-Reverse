package com.nic.mparivahan.VahanServices.VahanViewModel;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class PendingTransTaxBreakUpModel {
    private final boolean renderChckBtn;
    private final boolean renderFeeTable;
    private final boolean renderTaxTable;
    private final ArrayList<PendingTransTaxBreakListModel> tax_pay_dobj;

    public PendingTransTaxBreakUpModel(ArrayList<PendingTransTaxBreakListModel> arrayList, boolean z10, boolean z11, boolean z12) {
        l.f(arrayList, "tax_pay_dobj");
        this.tax_pay_dobj = arrayList;
        this.renderChckBtn = z10;
        this.renderFeeTable = z11;
        this.renderTaxTable = z12;
    }

    public static /* synthetic */ PendingTransTaxBreakUpModel copy$default(PendingTransTaxBreakUpModel pendingTransTaxBreakUpModel, ArrayList<PendingTransTaxBreakListModel> arrayList, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = pendingTransTaxBreakUpModel.tax_pay_dobj;
        }
        if ((i10 & 2) != 0) {
            z10 = pendingTransTaxBreakUpModel.renderChckBtn;
        }
        if ((i10 & 4) != 0) {
            z11 = pendingTransTaxBreakUpModel.renderFeeTable;
        }
        if ((i10 & 8) != 0) {
            z12 = pendingTransTaxBreakUpModel.renderTaxTable;
        }
        return pendingTransTaxBreakUpModel.copy(arrayList, z10, z11, z12);
    }

    public final ArrayList<PendingTransTaxBreakListModel> component1() {
        return this.tax_pay_dobj;
    }

    public final boolean component2() {
        return this.renderChckBtn;
    }

    public final boolean component3() {
        return this.renderFeeTable;
    }

    public final boolean component4() {
        return this.renderTaxTable;
    }

    public final PendingTransTaxBreakUpModel copy(ArrayList<PendingTransTaxBreakListModel> arrayList, boolean z10, boolean z11, boolean z12) {
        l.f(arrayList, "tax_pay_dobj");
        return new PendingTransTaxBreakUpModel(arrayList, z10, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingTransTaxBreakUpModel)) {
            return false;
        }
        PendingTransTaxBreakUpModel pendingTransTaxBreakUpModel = (PendingTransTaxBreakUpModel) obj;
        return l.a(this.tax_pay_dobj, pendingTransTaxBreakUpModel.tax_pay_dobj) && this.renderChckBtn == pendingTransTaxBreakUpModel.renderChckBtn && this.renderFeeTable == pendingTransTaxBreakUpModel.renderFeeTable && this.renderTaxTable == pendingTransTaxBreakUpModel.renderTaxTable;
    }

    public final boolean getRenderChckBtn() {
        return this.renderChckBtn;
    }

    public final boolean getRenderFeeTable() {
        return this.renderFeeTable;
    }

    public final boolean getRenderTaxTable() {
        return this.renderTaxTable;
    }

    public final ArrayList<PendingTransTaxBreakListModel> getTax_pay_dobj() {
        return this.tax_pay_dobj;
    }

    public int hashCode() {
        int hashCode = this.tax_pay_dobj.hashCode() * 31;
        boolean z10 = this.renderChckBtn;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (hashCode + (z10 ? 1 : 0)) * 31;
        boolean z12 = this.renderFeeTable;
        if (z12) {
            z12 = true;
        }
        int i11 = (i10 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.renderTaxTable;
        if (!z13) {
            z11 = z13;
        }
        return i11 + (z11 ? 1 : 0);
    }

    public String toString() {
        return "PendingTransTaxBreakUpModel(tax_pay_dobj=" + this.tax_pay_dobj + ", renderChckBtn=" + this.renderChckBtn + ", renderFeeTable=" + this.renderFeeTable + ", renderTaxTable=" + this.renderTaxTable + ')';
    }
}
